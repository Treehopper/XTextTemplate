/**
 */
package eu.hohenegger.template.json.model.impl;

import com.google.common.base.Objects;
import eu.hohenegger.template.json.model.Entry;
import eu.hohenegger.template.json.model.ModelPackage;
import eu.hohenegger.template.json.model.Node;
import eu.hohenegger.template.json.model.Value;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.impl.EntryImpl#getKey <em>Key</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.EntryImpl#getContent <em>Content</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.EntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.EntryImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryImpl extends MinimalEObjectImpl.Container implements Entry {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected Value content;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getChild() <em>Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected static final Object CHILD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTRY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(Value newContent, NotificationChain msgs) {
		Value oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ENTRY__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Value newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ENTRY__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ENTRY__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTRY__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		Object _xifexpression = null;
		Value _content = this.getContent();
		boolean _equals = Objects.equal(_content, null);
		if (_equals) {
			_xifexpression = null;
		}
		else {
			Value _content_1 = this.getContent();
			_xifexpression = _content_1.getValue();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getChild() {
		Node _xifexpression = null;
		Value _content = this.getContent();
		boolean _equals = Objects.equal(_content, null);
		if (_equals) {
			_xifexpression = null;
		}
		else {
			Value _content_1 = this.getContent();
			_xifexpression = _content_1.getChild();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ENTRY__CONTENT:
				return basicSetContent(null, msgs);
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
			case ModelPackage.ENTRY__KEY:
				return getKey();
			case ModelPackage.ENTRY__CONTENT:
				return getContent();
			case ModelPackage.ENTRY__VALUE:
				return getValue();
			case ModelPackage.ENTRY__CHILD:
				return getChild();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ENTRY__KEY:
				setKey((String)newValue);
				return;
			case ModelPackage.ENTRY__CONTENT:
				setContent((Value)newValue);
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
			case ModelPackage.ENTRY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ModelPackage.ENTRY__CONTENT:
				setContent((Value)null);
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
			case ModelPackage.ENTRY__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ModelPackage.ENTRY__CONTENT:
				return content != null;
			case ModelPackage.ENTRY__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case ModelPackage.ENTRY__CHILD:
				return CHILD_EDEFAULT == null ? getChild() != null : !CHILD_EDEFAULT.equals(getChild());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //EntryImpl
