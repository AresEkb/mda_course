/**
 */
package pm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pm.Task#getName <em>Name</em>}</li>
 *   <li>{@link pm.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link pm.Task#getPlanTime <em>Plan Time</em>}</li>
 *   <li>{@link pm.Task#getFactTime <em>Fact Time</em>}</li>
 *   <li>{@link pm.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link pm.Task#getProject <em>Project</em>}</li>
 *   <li>{@link pm.Task#getExecutor <em>Executor</em>}</li>
 *   <li>{@link pm.Task#getParent <em>Parent</em>}</li>
 *   <li>{@link pm.Task#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see pm.PmPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pm.PmPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pm.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see pm.PmPackage#getTask_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link pm.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Plan Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Time</em>' attribute.
	 * @see #setPlanTime(int)
	 * @see pm.PmPackage#getTask_PlanTime()
	 * @model
	 * @generated
	 */
	int getPlanTime();

	/**
	 * Sets the value of the '{@link pm.Task#getPlanTime <em>Plan Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Time</em>' attribute.
	 * @see #getPlanTime()
	 * @generated
	 */
	void setPlanTime(int value);

	/**
	 * Returns the value of the '<em><b>Fact Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Time</em>' attribute.
	 * @see #setFactTime(int)
	 * @see pm.PmPackage#getTask_FactTime()
	 * @model
	 * @generated
	 */
	int getFactTime();

	/**
	 * Sets the value of the '{@link pm.Task#getFactTime <em>Fact Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Time</em>' attribute.
	 * @see #getFactTime()
	 * @generated
	 */
	void setFactTime(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link pm.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see pm.Priority
	 * @see #setPriority(Priority)
	 * @see pm.PmPackage#getTask_Priority()
	 * @model required="true"
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link pm.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see pm.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pm.Project#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see pm.PmPackage#getTask_Project()
	 * @see pm.Project#getTasks
	 * @model opposite="tasks" required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link pm.Task#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pm.Employee#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see #setExecutor(Employee)
	 * @see pm.PmPackage#getTask_Executor()
	 * @see pm.Employee#getTasks
	 * @model opposite="tasks"
	 * @generated
	 */
	Employee getExecutor();

	/**
	 * Sets the value of the '{@link pm.Task#getExecutor <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Employee value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pm.Task#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Task)
	 * @see pm.PmPackage#getTask_Parent()
	 * @see pm.Task#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Task getParent();

	/**
	 * Sets the value of the '{@link pm.Task#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Task value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link pm.Task}.
	 * It is bidirectional and its opposite is '{@link pm.Task#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see pm.PmPackage#getTask_Children()
	 * @see pm.Task#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Task> getChildren();

} // Task
