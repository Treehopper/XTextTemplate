/**
 */
package eu.hohenegger.template.json.model.impl;

import eu.hohenegger.template.json.model.ModelPackage;
import eu.hohenegger.template.json.model.Tag;
import eu.hohenegger.template.json.model.TextNode;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.impl.TagImpl#getTextNode <em>Text Node</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.TagImpl#getSubTags <em>Sub Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagImpl extends LeafImpl implements Tag {
	/**
	 * The cached value of the '{@link #getTextNode() <em>Text Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextNode()
	 * @generated
	 * @ordered
	 */
	protected TextNode textNode;

	/**
	 * The cached value of the '{@link #getSubTags() <em>Sub Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> subTags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getSubTags() {
		if (subTags == null) {
			subTags = new EObjectContainmentEList<Tag>(Tag.class, this, ModelPackage.TAG__SUB_TAGS);
		}
		return subTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextNode getTextNode() {
		return textNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextNode(TextNode newTextNode, NotificationChain msgs) {
		TextNode oldTextNode = textNode;
		textNode = newTextNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TAG__TEXT_NODE, oldTextNode, newTextNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextNode(TextNode newTextNode) {
		if (newTextNode != textNode) {
			NotificationChain msgs = null;
			if (textNode != null)
				msgs = ((InternalEObject)textNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TAG__TEXT_NODE, null, msgs);
			if (newTextNode != null)
				msgs = ((InternalEObject)newTextNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TAG__TEXT_NODE, null, msgs);
			msgs = basicSetTextNode(newTextNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TAG__TEXT_NODE, newTextNode, newTextNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TAG__TEXT_NODE:
				return basicSetTextNode(null, msgs);
			case ModelPackage.TAG__SUB_TAGS:
				return ((InternalEList<?>)getSubTags()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TAG__TEXT_NODE:
				return getTextNode();
			case ModelPackage.TAG__SUB_TAGS:
				return getSubTags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TAG__TEXT_NODE:
				setTextNode((TextNode)newValue);
				return;
			case ModelPackage.TAG__SUB_TAGS:
				getSubTags().clear();
				getSubTags().addAll((Collection<? extends Tag>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.TAG__TEXT_NODE:
				setTextNode((TextNode)null);
				return;
			case ModelPackage.TAG__SUB_TAGS:
				getSubTags().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.TAG__TEXT_NODE:
				return textNode != null;
			case ModelPackage.TAG__SUB_TAGS:
				return subTags != null && !subTags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TagImpl
