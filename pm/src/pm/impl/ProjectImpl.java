/**
 */
package pm.impl;

import java.util.Collection;

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
import pm.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pm.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link pm.impl.ProjectImpl#isClosed <em>Closed</em>}</li>
 *   <li>{@link pm.impl.ProjectImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link pm.impl.ProjectImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link pm.impl.ProjectImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The default value of the '{@link #isClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean closed = CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> participants;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Employee manager;

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
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PmPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosed() {
		return closed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosed(boolean newClosed) {
		boolean oldClosed = closed;
		closed = newClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.PROJECT__CLOSED, oldClosed, closed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getParticipants() {
		if (participants == null) {
			participants = new EObjectWithInverseResolvingEList.ManyInverse<Employee>(Employee.class, this, PmPackage.PROJECT__PARTICIPANTS, PmPackage.EMPLOYEE__PARTICIPANT_PROJECTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject)manager;
			manager = (Employee)eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PmPackage.PROJECT__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Employee newManager, NotificationChain msgs) {
		Employee oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmPackage.PROJECT__MANAGER, oldManager, newManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Employee newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject)manager).eInverseRemove(this, PmPackage.EMPLOYEE__MANAGER_PROJECTS, Employee.class, msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, PmPackage.EMPLOYEE__MANAGER_PROJECTS, Employee.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.PROJECT__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, PmPackage.PROJECT__TASKS, PmPackage.TASK__PROJECT);
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
			case PmPackage.PROJECT__PARTICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
			case PmPackage.PROJECT__MANAGER:
				if (manager != null)
					msgs = ((InternalEObject)manager).eInverseRemove(this, PmPackage.EMPLOYEE__MANAGER_PROJECTS, Employee.class, msgs);
				return basicSetManager((Employee)otherEnd, msgs);
			case PmPackage.PROJECT__TASKS:
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
			case PmPackage.PROJECT__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case PmPackage.PROJECT__MANAGER:
				return basicSetManager(null, msgs);
			case PmPackage.PROJECT__TASKS:
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
			case PmPackage.PROJECT__NAME:
				return getName();
			case PmPackage.PROJECT__CLOSED:
				return isClosed();
			case PmPackage.PROJECT__PARTICIPANTS:
				return getParticipants();
			case PmPackage.PROJECT__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case PmPackage.PROJECT__TASKS:
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
			case PmPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case PmPackage.PROJECT__CLOSED:
				setClosed((Boolean)newValue);
				return;
			case PmPackage.PROJECT__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Employee>)newValue);
				return;
			case PmPackage.PROJECT__MANAGER:
				setManager((Employee)newValue);
				return;
			case PmPackage.PROJECT__TASKS:
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
			case PmPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PmPackage.PROJECT__CLOSED:
				setClosed(CLOSED_EDEFAULT);
				return;
			case PmPackage.PROJECT__PARTICIPANTS:
				getParticipants().clear();
				return;
			case PmPackage.PROJECT__MANAGER:
				setManager((Employee)null);
				return;
			case PmPackage.PROJECT__TASKS:
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
			case PmPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PmPackage.PROJECT__CLOSED:
				return closed != CLOSED_EDEFAULT;
			case PmPackage.PROJECT__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case PmPackage.PROJECT__MANAGER:
				return manager != null;
			case PmPackage.PROJECT__TASKS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", closed: ");
		result.append(closed);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
