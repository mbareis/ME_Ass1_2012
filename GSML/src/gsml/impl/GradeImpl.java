/**
 */
package gsml.impl;

import gsml.Grade;
import gsml.GsmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml.impl.GradeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gsml.impl.GradeImpl#getRequiredPoints <em>Required Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeImpl extends EObjectImpl implements Grade {
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
	 * The default value of the '{@link #getRequiredPoints() <em>Required Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPoints()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUIRED_POINTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRequiredPoints() <em>Required Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPoints()
	 * @generated
	 * @ordered
	 */
	protected double requiredPoints = REQUIRED_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsmlPackage.Literals.GRADE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.GRADE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRequiredPoints() {
		return requiredPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPoints(double newRequiredPoints) {
		double oldRequiredPoints = requiredPoints;
		requiredPoints = newRequiredPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.GRADE__REQUIRED_POINTS, oldRequiredPoints, requiredPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GsmlPackage.GRADE__NAME:
				return getName();
			case GsmlPackage.GRADE__REQUIRED_POINTS:
				return getRequiredPoints();
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
			case GsmlPackage.GRADE__NAME:
				setName((String)newValue);
				return;
			case GsmlPackage.GRADE__REQUIRED_POINTS:
				setRequiredPoints((Double)newValue);
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
			case GsmlPackage.GRADE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GsmlPackage.GRADE__REQUIRED_POINTS:
				setRequiredPoints(REQUIRED_POINTS_EDEFAULT);
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
			case GsmlPackage.GRADE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GsmlPackage.GRADE__REQUIRED_POINTS:
				return requiredPoints != REQUIRED_POINTS_EDEFAULT;
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
		result.append(", RequiredPoints: ");
		result.append(requiredPoints);
		result.append(')');
		return result.toString();
	}

} //GradeImpl
