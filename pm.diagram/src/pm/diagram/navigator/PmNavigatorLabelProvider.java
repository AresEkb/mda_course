package pm.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import pm.diagram.edit.parts.DocumentRootEditPart;
import pm.diagram.edit.parts.EmployeeEditPart;
import pm.diagram.edit.parts.EmployeeFullNameEditPart;
import pm.diagram.edit.parts.ProjectEditPart;
import pm.diagram.edit.parts.ProjectManagerEditPart;
import pm.diagram.edit.parts.ProjectNameEditPart;
import pm.diagram.edit.parts.ProjectParticipantsEditPart;
import pm.diagram.edit.parts.TaskEditPart;
import pm.diagram.edit.parts.TaskExecutorEditPart;
import pm.diagram.edit.parts.TaskNameEditPart;
import pm.diagram.edit.parts.TaskParentEditPart;
import pm.diagram.edit.parts.TaskProjectEditPart;
import pm.diagram.part.PmDiagramEditorPlugin;
import pm.diagram.part.PmVisualIDRegistry;
import pm.diagram.providers.PmElementTypes;
import pm.diagram.providers.PmParserProvider;

/**
 * @generated
 */
public class PmNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		PmDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PmNavigatorItem
				&& !isOwnView(((PmNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof PmNavigatorGroup) {
			PmNavigatorGroup group = (PmNavigatorGroup) element;
			return PmDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof PmNavigatorItem) {
			PmNavigatorItem navigatorItem = (PmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (PmVisualIDRegistry.getVisualID(view)) {
		case ProjectParticipantsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/pm?Project?participants", PmElementTypes.ProjectParticipants_4018); //$NON-NLS-1$
		case TaskParentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/pm?Task?parent", PmElementTypes.TaskParent_4020); //$NON-NLS-1$
		case TaskProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/pm?Task?project", PmElementTypes.TaskProject_4021); //$NON-NLS-1$
		case ProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/pm?Project", PmElementTypes.Project_2005); //$NON-NLS-1$
		case EmployeeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/pm?Employee", PmElementTypes.Employee_2004); //$NON-NLS-1$
		case ProjectManagerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/pm?Project?manager", PmElementTypes.ProjectManager_4017); //$NON-NLS-1$
		case TaskExecutorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.example.org/pm?Task?executor", PmElementTypes.TaskExecutor_4019); //$NON-NLS-1$
		case TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/pm?Task", PmElementTypes.Task_2006); //$NON-NLS-1$
		case DocumentRootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.example.org/pm?DocumentRoot", PmElementTypes.DocumentRoot_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PmDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& PmElementTypes.isKnownElementType(elementType)) {
			image = PmElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof PmNavigatorGroup) {
			PmNavigatorGroup group = (PmNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PmNavigatorItem) {
			PmNavigatorItem navigatorItem = (PmNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PmVisualIDRegistry.getVisualID(view)) {
		case ProjectParticipantsEditPart.VISUAL_ID:
			return getProjectParticipants_4018Text(view);
		case TaskParentEditPart.VISUAL_ID:
			return getTaskParent_4020Text(view);
		case TaskProjectEditPart.VISUAL_ID:
			return getTaskProject_4021Text(view);
		case ProjectEditPart.VISUAL_ID:
			return getProject_2005Text(view);
		case EmployeeEditPart.VISUAL_ID:
			return getEmployee_2004Text(view);
		case ProjectManagerEditPart.VISUAL_ID:
			return getProjectManager_4017Text(view);
		case TaskExecutorEditPart.VISUAL_ID:
			return getTaskExecutor_4019Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2006Text(view);
		case DocumentRootEditPart.VISUAL_ID:
			return getDocumentRoot_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProjectManager_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProjectParticipants_4018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDocumentRoot_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTask_2006Text(View view) {
		IParser parser = PmParserProvider.getParser(PmElementTypes.Task_2006,
				view.getElement() != null ? view.getElement() : view,
				PmVisualIDRegistry.getType(TaskNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmployee_2004Text(View view) {
		IParser parser = PmParserProvider.getParser(
				PmElementTypes.Employee_2004,
				view.getElement() != null ? view.getElement() : view,
				PmVisualIDRegistry.getType(EmployeeFullNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskExecutor_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTaskParent_4020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getProject_2005Text(View view) {
		IParser parser = PmParserProvider.getParser(
				PmElementTypes.Project_2005,
				view.getElement() != null ? view.getElement() : view,
				PmVisualIDRegistry.getType(ProjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PmDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTaskProject_4021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DocumentRootEditPart.MODEL_ID.equals(PmVisualIDRegistry
				.getModelID(view));
	}

}
