package javax.swing

import java.awt.{Component, Container, Dimension, Rectangle}
import java.awt.event.MouseEvent
import java.lang.{Object, String}
import java.util.{Enumeration, Hashtable}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{TreeExpansionListener, TreeModelListener, TreeSelectionEvent, TreeSelectionListener, TreeWillExpandListener}
import javax.swing.plaf.TreeUI
import javax.swing.text.Position.Bias
import javax.swing.tree.{TreeCellEditor, TreeCellRenderer, TreeModel, TreeNode, TreePath, TreeSelectionModel}

// 
// A control that displays a set of hierarchical data as an outline.
// You can find task-oriented documentation and examples of using trees in
// How to Use Trees,
// a section in The Java Tutorial.
// 
// A specific node in a tree can be identified either by a
// TreePath (an object
// that encapsulates a node and all of its ancestors), or by its
// display row, where each row in the display area displays one node.
// An expanded node is a non-leaf node (as identified by
// TreeModel.isLeaf(node) returning false) that will displays
// its children when all its ancestors are expanded.
// A collapsed
// node is one which hides them. A hidden node is one which is
// under a collapsed ancestor. All of a viewable nodes parents
// are expanded, but may or may not be displayed. A displayed node
// is both viewable and in the display area, where it can be seen.
// 
// The following JTree methods use "visible" to mean "displayed":
// 
// isRootVisible()
// setRootVisible()
// scrollPathToVisible()
// scrollRowToVisible()
// getVisibleRowCount()
// setVisibleRowCount()
// 
// The next group of JTree methods use "visible" to mean
// "viewable" (under an expanded parent):
// 
// isVisible()
// makeVisible()
// 
// If you are interested in knowing when the selection changes implement
// the TreeSelectionListener interface and add the instance
// using the method addTreeSelectionListener.
// valueChanged will be invoked when the
// selection changes, that is if the user clicks twice on the same
// node valueChanged will only be invoked once.
// 
// If you are interested in detecting either double-click events or when
// a user clicks on a node, regardless of whether or not it was selected,
// we recommend you do the following:
// 
// 
// final JTree tree = ...;
//
// MouseListener ml = new MouseAdapter() {
//     public void mousePressed(MouseEvent e) {
//         int selRow = tree.getRowForLocation(e.getX(), e.getY());
//         TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
//         if(selRow != -1) {
//             if(e.getClickCount() == 1) {
//                 mySingleClick(selRow, selPath);
//             }
//             else if(e.getClickCount() == 2) {
//                 myDoubleClick(selRow, selPath);
//             }
//         }
//     }
// };
// tree.addMouseListener(ml);
// 
// NOTE: This example obtains both the path and row, but you only need to
// get the one you're interested in.
// 
// To use JTree to display compound nodes
// (for example, nodes containing both
// a graphic icon and text), subclass TreeCellRenderer and use
// setCellRenderer(javax.swing.tree.TreeCellRenderer) to tell the tree to use it. To edit such nodes,
// subclass TreeCellEditor and use setCellEditor(javax.swing.tree.TreeCellEditor).
// 
// 
// Like all JComponent classes, you can use InputMap and
// ActionMap
// to associate an Action object with a KeyStroke
// and execute the action under specified conditions.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
//
class JTree extends JComponent with Scrollable, with Accessible {

    @stub
    // Returns a JTree with a sample model.
    def this() = ???

    @stub
    // Returns a JTree created from a Hashtable
    // which does not display with root.
    def this(value: Hashtable[_, _]) = ???

    @stub
    // Returns a JTree with each element of the
    // specified array as the
    // child of a new root node which is not displayed.
    def this(value: Array[Object]) = ???

    @stub
    // Returns an instance of JTree which displays the root node
    // -- the tree is created using the specified data model.
    def this(newModel: TreeModel) = ???

    @stub
    // Returns a JTree with the specified
    // TreeNode as its root,
    // which displays the root node.
    def this(root: TreeNode) = ???

    @stub
    // Returns a JTree with the specified TreeNode
    // as its root, which
    // displays the root node and which decides whether a node is a
    // leaf node in the specified manner.
    def this(root: TreeNode, asksAllowsChildren: Boolean) = ???

