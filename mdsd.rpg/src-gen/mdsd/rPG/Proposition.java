/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.Proposition#getAttritbuteToSet <em>Attritbute To Set</em>}</li>
 *   <li>{@link mdsd.rPG.Proposition#getChange <em>Change</em>}</li>
 *   <li>{@link mdsd.rPG.Proposition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getProposition()
 * @model
 * @generated
 */
public interface Proposition extends Rule
{
  /**
   * Returns the value of the '<em><b>Attritbute To Set</b></em>' reference list.
   * The list contents are of type {@link mdsd.rPG.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attritbute To Set</em>' reference list.
   * @see mdsd.rPG.RPGPackage#getProposition_AttritbuteToSet()
   * @model
   * @generated
   */
  EList<Attribute> getAttritbuteToSet();

  /**
   * Returns the value of the '<em><b>Change</b></em>' containment reference list.
   * The list contents are of type {@link mdsd.rPG.Sum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change</em>' containment reference list.
   * @see mdsd.rPG.RPGPackage#getProposition_Change()
   * @model containment="true"
   * @generated
   */
  EList<Sum> getChange();

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see mdsd.rPG.RPGPackage#getProposition_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link mdsd.rPG.Proposition#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Proposition
