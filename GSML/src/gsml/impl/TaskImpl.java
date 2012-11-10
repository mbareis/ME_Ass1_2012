/**
 */
package gsml.impl;

import gsml.GsmlPackage;
import gsml.MinRequirementType;
import gsml.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link gsml.impl.TaskImpl#getMinRequirement <em>Min Requirement</em>}</li>
 *   <li>{@link gsml.impl.TaskImpl#getMinRequirementType <em>Min Requirement Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRequirement() <em>Min Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_REQUIREMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinRequirement() <em>Min Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequirement()
	 * @generated
	 * @ordered
	 */
	protected double minRequirement = MIN_REQUIREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRequirementType() <em>Min Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequirementType()
	 * @generated
	 * @ordered
	 */
	protected static final MinRequirementType MIN_REQUIREMENT_TYPE_EDEFAULT = MinRequirementType.ABSOLUTE;

	/**
	 * The cached value of the '{@link #getMinRequirementType() <em>Min Requirement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRequirementType()
	 * @generated
	 * @ordered
	 */
	protected MinRequirementType minRequirementType = MIN_REQUIREMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsmlPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinRequirement() {
		return minRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequirement(double newMinRequirement) {
		double oldMinRequirement = minRequirement;
		minRequirement = newMinRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.TASK__MIN_REQUIREMENT, oldMinRequirement, minRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinRequirementType getMinRequirementType() {
		return minRequirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequirementType(MinRequirementType newMinRequirementType) {
		MinRequirementType oldMinRequirementType = minRequirementType;
		minRequirementType = newMinRequirementType == null ? MIN_REQUIREMENT_TYPE_EDEFAULT : newMinRequirementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.TASK__MIN_REQUIREMENT_TYPE, oldMinRequirementType, minRequirementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GsmlPackage.TASK__NAME:
				return getName();
			case GsmlPackage.TASK__MIN_REQUIREMENT:
				return getMinRequirement();
			case GsmlPackage.TASK__MIN_REQUIREMENT_TYPE:
				return getMinRequirementType();
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
			case GsmlPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case GsmlPackage.TASK__MIN_REQUIREMENT:
				setMinRequirement((Double)newValue);
				return;
			case GsmlPackage.TASK__MIN_REQUIREMENT_TYPE:
				setMinRequirementType((MinRequirementType)newValue);
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
			case GsmlPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GsmlPackage.TASK__MIN_REQUIREMENT:
				setMinRequirement(MIN_REQUIREMENT_EDEFAULT);
				return;
			case GsmlPackage.TASK__MIN_REQUIREMENT_TYPE:
				setMinRequirementType(MIN_REQUIREMENT_TYPE_EDEFAULT);
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
			case GsmlPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GsmlPackage.TASK__MIN_REQUIREMENT:
				return minRequirement != MIN_REQUIREMENT_EDEFAULT;
			case GsmlPackage.TASK__MIN_REQUIREMENT_TYPE:
				return minRequirementType != MIN_REQUIREMENT_TYPE_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", MinRequirement: ");
		result.append(minRequirement);
		result.append(", MinRequirementType: ");
		result.append(minRequirementType);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
