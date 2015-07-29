package pm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import pm.diagram.part.PmVisualIDRegistry;

/**
 * @generated
 */
public class PmNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4023;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof PmNavigatorItem) {
			PmNavigatorItem item = (PmNavigatorItem) element;
			return PmVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
