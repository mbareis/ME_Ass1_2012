/**
 */
package gsml.impl;

import gsml.Course;
import gsml.Grading;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link gsml.impl.CourseImpl#getGradings <em>Gradings</em>}</li>
 *   <li>{@link gsml.impl.CourseImpl#getGradingschemes <em>Gradingschemes</em>}</li>
 *   <li>{@link gsml.impl.CourseImpl#getGradingscheme <em>Gradingscheme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CourseImpl extends EObjectImpl implements Course {
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
	 * The cached value of the '{@link #getGradings() <em>Gradings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradings()
	 * @generated
	 * @ordered
	 */
	protected EList<Grading> gradings;

	/**
	 * The cached value of the '{@link #getGradingschemes() <em>Gradingschemes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradingschemes()
	 * @generated
	 * @ordered
	 */
	protected EList<GradingScheme> gradingschemes;

	/**
	 * The cached value of the '{@link #getGradingscheme() <em>Gradingscheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradingscheme()
	 * @generated
	 * @ordered
	 */
	protected GradingScheme gradingscheme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsmlPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grading> getGradings() {
		if (gradings == null) {
			gradings = new EObjectContainmentEList<Grading>(Grading.class, this, GsmlPackage.COURSE__GRADINGS);
		}
		return gradings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GradingScheme> getGradingschemes() {
		if (gradingschemes == null) {
			gradingschemes = new EObjectResolvingEList<GradingScheme>(GradingScheme.class, this, GsmlPackage.COURSE__GRADINGSCHEMES);
		}
		return gradingschemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingScheme getGradingscheme() {
		if (gradingscheme != null && gradingscheme.eIsProxy()) {
			InternalEObject oldGradingscheme = (InternalEObject)gradingscheme;
			gradingscheme = (GradingScheme)eResolveProxy(oldGradingscheme);
			if (gradingscheme != oldGradingscheme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GsmlPackage.COURSE__GRADINGSCHEME, oldGradingscheme, gradingscheme));
			}
		}
		return gradingscheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingScheme basicGetGradingscheme() {
		return gradingscheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradingscheme(GradingScheme newGradingscheme) {
		GradingScheme oldGradingscheme = gradingscheme;
		gradingscheme = newGradingscheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.COURSE__GRADINGSCHEME, oldGradingscheme, gradingscheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsmlPackage.COURSE__GRADINGS:
				return ((InternalEList<?>)getGradings()).basicRemove(otherEnd, msgs);
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
			case GsmlPackage.COURSE__NAME:
				return getName();
			case GsmlPackage.COURSE__GRADINGS:
				return getGradings();
			case GsmlPackage.COURSE__GRADINGSCHEMES:
				return getGradingschemes();
			case GsmlPackage.COURSE__GRADINGSCHEME:
				if (resolve) return getGradingscheme();
				return basicGetGradingscheme();
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
			case GsmlPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case GsmlPackage.COURSE__GRADINGS:
				getGradings().clear();
				getGradings().addAll((Collection<? extends Grading>)newValue);
				return;
			case GsmlPackage.COURSE__GRADINGSCHEMES:
				getGradingschemes().clear();
				getGradingschemes().addAll((Collection<? extends GradingScheme>)newValue);
				return;
			case GsmlPackage.COURSE__GRADINGSCHEME:
				setGradingscheme((GradingScheme)newValue);
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
			case GsmlPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GsmlPackage.COURSE__GRADINGS:
				getGradings().clear();
				return;
			case GsmlPackage.COURSE__GRADINGSCHEMES:
				getGradingschemes().clear();
				return;
			case GsmlPackage.COURSE__GRADINGSCHEME:
				setGradingscheme((GradingScheme)null);
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
			case GsmlPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GsmlPackage.COURSE__GRADINGS:
				return gradings != null && !gradings.isEmpty();
			case GsmlPackage.COURSE__GRADINGSCHEMES:
				return gradingschemes != null && !gradingschemes.isEmpty();
			case GsmlPackage.COURSE__GRADINGSCHEME:
				return gradingscheme != null;
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
		result.append(')');
		return result.toString();
	}

} //CourseImpl
