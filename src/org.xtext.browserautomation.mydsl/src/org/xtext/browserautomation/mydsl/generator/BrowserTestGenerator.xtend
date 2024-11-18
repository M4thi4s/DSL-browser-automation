package org.xtext.browserautomation.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.browserautomation.mydsl.browserTest.*
import java.util.List

class BrowserTestGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val testFile = resource.contents.head as TestFile
		val className = resource.URI.trimFileExtension.lastSegment

		fsa.generateFile(
			className + ".java",
			generateJavaCode(testFile, className)
		)		
	}

	def String generateJavaCode(TestFile testFile, String className) '''		
		import fr.imta.massimotisi.browserautomation.lib.*;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.time.Duration;
		import java.util.List;
		
		public class «className» {
		    public static void main(String[] args) {
		        WebDriver driver = new ChromeDriver();
		        Duration timeout = Duration.ofSeconds(10);
		        SelectLib selectLib = new SelectLib(driver, timeout);
		        ActionLib actionLib = new ActionLib(driver, timeout);
		        AssertLib assertLib = new AssertLib();
		        
		        «FOR task : testFile.task»
		        	«generateTask(task)»
		        «ENDFOR»
		        
		        driver.quit();
		    }
		}
	'''

	def String generateTask(Task task) 
	'''		
		«FOR action : task.actions»
			«
				switch action {
					GoTo: generateGoTo(action)
					Select: generateSelect(action)
					ActionCommand: generateActionCode(action.command, action.getVar())
					Test: generateTest(action)
					default: ""
				}
			»
		«ENDFOR»
	'''

	def String generateGoTo(GoTo goTo) '''
		actionLib.goToUrl("«goTo.url»");
	'''
	
	// If "[Select]" property contains "[NTH-CHILD]" filter, we only get one element, else we want to fetch a list of elements.
	def String generateSelectElement(List<Property> properties, String varName){
		var methodName = "selectLib.selectElements";
	    if (properties.stream().filter[it.getProp() == "[NTH-CHILD]"].count() >= 1)
	    	methodName = "selectLib.selectElement"
		return 
		'''«methodName»(«varName»);'''
	}

	def String generateSelect(Select select) '''
		var select_«select.getVar().name» = new SelectFilterProperty();
		«FOR property : select.properties»
		    «generatePropertyAssignment(property, select.getVar().name)»
		«ENDFOR»
		
		var «select.getVar().name» = «generateSelectElement(select.properties, "select_"+select.getVar().name)»
	'''
	
	def String generatePropertyAssignment(Property property, String varName) {
		
		switch property.getProp() {
			case "[CONTENT]": 
				'''
				select_«varName».filterBy = FilterBy.TEXT;
				select_«varName».filterValue = «generateContentValue(property.getContent())»;
				'''
			case "[LABEL]": 
				'''
				select_«varName».filterValue = «generateContentValue(property.getLabel())»;
				select_«varName».filterBy = FilterBy.LABEL;
				'''
			case "[VALUE]": 
				'''
				select_«varName».filterValue = «generateContentValue(property.getValue())»;
				select_«varName».filterBy = FilterBy.VALUE;
				'''
			case "[ALT]": 
				'''
				select_«varName».filterValue = «generateContentValue(property.getAlt())»;
				select_«varName».filterBy = FilterBy.ALT;
				'''
			case "[LINK]": 
				'''
				select_«varName».filterValue = «generateContentValue(property.getLink())»; 
				select_«varName».filterBy = FilterBy.LINK;
				'''
			case "[TYPE]": 
				'''
				select_«varName».elementType = FilterElementType.«property.type»;
				'''
			case "[NTH-CHILD]":
				'''
				select_«varName».nthChild = «property.getChild()»;
				'''
			case "[PARENT]":
				'''
				{
					select_«varName» = new SelectFilterProperty(selectLib.getParent(select_«varName»).element);
					«FOR property2 : property.getSubProperties()»
						«generatePropertyAssignment(property2, varName)»
					«ENDFOR»
				}
				'''
			default:''''''
		}
	}

	def String generateContentValue(Entree entree) {
		if( entree.getVar() !== null && entree.getParam() !== null)
		    return 
				'''«entree.getVar().name».«entree.getParam()»'''
		if( entree.getVar() !== null && entree.getUntyped() !== null)
		    return 
				'''«entree.getVar().name».«entree.getUntyped()»'''
		if( entree.getString() !== null)
		    return 
				'''"«entree.getString()»"'''
        if( entree.getAccessor() !== null)
            return 
				'''FilterAccessor.«entree.getAccessor()»'''
        return '''''';
	}

	def String generateActionCode(ActionType actionType, Variable variable) {
		switch actionType.getAction() {
			case "[CHECK]": 
				'''
				actionLib.checkCheckbox(«variable.name», «actionType.value.toString.toLowerCase()»);
				'''
			case "[SET-TEXT]": 
				'''
				actionLib.setText(«variable.name», «generateContentValue(actionType.getText())»);
				'''
			case "[CHOOSE]": 
				'''
				actionLib.selectOption(«variable.name», «generateContentValue(actionType.getOption())»);
				'''
			default:
				'''
				actionLib.clickElement(«variable.name»);
				'''
		}
	}

	def String generateTest(Test test) 
		'''
		assertLib.assertElementExists(«test.getVar().name».element, "«test.getVar().name»");
		'''
}
