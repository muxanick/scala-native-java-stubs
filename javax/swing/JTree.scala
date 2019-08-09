package javax.swing

import java.awt.{Component, Container, Dimension, Rectangle}
import java.awt.event.MouseEvent
import java.lang.{Object, String}
import java.util.{Enumeration, Hashtable, Vector}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{TreeExpansionListener, TreeModelListener, TreeSelectionEvent, TreeSelectionListener, TreeWillExpandListener}
import javax.swing.plaf.TreeUI
import javax.swing.text.Position.Bias
import javax.swing.tree.{TreeCellEditor, TreeCellRenderer, TreeModel, TreeNode, TreePath, TreeSelectionModel}
import scala.scalanative.annotation.stub

/** 
 *  A control that displays a set of hierarchical data as an outline.
 *  You can find task-oriented documentation and examples of using trees in
 *  How to Use Trees,
 *  a section in The Java Tutorial.
 *  
 *  A specific node in a tree can be identified either by a
 *  TreePath (an object
 *  that encapsulates a node and all of its ancestors), or by its
 *  display row, where each row in the display area displays one node.
 *  An expanded node is a non-leaf node (as identified by
 *  TreeModel.isLeaf(node) returning false) that will displays
 *  its children when all its ancestors are expanded.
 *  A collapsed
 *  node is one which hides them. A hidden node is one which is
 *  under a collapsed ancestor. All of a viewable nodes parents
 *  are expanded, but may or may not be displayed. A displayed node
 *  is both viewable and in the display area, where it can be seen.
 *  
 *  The following JTree methods use "visible" to mean "displayed":
 *  
 *  isRootVisible()
 *  setRootVisible()
 *  scrollPathToVisible()
 *  scrollRowToVisible()
 *  getVisibleRowCount()
 *  setVisibleRowCount()
 *  
 *  The next group of JTree methods use "visible" to mean
 *  "viewable" (under an expanded parent):
 *  
 *  isVisible()
 *  makeVisible()
 *  
 *  If you are interested in knowing when the selection changes implement
 *  the TreeSelectionListener interface and add the instance
 *  using the method addTreeSelectionListener.
 *  valueChanged will be invoked when the
 *  selection changes, that is if the user clicks twice on the same
 *  node valueChanged will only be invoked once.
 *  
 *  If you are interested in detecting either double-click events or when
 *  a user clicks on a node, regardless of whether or not it was selected,
 *  we recommend you do the following:
 *  
 *  
 *  final JTree tree = ...;
 * 
 *  MouseListener ml = new MouseAdapter() {
 *      public void mousePressed(MouseEvent e) {
 *          int selRow = tree.getRowForLocation(e.getX(), e.getY());
 *          TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
 *          if(selRow != -1) {
 *              if(e.getClickCount() == 1) {
 *                  mySingleClick(selRow, selPath);
 *              }
 *              else if(e.getClickCount() == 2) {
 *                  myDoubleClick(selRow, selPath);
 *              }
 *          }
 *      }
 *  };
 *  tree.addMouseListener(ml);
 *  
 *  NOTE: This example obtains both the path and row, but you only need to
 *  get the one you're interested in.
 *  
 *  To use JTree to display compound nodes
 *  (for example, nodes containing both
 *  a graphic icon and text), subclass TreeCellRenderer and use
 *  setCellRenderer(javax.swing.tree.TreeCellRenderer) to tell the tree to use it. To edit such nodes,
 *  subclass TreeCellEditor and use setCellEditor(javax.swing.tree.TreeCellEditor).
 *  
 *  
 *  Like all JComponent classes, you can use InputMap and
 *  ActionMap
 *  to associate an Action object with a KeyStroke
 *  and execute the action under specified conditions.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 * 
 */
class JTree extends JComponent with Scrollable with Accessible {

    /** Returns a JTree with a sample model. */
    @stub
    def this() = ???

    /** Returns a JTree created from a Hashtable
     *  which does not display with root.
     */
    @stub
    def this(value: Hashtable[_, _]) = ???

