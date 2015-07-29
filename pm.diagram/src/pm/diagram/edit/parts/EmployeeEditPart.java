package pm.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonShape;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import pm.diagram.edit.policies.EmployeeItemSemanticEditPolicy;
import pm.diagram.edit.policies.PmTextSelectionEditPolicy;
import pm.diagram.part.PmVisualIDRegistry;
import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class EmployeeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public EmployeeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EmployeeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new PmTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new EmployeeFigure();
	}

	/**
	 * @generated
	 */
	public EmployeeFigure getPrimaryShape() {
		return (EmployeeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EmployeeFullNameEditPart) {
			((EmployeeFullNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEmployeeFullNameFigure());
			return true;
		}
		if (childEditPart instanceof EmployeeQualificationEditPart) {
			((EmployeeQualificationEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEmployeeQualificationFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof EmployeeFullNameEditPart) {
			return true;
		}
		if (childEditPart instanceof EmployeeQualificationEditPart) {
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
				.getType(EmployeeFullNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(PmElementTypes.ProjectManager_4017);
		types.add(PmElementTypes.ProjectParticipants_4018);
		types.add(PmElementTypes.TaskExecutor_4019);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == PmElementTypes.ProjectManager_4017) {
			types.add(PmElementTypes.Project_2005);
		} else if (relationshipType == PmElementTypes.ProjectParticipants_4018) {
			types.add(PmElementTypes.Project_2005);
		} else if (relationshipType == PmElementTypes.TaskExecutor_4019) {
			types.add(PmElementTypes.Task_2006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class EmployeeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEmployeeFullNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEmployeeQualificationFigure;

		/**
		 * @generated
		 */
		public EmployeeFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure resource0 = new RectangleFigure();

			resource0.setFill(false);
			resource0.setOutline(false);
			resource0.setSize(getMapMode().DPtoLP(40), getMapMode().DPtoLP(55));

			this.add(resource0);
			resource0.setLayoutManager(new StackLayout());

			RectangleFigure fig1 = new RectangleFigure();

			fig1.setOutline(false);
			fig1.setFill(false);
			fig1.setOpaque(false);
			fig1.setSize(getMapMode().DPtoLP(40), getMapMode().DPtoLP(20));

			resource0.add(fig1);

			Ellipse head2 = new Ellipse();

			head2.setOutline(false);
			head2.setForegroundColor(HEAD2_FORE);
			head2.setBackgroundColor(HEAD2_BACK);
			head2.setLocation(new Point(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(0)));
			head2.setSize(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20));

			fig1.add(head2);

			PolygonShape body1 = new PolygonShape();

			body1.addPoint(new Point(getMapMode().DPtoLP(23), getMapMode()
					.DPtoLP(19)));
			body1.addPoint(new Point(getMapMode().DPtoLP(23), getMapMode()
					.DPtoLP(24)));
			body1.addPoint(new Point(getMapMode().DPtoLP(39), getMapMode()
					.DPtoLP(24)));
			body1.addPoint(new Point(getMapMode().DPtoLP(39), getMapMode()
					.DPtoLP(29)));
			body1.addPoint(new Point(getMapMode().DPtoLP(23), getMapMode()
					.DPtoLP(29)));
			body1.addPoint(new Point(getMapMode().DPtoLP(23), getMapMode()
					.DPtoLP(36)));
			body1.addPoint(new Point(getMapMode().DPtoLP(39), getMapMode()
					.DPtoLP(48)));
			body1.addPoint(new Point(getMapMode().DPtoLP(39), getMapMode()
					.DPtoLP(53)));
			body1.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(42)));
			body1.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(53)));
			body1.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(48)));
			body1.addPoint(new Point(getMapMode().DPtoLP(17), getMapMode()
					.DPtoLP(36)));
			body1.addPoint(new Point(getMapMode().DPtoLP(17), getMapMode()
					.DPtoLP(29)));
			body1.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(29)));
			body1.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(24)));
			body1.addPoint(new Point(getMapMode().DPtoLP(17), getMapMode()
					.DPtoLP(24)));
			body1.addPoint(new Point(getMapMode().DPtoLP(17), getMapMode()
					.DPtoLP(19)));
			body1.addPoint(new Point(getMapMode().DPtoLP(23), getMapMode()
					.DPtoLP(19)));
			body1.setFill(true);
			body1.setOutline(false);
			body1.setForegroundColor(BODY1_FORE);
			body1.setBackgroundColor(BODY1_BACK);
			body1.setSize(getMapMode().DPtoLP(40), getMapMode().DPtoLP(55));

			resource0.add(body1);

			fFigureEmployeeFullNameFigure = new WrappingLabel();

			fFigureEmployeeFullNameFigure.setText("<...>");

			this.add(fFigureEmployeeFullNameFigure);

			fFigureEmployeeQualificationFigure = new WrappingLabel();

			fFigureEmployeeQualificationFigure.setText("<...>");

			this.add(fFigureEmployeeQualificationFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEmployeeFullNameFigure() {
			return fFigureEmployeeFullNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEmployeeQualificationFigure() {
			return fFigureEmployeeQualificationFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color HEAD2_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color HEAD2_BACK = new Color(null, 0, 230, 0);

	/**
	 * @generated
	 */
	static final Color BODY1_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color BODY1_BACK = new Color(null, 0, 230, 0);

}
