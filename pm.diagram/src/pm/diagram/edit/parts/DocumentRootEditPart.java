package pm.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import pm.diagram.edit.policies.DocumentRootCanonicalEditPolicy;
import pm.diagram.edit.policies.DocumentRootItemSemanticEditPolicy;
import pm.diagram.part.PmVisualIDRegistry;

/**
 * @generated
 */
public class DocumentRootEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Pm"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public DocumentRootEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DocumentRootItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DocumentRootCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						PmVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * @generated
	 */
	/*package-local*/static class NodeLabelDragPolicy extends
			NonResizableEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		 * @generated
		 */
		public Command getCommand(Request request) {
			return null;
		}

		/**
		 * @generated
		 */
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

}
