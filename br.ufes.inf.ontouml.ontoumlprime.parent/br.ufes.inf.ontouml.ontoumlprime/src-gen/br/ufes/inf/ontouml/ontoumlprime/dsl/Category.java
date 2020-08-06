/**
 * generated by Xtext 2.20.0
 */
package br.ufes.inf.ontouml.ontoumlprime.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.ontouml.ontoumlprime.dsl.Category#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends PackageableElement, Universal
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
   * @see br.ufes.inf.ontouml.ontoumlprime.dsl.DslPackage#getCategory_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.inf.ontouml.ontoumlprime.dsl.Category#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Category