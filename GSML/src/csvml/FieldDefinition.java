/**
 */
package csvml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml.FieldDefinition#getIndex <em>Index</em>}</li>
 *   <li>{@link csvml.FieldDefinition#getName <em>Name</em>}</li>
 *   <li>{@link csvml.FieldDefinition#getFieldType <em>Field Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml.CsvmlPackage#getFieldDefinition()
 * @model abstract="true"
 * @generated
 */
public interface FieldDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see csvml.CsvmlPackage#getFieldDefinition_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link csvml.FieldDefinition#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

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
	 * @see csvml.CsvmlPackage#getFieldDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link csvml.FieldDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Field Type</b></em>' attribute.
	 * The literals are from the enumeration {@link csvml.FieldTypTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Type</em>' attribute.
	 * @see csvml.FieldTypTypes
	 * @see #setFieldType(FieldTypTypes)
	 * @see csvml.CsvmlPackage#getFieldDefinition_FieldType()
	 * @model
	 * @generated
	 */
	FieldTypTypes getFieldType();

	/**
	 * Sets the value of the '{@link csvml.FieldDefinition#getFieldType <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Type</em>' attribute.
	 * @see csvml.FieldTypTypes
	 * @see #getFieldType()
	 * @generated
	 */
	void setFieldType(FieldTypTypes value);

} // FieldDefinition
