/**
 * generated by Xtext 2.36.0
 */
package org.xtext.browserautomation.mydsl.browserTest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.browserautomation.mydsl.browserTest.ActionCommand#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.browserautomation.mydsl.browserTest.ActionCommand#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see org.xtext.browserautomation.mydsl.browserTest.BrowserTestPackage#getActionCommand()
 * @model
 * @generated
 */
public interface ActionCommand extends Action
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see org.xtext.browserautomation.mydsl.browserTest.BrowserTestPackage#getActionCommand_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference.
   * @see #setCommand(ActionType)
   * @see org.xtext.browserautomation.mydsl.browserTest.BrowserTestPackage#getActionCommand_Command()
   * @model containment="true"
   * @generated
   */
  ActionType getCommand();

  /**
   * Sets the value of the '{@link org.xtext.browserautomation.mydsl.browserTest.ActionCommand#getCommand <em>Command</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' containment reference.
   * @see #getCommand()
   * @generated
   */
  void setCommand(ActionType value);

} // ActionCommand