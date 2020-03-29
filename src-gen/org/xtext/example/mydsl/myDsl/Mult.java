/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mult#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mult#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMult()
 * @model
 * @generated
 */
public interface Mult extends Multiply
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Multiply)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMult_Left()
   * @model containment="true"
   * @generated
   */
  Multiply getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mult#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Multiply value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(AtomicNumber)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMult_Right()
   * @model containment="true"
   * @generated
   */
  AtomicNumber getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mult#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AtomicNumber value);

} // Mult
