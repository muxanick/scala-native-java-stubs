package javax.swing.plaf.basic

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Graphics, Insets, Rectangle}
import java.awt.event.{ComponentListener, FocusListener, KeyListener, MouseEvent, MouseListener}
import java.beans.PropertyChangeListener
import java.lang.{Boolean, Object}
import java.util.Hashtable
import javax.swing.{CellRendererPane, Icon, JComponent, JTree, JTree.DropLocation}
import javax.swing.event.{CellEditorListener, TreeExpansionListener, TreeModelListener, TreeSelectionListener}
import javax.swing.plaf.{ComponentUI, TreeUI}
import javax.swing.tree.{AbstractLayoutCache, AbstractLayoutCache.NodeDimensions, TreeCellEditor, TreeCellRenderer, TreeModel, TreePath, TreeSelectionModel}

// The basic L&F for a hierarchical data structure.
// 
class BasicTreeUI extends TreeUI {

    @stub
    // Listener responsible for getting cell editing events and updating
    // the tree accordingly.
    def BasicTreeUI.CellEditorHandler: class = ???

    @stub
    // Updates the preferred size when scrolling (if necessary).
    def BasicTreeUI.ComponentHandler: class = ???

    @stub
    // Repaints the lead selection row when focus is lost/gained.
    def BasicTreeUI.FocusHandler: class = ???

    @stub
    // This is used to get multiple key down events to appropriately generate
    // events.
    def BasicTreeUI.KeyHandler: class = ???

    @stub
    // TreeMouseListener is responsible for updating the selection
    // based on mouse events.
    def BasicTreeUI.MouseHandler: class = ???

    @stub
    // MouseInputHandler handles passing all mouse events,
    // including mouse motion events, until the mouse is released to
    // the destination it is constructed with.
    def BasicTreeUI.MouseInputHandler: class = ???

    @stub
    // Class responsible for getting size of node, method is forwarded
    // to BasicTreeUI method.
    def BasicTreeUI.NodeDimensionsHandler: class = ???

    @stub
    // PropertyChangeListener for the tree.
    def BasicTreeUI.PropertyChangeHandler: class = ???

    @stub
    // Listener on the TreeSelectionModel, resets the row selection if
    // any of the properties of the model change.
    def BasicTreeUI.SelectionModelPropertyChangeHandler: class = ???

    @stub
    // ActionListener that invokes cancelEditing when action performed.
    def BasicTreeUI.TreeCancelEditingAction: class = ???

    @stub
    // Updates the TreeState in response to nodes expanding/collapsing.
    def BasicTreeUI.TreeExpansionHandler: class = ???

    @stub
    // TreeHomeAction is used to handle end/home actions.
    def BasicTreeUI.TreeHomeAction: class = ???

    @stub
    // TreeIncrementAction is used to handle up/down actions.
    def BasicTreeUI.TreeIncrementAction: class = ???

    @stub
    // Forwards all TreeModel events to the TreeState.
    def BasicTreeUI.TreeModelHandler: class = ???

    @stub
    // TreePageAction handles page up and page down events.
    def BasicTreeUI.TreePageAction: class = ???

    @stub
    // Listens for changes in the selection model and updates the display
    // accordingly.
    def BasicTreeUI.TreeSelectionHandler: class = ???

    @stub
    // For the first selected row expandedness will be toggled.
    def BasicTreeUI.TreeToggleAction: class = ???

    @stub
    // Editor for the tree.
    protected def cellEditor: TreeCellEditor = ???

    @stub
    // 
    protected def collapsedIcon: Icon = ???

    @stub
    // Set to true if editor that is currently in the tree was
    // created by this instance.
    protected def createdCellEditor: Boolean = ???

    @stub
    // Set to true if the renderer that is currently in the tree was
    // created by this instance.
    protected def createdRenderer: Boolean = ???

    @stub
    // Renderer that is being used to do the actual cell drawing.
    protected def currentCellRenderer: TreeCellRenderer = ???

    @stub
    // How much the depth should be offset to properly calculate
    // x locations.
    protected def depthOffset: Int = ???

