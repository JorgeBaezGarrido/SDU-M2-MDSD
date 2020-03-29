/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getSum <em>Sum</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Comp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' attribute.
   * @see #setComp(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Comp()
   * @model
   * @generated
   */
  String getComp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getComp <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' attribute.
   * @see #getComp()
   * @generated
   */
  void setComp(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AtomicNumber)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Value()
   * @model containment="true"
   * @generated
   */
  AtomicNumber getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AtomicNumber value);

  /**
   * Returns the value of the '<em><b>Attribute2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute2</em>' reference.
   * @see #setAttribute2(Attribute)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Attribute2()
   * @model
   * @generated
   */
  Attribute getAttribute2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getAttribute2 <em>Attribute2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute2</em>' reference.
   * @see #getAttribute2()
   * @generated
   */
  void setAttribute2(Attribute value);

  /**
   * Returns the value of the '<em><b>Sum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum</em>' containment reference.
   * @see #setSum(Sum)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Sum()
   * @model containment="true"
   * @generated
   */
  Sum getSum();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getSum <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum</em>' containment reference.
   * @see #getSum()
   * @generated
   */
  void setSum(Sum value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(AtomicNumber)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Val()
   * @model containment="true"
   * @generated
   */
  AtomicNumber getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(AtomicNumber value);

} // Rule
