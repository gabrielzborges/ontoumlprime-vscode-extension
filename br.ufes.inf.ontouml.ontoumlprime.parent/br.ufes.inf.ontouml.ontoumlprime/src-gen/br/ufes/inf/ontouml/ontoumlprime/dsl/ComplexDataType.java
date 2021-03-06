/**
 * generated by Xtext 2.20.0
 */
package br.ufes.inf.ontouml.ontoumlprime.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.ComplexDataType#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.ComplexDataType#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getComplexDataType()
 * @model
 * @generated
 */
public interface ComplexDataType extends PackageableElement, DataType
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
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getComplexDataType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.ComplexDataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.inf.ontouml.ontoumlprime.dsl.DataTypeAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getComplexDataType_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<DataTypeAttribute> getAttributes();

} // ComplexDataType
