/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Entity#getEType <em>EType</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Entity#getAtt <em>Att</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Entity#getEMoves <em>EMoves</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>EType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>EType</em>' containment reference.
   * @see #setEType(EType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEntity_EType()
   * @model containment="true"
   * @generated
   */
  EType getEType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Entity#getEType <em>EType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EType</em>' containment reference.
   * @see #getEType()
   * @generated
   */
  void setEType(EType value);

  /**
   * Returns the value of the '<em><b>Att</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.AltAttribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEntity_Att()
   * @model containment="true"
   * @generated
   */
  EList<AltAttribute> getAtt();

  /**
   * Returns the value of the '<em><b>EMoves</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.EntityMoves}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>EMoves</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEntity_EMoves()
   * @model containment="true"
   * @generated
   */
  EList<EntityMoves> getEMoves();

} // Entity