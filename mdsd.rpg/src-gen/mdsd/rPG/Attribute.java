/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.rPG.Attribute#getAVal <em>AVal</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mdsd.rPG.RPGPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mdsd.rPG.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>AVal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>AVal</em>' containment reference.
   * @see #setAVal(AttributeValues)
   * @see mdsd.rPG.RPGPackage#getAttribute_AVal()
   * @model containment="true"
   * @generated
   */
  AttributeValues getAVal();

  /**
   * Sets the value of the '{@link mdsd.rPG.Attribute#getAVal <em>AVal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AVal</em>' containment reference.
   * @see #getAVal()
   * @generated
   */
  void setAVal(AttributeValues value);

} // Attribute
