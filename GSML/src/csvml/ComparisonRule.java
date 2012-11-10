/**
 */
package csvml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml.ComparisonRule#getComparisonfield <em>Comparisonfield</em>}</li>
 *   <li>{@link csvml.ComparisonRule#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link csvml.ComparisonRule#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml.CsvmlPackage#getComparisonRule()
 * @model
 * @generated
 */
public interface ComparisonRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Comparisonfield</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparisonfield</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparisonfield</em>' reference.
	 * @see #setComparisonfield(FieldDefinition)
	 * @see csvml.CsvmlPackage#getComparisonRule_Comparisonfield()
	 * @model required="true"
	 * @generated
	 */
	FieldDefinition getComparisonfield();

	/**
	 * Sets the value of the '{@link csvml.ComparisonRule#getComparisonfield <em>Comparisonfield</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparisonfield</em>' reference.
	 * @see #getComparisonfield()
	 * @generated
	 */
	void setComparisonfield(FieldDefinition value);

	/**
	 * Returns the value of the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Value</em>' attribute.
	 * @see #setComparisonValue(String)
	 * @see csvml.CsvmlPackage#getComparisonRule_ComparisonValue()
	 * @model
	 * @generated
	 */
	String getComparisonValue();

	/**
	 * Sets the value of the '{@link csvml.ComparisonRule#getComparisonValue <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' attribute.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link csvml.CompOperatorTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see csvml.CompOperatorTypes
	 * @see #setOperator(CompOperatorTypes)
	 * @see csvml.CsvmlPackage#getComparisonRule_Operator()
	 * @model
	 * @generated
	 */
	CompOperatorTypes getOperator();

	/**
	 * Sets the value of the '{@link csvml.ComparisonRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see csvml.CompOperatorTypes
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CompOperatorTypes value);

} // ComparisonRule
