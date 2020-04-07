/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import mdsd.rPG.AtomicNumber;
import mdsd.rPG.Attribute;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Rule;
import mdsd.rPG.Sum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getAttribute2 <em>Attribute2</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link mdsd.rPG.impl.RuleImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected static final String COMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected String comp = COMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AtomicNumber value;

  /**
   * The cached value of the '{@link #getAttribute2() <em>Attribute2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute2()
   * @generated
   * @ordered
   */
  protected Attribute attribute2;

  /**
   * The cached value of the '{@link #getSum() <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected Sum sum;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected AtomicNumber val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return RPGPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (Attribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.RULE__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttribute(Attribute newAttribute)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getComp()
  {
    return comp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComp(String newComp)
  {
    String oldComp = comp;
    comp = newComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__COMP, oldComp, comp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicNumber getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(AtomicNumber newValue, NotificationChain msgs)
  {
    AtomicNumber oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__VALUE, oldValue, newValue);
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
  public void setValue(AtomicNumber newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getAttribute2()
  {
    if (attribute2 != null && attribute2.eIsProxy())
    {
      InternalEObject oldAttribute2 = (InternalEObject)attribute2;
      attribute2 = (Attribute)eResolveProxy(oldAttribute2);
      if (attribute2 != oldAttribute2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.RULE__ATTRIBUTE2, oldAttribute2, attribute2));
      }
    }
    return attribute2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttribute2()
  {
    return attribute2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttribute2(Attribute newAttribute2)
  {
    Attribute oldAttribute2 = attribute2;
    attribute2 = newAttribute2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__ATTRIBUTE2, oldAttribute2, attribute2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum getSum()
  {
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSum(Sum newSum, NotificationChain msgs)
  {
    Sum oldSum = sum;
    sum = newSum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__SUM, oldSum, newSum);
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
  public void setSum(Sum newSum)
  {
    if (newSum != sum)
    {
      NotificationChain msgs = null;
      if (sum != null)
        msgs = ((InternalEObject)sum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__SUM, null, msgs);
      if (newSum != null)
        msgs = ((InternalEObject)newSum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__SUM, null, msgs);
      msgs = basicSetSum(newSum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__SUM, newSum, newSum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicNumber getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(AtomicNumber newVal, NotificationChain msgs)
  {
    AtomicNumber oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__VAL, oldVal, newVal);
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
  public void setVal(AtomicNumber newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.RULE__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.RULE__VAL, newVal, newVal));
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
      case RPGPackage.RULE__VALUE:
        return basicSetValue(null, msgs);
      case RPGPackage.RULE__SUM:
        return basicSetSum(null, msgs);
      case RPGPackage.RULE__VAL:
        return basicSetVal(null, msgs);
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
      case RPGPackage.RULE__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case RPGPackage.RULE__COMP:
        return getComp();
      case RPGPackage.RULE__VALUE:
        return getValue();
      case RPGPackage.RULE__ATTRIBUTE2:
        if (resolve) return getAttribute2();
        return basicGetAttribute2();
      case RPGPackage.RULE__SUM:
        return getSum();
      case RPGPackage.RULE__VAL:
        return getVal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPGPackage.RULE__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case RPGPackage.RULE__COMP:
        setComp((String)newValue);
        return;
      case RPGPackage.RULE__VALUE:
        setValue((AtomicNumber)newValue);
        return;
      case RPGPackage.RULE__ATTRIBUTE2:
        setAttribute2((Attribute)newValue);
        return;
      case RPGPackage.RULE__SUM:
        setSum((Sum)newValue);
        return;
      case RPGPackage.RULE__VAL:
        setVal((AtomicNumber)newValue);
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
      case RPGPackage.RULE__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case RPGPackage.RULE__COMP:
        setComp(COMP_EDEFAULT);
        return;
      case RPGPackage.RULE__VALUE:
        setValue((AtomicNumber)null);
        return;
      case RPGPackage.RULE__ATTRIBUTE2:
        setAttribute2((Attribute)null);
        return;
      case RPGPackage.RULE__SUM:
        setSum((Sum)null);
        return;
      case RPGPackage.RULE__VAL:
        setVal((AtomicNumber)null);
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
      case RPGPackage.RULE__ATTRIBUTE:
        return attribute != null;
      case RPGPackage.RULE__COMP:
        return COMP_EDEFAULT == null ? comp != null : !COMP_EDEFAULT.equals(comp);
      case RPGPackage.RULE__VALUE:
        return value != null;
      case RPGPackage.RULE__ATTRIBUTE2:
        return attribute2 != null;
      case RPGPackage.RULE__SUM:
        return sum != null;
      case RPGPackage.RULE__VAL:
        return val != null;
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
    result.append(" (comp: ");
    result.append(comp);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
