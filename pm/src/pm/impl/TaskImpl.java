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
import pm.Priority;
import pm.Project;
import pm.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pm.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getPlanTime <em>Plan Time</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getFactTime <em>Fact Time</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getProject <em>Project</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link pm.impl.TaskImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlanTime() <em>Plan Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanTime()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlanTime() <em>Plan Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanTime()
	 * @generated
	 * @ordered
	 */
	protected int planTime = PLAN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactTime() <em>Fact Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTime()
	 * @generated
	 * @ordered
	 */
	protected static final int FACT_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFactTime() <em>Fact Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTime()
	 * @generated
	 * @ordered
	 */
	protected int factTime = FACT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.LOW;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Employee executor;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Task parent;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PmPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlanTime() {
		return planTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanTime(int newPlanTime) {
		int oldPlanTime = planTime;
		planTime = newPlanTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__PLAN_TIME, oldPlanTime, planTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFactTime() {
		return factTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactTime(int newFactTime) {
		int oldFactTime = factTime;
		factTime = newFactTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__FACT_TIME, oldFactTime, factTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Priority newPriority) {
		Priority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PmPackage.TASK__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmPackage.TASK__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, PmPackage.PROJECT__TASKS, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, PmPackage.PROJECT__TASKS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getExecutor() {
		if (executor != null && executor.eIsProxy()) {
			InternalEObject oldExecutor = (InternalEObject)executor;
			executor = (Employee)eResolveProxy(oldExecutor);
			if (executor != oldExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PmPackage.TASK__EXECUTOR, oldExecutor, executor));
			}
		}
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutor(Employee newExecutor, NotificationChain msgs) {
		Employee oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmPackage.TASK__EXECUTOR, oldExecutor, newExecutor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Employee newExecutor) {
		if (newExecutor != executor) {
			NotificationChain msgs = null;
			if (executor != null)
				msgs = ((InternalEObject)executor).eInverseRemove(this, PmPackage.EMPLOYEE__TASKS, Employee.class, msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject)newExecutor).eInverseAdd(this, PmPackage.EMPLOYEE__TASKS, Employee.class, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__EXECUTOR, newExecutor, newExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Task)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PmPackage.TASK__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Task newParent, NotificationChain msgs) {
		Task oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmPackage.TASK__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Task newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, PmPackage.TASK__CHILDREN, Task.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, PmPackage.TASK__CHILDREN, Task.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PmPackage.TASK__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Task>(Task.class, this, PmPackage.TASK__CHILDREN, PmPackage.TASK__PARENT);
		}
		return children;
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
			case PmPackage.TASK__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, PmPackage.PROJECT__TASKS, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case PmPackage.TASK__EXECUTOR:
				if (executor != null)
					msgs = ((InternalEObject)executor).eInverseRemove(this, PmPackage.EMPLOYEE__TASKS, Employee.class, msgs);
				return basicSetExecutor((Employee)otherEnd, msgs);
			case PmPackage.TASK__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, PmPackage.TASK__CHILDREN, Task.class, msgs);
				return basicSetParent((Task)otherEnd, msgs);
			case PmPackage.TASK__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case PmPackage.TASK__PROJECT:
				return basicSetProject(null, msgs);
			case PmPackage.TASK__EXECUTOR:
				return basicSetExecutor(null, msgs);
			case PmPackage.TASK__PARENT:
				return basicSetParent(null, msgs);
			case PmPackage.TASK__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case PmPackage.TASK__NAME:
				return getName();
			case PmPackage.TASK__DESCRIPTION:
				return getDescription();
			case PmPackage.TASK__PLAN_TIME:
				return getPlanTime();
			case PmPackage.TASK__FACT_TIME:
				return getFactTime();
			case PmPackage.TASK__PRIORITY:
				return getPriority();
			case PmPackage.TASK__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case PmPackage.TASK__EXECUTOR:
				if (resolve) return getExecutor();
				return basicGetExecutor();
			case PmPackage.TASK__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case PmPackage.TASK__CHILDREN:
				return getChildren();
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
			case PmPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case PmPackage.TASK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PmPackage.TASK__PLAN_TIME:
				setPlanTime((Integer)newValue);
				return;
			case PmPackage.TASK__FACT_TIME:
				setFactTime((Integer)newValue);
				return;
			case PmPackage.TASK__PRIORITY:
				setPriority((Priority)newValue);
				return;
			case PmPackage.TASK__PROJECT:
				setProject((Project)newValue);
				return;
			case PmPackage.TASK__EXECUTOR:
				setExecutor((Employee)newValue);
				return;
			case PmPackage.TASK__PARENT:
				setParent((Task)newValue);
				return;
			case PmPackage.TASK__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Task>)newValue);
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
			case PmPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PmPackage.TASK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PmPackage.TASK__PLAN_TIME:
				setPlanTime(PLAN_TIME_EDEFAULT);
				return;
			case PmPackage.TASK__FACT_TIME:
				setFactTime(FACT_TIME_EDEFAULT);
				return;
			case PmPackage.TASK__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case PmPackage.TASK__PROJECT:
				setProject((Project)null);
				return;
			case PmPackage.TASK__EXECUTOR:
				setExecutor((Employee)null);
				return;
			case PmPackage.TASK__PARENT:
				setParent((Task)null);
				return;
			case PmPackage.TASK__CHILDREN:
				getChildren().clear();
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
			case PmPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PmPackage.TASK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PmPackage.TASK__PLAN_TIME:
				return planTime != PLAN_TIME_EDEFAULT;
			case PmPackage.TASK__FACT_TIME:
				return factTime != FACT_TIME_EDEFAULT;
			case PmPackage.TASK__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case PmPackage.TASK__PROJECT:
				return project != null;
			case PmPackage.TASK__EXECUTOR:
				return executor != null;
			case PmPackage.TASK__PARENT:
				return parent != null;
			case PmPackage.TASK__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", planTime: ");
		result.append(planTime);
		result.append(", factTime: ");
		result.append(factTime);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
