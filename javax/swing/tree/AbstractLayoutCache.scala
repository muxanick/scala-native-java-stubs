package javax.swing.tree

import java.awt.Rectangle
import java.lang.Object
import java.util.Enumeration
import javax.swing.event.TreeModelEvent

// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
abstract class AbstractLayoutCache extends Object with RowMapper {

    // Object responsible for getting the size of a node.
    protected def nodeDimensions: AbstractLayoutCache.NodeDimensions

    // True if the root node is displayed, false if its children are
    // the highest visible nodes.
    protected def rootVisible: Boolean

    // Height to use for each row.
    protected def rowHeight: Int

    // Model providing information.
    protected def treeModel: TreeModel

    // Returns a rectangle giving the bounds needed to draw path.
    def getBounds(path: TreePath, placeIn: Rectangle): Rectangle

    // Returns true if the path is expanded, and visible.
    def getExpandedState(path: TreePath): Boolean

    // Returns the TreeModel that is providing the data.
    def getModel(): TreeModel

    // Returns the object that renders nodes in the tree, and which is
    // responsible for calculating the dimensions of individual nodes.
    def getNodeDimensions(): AbstractLayoutCache.NodeDimensions

    // Returns, by reference in placeIn,
    // the size needed to represent value.
    protected def getNodeDimensions(value: Object, row: Int, depth: Int, expanded: Boolean, placeIn: Rectangle): Rectangle

    // Returns the path to the node that is closest to x,y.
    def getPathClosestTo(x: Int, y: Int): TreePath

    // Returns the path for passed in row.
    def getPathForRow(row: Int): TreePath

    // Returns the preferred height.
    def getPreferredHeight(): Int

    // Returns the preferred width for the passed in region.
    def getPreferredWidth(bounds: Rectangle): Int

    // Number of rows being displayed.
    def getRowCount(): Int

    // Returns the row that the last item identified in path is visible
    // at.
    def getRowForPath(path: TreePath): Int

    // Returns the height of each row.
    def getRowHeight(): Int

    // Returns the rows that the TreePath instances in
    // path are being displayed at.
    def getRowsForPaths(paths: Array[TreePath]): Array[Int]

    // Returns the model used to maintain the selection.
    def getSelectionModel(): TreeSelectionModel

    // Returns the number of visible children for row.
    def getVisibleChildCount(path: TreePath): Int

    // Returns an Enumerator that increments over the visible
    // paths starting at the passed in location.
    def getVisiblePathsFrom(path: TreePath): Enumeration[TreePath]

    // Instructs the LayoutCache that the bounds for
    // path are invalid, and need to be updated.
    def invalidatePathBounds(path: TreePath): Unit

    // Informs the TreeState that it needs to recalculate
    // all the sizes it is referencing.
    def invalidateSizes(): Unit

    // Returns true if the value identified by row is currently expanded.
    def isExpanded(path: TreePath): Boolean

    // Returns true if the height of each row is a fixed size.
    protected def isFixedRowHeight(): Boolean

    // Returns true if the root node of the tree is displayed.
    def isRootVisible(): Boolean

    // Marks the path path expanded state to
    // isExpanded.
    def setExpandedState(path: TreePath, isExpanded: Boolean): Unit

    // Sets the TreeModel that will provide the data.
    def setModel(newModel: TreeModel): Unit

    // Sets the renderer that is responsible for drawing nodes in the tree
    // and which is therefore responsible for calculating the dimensions of
    // individual nodes.
    def setNodeDimensions(nd: AbstractLayoutCache.NodeDimensions): Unit

    // Determines whether or not the root node from
    // the TreeModel is visible.
    def setRootVisible(rootVisible: Boolean): Unit

    // Sets the height of each cell.
    def setRowHeight(rowHeight: Int): Unit

    // Sets the TreeSelectionModel used to manage the
    // selection to new LSM.
    def setSelectionModel(newLSM: TreeSelectionModel): Unit

    // 
    // Invoked after a node (or a set of siblings) has changed in some
    // way.
    def treeNodesChanged(e: TreeModelEvent): Unit

    // Invoked after nodes have been inserted into the tree.
    def treeNodesInserted(e: TreeModelEvent): Unit

    // Invoked after nodes have been removed from the tree.
    def treeNodesRemoved(e: TreeModelEvent): Unit
}