    @stub
    // Used for minimizing the drawing of vertical lines.
    protected def drawingCache: Hashtable[TreePath, Boolean] = ???

    @stub
    // When editing, this will be the Component that is doing the actual
    // editing.
    protected def editingComponent: Component = ???

    @stub
    // Path that is being edited.
    protected def editingPath: TreePath = ???

    @stub
    // Row that is being edited.
    protected def editingRow: Int = ???

    @stub
    // Set to true if the editor has a different size than the renderer.
    protected def editorHasDifferentSize: Boolean = ???

    @stub
    // 
    protected def expandedIcon: Icon = ???

    @stub
    // True if doing optimizations for a largeModel.
    protected def largeModel: Boolean = ???

    @stub
    // Index of the row that was last selected.
    protected def lastSelectedRow: Int = ???

    @stub
    // Distance between left margin and where vertical dashes will be
    // drawn.
    protected def leftChildIndent: Int = ???

    @stub
    // Reponsible for telling the TreeState the size needed for a node.
    protected def nodeDimensions: AbstractLayoutCache.NodeDimensions = ???

    @stub
    // Minimum preferred size.
    protected def preferredMinSize: Dimension = ???

    @stub
    // Size needed to completely display all the nodes.
    protected def preferredSize: Dimension = ???

    @stub
    // Used to paint the TreeCellRenderer.
    protected def rendererPane: CellRendererPane = ???

    @stub
    // Distance to add to leftChildIndent to determine where cell
    // contents will be drawn.
    protected def rightChildIndent: Int = ???

    @stub
    // Set to false when editing and shouldSelectCell() returns true meaning
    // the node should be selected before editing, used in completeEditing.
    protected def stopEditingInCompleteEditing: Boolean = ???

    @stub
    // Total distance that will be indented.
    protected def totalChildIndent: Int = ???

    @stub
    // Component that we're going to be drawing into.
    protected def tree: JTree = ???

    @stub
    // Used to determine what to display.
    protected def treeModel: TreeModel = ???

    @stub
    // Model maintaining the selection.
    protected def treeSelectionModel: TreeSelectionModel = ???

    @stub
    // Object responsible for handling sizing and expanded issues.
    protected def treeState: AbstractLayoutCache = ???

    @stub
    // Cancels the current editing session.
    def cancelEditing(tree: JTree): Unit = ???

    @stub
    // If the mouseX and mouseY are in the
    // expand/collapse region of the row, this will toggle
    // the row.
    protected def checkForClickInExpandControl(path: TreePath, mouseX: Int, mouseY: Int): Unit = ???

    @stub
    // Messages to stop the editing session.
    protected def completeEditing(): Unit = ???

    @stub
    // Stops the editing session.
    protected def completeEditing(messageStop: Boolean, messageCancel: Boolean, messageTree: Boolean): Unit = ???

    @stub
    // Invoked from installUI after all the defaults/listeners have been
    // installed.
    protected def completeUIInstall(): Unit = ???

    @stub
    // 
    protected def completeUIUninstall(): Unit = ???

    @stub
    // Resets the TreeState instance based on the tree we're providing the
    // look and feel for.
    protected def configureLayoutCache(): Unit = ???

    @stub
    // Creates a listener to handle events from the current editor.
    protected def createCellEditorListener(): CellEditorListener = ???

    @stub
    // Returns the renderer pane that renderer components are placed in.
    protected def createCellRendererPane(): CellRendererPane = ???

    @stub
    // Creates and returns a new ComponentHandler.
    protected def createComponentListener(): ComponentListener = ???

    @stub
    // Creates a default cell editor.
    protected def createDefaultCellEditor(): TreeCellEditor = ???

    @stub
    // Returns the default cell renderer that is used to do the
    // stamping of each node.
    protected def createDefaultCellRenderer(): TreeCellRenderer = ???

    @stub
    // Creates a listener that is responsible for updating the display
    // when focus is lost/gained.
    protected def createFocusListener(): FocusListener = ???

