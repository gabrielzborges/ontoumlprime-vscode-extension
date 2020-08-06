/**
 * generated by Xtext 2.20.0
 */
package br.ufes.inf.ontouml.ontoumlprime.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Material Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getSource <em>Source</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getTargetLowerBound <em>Target Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getTargetUpperBound <em>Target Upper Bound</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation()
 * @model
 * @generated
 */
public interface BinaryMaterialRelation extends PackageableElement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(ExternallyDependentUniversal)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_Source()
   * @model
   * @generated
   */
  ExternallyDependentUniversal getSource();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ExternallyDependentUniversal value);

  /**
   * Returns the value of the '<em><b>Source Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Lower Bound</em>' attribute.
   * @see #setSourceLowerBound(int)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_SourceLowerBound()
   * @model
   * @generated
   */
  int getSourceLowerBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getSourceLowerBound <em>Source Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Lower Bound</em>' attribute.
   * @see #getSourceLowerBound()
   * @generated
   */
  void setSourceLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Source Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Upper Bound</em>' attribute.
   * @see #setSourceUpperBound(int)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_SourceUpperBound()
   * @model
   * @generated
   */
  int getSourceUpperBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getSourceUpperBound <em>Source Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Upper Bound</em>' attribute.
   * @see #getSourceUpperBound()
   * @generated
   */
  void setSourceUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Derived From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Derived From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derived From</em>' reference.
   * @see #setDerivedFrom(RelatorUniversal)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_DerivedFrom()
   * @model
   * @generated
   */
  RelatorUniversal getDerivedFrom();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getDerivedFrom <em>Derived From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derived From</em>' reference.
   * @see #getDerivedFrom()
   * @generated
   */
  void setDerivedFrom(RelatorUniversal value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ExternallyDependentUniversal)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_Target()
   * @model
   * @generated
   */
  ExternallyDependentUniversal getTarget();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ExternallyDependentUniversal value);

  /**
   * Returns the value of the '<em><b>Target Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Lower Bound</em>' attribute.
   * @see #setTargetLowerBound(int)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_TargetLowerBound()
   * @model
   * @generated
   */
  int getTargetLowerBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getTargetLowerBound <em>Target Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Lower Bound</em>' attribute.
   * @see #getTargetLowerBound()
   * @generated
   */
  void setTargetLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Target Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Upper Bound</em>' attribute.
   * @see #setTargetUpperBound(int)
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getBinaryMaterialRelation_TargetUpperBound()
   * @model
   * @generated
   */
  int getTargetUpperBound();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.BinaryMaterialRelation#getTargetUpperBound <em>Target Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Upper Bound</em>' attribute.
   * @see #getTargetUpperBound()
   * @generated
   */
  void setTargetUpperBound(int value);

} // BinaryMaterialRelation