    /** Returns a JTree with each element of the
     *  specified array as the
     *  child of a new root node which is not displayed.
     */
    @stub
    def this(value: Array[Object]) = ???

    /** Returns an instance of JTree which displays the root node
     *  -- the tree is created using the specified data model.
     */
    @stub
    def this(newModel: TreeModel) = ???

    /** Returns a JTree with the specified
     *  TreeNode as its root,
     *  which displays the root node.
     */
    @stub
    def this(root: TreeNode) = ???

    /** Returns a JTree with the specified TreeNode
     *  as its root, which
     *  displays the root node and which decides whether a node is a
     *  leaf node in the specified manner.
     */
    @stub
    def this(root: TreeNode, asksAllowsChildren: Boolean) = ???

    /** Returns a JTree with each element of the specified
     *  Vector as the
     *  child of a new root node which is not displayed.
     */
    @stub
    def this(value: Vector[_]) = ???

    /** This class implements accessibility support for the
     *  JTree class.
     */
    @stub
    protected object AccessibleJTree extends JTree.AccessibleJTree

    /** Listens to the model and updates the expandedState
     *  accordingly when nodes are removed, or changed.
     */
    @stub
    protected object TreeModelHandler extends JTree.TreeModelHandler

    /** Handles creating a new TreeSelectionEvent with the
     *  JTree as the
     *  source and passing it off to all the listeners.
     */
    @stub
    protected object TreeSelectionRedirector extends JTree.TreeSelectionRedirector

    /** Editor for the entries. */
    @stub
    protected val cellEditor: TreeCellEditor = ???

    /** The cell used to draw nodes. */
    @stub
    protected val cellRenderer: TreeCellRenderer = ???

    /** Is the tree editable? Default is false. */
    @stub
    protected val editable: Boolean = ???

    /** If true, when editing is to be stopped by way of selection changing,
     *  data in tree changing or other means stopCellEditing
     *  is invoked, and changes are saved.
     */
    @stub
    protected val invokesStopCellEditing: Boolean = ???

    /** Is this tree a large model? This is a code-optimization setting. */
    @stub
    protected val largeModel: Boolean = ???

    /** True if the root node is displayed, false if its children are
     *  the highest visible nodes.
     */
    @stub
    protected val rootVisible: Boolean = ???

    /** Height to use for each display row. */
    @stub
    protected val rowHeight: Int = ???

    /** If true, when a node is expanded, as many of the descendants are
     *  scrolled to be visible.
     */
    @stub
    protected val scrollsOnExpand: Boolean = ???

    /** Models the set of selected nodes in this tree. */
    @stub
    protected val selectionModel: TreeSelectionModel = ???

    /** Creates a new event and passed it off the
     *  selectionListeners.
     */
    @stub
    protected val selectionRedirector: JTree.TreeSelectionRedirector = ???

    /** True if handles are displayed at the topmost level of the tree. */
    @stub
    protected val showsRootHandles: Boolean = ???

    /** Number of mouse clicks before a node is expanded. */
    @stub
    protected val toggleClickCount: Int = ???

    /** The model that defines the tree displayed by this object. */
    @stub
    protected val treeModel: TreeModel = ???

    /** Updates the expandedState. */
    @stub
    protected val treeModelListener: TreeModelListener = ???

    /** Number of rows to make visible at one time. */
    @stub
    protected val visibleRowCount: Int = ???

    /** Adds the specified rows (inclusive) to the selection. */
    @stub
    def addSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Adds the node identified by the specified TreePath
     *  to the current selection.
     */
    @stub
    def addSelectionPath(path: TreePath): Unit = ???

    /** Adds each path in the array of paths to the current selection. */
    @stub
    def addSelectionPaths(paths: Array[TreePath]): Unit = ???

    /** Adds the path at the specified row to the current selection. */
    @stub
    def addSelectionRow(row: Int): Unit = ???

    /** Adds the paths at each of the specified rows to the current selection. */
    @stub
    def addSelectionRows(rows: Array[Int]): Unit = ???

