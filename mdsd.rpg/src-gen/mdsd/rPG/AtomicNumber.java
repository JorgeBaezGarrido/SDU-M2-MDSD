/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.AtomicNumber#getReq <em>Req</em>}</li>
 *   <li>{@link mdsd.rPG.AtomicNumber#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getAtomicNumber()
 * @model
 * @generated
 */
public interface AtomicNumber extends AttributeValues, BattleSize, Multiply
{
  /**
   * Returns the value of the '<em><b>Req</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req</em>' containment reference.
   * @see #setReq(Require)
   * @see mdsd.rPG.RPGPackage#getAtomicNumber_Req()
   * @model containment="true"
   * @generated
   */
  Require getReq();

  /**
   * Sets the value of the '{@link mdsd.rPG.AtomicNumber#getReq <em>Req</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req</em>' containment reference.
   * @see #getReq()
   * @generated
   */
  void setReq(Require value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see mdsd.rPG.RPGPackage#getAtomicNumber_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link mdsd.rPG.AtomicNumber#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // AtomicNumber
