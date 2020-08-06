/**
 * generated by Xtext 2.20.0
 */
package br.ufes.inf.ontouml.ontoumlprime.dsl.impl;

import br.ufes.inf.ontouml.ontoumlprime.dsl.Characterization;
import br.ufes.inf.ontouml.ontoumlprime.dsl.DataType;
import br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage;
import br.ufes.inf.ontouml.ontoumlprime.dsl.QualityUniversal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Universal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.impl.QualityUniversalImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.impl.QualityUniversalImpl#getCharacterization <em>Characterization</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.impl.QualityUniversalImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.impl.QualityUniversalImpl#getCharacterizedBy <em>Characterized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityUniversalImpl extends PackageableElementImpl implements QualityUniversal
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
   * The cached value of the '{@link #getCharacterization() <em>Characterization</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacterization()
   * @generated
   * @ordered
   */
  protected Characterization characterization;

  /**
   * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatypes()
   * @generated
   * @ordered
   */
  protected EList<DataType> datatypes;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualityUniversalImpl()
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
    return DslPackage.Literals.QUALITY_UNIVERSAL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.QUALITY_UNIVERSAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characterization getCharacterization()
  {
    if (characterization != null && characterization.eIsProxy())
    {
      InternalEObject oldCharacterization = (InternalEObject)characterization;
      characterization = (Characterization)eResolveProxy(oldCharacterization);
      if (characterization != oldCharacterization)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.QUALITY_UNIVERSAL__CHARACTERIZATION, oldCharacterization, characterization));
      }
    }
    return characterization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Characterization basicGetCharacterization()
  {
    return characterization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharacterization(Characterization newCharacterization)
  {
    Characterization oldCharacterization = characterization;
    characterization = newCharacterization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.QUALITY_UNIVERSAL__CHARACTERIZATION, oldCharacterization, characterization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataType> getDatatypes()
  {
    if (datatypes == null)
    {
      datatypes = new EObjectResolvingEList<DataType>(DataType.class, this, DslPackage.QUALITY_UNIVERSAL__DATATYPES);
    }
    return datatypes;
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
      characterizedBy = new EObjectContainmentEList<Characterization>(Characterization.class, this, DslPackage.QUALITY_UNIVERSAL__CHARACTERIZED_BY);
    }
    return characterizedBy;
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
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZED_BY:
        return ((InternalEList<?>)getCharacterizedBy()).basicRemove(otherEnd, msgs);
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
      case DslPackage.QUALITY_UNIVERSAL__NAME:
        return getName();
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZATION:
        if (resolve) return getCharacterization();
        return basicGetCharacterization();
      case DslPackage.QUALITY_UNIVERSAL__DATATYPES:
        return getDatatypes();
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZED_BY:
        return getCharacterizedBy();
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
      case DslPackage.QUALITY_UNIVERSAL__NAME:
        setName((String)newValue);
        return;
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZATION:
        setCharacterization((Characterization)newValue);
        return;
      case DslPackage.QUALITY_UNIVERSAL__DATATYPES:
        getDatatypes().clear();
        getDatatypes().addAll((Collection<? extends DataType>)newValue);
        return;
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZED_BY:
        getCharacterizedBy().clear();
        getCharacterizedBy().addAll((Collection<? extends Characterization>)newValue);
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
      case DslPackage.QUALITY_UNIVERSAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZATION:
        setCharacterization((Characterization)null);
        return;
      case DslPackage.QUALITY_UNIVERSAL__DATATYPES:
        getDatatypes().clear();
        return;
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZED_BY:
        getCharacterizedBy().clear();
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
      case DslPackage.QUALITY_UNIVERSAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZATION:
        return characterization != null;
      case DslPackage.QUALITY_UNIVERSAL__DATATYPES:
        return datatypes != null && !datatypes.isEmpty();
      case DslPackage.QUALITY_UNIVERSAL__CHARACTERIZED_BY:
        return characterizedBy != null && !characterizedBy.isEmpty();
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

} //QualityUniversalImpl