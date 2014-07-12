/**
 */
package eu.hohenegger.template.json.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.hohenegger.template.json.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel editDirectory='/eu.hohenegger.template.edit/xcore-gen' modelDirectory='/eu.hohenegger.template.model/xcore-gen' testsDirectory='/eu.hohenegger.template.test/xcore-gen' generateExampleClass='false' editPluginID='eu.hohenegger.template.edit' testsPluginID='eu.hohenegger.template.test' complianceLevel='7.0' runtimeVersion='2.9' modelPluginVariables='org.eclipse.xtext.xbase.lib org.eclipse.emf.ecore.xcore.lib' forceOverwrite='false' fileExtensions='json' updateClasspath='false' basePackage='eu.hohenegger.template.json'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.hohenegger.eu/template/parser/JSON";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = eu.hohenegger.template.json.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.hohenegger.template.json.model.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.hohenegger.template.json.model.impl.RootImpl
	 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.hohenegger.template.json.model.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.hohenegger.template.json.model.Node
	 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.hohenegger.template.json.model.impl.JObjectImpl <em>JObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.hohenegger.template.json.model.impl.JObjectImpl
	 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getJObject()
	 * @generated
	 */
	int JOBJECT = 2;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBJECT__ENTRIES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBJECT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBJECT___GET_VALUE__STRING = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>JObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOBJECT_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.hohenegger.template.json.model.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.hohenegger.template.json.model.impl.EntryImpl
	 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__CHILD = 3;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.hohenegger.template.json.model.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.hohenegger.template.json.model.impl.ValueImpl
	 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 4;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__CHILD = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.hohenegger.template.json.model.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.hohenegger.template.json.model.impl.ArrayImpl
	 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__VALUES = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY___GET_VALUE__INT = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link eu.hohenegger.template.json.model.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see eu.hohenegger.template.json.model.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link eu.hohenegger.template.json.model.Root#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see eu.hohenegger.template.json.model.Root#getContent()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Content();

	/**
	 * Returns the meta object for class '{@link eu.hohenegger.template.json.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see eu.hohenegger.template.json.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link eu.hohenegger.template.json.model.JObject <em>JObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JObject</em>'.
	 * @see eu.hohenegger.template.json.model.JObject
	 * @generated
	 */
	EClass getJObject();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.hohenegger.template.json.model.JObject#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see eu.hohenegger.template.json.model.JObject#getEntries()
	 * @see #getJObject()
	 * @generated
	 */
	EReference getJObject_Entries();

	/**
	 * Returns the meta object for the '{@link eu.hohenegger.template.json.model.JObject#getValue(java.lang.String) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see eu.hohenegger.template.json.model.JObject#getValue(java.lang.String)
	 * @generated
	 */
	EOperation getJObject__GetValue__String();

	/**
	 * Returns the meta object for class '{@link eu.hohenegger.template.json.model.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see eu.hohenegger.template.json.model.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link eu.hohenegger.template.json.model.Entry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see eu.hohenegger.template.json.model.Entry#getKey()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link eu.hohenegger.template.json.model.Entry#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see eu.hohenegger.template.json.model.Entry#getContent()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Content();

	/**
	 * Returns the meta object for the attribute '{@link eu.hohenegger.template.json.model.Entry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.hohenegger.template.json.model.Entry#getValue()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Value();

	/**
	 * Returns the meta object for the attribute '{@link eu.hohenegger.template.json.model.Entry#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Child</em>'.
	 * @see eu.hohenegger.template.json.model.Entry#getChild()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Child();

	/**
	 * Returns the meta object for class '{@link eu.hohenegger.template.json.model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see eu.hohenegger.template.json.model.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the containment reference '{@link eu.hohenegger.template.json.model.Value#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see eu.hohenegger.template.json.model.Value#getChild()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Child();

	/**
	 * Returns the meta object for the attribute '{@link eu.hohenegger.template.json.model.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.hohenegger.template.json.model.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for class '{@link eu.hohenegger.template.json.model.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see eu.hohenegger.template.json.model.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.hohenegger.template.json.model.Array#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see eu.hohenegger.template.json.model.Array#getValues()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Values();

	/**
	 * Returns the meta object for the '{@link eu.hohenegger.template.json.model.Array#getValue(int) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see eu.hohenegger.template.json.model.Array#getValue(int)
	 * @generated
	 */
	EOperation getArray__GetValue__int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.hohenegger.template.json.model.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.hohenegger.template.json.model.impl.RootImpl
		 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CONTENT = eINSTANCE.getRoot_Content();

		/**
		 * The meta object literal for the '{@link eu.hohenegger.template.json.model.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.hohenegger.template.json.model.Node
		 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link eu.hohenegger.template.json.model.impl.JObjectImpl <em>JObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.hohenegger.template.json.model.impl.JObjectImpl
		 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getJObject()
		 * @generated
		 */
		EClass JOBJECT = eINSTANCE.getJObject();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOBJECT__ENTRIES = eINSTANCE.getJObject_Entries();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JOBJECT___GET_VALUE__STRING = eINSTANCE.getJObject__GetValue__String();

		/**
		 * The meta object literal for the '{@link eu.hohenegger.template.json.model.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.hohenegger.template.json.model.impl.EntryImpl
		 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__KEY = eINSTANCE.getEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__CONTENT = eINSTANCE.getEntry_Content();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__VALUE = eINSTANCE.getEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__CHILD = eINSTANCE.getEntry_Child();

		/**
		 * The meta object literal for the '{@link eu.hohenegger.template.json.model.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.hohenegger.template.json.model.impl.ValueImpl
		 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__CHILD = eINSTANCE.getValue_Child();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '{@link eu.hohenegger.template.json.model.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.hohenegger.template.json.model.impl.ArrayImpl
		 * @see eu.hohenegger.template.json.model.impl.ModelPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__VALUES = eINSTANCE.getArray_Values();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARRAY___GET_VALUE__INT = eINSTANCE.getArray__GetValue__int();

	}

} //ModelPackage
