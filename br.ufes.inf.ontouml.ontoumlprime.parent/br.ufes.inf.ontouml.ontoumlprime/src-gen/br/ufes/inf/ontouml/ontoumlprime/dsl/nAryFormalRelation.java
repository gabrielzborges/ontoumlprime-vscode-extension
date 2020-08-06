/**
 * generated by Xtext 2.20.0
 */
package br.ufes.inf.ontouml.ontoumlprime.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nAry Formal Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.nAryFormalRelation#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.nAryFormalRelation#getTargetRelata <em>Target Relata</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.nAryFormalRelation#getSourceLowerBound <em>Source Lower Bound</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.nAryFormalRelation#getSourceUpperBound <em>Source Upper Bound</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getnAryFormalRelation()
 * @model
 * @generated
 */
public interface nAryFormalRelation extends PackageableElement
{
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
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getnAryFormalRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.nAryFormalRelation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Relata</b></em>' reference list.
   * The list contents are of type {@link br.ufes.inf.ontouml.ontoumlprime.dsl.Universal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Relata</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Relata</em>' reference list.
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getnAryFormalRelation_TargetRelata()
   * @model
   * @generated
   */
  EList<Universal> getTargetRelata();

  /**
   * Returns the value of the '<em><b>Source Lower Bound</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Lower Bound</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Lower Bound</em>' attribute list.
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getnAryFormalRelation_SourceLowerBound()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSourceLowerBound();

  /**
   * Returns the value of the '<em><b>Source Upper Bound</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Upper Bound</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Upper Bound</em>' attribute list.
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getnAryFormalRelation_SourceUpperBound()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSourceUpperBound();

} // nAryFormalRelation