/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Entities#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEntities()
 * @model
 * @generated
 */
public interface Entities extends Declaration
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Entity}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEntities_Entity()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntity();

} // Entities
