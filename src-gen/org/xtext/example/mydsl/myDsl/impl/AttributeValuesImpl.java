/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.AtomicNumber;
import org.xtext.example.mydsl.myDsl.AttributeValues;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Require;
import org.xtext.example.mydsl.myDsl.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeValuesImpl#getLTypes <em>LTypes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeValuesImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeValuesImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AttributeValuesImpl#getRequire <em>Require</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValuesImpl extends MinimalEObjectImpl.Container implements AttributeValues
{
  /**
   * The default value of the '{@link #getLTypes() <em>LTypes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLTypes()
   * @generated
   * @ordered
   */
  protected static final String LTYPES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLTypes() <em>LTypes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLTypes()
   * @generated
   * @ordered
   */
  protected String lTypes = LTYPES_EDEFAULT;

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
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected Rule rule;

  /**
   * The cached value of the '{@link #getRequire() <em>Require</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequire()
   * @generated
   * @ordered
   */
  protected Require require;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeValuesImpl()
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
    return MyDslPackage.Literals.ATTRIBUTE_VALUES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLTypes()
  {
    return lTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLTypes(String newLTypes)
  {
    String oldLTypes = lTypes;
    lTypes = newLTypes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE_VALUES__LTYPES, oldLTypes, lTypes));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE_VALUES__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ATTRIBUTE_VALUES__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ATTRIBUTE_VALUES__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE_VALUES__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs)
  {
    Rule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE_VALUES__RULE, oldRule, newRule);
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
  public void setRule(Rule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ATTRIBUTE_VALUES__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ATTRIBUTE_VALUES__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE_VALUES__RULE, newRule, newRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Require getRequire()
  {
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequire(Require newRequire, NotificationChain msgs)
  {
    Require oldRequire = require;
    require = newRequire;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE_VALUES__REQUIRE, oldRequire, newRequire);
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
  public void setRequire(Require newRequire)
  {
    if (newRequire != require)
    {
      NotificationChain msgs = null;
      if (require != null)
        msgs = ((InternalEObject)require).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ATTRIBUTE_VALUES__REQUIRE, null, msgs);
      if (newRequire != null)
        msgs = ((InternalEObject)newRequire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ATTRIBUTE_VALUES__REQUIRE, null, msgs);
      msgs = basicSetRequire(newRequire, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATTRIBUTE_VALUES__REQUIRE, newRequire, newRequire));
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
      case MyDslPackage.ATTRIBUTE_VALUES__VALUE:
        return basicSetValue(null, msgs);
      case MyDslPackage.ATTRIBUTE_VALUES__RULE:
        return basicSetRule(null, msgs);
      case MyDslPackage.ATTRIBUTE_VALUES__REQUIRE:
        return basicSetRequire(null, msgs);
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
      case MyDslPackage.ATTRIBUTE_VALUES__LTYPES:
        return getLTypes();
      case MyDslPackage.ATTRIBUTE_VALUES__VALUE:
        return getValue();
      case MyDslPackage.ATTRIBUTE_VALUES__RULE:
        return getRule();
      case MyDslPackage.ATTRIBUTE_VALUES__REQUIRE:
        return getRequire();
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
      case MyDslPackage.ATTRIBUTE_VALUES__LTYPES:
        setLTypes((String)newValue);
        return;
      case MyDslPackage.ATTRIBUTE_VALUES__VALUE:
        setValue((AtomicNumber)newValue);
        return;
      case MyDslPackage.ATTRIBUTE_VALUES__RULE:
        setRule((Rule)newValue);
        return;
      case MyDslPackage.ATTRIBUTE_VALUES__REQUIRE:
        setRequire((Require)newValue);
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
      case MyDslPackage.ATTRIBUTE_VALUES__LTYPES:
        setLTypes(LTYPES_EDEFAULT);
        return;
      case MyDslPackage.ATTRIBUTE_VALUES__VALUE:
        setValue((AtomicNumber)null);
        return;
      case MyDslPackage.ATTRIBUTE_VALUES__RULE:
        setRule((Rule)null);
        return;
      case MyDslPackage.ATTRIBUTE_VALUES__REQUIRE:
        setRequire((Require)null);
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
      case MyDslPackage.ATTRIBUTE_VALUES__LTYPES:
        return LTYPES_EDEFAULT == null ? lTypes != null : !LTYPES_EDEFAULT.equals(lTypes);
      case MyDslPackage.ATTRIBUTE_VALUES__VALUE:
        return value != null;
      case MyDslPackage.ATTRIBUTE_VALUES__RULE:
        return rule != null;
      case MyDslPackage.ATTRIBUTE_VALUES__REQUIRE:
        return require != null;
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
    result.append(" (lTypes: ");
    result.append(lTypes);
    result.append(')');
    return result.toString();
  }

} //AttributeValuesImpl