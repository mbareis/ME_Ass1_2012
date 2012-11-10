/**
 */
package gsml.impl;

import gsml.Grading;
import gsml.GradingScheme;
import gsml.GsmlPackage;
import gsml.Task;

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
 * An implementation of the model object '<em><b>Grading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gsml.impl.GradingImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link gsml.impl.GradingImpl#getGradingscheme <em>Gradingscheme</em>}</li>
 *   <li>{@link gsml.impl.GradingImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradingImpl extends EObjectImpl implements Grading {
	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected String semester = SEMESTER_EDEFAULT;

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
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsmlPackage.Literals.GRADING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(String newSemester) {
		String oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.GRADING__SEMESTER, oldSemester, semester));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GsmlPackage.GRADING__GRADINGSCHEME, oldGradingscheme, gradingscheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GsmlPackage.GRADING__GRADINGSCHEME, oldGradingscheme, gradingscheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, GsmlPackage.GRADING__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsmlPackage.GRADING__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case GsmlPackage.GRADING__SEMESTER:
				return getSemester();
			case GsmlPackage.GRADING__GRADINGSCHEME:
				if (resolve) return getGradingscheme();
				return basicGetGradingscheme();
			case GsmlPackage.GRADING__TASKS:
				return getTasks();
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
			case GsmlPackage.GRADING__SEMESTER:
				setSemester((String)newValue);
				return;
			case GsmlPackage.GRADING__GRADINGSCHEME:
				setGradingscheme((GradingScheme)newValue);
				return;
			case GsmlPackage.GRADING__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
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
			case GsmlPackage.GRADING__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
				return;
			case GsmlPackage.GRADING__GRADINGSCHEME:
				setGradingscheme((GradingScheme)null);
				return;
			case GsmlPackage.GRADING__TASKS:
				getTasks().clear();
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
			case GsmlPackage.GRADING__SEMESTER:
				return SEMESTER_EDEFAULT == null ? semester != null : !SEMESTER_EDEFAULT.equals(semester);
			case GsmlPackage.GRADING__GRADINGSCHEME:
				return gradingscheme != null;
			case GsmlPackage.GRADING__TASKS:
				return tasks != null && !tasks.isEmpty();
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
		result.append(" (Semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //GradingImpl
