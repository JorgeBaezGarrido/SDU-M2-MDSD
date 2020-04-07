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
 *   <li>{@link mdsd.rPG.AtomicNumber#getValue <em>Value</em>}</li>
 *   <li>{@link mdsd.rPG.AtomicNumber#getValue2 <em>Value2</em>}</li>
 *   <li>{@link mdsd.rPG.AtomicNumber#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getAtomicNumber()
 * @model
 * @generated
 */
public interface AtomicNumber extends Health, Power, Multiply
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see mdsd.rPG.RPGPackage#getAtomicNumber_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link mdsd.rPG.AtomicNumber#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value2</em>' attribute.
   * @see #setValue2(int)
   * @see mdsd.rPG.RPGPackage#getAtomicNumber_Value2()
   * @model
   * @generated
   */
  int getValue2();

  /**
   * Sets the value of the '{@link mdsd.rPG.AtomicNumber#getValue2 <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value2</em>' attribute.
   * @see #getValue2()
   * @generated
   */
  void setValue2(int value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see mdsd.rPG.RPGPackage#getAtomicNumber_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link mdsd.rPG.AtomicNumber#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // AtomicNumber
