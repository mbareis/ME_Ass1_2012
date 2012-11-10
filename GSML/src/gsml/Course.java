/**
 */
package gsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml.Course#getName <em>Name</em>}</li>
 *   <li>{@link gsml.Course#getGradings <em>Gradings</em>}</li>
 *   <li>{@link gsml.Course#getGradingschemes <em>Gradingschemes</em>}</li>
 *   <li>{@link gsml.Course#getGradingscheme <em>Gradingscheme</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml.GsmlPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
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
	 * @see gsml.GsmlPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gsml.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gradings</b></em>' containment reference list.
	 * The list contents are of type {@link gsml.Grading}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradings</em>' containment reference list.
	 * @see gsml.GsmlPackage#getCourse_Gradings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grading> getGradings();

	/**
	 * Returns the value of the '<em><b>Gradingschemes</b></em>' reference list.
	 * The list contents are of type {@link gsml.GradingScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradingschemes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradingschemes</em>' reference list.
	 * @see gsml.GsmlPackage#getCourse_Gradingschemes()
	 * @model
	 * @generated
	 */
	EList<GradingScheme> getGradingschemes();

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
	 * @see gsml.GsmlPackage#getCourse_Gradingscheme()
	 * @model required="true"
	 * @generated
	 */
	GradingScheme getGradingscheme();

	/**
	 * Sets the value of the '{@link gsml.Course#getGradingscheme <em>Gradingscheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradingscheme</em>' reference.
	 * @see #getGradingscheme()
	 * @generated
	 */
	void setGradingscheme(GradingScheme value);

} // Course