    /** Adds a listener for TreeExpansion events. */
    @stub
    def addTreeExpansionListener(tel: TreeExpansionListener): Unit = ???

    /** Adds a listener for TreeSelection events. */
    @stub
    def addTreeSelectionListener(tsl: TreeSelectionListener): Unit = ???

    /** Adds a listener for TreeWillExpand events. */
    @stub
    def addTreeWillExpandListener(tel: TreeWillExpandListener): Unit = ???

    /** Cancels the current editing session. */
    @stub
    def cancelEditing(): Unit = ???

    /** Clears the selection. */
    @stub
    def clearSelection(): Unit = ???

    /** Clears the cache of toggled tree paths. */
    @stub
    protected def clearToggledPaths(): Unit = ???

    /** Ensures that the node identified by the specified path is
     *  collapsed and viewable.
     */
    @stub
    def collapsePath(path: TreePath): Unit = ???

    /** Ensures that the node in the specified row is collapsed. */
    @stub
    def collapseRow(row: Int): Unit = ???

    /** Called by the renderers to convert the specified value to
     *  text.
     */
    @stub
    def convertValueToText(value: Object, selected: Boolean, expanded: Boolean, leaf: Boolean, row: Int, hasFocus: Boolean): String = ???

    /** Creates and returns an instance of TreeModelHandler. */
    @stub
    protected def createTreeModelListener(): TreeModelListener = ???

    /** Ensures that the node identified by the specified path is
     *  expanded and viewable.
     */
    @stub
    def expandPath(path: TreePath): Unit = ???

    /** Ensures that the node in the specified row is expanded and
     *  viewable.
     */
    @stub
    def expandRow(row: Int): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    def fireTreeCollapsed(path: TreePath): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    def fireTreeExpanded(path: TreePath): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    def fireTreeWillCollapse(path: TreePath): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    def fireTreeWillExpand(path: TreePath): Unit = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireValueChanged(e: TreeSelectionEvent): Unit = ???

    /** Gets the AccessibleContext associated with this JTree. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the path identified as the anchor. */
    @stub
    def getAnchorSelectionPath(): TreePath = ???

    /** Returns the editor used to edit entries in the tree. */
    @stub
    def getCellEditor(): TreeCellEditor = ???

    /** Returns the current TreeCellRenderer
     *   that is rendering each cell.
     */
    @stub
    def getCellRenderer(): TreeCellRenderer = ???

    /** Returns the path to the node that is closest to x,y. */
    @stub
    def getClosestPathForLocation(x: Int, y: Int): TreePath = ???

    /** Returns the row to the node that is closest to x,y. */
    @stub
    def getClosestRowForLocation(x: Int, y: Int): Int = ???

    /** Returns an Enumeration of TreePaths
     *  that have been expanded that
     *  are descendants of parent.
     */
    @stub
    protected def getDescendantToggledPaths(parent: TreePath): Enumeration[TreePath] = ???

    /** Returns whether or not automatic drag handling is enabled. */
    @stub
    def getDragEnabled(): Boolean = ???

    /** Returns the location that this component should visually indicate
     *  as the drop location during a DnD operation over the component,
     *  or null if no location is to currently be shown.
     */
    @stub
    def getDropLocation(): JTree.DropLocation = ???

    /** Returns the drop mode for this component. */
    @stub
    def getDropMode(): DropMode = ???

    /** Returns the path to the element that is currently being edited. */
    @stub
    def getEditingPath(): TreePath = ???

    /** Returns an Enumeration of the descendants of the
     *  path parent that
     *  are currently expanded.
     */
    @stub
    def getExpandedDescendants(parent: TreePath): Enumeration[TreePath] = ???

    /** Returns the expandsSelectedPaths property. */
    @stub
    def getExpandsSelectedPaths(): Boolean = ???

    /** Returns the indicator that tells what happens when editing is
     *  interrupted.
     */
    @stub
    def getInvokesStopCellEditing(): Boolean = ???

