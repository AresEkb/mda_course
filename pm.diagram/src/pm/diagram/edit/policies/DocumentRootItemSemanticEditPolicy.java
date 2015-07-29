package pm.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import pm.diagram.edit.commands.EmployeeCreateCommand;
import pm.diagram.edit.commands.ProjectCreateCommand;
import pm.diagram.edit.commands.TaskCreateCommand;
import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class DocumentRootItemSemanticEditPolicy extends
		PmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DocumentRootItemSemanticEditPolicy() {
		super(PmElementTypes.DocumentRoot_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PmElementTypes.Employee_2004 == req.getElementType()) {
			return getGEFWrapper(new EmployeeCreateCommand(req));
		}
		if (PmElementTypes.Project_2005 == req.getElementType()) {
			return getGEFWrapper(new ProjectCreateCommand(req));
		}
		if (PmElementTypes.Task_2006 == req.getElementType()) {
			return getGEFWrapper(new TaskCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
