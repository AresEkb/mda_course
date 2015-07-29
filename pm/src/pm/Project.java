/**
 */
package pm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pm.Project#getName <em>Name</em>}</li>
 *   <li>{@link pm.Project#isClosed <em>Closed</em>}</li>
 *   <li>{@link pm.Project#getParticipants <em>Participants</em>}</li>
 *   <li>{@link pm.Project#getManager <em>Manager</em>}</li>
 *   <li>{@link pm.Project#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see pm.PmPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see pm.PmPackage#getProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pm.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' attribute.
	 * @see #setClosed(boolean)
	 * @see pm.PmPackage#getProject_Closed()
	 * @model required="true"
	 * @generated
	 */
	boolean isClosed();

	/**
	 * Sets the value of the '{@link pm.Project#isClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #isClosed()
	 * @generated
	 */
	void setClosed(boolean value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link pm.Employee}.
	 * It is bidirectional and its opposite is '{@link pm.Employee#getParticipantProjects <em>Participant Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see pm.PmPackage#getProject_Participants()
	 * @see pm.Employee#getParticipantProjects
	 * @model opposite="participantProjects" required="true"
	 * @generated
	 */
	EList<Employee> getParticipants();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pm.Employee#getManagerProjects <em>Manager Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see pm.PmPackage#getProject_Manager()
	 * @see pm.Employee#getManagerProjects
	 * @model opposite="managerProjects" required="true"
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link pm.Project#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link pm.Task}.
	 * It is bidirectional and its opposite is '{@link pm.Task#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see pm.PmPackage#getProject_Tasks()
	 * @see pm.Task#getProject
	 * @model opposite="project"
	 * @generated
	 */
	EList<Task> getTasks();

} // Project