    @stub
    // Creates the listener reponsible for getting key events from
    // the tree.
    protected def createKeyListener(): KeyListener = ???

    @stub
    // Creates the object responsible for managing what is expanded, as
    // well as the size of nodes.
    protected def createLayoutCache(): AbstractLayoutCache = ???

    @stub
    // Creates the listener responsible for updating the selection based on
    // mouse events.
    protected def createMouseListener(): MouseListener = ???

    @stub
    // Creates an instance of NodeDimensions that is able to determine
    // the size of a given node in the tree.
    protected def createNodeDimensions(): AbstractLayoutCache.NodeDimensions = ???

    @stub
    // Creates a listener that is responsible that updates the UI based on
    // how the tree changes.
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Creates the listener responsible for getting property change
    // events from the selection model.
    protected def createSelectionModelPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // Creates and returns the object responsible for updating the treestate
    // when nodes expanded state changes.
    protected def createTreeExpansionListener(): TreeExpansionListener = ???

    @stub
    // Returns a listener that can update the tree when the model changes.
    protected def createTreeModelListener(): TreeModelListener = ???

    @stub
    // Creates the listener that updates the display based on selection change
    // methods.
    protected def createTreeSelectionListener(): TreeSelectionListener = ???

    @stub
    // 
    protected def drawCentered(c: Component, graphics: Graphics, icon: Icon, x: Int, y: Int): Unit = ???

    @stub
    // 
    protected def drawDashedHorizontalLine(g: Graphics, y: Int, x1: Int, x2: Int): Unit = ???

    @stub
    // 
    protected def drawDashedVerticalLine(g: Graphics, x: Int, y1: Int, y2: Int): Unit = ???

    @stub
    // Ensures that the rows identified by beginRow through endRow are
    // visible.
    protected def ensureRowsAreVisible(beginRow: Int, endRow: Int): Unit = ???

    @stub
    // Returns the baseline.
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    @stub
    // 
    protected def getCellEditor(): TreeCellEditor = ???

    @stub
    // Return currentCellRenderer, which will either be the trees
    // renderer, or defaultCellRenderer, which ever wasn't null.
    protected def getCellRenderer(): TreeCellRenderer = ???

    @stub
    // Returns the path to the node that is closest to x,y.
    def getClosestPathForLocation(tree: JTree, x: Int, y: Int): TreePath = ???

    @stub
    // 
    def getCollapsedIcon(): Icon = ???

    @stub
    // Returns a unbounding box for the drop line.
    protected def getDropLineRect(loc: JTree.DropLocation): Rectangle = ???

    @stub
    // Returns the path to the element that is being edited.
    def getEditingPath(tree: JTree): TreePath = ???

    @stub
    // 
    def getExpandedIcon(): Icon = ???

    @stub
    // 
    protected def getHashColor(): Color = ???

    @stub
    // The horizontal element of legs between nodes starts at the
    // right of the left-hand side of the child node by default.
    protected def getHorizontalLegBuffer(): Int = ???

    @stub
    // Returns a path to the last child of parent.
    protected def getLastChildPath(parent: TreePath): TreePath = ???

    @stub
    // Returns the lead row of the selection.
    protected def getLeadSelectionRow(): Int = ???

    @stub
    // 
    def getLeftChildIndent(): Int = ???

    @stub
    // Returns the maximum size for this component, which will be the
    // preferred size if the instance is currently in a JTree, or 0, 0.
    def getMaximumSize(c: JComponent): Dimension = ???

    @stub
    // Returns the minimum size for this component.
    def getMinimumSize(c: JComponent): Dimension = ???

    @stub
    // 
    protected def getModel(): TreeModel = ???

    @stub
    // Returns the Rectangle enclosing the label portion that the
    // last item in path will be drawn into.
    def getPathBounds(tree: JTree, path: TreePath): Rectangle = ???

    @stub
    // Returns the path for passed in row.
    def getPathForRow(tree: JTree, row: Int): TreePath = ???

    @stub
    // Returns the minimum preferred size.
    def getPreferredMinSize(): Dimension = ???