    @stub
    // This class implements accessibility support for the
    // JTree class.
    protected def JTree.AccessibleJTree: class = ???

    @stub
    // Listens to the model and updates the expandedState
    // accordingly when nodes are removed, or changed.
    protected def JTree.TreeModelHandler: class = ???

    @stub
    // Editor for the entries.
    protected def cellEditor: TreeCellEditor = ???

    @stub
    // The cell used to draw nodes.
    protected def cellRenderer: TreeCellRenderer = ???

    @stub
    // Is the tree editable? Default is false.
    protected def editable: Boolean = ???

    @stub
    // If true, when editing is to be stopped by way of selection changing,
    // data in tree changing or other means stopCellEditing
    // is invoked, and changes are saved.
    protected def invokesStopCellEditing: Boolean = ???

    @stub
    // Is this tree a large model? This is a code-optimization setting.
    protected def largeModel: Boolean = ???

    @stub
    // True if the root node is displayed, false if its children are
    // the highest visible nodes.
    protected def rootVisible: Boolean = ???

    @stub
    // Height to use for each display row.
    protected def rowHeight: Int = ???

    @stub
    // If true, when a node is expanded, as many of the descendants are
    // scrolled to be visible.
    protected def scrollsOnExpand: Boolean = ???

    @stub
    // Models the set of selected nodes in this tree.
    protected def selectionModel: TreeSelectionModel = ???

    @stub
    // Creates a new event and passed it off the
    // selectionListeners.
    protected def selectionRedirector: JTree.TreeSelectionRedirector = ???

    @stub
    // True if handles are displayed at the topmost level of the tree.
    protected def showsRootHandles: Boolean = ???

    @stub
    // Number of mouse clicks before a node is expanded.
    protected def toggleClickCount: Int = ???

    @stub
    // The model that defines the tree displayed by this object.
    protected def treeModel: TreeModel = ???

    @stub
    // Updates the expandedState.
    protected def treeModelListener: TreeModelListener = ???

    @stub
    // Adds the specified rows (inclusive) to the selection.
    def addSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Adds the node identified by the specified TreePath
    // to the current selection.
    def addSelectionPath(path: TreePath): Unit = ???

    @stub
    // Adds each path in the array of paths to the current selection.
    def addSelectionPaths(paths: Array[TreePath]): Unit = ???

    @stub
    // Adds the path at the specified row to the current selection.
    def addSelectionRow(row: Int): Unit = ???

    @stub
    // Adds the paths at each of the specified rows to the current selection.
    def addSelectionRows(rows: Array[Int]): Unit = ???

    @stub
    // Adds a listener for TreeExpansion events.
    def addTreeExpansionListener(tel: TreeExpansionListener): Unit = ???

    @stub
    // Adds a listener for TreeSelection events.
    def addTreeSelectionListener(tsl: TreeSelectionListener): Unit = ???

    @stub
    // Adds a listener for TreeWillExpand events.
    def addTreeWillExpandListener(tel: TreeWillExpandListener): Unit = ???

    @stub
    // Cancels the current editing session.
    def cancelEditing(): Unit = ???

    @stub
    // Clears the selection.
    def clearSelection(): Unit = ???

    @stub
    // Clears the cache of toggled tree paths.
    protected def clearToggledPaths(): Unit = ???

    @stub
    // Ensures that the node identified by the specified path is
    // collapsed and viewable.
    def collapsePath(path: TreePath): Unit = ???

    @stub
    // Ensures that the node in the specified row is collapsed.
    def collapseRow(row: Int): Unit = ???

    @stub
    // Called by the renderers to convert the specified value to
    // text.
    def convertValueToText(value: Object, selected: Boolean, expanded: Boolean, leaf: Boolean, row: Int, hasFocus: Boolean): String = ???

    @stub
    // Creates and returns an instance of TreeModelHandler.
    protected def createTreeModelListener(): TreeModelListener = ???

    @stub
    // Ensures that the node identified by the specified path is
    // expanded and viewable.
    def expandPath(path: TreePath): Unit = ???