    /** Returns the last path component of the selected path. */
    @stub
    def getLastSelectedPathComponent(): Object = ???

    /** Returns the path identified as the lead. */
    @stub
    def getLeadSelectionPath(): TreePath = ???

    /** Returns the row index corresponding to the lead path. */
    @stub
    def getLeadSelectionRow(): Int = ???

    /** Returns the largest selected row. */
    @stub
    def getMaxSelectionRow(): Int = ???

    /** Returns the smallest selected row. */
    @stub
    def getMinSelectionRow(): Int = ???

    /** Returns the TreeModel that is providing the data. */
    @stub
    def getModel(): TreeModel = ???

    /** Returns the TreePath to the next tree element that
     *  begins with a prefix.
     */
    @stub
    def getNextMatch(prefix: String, startingRow: Int, bias: Position.Bias): TreePath = ???

    /** Returns the paths (inclusive) between the specified rows. */
    @stub
    protected def getPathBetweenRows(index0: Int, index1: Int): Array[TreePath] = ???

    /** Returns the Rectangle that the specified node will be drawn
     *  into.
     */
    @stub
    def getPathBounds(path: TreePath): Rectangle = ???

    /** Returns the path for the node at the specified location. */
    @stub
    def getPathForLocation(x: Int, y: Int): TreePath = ???

    /** Returns the path for the specified row. */
    @stub
    def getPathForRow(row: Int): TreePath = ???

    /** Returns the preferred display size of a JTree. */
    @stub
    def getPreferredScrollableViewportSize(): Dimension = ???

    /** Returns the Rectangle that the node at the specified row is
     *  drawn in.
     */
    @stub
    def getRowBounds(row: Int): Rectangle = ???

    /** Returns the number of viewable nodes. */
    @stub
    def getRowCount(): Int = ???

    /** Returns the row for the specified location. */
    @stub
    def getRowForLocation(x: Int, y: Int): Int = ???

    /** Returns the row that displays the node identified by the specified
     *  path.
     */
    @stub
    def getRowForPath(path: TreePath): Int = ???

    /** Returns the height of each row. */
    @stub
    def getRowHeight(): Int = ???

    /** Returns the amount for a block increment, which is the height or
     *  width of visibleRect, based on orientation.
     */
    @stub
    def getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Returns false to indicate that the height of the viewport does not
     *  determine the height of the table, unless the preferred height
     *  of the tree is smaller than the viewports height.
     */
    @stub
    def getScrollableTracksViewportHeight(): Boolean = ???

    /** Returns false to indicate that the width of the viewport does not
     *  determine the width of the table, unless the preferred width of
     *  the tree is smaller than the viewports width.
     */
    @stub
    def getScrollableTracksViewportWidth(): Boolean = ???

    /** Returns the amount to increment when scrolling. */
    @stub
    def getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int = ???

    /** Returns the value of the scrollsOnExpand property. */
    @stub
    def getScrollsOnExpand(): Boolean = ???

    /** Returns the number of nodes selected. */
    @stub
    def getSelectionCount(): Int = ???

    /** Returns the model for selections. */
    @stub
    def getSelectionModel(): TreeSelectionModel = ???

    /** Returns the path to the first selected node. */
    @stub
    def getSelectionPath(): TreePath = ???

    /** Returns the paths of all selected values. */
    @stub
    def getSelectionPaths(): Array[TreePath] = ???

    /** Returns all of the currently selected rows. */
    @stub
    def getSelectionRows(): Array[Int] = ???

    /** Returns the value of the showsRootHandles property. */
    @stub
    def getShowsRootHandles(): Boolean = ???

    /** Returns the number of mouse clicks needed to expand or close a node. */
    @stub
    def getToggleClickCount(): Int = ???

    /** Overrides JComponent's getToolTipText
     *  method in order to allow
     *  renderer's tips to be used if it has text set.
     */
    @stub
    def getToolTipText(event: MouseEvent): String = ???