    @stub
    // Returns the preferred size to properly display the tree,
    // this is a cover method for getPreferredSize(c, true).
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Returns the preferred size to represent the tree in
    // c.
    def getPreferredSize(c: JComponent, checkConsistency: Boolean): Dimension = ???

    @stub
    // 
    def getRightChildIndent(): Int = ???

    @stub
    // Returns the number of rows that are being displayed.
    def getRowCount(tree: JTree): Int = ???

    @stub
    // Returns the row that the last item identified in path is visible
    // at.
    def getRowForPath(tree: JTree, path: TreePath): Int = ???

    @stub
    // 
    protected def getRowHeight(): Int = ???

    @stub
    // Returns the location, along the x-axis, to render a particular row
    // at.
    protected def getRowX(row: Int, depth: Int): Int = ???

    @stub
    // 
    protected def getSelectionModel(): TreeSelectionModel = ???

    @stub
    // 
    protected def getShowsRootHandles(): Boolean = ???

    @stub
    // The vertical element of legs between nodes starts at the bottom of the
    // parent node by default.
    protected def getVerticalLegBuffer(): Int = ???

    @stub
    // Messaged when the user clicks the particular row, this invokes
    // toggleExpandState.
    protected def handleExpandControlClick(path: TreePath, mouseX: Int, mouseY: Int): Unit = ???

