/**
 */
package csvml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csvml.AggregationField#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link csvml.AggregationField#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see csvml.CsvmlPackage#getAggregationField()
 * @model
 * @generated
 */
public interface AggregationField extends FieldDefinition {
	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link csvml.AggregationTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see csvml.AggregationTypes
	 * @see #setAggregationType(AggregationTypes)
	 * @see csvml.CsvmlPackage#getAggregationField_AggregationType()
	 * @model
	 * @generated
	 */
	AggregationTypes getAggregationType();

	/**
	 * Sets the value of the '{@link csvml.AggregationField#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see csvml.AggregationTypes
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationTypes value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link csvml.FieldDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see csvml.CsvmlPackage#getAggregationField_Fields()
	 * @model required="true"
	 * @generated
	 */
	EList<FieldDefinition> getFields();

} // AggregationField
