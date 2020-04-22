/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.MoveE#getMoveR <em>Move R</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getMoveE()
 * @model
 * @generated
 */
public interface MoveE extends Effect
{
  /**
   * Returns the value of the '<em><b>Move R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move R</em>' containment reference.
   * @see #setMoveR(MoveRule)
   * @see mdsd.rPG.RPGPackage#getMoveE_MoveR()
   * @model containment="true"
   * @generated
   */
  MoveRule getMoveR();

  /**
   * Sets the value of the '{@link mdsd.rPG.MoveE#getMoveR <em>Move R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move R</em>' containment reference.
   * @see #getMoveR()
   * @generated
   */
  void setMoveR(MoveRule value);

} // MoveE
