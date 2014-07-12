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
 *   <li>{@link eu.hohenegger.template.json.model.Value#getArray <em>Array</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Value#getString <em>String</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Value#getDouble <em>Double</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Value#getInt <em>Int</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Value#getBoolean <em>Boolean</em>}</li>
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
	 * @see #setChild(JObject)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_Child()
	 * @model containment="true"
	 * @generated
	 */
	JObject getChild();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(JObject value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(Array)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_Array()
	 * @model containment="true"
	 * @generated
	 */
	Array getArray();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(Array value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_String()
	 * @model unique="false"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' attribute.
	 * @see #setDouble(Double)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_Double()
	 * @model unique="false"
	 * @generated
	 */
	Double getDouble();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getDouble <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' attribute.
	 * @see #getDouble()
	 * @generated
	 */
	void setDouble(Double value);

	/**
	 * Returns the value of the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' attribute.
	 * @see #setInt(Integer)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_Int()
	 * @model unique="false"
	 * @generated
	 */
	Integer getInt();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getInt <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int</em>' attribute.
	 * @see #getInt()
	 * @generated
	 */
	void setInt(Integer value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #setBoolean(Boolean)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getValue_Boolean()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getBoolean();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Value#getBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(Boolean value);
} // Value
