/**
 */
package eu.hohenegger.template.parser.jSON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.parser.jSON.Array#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.parser.jSON.JSONPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Value
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link eu.hohenegger.template.parser.jSON.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see eu.hohenegger.template.parser.jSON.JSONPackage#getArray_Values()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues();

} // Array
