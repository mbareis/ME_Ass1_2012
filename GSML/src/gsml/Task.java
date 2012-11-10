/**
 */
package gsml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml.Task#getName <em>Name</em>}</li>
 *   <li>{@link gsml.Task#getMinRequirement <em>Min Requirement</em>}</li>
 *   <li>{@link gsml.Task#getMinRequirementType <em>Min Requirement Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml.GsmlPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
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
	 * @see gsml.GsmlPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gsml.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Requirement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Requirement</em>' attribute.
	 * @see #setMinRequirement(double)
	 * @see gsml.GsmlPackage#getTask_MinRequirement()
	 * @model
	 * @generated
	 */
	double getMinRequirement();

	/**
	 * Sets the value of the '{@link gsml.Task#getMinRequirement <em>Min Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Requirement</em>' attribute.
	 * @see #getMinRequirement()
	 * @generated
	 */
	void setMinRequirement(double value);

	/**
	 * Returns the value of the '<em><b>Min Requirement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gsml.MinRequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Requirement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Requirement Type</em>' attribute.
	 * @see gsml.MinRequirementType
	 * @see #setMinRequirementType(MinRequirementType)
	 * @see gsml.GsmlPackage#getTask_MinRequirementType()
	 * @model
	 * @generated
	 */
	MinRequirementType getMinRequirementType();

	/**
	 * Sets the value of the '{@link gsml.Task#getMinRequirementType <em>Min Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Requirement Type</em>' attribute.
	 * @see gsml.MinRequirementType
	 * @see #getMinRequirementType()
	 * @generated
	 */
	void setMinRequirementType(MinRequirementType value);

} // Task
