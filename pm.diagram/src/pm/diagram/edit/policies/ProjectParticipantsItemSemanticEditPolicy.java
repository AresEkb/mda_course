package pm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class ProjectParticipantsItemSemanticEditPolicy extends
		PmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProjectParticipantsItemSemanticEditPolicy() {
		super(PmElementTypes.ProjectParticipants_4018);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
