/**
 */
package eu.hohenegger.template.json.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.Value#getChild <em>Child</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Value#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.json.model.ModelPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(Node)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_Child()
	 * @model containment="true"
	 * @generated
	 */
	Node getChild();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Node value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_Value()
	 * @model unique="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);
} // Value
