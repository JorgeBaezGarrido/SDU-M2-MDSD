/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.BattleSize;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Team;
import org.xtext.example.mydsl.myDsl.Teams;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teams</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TeamsImpl#getBs <em>Bs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.TeamsImpl#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamsImpl extends DeclarationImpl implements Teams
{
  /**
   * The cached value of the '{@link #getBs() <em>Bs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBs()
   * @generated
   * @ordered
   */
  protected BattleSize bs;

  /**
   * The cached value of the '{@link #getTeam() <em>Team</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected EList<Team> team;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TeamsImpl()
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
    return MyDslPackage.Literals.TEAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BattleSize getBs()
  {
    return bs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBs(BattleSize newBs, NotificationChain msgs)
  {
    BattleSize oldBs = bs;
    bs = newBs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.TEAMS__BS, oldBs, newBs);
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
  public void setBs(BattleSize newBs)
  {
    if (newBs != bs)
    {
      NotificationChain msgs = null;
      if (bs != null)
        msgs = ((InternalEObject)bs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TEAMS__BS, null, msgs);
      if (newBs != null)
        msgs = ((InternalEObject)newBs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.TEAMS__BS, null, msgs);
      msgs = basicSetBs(newBs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.TEAMS__BS, newBs, newBs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Team> getTeam()
  {
    if (team == null)
    {
      team = new EObjectContainmentEList<Team>(Team.class, this, MyDslPackage.TEAMS__TEAM);
    }
    return team;
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
      case MyDslPackage.TEAMS__BS:
        return basicSetBs(null, msgs);
      case MyDslPackage.TEAMS__TEAM:
        return ((InternalEList<?>)getTeam()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.TEAMS__BS:
        return getBs();
      case MyDslPackage.TEAMS__TEAM:
        return getTeam();
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
      case MyDslPackage.TEAMS__BS:
        setBs((BattleSize)newValue);
        return;
      case MyDslPackage.TEAMS__TEAM:
        getTeam().clear();
        getTeam().addAll((Collection<? extends Team>)newValue);
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
      case MyDslPackage.TEAMS__BS:
        setBs((BattleSize)null);
        return;
      case MyDslPackage.TEAMS__TEAM:
        getTeam().clear();
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
      case MyDslPackage.TEAMS__BS:
        return bs != null;
      case MyDslPackage.TEAMS__TEAM:
        return team != null && !team.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TeamsImpl