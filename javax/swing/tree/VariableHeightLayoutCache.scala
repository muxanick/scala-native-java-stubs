package javax.swing.tree

import java.awt.Rectangle
import java.lang.Object
import java.util.Enumeration
import javax.swing.event.TreeModelEvent
import scala.scalanative.annotation.stub

/** NOTE: This will become more open in a future release.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class VariableHeightLayoutCache extends AbstractLayoutCache {

    /**  */
    @stub
    def this() = ???

    /** Returns the Rectangle enclosing the label portion
     *  into which the item identified by path will be drawn.
     */
    @stub
    def getBounds(path: TreePath, placeIn: Rectangle): Rectangle = ???

    /** Returns true if the path is expanded, and visible. */
    @stub
    def getExpandedState(path: TreePath): Boolean = ???

    /** Returns the path to the node that is closest to x,y. */
    @stub
    def getPathClosestTo(x: Int, y: Int): TreePath = ???

    /** Returns the path for row. */
    @stub
    def getPathForRow(row: Int): TreePath = ???

    /** Returns the preferred height. */
    @stub
    def getPreferredHeight(): Int = ???

    /** Returns the preferred width and height for the region in
     *  visibleRegion.
     */
    @stub
    def getPreferredWidth(bounds: Rectangle): Int = ???

    /** Returns the number of visible rows. */
    @stub
    def getRowCount(): Int = ???

    /** Returns the row where the last item identified in path is visible. */
    @stub
    def getRowForPath(path: TreePath): Int = ???

    /** Returns the number of visible children for path. */
    @stub
    def getVisibleChildCount(path: TreePath): Int = ???

    /** Returns an Enumerator that increments over the visible paths
     *  starting at the passed in location.
     */
    @stub
    def getVisiblePathsFrom(path: TreePath): Enumeration[TreePath] = ???

    /** Instructs the LayoutCache that the bounds for
     *  path are invalid, and need to be updated.
     */
    @stub
    def invalidatePathBounds(path: TreePath): Unit = ???

    /** Informs the TreeState that it needs to recalculate
     *  all the sizes it is referencing.
     */
    @stub
    def invalidateSizes(): Unit = ???

    /** Returns true if the value identified by path is
     *  currently expanded.
     */
    @stub
    def isExpanded(path: TreePath): Boolean = ???

    /** Marks the path path expanded state to
     *  isExpanded.
     */
    @stub
    def setExpandedState(path: TreePath, isExpanded: Boolean): Unit = ???

    /** Sets the TreeModel that will provide the data. */
    @stub
    def setModel(newModel: TreeModel): Unit = ???

    /** Sets the renderer that is responsible for drawing nodes in the tree. */
    @stub
    def setNodeDimensions(nd: AbstractLayoutCache.NodeDimensions): Unit = ???

    /** Determines whether or not the root node from
     *  the TreeModel is visible.
     */
    @stub
    def setRootVisible(rootVisible: Boolean): Unit = ???

    /** Sets the height of each cell. */
    @stub
    def setRowHeight(rowHeight: Int): Unit = ???

    /** Invoked after a node (or a set of siblings) has changed in some
     *  way.
     */
    @stub
    def treeNodesChanged(e: TreeModelEvent): Unit = ???

    /** Invoked after nodes have been inserted into the tree. */
    @stub
    def treeNodesInserted(e: TreeModelEvent): Unit = ???

    /** Invoked after nodes have been removed from the tree. */
    @stub
    def treeNodesRemoved(e: TreeModelEvent): Unit = ???

    /** Invoked after the tree has drastically changed structure from a
     *  given node down.
     */
    @stub
    def treeStructureChanged(e: TreeModelEvent): Unit = ???
}
