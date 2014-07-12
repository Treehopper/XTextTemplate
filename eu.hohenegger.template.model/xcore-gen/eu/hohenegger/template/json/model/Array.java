/**
 */
package eu.hohenegger.template.json.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.Array#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.json.model.ModelPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Node {

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.template.json.model.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see eu.hohenegger.template.json.model.ModelPackage#getArray_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" indexUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%eu.hohenegger.template.json.model.Value%>> _values = this.getValues();\n<%eu.hohenegger.template.json.model.Value%> _get = _values.get(index);\nreturn _get.getValue();'"
	 * @generated
	 */
	Object getValue(int index);

} // Array