    /** Returns an array of all the TreeExpansionListeners added
     *  to this JTree with addTreeExpansionListener().
     */
    @stub
    def getTreeExpansionListeners(): Array[TreeExpansionListener] = ???

    /** Returns an array of all the TreeSelectionListeners added
     *  to this JTree with addTreeSelectionListener().
     */
    @stub
    def getTreeSelectionListeners(): Array[TreeSelectionListener] = ???

    /** Returns an array of all the TreeWillExpandListeners added
     *  to this JTree with addTreeWillExpandListener().
     */
    @stub
    def getTreeWillExpandListeners(): Array[TreeWillExpandListener] = ???

    /** Returns the L&F object that renders this component. */
    @stub
    def getUI(): TreeUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Returns the number of rows that are displayed in the display area. */
    @stub
    def getVisibleRowCount(): Int = ???

    /** Returns true if the node identified by the path has ever been
     *  expanded.
     */
    @stub
    def hasBeenExpanded(path: TreePath): Boolean = ???

    /** Returns true if the node at the specified display row is collapsed. */
    @stub
    def isCollapsed(row: Int): Boolean = ???

    /** Returns true if the value identified by path is currently collapsed,
     *  this will return false if any of the values in path are currently
     *  not being displayed.
     */
    @stub
    def isCollapsed(path: TreePath): Boolean = ???

    /** Returns true if the tree is editable. */
    @stub
    def isEditable(): Boolean = ???

    /** Returns true if the tree is being edited. */
    @stub
    def isEditing(): Boolean = ???

    /** Returns true if the node at the specified display row is currently
     *  expanded.
     */
    @stub
    def isExpanded(row: Int): Boolean = ???

    /** Returns true if the node identified by the path is currently expanded, */
    @stub
    def isExpanded(path: TreePath): Boolean = ???

    /** Returns true if the height of each display row is a fixed size. */
    @stub
    def isFixedRowHeight(): Boolean = ???

    /** Returns true if the tree is configured for a large model. */
    @stub
    def isLargeModel(): Boolean = ???

    /** Returns isEditable. */
    @stub
    def isPathEditable(path: TreePath): Boolean = ???

    /** Returns true if the item identified by the path is currently selected. */
    @stub
    def isPathSelected(path: TreePath): Boolean = ???

    /** Returns true if the root node of the tree is displayed. */
    @stub
    def isRootVisible(): Boolean = ???

    /** Returns true if the node identified by row is selected. */
    @stub
    def isRowSelected(row: Int): Boolean = ???

    /** Returns true if the selection is currently empty. */
    @stub
    def isSelectionEmpty(): Boolean = ???

    /** Returns true if the value identified by path is currently viewable,
     *  which means it is either the root or all of its parents are expanded.
     */
    @stub
    def isVisible(path: TreePath): Boolean = ???

    /** Ensures that the node identified by path is currently viewable. */
    @stub
    def makeVisible(path: TreePath): Unit = ???

    /** Returns a string representation of this JTree. */
    @stub
    protected def paramString(): String = ???

    /** Removes any paths in the selection that are descendants of
     *  path.
     */
    @stub
    protected def removeDescendantSelectedPaths(path: TreePath, includePath: Boolean): Boolean = ???

    /** Removes any descendants of the TreePaths in
     *  toRemove
     *  that have been expanded.
     */
    @stub
    protected def removeDescendantToggledPaths(toRemove: Enumeration[TreePath]): Unit = ???

    /** Removes the specified rows (inclusive) from the selection. */
    @stub
    def removeSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Removes the node identified by the specified path from the current
     *  selection.
     */
    @stub
    def removeSelectionPath(path: TreePath): Unit = ???

    /** Removes the nodes identified by the specified paths from the
     *  current selection.
     */
    @stub
    def removeSelectionPaths(paths: Array[TreePath]): Unit = ???

    /** Removes the row at the index row from the current
     *  selection.
     */
    @stub
    def removeSelectionRow(row: Int): Unit = ???

