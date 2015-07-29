package pm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import pm.PmPackage;
import pm.diagram.edit.parts.DocumentRootEditPart;
import pm.diagram.edit.parts.EmployeeEditPart;
import pm.diagram.edit.parts.ProjectEditPart;
import pm.diagram.edit.parts.ProjectManagerEditPart;
import pm.diagram.edit.parts.ProjectParticipantsEditPart;
import pm.diagram.edit.parts.TaskEditPart;
import pm.diagram.edit.parts.TaskExecutorEditPart;
import pm.diagram.edit.parts.TaskParentEditPart;
import pm.diagram.edit.parts.TaskProjectEditPart;
import pm.diagram.part.PmDiagramEditorPlugin;

/**
 * @generated
 */
public class PmElementTypes {

	/**
	 * @generated
	 */
	private PmElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType DocumentRoot_1000 = getElementType("pm.diagram.DocumentRoot_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Employee_2004 = getElementType("pm.diagram.Employee_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Project_2005 = getElementType("pm.diagram.Project_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Task_2006 = getElementType("pm.diagram.Task_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProjectManager_4017 = getElementType("pm.diagram.ProjectManager_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProjectParticipants_4018 = getElementType("pm.diagram.ProjectParticipants_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskExecutor_4019 = getElementType("pm.diagram.TaskExecutor_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskParent_4020 = getElementType("pm.diagram.TaskParent_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TaskProject_4021 = getElementType("pm.diagram.TaskProject_4021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return PmDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(DocumentRoot_1000,
					PmPackage.eINSTANCE.getDocumentRoot());

			elements.put(Employee_2004, PmPackage.eINSTANCE.getEmployee());

			elements.put(Project_2005, PmPackage.eINSTANCE.getProject());

			elements.put(Task_2006, PmPackage.eINSTANCE.getTask());

			elements.put(ProjectManager_4017,
					PmPackage.eINSTANCE.getProject_Manager());

			elements.put(ProjectParticipants_4018,
					PmPackage.eINSTANCE.getProject_Participants());

			elements.put(TaskExecutor_4019,
					PmPackage.eINSTANCE.getTask_Executor());

			elements.put(TaskParent_4020, PmPackage.eINSTANCE.getTask_Parent());

			elements.put(TaskProject_4021,
					PmPackage.eINSTANCE.getTask_Project());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(DocumentRoot_1000);
			KNOWN_ELEMENT_TYPES.add(Employee_2004);
			KNOWN_ELEMENT_TYPES.add(Project_2005);
			KNOWN_ELEMENT_TYPES.add(Task_2006);
			KNOWN_ELEMENT_TYPES.add(ProjectManager_4017);
			KNOWN_ELEMENT_TYPES.add(ProjectParticipants_4018);
			KNOWN_ELEMENT_TYPES.add(TaskExecutor_4019);
			KNOWN_ELEMENT_TYPES.add(TaskParent_4020);
			KNOWN_ELEMENT_TYPES.add(TaskProject_4021);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DocumentRootEditPart.VISUAL_ID:
			return DocumentRoot_1000;
		case EmployeeEditPart.VISUAL_ID:
			return Employee_2004;
		case ProjectEditPart.VISUAL_ID:
			return Project_2005;
		case TaskEditPart.VISUAL_ID:
			return Task_2006;
		case ProjectManagerEditPart.VISUAL_ID:
			return ProjectManager_4017;
		case ProjectParticipantsEditPart.VISUAL_ID:
			return ProjectParticipants_4018;
		case TaskExecutorEditPart.VISUAL_ID:
			return TaskExecutor_4019;
		case TaskParentEditPart.VISUAL_ID:
			return TaskParent_4020;
		case TaskProjectEditPart.VISUAL_ID:
			return TaskProject_4021;
		}
		return null;
	}

}
