package javax.swing.plaf.basic

import java.awt.{Color, Component, Component.BaselineResizeBehavior, Dimension, Graphics, Insets, Rectangle}
import java.awt.event.{ActionEvent, ActionListener, ComponentAdapter, ComponentEvent, ComponentListener, FocusEvent, FocusListener, KeyAdapter, KeyEvent, KeyListener, MouseAdapter, MouseEvent, MouseListener, MouseMotionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Boolean, Object, String}
import java.util.Hashtable
import javax.swing.{AbstractAction, Action, CellRendererPane, Icon, JComponent, JScrollBar, JScrollPane, JTree, JTree.DropLocation, Timer}
import javax.swing.event.{CellEditorListener, ChangeEvent, MouseInputListener, TreeExpansionEvent, TreeExpansionListener, TreeModelEvent, TreeModelListener, TreeSelectionEvent, TreeSelectionListener}
import javax.swing.plaf.{ComponentUI, TreeUI}
import javax.swing.tree.{AbstractLayoutCache, AbstractLayoutCache.NodeDimensions, TreeCellEditor, TreeCellRenderer, TreeModel, TreePath, TreeSelectionModel}
import scala.scalanative.annotation.stub

/** The basic L&F for a hierarchical data structure.
 *  
 */
class BasicTreeUI extends TreeUI {

    /**  */
    @stub
    def this() = ???

    /** Listener responsible for getting cell editing events and updating
     *  the tree accordingly.
     */
    class CellEditorHandler extends Object with CellEditorListener {

        /**  */
        @stub
        def this() = ???

        /** Messaged when editing has been canceled in the tree. */
        @stub
        def editingCanceled(e: ChangeEvent): Unit = ???

        /** Messaged when editing has stopped in the tree. */
        @stub
        def editingStopped(e: ChangeEvent): Unit = ???
    }


    /** Updates the preferred size when scrolling (if necessary). */
    class ComponentHandler extends ComponentAdapter with ActionListener {

        /**  */
        @stub
        def this() = ???

        /** ScrollBar that is being adjusted. */
        @stub
        protected val scrollBar: JScrollBar = ???

        /** Timer used when inside a scrollpane and the scrollbar is
         *  adjusting.
         */
        @stub
        protected val timer: Timer = ???

        /** Public as a result of Timer. */
        @stub
        def actionPerformed(ae: ActionEvent): Unit = ???

        /** Invoked when the component's position changes. */
        @stub
        def componentMoved(e: ComponentEvent): Unit = ???

        /** Returns the JScrollPane housing the JTree, or null if one isn't
         *  found.
         */
        @stub
        protected def getScrollPane(): JScrollPane = ???

        /** Creates, if necessary, and starts a Timer to check if need to
         *  resize the bounds.
         */
        @stub
        protected def startTimer(): Unit = ???
    }


    /** Repaints the lead selection row when focus is lost/gained. */
    class FocusHandler extends Object with FocusListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when focus is activated on the tree we're in, redraws the
         *  lead row.
         */
        @stub
        def focusGained(e: FocusEvent): Unit = ???

