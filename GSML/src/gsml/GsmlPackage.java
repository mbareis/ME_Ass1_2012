/**
 */
package gsml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gsml.GsmlFactory
 * @model kind="package"
 * @generated
 */
public interface GsmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gsml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GsmlPackage eINSTANCE = gsml.impl.GsmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link gsml.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.CourseImpl
	 * @see gsml.impl.GsmlPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gradings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__GRADINGS = 1;

	/**
	 * The feature id for the '<em><b>Gradingschemes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__GRADINGSCHEMES = 2;

	/**
	 * The feature id for the '<em><b>Gradingscheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__GRADINGSCHEME = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link gsml.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.TaskImpl
	 * @see gsml.impl.GsmlPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MIN_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Min Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MIN_REQUIREMENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gsml.impl.ConcreteTaskImpl <em>Concrete Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.ConcreteTaskImpl
	 * @see gsml.impl.GsmlPackageImpl#getConcreteTask()
	 * @generated
	 */
	int CONCRETE_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Min Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__MIN_REQUIREMENT = TASK__MIN_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Min Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__MIN_REQUIREMENT_TYPE = TASK__MIN_REQUIREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Max Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK__MAX_POINTS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsml.impl.TaskGroupImpl <em>Task Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.TaskGroupImpl
	 * @see gsml.impl.GsmlPackageImpl#getTaskGroup()
	 * @generated
	 */
	int TASK_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Min Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MIN_REQUIREMENT = TASK__MIN_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Min Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__MIN_REQUIREMENT_TYPE = TASK__MIN_REQUIREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP__CONTAINS = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_GROUP_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link gsml.impl.GradingSchemeImpl <em>Grading Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.GradingSchemeImpl
	 * @see gsml.impl.GsmlPackageImpl#getGradingScheme()
	 * @generated
	 */
	int GRADING_SCHEME = 4;

	/**
	 * The feature id for the '<em><b>Grades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME__GRADES = 0;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME__FALLBACK = 1;

	/**
	 * The number of structural features of the '<em>Grading Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SCHEME_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gsml.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.GradeImpl
	 * @see gsml.impl.GsmlPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REQUIRED_POINTS = 1;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gsml.impl.GradingSystemImpl <em>Grading System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.GradingSystemImpl
	 * @see gsml.impl.GsmlPackageImpl#getGradingSystem()
	 * @generated
	 */
	int GRADING_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SYSTEM__COURSES = 0;

	/**
	 * The number of structural features of the '<em>Grading System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gsml.impl.GradingImpl <em>Grading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.impl.GradingImpl
	 * @see gsml.impl.GsmlPackageImpl#getGrading()
	 * @generated
	 */
	int GRADING = 7;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__SEMESTER = 0;

	/**
	 * The feature id for the '<em><b>Gradingscheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__GRADINGSCHEME = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Grading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gsml.MinRequirementType <em>Min Requirement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gsml.MinRequirementType
	 * @see gsml.impl.GsmlPackageImpl#getMinRequirementType()
	 * @generated
	 */
	int MIN_REQUIREMENT_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link gsml.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see gsml.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link gsml.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gsml.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml.Course#getGradings <em>Gradings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gradings</em>'.
	 * @see gsml.Course#getGradings()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Gradings();

	/**
	 * Returns the meta object for the reference list '{@link gsml.Course#getGradingschemes <em>Gradingschemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gradingschemes</em>'.
	 * @see gsml.Course#getGradingschemes()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Gradingschemes();

	/**
	 * Returns the meta object for the reference '{@link gsml.Course#getGradingscheme <em>Gradingscheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gradingscheme</em>'.
	 * @see gsml.Course#getGradingscheme()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Gradingscheme();

	/**
	 * Returns the meta object for class '{@link gsml.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see gsml.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link gsml.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gsml.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link gsml.Task#getMinRequirement <em>Min Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Requirement</em>'.
	 * @see gsml.Task#getMinRequirement()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MinRequirement();

	/**
	 * Returns the meta object for the attribute '{@link gsml.Task#getMinRequirementType <em>Min Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Requirement Type</em>'.
	 * @see gsml.Task#getMinRequirementType()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MinRequirementType();

	/**
	 * Returns the meta object for class '{@link gsml.ConcreteTask <em>Concrete Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Task</em>'.
	 * @see gsml.ConcreteTask
	 * @generated
	 */
	EClass getConcreteTask();

	/**
	 * Returns the meta object for the attribute '{@link gsml.ConcreteTask#getMaxPoints <em>Max Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Points</em>'.
	 * @see gsml.ConcreteTask#getMaxPoints()
	 * @see #getConcreteTask()
	 * @generated
	 */
	EAttribute getConcreteTask_MaxPoints();

	/**
	 * Returns the meta object for class '{@link gsml.TaskGroup <em>Task Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Group</em>'.
	 * @see gsml.TaskGroup
	 * @generated
	 */
	EClass getTaskGroup();

	/**
	 * Returns the meta object for the reference list '{@link gsml.TaskGroup#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see gsml.TaskGroup#getContains()
	 * @see #getTaskGroup()
	 * @generated
	 */
	EReference getTaskGroup_Contains();

	/**
	 * Returns the meta object for class '{@link gsml.GradingScheme <em>Grading Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading Scheme</em>'.
	 * @see gsml.GradingScheme
	 * @generated
	 */
	EClass getGradingScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml.GradingScheme#getGrades <em>Grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grades</em>'.
	 * @see gsml.GradingScheme#getGrades()
	 * @see #getGradingScheme()
	 * @generated
	 */
	EReference getGradingScheme_Grades();

	/**
	 * Returns the meta object for the containment reference '{@link gsml.GradingScheme#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see gsml.GradingScheme#getFallback()
	 * @see #getGradingScheme()
	 * @generated
	 */
	EReference getGradingScheme_Fallback();

	/**
	 * Returns the meta object for class '{@link gsml.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see gsml.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link gsml.Grade#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gsml.Grade#getName()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Name();

	/**
	 * Returns the meta object for the attribute '{@link gsml.Grade#getRequiredPoints <em>Required Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Points</em>'.
	 * @see gsml.Grade#getRequiredPoints()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_RequiredPoints();

	/**
	 * Returns the meta object for class '{@link gsml.GradingSystem <em>Grading System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading System</em>'.
	 * @see gsml.GradingSystem
	 * @generated
	 */
	EClass getGradingSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml.GradingSystem#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see gsml.GradingSystem#getCourses()
	 * @see #getGradingSystem()
	 * @generated
	 */
	EReference getGradingSystem_Courses();

	/**
	 * Returns the meta object for class '{@link gsml.Grading <em>Grading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grading</em>'.
	 * @see gsml.Grading
	 * @generated
	 */
	EClass getGrading();

	/**
	 * Returns the meta object for the attribute '{@link gsml.Grading#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see gsml.Grading#getSemester()
	 * @see #getGrading()
	 * @generated
	 */
	EAttribute getGrading_Semester();

	/**
	 * Returns the meta object for the reference '{@link gsml.Grading#getGradingscheme <em>Gradingscheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gradingscheme</em>'.
	 * @see gsml.Grading#getGradingscheme()
	 * @see #getGrading()
	 * @generated
	 */
	EReference getGrading_Gradingscheme();

	/**
	 * Returns the meta object for the containment reference list '{@link gsml.Grading#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see gsml.Grading#getTasks()
	 * @see #getGrading()
	 * @generated
	 */
	EReference getGrading_Tasks();

	/**
	 * Returns the meta object for enum '{@link gsml.MinRequirementType <em>Min Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Min Requirement Type</em>'.
	 * @see gsml.MinRequirementType
	 * @generated
	 */
	EEnum getMinRequirementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GsmlFactory getGsmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gsml.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.CourseImpl
		 * @see gsml.impl.GsmlPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Gradings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__GRADINGS = eINSTANCE.getCourse_Gradings();

		/**
		 * The meta object literal for the '<em><b>Gradingschemes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__GRADINGSCHEMES = eINSTANCE.getCourse_Gradingschemes();

		/**
		 * The meta object literal for the '<em><b>Gradingscheme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__GRADINGSCHEME = eINSTANCE.getCourse_Gradingscheme();

		/**
		 * The meta object literal for the '{@link gsml.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.TaskImpl
		 * @see gsml.impl.GsmlPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Min Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MIN_REQUIREMENT = eINSTANCE.getTask_MinRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Requirement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MIN_REQUIREMENT_TYPE = eINSTANCE.getTask_MinRequirementType();

		/**
		 * The meta object literal for the '{@link gsml.impl.ConcreteTaskImpl <em>Concrete Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.ConcreteTaskImpl
		 * @see gsml.impl.GsmlPackageImpl#getConcreteTask()
		 * @generated
		 */
		EClass CONCRETE_TASK = eINSTANCE.getConcreteTask();

		/**
		 * The meta object literal for the '<em><b>Max Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_TASK__MAX_POINTS = eINSTANCE.getConcreteTask_MaxPoints();

		/**
		 * The meta object literal for the '{@link gsml.impl.TaskGroupImpl <em>Task Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.TaskGroupImpl
		 * @see gsml.impl.GsmlPackageImpl#getTaskGroup()
		 * @generated
		 */
		EClass TASK_GROUP = eINSTANCE.getTaskGroup();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_GROUP__CONTAINS = eINSTANCE.getTaskGroup_Contains();

		/**
		 * The meta object literal for the '{@link gsml.impl.GradingSchemeImpl <em>Grading Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.GradingSchemeImpl
		 * @see gsml.impl.GsmlPackageImpl#getGradingScheme()
		 * @generated
		 */
		EClass GRADING_SCHEME = eINSTANCE.getGradingScheme();

		/**
		 * The meta object literal for the '<em><b>Grades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SCHEME__GRADES = eINSTANCE.getGradingScheme_Grades();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SCHEME__FALLBACK = eINSTANCE.getGradingScheme_Fallback();

		/**
		 * The meta object literal for the '{@link gsml.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.GradeImpl
		 * @see gsml.impl.GsmlPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__NAME = eINSTANCE.getGrade_Name();

		/**
		 * The meta object literal for the '<em><b>Required Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__REQUIRED_POINTS = eINSTANCE.getGrade_RequiredPoints();

		/**
		 * The meta object literal for the '{@link gsml.impl.GradingSystemImpl <em>Grading System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.GradingSystemImpl
		 * @see gsml.impl.GsmlPackageImpl#getGradingSystem()
		 * @generated
		 */
		EClass GRADING_SYSTEM = eINSTANCE.getGradingSystem();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING_SYSTEM__COURSES = eINSTANCE.getGradingSystem_Courses();

		/**
		 * The meta object literal for the '{@link gsml.impl.GradingImpl <em>Grading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.impl.GradingImpl
		 * @see gsml.impl.GsmlPackageImpl#getGrading()
		 * @generated
		 */
		EClass GRADING = eINSTANCE.getGrading();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADING__SEMESTER = eINSTANCE.getGrading_Semester();

		/**
		 * The meta object literal for the '<em><b>Gradingscheme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING__GRADINGSCHEME = eINSTANCE.getGrading_Gradingscheme();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADING__TASKS = eINSTANCE.getGrading_Tasks();

		/**
		 * The meta object literal for the '{@link gsml.MinRequirementType <em>Min Requirement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gsml.MinRequirementType
		 * @see gsml.impl.GsmlPackageImpl#getMinRequirementType()
		 * @generated
		 */
		EEnum MIN_REQUIREMENT_TYPE = eINSTANCE.getMinRequirementType();

	}

} //GsmlPackage