    /** Removes the rows that are selected at each of the specified
     *  rows.
     */
    @stub
    def removeSelectionRows(rows: Array[Int]): Unit = ???

    /** Removes a listener for TreeExpansion events. */
    @stub
    def removeTreeExpansionListener(tel: TreeExpansionListener): Unit = ???

    /** Removes a TreeSelection listener. */
    @stub
    def removeTreeSelectionListener(tsl: TreeSelectionListener): Unit = ???

    /** Removes a listener for TreeWillExpand events. */
    @stub
    def removeTreeWillExpandListener(tel: TreeWillExpandListener): Unit = ???

    /** Makes sure all the path components in path are expanded (except
     *  for the last path component) and scrolls so that the
     *  node identified by the path is displayed.
     */
    @stub
    def scrollPathToVisible(path: TreePath): Unit = ???

    /** Scrolls the item identified by row until it is displayed. */
    @stub
    def scrollRowToVisible(row: Int): Unit = ???

    /** Sets the path identified as the anchor. */
    @stub
    def setAnchorSelectionPath(newPath: TreePath): Unit = ???

    /** Sets the cell editor. */
    @stub
    def setCellEditor(cellEditor: TreeCellEditor): Unit = ???

    /** Sets the TreeCellRenderer that will be used to
     *  draw each cell.
     */
    @stub
    def setCellRenderer(x: TreeCellRenderer): Unit = ???

    /** Turns on or off automatic drag handling. */
    @stub
    def setDragEnabled(b: Boolean): Unit = ???

    /** Sets the drop mode for this component. */
    @stub
    def setDropMode(dropMode: DropMode): Unit = ???

    /** Determines whether the tree is editable. */
    @stub
    def setEditable(flag: Boolean): Unit = ???

    /** Sets the expanded state of this JTree. */
    @stub
    protected def setExpandedState(path: TreePath, state: Boolean): Unit = ???

    /** Configures the expandsSelectedPaths property. */
    @stub
    def setExpandsSelectedPaths(newValue: Boolean): Unit = ???

    /** Determines what happens when editing is interrupted by selecting
     *  another node in the tree, a change in the tree's data, or by some
     *  other means.
     */
    @stub
    def setInvokesStopCellEditing(newValue: Boolean): Unit = ???

    /** Specifies whether the UI should use a large model. */
    @stub
    def setLargeModel(newValue: Boolean): Unit = ???

    /** Sets the path identifies as the lead. */
    @stub
    def setLeadSelectionPath(newPath: TreePath): Unit = ???

    /** Sets the TreeModel that will provide the data. */
    @stub
    def setModel(newModel: TreeModel): Unit = ???

    /** Determines whether or not the root node from
     *  the TreeModel is visible.
     */
    @stub
    def setRootVisible(rootVisible: Boolean): Unit = ???

    /** Sets the height of each cell, in pixels. */
    @stub
    def setRowHeight(rowHeight: Int): Unit = ???

    /** Sets the scrollsOnExpand property,
     *  which determines whether the
     *  tree might scroll to show previously hidden children.
     */
    @stub
    def setScrollsOnExpand(newValue: Boolean): Unit = ???

    /** Selects the rows in the specified interval (inclusive). */
    @stub
    def setSelectionInterval(index0: Int, index1: Int): Unit = ???

    /** Sets the tree's selection model. */
    @stub
    def setSelectionModel(selectionModel: TreeSelectionModel): Unit = ???

    /** Selects the node identified by the specified path. */
    @stub
    def setSelectionPath(path: TreePath): Unit = ???

    /** Selects the nodes identified by the specified array of paths. */
    @stub
    def setSelectionPaths(paths: Array[TreePath]): Unit = ???

    /** Selects the node at the specified row in the display. */
    @stub
    def setSelectionRow(row: Int): Unit = ???

    /** Selects the nodes corresponding to each of the specified rows
     *  in the display.
     */
    @stub
    def setSelectionRows(rows: Array[Int]): Unit = ???

