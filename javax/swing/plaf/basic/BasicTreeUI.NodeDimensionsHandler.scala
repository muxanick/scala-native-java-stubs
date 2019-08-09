package javax.swing.plaf.basic

import java.awt.Rectangle
import java.lang.Object
import javax.swing.tree.AbstractLayoutCache.NodeDimensions

/** Class responsible for getting size of node, method is forwarded
 *  to BasicTreeUI method. X location does not include insets, that is
 *  handled in getPathBounds.
 */
class BasicTreeUI.NodeDimensionsHandler extends AbstractLayoutCache.NodeDimensions {

    /** Responsible for getting the size of a particular node. */
    @stub
    def getNodeDimensions(value: Object, row: Int, depth: Int, expanded: Boolean, size: Rectangle): Rectangle = ???
}
