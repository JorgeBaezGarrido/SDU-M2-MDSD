/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Locations#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLocations()
 * @model
 * @generated
 */
public interface Locations extends Declaration
{
  /**
   * Returns the value of the '<em><b>Loc</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Loc}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLocations_Loc()
   * @model containment="true"
   * @generated
   */
  EList<Loc> getLoc();

} // Locations