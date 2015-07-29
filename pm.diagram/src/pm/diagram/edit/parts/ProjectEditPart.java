package pm.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import pm.diagram.edit.policies.ProjectItemSemanticEditPolicy;
import pm.diagram.part.PmVisualIDRegistry;
import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class ProjectEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ProjectEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProjectItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ProjectFigure();
	}

	/**
	 * @generated
	 */
	public ProjectFigure getPrimaryShape() {
		return (ProjectFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProjectNameEditPart) {
			((ProjectNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureProjectNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProjectNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(PmVisualIDRegistry
				.getType(ProjectNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PmElementTypes.ProjectManager_4017);
		types.add(PmElementTypes.ProjectParticipants_4018);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EmployeeEditPart) {
			types.add(PmElementTypes.ProjectManager_4017);
		}
		if (targetEditPart instanceof EmployeeEditPart) {
			types.add(PmElementTypes.ProjectParticipants_4018);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == PmElementTypes.ProjectManager_4017) {
			types.add(PmElementTypes.Employee_2004);
		} else if (relationshipType == PmElementTypes.ProjectParticipants_4018) {
			types.add(PmElementTypes.Employee_2004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PmElementTypes.TaskProject_4021);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == PmElementTypes.TaskProject_4021) {
			types.add(PmElementTypes.Task_2006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ProjectFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProjectNameFigure;

		/**
		 * @generated
		 */
		public ProjectFigure() {
			this.setLayoutManager(new StackLayout());
			this.setOutline(false);
			this.setFill(false);
			this.setOpaque(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			ScalablePolygonShape polyline0 = new ScalablePolygonShape();

			polyline0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(0)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(22), getMapMode()
					.DPtoLP(10)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(20)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(20)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(2), getMapMode()
					.DPtoLP(10)));
			polyline0.setFill(true);
			polyline0.setForegroundColor(ColorConstants.black);
			polyline0.setBackgroundColor(ColorConstants.yellow);

			this.add(polyline0);
			polyline0.setLayoutManager(new StackLayout());

			RectangleFigure fig1 = new RectangleFigure();

			fig1.setOutline(false);
			fig1.setFill(false);
			fig1.setOpaque(false);

			polyline0.add(fig1);

			GridLayout layoutFig1 = new GridLayout();
			layoutFig1.numColumns = 1;
			layoutFig1.makeColumnsEqualWidth = true;
			fig1.setLayoutManager(layoutFig1);

			fFigureProjectNameFigure = new WrappingLabel();

			fFigureProjectNameFigure.setText("<...>");

			GridData constraintFFigureProjectNameFigure = new GridData();
			constraintFFigureProjectNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureProjectNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureProjectNameFigure.horizontalIndent = 0;
			constraintFFigureProjectNameFigure.horizontalSpan = 1;
			constraintFFigureProjectNameFigure.verticalSpan = 1;
			constraintFFigureProjectNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureProjectNameFigure.grabExcessVerticalSpace = true;
			fig1.add(fFigureProjectNameFigure,
					constraintFFigureProjectNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProjectNameFigure() {
			return fFigureProjectNameFigure;
		}

	}

}
