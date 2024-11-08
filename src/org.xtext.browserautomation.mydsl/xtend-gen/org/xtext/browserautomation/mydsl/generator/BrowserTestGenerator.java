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
    _builder.append("package fr.imta.massimotisi.browserautomation.example;");
    _builder.newLine();
    _builder.newLine();
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
        String _generateAction = this.generateAction(action);
        _builder.append(_generateAction);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  public String generateAction(final Action action) {
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
        _switchResult = this.generateActionCommand(((ActionCommand)action));
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
    return _switchResult;
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
    String _xifexpression = null;
    final Predicate<Property> _function = (Property it) -> {
      String _prop = it.getProp();
      return Objects.equals(_prop, "[NTH-CHILD]");
    };
    long _count = properties.stream().filter(_function).count();
    boolean _greaterEqualsThan = (_count >= 1);
    if (_greaterEqualsThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("selectLib.selectElement(");
      _builder.append(varName);
      _builder.append(");");
      _xifexpression = _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("selectLib.selectElements(");
      _builder_1.append(varName);
      _builder_1.append(");");
      _xifexpression = _builder_1.toString();
    }
    return _xifexpression;
  }

  public String generateSelect(final Select select) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Property> _properties = select.getProperties();
      for(final Property property : _properties) {
        String _generateProperty = this.generateProperty(property, select.getVar().getName());
        _builder.append(_generateProperty);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("var select_");
    String _name = select.getVar().getName();
    _builder.append(_name);
    _builder.append(" = new SelectFilterProperty();");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _properties_1 = select.getProperties();
      for(final Property property_1 : _properties_1) {
        String _generatePropertyAssignment = this.generatePropertyAssignment(property_1, select.getVar().getName());
        _builder.append(_generatePropertyAssignment);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("var ");
    String _name_1 = select.getVar().getName();
    _builder.append(_name_1);
    _builder.append(" = ");
    EList<Property> _properties_2 = select.getProperties();
    String _name_2 = select.getVar().getName();
    String _plus = ("select_" + _name_2);
    String _generateSelectElement = this.generateSelectElement(_properties_2, _plus);
    _builder.append(_generateSelectElement);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateProperty(final Property property, final String varName) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
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

  public String generatePropertyAssignment(final Property property, final String varName) {
    String _switchResult = null;
    boolean _matched = false;
    String _prop = property.getProp();
    boolean _equals = Objects.equals(_prop, "[CONTENT]");
    if (_equals) {
      _matched=true;
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
    }
    if (!_matched) {
      String _prop_1 = property.getProp();
      boolean _equals_1 = Objects.equals(_prop_1, "[LABEL]");
      if (_equals_1) {
        _matched=true;
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
      }
    }
    if (!_matched) {
      String _prop_2 = property.getProp();
      boolean _equals_2 = Objects.equals(_prop_2, "[VALUE]");
      if (_equals_2) {
        _matched=true;
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
      }
    }
    if (!_matched) {
      String _prop_3 = property.getProp();
      boolean _equals_3 = Objects.equals(_prop_3, "[ALT]");
      if (_equals_3) {
        _matched=true;
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
      }
    }
    if (!_matched) {
      String _prop_4 = property.getProp();
      boolean _equals_4 = Objects.equals(_prop_4, "[LINK]");
      if (_equals_4) {
        _matched=true;
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
      }
    }
    if (!_matched) {
      String _prop_5 = property.getProp();
      boolean _equals_5 = Objects.equals(_prop_5, "[TYPE]");
      if (_equals_5) {
        _matched=true;
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("select_");
        _builder_5.append(varName);
        _builder_5.append(".elementType = FilterElementType.");
        Type _type = property.getType();
        _builder_5.append(_type);
        _builder_5.append(";");
        _builder_5.newLineIfNotEmpty();
        _switchResult = _builder_5.toString();
      }
    }
    if (!_matched) {
      String _prop_6 = property.getProp();
      boolean _equals_6 = Objects.equals(_prop_6, "[NTH-CHILD]");
      if (_equals_6) {
        _matched=true;
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("select_");
        _builder_6.append(varName);
        _builder_6.append(".nthChild = ");
        int _child = property.getChild();
        _builder_6.append(_child);
        _builder_6.append(";");
        _builder_6.newLineIfNotEmpty();
        _switchResult = _builder_6.toString();
      }
    }
    if (!_matched) {
      String _prop_7 = property.getProp();
      boolean _equals_7 = Objects.equals(_prop_7, "[PARENT]");
      if (_equals_7) {
        _matched=true;
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("var select_");
        _builder_7.append(varName);
        _builder_7.append("_parent = selectLib.getParent(selectLib.selectElement(select_");
        _builder_7.append(varName);
        _builder_7.append(").element);");
        _builder_7.newLineIfNotEmpty();
        _builder_7.newLine();
        _builder_7.append("select_");
        _builder_7.append(varName);
        _builder_7.append(" = new SelectFilterProperty();");
        _builder_7.newLineIfNotEmpty();
        _builder_7.newLine();
        _builder_7.append("select_");
        _builder_7.append(varName);
        _builder_7.append(".parent = select_");
        _builder_7.append(varName);
        _builder_7.append("_parent.element;");
        _builder_7.newLineIfNotEmpty();
        _builder_7.newLine();
        {
          EList<Property> _subProperties = property.getSubProperties();
          for(final Property property2 : _subProperties) {
            String _generatePropertyAssignment = this.generatePropertyAssignment(property2, varName);
            _builder_7.append(_generatePropertyAssignment);
            _builder_7.newLineIfNotEmpty();
          }
        }
        _switchResult = _builder_7.toString();
      }
    }
    if (!_matched) {
      StringConcatenation _builder_8 = new StringConcatenation();
      _switchResult = _builder_8.toString();
    }
    return _switchResult;
  }

  public String generateActionCommand(final ActionCommand action) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateActionTypeCode = this.generateActionTypeCode(action.getCommand(), action.getVar());
    _builder.append(_generateActionTypeCode);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String generateActionType(final ActionType actionType) {
    String _switchResult = null;
    boolean _matched = false;
    if ((((Objects.equals(actionType.eClass().getName(), "ActionType") && (actionType.getValue() == null)) && (actionType.getText() == null)) && 
      (actionType.getOption() == null))) {
      _matched=true;
      _switchResult = "[CLICK]";
    }
    if (!_matched) {
      org.xtext.browserautomation.mydsl.browserTest.Boolean _value = actionType.getValue();
      boolean _tripleNotEquals = (_value != null);
      if (_tripleNotEquals) {
        _matched=true;
        org.xtext.browserautomation.mydsl.browserTest.Boolean _value_1 = actionType.getValue();
        _switchResult = ("[CHECK] $" + _value_1);
      }
    }
    if (!_matched) {
      Entree _text = actionType.getText();
      boolean _tripleNotEquals_1 = (_text != null);
      if (_tripleNotEquals_1) {
        _matched=true;
        Entree _text_1 = actionType.getText();
        _switchResult = ("[SET-TEXT] " + _text_1);
      }
    }
    if (!_matched) {
      Entree _option = actionType.getOption();
      boolean _tripleNotEquals_2 = (_option != null);
      if (_tripleNotEquals_2) {
        _matched=true;
        Entree _option_1 = actionType.getOption();
        _switchResult = ("[CHOOSE] " + _option_1);
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }

  public String generateActionTypeCode(final ActionType actionType, final Variable variable) {
    String _switchResult = null;
    boolean _matched = false;
    String _action = actionType.getAction();
    boolean _equals = Objects.equals(_action, "[CHECK]");
    if (_equals) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("actionLib.checkCheckbox(");
      String _name = variable.getName();
      _builder.append(_name);
      _builder.append(", ");
      String _lowerCase = actionType.getValue().toString().toLowerCase();
      _builder.append(_lowerCase);
      _builder.append(");");
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      String _action_1 = actionType.getAction();
      boolean _equals_1 = Objects.equals(_action_1, "[SET-TEXT]");
      if (_equals_1) {
        _matched=true;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("actionLib.setText(");
        String _name_1 = variable.getName();
        _builder_1.append(_name_1);
        _builder_1.append(", ");
        String _generateContentValue = this.generateContentValue(actionType.getText());
        _builder_1.append(_generateContentValue);
        _builder_1.append(");");
        _switchResult = _builder_1.toString();
      }
    }
    if (!_matched) {
      String _action_2 = actionType.getAction();
      boolean _equals_2 = Objects.equals(_action_2, "[CHOOSE]");
      if (_equals_2) {
        _matched=true;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("actionLib.selectOption(");
        String _name_2 = variable.getName();
        _builder_2.append(_name_2);
        _builder_2.append(", ");
        String _generateContentValue_1 = this.generateContentValue(actionType.getOption());
        _builder_2.append(_generateContentValue_1);
        _builder_2.append(");");
        _switchResult = _builder_2.toString();
      }
    }
    if (!_matched) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("actionLib.clickElement(");
      String _name_3 = variable.getName();
      _builder_3.append(_name_3);
      _builder_3.append(");");
      _switchResult = _builder_3.toString();
    }
    return _switchResult;
  }

  public String generateTest(final Test test) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("assertLib.assertElementExists(");
    String _name = test.getVar().getName();
    _builder.append(_name);
    _builder.append(".element, \"$");
    String _name_1 = test.getVar().getName();
    _builder.append(_name_1);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
