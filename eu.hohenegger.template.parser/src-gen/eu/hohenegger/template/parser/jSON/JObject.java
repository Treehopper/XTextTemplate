/**
 */
package eu.hohenegger.template.parser.jSON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.parser.jSON.JObject#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.parser.jSON.JSONPackage#getJObject()
 * @model
 * @generated
 */
public interface JObject extends Value
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link eu.hohenegger.template.parser.jSON.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see eu.hohenegger.template.parser.jSON.JSONPackage#getJObject_Entries()
   * @model containment="true"
   * @generated
   */
  EList<Entry> getEntries();

} // JObject
