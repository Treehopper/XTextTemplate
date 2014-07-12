/**
 */
package eu.hohenegger.template.json.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
public interface JObject extends EObject {
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

} // JObject
