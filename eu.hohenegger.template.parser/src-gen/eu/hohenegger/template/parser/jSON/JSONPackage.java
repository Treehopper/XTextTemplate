/**
 */
package eu.hohenegger.template.parser.jSON;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.hohenegger.template.parser.jSON.JSONFactory
 * @model kind="package"
 * @generated
 */
public interface JSONPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jSON";

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
  String eNS_PREFIX = "jSON";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JSONPackage eINSTANCE = eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.hohenegger.template.parser.jSON.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.hohenegger.template.parser.jSON.impl.RootImpl
   * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getRoot()
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
   * The meta object id for the '{@link eu.hohenegger.template.parser.jSON.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.hohenegger.template.parser.jSON.impl.ValueImpl
   * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.hohenegger.template.parser.jSON.impl.JObjectImpl <em>JObject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.hohenegger.template.parser.jSON.impl.JObjectImpl
   * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getJObject()
   * @generated
   */
  int JOBJECT = 1;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOBJECT__ENTRIES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>JObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.hohenegger.template.parser.jSON.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.hohenegger.template.parser.jSON.impl.EntryImpl
   * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.hohenegger.template.parser.jSON.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.hohenegger.template.parser.jSON.impl.ArrayImpl
   * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 4;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link eu.hohenegger.template.parser.jSON.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see eu.hohenegger.template.parser.jSON.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference '{@link eu.hohenegger.template.parser.jSON.Root#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see eu.hohenegger.template.parser.jSON.Root#getContent()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Content();

  /**
   * Returns the meta object for class '{@link eu.hohenegger.template.parser.jSON.JObject <em>JObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JObject</em>'.
   * @see eu.hohenegger.template.parser.jSON.JObject
   * @generated
   */
  EClass getJObject();

  /**
   * Returns the meta object for the containment reference list '{@link eu.hohenegger.template.parser.jSON.JObject#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see eu.hohenegger.template.parser.jSON.JObject#getEntries()
   * @see #getJObject()
   * @generated
   */
  EReference getJObject_Entries();

  /**
   * Returns the meta object for class '{@link eu.hohenegger.template.parser.jSON.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see eu.hohenegger.template.parser.jSON.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for the attribute '{@link eu.hohenegger.template.parser.jSON.Entry#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see eu.hohenegger.template.parser.jSON.Entry#getKey()
   * @see #getEntry()
   * @generated
   */
  EAttribute getEntry_Key();

  /**
   * Returns the meta object for the containment reference '{@link eu.hohenegger.template.parser.jSON.Entry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see eu.hohenegger.template.parser.jSON.Entry#getValue()
   * @see #getEntry()
   * @generated
   */
  EReference getEntry_Value();

  /**
   * Returns the meta object for class '{@link eu.hohenegger.template.parser.jSON.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see eu.hohenegger.template.parser.jSON.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link eu.hohenegger.template.parser.jSON.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see eu.hohenegger.template.parser.jSON.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference list '{@link eu.hohenegger.template.parser.jSON.Array#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see eu.hohenegger.template.parser.jSON.Array#getValues()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JSONFactory getJSONFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.hohenegger.template.parser.jSON.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.hohenegger.template.parser.jSON.impl.RootImpl
     * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getRoot()
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
     * The meta object literal for the '{@link eu.hohenegger.template.parser.jSON.impl.JObjectImpl <em>JObject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.hohenegger.template.parser.jSON.impl.JObjectImpl
     * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getJObject()
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
     * The meta object literal for the '{@link eu.hohenegger.template.parser.jSON.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.hohenegger.template.parser.jSON.impl.EntryImpl
     * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getEntry()
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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY__VALUE = eINSTANCE.getEntry_Value();

    /**
     * The meta object literal for the '{@link eu.hohenegger.template.parser.jSON.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.hohenegger.template.parser.jSON.impl.ValueImpl
     * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link eu.hohenegger.template.parser.jSON.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.hohenegger.template.parser.jSON.impl.ArrayImpl
     * @see eu.hohenegger.template.parser.jSON.impl.JSONPackageImpl#getArray()
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

  }

} //JSONPackage
