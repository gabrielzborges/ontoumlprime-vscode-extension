/**
 * generated by Xtext 2.20.0
 */
package br.ufes.inf.ontouml.ontoumlprime.dsl.impl;

import br.ufes.inf.ontouml.ontoumlprime.dsl.Characterization;
import br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage;
import br.ufes.inf.ontouml.ontoumlprime.dsl.Mediation;
import br.ufes.inf.ontouml.ontoumlprime.dsl.RelatorUniversal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relator Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.impl.RelatorUniversalImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.impl.RelatorUniversalImpl#getCharacterizedBy <em>Characterized By</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.impl.RelatorUniversalImpl#getMediations <em>Mediations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatorUniversalImpl extends PackageableElementImpl implements RelatorUniversal
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
   * The cached value of the '{@link #getCharacterizedBy() <em>Characterized By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacterizedBy()
   * @generated
   * @ordered
   */
  protected EList<Characterization> characterizedBy;

  /**
   * The cached value of the '{@link #getMediations() <em>Mediations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMediations()
   * @generated
   * @ordered
   */
  protected EList<Mediation> mediations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelatorUniversalImpl()
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
    return DslPackage.Literals.RELATOR_UNIVERSAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RELATOR_UNIVERSAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Characterization> getCharacterizedBy()
  {
    if (characterizedBy == null)
    {
      characterizedBy = new EObjectContainmentEList<Characterization>(Characterization.class, this, DslPackage.RELATOR_UNIVERSAL__CHARACTERIZED_BY);
    }
    return characterizedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mediation> getMediations()
  {
    if (mediations == null)
    {
      mediations = new EObjectContainmentEList<Mediation>(Mediation.class, this, DslPackage.RELATOR_UNIVERSAL__MEDIATIONS);
    }
    return mediations;
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
      case DslPackage.RELATOR_UNIVERSAL__CHARACTERIZED_BY:
        return ((InternalEList<?>)getCharacterizedBy()).basicRemove(otherEnd, msgs);
      case DslPackage.RELATOR_UNIVERSAL__MEDIATIONS:
        return ((InternalEList<?>)getMediations()).basicRemove(otherEnd, msgs);
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
      case DslPackage.RELATOR_UNIVERSAL__NAME:
        return getName();
      case DslPackage.RELATOR_UNIVERSAL__CHARACTERIZED_BY:
        return getCharacterizedBy();
      case DslPackage.RELATOR_UNIVERSAL__MEDIATIONS:
        return getMediations();
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
      case DslPackage.RELATOR_UNIVERSAL__NAME:
        setName((String)newValue);
        return;
      case DslPackage.RELATOR_UNIVERSAL__CHARACTERIZED_BY:
        getCharacterizedBy().clear();
        getCharacterizedBy().addAll((Collection<? extends Characterization>)newValue);
        return;
      case DslPackage.RELATOR_UNIVERSAL__MEDIATIONS:
        getMediations().clear();
        getMediations().addAll((Collection<? extends Mediation>)newValue);
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
      case DslPackage.RELATOR_UNIVERSAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.RELATOR_UNIVERSAL__CHARACTERIZED_BY:
        getCharacterizedBy().clear();
        return;
      case DslPackage.RELATOR_UNIVERSAL__MEDIATIONS:
        getMediations().clear();
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
      case DslPackage.RELATOR_UNIVERSAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.RELATOR_UNIVERSAL__CHARACTERIZED_BY:
        return characterizedBy != null && !characterizedBy.isEmpty();
      case DslPackage.RELATOR_UNIVERSAL__MEDIATIONS:
        return mediations != null && !mediations.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RelatorUniversalImpl