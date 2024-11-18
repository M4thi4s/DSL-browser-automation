package org.xtext.browserautomation.mydsl.generator;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.browserautomation.mydsl.browserTest.Accessor;
import org.xtext.browserautomation.mydsl.browserTest.Action;
import org.xtext.browserautomation.mydsl.browserTest.ActionCommand;
import org.xtext.browserautomation.mydsl.browserTest.ActionType;
import org.xtext.browserautomation.mydsl.browserTest.Attribute;
import org.xtext.browserautomation.mydsl.browserTest.Entree;
import org.xtext.browserautomation.mydsl.browserTest.GoTo;
import org.xtext.browserautomation.mydsl.browserTest.Property;
import org.xtext.browserautomation.mydsl.browserTest.Select;
import org.xtext.browserautomation.mydsl.browserTest.Task;
import org.xtext.browserautomation.mydsl.browserTest.Test;
import org.xtext.browserautomation.mydsl.browserTest.TestFile;
import org.xtext.browserautomation.mydsl.browserTest.Type;
import org.xtext.browserautomation.mydsl.browserTest.Variable;

@SuppressWarnings("all")
public class BrowserTestGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final TestFile testFile = ((TestFile) _head);
    final String className = resource.getURI().trimFileExtension().lastSegment();
    fsa.generateFile(
      (className + ".java"), 
      this.generateJavaCode(testFile, className));
  }

  public String generateJavaCode(final TestFile testFile, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import fr.imta.massimotisi.browserautomation.lib.*;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebElement;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.chrome.ChromeDriver;");
    _builder.newLine();
    _builder.append("import java.time.Duration;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("WebDriver driver = new ChromeDriver();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Duration timeout = Duration.ofSeconds(10);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SelectLib selectLib = new SelectLib(driver, timeout);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ActionLib actionLib = new ActionLib(driver, timeout);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AssertLib assertLib = new AssertLib();");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    {
      EList<Task> _task = testFile.getTask();
      for(final Task task : _task) {
        _builder.append("        ");
        String _generateTask = this.generateTask(task);
        _builder.append(_generateTask, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("driver.quit();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String generateTask(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Action> _actions = task.getActions();
      for(final Action action : _actions) {
        String _switchResult = null;
        boolean _matched = false;
        if (action instanceof GoTo) {
          _matched=true;
          _switchResult = this.generateGoTo(((GoTo)action));
        }
        if (!_matched) {
          if (action instanceof Select) {
            _matched=true;
            _switchResult = this.generateSelect(((Select)action));
          }
        }
        if (!_matched) {
          if (action instanceof ActionCommand) {
            _matched=true;
            _switchResult = this.generateActionCode(((ActionCommand)action).getCommand(), ((ActionCommand)action).getVar());
          }
        }
        if (!_matched) {
          if (action instanceof Test) {
            _matched=true;
            _switchResult = this.generateTest(((Test)action));
          }
        }
        if (!_matched) {
          _switchResult = "";
        }
        _builder.append(_switchResult);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  public String generateGoTo(final GoTo goTo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("actionLib.goToUrl(\"");
    String _url = goTo.getUrl();
    _builder.append(_url);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateSelectElement(final List<Property> properties, final String varName) {
    String methodName = "selectLib.selectElements";
    final Predicate<Property> _function = (Property it) -> {
      String _prop = it.getProp();
      return Objects.equals(_prop, "[NTH-CHILD]");
    };
    long _count = properties.stream().filter(_function).count();
    boolean _greaterEqualsThan = (_count >= 1);
    if (_greaterEqualsThan) {
      methodName = "selectLib.selectElement";
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(methodName);
    _builder.append("(");
    _builder.append(varName);
    _builder.append(");");
    return _builder.toString();
  }

  public String generateSelect(final Select select) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var select_");
    String _name = select.getVar().getName();
    _builder.append(_name);
    _builder.append(" = new SelectFilterProperty();");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _properties = select.getProperties();
      for(final Property property : _properties) {
        String _generatePropertyAssignment = this.generatePropertyAssignment(property, select.getVar().getName());
        _builder.append(_generatePropertyAssignment);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("var ");
    String _name_1 = select.getVar().getName();
    _builder.append(_name_1);
    _builder.append(" = ");
    EList<Property> _properties_1 = select.getProperties();
    String _name_2 = select.getVar().getName();
    String _plus = ("select_" + _name_2);
    String _generateSelectElement = this.generateSelectElement(_properties_1, _plus);
    _builder.append(_generateSelectElement);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generatePropertyAssignment(final Property property, final String varName) {
    String _switchResult = null;
    String _prop = property.getProp();
    if (_prop != null) {
      switch (_prop) {
        case "[CONTENT]":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("select_");
          _builder.append(varName);
          _builder.append(".filterBy = FilterBy.TEXT;");
          _builder.newLineIfNotEmpty();
          _builder.append("select_");
          _builder.append(varName);
          _builder.append(".filterValue = ");
          String _generateContentValue = this.generateContentValue(property.getContent());
          _builder.append(_generateContentValue);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _switchResult = _builder.toString();
          break;
        case "[LABEL]":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("select_");
          _builder_1.append(varName);
          _builder_1.append(".filterValue = ");
          String _generateContentValue_1 = this.generateContentValue(property.getLabel());
          _builder_1.append(_generateContentValue_1);
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("select_");
          _builder_1.append(varName);
          _builder_1.append(".filterBy = FilterBy.LABEL;");
          _builder_1.newLineIfNotEmpty();
          _switchResult = _builder_1.toString();
          break;
        case "[VALUE]":
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("select_");
          _builder_2.append(varName);
          _builder_2.append(".filterValue = ");
          String _generateContentValue_2 = this.generateContentValue(property.getValue());
          _builder_2.append(_generateContentValue_2);
          _builder_2.append(";");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("select_");
          _builder_2.append(varName);
          _builder_2.append(".filterBy = FilterBy.VALUE;");
          _builder_2.newLineIfNotEmpty();
          _switchResult = _builder_2.toString();
          break;
        case "[ALT]":
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("select_");
          _builder_3.append(varName);
          _builder_3.append(".filterValue = ");
          String _generateContentValue_3 = this.generateContentValue(property.getAlt());
          _builder_3.append(_generateContentValue_3);
          _builder_3.append(";");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("select_");
          _builder_3.append(varName);
          _builder_3.append(".filterBy = FilterBy.ALT;");
          _builder_3.newLineIfNotEmpty();
          _switchResult = _builder_3.toString();
          break;
        case "[LINK]":
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("select_");
          _builder_4.append(varName);
          _builder_4.append(".filterValue = ");
          String _generateContentValue_4 = this.generateContentValue(property.getLink());
          _builder_4.append(_generateContentValue_4);
          _builder_4.append("; ");
          _builder_4.newLineIfNotEmpty();
          _builder_4.append("select_");
          _builder_4.append(varName);
          _builder_4.append(".filterBy = FilterBy.LINK;");
          _builder_4.newLineIfNotEmpty();
          _switchResult = _builder_4.toString();
          break;
        case "[TYPE]":
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("select_");
          _builder_5.append(varName);
          _builder_5.append(".elementType = FilterElementType.");
          Type _type = property.getType();
          _builder_5.append(_type);
          _builder_5.append(";");
          _builder_5.newLineIfNotEmpty();
          _switchResult = _builder_5.toString();
          break;
        case "[NTH-CHILD]":
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("select_");
          _builder_6.append(varName);
          _builder_6.append(".nthChild = ");
          int _child = property.getChild();
          _builder_6.append(_child);
          _builder_6.append(";");
          _builder_6.newLineIfNotEmpty();
          _switchResult = _builder_6.toString();
          break;
        case "[PARENT]":
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("{");
          _builder_7.newLine();
          _builder_7.append("\t");
          _builder_7.append("select_");
          _builder_7.append(varName, "\t");
          _builder_7.append(" = new SelectFilterProperty(selectLib.getParent(select_");
          _builder_7.append(varName, "\t");
          _builder_7.append(").element);");
          _builder_7.newLineIfNotEmpty();
          {
            EList<Property> _subProperties = property.getSubProperties();
            for(final Property property2 : _subProperties) {
              _builder_7.append("\t");
              String _generatePropertyAssignment = this.generatePropertyAssignment(property2, varName);
              _builder_7.append(_generatePropertyAssignment, "\t");
              _builder_7.newLineIfNotEmpty();
            }
          }
          _builder_7.append("}");
          _builder_7.newLine();
          _switchResult = _builder_7.toString();
          break;
        default:
          StringConcatenation _builder_8 = new StringConcatenation();
          _switchResult = _builder_8.toString();
          break;
      }
    } else {
      StringConcatenation _builder_8 = new StringConcatenation();
      _switchResult = _builder_8.toString();
    }
    return _switchResult;
  }

  public String generateContentValue(final Entree entree) {
    if (((entree.getVar() != null) && (entree.getParam() != null))) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = entree.getVar().getName();
      _builder.append(_name);
      _builder.append(".");
      Attribute _param = entree.getParam();
      _builder.append(_param);
      return _builder.toString();
    }
    if (((entree.getVar() != null) && (entree.getUntyped() != null))) {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name_1 = entree.getVar().getName();
      _builder_1.append(_name_1);
      _builder_1.append(".");
      String _untyped = entree.getUntyped();
      _builder_1.append(_untyped);
      return _builder_1.toString();
    }
    String _string = entree.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("\"");
      String _string_1 = entree.getString();
      _builder_2.append(_string_1);
      _builder_2.append("\"");
      return _builder_2.toString();
    }
    Accessor _accessor = entree.getAccessor();
    boolean _tripleNotEquals_1 = (_accessor != null);
    if (_tripleNotEquals_1) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("FilterAccessor.");
      Accessor _accessor_1 = entree.getAccessor();
      _builder_3.append(_accessor_1);
      return _builder_3.toString();
    }
    StringConcatenation _builder_4 = new StringConcatenation();
    return _builder_4.toString();
  }

  public String generateActionCode(final ActionType actionType, final Variable variable) {
    String _switchResult = null;
    String _action = actionType.getAction();
    if (_action != null) {
      switch (_action) {
        case "[CHECK]":
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("actionLib.checkCheckbox(");
          String _name = variable.getName();
          _builder.append(_name);
          _builder.append(", ");
          String _lowerCase = actionType.getValue().toString().toLowerCase();
          _builder.append(_lowerCase);
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _switchResult = _builder.toString();
          break;
        case "[SET-TEXT]":
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("actionLib.setText(");
          String _name_1 = variable.getName();
          _builder_1.append(_name_1);
          _builder_1.append(", ");
          String _generateContentValue = this.generateContentValue(actionType.getText());
          _builder_1.append(_generateContentValue);
          _builder_1.append(");");
          _builder_1.newLineIfNotEmpty();
          _switchResult = _builder_1.toString();
          break;
        case "[CHOOSE]":
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("actionLib.selectOption(");
          String _name_2 = variable.getName();
          _builder_2.append(_name_2);
          _builder_2.append(", ");
          String _generateContentValue_1 = this.generateContentValue(actionType.getOption());
          _builder_2.append(_generateContentValue_1);
          _builder_2.append(");");
          _builder_2.newLineIfNotEmpty();
          _switchResult = _builder_2.toString();
          break;
        default:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("actionLib.clickElement(");
          String _name_3 = variable.getName();
          _builder_3.append(_name_3);
          _builder_3.append(");");
          _builder_3.newLineIfNotEmpty();
          _switchResult = _builder_3.toString();
          break;
      }
    } else {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("actionLib.clickElement(");
      String _name_3 = variable.getName();
      _builder_3.append(_name_3);
      _builder_3.append(");");
      _builder_3.newLineIfNotEmpty();
      _switchResult = _builder_3.toString();
    }
    return _switchResult;
  }

  public String generateTest(final Test test) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("assertLib.assertElementExists(");
    String _name = test.getVar().getName();
    _builder.append(_name);
    _builder.append(".element, \"");
    String _name_1 = test.getVar().getName();
    _builder.append(_name_1);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
