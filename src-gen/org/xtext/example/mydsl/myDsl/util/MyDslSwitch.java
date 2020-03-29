/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.AltAttribute;
import org.xtext.example.mydsl.myDsl.AtomicNumber;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.AttributeValues;
import org.xtext.example.mydsl.myDsl.Attributes;
import org.xtext.example.mydsl.myDsl.BattleSize;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.Div;
import org.xtext.example.mydsl.myDsl.EType;
import org.xtext.example.mydsl.myDsl.Entities;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.EntityMoves;
import org.xtext.example.mydsl.myDsl.Loc;
import org.xtext.example.mydsl.myDsl.Locations;
import org.xtext.example.mydsl.myDsl.Members;
import org.xtext.example.mydsl.myDsl.Move;
import org.xtext.example.mydsl.myDsl.Moves;
import org.xtext.example.mydsl.myDsl.Mult;
import org.xtext.example.mydsl.myDsl.Multiply;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NumberComparing;
import org.xtext.example.mydsl.myDsl.Proposition;
import org.xtext.example.mydsl.myDsl.Relations;
import org.xtext.example.mydsl.myDsl.Require;
import org.xtext.example.mydsl.myDsl.Rule;
import org.xtext.example.mydsl.myDsl.Sub;
import org.xtext.example.mydsl.myDsl.Sum;
import org.xtext.example.mydsl.myDsl.Team;
import org.xtext.example.mydsl.myDsl.Teams;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.TypeExpression;
import org.xtext.example.mydsl.myDsl.and;
import org.xtext.example.mydsl.myDsl.or;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.SYSTEM:
      {
        org.xtext.example.mydsl.myDsl.System system = (org.xtext.example.mydsl.myDsl.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOCATIONS:
      {
        Locations locations = (Locations)theEObject;
        T result = caseLocations(locations);
        if (result == null) result = caseDeclaration(locations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOC:
      {
        Loc loc = (Loc)theEObject;
        T result = caseLoc(loc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RELATIONS:
      {
        Relations relations = (Relations)theEObject;
        T result = caseRelations(relations);
        if (result == null) result = caseDeclaration(relations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_EXPRESSION:
      {
        TypeExpression typeExpression = (TypeExpression)theEObject;
        T result = caseTypeExpression(typeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MOVES:
      {
        Moves moves = (Moves)theEObject;
        T result = caseMoves(moves);
        if (result == null) result = caseDeclaration(moves);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MOVE:
      {
        Move move = (Move)theEObject;
        T result = caseMove(move);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ETYPE:
      {
        EType eType = (EType)theEObject;
        T result = caseEType(eType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATTRIBUTES:
      {
        Attributes attributes = (Attributes)theEObject;
        T result = caseAttributes(attributes);
        if (result == null) result = caseDeclaration(attributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATTRIBUTE_VALUES:
      {
        AttributeValues attributeValues = (AttributeValues)theEObject;
        T result = caseAttributeValues(attributeValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ALT_ATTRIBUTE:
      {
        AltAttribute altAttribute = (AltAttribute)theEObject;
        T result = caseAltAttribute(altAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ENTITIES:
      {
        Entities entities = (Entities)theEObject;
        T result = caseEntities(entities);
        if (result == null) result = caseDeclaration(entities);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ENTITY_MOVES:
      {
        EntityMoves entityMoves = (EntityMoves)theEObject;
        T result = caseEntityMoves(entityMoves);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TEAMS:
      {
        Teams teams = (Teams)theEObject;
        T result = caseTeams(teams);
        if (result == null) result = caseDeclaration(teams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TEAM:
      {
        Team team = (Team)theEObject;
        T result = caseTeam(team);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MEMBERS:
      {
        Members members = (Members)theEObject;
        T result = caseMembers(members);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BATTLE_SIZE:
      {
        BattleSize battleSize = (BattleSize)theEObject;
        T result = caseBattleSize(battleSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REQUIRE:
      {
        Require require = (Require)theEObject;
        T result = caseRequire(require);
        if (result == null) result = caseTeams(require);
        if (result == null) result = caseDeclaration(require);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROPOSITION:
      {
        Proposition proposition = (Proposition)theEObject;
        T result = caseProposition(proposition);
        if (result == null) result = caseRequire(proposition);
        if (result == null) result = caseTeams(proposition);
        if (result == null) result = caseDeclaration(proposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NUMBER_COMPARING:
      {
        NumberComparing numberComparing = (NumberComparing)theEObject;
        T result = caseNumberComparing(numberComparing);
        if (result == null) result = caseProposition(numberComparing);
        if (result == null) result = caseRequire(numberComparing);
        if (result == null) result = caseTeams(numberComparing);
        if (result == null) result = caseDeclaration(numberComparing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SUM:
      {
        Sum sum = (Sum)theEObject;
        T result = caseSum(sum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MULTIPLY:
      {
        Multiply multiply = (Multiply)theEObject;
        T result = caseMultiply(multiply);
        if (result == null) result = caseSum(multiply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATOMIC_NUMBER:
      {
        AtomicNumber atomicNumber = (AtomicNumber)theEObject;
        T result = caseAtomicNumber(atomicNumber);
        if (result == null) result = caseMultiply(atomicNumber);
        if (result == null) result = caseSum(atomicNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OR:
      {
        or or = (or)theEObject;
        T result = caseor(or);
        if (result == null) result = caseProposition(or);
        if (result == null) result = caseRequire(or);
        if (result == null) result = caseTeams(or);
        if (result == null) result = caseDeclaration(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.AND:
      {
        and and = (and)theEObject;
        T result = caseand(and);
        if (result == null) result = caseProposition(and);
        if (result == null) result = caseRequire(and);
        if (result == null) result = caseTeams(and);
        if (result == null) result = caseDeclaration(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ADD:
      {
        Add add = (Add)theEObject;
        T result = caseAdd(add);
        if (result == null) result = caseSum(add);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SUB:
      {
        Sub sub = (Sub)theEObject;
        T result = caseSub(sub);
        if (result == null) result = caseSum(sub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MULT:
      {
        Mult mult = (Mult)theEObject;
        T result = caseMult(mult);
        if (result == null) result = caseMultiply(mult);
        if (result == null) result = caseSum(mult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseMultiply(div);
        if (result == null) result = caseSum(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(org.xtext.example.mydsl.myDsl.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Locations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Locations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocations(Locations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoc(Loc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelations(Relations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeExpression(TypeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Moves</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Moves</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoves(Moves object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMove(Move object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EType</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EType</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEType(EType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributes(Attributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeValues(AttributeValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alt Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alt Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAltAttribute(AltAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entities</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entities</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntities(Entities object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Moves</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Moves</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityMoves(EntityMoves object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Teams</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Teams</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTeams(Teams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Team</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Team</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTeam(Team object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Members</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Members</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMembers(Members object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Battle Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Battle Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBattleSize(BattleSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Require</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Require</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequire(Require object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProposition(Proposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Comparing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Comparing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberComparing(NumberComparing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSum(Sum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiply(Multiply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicNumber(AtomicNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseor(or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>and</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>and</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseand(and object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdd(Add object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSub(Sub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMult(Mult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