        /** Invoked when focus is activated on the tree we're in, redraws the
         *  lead row.
         */
        @stub
        def focusLost(e: FocusEvent): Unit = ???
    }


    /** This is used to get multiple key down events to appropriately generate
     *  events.
     */
    class KeyHandler extends KeyAdapter {

        /**  */
        @stub
        def this() = ???

        /** Set to true while keyPressed is active. */
        @stub
        protected val isKeyDown: Boolean = ???

        /** Key code that is being generated for. */
        @stub
        protected val repeatKeyAction: Action = ???

        /** Invoked when a key has been pressed. */
        @stub
        def keyPressed(e: KeyEvent): Unit = ???

        /** Invoked when a key has been released. */
        @stub
        def keyReleased(e: KeyEvent): Unit = ???

        /** Invoked when a key has been typed. */
        @stub
        def keyTyped(e: KeyEvent): Unit = ???
    }


    /** TreeMouseListener is responsible for updating the selection
     *  based on mouse events.
     */
    class MouseHandler extends MouseAdapter with MouseMotionListener {

        /**  */
        @stub
        def this() = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse button has been moved on a component
         *  (with no buttons no down).
         */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???
    }


    /** MouseInputHandler handles passing all mouse events,
     *  including mouse motion events, until the mouse is released to
     *  the destination it is constructed with. It is assumed all the
     *  events are currently target at source.
     */
    class MouseInputHandler extends Object with MouseInputListener {

        /**  */
        @stub
        def this(source: Component, destination: Component, event: MouseEvent) = ???

        /** Destination that receives all events. */
        @stub
        protected val destination: Component = ???

        /** Source that events are coming from. */
        @stub
        protected val source: Component = ???

        /** Invoked when the mouse button has been clicked (pressed
         *  and released) on a component.
         */
        @stub
        def mouseClicked(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button is pressed on a component and then
         *  dragged.
         */
        @stub
        def mouseDragged(e: MouseEvent): Unit = ???

        /** Invoked when the mouse enters a component. */
        @stub
        def mouseEntered(e: MouseEvent): Unit = ???

        /** Invoked when the mouse exits a component. */
        @stub
        def mouseExited(e: MouseEvent): Unit = ???

        /** Invoked when the mouse cursor has been moved onto a component
         *  but no buttons have been pushed.
         */
        @stub
        def mouseMoved(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been pressed on a component. */
        @stub
        def mousePressed(e: MouseEvent): Unit = ???

        /** Invoked when a mouse button has been released on a component. */
        @stub
        def mouseReleased(e: MouseEvent): Unit = ???

        /**  */
        @stub
        protected def removeFromSource(): Unit = ???
    }


    /** Class responsible for getting size of node, method is forwarded
     *  to BasicTreeUI method. X location does not include insets, that is
     *  handled in getPathBounds.
     */
    class NodeDimensionsHandler extends AbstractLayoutCache.NodeDimensions {

        /**  */
        @stub
        def this() = ???

        /** Responsible for getting the size of a particular node. */
        @stub
        def getNodeDimensions(value: Any, row: Int, depth: Int, expanded: Boolean, size: Rectangle): Rectangle = ???

        /**  */
        @stub
        protected def getRowX(row: Int, depth: Int): Int = ???
    }


    /** PropertyChangeListener for the tree. Updates the appropriate
     *  variable, or TreeState, based on what changes.
     */
    class PropertyChangeHandler extends Object with PropertyChangeListener {

        /**  */
        @stub
        def this() = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(event: PropertyChangeEvent): Unit = ???
    }


    /** Listener on the TreeSelectionModel, resets the row selection if
     *  any of the properties of the model change.
     */
    class SelectionModelPropertyChangeHandler extends Object with PropertyChangeListener {

        /**  */
        @stub
        def this() = ???

        /** This method gets called when a bound property is changed. */
        @stub
        def propertyChange(event: PropertyChangeEvent): Unit = ???
    }


    /** ActionListener that invokes cancelEditing when action performed. */
    class TreeCancelEditingAction extends AbstractAction {

        /**  */
        @stub
        def this(name: String) = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Updates the TreeState in response to nodes expanding/collapsing. */
    class TreeExpansionHandler extends Object with TreeExpansionListener {

        /**  */
        @stub
        def this() = ???

        /** Called whenever an item in the tree has been collapsed. */
        @stub
        def treeCollapsed(event: TreeExpansionEvent): Unit = ???

        /** Called whenever an item in the tree has been expanded. */
        @stub
        def treeExpanded(event: TreeExpansionEvent): Unit = ???
    }


    /** TreeHomeAction is used to handle end/home actions.
     *  Scrolls either the first or last cell to be visible based on
     *  direction.
     */
    class TreeHomeAction extends AbstractAction {

        /**  */
        @stub
        def this(direction: Int, name: String) = ???

        /**  */
        @stub
        protected val direction: Int = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** TreeIncrementAction is used to handle up/down actions.  Selection
     *  is moved up or down based on direction.
     */
    class TreeIncrementAction extends AbstractAction {

        /**  */
        @stub
        def this(direction: Int, name: String) = ???

        /** Specifies the direction to adjust the selection by. */
        @stub
        protected val direction: Int = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Forwards all TreeModel events to the TreeState. */
    class TreeModelHandler extends Object with TreeModelListener {

        /**  */
        @stub
        def this() = ???

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


    /** TreePageAction handles page up and page down events. */
    class TreePageAction extends AbstractAction {

        /**  */
        @stub
        def this(direction: Int, name: String) = ???

        /** Specifies the direction to adjust the selection by. */
        @stub
        protected val direction: Int = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Listens for changes in the selection model and updates the display
     *  accordingly.
     */
    class TreeSelectionHandler extends Object with TreeSelectionListener {

        /**  */
        @stub
        def this() = ???

        /** Messaged when the selection changes in the tree we're displaying
         *  for.
         */
        @stub
        def valueChanged(event: TreeSelectionEvent): Unit = ???
    }


    /** For the first selected row expandedness will be toggled. */
    class TreeToggleAction extends AbstractAction {

        /**  */
        @stub
        def this(name: String) = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** TreeTraverseAction is the action used for left/right keys.
     *  Will toggle the expandedness of a node, as well as potentially
     *  incrementing the selection.
     */
    class TreeTraverseAction extends AbstractAction {

        /**  */
        @stub
        def this(direction: Int, name: String) = ???

        /** Determines direction to traverse, 1 means expand, -1 means
         *  collapse.
         */
        @stub
        protected val direction: Int = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???

        /** Returns true if the action is enabled. */
        @stub
        def isEnabled(): Boolean = ???
    }


    /** Editor for the tree. */
    @stub
    protected val cellEditor: TreeCellEditor = ???

    /**  */
    @stub
    protected val collapsedIcon: Icon = ???

    /** Set to true if editor that is currently in the tree was
     *  created by this instance.
     */
    @stub
    protected val createdCellEditor: Boolean = ???

    /** Set to true if the renderer that is currently in the tree was
     *  created by this instance.
     */
    @stub
    protected val createdRenderer: Boolean = ???

    /** Renderer that is being used to do the actual cell drawing. */
    @stub
    protected val currentCellRenderer: TreeCellRenderer = ???

    /** How much the depth should be offset to properly calculate
     *  x locations.
     */
    @stub
    protected val depthOffset: Int = ???

    /** Used for minimizing the drawing of vertical lines. */
    @stub
    protected val drawingCache: Hashtable[TreePath, Boolean] = ???

    /** When editing, this will be the Component that is doing the actual
     *  editing.
     */
    @stub
    protected val editingComponent: Component = ???

    /** Path that is being edited. */
    @stub
    protected val editingPath: TreePath = ???

    /** Row that is being edited. */
    @stub
    protected val editingRow: Int = ???

    /** Set to true if the editor has a different size than the renderer. */
    @stub
    protected val editorHasDifferentSize: Boolean = ???

    /**  */
    @stub
    protected val expandedIcon: Icon = ???

    /** True if doing optimizations for a largeModel. */
    @stub
    protected val largeModel: Boolean = ???

    /** Index of the row that was last selected. */
    @stub
    protected val lastSelectedRow: Int = ???

    /** Distance between left margin and where vertical dashes will be
     *  drawn.
     */
    @stub
    protected val leftChildIndent: Int = ???

    /** Reponsible for telling the TreeState the size needed for a node. */
    @stub
    protected val nodeDimensions: AbstractLayoutCache.NodeDimensions = ???

    /** Minimum preferred size. */
    @stub
    protected val preferredMinSize: Dimension = ???

    /** Size needed to completely display all the nodes. */
    @stub
    protected val preferredSize: Dimension = ???

    /** Used to paint the TreeCellRenderer. */
    @stub
    protected val rendererPane: CellRendererPane = ???

    /** Distance to add to leftChildIndent to determine where cell
     *  contents will be drawn.
     */
    @stub
    protected val rightChildIndent: Int = ???

    /** Set to false when editing and shouldSelectCell() returns true meaning
     *  the node should be selected before editing, used in completeEditing.
     */
    @stub
    protected val stopEditingInCompleteEditing: Boolean = ???

    /** Total distance that will be indented. */
    @stub
    protected val totalChildIndent: Int = ???

    /** Component that we're going to be drawing into. */
    @stub
    protected val tree: JTree = ???

    /** Used to determine what to display. */
    @stub
    protected val treeModel: TreeModel = ???

    /** Model maintaining the selection. */
    @stub
    protected val treeSelectionModel: TreeSelectionModel = ???

    /** Object responsible for handling sizing and expanded issues. */
    @stub
    protected val treeState: AbstractLayoutCache = ???

    /** Is the preferredSize valid? */
    @stub
    protected val validCachedPreferredSize: Boolean = ???

    /** Cancels the current editing session. */
    @stub
    def cancelEditing(tree: JTree): Unit = ???

    /** If the mouseX and mouseY are in the
     *  expand/collapse region of the row, this will toggle
     *  the row.
     */
    @stub
    protected def checkForClickInExpandControl(path: TreePath, mouseX: Int, mouseY: Int): Unit = ???

    /** Messages to stop the editing session. */
    @stub
    protected def completeEditing(): Unit = ???

    /** Stops the editing session. */
    @stub
    protected def completeEditing(messageStop: Boolean, messageCancel: Boolean, messageTree: Boolean): Unit = ???

    /** Invoked from installUI after all the defaults/listeners have been
     *  installed.
     */
    @stub
    protected def completeUIInstall(): Unit = ???

    /**  */
    @stub
    protected def completeUIUninstall(): Unit = ???

    /** Resets the TreeState instance based on the tree we're providing the
     *  look and feel for.
     */
    @stub
    protected def configureLayoutCache(): Unit = ???

    /** Creates a listener to handle events from the current editor. */
    @stub
    protected def createCellEditorListener(): CellEditorListener = ???

    /** Returns the renderer pane that renderer components are placed in. */
    @stub
    protected def createCellRendererPane(): CellRendererPane = ???

    /** Creates and returns a new ComponentHandler. */
    @stub
    protected def createComponentListener(): ComponentListener = ???

    /** Creates a default cell editor. */
    @stub
    protected def createDefaultCellEditor(): TreeCellEditor = ???

    /** Returns the default cell renderer that is used to do the
     *  stamping of each node.
     */
    @stub
    protected def createDefaultCellRenderer(): TreeCellRenderer = ???

    /** Creates a listener that is responsible for updating the display
     *  when focus is lost/gained.
     */
    @stub
    protected def createFocusListener(): FocusListener = ???

    /** Creates the listener reponsible for getting key events from
     *  the tree.
     */
    @stub
    protected def createKeyListener(): KeyListener = ???

    /** Creates the object responsible for managing what is expanded, as
     *  well as the size of nodes.
     */
    @stub
    protected def createLayoutCache(): AbstractLayoutCache = ???

    /** Creates the listener responsible for updating the selection based on
     *  mouse events.
     */
    @stub
    protected def createMouseListener(): MouseListener = ???

    /** Creates an instance of NodeDimensions that is able to determine
     *  the size of a given node in the tree.
     */
    @stub
    protected def createNodeDimensions(): AbstractLayoutCache.NodeDimensions = ???

    /** Creates a listener that is responsible that updates the UI based on
     *  how the tree changes.
     */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /** Creates the listener responsible for getting property change
     *  events from the selection model.
     */
    @stub
    protected def createSelectionModelPropertyChangeListener(): PropertyChangeListener = ???

    /** Creates and returns the object responsible for updating the treestate
     *  when nodes expanded state changes.
     */
    @stub
    protected def createTreeExpansionListener(): TreeExpansionListener = ???

    /** Returns a listener that can update the tree when the model changes. */
    @stub
    protected def createTreeModelListener(): TreeModelListener = ???

    /** Creates the listener that updates the display based on selection change
     *  methods.
     */
    @stub
    protected def createTreeSelectionListener(): TreeSelectionListener = ???

    /**  */
    @stub
    protected def drawCentered(c: Component, graphics: Graphics, icon: Icon, x: Int, y: Int): Unit = ???

    /**  */
    @stub
    protected def drawDashedHorizontalLine(g: Graphics, y: Int, x1: Int, x2: Int): Unit = ???

    /**  */
    @stub
    protected def drawDashedVerticalLine(g: Graphics, x: Int, y1: Int, y2: Int): Unit = ???

    /** Ensures that the rows identified by beginRow through endRow are
     *  visible.
     */
    @stub
    protected def ensureRowsAreVisible(beginRow: Int, endRow: Int): Unit = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(c: JComponent, width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(c: JComponent): Component.BaselineResizeBehavior = ???

    /**  */
    @stub
    protected def getCellEditor(): TreeCellEditor = ???

    /** Return currentCellRenderer, which will either be the trees
     *  renderer, or defaultCellRenderer, which ever wasn't null.
     */
    @stub
    protected def getCellRenderer(): TreeCellRenderer = ???

    /** Returns the path to the node that is closest to x,y. */
    @stub
    def getClosestPathForLocation(tree: JTree, x: Int, y: Int): TreePath = ???

    /**  */
    @stub
    def getCollapsedIcon(): Icon = ???

    /** Returns a unbounding box for the drop line. */
    @stub
    protected def getDropLineRect(loc: JTree.DropLocation): Rectangle = ???

    /** Returns the path to the element that is being edited. */
    @stub
    def getEditingPath(tree: JTree): TreePath = ???

    /**  */
    @stub
    def getExpandedIcon(): Icon = ???

    /**  */
    @stub
    protected def getHashColor(): Color = ???

    /** The horizontal element of legs between nodes starts at the
     *  right of the left-hand side of the child node by default.
     */
    @stub
    protected def getHorizontalLegBuffer(): Int = ???

    /** Returns a path to the last child of parent. */
    @stub
    protected def getLastChildPath(parent: TreePath): TreePath = ???

    /** Returns the lead row of the selection. */
    @stub
    protected def getLeadSelectionRow(): Int = ???

    /**  */
    @stub
    def getLeftChildIndent(): Int = ???

    /** Returns the maximum size for this component, which will be the
     *  preferred size if the instance is currently in a JTree, or 0, 0.
     */
    @stub
    def getMaximumSize(c: JComponent): Dimension = ???

    /** Returns the minimum size for this component. */
    @stub
    def getMinimumSize(c: JComponent): Dimension = ???

    /**  */
    @stub
    protected def getModel(): TreeModel = ???

    /** Returns the Rectangle enclosing the label portion that the
     *  last item in path will be drawn into.
     */
    @stub
    def getPathBounds(tree: JTree, path: TreePath): Rectangle = ???

    /** Returns the path for passed in row. */
    @stub
    def getPathForRow(tree: JTree, row: Int): TreePath = ???

    /** Returns the minimum preferred size. */
    @stub
    def getPreferredMinSize(): Dimension = ???

    /** Returns the preferred size to properly display the tree,
     *  this is a cover method for getPreferredSize(c, true).
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Returns the preferred size to represent the tree in
     *  c.
     */
    @stub
    def getPreferredSize(c: JComponent, checkConsistency: Boolean): Dimension = ???

    /**  */
    @stub
    def getRightChildIndent(): Int = ???

    /** Returns the number of rows that are being displayed. */
    @stub
    def getRowCount(tree: JTree): Int = ???

    /** Returns the row that the last item identified in path is visible
     *  at.
     */
    @stub
    def getRowForPath(tree: JTree, path: TreePath): Int = ???

    /**  */
    @stub
    protected def getRowHeight(): Int = ???

    /** Returns the location, along the x-axis, to render a particular row
     *  at.
     */
    @stub
    protected def getRowX(row: Int, depth: Int): Int = ???

    /**  */
    @stub
    protected def getSelectionModel(): TreeSelectionModel = ???

    /**  */
    @stub
    protected def getShowsRootHandles(): Boolean = ???

    /** The vertical element of legs between nodes starts at the bottom of the
     *  parent node by default.
     */
    @stub
    protected def getVerticalLegBuffer(): Int = ???

    /** Messaged when the user clicks the particular row, this invokes
     *  toggleExpandState.
     */
    @stub
    protected def handleExpandControlClick(path: TreePath, mouseX: Int, mouseY: Int): Unit = ???

    /** Intalls the subcomponents of the tree, which is the renderer pane. */
    @stub
    protected def installComponents(): Unit = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Tells if a DropLocation should be indicated by a line between
     *  nodes.
     */
    @stub
    protected def isDropLine(loc: JTree.DropLocation): Boolean = ???

    /**  */
    @stub
    protected def isEditable(): Boolean = ???

    /** Returns true if the tree is being edited. */
    @stub
    def isEditing(tree: JTree): Boolean = ???

    /**  */
    @stub
    protected def isLargeModel(): Boolean = ???

    /**  */
    @stub
    protected def isLeaf(row: Int): Boolean = ???

    /** Returns true if mouseX and mouseY fall
     *  in the area of row that is used to expand/collapse the node and
     *  the node at row does not represent a leaf.
     */
    @stub
    protected def isLocationInExpandControl(path: TreePath, mouseX: Int, mouseY: Int): Boolean = ???

    /** Returning true signifies a mouse event on the node should select
     *  from the anchor point.
     */
    @stub
    protected def isMultiSelectEvent(event: MouseEvent): Boolean = ???

    /**  */
    @stub
    protected def isRootVisible(): Boolean = ???

    /** Returning true indicates the row under the mouse should be toggled
     *  based on the event.
     */
    @stub
    protected def isToggleEvent(event: MouseEvent): Boolean = ???

    /** Returning true signifies a mouse event on the node should toggle
     *  the selection of only the row under mouse.
     */
    @stub
    protected def isToggleSelectionEvent(event: MouseEvent): Boolean = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the drop line. */
    @stub
    protected def paintDropLine(g: Graphics): Unit = ???

    /** Paints the expand (toggle) part of a row. */
    @stub
    protected def paintExpandControl(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    /** Paints a horizontal line. */
    @stub
    protected def paintHorizontalLine(g: Graphics, c: JComponent, y: Int, left: Int, right: Int): Unit = ???

    /** Paints the horizontal part of the leg. */
    @stub
    protected def paintHorizontalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    /** Paints the renderer part of a row. */
    @stub
    protected def paintRow(g: Graphics, clipBounds: Rectangle, insets: Insets, bounds: Rectangle, path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Unit = ???

    /** Paints a vertical line. */
    @stub
    protected def paintVerticalLine(g: Graphics, c: JComponent, x: Int, top: Int, bottom: Int): Unit = ???

    /** Paints the vertical part of the leg. */
    @stub
    protected def paintVerticalPartOfLeg(g: Graphics, clipBounds: Rectangle, insets: Insets, path: TreePath): Unit = ???

    /** Messaged from the VisibleTreeNode after it has collapsed. */
    @stub
    protected def pathWasCollapsed(path: TreePath): Unit = ???

    /** Messaged from the VisibleTreeNode after it has been expanded. */
    @stub
    protected def pathWasExpanded(path: TreePath): Unit = ???

    /** Invoked after the tree instance variable has been
     *  set, but before any defaults/listeners have been installed.
     */
    @stub
    protected def prepareForUIInstall(): Unit = ???

    /**  */
    @stub
    protected def prepareForUIUninstall(): Unit = ???

    /** Messaged to update the selection based on a MouseEvent over a
     *  particular row.
     */
    @stub
    protected def selectPathForEvent(path: TreePath, event: MouseEvent): Unit = ???

    /** Sets the cell editor. */
    @stub
    protected def setCellEditor(editor: TreeCellEditor): Unit = ???

    /** Sets the TreeCellRenderer to tcr. */
    @stub
    protected def setCellRenderer(tcr: TreeCellRenderer): Unit = ???

    /**  */
    @stub
    def setCollapsedIcon(newG: Icon): Unit = ???

    /** Configures the receiver to allow, or not allow, editing. */
    @stub
    protected def setEditable(newValue: Boolean): Unit = ???

    /**  */
    @stub
    def setExpandedIcon(newG: Icon): Unit = ???

    /**  */
    @stub
    protected def setHashColor(color: Color): Unit = ???

    /** Updates the componentListener, if necessary. */
    @stub
    protected def setLargeModel(largeModel: Boolean): Unit = ???

    /**  */
    @stub
    def setLeftChildIndent(newAmount: Int): Unit = ???

    /** Sets the TreeModel. */
    @stub
    protected def setModel(model: TreeModel): Unit = ???

    /** Sets the preferred minimum size. */
    @stub
    def setPreferredMinSize(newSize: Dimension): Unit = ???

    /**  */
    @stub
    def setRightChildIndent(newAmount: Int): Unit = ???

    /** Sets the root to being visible. */
    @stub
    protected def setRootVisible(newValue: Boolean): Unit = ???

    /** Sets the row height, this is forwarded to the treeState. */
    @stub
    protected def setRowHeight(rowHeight: Int): Unit = ???

    /** Resets the selection model. */
    @stub
    protected def setSelectionModel(newLSM: TreeSelectionModel): Unit = ???

    /** Determines whether the node handles are to be displayed. */
    @stub
    protected def setShowsRootHandles(newValue: Boolean): Unit = ???

    /** Returns true if the expand (toggle) control should be drawn for
     *  the specified row.
     */
    @stub
    protected def shouldPaintExpandControl(path: TreePath, row: Int, isExpanded: Boolean, hasBeenExpanded: Boolean, isLeaf: Boolean): Boolean = ???

    /** Will start editing for node if there is a cellEditor and
     *  shouldSelectCell returns true.
     */
    @stub
    protected def startEditing(path: TreePath, event: MouseEvent): Boolean = ???

    /** Selects the last item in path and tries to edit it. */
    @stub
    def startEditingAtPath(tree: JTree, path: TreePath): Unit = ???

    /** Stops the current editing session. */
    @stub
    def stopEditing(tree: JTree): Boolean = ???

    /** Expands path if it is not expanded, or collapses row if it is expanded. */
    @stub
    protected def toggleExpandState(path: TreePath): Unit = ???

    /** Uninstalls the renderer pane. */
    @stub
    protected def uninstallComponents(): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???

    /** Updates the preferredSize instance variable,
     *  which is returned from getPreferredSize().
     */
    @stub
    protected def updateCachedPreferredSize(): Unit = ???

    /** Updates the cellEditor based on the editability of the JTree that
     *  we're contained in.
     */
    @stub
    protected def updateCellEditor(): Unit = ???

    /** Updates how much each depth should be offset by. */
    @stub
    protected def updateDepthOffset(): Unit = ???

    /** Updates the expanded state of all the descendants of path
     *  by getting the expanded descendants from the tree and forwarding
     *  to the tree state.
     */
    @stub
    protected def updateExpandedDescendants(path: TreePath): Unit = ???

    /** Makes all the nodes that are expanded in JTree expanded in LayoutCache. */
    @stub
    protected def updateLayoutCacheExpandedNodes(): Unit = ???

    /** Updates the lead row of the selection. */
    @stub
    protected def updateLeadSelectionRow(): Unit = ???

    /** Messaged from the tree we're in when the renderer has changed. */
    @stub
    protected def updateRenderer(): Unit = ???

    /** Marks the cached size as being invalid, and messages the
     *  tree with treeDidChange.
     */
    @stub
    protected def updateSize(): Unit = ???
}

object BasicTreeUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
