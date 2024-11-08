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
		/*
		fsa.generateFile('greetings.txt', 'People to greet: ' + 
			resource.allContents
				.join(', '))*/
		
	}

	def String generateJavaCode(TestFile testFile, String className) '''
		package fr.imta.massimotisi.browserautomation.example;
		
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

	def String generateTask(Task task) '''		
		«FOR action : task.actions»
			«generateAction(action)»
		«ENDFOR»
	'''

	def String generateAction(Action action) {
		switch action {
			GoTo: generateGoTo(action)
			Select: generateSelect(action)
			ActionCommand: generateActionCommand(action)
			Test: generateTest(action)
			default: ""
		}
	}

	def String generateGoTo(GoTo goTo) '''
		actionLib.goToUrl("«goTo.url»");
	'''
	
	def String generateSelectElement(List<Property> properties, String varName){
	    if (properties.stream().filter[it.getProp() == "[NTH-CHILD]"].count() >= 1) {
	        '''selectLib.selectElement(«varName»);'''
	    } else {
	        '''selectLib.selectElements(«varName»);'''
	    }
	}

	def String generateSelect(Select select) '''
		«FOR property : select.properties»
		    «generateProperty(property, select.getVar().name)»
		«ENDFOR»
		var select_«select.getVar().name» = new SelectFilterProperty();
		«FOR property : select.properties»
		    «generatePropertyAssignment(property, select.getVar().name)»
		«ENDFOR»
		
		var «select.getVar().name» = «generateSelectElement(select.properties, "select_"+select.getVar().name)»
	'''

	def String generateProperty(Property property, String varName) '''
	'''

	def String generateContentValue(Entree entree) {
		if( entree.getVar() !== null && entree.getParam() !== null)
		    return '''«entree.getVar().name».«entree.getParam()»'''
		if( entree.getVar() !== null && entree.getUntyped() !== null)
		    return '''«entree.getVar().name».«entree.getUntyped()»'''
		if( entree.getString() !== null)
		    return '''"«entree.getString()»"'''
        if( entree.getAccessor() !== null)
            return '''FilterAccessor.«entree.getAccessor()»'''
        return '''''';
	}	
	
	def String generatePropertyAssignment(Property property, String varName) {
		
		switch property {
			case property.getProp() == "[CONTENT]": 
'''
select_«varName».filterBy = FilterBy.TEXT;
select_«varName».filterValue = «generateContentValue(property.getContent())»;
'''
			case property.getProp() == "[LABEL]": 
'''
select_«varName».filterValue = «generateContentValue(property.getLabel())»;
select_«varName».filterBy = FilterBy.LABEL;
'''
			case property.getProp() == "[VALUE]": 
'''
select_«varName».filterValue = «generateContentValue(property.getValue())»;
select_«varName».filterBy = FilterBy.VALUE;
'''
			case property.getProp() == "[ALT]": 
'''
select_«varName».filterValue = «generateContentValue(property.getAlt())»;
select_«varName».filterBy = FilterBy.ALT;
'''
			case property.getProp() == "[LINK]": 
'''
select_«varName».filterValue = «generateContentValue(property.getLink())»; 
select_«varName».filterBy = FilterBy.LINK;
'''
			case property.getProp() == "[TYPE]": 
'''
select_«varName».elementType = FilterElementType.«property.type»;
'''
			case property.getProp() == "[NTH-CHILD]":
'''
select_«varName».nthChild = «property.getChild()»;
'''
			case property.getProp() == "[PARENT]":
'''
var select_«varName»_parent = selectLib.getParent(selectLib.selectElement(select_«varName»).element);

select_«varName» = new SelectFilterProperty();

select_«varName».parent = select_«varName»_parent.element;

«FOR property2 : property.getSubProperties()»
	«generatePropertyAssignment(property2, varName)»
«ENDFOR»
'''
			default:''''''
		}
	}

	def String generateActionCommand(ActionCommand action) '''
        «generateActionTypeCode(action.command, action.getVar())»
    '''

	def String generateActionType(ActionType actionType) {
		switch actionType {
			case actionType.eClass.name == "ActionType" && actionType.value === null && actionType.text === null &&
				actionType.option === null:
				"[CLICK]"
			case actionType.value !== null:
				"[CHECK] $" + actionType.value
			case actionType.text !== null:
				"[SET-TEXT] " + actionType.text
			case actionType.option !== null:
				"[CHOOSE] " + actionType.option
			default:
				""
		}
	}

	def String generateActionTypeCode(ActionType actionType, Variable variable) {
		switch actionType {
			case actionType.getAction() == "[CHECK]": 
'''actionLib.checkCheckbox(«variable.name», «actionType.value.toString.toLowerCase»);'''
			case actionType.getAction() == "[SET-TEXT]": 
'''actionLib.setText(«variable.name», «generateContentValue(actionType.getText())»);'''
			case actionType.getAction() == "[CHOOSE]": 
'''actionLib.selectOption(«variable.name», «generateContentValue(actionType.getOption())»);'''
			default:
'''actionLib.clickElement(«variable.name»);'''
		}
	}

	def String generateTest(Test test) '''
		assertLib.assertElementExists(«test.getVar().name».element, "$«test.getVar().name»");
	'''
}
