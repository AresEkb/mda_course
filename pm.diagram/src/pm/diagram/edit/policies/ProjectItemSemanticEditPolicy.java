package pm.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import pm.diagram.edit.commands.ProjectManagerCreateCommand;
import pm.diagram.edit.commands.ProjectManagerReorientCommand;
import pm.diagram.edit.commands.ProjectParticipantsCreateCommand;
import pm.diagram.edit.commands.ProjectParticipantsReorientCommand;
import pm.diagram.edit.commands.TaskProjectCreateCommand;
import pm.diagram.edit.commands.TaskProjectReorientCommand;
import pm.diagram.edit.parts.ProjectManagerEditPart;
import pm.diagram.edit.parts.ProjectParticipantsEditPart;
import pm.diagram.edit.parts.TaskProjectEditPart;
import pm.diagram.part.PmVisualIDRegistry;
import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class ProjectItemSemanticEditPolicy extends PmBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProjectItemSemanticEditPolicy() {
		super(PmElementTypes.Project_2005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (PmVisualIDRegistry.getVisualID(incomingLink) == TaskProjectEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (PmVisualIDRegistry.getVisualID(outgoingLink) == ProjectManagerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (PmVisualIDRegistry.getVisualID(outgoingLink) == ProjectParticipantsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PmElementTypes.ProjectManager_4017 == req.getElementType()) {
			return getGEFWrapper(new ProjectManagerCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (PmElementTypes.ProjectParticipants_4018 == req.getElementType()) {
			return getGEFWrapper(new ProjectParticipantsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (PmElementTypes.TaskProject_4021 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PmElementTypes.ProjectManager_4017 == req.getElementType()) {
			return null;
		}
		if (PmElementTypes.ProjectParticipants_4018 == req.getElementType()) {
			return null;
		}
		if (PmElementTypes.TaskProject_4021 == req.getElementType()) {
			return getGEFWrapper(new TaskProjectCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ProjectManagerEditPart.VISUAL_ID:
			return getGEFWrapper(new ProjectManagerReorientCommand(req));
		case ProjectParticipantsEditPart.VISUAL_ID:
			return getGEFWrapper(new ProjectParticipantsReorientCommand(req));
		case TaskProjectEditPart.VISUAL_ID:
			return getGEFWrapper(new TaskProjectReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
