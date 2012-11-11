/**
 */
package csvml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml.CompositeRule#getOperator <em>Operator</em>}</li>
 *   <li>{@link csvml.CompositeRule#getComposedrules <em>Composedrules</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml.CsvmlPackage#getCompositeRule()
 * @model
 * @generated
 */
public interface CompositeRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link csvml.LogicalOperatorTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see csvml.LogicalOperatorTypes
	 * @see #setOperator(LogicalOperatorTypes)
	 * @see csvml.CsvmlPackage#getCompositeRule_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperatorTypes getOperator();

	/**
	 * Sets the value of the '{@link csvml.CompositeRule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see csvml.LogicalOperatorTypes
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperatorTypes value);

	/**
	 * Returns the value of the '<em><b>Composedrules</b></em>' containment reference list.
	 * The list contents are of type {@link csvml.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composedrules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composedrules</em>' containment reference list.
	 * @see csvml.CsvmlPackage#getCompositeRule_Composedrules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getComposedrules();

} // CompositeRule
