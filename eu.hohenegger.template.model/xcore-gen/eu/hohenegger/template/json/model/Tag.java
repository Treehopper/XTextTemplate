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
 *   <li>{@link eu.hohenegger.template.json.model.Tag#getTextNode <em>Text Node</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Tag#getSubTags <em>Sub Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.json.model.ModelPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Leaf {
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

} // Tag
