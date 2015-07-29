package pm.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pm.diagram.providers.PmElementTypes;

/**
 * @generated
 */
public class PmPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTaskManagement1Group());
	}

	/**
	 * Creates "Task Management" palette tool group
	 * @generated
	 */
	private PaletteContainer createTaskManagement1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.TaskManagement1Group_title);
		paletteContainer.setId("createTaskManagement1Group"); //$NON-NLS-1$
		paletteContainer.add(createEmployee1CreationTool());
		paletteContainer.add(createTask2CreationTool());
		paletteContainer.add(createProject3CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createProjectManager5CreationTool());
		paletteContainer.add(createProjectParticipant6CreationTool());
		paletteContainer.add(createTaskExecutor7CreationTool());
		paletteContainer.add(createTaskParent8CreationTool());
		paletteContainer.add(createTaskProject9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmployee1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Employee1CreationTool_title,
				Messages.Employee1CreationTool_desc,
				Collections.singletonList(PmElementTypes.Employee_2004));
		entry.setId("createEmployee1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.Employee_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTask2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Task2CreationTool_title,
				Messages.Task2CreationTool_desc,
				Collections.singletonList(PmElementTypes.Task_2006));
		entry.setId("createTask2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.Task_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProject3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Project3CreationTool_title,
				Messages.Project3CreationTool_desc,
				Collections.singletonList(PmElementTypes.Project_2005));
		entry.setId("createProject3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.Project_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProjectManager5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ProjectManager5CreationTool_title,
				Messages.ProjectManager5CreationTool_desc,
				Collections.singletonList(PmElementTypes.ProjectManager_4017));
		entry.setId("createProjectManager5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.ProjectManager_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProjectParticipant6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ProjectParticipant6CreationTool_title,
				Messages.ProjectParticipant6CreationTool_desc,
				Collections
						.singletonList(PmElementTypes.ProjectParticipants_4018));
		entry.setId("createProjectParticipant6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.ProjectParticipants_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskExecutor7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TaskExecutor7CreationTool_title,
				Messages.TaskExecutor7CreationTool_desc,
				Collections.singletonList(PmElementTypes.TaskExecutor_4019));
		entry.setId("createTaskExecutor7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.TaskExecutor_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskParent8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TaskParent8CreationTool_title,
				Messages.TaskParent8CreationTool_desc,
				Collections.singletonList(PmElementTypes.TaskParent_4020));
		entry.setId("createTaskParent8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.TaskParent_4020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskProject9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TaskProject9CreationTool_title,
				Messages.TaskProject9CreationTool_desc,
				Collections.singletonList(PmElementTypes.TaskProject_4021));
		entry.setId("createTaskProject9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PmElementTypes
				.getImageDescriptor(PmElementTypes.TaskProject_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
