/**
 */
package eu.hohenegger.template.parser.jSON.impl;

import eu.hohenegger.template.parser.jSON.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JSONFactoryImpl extends EFactoryImpl implements JSONFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JSONFactory init()
  {
    try
    {
      JSONFactory theJSONFactory = (JSONFactory)EPackage.Registry.INSTANCE.getEFactory(JSONPackage.eNS_URI);
      if (theJSONFactory != null)
      {
        return theJSONFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JSONFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JSONPackage.ROOT: return createRoot();
      case JSONPackage.JOBJECT: return createJObject();
      case JSONPackage.ENTRY: return createEntry();
      case JSONPackage.VALUE: return createValue();
      case JSONPackage.ARRAY: return createArray();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JObject createJObject()
  {
    JObjectImpl jObject = new JObjectImpl();
    return jObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entry createEntry()
  {
    EntryImpl entry = new EntryImpl();
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSONPackage getJSONPackage()
  {
    return (JSONPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JSONPackage getPackage()
  {
    return JSONPackage.eINSTANCE;
  }

} //JSONFactoryImpl