    @stub
    // Ensures that the node in the specified row is expanded and
    // viewable.
    def expandRow(row: Int): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    def fireTreeCollapsed(path: TreePath): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    def fireTreeExpanded(path: TreePath): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    def fireTreeWillCollapse(path: TreePath): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    def fireTreeWillExpand(path: TreePath): Unit = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireValueChanged(e: TreeSelectionEvent): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JTree.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the path identified as the anchor.
    def getAnchorSelectionPath(): TreePath = ???

    @stub
    // Returns the editor used to edit entries in the tree.
    def getCellEditor(): TreeCellEditor = ???

    @stub
    // Returns the current TreeCellRenderer
    //  that is rendering each cell.
    def getCellRenderer(): TreeCellRenderer = ???

    @stub
    // Returns the path to the node that is closest to x,y.
    def getClosestPathForLocation(x: Int, y: Int): TreePath = ???

    @stub
    // Returns the row to the node that is closest to x,y.
    def getClosestRowForLocation(x: Int, y: Int): Int = ???

    @stub
    // Returns an Enumeration of TreePaths
    // that have been expanded that
    // are descendants of parent.
    protected def getDescendantToggledPaths(parent: TreePath): Enumeration[TreePath] = ???

    @stub
    // Returns whether or not automatic drag handling is enabled.
    def getDragEnabled(): Boolean = ???

    @stub
    // Returns the location that this component should visually indicate
    // as the drop location during a DnD operation over the component,
    // or null if no location is to currently be shown.
    def getDropLocation(): JTree.DropLocation = ???

    @stub
    // Returns the drop mode for this component.
    def getDropMode(): DropMode = ???

    @stub
    // Returns the path to the element that is currently being edited.
    def getEditingPath(): TreePath = ???

    @stub
    // Returns an Enumeration of the descendants of the
    // path parent that
    // are currently expanded.
    def getExpandedDescendants(parent: TreePath): Enumeration[TreePath] = ???

    @stub
    // Returns the expandsSelectedPaths property.
    def getExpandsSelectedPaths(): Boolean = ???

    @stub
    // Returns the indicator that tells what happens when editing is
    // interrupted.
    def getInvokesStopCellEditing(): Boolean = ???

    @stub
    // Returns the last path component of the selected path.
    def getLastSelectedPathComponent(): Object = ???

    @stub
    // Returns the path identified as the lead.
    def getLeadSelectionPath(): TreePath = ???

    @stub
    // Returns the row index corresponding to the lead path.
    def getLeadSelectionRow(): Int = ???

    @stub
    // Returns the largest selected row.
    def getMaxSelectionRow(): Int = ???

    @stub
    // Returns the smallest selected row.
    def getMinSelectionRow(): Int = ???

    @stub
    // Returns the TreeModel that is providing the data.
    def getModel(): TreeModel = ???

    @stub
    // Returns the TreePath to the next tree element that
    // begins with a prefix.
    def getNextMatch(prefix: String, startingRow: Int, bias: Position.Bias): TreePath = ???

    @stub
    // Returns the paths (inclusive) between the specified rows.
    protected def getPathBetweenRows(index0: Int, index1: Int): Array[TreePath] = ???

    @stub
    // Returns the Rectangle that the specified node will be drawn
    // into.
    def getPathBounds(path: TreePath): Rectangle = ???

    @stub
    // Returns the path for the node at the specified location.
    def getPathForLocation(x: Int, y: Int): TreePath = ???

    @stub
    // Returns the path for the specified row.
    def getPathForRow(row: Int): TreePath = ???

    @stub
    // Returns the preferred display size of a JTree.
    def getPreferredScrollableViewportSize(): Dimension = ???

    @stub
    // Returns the Rectangle that the node at the specified row is
    // drawn in.
    def getRowBounds(row: Int): Rectangle = ???

    @stub
    // Returns the number of viewable nodes.
    def getRowCount(): Int = ???

    @stub
    // Returns the row for the specified location.
    def getRowForLocation(x: Int, y: Int): Int = ???

    @stub
    // Returns the row that displays the node identified by the specified
    // path.
    def getRowForPath(path: TreePath): Int = ???

    @stub
    // Returns the height of each row.
    def getRowHeight(): Int = ???

    @stub
    // Returns the amount for a block increment, which is the height or
    // width of visibleRect, based on orientation.
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Returns false to indicate that the height of the viewport does not
    // determine the height of the table, unless the preferred height
    // of the tree is smaller than the viewports height.
    def getScrollableTracksViewportHeight(): Boolean = ???

