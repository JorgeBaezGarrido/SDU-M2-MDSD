/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import java.util.Collection;

import mdsd.rPG.RPGPackage;
import mdsd.rPG.Type;
import mdsd.rPG.TypeExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.TypeExpressionImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link mdsd.rPG.impl.TypeExpressionImpl#getStrong2 <em>Strong2</em>}</li>
 *   <li>{@link mdsd.rPG.impl.TypeExpressionImpl#getCurrentT <em>Current T</em>}</li>
 *   <li>{@link mdsd.rPG.impl.TypeExpressionImpl#getWeak <em>Weak</em>}</li>
 *   <li>{@link mdsd.rPG.impl.TypeExpressionImpl#getWeak2 <em>Weak2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeExpressionImpl extends MinimalEObjectImpl.Container implements TypeExpression
{
  /**
   * The cached value of the '{@link #getStrong() <em>Strong</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrong()
   * @generated
   * @ordered
   */
  protected Type strong;

  /**
   * The cached value of the '{@link #getStrong2() <em>Strong2</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrong2()
   * @generated
   * @ordered
   */
  protected EList<Type> strong2;

  /**
   * The cached value of the '{@link #getCurrentT() <em>Current T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentT()
   * @generated
   * @ordered
   */
  protected Type currentT;

  /**
   * The cached value of the '{@link #getWeak() <em>Weak</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeak()
   * @generated
   * @ordered
   */
  protected Type weak;

  /**
   * The cached value of the '{@link #getWeak2() <em>Weak2</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeak2()
   * @generated
   * @ordered
   */
  protected EList<Type> weak2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeExpressionImpl()
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
    return RPGPackage.Literals.TYPE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getStrong()
  {
    if (strong != null && strong.eIsProxy())
    {
      InternalEObject oldStrong = (InternalEObject)strong;
      strong = (Type)eResolveProxy(oldStrong);
      if (strong != oldStrong)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.TYPE_EXPRESSION__STRONG, oldStrong, strong));
      }
    }
    return strong;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetStrong()
  {
    return strong;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrong(Type newStrong)
  {
    Type oldStrong = strong;
    strong = newStrong;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.TYPE_EXPRESSION__STRONG, oldStrong, strong));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getStrong2()
  {
    if (strong2 == null)
    {
      strong2 = new EObjectResolvingEList<Type>(Type.class, this, RPGPackage.TYPE_EXPRESSION__STRONG2);
    }
    return strong2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getCurrentT()
  {
    if (currentT != null && currentT.eIsProxy())
    {
      InternalEObject oldCurrentT = (InternalEObject)currentT;
      currentT = (Type)eResolveProxy(oldCurrentT);
      if (currentT != oldCurrentT)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.TYPE_EXPRESSION__CURRENT_T, oldCurrentT, currentT));
      }
    }
    return currentT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetCurrentT()
  {
    return currentT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCurrentT(Type newCurrentT)
  {
    Type oldCurrentT = currentT;
    currentT = newCurrentT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.TYPE_EXPRESSION__CURRENT_T, oldCurrentT, currentT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getWeak()
  {
    if (weak != null && weak.eIsProxy())
    {
      InternalEObject oldWeak = (InternalEObject)weak;
      weak = (Type)eResolveProxy(oldWeak);
      if (weak != oldWeak)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.TYPE_EXPRESSION__WEAK, oldWeak, weak));
      }
    }
    return weak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetWeak()
  {
    return weak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeak(Type newWeak)
  {
    Type oldWeak = weak;
    weak = newWeak;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.TYPE_EXPRESSION__WEAK, oldWeak, weak));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getWeak2()
  {
    if (weak2 == null)
    {
      weak2 = new EObjectResolvingEList<Type>(Type.class, this, RPGPackage.TYPE_EXPRESSION__WEAK2);
    }
    return weak2;
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
      case RPGPackage.TYPE_EXPRESSION__STRONG:
        if (resolve) return getStrong();
        return basicGetStrong();
      case RPGPackage.TYPE_EXPRESSION__STRONG2:
        return getStrong2();
      case RPGPackage.TYPE_EXPRESSION__CURRENT_T:
        if (resolve) return getCurrentT();
        return basicGetCurrentT();
      case RPGPackage.TYPE_EXPRESSION__WEAK:
        if (resolve) return getWeak();
        return basicGetWeak();
      case RPGPackage.TYPE_EXPRESSION__WEAK2:
        return getWeak2();
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
      case RPGPackage.TYPE_EXPRESSION__STRONG:
        setStrong((Type)newValue);
        return;
      case RPGPackage.TYPE_EXPRESSION__STRONG2:
        getStrong2().clear();
        getStrong2().addAll((Collection<? extends Type>)newValue);
        return;
      case RPGPackage.TYPE_EXPRESSION__CURRENT_T:
        setCurrentT((Type)newValue);
        return;
      case RPGPackage.TYPE_EXPRESSION__WEAK:
        setWeak((Type)newValue);
        return;
      case RPGPackage.TYPE_EXPRESSION__WEAK2:
        getWeak2().clear();
        getWeak2().addAll((Collection<? extends Type>)newValue);
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
      case RPGPackage.TYPE_EXPRESSION__STRONG:
        setStrong((Type)null);
        return;
      case RPGPackage.TYPE_EXPRESSION__STRONG2:
        getStrong2().clear();
        return;
      case RPGPackage.TYPE_EXPRESSION__CURRENT_T:
        setCurrentT((Type)null);
        return;
      case RPGPackage.TYPE_EXPRESSION__WEAK:
        setWeak((Type)null);
        return;
      case RPGPackage.TYPE_EXPRESSION__WEAK2:
        getWeak2().clear();
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
      case RPGPackage.TYPE_EXPRESSION__STRONG:
        return strong != null;
      case RPGPackage.TYPE_EXPRESSION__STRONG2:
        return strong2 != null && !strong2.isEmpty();
      case RPGPackage.TYPE_EXPRESSION__CURRENT_T:
        return currentT != null;
      case RPGPackage.TYPE_EXPRESSION__WEAK:
        return weak != null;
      case RPGPackage.TYPE_EXPRESSION__WEAK2:
        return weak2 != null && !weak2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeExpressionImpl
