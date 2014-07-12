/**
 */
package eu.hohenegger.template.json.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.Entry#getKey <em>Key</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Entry#getContent <em>Content</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Entry#getValue <em>Value</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.Entry#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.json.model.ModelPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getEntry_Key()
	 * @model unique="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Entry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Value)
	 * @see eu.hohenegger.template.json.model.ModelPackage#getEntry_Content()
	 * @model containment="true"
	 * @generated
	 */
	Value getContent();

	/**
	 * Sets the value of the '{@link eu.hohenegger.template.json.model.Entry#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Value value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see eu.hohenegger.template.json.model.ModelPackage#getEntry_Value()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.Object%> _xifexpression = null;\n<%eu.hohenegger.template.json.model.Value%> _content = this.getContent();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_content, null);\nif (_equals)\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t<%eu.hohenegger.template.json.model.Value%> _content_1 = this.getContent();\n\t_xifexpression = _content_1.getValue();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	Object getValue();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' attribute.
	 * @see eu.hohenegger.template.json.model.ModelPackage#getEntry_Child()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%eu.hohenegger.template.json.model.Node%> _xifexpression = null;\n<%eu.hohenegger.template.json.model.Value%> _content = this.getContent();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_content, null);\nif (_equals)\n{\n\t_xifexpression = null;\n}\nelse\n{\n\t<%eu.hohenegger.template.json.model.Value%> _content_1 = this.getContent();\n\t_xifexpression = _content_1.getChild();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	Object getChild();

} // Entry
