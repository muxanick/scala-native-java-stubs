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
class FixedHeightLayoutCache extends AbstractLayoutCache {

    @stub
    // Returns a rectangle giving the bounds needed to draw path.
    def getBounds(path: TreePath, placeIn: Rectangle): Rectangle = ???

    @stub
    // Returns true if the path is expanded, and visible.
    def getExpandedState(path: TreePath): Boolean = ???

    @stub
    // Returns the path to the node that is closest to x,y.
    def getPathClosestTo(x: Int, y: Int): TreePath = ???

    @stub
    // Returns the path for passed in row.
    def getPathForRow(row: Int): TreePath = ???

    @stub
    // Returns the number of visible rows.
    def getRowCount(): Int = ???

    @stub
    // Returns the row that the last item identified in path is visible
    // at.
    def getRowForPath(path: TreePath): Int = ???

    @stub
    // Returns the number of visible children for row.
    def getVisibleChildCount(path: TreePath): Int = ???

    @stub
    // Returns an Enumerator that increments over the visible paths
    // starting at the passed in location.
    def getVisiblePathsFrom(path: TreePath): Enumeration[TreePath] = ???

    @stub
    // Does nothing, FixedHeightLayoutCache doesn't cache width, and that
    // is all that could change.
    def invalidatePathBounds(path: TreePath): Unit = ???

    @stub
    // Informs the TreeState that it needs to recalculate all the sizes
    // it is referencing.
    def invalidateSizes(): Unit = ???

    @stub
    // Returns true if the value identified by row is currently expanded.
    def isExpanded(path: TreePath): Boolean = ???

    @stub
    // Marks the path path expanded state to
    // isExpanded.
    def setExpandedState(path: TreePath, isExpanded: Boolean): Unit = ???

    @stub
    // Sets the TreeModel that will provide the data.
    def setModel(newModel: TreeModel): Unit = ???

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