    @stub
    // Intalls the subcomponents of the tree, which is the renderer pane.
    protected def installComponents(): Unit = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installKeyboardActions(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Configures the specified component appropriately for the look and feel.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Tells if a DropLocation should be indicated by a line between
    // nodes.
    protected def isDropLine(loc: JTree.DropLocation): Boolean = ???

    @stub
    // 
    protected def isEditable(): Boolean = ???

    @stub
    // Returns true if the tree is being edited.
    def isEditing(tree: JTree): Boolean = ???

    @stub
    // 
    protected def isLargeModel(): Boolean = ???

    @stub
    // 
    protected def isLeaf(row: Int): Boolean = ???

    @stub
    // Returns true if mouseX and mouseY fall
    // in the area of row that is used to expand/collapse the node and
    // the node at row does not represent a leaf.
    protected def isLocationInExpandControl(path: TreePath, mouseX: Int, mouseY: Int): Boolean = ???

    @stub
    // Returning true signifies a mouse event on the node should select
    // from the anchor point.
    protected def isMultiSelectEvent(event: MouseEvent): Boolean = ???

    @stub
    // 
    protected def isRootVisible(): Boolean = ???

    @stub
    // Returning true indicates the row under the mouse should be toggled
    // based on the event.
    protected def isToggleEvent(event: MouseEvent): Boolean = ???

    @stub
    // Returning true signifies a mouse event on the node should toggle
    // the selection of only the row under mouse.
    protected def isToggleSelectionEvent(event: MouseEvent): Boolean = ???

    @stub
    // Paints the specified component appropriately for the look and feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints the drop line.
    protected def paintDropLine(g: Graphics): Unit = ???

    @stub
    // Paints the expand (toggle) part of a row.
    protected def paintExpandControl(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    @stub
    // Paints a horizontal line.
    protected def paintHorizontalLine(g: Graphics, c: JComponent, y: Int, left: Int, right: Int): Unit = ???

    @stub
    // Paints the horizontal part of the leg.
    protected def paintHorizontalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    @stub
    // Paints the renderer part of a row.
    protected def paintRow(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    @stub
    // Paints a vertical line.
    protected def paintVerticalLine(g: Graphics, c: JComponent, x: Int, top: Int, bottom: Int): Unit = ???

    @stub
    // Paints the vertical part of the leg.
    protected def paintVerticalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, path: TreePath): Unit = ???

    @stub
    // Messaged from the VisibleTreeNode after it has collapsed.
    protected def pathWasCollapsed(path: TreePath): Unit = ???

    @stub
    // Messaged from the VisibleTreeNode after it has been expanded.
    protected def pathWasExpanded(path: TreePath): Unit = ???

    @stub
    // Invoked after the tree instance variable has been
    // set, but before any defaults/listeners have been installed.
    protected def prepareForUIInstall(): Unit = ???

    @stub
    // 
    protected def prepareForUIUninstall(): Unit = ???

    @stub
    // Messaged to update the selection based on a MouseEvent over a
    // particular row.
    protected def selectPathForEvent(path: TreePath, event: MouseEvent): Unit = ???

    @stub
    // Sets the cell editor.
    protected def setCellEditor(editor: TreeCellEditor): Unit = ???

    @stub
    // Sets the TreeCellRenderer to tcr.
    protected def setCellRenderer(tcr: TreeCellRenderer): Unit = ???

    @stub
    // 
    def setCollapsedIcon(newG: Icon): Unit = ???

    @stub
    // Configures the receiver to allow, or not allow, editing.
    protected def setEditable(newValue: Boolean): Unit = ???

    @stub
    // 
    def setExpandedIcon(newG: Icon): Unit = ???

    @stub
    // 
    protected def setHashColor(color: Color): Unit = ???

    @stub
    // Updates the componentListener, if necessary.
    protected def setLargeModel(largeModel: Boolean): Unit = ???

    @stub
    // 
    def setLeftChildIndent(newAmount: Int): Unit = ???

    @stub
    // Sets the TreeModel.
    protected def setModel(model: TreeModel): Unit = ???

    @stub
    // Sets the preferred minimum size.
    def setPreferredMinSize(newSize: Dimension): Unit = ???

    @stub
    // 
    def setRightChildIndent(newAmount: Int): Unit = ???

    @stub
    // Sets the root to being visible.
    protected def setRootVisible(newValue: Boolean): Unit = ???

    @stub
    // Sets the row height, this is forwarded to the treeState.
    protected def setRowHeight(rowHeight: Int): Unit = ???

    @stub
    // Resets the selection model.
    protected def setSelectionModel(newLSM: TreeSelectionModel): Unit = ???

    @stub
    // Determines whether the node handles are to be displayed.
    protected def setShowsRootHandles(newValue: Boolean): Unit = ???

    @stub
    // Returns true if the expand (toggle) control should be drawn for
    // the specified row.
    protected def shouldPaintExpandControl(path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Boolean = ???

    @stub
    // Will start editing for node if there is a cellEditor and
    // shouldSelectCell returns true.
    protected def startEditing(path: TreePath, event: MouseEvent): Boolean = ???

    @stub
    // Selects the last item in path and tries to edit it.
    def startEditingAtPath(tree: JTree, path: TreePath): Unit = ???

    @stub
    // Stops the current editing session.
    def stopEditing(tree: JTree): Boolean = ???

    @stub
    // Expands path if it is not expanded, or collapses row if it is expanded.
    protected def toggleExpandState(path: TreePath): Unit = ???

    @stub
    // Uninstalls the renderer pane.
    protected def uninstallComponents(): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallKeyboardActions(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???

    @stub
    // Updates the preferredSize instance variable,
    // which is returned from getPreferredSize().
    protected def updateCachedPreferredSize(): Unit = ???

    @stub
    // Updates the cellEditor based on the editability of the JTree that
    // we're contained in.
    protected def updateCellEditor(): Unit = ???

    @stub
    // Updates how much each depth should be offset by.
    protected def updateDepthOffset(): Unit = ???

    @stub
    // Updates the expanded state of all the descendants of path
    // by getting the expanded descendants from the tree and forwarding
    // to the tree state.
    protected def updateExpandedDescendants(path: TreePath): Unit = ???

    @stub
    // Makes all the nodes that are expanded in JTree expanded in LayoutCache.
    protected def updateLayoutCacheExpandedNodes(): Unit = ???

    @stub
    // Updates the lead row of the selection.
    protected def updateLeadSelectionRow(): Unit = ???

    @stub
    // Messaged from the tree we're in when the renderer has changed.
    protected def updateRenderer(): Unit = ???
}

object BasicTreeUI {
    @stub
    // 
    def createUI(x: JComponent): ComponentUI = ???
}
