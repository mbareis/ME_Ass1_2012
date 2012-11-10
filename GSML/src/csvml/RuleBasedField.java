/**
 */
package csvml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Based Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml.RuleBasedField#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml.CsvmlPackage#getRuleBasedField()
 * @model
 * @generated
 */
public interface RuleBasedField extends FieldDefinition {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference list.
	 * The list contents are of type {@link csvml.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference list.
	 * @see csvml.CsvmlPackage#getRuleBasedField_Rules()
	 * @model
	 * @generated
	 */
	EList<Rule> getRules();

} // RuleBasedField