    @stub
    // Returns false to indicate that the width of the viewport does not
    // determine the width of the table, unless the preferred width of
    // the tree is smaller than the viewports width.
    def getScrollableTracksViewportWidth(): Boolean = ???

    @stub
    // Returns the amount to increment when scrolling.
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    @stub
    // Returns the value of the scrollsOnExpand property.
    def getScrollsOnExpand(): Boolean = ???

    @stub
    // Returns the number of nodes selected.
    def getSelectionCount(): Int = ???

    @stub
    // Returns the model for selections.
    def getSelectionModel(): TreeSelectionModel = ???

    @stub
    // Returns the path to the first selected node.
    def getSelectionPath(): TreePath = ???

    @stub
    // Returns the paths of all selected values.
    def getSelectionPaths(): Array[TreePath] = ???

    @stub
    // Returns all of the currently selected rows.
    def getSelectionRows(): Array[Int] = ???

    @stub
    // Returns the value of the showsRootHandles property.
    def getShowsRootHandles(): Boolean = ???

    @stub
    // Returns the number of mouse clicks needed to expand or close a node.
    def getToggleClickCount(): Int = ???

    @stub
    // Overrides JComponent's getToolTipText
    // method in order to allow
    // renderer's tips to be used if it has text set.
    def getToolTipText(event: MouseEvent): String = ???

    @stub
    // Returns an array of all the TreeExpansionListeners added
    // to this JTree with addTreeExpansionListener().
    def getTreeExpansionListeners(): Array[TreeExpansionListener] = ???

    @stub
    // Returns an array of all the TreeSelectionListeners added
    // to this JTree with addTreeSelectionListener().
    def getTreeSelectionListeners(): Array[TreeSelectionListener] = ???

    @stub
    // Returns an array of all the TreeWillExpandListeners added
    // to this JTree with addTreeWillExpandListener().
    def getTreeWillExpandListeners(): Array[TreeWillExpandListener] = ???

    @stub
    // Returns the L&F object that renders this component.
    def getUI(): TreeUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Returns the number of rows that are displayed in the display area.
    def getVisibleRowCount(): Int = ???

    @stub
    // Returns true if the node identified by the path has ever been
    // expanded.
    def hasBeenExpanded(path: TreePath): Boolean = ???

    @stub
    // Returns true if the node at the specified display row is collapsed.
    def isCollapsed(row: Int): Boolean = ???

    @stub
    // Returns true if the value identified by path is currently collapsed,
    // this will return false if any of the values in path are currently
    // not being displayed.
    def isCollapsed(path: TreePath): Boolean = ???

    @stub
    // Returns true if the tree is editable.
    def isEditable(): Boolean = ???

    @stub
    // Returns true if the tree is being edited.
    def isEditing(): Boolean = ???

    @stub
    // Returns true if the node at the specified display row is currently
    // expanded.
    def isExpanded(row: Int): Boolean = ???

    @stub
    // Returns true if the node identified by the path is currently expanded,
    def isExpanded(path: TreePath): Boolean = ???

    @stub
    // Returns true if the height of each display row is a fixed size.
    def isFixedRowHeight(): Boolean = ???

    @stub
    // Returns true if the tree is configured for a large model.
    def isLargeModel(): Boolean = ???

    @stub
    // Returns isEditable.
    def isPathEditable(path: TreePath): Boolean = ???

    @stub
    // Returns true if the item identified by the path is currently selected.
    def isPathSelected(path: TreePath): Boolean = ???

    @stub
    // Returns true if the root node of the tree is displayed.
    def isRootVisible(): Boolean = ???

    @stub
    // Returns true if the node identified by row is selected.
    def isRowSelected(row: Int): Boolean = ???

    @stub
    // Returns true if the selection is currently empty.
    def isSelectionEmpty(): Boolean = ???

    @stub
    // Returns true if the value identified by path is currently viewable,
    // which means it is either the root or all of its parents are expanded.
    def isVisible(path: TreePath): Boolean = ???

    @stub
    // Ensures that the node identified by path is currently viewable.
    def makeVisible(path: TreePath): Unit = ???

