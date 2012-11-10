/**
 */
package gsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml.Grading#getSemester <em>Semester</em>}</li>
 *   <li>{@link gsml.Grading#getGradingscheme <em>Gradingscheme</em>}</li>
 *   <li>{@link gsml.Grading#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml.GsmlPackage#getGrading()
 * @model
 * @generated
 */
public interface Grading extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see #setSemester(String)
	 * @see gsml.GsmlPackage#getGrading_Semester()
	 * @model
	 * @generated
	 */
	String getSemester();

	/**
	 * Sets the value of the '{@link gsml.Grading#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(String value);

	/**
	 * Returns the value of the '<em><b>Gradingscheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradingscheme</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradingscheme</em>' reference.
	 * @see #setGradingscheme(GradingScheme)
	 * @see gsml.GsmlPackage#getGrading_Gradingscheme()
	 * @model required="true"
	 * @generated
	 */
	GradingScheme getGradingscheme();

	/**
	 * Sets the value of the '{@link gsml.Grading#getGradingscheme <em>Gradingscheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradingscheme</em>' reference.
	 * @see #getGradingscheme()
	 * @generated
	 */
	void setGradingscheme(GradingScheme value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link gsml.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see gsml.GsmlPackage#getGrading_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Grading
