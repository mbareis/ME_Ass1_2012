/**
 */
package csvml.impl;

import csvml.AggregationField;
import csvml.AggregationTypes;
import csvml.CsvmlPackage;
import csvml.FieldDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csvml.impl.AggregationFieldImpl#getAggregationType <em>Aggregation Type</em>}</li>
 *   <li>{@link csvml.impl.AggregationFieldImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationFieldImpl extends FieldDefinitionImpl implements AggregationField {
	/**
	 * The default value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationTypes AGGREGATION_TYPE_EDEFAULT = AggregationTypes.SUM;

	/**
	 * The cached value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected AggregationTypes aggregationType = AGGREGATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDefinition> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsvmlPackage.Literals.AGGREGATION_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTypes getAggregationType() {
		return aggregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationType(AggregationTypes newAggregationType) {
		AggregationTypes oldAggregationType = aggregationType;
		aggregationType = newAggregationType == null ? AGGREGATION_TYPE_EDEFAULT : newAggregationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvmlPackage.AGGREGATION_FIELD__AGGREGATION_TYPE, oldAggregationType, aggregationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDefinition> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<FieldDefinition>(FieldDefinition.class, this, CsvmlPackage.AGGREGATION_FIELD__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsvmlPackage.AGGREGATION_FIELD__AGGREGATION_TYPE:
				return getAggregationType();
			case CsvmlPackage.AGGREGATION_FIELD__FIELDS:
				return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsvmlPackage.AGGREGATION_FIELD__AGGREGATION_TYPE:
				setAggregationType((AggregationTypes)newValue);
				return;
			case CsvmlPackage.AGGREGATION_FIELD__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends FieldDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsvmlPackage.AGGREGATION_FIELD__AGGREGATION_TYPE:
				setAggregationType(AGGREGATION_TYPE_EDEFAULT);
				return;
			case CsvmlPackage.AGGREGATION_FIELD__FIELDS:
				getFields().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsvmlPackage.AGGREGATION_FIELD__AGGREGATION_TYPE:
				return aggregationType != AGGREGATION_TYPE_EDEFAULT;
			case CsvmlPackage.AGGREGATION_FIELD__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AggregationType: ");
		result.append(aggregationType);
		result.append(')');
		return result.toString();
	}

} //AggregationFieldImpl
