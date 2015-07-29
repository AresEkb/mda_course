package pm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class TaskProjectItemSemanticEditPolicy extends
		PmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TaskProjectItemSemanticEditPolicy() {
		super(PmElementTypes.TaskProject_4021);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