    @stub
    // Returns a string representation of this JTree.
    protected def paramString(): String = ???

    @stub
    // Removes any paths in the selection that are descendants of
    // path.
    protected def removeDescendantSelectedPaths(path: TreePath, includePath: Boolean): Boolean = ???

    @stub
    // Removes any descendants of the TreePaths in
    // toRemove
    // that have been expanded.
    protected def removeDescendantToggledPaths(toRemove: Enumeration[TreePath]): Unit = ???

    @stub
    // Removes the specified rows (inclusive) from the selection.
    def removeSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Removes the node identified by the specified path from the current
    // selection.
    def removeSelectionPath(path: TreePath): Unit = ???

    @stub
    // Removes the nodes identified by the specified paths from the
    // current selection.
    def removeSelectionPaths(paths: Array[TreePath]): Unit = ???

    @stub
    // Removes the row at the index row from the current
    // selection.
    def removeSelectionRow(row: Int): Unit = ???

    @stub
    // Removes the rows that are selected at each of the specified
    // rows.
    def removeSelectionRows(rows: Array[Int]): Unit = ???

    @stub
    // Removes a listener for TreeExpansion events.
    def removeTreeExpansionListener(tel: TreeExpansionListener): Unit = ???

    @stub
    // Removes a TreeSelection listener.
    def removeTreeSelectionListener(tsl: TreeSelectionListener): Unit = ???

    @stub
    // Removes a listener for TreeWillExpand events.
    def removeTreeWillExpandListener(tel: TreeWillExpandListener): Unit = ???

    @stub
    // Makes sure all the path components in path are expanded (except
    // for the last path component) and scrolls so that the
    // node identified by the path is displayed.
    def scrollPathToVisible(path: TreePath): Unit = ???

    @stub
    // Scrolls the item identified by row until it is displayed.
    def scrollRowToVisible(row: Int): Unit = ???

    @stub
    // Sets the path identified as the anchor.
    def setAnchorSelectionPath(newPath: TreePath): Unit = ???

    @stub
    // Sets the cell editor.
    def setCellEditor(cellEditor: TreeCellEditor): Unit = ???

    @stub
    // Sets the TreeCellRenderer that will be used to
    // draw each cell.
    def setCellRenderer(x: TreeCellRenderer): Unit = ???

    @stub
    // Turns on or off automatic drag handling.
    def setDragEnabled(b: Boolean): Unit = ???

    @stub
    // Sets the drop mode for this component.
    def setDropMode(dropMode: DropMode): Unit = ???

    @stub
    // Determines whether the tree is editable.
    def setEditable(flag: Boolean): Unit = ???

    @stub
    // Sets the expanded state of this JTree.
    protected def setExpandedState(path: TreePath, state: Boolean): Unit = ???

    @stub
    // Configures the expandsSelectedPaths property.
    def setExpandsSelectedPaths(newValue: Boolean): Unit = ???

    @stub
    // Determines what happens when editing is interrupted by selecting
    // another node in the tree, a change in the tree's data, or by some
    // other means.
    def setInvokesStopCellEditing(newValue: Boolean): Unit = ???

    @stub
    // Specifies whether the UI should use a large model.
    def setLargeModel(newValue: Boolean): Unit = ???

    @stub
    // Sets the path identifies as the lead.
    def setLeadSelectionPath(newPath: TreePath): Unit = ???

    @stub
    // Sets the TreeModel that will provide the data.
    def setModel(newModel: TreeModel): Unit = ???

    @stub
    // Determines whether or not the root node from
    // the TreeModel is visible.
    def setRootVisible(rootVisible: Boolean): Unit = ???

    @stub
    // Sets the height of each cell, in pixels.
    def setRowHeight(rowHeight: Int): Unit = ???

    @stub
    // Sets the scrollsOnExpand property,
    // which determines whether the
    // tree might scroll to show previously hidden children.
    def setScrollsOnExpand(newValue: Boolean): Unit = ???

    @stub
    // Selects the rows in the specified interval (inclusive).
    def setSelectionInterval(index0: Int, index1: Int): Unit = ???

    @stub
    // Sets the tree's selection model.
    def setSelectionModel(selectionModel: TreeSelectionModel): Unit = ???

