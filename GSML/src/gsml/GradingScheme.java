/**
 */
package gsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml.GradingScheme#getGrades <em>Grades</em>}</li>
 *   <li>{@link gsml.GradingScheme#getFallback <em>Fallback</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml.GsmlPackage#getGradingScheme()
 * @model
 * @generated
 */
public interface GradingScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Grades</b></em>' containment reference list.
	 * The list contents are of type {@link gsml.Grade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grades</em>' containment reference list.
	 * @see gsml.GsmlPackage#getGradingScheme_Grades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grade> getGrades();

	/**
	 * Returns the value of the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fallback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback</em>' containment reference.
	 * @see #setFallback(Grade)
	 * @see gsml.GsmlPackage#getGradingScheme_Fallback()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Grade getFallback();

	/**
	 * Sets the value of the '{@link gsml.GradingScheme#getFallback <em>Fallback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallback</em>' containment reference.
	 * @see #getFallback()
	 * @generated
	 */
	void setFallback(Grade value);

} // GradingScheme
