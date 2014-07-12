/**
 */
package eu.hohenegger.template.json.model.impl;

import eu.hohenegger.template.json.model.Array;
import eu.hohenegger.template.json.model.JObject;
import eu.hohenegger.template.json.model.ModelPackage;
import eu.hohenegger.template.json.model.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.hohenegger.template.json.model.impl.ValueImpl#getChild <em>Child</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.ValueImpl#getArray <em>Array</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.ValueImpl#getString <em>String</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.ValueImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.ValueImpl#getInt <em>Int</em>}</li>
 *   <li>{@link eu.hohenegger.template.json.model.impl.ValueImpl#getBoolean <em>Boolean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected JObject child;

	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected Array array;

	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected Double double_ = DOUBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected Integer int_ = INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOLEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected Boolean boolean_ = BOOLEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JObject getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(JObject newChild, NotificationChain msgs) {
		JObject oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(JObject newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VALUE__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VALUE__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array getArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(Array newArray, NotificationChain msgs) {
		Array oldArray = array;
		array = newArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__ARRAY, oldArray, newArray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(Array newArray) {
		if (newArray != array) {
			NotificationChain msgs = null;
			if (array != null)
				msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VALUE__ARRAY, null, msgs);
			if (newArray != null)
				msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.VALUE__ARRAY, null, msgs);
			msgs = basicSetArray(newArray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__ARRAY, newArray, newArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__STRING, oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(Double newDouble) {
		Double oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__DOUBLE, oldDouble, double_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInt() {
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt(Integer newInt) {
		Integer oldInt = int_;
		int_ = newInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__INT, oldInt, int_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(Boolean newBoolean) {
		Boolean oldBoolean = boolean_;
		boolean_ = newBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__BOOLEAN, oldBoolean, boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.VALUE__CHILD:
				return basicSetChild(null, msgs);
			case ModelPackage.VALUE__ARRAY:
				return basicSetArray(null, msgs);
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
			case ModelPackage.VALUE__CHILD:
				return getChild();
			case ModelPackage.VALUE__ARRAY:
				return getArray();
			case ModelPackage.VALUE__STRING:
				return getString();
			case ModelPackage.VALUE__DOUBLE:
				return getDouble();
			case ModelPackage.VALUE__INT:
				return getInt();
			case ModelPackage.VALUE__BOOLEAN:
				return getBoolean();
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
			case ModelPackage.VALUE__CHILD:
				setChild((JObject)newValue);
				return;
			case ModelPackage.VALUE__ARRAY:
				setArray((Array)newValue);
				return;
			case ModelPackage.VALUE__STRING:
				setString((String)newValue);
				return;
			case ModelPackage.VALUE__DOUBLE:
				setDouble((Double)newValue);
				return;
			case ModelPackage.VALUE__INT:
				setInt((Integer)newValue);
				return;
			case ModelPackage.VALUE__BOOLEAN:
				setBoolean((Boolean)newValue);
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
			case ModelPackage.VALUE__CHILD:
				setChild((JObject)null);
				return;
			case ModelPackage.VALUE__ARRAY:
				setArray((Array)null);
				return;
			case ModelPackage.VALUE__STRING:
				setString(STRING_EDEFAULT);
				return;
			case ModelPackage.VALUE__DOUBLE:
				setDouble(DOUBLE_EDEFAULT);
				return;
			case ModelPackage.VALUE__INT:
				setInt(INT_EDEFAULT);
				return;
			case ModelPackage.VALUE__BOOLEAN:
				setBoolean(BOOLEAN_EDEFAULT);
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
			case ModelPackage.VALUE__CHILD:
				return child != null;
			case ModelPackage.VALUE__ARRAY:
				return array != null;
			case ModelPackage.VALUE__STRING:
				return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
			case ModelPackage.VALUE__DOUBLE:
				return DOUBLE_EDEFAULT == null ? double_ != null : !DOUBLE_EDEFAULT.equals(double_);
			case ModelPackage.VALUE__INT:
				return INT_EDEFAULT == null ? int_ != null : !INT_EDEFAULT.equals(int_);
			case ModelPackage.VALUE__BOOLEAN:
				return BOOLEAN_EDEFAULT == null ? boolean_ != null : !BOOLEAN_EDEFAULT.equals(boolean_);
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
		result.append(" (string: ");
		result.append(string);
		result.append(", double: ");
		result.append(double_);
		result.append(", int: ");
		result.append(int_);
		result.append(", boolean: ");
		result.append(boolean_);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