    @stub
    // Selects the node identified by the specified path.
    def setSelectionPath(path: TreePath): Unit = ???

    @stub
    // Selects the nodes identified by the specified array of paths.
    def setSelectionPaths(paths: Array[TreePath]): Unit = ???

    @stub
    // Selects the node at the specified row in the display.
    def setSelectionRow(row: Int): Unit = ???

    @stub
    // Selects the nodes corresponding to each of the specified rows
    // in the display.
    def setSelectionRows(rows: Array[Int]): Unit = ???

    @stub
    // Sets the value of the showsRootHandles property,
    // which specifies whether the node handles should be displayed.
    def setShowsRootHandles(newValue: Boolean): Unit = ???

    @stub
    // Sets the number of mouse clicks before a node will expand or close.
    def setToggleClickCount(clickCount: Int): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: TreeUI): Unit = ???

    @stub
    // Sets the number of rows that are to be displayed.
    def setVisibleRowCount(newCount: Int): Unit = ???

    @stub
    // Selects the node identified by the specified path and initiates
    // editing.
    def startEditingAtPath(path: TreePath): Unit = ???

    @stub
    // Ends the current editing session.
    def stopEditing(): Boolean = ???

    @stub
    // Sent when the tree has changed enough that we need to resize
    // the bounds, but not enough that we need to remove the
    // expanded node set (e.g nodes were expanded or collapsed, or
    // nodes were inserted into the tree).
    def treeDidChange(): Unit = ???
}

object JTree {
    @stub
    // A subclass of TransferHandler.DropLocation representing
    // a drop location for a JTree.
    def JTree.DropLocation: class = ???

    @stub
    // DynamicUtilTreeNode can wrap
    // vectors/hashtables/arrays/strings and
    // create the appropriate children tree nodes as necessary.
    def JTree.DynamicUtilTreeNode: class = ???

    @stub
    // EmptySelectionModel is a TreeSelectionModel
    // that does not allow anything to be selected.
    protected def JTree.EmptySelectionModel: class = ???

    @stub
    // Bound property name for anchor selection path.
    def ANCHOR_SELECTION_PATH_PROPERTY: String = ???

    @stub
    // Bound property name for cellEditor.
    def CELL_EDITOR_PROPERTY: String = ???

    @stub
    // Bound property name for cellRenderer.
    def CELL_RENDERER_PROPERTY: String = ???

    @stub
    // Bound property name for editable.
    def EDITABLE_PROPERTY: String = ???

    @stub
    // Bound property name for expands selected paths property
    def EXPANDS_SELECTED_PATHS_PROPERTY: String = ???

    @stub
    // Bound property name for messagesStopCellEditing.
    def INVOKES_STOP_CELL_EDITING_PROPERTY: String = ???

    @stub
    // Bound property name for largeModel.
    def LARGE_MODEL_PROPERTY: String = ???

    @stub
    // Bound property name for leadSelectionPath.
    def LEAD_SELECTION_PATH_PROPERTY: String = ???

    @stub
    // Bound property name for rootVisible.
    def ROOT_VISIBLE_PROPERTY: String = ???

    @stub
    // Bound property name for rowHeight.
    def ROW_HEIGHT_PROPERTY: String = ???

    @stub
    // Bound property name for scrollsOnExpand.
    def SCROLLS_ON_EXPAND_PROPERTY: String = ???

    @stub
    // Bound property name for selectionModel.
    def SELECTION_MODEL_PROPERTY: String = ???

    @stub
    // Bound property name for showsRootHandles.
    def SHOWS_ROOT_HANDLES_PROPERTY: String = ???

    @stub
    // Bound property name for toggleClickCount.
    def TOGGLE_CLICK_COUNT_PROPERTY: String = ???

    @stub
    // Bound property name for treeModel.
    def TREE_MODEL_PROPERTY: String = ???

    @stub
    // Bound property name for visibleRowCount.
    def VISIBLE_ROW_COUNT_PROPERTY: String = ???

    @stub
    // Returns a TreeModel wrapping the specified object.
    protected def createTreeModel(value: Object): TreeModel = ???

    @stub
    // Creates and returns a sample TreeModel.
    protected def getDefaultTreeModel(): TreeModel = ???
}