    /** Sets the value of the showsRootHandles property,
     *  which specifies whether the node handles should be displayed.
     */
    @stub
    def setShowsRootHandles(newValue: Boolean): Unit = ???

    /** Sets the number of mouse clicks before a node will expand or close. */
    @stub
    def setToggleClickCount(clickCount: Int): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: TreeUI): Unit = ???

    /** Sets the number of rows that are to be displayed. */
    @stub
    def setVisibleRowCount(newCount: Int): Unit = ???

    /** Selects the node identified by the specified path and initiates
     *  editing.
     */
    @stub
    def startEditingAtPath(path: TreePath): Unit = ???

    /** Ends the current editing session. */
    @stub
    def stopEditing(): Boolean = ???

    /** Sent when the tree has changed enough that we need to resize
     *  the bounds, but not enough that we need to remove the
     *  expanded node set (e.g nodes were expanded or collapsed, or
     *  nodes were inserted into the tree).
     */
    @stub
    def treeDidChange(): Unit = ???

    /** Notification from the UIManager that the L&F has changed. */
    @stub
    def updateUI(): Unit = ???
}

object JTree {
    /** A subclass of TransferHandler.DropLocation representing
     *  a drop location for a JTree.
     */
    @stub
    object DropLocation extends JTree.DropLocation

    /** DynamicUtilTreeNode can wrap
     *  vectors/hashtables/arrays/strings and
     *  create the appropriate children tree nodes as necessary.
     */
    @stub
    object DynamicUtilTreeNode extends JTree.DynamicUtilTreeNode

    /** EmptySelectionModel is a TreeSelectionModel
     *  that does not allow anything to be selected.
     */
    @stub
    protected object EmptySelectionModel extends JTree.EmptySelectionModel

    /** Bound property name for anchor selection path. */
    @stub
    val ANCHOR_SELECTION_PATH_PROPERTY: String = ???

    /** Bound property name for cellEditor. */
    @stub
    val CELL_EDITOR_PROPERTY: String = ???

    /** Bound property name for cellRenderer. */
    @stub
    val CELL_RENDERER_PROPERTY: String = ???

    /** Bound property name for editable. */
    @stub
    val EDITABLE_PROPERTY: String = ???

    /** Bound property name for expands selected paths property */
    @stub
    val EXPANDS_SELECTED_PATHS_PROPERTY: String = ???

    /** Bound property name for messagesStopCellEditing. */
    @stub
    val INVOKES_STOP_CELL_EDITING_PROPERTY: String = ???

    /** Bound property name for largeModel. */
    @stub
    val LARGE_MODEL_PROPERTY: String = ???

    /** Bound property name for leadSelectionPath. */
    @stub
    val LEAD_SELECTION_PATH_PROPERTY: String = ???

    /** Bound property name for rootVisible. */
    @stub
    val ROOT_VISIBLE_PROPERTY: String = ???

    /** Bound property name for rowHeight. */
    @stub
    val ROW_HEIGHT_PROPERTY: String = ???

    /** Bound property name for scrollsOnExpand. */
    @stub
    val SCROLLS_ON_EXPAND_PROPERTY: String = ???

    /** Bound property name for selectionModel. */
    @stub
    val SELECTION_MODEL_PROPERTY: String = ???

    /** Bound property name for showsRootHandles. */
    @stub
    val SHOWS_ROOT_HANDLES_PROPERTY: String = ???

    /** Bound property name for toggleClickCount. */
    @stub
    val TOGGLE_CLICK_COUNT_PROPERTY: String = ???

    /** Bound property name for treeModel. */
    @stub
    val TREE_MODEL_PROPERTY: String = ???

    /** Bound property name for visibleRowCount. */
    @stub
    val VISIBLE_ROW_COUNT_PROPERTY: String = ???

    /** Returns a TreeModel wrapping the specified object. */
    @stub
    protected def createTreeModel(value: Object): TreeModel = ???

    /** Creates and returns a sample TreeModel. */
    @stub
    protected def getDefaultTreeModel(): TreeModel = ???
}
