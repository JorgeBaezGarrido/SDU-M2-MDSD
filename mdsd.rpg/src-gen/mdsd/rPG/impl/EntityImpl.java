/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import java.util.Collection;

import mdsd.rPG.AltAttribute;
import mdsd.rPG.EType;
import mdsd.rPG.Entity;
import mdsd.rPG.EntityMoves;
import mdsd.rPG.RPGPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.rPG.impl.EntityImpl#getEType <em>EType</em>}</li>
 *   <li>{@link mdsd.rPG.impl.EntityImpl#getAtt <em>Att</em>}</li>
 *   <li>{@link mdsd.rPG.impl.EntityImpl#getEMoves <em>EMoves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getEType() <em>EType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEType()
   * @generated
   * @ordered
   */
  protected EType eType;

  /**
   * The cached value of the '{@link #getAtt() <em>Att</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtt()
   * @generated
   * @ordered
   */
  protected EList<AltAttribute> att;

  /**
   * The cached value of the '{@link #getEMoves() <em>EMoves</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEMoves()
   * @generated
   * @ordered
   */
  protected EList<EntityMoves> eMoves;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RPGPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EType getEType()
  {
    return eType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEType(EType newEType, NotificationChain msgs)
  {
    EType oldEType = eType;
    eType = newEType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.ENTITY__ETYPE, oldEType, newEType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEType(EType newEType)
  {
    if (newEType != eType)
    {
      NotificationChain msgs = null;
      if (eType != null)
        msgs = ((InternalEObject)eType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ENTITY__ETYPE, null, msgs);
      if (newEType != null)
        msgs = ((InternalEObject)newEType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ENTITY__ETYPE, null, msgs);
      msgs = basicSetEType(newEType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ENTITY__ETYPE, newEType, newEType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AltAttribute> getAtt()
  {
    if (att == null)
    {
      att = new EObjectContainmentEList<AltAttribute>(AltAttribute.class, this, RPGPackage.ENTITY__ATT);
    }
    return att;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EntityMoves> getEMoves()
  {
    if (eMoves == null)
    {
      eMoves = new EObjectContainmentEList<EntityMoves>(EntityMoves.class, this, RPGPackage.ENTITY__EMOVES);
    }
    return eMoves;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RPGPackage.ENTITY__ETYPE:
        return basicSetEType(null, msgs);
      case RPGPackage.ENTITY__ATT:
        return ((InternalEList<?>)getAtt()).basicRemove(otherEnd, msgs);
      case RPGPackage.ENTITY__EMOVES:
        return ((InternalEList<?>)getEMoves()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RPGPackage.ENTITY__NAME:
        return getName();
      case RPGPackage.ENTITY__ETYPE:
        return getEType();
      case RPGPackage.ENTITY__ATT:
        return getAtt();
      case RPGPackage.ENTITY__EMOVES:
        return getEMoves();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPGPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case RPGPackage.ENTITY__ETYPE:
        setEType((EType)newValue);
        return;
      case RPGPackage.ENTITY__ATT:
        getAtt().clear();
        getAtt().addAll((Collection<? extends AltAttribute>)newValue);
        return;
      case RPGPackage.ENTITY__EMOVES:
        getEMoves().clear();
        getEMoves().addAll((Collection<? extends EntityMoves>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RPGPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RPGPackage.ENTITY__ETYPE:
        setEType((EType)null);
        return;
      case RPGPackage.ENTITY__ATT:
        getAtt().clear();
        return;
      case RPGPackage.ENTITY__EMOVES:
        getEMoves().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RPGPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RPGPackage.ENTITY__ETYPE:
        return eType != null;
      case RPGPackage.ENTITY__ATT:
        return att != null && !att.isEmpty();
      case RPGPackage.ENTITY__EMOVES:
        return eMoves != null && !eMoves.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityImpl