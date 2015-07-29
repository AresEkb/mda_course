package pm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import pm.diagram.part.PmVisualIDRegistry;

/**
 * @generated
 */
public class PmEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PmVisualIDRegistry.getVisualID(view)) {

			case DocumentRootEditPart.VISUAL_ID:
				return new DocumentRootEditPart(view);

			case EmployeeEditPart.VISUAL_ID:
				return new EmployeeEditPart(view);

			case EmployeeFullNameEditPart.VISUAL_ID:
				return new EmployeeFullNameEditPart(view);

			case EmployeeQualificationEditPart.VISUAL_ID:
				return new EmployeeQualificationEditPart(view);

			case ProjectEditPart.VISUAL_ID:
				return new ProjectEditPart(view);

			case ProjectNameEditPart.VISUAL_ID:
				return new ProjectNameEditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case TaskNameEditPart.VISUAL_ID:
				return new TaskNameEditPart(view);

			case ProjectManagerEditPart.VISUAL_ID:
				return new ProjectManagerEditPart(view);

			case ProjectParticipantsEditPart.VISUAL_ID:
				return new ProjectParticipantsEditPart(view);

			case TaskExecutorEditPart.VISUAL_ID:
				return new TaskExecutorEditPart(view);

			case TaskParentEditPart.VISUAL_ID:
				return new TaskParentEditPart(view);

			case TaskProjectEditPart.VISUAL_ID:
				return new TaskProjectEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
