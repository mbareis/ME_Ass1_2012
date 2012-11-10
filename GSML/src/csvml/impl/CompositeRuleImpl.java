/**
 */
package csvml.impl;

import csvml.CompositeRule;
import csvml.CsvmlPackage;
import csvml.LogicalOperatorTypes;
import csvml.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csvml.impl.CompositeRuleImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link csvml.impl.CompositeRuleImpl#getComposedrules <em>Composedrules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeRuleImpl extends RuleImpl implements CompositeRule {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperatorTypes OPERATOR_EDEFAULT = LogicalOperatorTypes.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperatorTypes operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposedrules() <em>Composedrules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedrules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> composedrules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsvmlPackage.Literals.COMPOSITE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorTypes getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(LogicalOperatorTypes newOperator) {
		LogicalOperatorTypes oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvmlPackage.COMPOSITE_RULE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getComposedrules() {
		if (composedrules == null) {
			composedrules = new EObjectResolvingEList<Rule>(Rule.class, this, CsvmlPackage.COMPOSITE_RULE__COMPOSEDRULES);
		}
		return composedrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsvmlPackage.COMPOSITE_RULE__OPERATOR:
				return getOperator();
			case CsvmlPackage.COMPOSITE_RULE__COMPOSEDRULES:
				return getComposedrules();
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
			case CsvmlPackage.COMPOSITE_RULE__OPERATOR:
				setOperator((LogicalOperatorTypes)newValue);
				return;
			case CsvmlPackage.COMPOSITE_RULE__COMPOSEDRULES:
				getComposedrules().clear();
				getComposedrules().addAll((Collection<? extends Rule>)newValue);
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
			case CsvmlPackage.COMPOSITE_RULE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CsvmlPackage.COMPOSITE_RULE__COMPOSEDRULES:
				getComposedrules().clear();
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
			case CsvmlPackage.COMPOSITE_RULE__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case CsvmlPackage.COMPOSITE_RULE__COMPOSEDRULES:
				return composedrules != null && !composedrules.isEmpty();
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
		result.append(" (Operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CompositeRuleImpl
