package javax.swing.tree

import java.awt.Rectangle
import java.lang.Object
import java.util.Enumeration
import javax.swing.event.TreeModelEvent

// NOTE: This will become more open in a future release.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class VariableHeightLayoutCache extends AbstractLayoutCache {

    @stub
    // Returns the Rectangle enclosing the label portion
    // into which the item identified by path will be drawn.
    def getBounds(path: TreePath, placeIn: Rectangle): Rectangle = ???

    @stub
    // Returns true if the path is expanded, and visible.
    def getExpandedState(path: TreePath): Boolean = ???

    @stub
    // Returns the path to the node that is closest to x,y.
    def getPathClosestTo(x: Int, y: Int): TreePath = ???

    @stub
    // Returns the path for row.
    def getPathForRow(row: Int): TreePath = ???

    @stub
    // Returns the preferred height.
    def getPreferredHeight(): Int = ???

    @stub
    // Returns the preferred width and height for the region in
    // visibleRegion.
    def getPreferredWidth(bounds: Rectangle): Int = ???

    @stub
    // Returns the number of visible rows.
    def getRowCount(): Int = ???

    @stub
    // Returns the row where the last item identified in path is visible.
    def getRowForPath(path: TreePath): Int = ???

    @stub
    // Returns the number of visible children for path.
    def getVisibleChildCount(path: TreePath): Int = ???

    @stub
    // Returns an Enumerator that increments over the visible paths
    // starting at the passed in location.
    def getVisiblePathsFrom(path: TreePath): Enumeration[TreePath] = ???

    @stub
    // Instructs the LayoutCache that the bounds for
    // path are invalid, and need to be updated.
    def invalidatePathBounds(path: TreePath): Unit = ???

    @stub
    // Informs the TreeState that it needs to recalculate
    // all the sizes it is referencing.
    def invalidateSizes(): Unit = ???

    @stub
    // Returns true if the value identified by path is
    // currently expanded.
    def isExpanded(path: TreePath): Boolean = ???

    @stub
    // Marks the path path expanded state to
    // isExpanded.
    def setExpandedState(path: TreePath, isExpanded: Boolean): Unit = ???

    @stub
    // Sets the TreeModel that will provide the data.
    def setModel(newModel: TreeModel): Unit = ???

    @stub
    // Sets the renderer that is responsible for drawing nodes in the tree.
    def setNodeDimensions(nd: AbstractLayoutCache.NodeDimensions): Unit = ???

    @stub
    // Determines whether or not the root node from
    // the TreeModel is visible.
    def setRootVisible(rootVisible: Boolean): Unit = ???

    @stub
    // Sets the height of each cell.
    def setRowHeight(rowHeight: Int): Unit = ???

    @stub
    // Invoked after a node (or a set of siblings) has changed in some
    // way.
    def treeNodesChanged(e: TreeModelEvent): Unit = ???

    @stub
    // Invoked after nodes have been inserted into the tree.
    def treeNodesInserted(e: TreeModelEvent): Unit = ???

    @stub
    // Invoked after nodes have been removed from the tree.
    def treeNodesRemoved(e: TreeModelEvent): Unit = ???
}
