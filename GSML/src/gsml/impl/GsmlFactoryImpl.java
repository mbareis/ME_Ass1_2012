/**
 */
package gsml.impl;

import gsml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GsmlFactoryImpl extends EFactoryImpl implements GsmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GsmlFactory init() {
		try {
			GsmlFactory theGsmlFactory = (GsmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://gsml/1.0"); 
			if (theGsmlFactory != null) {
				return theGsmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GsmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GsmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GsmlPackage.COURSE: return createCourse();
			case GsmlPackage.CONCRETE_TASK: return createConcreteTask();
			case GsmlPackage.TASK_GROUP: return createTaskGroup();
			case GsmlPackage.GRADING_SCHEME: return createGradingScheme();
			case GsmlPackage.GRADE: return createGrade();
			case GsmlPackage.GRADING_SYSTEM: return createGradingSystem();
			case GsmlPackage.GRADING: return createGrading();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GsmlPackage.MIN_REQUIREMENT_TYPE:
				return createMinRequirementTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GsmlPackage.MIN_REQUIREMENT_TYPE:
				return convertMinRequirementTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteTask createConcreteTask() {
		ConcreteTaskImpl concreteTask = new ConcreteTaskImpl();
		return concreteTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGroup createTaskGroup() {
		TaskGroupImpl taskGroup = new TaskGroupImpl();
		return taskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingScheme createGradingScheme() {
		GradingSchemeImpl gradingScheme = new GradingSchemeImpl();
		return gradingScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradingSystem createGradingSystem() {
		GradingSystemImpl gradingSystem = new GradingSystemImpl();
		return gradingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grading createGrading() {
		GradingImpl grading = new GradingImpl();
		return grading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinRequirementType createMinRequirementTypeFromString(EDataType eDataType, String initialValue) {
		MinRequirementType result = MinRequirementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMinRequirementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GsmlPackage getGsmlPackage() {
		return (GsmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GsmlPackage getPackage() {
		return GsmlPackage.eINSTANCE;
	}

} //GsmlFactoryImpl
