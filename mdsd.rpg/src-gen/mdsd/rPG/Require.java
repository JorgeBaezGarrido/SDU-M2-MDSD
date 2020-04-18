/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.Require#getLog <em>Log</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getRequire()
 * @model
 * @generated
 */
public interface Require extends AttributeValues, Teams
{
  /**
   * Returns the value of the '<em><b>Log</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Log</em>' containment reference.
   * @see #setLog(Proposition)
   * @see mdsd.rPG.RPGPackage#getRequire_Log()
   * @model containment="true"
   * @generated
   */
  Proposition getLog();

  /**
   * Sets the value of the '{@link mdsd.rPG.Require#getLog <em>Log</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Log</em>' containment reference.
   * @see #getLog()
   * @generated
   */
  void setLog(Proposition value);

} // Require
