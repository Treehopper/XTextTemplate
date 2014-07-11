/**
 */
package eu.hohenegger.template.parser.jSON;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.parser.jSON.Root#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.parser.jSON.JSONPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(eu.hohenegger.template.parser.jSON.Object)
   * @see eu.hohenegger.template.parser.jSON.JSONPackage#getRoot_Content()
   * @model containment="true"
   * @generated
   */
  eu.hohenegger.template.parser.jSON.Object getContent();

  /**
   * Sets the value of the '{@link eu.hohenegger.template.parser.jSON.Root#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(eu.hohenegger.template.parser.jSON.Object value);

} // Root
