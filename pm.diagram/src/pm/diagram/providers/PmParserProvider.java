package pm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

import pm.PmPackage;
import pm.diagram.edit.parts.EmployeeFullNameEditPart;
import pm.diagram.edit.parts.EmployeeQualificationEditPart;
import pm.diagram.edit.parts.ProjectNameEditPart;
import pm.diagram.edit.parts.TaskNameEditPart;
import pm.diagram.parsers.MessageFormatParser;
import pm.diagram.part.PmVisualIDRegistry;

/**
 * @generated
 */
public class PmParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser employeeFullName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEmployeeFullName_5005Parser() {
		if (employeeFullName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { PmPackage.eINSTANCE
					.getEmployee_FullName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			employeeFullName_5005Parser = parser;
		}
		return employeeFullName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser employeeQualification_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEmployeeQualification_5006Parser() {
		if (employeeQualification_5006Parser == null) {
			EAttribute editableFeature = PmPackage.eINSTANCE
					.getEmployee_Qualification();
			EnumParser parser = new EnumParser(editableFeature);
			employeeQualification_5006Parser = parser;
		}
		return employeeQualification_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser projectName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getProjectName_5007Parser() {
		if (projectName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { PmPackage.eINSTANCE
					.getProject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			projectName_5007Parser = parser;
		}
		return projectName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_5008Parser() {
		if (taskName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { PmPackage.eINSTANCE
					.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskName_5008Parser = parser;
		}
		return taskName_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case EmployeeFullNameEditPart.VISUAL_ID:
			return getEmployeeFullName_5005Parser();

		case EmployeeQualificationEditPart.VISUAL_ID:
			return getEmployeeQualification_5006Parser();
		case ProjectNameEditPart.VISUAL_ID:
			return getProjectName_5007Parser();
		case TaskNameEditPart.VISUAL_ID:
			return getTaskName_5008Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PmVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PmVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PmElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
