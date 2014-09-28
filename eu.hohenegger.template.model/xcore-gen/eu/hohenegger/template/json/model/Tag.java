/**
 */
package eu.hohenegger.template.json.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.Tag#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Tag#getTextNode <em>Text Node</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Tag#getSubTags <em>Sub Tags</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Tag#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.json.model.ModelPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Node {
	/**
	 * Returns the value of the '<em><b>Sub Tags</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.template.json.model.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Tags</em>' containment reference list.
	 * @see eu.hohenegger.template.json.model.ModelPackage#getTag_SubTags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getSubTags();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.template.json.model.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see eu.hohenegger.template.json.model.ModelPackage#getTag_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Text Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Node</em>' containment reference.
	 * @see #setTextNode(TextNode)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getTag_TextNode()
	 * @model containment="true"
	 * @generated
	 */
	TextNode getTextNode();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Tag#getTextNode <em>Text Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Node</em>' containment reference.
	 * @see #getTextNode()
	 * @generated
	 */
	void setTextNode(TextNode value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getTag_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Tag
