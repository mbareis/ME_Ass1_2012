/**
 */
package gsml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grading System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml.GradingSystem#getCourses <em>Courses</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml.GsmlPackage#getGradingSystem()
 * @model
 * @generated
 */
public interface GradingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link gsml.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see gsml.GsmlPackage#getGradingSystem_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // GradingSystem
