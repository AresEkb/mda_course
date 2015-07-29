package pm.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import pm.DocumentRoot;
import pm.Employee;
import pm.PmPackage;
import pm.Project;
import pm.Task;
import pm.diagram.edit.parts.DocumentRootEditPart;
import pm.diagram.edit.parts.EmployeeEditPart;
import pm.diagram.edit.parts.ProjectEditPart;
import pm.diagram.edit.parts.ProjectManagerEditPart;
import pm.diagram.edit.parts.ProjectParticipantsEditPart;
import pm.diagram.edit.parts.TaskEditPart;
import pm.diagram.edit.parts.TaskExecutorEditPart;
import pm.diagram.edit.parts.TaskParentEditPart;
import pm.diagram.edit.parts.TaskProjectEditPart;
import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class PmDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<PmNodeDescriptor> getSemanticChildren(View view) {
		switch (PmVisualIDRegistry.getVisualID(view)) {
		case DocumentRootEditPart.VISUAL_ID:
			return getDocumentRoot_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PmNodeDescriptor> getDocumentRoot_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		DocumentRoot modelElement = (DocumentRoot) view.getElement();
		LinkedList<PmNodeDescriptor> result = new LinkedList<PmNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEmployees().iterator(); it
				.hasNext();) {
			Employee childElement = (Employee) it.next();
			int visualID = PmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EmployeeEditPart.VISUAL_ID) {
				result.add(new PmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProjects().iterator(); it
				.hasNext();) {
			Project childElement = (Project) it.next();
			int visualID = PmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProjectEditPart.VISUAL_ID) {
				result.add(new PmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTasks().iterator(); it.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = PmVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TaskEditPart.VISUAL_ID) {
				result.add(new PmNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getContainedLinks(View view) {
		switch (PmVisualIDRegistry.getVisualID(view)) {
		case DocumentRootEditPart.VISUAL_ID:
			return getDocumentRoot_1000ContainedLinks(view);
		case EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004ContainedLinks(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2005ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getIncomingLinks(View view) {
		switch (PmVisualIDRegistry.getVisualID(view)) {
		case EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004IncomingLinks(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2005IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getOutgoingLinks(View view) {
		switch (PmVisualIDRegistry.getVisualID(view)) {
		case EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004OutgoingLinks(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2005OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getDocumentRoot_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getEmployee_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getProject_2005ContainedLinks(View view) {
		Project modelElement = (Project) view.getElement();
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Project_Manager_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Project_Participants_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getTask_2006ContainedLinks(View view) {
		Task modelElement = (Task) view.getElement();
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Executor_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Parent_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Project_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getEmployee_2004IncomingLinks(View view) {
		Employee modelElement = (Employee) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Project_Manager_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Project_Participants_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Executor_4019(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getProject_2005IncomingLinks(View view) {
		Project modelElement = (Project) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Project_4021(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getTask_2006IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Task_Parent_4020(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getEmployee_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getProject_2005OutgoingLinks(View view) {
		Project modelElement = (Project) view.getElement();
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Project_Manager_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Project_Participants_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PmLinkDescriptor> getTask_2006OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Executor_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Parent_4020(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Task_Project_4021(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getIncomingFeatureModelFacetLinks_Project_Manager_4017(
			Employee target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PmPackage.eINSTANCE
					.getProject_Manager()) {
				result.add(new PmLinkDescriptor(setting.getEObject(), target,
						PmElementTypes.ProjectManager_4017,
						ProjectManagerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getIncomingFeatureModelFacetLinks_Project_Participants_4018(
			Employee target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PmPackage.eINSTANCE
					.getProject_Participants()) {
				result.add(new PmLinkDescriptor(setting.getEObject(), target,
						PmElementTypes.ProjectParticipants_4018,
						ProjectParticipantsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_Executor_4019(
			Employee target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PmPackage.eINSTANCE
					.getTask_Executor()) {
				result.add(new PmLinkDescriptor(setting.getEObject(), target,
						PmElementTypes.TaskExecutor_4019,
						TaskExecutorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_Parent_4020(
			Task target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PmPackage.eINSTANCE
					.getTask_Parent()) {
				result.add(new PmLinkDescriptor(setting.getEObject(), target,
						PmElementTypes.TaskParent_4020,
						TaskParentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getIncomingFeatureModelFacetLinks_Task_Project_4021(
			Project target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PmPackage.eINSTANCE
					.getTask_Project()) {
				result.add(new PmLinkDescriptor(setting.getEObject(), target,
						PmElementTypes.TaskProject_4021,
						TaskProjectEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Project_Manager_4017(
			Project source) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Employee destination = source.getManager();
		if (destination == null) {
			return result;
		}
		result.add(new PmLinkDescriptor(source, destination,
				PmElementTypes.ProjectManager_4017,
				ProjectManagerEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Project_Participants_4018(
			Project source) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		for (Iterator<?> destinations = source.getParticipants().iterator(); destinations
				.hasNext();) {
			Employee destination = (Employee) destinations.next();
			result.add(new PmLinkDescriptor(source, destination,
					PmElementTypes.ProjectParticipants_4018,
					ProjectParticipantsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_Executor_4019(
			Task source) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Employee destination = source.getExecutor();
		if (destination == null) {
			return result;
		}
		result.add(new PmLinkDescriptor(source, destination,
				PmElementTypes.TaskExecutor_4019,
				TaskExecutorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_Parent_4020(
			Task source) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Task destination = source.getParent();
		if (destination == null) {
			return result;
		}
		result.add(new PmLinkDescriptor(source, destination,
				PmElementTypes.TaskParent_4020, TaskParentEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PmLinkDescriptor> getOutgoingFeatureModelFacetLinks_Task_Project_4021(
			Task source) {
		LinkedList<PmLinkDescriptor> result = new LinkedList<PmLinkDescriptor>();
		Project destination = source.getProject();
		if (destination == null) {
			return result;
		}
		result.add(new PmLinkDescriptor(source, destination,
				PmElementTypes.TaskProject_4021, TaskProjectEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<PmNodeDescriptor> getSemanticChildren(View view) {
			return PmDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PmLinkDescriptor> getContainedLinks(View view) {
			return PmDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PmLinkDescriptor> getIncomingLinks(View view) {
			return PmDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<PmLinkDescriptor> getOutgoingLinks(View view) {
			return PmDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
