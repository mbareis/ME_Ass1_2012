/**
 */
package csvml.impl;

import csvml.CompOperatorTypes;
import csvml.ComparisonRule;
import csvml.CsvmlPackage;
import csvml.FieldDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csvml.impl.ComparisonRuleImpl#getComparisonfield <em>Comparisonfield</em>}</li>
 *   <li>{@link csvml.impl.ComparisonRuleImpl#getComparisonValue <em>Comparison Value</em>}</li>
 *   <li>{@link csvml.impl.ComparisonRuleImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonRuleImpl extends RuleImpl implements ComparisonRule {
	/**
	 * The cached value of the '{@link #getComparisonfield() <em>Comparisonfield</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonfield()
	 * @generated
	 * @ordered
	 */
	protected FieldDefinition comparisonfield;

	/**
	 * The default value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARISON_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparisonValue() <em>Comparison Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonValue()
	 * @generated
	 * @ordered
	 */
	protected String comparisonValue = COMPARISON_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final CompOperatorTypes OPERATOR_EDEFAULT = CompOperatorTypes.GREATER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected CompOperatorTypes operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsvmlPackage.Literals.COMPARISON_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinition getComparisonfield() {
		if (comparisonfield != null && comparisonfield.eIsProxy()) {
			InternalEObject oldComparisonfield = (InternalEObject)comparisonfield;
			comparisonfield = (FieldDefinition)eResolveProxy(oldComparisonfield);
			if (comparisonfield != oldComparisonfield) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsvmlPackage.COMPARISON_RULE__COMPARISONFIELD, oldComparisonfield, comparisonfield));
			}
		}
		return comparisonfield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDefinition basicGetComparisonfield() {
		return comparisonfield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonfield(FieldDefinition newComparisonfield) {
		FieldDefinition oldComparisonfield = comparisonfield;
		comparisonfield = newComparisonfield;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvmlPackage.COMPARISON_RULE__COMPARISONFIELD, oldComparisonfield, comparisonfield));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparisonValue() {
		return comparisonValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonValue(String newComparisonValue) {
		String oldComparisonValue = comparisonValue;
		comparisonValue = newComparisonValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvmlPackage.COMPARISON_RULE__COMPARISON_VALUE, oldComparisonValue, comparisonValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOperatorTypes getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(CompOperatorTypes newOperator) {
		CompOperatorTypes oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvmlPackage.COMPARISON_RULE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsvmlPackage.COMPARISON_RULE__COMPARISONFIELD:
				if (resolve) return getComparisonfield();
				return basicGetComparisonfield();
			case CsvmlPackage.COMPARISON_RULE__COMPARISON_VALUE:
				return getComparisonValue();
			case CsvmlPackage.COMPARISON_RULE__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsvmlPackage.COMPARISON_RULE__COMPARISONFIELD:
				setComparisonfield((FieldDefinition)newValue);
				return;
			case CsvmlPackage.COMPARISON_RULE__COMPARISON_VALUE:
				setComparisonValue((String)newValue);
				return;
			case CsvmlPackage.COMPARISON_RULE__OPERATOR:
				setOperator((CompOperatorTypes)newValue);
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
			case CsvmlPackage.COMPARISON_RULE__COMPARISONFIELD:
				setComparisonfield((FieldDefinition)null);
				return;
			case CsvmlPackage.COMPARISON_RULE__COMPARISON_VALUE:
				setComparisonValue(COMPARISON_VALUE_EDEFAULT);
				return;
			case CsvmlPackage.COMPARISON_RULE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case CsvmlPackage.COMPARISON_RULE__COMPARISONFIELD:
				return comparisonfield != null;
			case CsvmlPackage.COMPARISON_RULE__COMPARISON_VALUE:
				return COMPARISON_VALUE_EDEFAULT == null ? comparisonValue != null : !COMPARISON_VALUE_EDEFAULT.equals(comparisonValue);
			case CsvmlPackage.COMPARISON_RULE__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (ComparisonValue: ");
		result.append(comparisonValue);
		result.append(", Operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ComparisonRuleImpl
