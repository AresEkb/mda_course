/**
 */
package pm;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pm.PmFactory
 * @model kind="package"
 * @generated
 */
public interface PmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PmPackage eINSTANCE = pm.impl.PmPackageImpl.init();

	/**
	 * The meta object id for the '{@link pm.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pm.impl.EmployeeImpl
	 * @see pm.impl.PmPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BIRTH_DATE = 1;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__QUALIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Participant Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PARTICIPANT_PROJECTS = 3;

	/**
	 * The feature id for the '<em><b>Manager Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MANAGER_PROJECTS = 4;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TASKS = 5;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pm.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pm.impl.TaskImpl
	 * @see pm.impl.PmPackageImpl#getTask()
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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Plan Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PLAN_TIME = 2;

	/**
	 * The feature id for the '<em><b>Fact Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FACT_TIME = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROJECT = 5;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXECUTOR = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CHILDREN = 8;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pm.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pm.impl.ProjectImpl
	 * @see pm.impl.PmPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CLOSED = 1;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARTICIPANTS = 2;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TASKS = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pm.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pm.impl.DocumentRootImpl
	 * @see pm.impl.PmPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pm.Qualification <em>Qualification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pm.Qualification
	 * @see pm.impl.PmPackageImpl#getQualification()
	 * @generated
	 */
	int QUALIFICATION = 4;

	/**
	 * The meta object id for the '{@link pm.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pm.Priority
	 * @see pm.impl.PmPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 5;


	/**
	 * Returns the meta object for class '{@link pm.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see pm.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link pm.Employee#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see pm.Employee#getFullName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_FullName();

	/**
	 * Returns the meta object for the attribute '{@link pm.Employee#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see pm.Employee#getBirthDate()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link pm.Employee#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification</em>'.
	 * @see pm.Employee#getQualification()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Qualification();

	/**
	 * Returns the meta object for the reference list '{@link pm.Employee#getParticipantProjects <em>Participant Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Projects</em>'.
	 * @see pm.Employee#getParticipantProjects()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_ParticipantProjects();

	/**
	 * Returns the meta object for the reference list '{@link pm.Employee#getManagerProjects <em>Manager Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manager Projects</em>'.
	 * @see pm.Employee#getManagerProjects()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_ManagerProjects();

	/**
	 * Returns the meta object for the reference list '{@link pm.Employee#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see pm.Employee#getTasks()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Tasks();

	/**
	 * Returns the meta object for class '{@link pm.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see pm.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link pm.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pm.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link pm.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pm.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the attribute '{@link pm.Task#getPlanTime <em>Plan Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Time</em>'.
	 * @see pm.Task#getPlanTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_PlanTime();

	/**
	 * Returns the meta object for the attribute '{@link pm.Task#getFactTime <em>Fact Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fact Time</em>'.
	 * @see pm.Task#getFactTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_FactTime();

	/**
	 * Returns the meta object for the attribute '{@link pm.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see pm.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the reference '{@link pm.Task#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see pm.Task#getProject()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Project();

	/**
	 * Returns the meta object for the reference '{@link pm.Task#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see pm.Task#getExecutor()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Executor();

	/**
	 * Returns the meta object for the reference '{@link pm.Task#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see pm.Task#getParent()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Parent();

	/**
	 * Returns the meta object for the reference list '{@link pm.Task#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see pm.Task#getChildren()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Children();

	/**
	 * Returns the meta object for class '{@link pm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see pm.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link pm.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pm.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link pm.Project#isClosed <em>Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed</em>'.
	 * @see pm.Project#isClosed()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Closed();

	/**
	 * Returns the meta object for the reference list '{@link pm.Project#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see pm.Project#getParticipants()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Participants();

	/**
	 * Returns the meta object for the reference '{@link pm.Project#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see pm.Project#getManager()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Manager();

	/**
	 * Returns the meta object for the reference list '{@link pm.Project#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see pm.Project#getTasks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Tasks();

	/**
	 * Returns the meta object for class '{@link pm.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see pm.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link pm.DocumentRoot#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see pm.DocumentRoot#getProjects()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link pm.DocumentRoot#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see pm.DocumentRoot#getEmployees()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Employees();

	/**
	 * Returns the meta object for the containment reference list '{@link pm.DocumentRoot#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see pm.DocumentRoot#getTasks()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tasks();

	/**
	 * Returns the meta object for enum '{@link pm.Qualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualification</em>'.
	 * @see pm.Qualification
	 * @generated
	 */
	EEnum getQualification();

	/**
	 * Returns the meta object for enum '{@link pm.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see pm.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PmFactory getPmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pm.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pm.impl.EmployeeImpl
		 * @see pm.impl.PmPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__FULL_NAME = eINSTANCE.getEmployee_FullName();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__BIRTH_DATE = eINSTANCE.getEmployee_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__QUALIFICATION = eINSTANCE.getEmployee_Qualification();

		/**
		 * The meta object literal for the '<em><b>Participant Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__PARTICIPANT_PROJECTS = eINSTANCE.getEmployee_ParticipantProjects();

		/**
		 * The meta object literal for the '<em><b>Manager Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__MANAGER_PROJECTS = eINSTANCE.getEmployee_ManagerProjects();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__TASKS = eINSTANCE.getEmployee_Tasks();

		/**
		 * The meta object literal for the '{@link pm.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pm.impl.TaskImpl
		 * @see pm.impl.PmPackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Plan Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PLAN_TIME = eINSTANCE.getTask_PlanTime();

		/**
		 * The meta object literal for the '<em><b>Fact Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FACT_TIME = eINSTANCE.getTask_FactTime();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PROJECT = eINSTANCE.getTask_Project();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__EXECUTOR = eINSTANCE.getTask_Executor();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT = eINSTANCE.getTask_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__CHILDREN = eINSTANCE.getTask_Children();

		/**
		 * The meta object literal for the '{@link pm.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pm.impl.ProjectImpl
		 * @see pm.impl.PmPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CLOSED = eINSTANCE.getProject_Closed();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PARTICIPANTS = eINSTANCE.getProject_Participants();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MANAGER = eINSTANCE.getProject_Manager();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TASKS = eINSTANCE.getProject_Tasks();

		/**
		 * The meta object literal for the '{@link pm.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pm.impl.DocumentRootImpl
		 * @see pm.impl.PmPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROJECTS = eINSTANCE.getDocumentRoot_Projects();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMPLOYEES = eINSTANCE.getDocumentRoot_Employees();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASKS = eINSTANCE.getDocumentRoot_Tasks();

		/**
		 * The meta object literal for the '{@link pm.Qualification <em>Qualification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pm.Qualification
		 * @see pm.impl.PmPackageImpl#getQualification()
		 * @generated
		 */
		EEnum QUALIFICATION = eINSTANCE.getQualification();

		/**
		 * The meta object literal for the '{@link pm.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pm.Priority
		 * @see pm.impl.PmPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

	}

} //PmPackage
