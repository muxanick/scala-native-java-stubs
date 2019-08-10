package javax.swing

import java.awt.{Component, Container, Cursor, Graphics, LayoutManager, Rectangle}
import java.lang.{Integer, Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.InternalFrameListener
import javax.swing.plaf.InternalFrameUI
import scala.scalanative.annotation.stub

/** A lightweight object that provides many of the features of
 *  a native frame, including dragging, closing, becoming an icon,
 *  resizing, title display, and support for a menu bar.
 *  For task-oriented documentation and examples of using internal frames,
 *  see How to Use Internal Frames,
 *  a section in The Java Tutorial.
 * 
 *  
 * 
 *  Generally,
 *  you add JInternalFrames to a JDesktopPane. The UI
 *  delegates the look-and-feel-specific actions to the
 *  DesktopManager
 *  object maintained by the JDesktopPane.
 *  
 *  The JInternalFrame content pane
 *  is where you add child components.
 *  As a convenience, the add, remove, and setLayout
 *  methods of this class are overridden, so that they delegate calls
 *  to the corresponding methods of the ContentPane.
 *  For example, you can add a child component to an internal frame as follows:
 *  
 *        internalFrame.add(child);
 *  
 *  And the child will be added to the contentPane.
 *  The content pane is actually managed by an instance of
 *  JRootPane,
 *  which also manages a layout pane, glass pane, and
 *  optional menu bar for the internal frame. Please see the
 *  JRootPane
 *  documentation for a complete description of these components.
 *  Refer to RootPaneContainer
 *  for details on adding, removing and setting the LayoutManager
 *  of a JInternalFrame.
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
 */
class JInternalFrame extends JComponent with Accessible with WindowConstants with RootPaneContainer {

    /** Creates a non-resizable, non-closable, non-maximizable,
     *  non-iconifiable JInternalFrame with no title.
     */
    @stub
    def this() = ???

    /** Creates a non-resizable, non-closable, non-maximizable,
     *  non-iconifiable JInternalFrame with the specified title.
     */
    @stub
    def this(title: String) = ???

    /** Creates a non-closable, non-maximizable, non-iconifiable
     *  JInternalFrame with the specified title
     *  and resizability.
     */
    @stub
    def this(title: String, resizable: Boolean) = ???

    /** Creates a non-maximizable, non-iconifiable JInternalFrame
     *  with the specified title, resizability, and
     *  closability.
     */
    @stub
    def this(title: String, resizable: Boolean, closable: Boolean) = ???

    /** Creates a non-iconifiable JInternalFrame
     *  with the specified title,
     *  resizability, closability, and maximizability.
     */
    @stub
    def this(title: String, resizable: Boolean, closable: Boolean, maximizable: Boolean) = ???

    /** Creates a JInternalFrame with the specified title,
     *  resizability, closability, maximizability, and iconifiability.
     */
    @stub
    def this(title: String, resizable: Boolean, closable: Boolean, maximizable: Boolean, iconifiable: Boolean) = ???

    /** This class implements accessibility support for the
     *  JInternalFrame class.
     */
    protected type AccessibleJInternalFrame = JInternalFrame_AccessibleJInternalFrame

    /** The frame can be closed. */
    @stub
    protected val closable: Boolean = ???

    /** The icon that is displayed when this internal frame is iconified. */
    @stub
    protected val desktopIcon: JInternalFrame.JDesktopIcon = ???

    /** The icon shown in the top-left corner of this internal frame. */
    @stub
    protected val frameIcon: Icon = ???

    /** The frame can "iconified" (shrunk down and displayed as
     *  an icon-image).
     */
    @stub
    protected val iconable: Boolean = ???

    /** The frame has been closed. */
    @stub
    protected val isClosed: Boolean = ???

    /** The frame has been iconified. */
    @stub
    protected val isIcon: Boolean = ???

    /** The frame has been expanded to its maximum size. */
    @stub
    protected val isMaximum: Boolean = ???

    /** The frame is currently selected. */
    @stub
    protected val isSelected: Boolean = ???

    /** The frame can be expanded to the size of the desktop pane. */
    @stub
    protected val maximizable: Boolean = ???

    /** The frame's size can be changed. */
    @stub
    protected val resizable: Boolean = ???

    /** The JRootPane instance that manages the
     *  content pane
     *  and optional menu bar for this internal frame, as well as the
     *  glass pane.
     */
    @stub
    protected val rootPane: JRootPane = ???

    /** If true then calls to add and setLayout
     *  will be forwarded to the contentPane.
     */
    @stub
    protected val rootPaneCheckingEnabled: Boolean = ???

    /** The title displayed in this internal frame's title bar. */
    @stub
    protected val title: String = ???

    /** Adds the specified child Component. */
    @stub
    protected def addImpl(comp: Component, constraints: Any, index: Int): Unit = ???

    /** Adds the specified listener to receive internal
     *  frame events from this internal frame.
     */
    @stub
    def addInternalFrameListener(l: InternalFrameListener): Unit = ???

    /** Called by the constructor to set up the JRootPane. */
    @stub
    protected def createRootPane(): JRootPane = ???

    /** Makes this internal frame
     *  invisible, unselected, and closed.
     */
    @stub
    def dispose(): Unit = ???

    /** Fires an
     *  INTERNAL_FRAME_CLOSING event
     *  and then performs the action specified by
     *  the internal frame's default close operation.
     */
    @stub
    def doDefaultCloseAction(): Unit = ???

    /** Fires an internal frame event. */
    @stub
    protected def fireInternalFrameEvent(id: Int): Unit = ???

    /** Gets the AccessibleContext associated with this
     *  JInternalFrame.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the content pane for this internal frame. */
    @stub
    def getContentPane(): Container = ???

    /** Returns the default operation that occurs when the user
     *  initiates a "close" on this internal frame.
     */
    @stub
    def getDefaultCloseOperation(): Int = ???

    /** Returns the JDesktopIcon used when this
     *  JInternalFrame is iconified.
     */
    @stub
    def getDesktopIcon(): JInternalFrame.JDesktopIcon = ???

    /** Convenience method that searches the ancestor hierarchy for a
     *  JDesktop instance.
     */
    @stub
    def getDesktopPane(): JDesktopPane = ???

    /** Always returns null because JInternalFrames
     *  must always be roots of a focus
     *  traversal cycle.
     */
    @stub
    def getFocusCycleRootAncestor(): Container = ???

    /** If this JInternalFrame is active,
     *  returns the child that has focus.
     */
    @stub
    def getFocusOwner(): Component = ???

    /** Returns the image displayed in the title bar of this internal frame (usually
     *  in the top-left corner).
     */
    @stub
    def getFrameIcon(): Icon = ???

    /** Returns the glass pane for this internal frame. */
    @stub
    def getGlassPane(): Component = ???

    /** Returns an array of all the InternalFrameListeners added
     *  to this JInternalFrame with
     *  addInternalFrameListener.
     */
    @stub
    def getInternalFrameListeners(): Array[InternalFrameListener] = ???

    /** Returns the current JMenuBar for this
     *  JInternalFrame, or null
     *  if no menu bar has been set.
     */
    @stub
    def getJMenuBar(): JMenuBar = ???

    /** Returns the last Cursor that was set by the
     *  setCursor method that is not a resizable
     *  Cursor.
     */
    @stub
    def getLastCursor(): Cursor = ???

    /** Convenience method for getting the layer attribute of this component. */
    @stub
    def getLayer(): Int = ???

    /** Returns the layered pane for this internal frame. */
    @stub
    def getLayeredPane(): JLayeredPane = ???

    /** Deprecated. 
     * As of Swing version 1.0.3,
     *  replaced by getJMenuBar().
     * 
     */
    @stub
    def getMenuBar(): JMenuBar = ???

    /** Returns the child component of this JInternalFrame
     *  that will receive the
     *  focus when this JInternalFrame is selected.
     */
    @stub
    def getMostRecentFocusOwner(): Component = ???

    /** If the JInternalFrame is not in maximized state, returns
     *  getBounds(); otherwise, returns the bounds that the
     *  JInternalFrame would be restored to.
     */
    @stub
    def getNormalBounds(): Rectangle = ???

    /** Returns the rootPane object for this internal frame. */
    @stub
    def getRootPane(): JRootPane = ???

    /** Returns the title of the JInternalFrame. */
    @stub
    def getTitle(): String = ???

    /** Returns the look-and-feel object that renders this component. */
    @stub
    def getUI(): InternalFrameUI = ???

    /** Returns the name of the look-and-feel
     *  class that renders this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Gets the warning string that is displayed with this internal frame. */
    @stub
    def getWarningString(): String = ???

    /**  */
    @stub
    def hide(): Unit = ???

    /** Returns whether this JInternalFrame can be closed by
     *  some user action.
     */
    @stub
    def isClosable(): Boolean = ???

    /** Returns whether this JInternalFrame is currently closed. */
    @stub
    def isClosed(): Boolean = ???

    /** Always returns true because all JInternalFrames must be
     *  roots of a focus traversal cycle.
     */
    @stub
    def isFocusCycleRoot(): Boolean = ???

    /** Returns whether the JInternalFrame is currently iconified. */
    @stub
    def isIcon(): Boolean = ???

    /** Gets the iconable property,
     *  which by default is false.
     */
    @stub
    def isIconifiable(): Boolean = ???

    /** Gets the value of the maximizable property. */
    @stub
    def isMaximizable(): Boolean = ???

    /** Returns whether the JInternalFrame is currently maximized. */
    @stub
    def isMaximum(): Boolean = ???

    /** Returns whether the JInternalFrame can be resized
     *  by some user action.
     */
    @stub
    def isResizable(): Boolean = ???

    /** Returns whether calls to add and
     *  setLayout are forwarded to the contentPane.
     */
    @stub
    protected def isRootPaneCheckingEnabled(): Boolean = ???

    /** Returns whether the JInternalFrame is the
     *  currently "selected" or active frame.
     */
    @stub
    def isSelected(): Boolean = ???

    /** Convenience method that moves this component to position -1 if its
     *  parent is a JLayeredPane.
     */
    @stub
    def moveToBack(): Unit = ???

    /** Convenience method that moves this component to position 0 if its
     *  parent is a JLayeredPane.
     */
    @stub
    def moveToFront(): Unit = ???

    /** Causes subcomponents of this JInternalFrame
     *  to be laid out at their preferred size.
     */
    @stub
    def pack(): Unit = ???

    /** Overridden to allow optimized painting when the
     *  internal frame is being dragged.
     */
    @stub
    protected def paintComponent(g: Graphics): Unit = ???

    /** Returns a string representation of this JInternalFrame. */
    @stub
    protected def paramString(): String = ???

    /** Removes the specified component from the container. */
    @stub
    def remove(comp: Component): Unit = ???

    /** Removes the specified internal frame listener so that it no longer
     *  receives internal frame events from this internal frame.
     */
    @stub
    def removeInternalFrameListener(l: InternalFrameListener): Unit = ???

    /** Moves and resizes this component. */
    @stub
    def reshape(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Requests the internal frame to restore focus to the
     *  last subcomponent that had focus.
     */
    @stub
    def restoreSubcomponentFocus(): Unit = ???

    /** Sets whether this JInternalFrame can be closed by
     *  some user action.
     */
    @stub
    def setClosable(b: Boolean): Unit = ???

    /** Closes this internal frame if the argument is true. */
    @stub
    def setClosed(b: Boolean): Unit = ???

    /** Sets this JInternalFrame's contentPane
     *  property.
     */
    @stub
    def setContentPane(c: Container): Unit = ???

    /** Sets the cursor image to the specified cursor. */
    @stub
    def setCursor(cursor: Cursor): Unit = ???

    /** Sets the operation that will happen by default when
     *  the user initiates a "close" on this internal frame.
     */
    @stub
    def setDefaultCloseOperation(operation: Int): Unit = ???

    /** Sets the JDesktopIcon associated with this
     *  JInternalFrame.
     */
    @stub
    def setDesktopIcon(d: JInternalFrame.JDesktopIcon): Unit = ???

    /** Does nothing because JInternalFrames must always be roots of a focus
     *  traversal cycle.
     */
    @stub
    def setFocusCycleRoot(focusCycleRoot: Boolean): Unit = ???

    /** Sets an image to be displayed in the titlebar of this internal frame (usually
     *  in the top-left corner).
     */
    @stub
    def setFrameIcon(icon: Icon): Unit = ???

    /** Sets this JInternalFrame's
     *  glassPane property.
     */
    @stub
    def setGlassPane(glass: Component): Unit = ???

    /** Iconifies or de-iconifies this internal frame,
     *  if the look and feel supports iconification.
     */
    @stub
    def setIcon(b: Boolean): Unit = ???

    /** Sets the iconable property,
     *  which must be true
     *  for the user to be able to
     *  make the JInternalFrame an icon.
     */
    @stub
    def setIconifiable(b: Boolean): Unit = ???

    /** Sets the menuBar property for this JInternalFrame. */
    @stub
    def setJMenuBar(m: JMenuBar): Unit = ???

    /** Convenience method for setting the layer attribute of this component. */
    @stub
    def setLayer(layer: Int): Unit = ???

    /** Convenience method for setting the layer attribute of this component. */
    @stub
    def setLayer(layer: Integer): Unit = ???

    /** Sets this JInternalFrame's
     *  layeredPane property.
     */
    @stub
    def setLayeredPane(layered: JLayeredPane): Unit = ???

    /** Ensures that, by default, the layout of this component cannot be set. */
    @stub
    def setLayout(manager: LayoutManager): Unit = ???

    /** Sets the maximizable property,
     *  which determines whether the JInternalFrame
     *  can be maximized by
     *  some user action.
     */
    @stub
    def setMaximizable(b: Boolean): Unit = ???

    /** Maximizes and restores this internal frame. */
    @stub
    def setMaximum(b: Boolean): Unit = ???

    /** Deprecated. 
     * As of Swing version 1.0.3
     *   replaced by setJMenuBar(JMenuBar m).
     * 
     */
    @stub
    def setMenuBar(m: JMenuBar): Unit = ???

    /** Sets the normal bounds for this internal frame, the bounds that
     *  this internal frame would be restored to from its maximized state.
     */
    @stub
    def setNormalBounds(r: Rectangle): Unit = ???

    /** Sets whether the JInternalFrame can be resized by some
     *  user action.
     */
    @stub
    def setResizable(b: Boolean): Unit = ???

    /** Sets the rootPane property
     *  for this JInternalFrame.
     */
    @stub
    protected def setRootPane(root: JRootPane): Unit = ???

    /** Sets whether calls to add and
     *  setLayout are forwarded to the contentPane.
     */
    @stub
    protected def setRootPaneCheckingEnabled(enabled: Boolean): Unit = ???

    /** Selects or deselects the internal frame
     *  if it's showing.
     */
    @stub
    def setSelected(selected: Boolean): Unit = ???

    /** Sets the JInternalFrame title. */
    @stub
    def setTitle(title: String): Unit = ???

    /** Sets the UI delegate for this JInternalFrame. */
    @stub
    def setUI(ui: InternalFrameUI): Unit = ???

    /** If the internal frame is not visible,
     *  brings the internal frame to the front,
     *  makes it visible,
     *  and attempts to select it.
     */
    @stub
    def show(): Unit = ???

    /** Sends this internal frame to the back. */
    @stub
    def toBack(): Unit = ???

    /** Brings this internal frame to the front. */
    @stub
    def toFront(): Unit = ???

    /** Notification from the UIManager that the look and feel
     *  has changed.
     */
    @stub
    def updateUI(): Unit = ???
}

object JInternalFrame {
    /** This component represents an iconified version of a
     *  JInternalFrame.
     */
    type JDesktopIcon = JInternalFrame_JDesktopIcon

    /** Bound property name. */
    @stub
    val CONTENT_PANE_PROPERTY: String = ???

    /** Bound property name. */
    @stub
    val FRAME_ICON_PROPERTY: String = ???

    /** Bound property name. */
    @stub
    val GLASS_PANE_PROPERTY: String = ???

    /** Constrained property name indicating that the internal frame is closed. */
    @stub
    val IS_CLOSED_PROPERTY: String = ???

    /** Constrained property name indicating that the internal frame is iconified. */
    @stub
    val IS_ICON_PROPERTY: String = ???

    /** Constrained property name indicating that the internal frame is maximized. */
    @stub
    val IS_MAXIMUM_PROPERTY: String = ???

    /** Constrained property name indicated that this frame has
     *  selected status.
     */
    @stub
    val IS_SELECTED_PROPERTY: String = ???

    /** Bound property name. */
    @stub
    val LAYERED_PANE_PROPERTY: String = ???

    /** Bound property name. */
    @stub
    val MENU_BAR_PROPERTY: String = ???

    /** Bound property name. */
    @stub
    val ROOT_PANE_PROPERTY: String = ???

    /** Bound property name. */
    @stub
    val TITLE_PROPERTY: String = ???
}
