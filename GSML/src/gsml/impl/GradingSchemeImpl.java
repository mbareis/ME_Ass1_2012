/**
 */
package gsml.impl;

import gsml.Grade;
import gsml.GradingScheme;
import gsml.GsmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grading Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml.impl.GradingSchemeImpl#getGrades <em>Grades</em>}</li>
 *   <li>{@link gsml.impl.GradingSchemeImpl#getFallback <em>Fallback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradingSchemeImpl extends EObjectImpl implements GradingScheme {
	/**
	 * The cached value of the '{@link #getGrades() <em>Grades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrades()
	 * @generated
	 * @ordered
	 */
	protected EList<Grade> grades;

	/**
	 * The cached value of the '{@link #getFallback() <em>Fallback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallback()
	 * @generated
	 * @ordered
	 */
	protected Grade fallback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingSchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsmlPackage.Literals.GRADING_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grade> getGrades() {
		if (grades == null) {
			grades = new EObjectContainmentEList<Grade>(Grade.class, this, GsmlPackage.GRADING_SCHEME__GRADES);
		}
		return grades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade getFallback() {
		return fallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFallback(Grade newFallback, NotificationChain msgs) {
		Grade oldFallback = fallback;
		fallback = newFallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GsmlPackage.GRADING_SCHEME__FALLBACK, oldFallback, newFallback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFallback(Grade newFallback) {
		if (newFallback != fallback) {
			NotificationChain msgs = null;
			if (fallback != null)
				msgs = ((InternalEObject)fallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GsmlPackage.GRADING_SCHEME__FALLBACK, null, msgs);
			if (newFallback != null)
				msgs = ((InternalEObject)newFallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GsmlPackage.GRADING_SCHEME__FALLBACK, null, msgs);
			msgs = basicSetFallback(newFallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.GRADING_SCHEME__FALLBACK, newFallback, newFallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsmlPackage.GRADING_SCHEME__GRADES:
				return ((InternalEList<?>)getGrades()).basicRemove(otherEnd, msgs);
			case GsmlPackage.GRADING_SCHEME__FALLBACK:
				return basicSetFallback(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GsmlPackage.GRADING_SCHEME__GRADES:
				return getGrades();
			case GsmlPackage.GRADING_SCHEME__FALLBACK:
				return getFallback();
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
			case GsmlPackage.GRADING_SCHEME__GRADES:
				getGrades().clear();
				getGrades().addAll((Collection<? extends Grade>)newValue);
				return;
			case GsmlPackage.GRADING_SCHEME__FALLBACK:
				setFallback((Grade)newValue);
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
			case GsmlPackage.GRADING_SCHEME__GRADES:
				getGrades().clear();
				return;
			case GsmlPackage.GRADING_SCHEME__FALLBACK:
				setFallback((Grade)null);
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
			case GsmlPackage.GRADING_SCHEME__GRADES:
				return grades != null && !grades.isEmpty();
			case GsmlPackage.GRADING_SCHEME__FALLBACK:
				return fallback != null;
		}
		return super.eIsSet(featureID);
	}

} //GradingSchemeImpl
