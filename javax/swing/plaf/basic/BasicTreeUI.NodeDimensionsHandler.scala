package javax.swing.plaf.basic

import java.awt.Rectangle
import java.lang.Object
import javax.swing.tree.AbstractLayoutCache.NodeDimensions
import scala.scalanative.annotation.stub

/** Class responsible for getting size of node, method is forwarded
 *  to BasicTreeUI method. X location does not include insets, that is
 *  handled in getPathBounds.
 */
class BasicTreeUI_NodeDimensionsHandler extends AbstractLayoutCache.NodeDimensions {

    /**  */
    @stub
    def NodeDimensionsHandler() = ???

    /** Responsible for getting the size of a particular node. */
    @stub
    def getNodeDimensions(value: Any, row: Int, depth: Int, expanded: Boolean, size: Rectangle): Rectangle = ???

    /**  */
    @stub
    protected def getRowX(row: Int, depth: Int): Int = ???
}
