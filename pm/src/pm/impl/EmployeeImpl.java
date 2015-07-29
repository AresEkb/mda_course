/**
 */
package pm.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pm.Employee;
import pm.PmPackage;
import pm.Project;
import pm.Qualification;
import pm.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pm.impl.EmployeeImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link pm.impl.EmployeeImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link pm.impl.EmployeeImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link pm.impl.EmployeeImpl#getParticipantProjects <em>Participant Projects</em>}</li>
 *   <li>{@link pm.impl.EmployeeImpl#getManagerProjects <em>Manager Projects</em>}</li>
 *   <li>{@link pm.impl.EmployeeImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final Qualification QUALIFICATION_EDEFAULT = Qualification.NOVICE;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected Qualification qualification = QUALIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipantProjects() <em>Participant Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> participantProjects;

	/**
	 * The cached value of the '{@link #getManagerProjects() <em>Manager Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> managerProjects;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
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
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PmPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.EMPLOYEE__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.EMPLOYEE__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualification getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualification(Qualification newQualification) {
		Qualification oldQualification = qualification;
		qualification = newQualification == null ? QUALIFICATION_EDEFAULT : newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.EMPLOYEE__QUALIFICATION, oldQualification, qualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getParticipantProjects() {
		if (participantProjects == null) {
			participantProjects = new EObjectWithInverseResolvingEList.ManyInverse<Project>(Project.class, this, PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS, PmPackage.PROJECT__PARTICIPANTS);
		}
		return participantProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getManagerProjects() {
		if (managerProjects == null) {
			managerProjects = new EObjectWithInverseResolvingEList<Project>(Project.class, this, PmPackage.EMPLOYEE__MANAGER_PROJECTS, PmPackage.PROJECT__MANAGER);
		}
		return managerProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, PmPackage.EMPLOYEE__TASKS, PmPackage.TASK__EXECUTOR);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipantProjects()).basicAdd(otherEnd, msgs);
			case PmPackage.EMPLOYEE__MANAGER_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManagerProjects()).basicAdd(otherEnd, msgs);
			case PmPackage.EMPLOYEE__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS:
				return ((InternalEList<?>)getParticipantProjects()).basicRemove(otherEnd, msgs);
			case PmPackage.EMPLOYEE__MANAGER_PROJECTS:
				return ((InternalEList<?>)getManagerProjects()).basicRemove(otherEnd, msgs);
			case PmPackage.EMPLOYEE__TASKS:
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
			case PmPackage.EMPLOYEE__FULL_NAME:
				return getFullName();
			case PmPackage.EMPLOYEE__BIRTH_DATE:
				return getBirthDate();
			case PmPackage.EMPLOYEE__QUALIFICATION:
				return getQualification();
			case PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS:
				return getParticipantProjects();
			case PmPackage.EMPLOYEE__MANAGER_PROJECTS:
				return getManagerProjects();
			case PmPackage.EMPLOYEE__TASKS:
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
			case PmPackage.EMPLOYEE__FULL_NAME:
				setFullName((String)newValue);
				return;
			case PmPackage.EMPLOYEE__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case PmPackage.EMPLOYEE__QUALIFICATION:
				setQualification((Qualification)newValue);
				return;
			case PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS:
				getParticipantProjects().clear();
				getParticipantProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case PmPackage.EMPLOYEE__MANAGER_PROJECTS:
				getManagerProjects().clear();
				getManagerProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case PmPackage.EMPLOYEE__TASKS:
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
			case PmPackage.EMPLOYEE__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case PmPackage.EMPLOYEE__BIRTH_DATE:
				setBirthDate(BIRTH_DATE_EDEFAULT);
				return;
			case PmPackage.EMPLOYEE__QUALIFICATION:
				setQualification(QUALIFICATION_EDEFAULT);
				return;
			case PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS:
				getParticipantProjects().clear();
				return;
			case PmPackage.EMPLOYEE__MANAGER_PROJECTS:
				getManagerProjects().clear();
				return;
			case PmPackage.EMPLOYEE__TASKS:
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
			case PmPackage.EMPLOYEE__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case PmPackage.EMPLOYEE__BIRTH_DATE:
				return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
			case PmPackage.EMPLOYEE__QUALIFICATION:
				return qualification != QUALIFICATION_EDEFAULT;
			case PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS:
				return participantProjects != null && !participantProjects.isEmpty();
			case PmPackage.EMPLOYEE__MANAGER_PROJECTS:
				return managerProjects != null && !managerProjects.isEmpty();
			case PmPackage.EMPLOYEE__TASKS:
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
		result.append(" (fullName: ");
		result.append(fullName);
		result.append(", birthDate: ");
		result.append(birthDate);
		result.append(", qualification: ");
		result.append(qualification);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
