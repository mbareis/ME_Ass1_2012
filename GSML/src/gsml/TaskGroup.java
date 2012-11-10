/**
 */
package gsml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gsml.TaskGroup#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see gsml.GsmlPackage#getTaskGroup()
 * @model
 * @generated
 */
public interface TaskGroup extends Task {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link gsml.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see gsml.GsmlPackage#getTaskGroup_Contains()
	 * @model
	 * @generated
	 */
	EList<Task> getContains();

} // TaskGroup
