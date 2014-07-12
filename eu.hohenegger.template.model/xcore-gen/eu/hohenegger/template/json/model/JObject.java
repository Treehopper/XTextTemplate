/**
 */
package eu.hohenegger.template.json.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.JObject#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.hohenegger.template.json.model.ModelPackage#getJObject()
 * @model
 * @generated
 */
public interface JObject extends Node {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link eu.hohenegger.template.json.model.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see eu.hohenegger.template.json.model.ModelPackage#getJObject_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" keyUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%eu.hohenegger.template.json.model.Entry%>> _entries = this.getEntries();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%eu.hohenegger.template.json.model.Entry%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%eu.hohenegger.template.json.model.Entry%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%eu.hohenegger.template.json.model.Entry%> e)\n\t{\n\t\t<%java.lang.String%> _key = e.getKey();\n\t\treturn <%java.lang.Boolean%>.valueOf(key.equals(_key));\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%eu.hohenegger.template.json.model.Entry%>>findFirst(_entries, _function);'"
	 * @generated
	 */
	Entry getValue(String key);

} // JObject
