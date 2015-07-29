/**
 */
package pm;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pm.Employee#getFullName <em>Full Name</em>}</li>
 *   <li>{@link pm.Employee#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link pm.Employee#getQualification <em>Qualification</em>}</li>
 *   <li>{@link pm.Employee#getParticipantProjects <em>Participant Projects</em>}</li>
 *   <li>{@link pm.Employee#getManagerProjects <em>Manager Projects</em>}</li>
 *   <li>{@link pm.Employee#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see pm.PmPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see pm.PmPackage#getEmployee_FullName()
	 * @model required="true"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link pm.Employee#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #setBirthDate(Date)
	 * @see pm.PmPackage#getEmployee_BirthDate()
	 * @model
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link pm.Employee#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * The literals are from the enumeration {@link pm.Qualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see pm.Qualification
	 * @see #setQualification(Qualification)
	 * @see pm.PmPackage#getEmployee_Qualification()
	 * @model required="true"
	 * @generated
	 */
	Qualification getQualification();

	/**
	 * Sets the value of the '{@link pm.Employee#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see pm.Qualification
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(Qualification value);

	/**
	 * Returns the value of the '<em><b>Participant Projects</b></em>' reference list.
	 * The list contents are of type {@link pm.Project}.
	 * It is bidirectional and its opposite is '{@link pm.Project#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Projects</em>' reference list.
	 * @see pm.PmPackage#getEmployee_ParticipantProjects()
	 * @see pm.Project#getParticipants
	 * @model opposite="participants"
	 * @generated
	 */
	EList<Project> getParticipantProjects();

	/**
	 * Returns the value of the '<em><b>Manager Projects</b></em>' reference list.
	 * The list contents are of type {@link pm.Project}.
	 * It is bidirectional and its opposite is '{@link pm.Project#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Projects</em>' reference list.
	 * @see pm.PmPackage#getEmployee_ManagerProjects()
	 * @see pm.Project#getManager
	 * @model opposite="manager"
	 * @generated
	 */
	EList<Project> getManagerProjects();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link pm.Task}.
	 * It is bidirectional and its opposite is '{@link pm.Task#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see pm.PmPackage#getEmployee_Tasks()
	 * @see pm.Task#getExecutor
	 * @model opposite="executor"
	 * @generated
	 */
	EList<Task> getTasks();

} // Employee
