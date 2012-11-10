/**
 */
package csvml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Definition Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml.FileDefinitionSet#getFiledefinitions <em>Filedefinitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml.CsvmlPackage#getFileDefinitionSet()
 * @model
 * @generated
 */
public interface FileDefinitionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Filedefinitions</b></em>' containment reference list.
	 * The list contents are of type {@link csvml.FileDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filedefinitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filedefinitions</em>' containment reference list.
	 * @see csvml.CsvmlPackage#getFileDefinitionSet_Filedefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileDefinition> getFiledefinitions();

} // FileDefinitionSet
