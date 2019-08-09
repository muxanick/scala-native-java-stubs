package javax.swing

import java.awt.{Component, Container, Cursor, Graphics, LayoutManager, Rectangle}
import java.lang.{Integer, Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.InternalFrameListener
import javax.swing.plaf.InternalFrameUI

// A lightweight object that provides many of the features of
// a native frame, including dragging, closing, becoming an icon,
// resizing, title display, and support for a menu bar.
// For task-oriented documentation and examples of using internal frames,
// see How to Use Internal Frames,
// a section in The Java Tutorial.
//
// 
//
// Generally,
// you add JInternalFrames to a JDesktopPane. The UI
// delegates the look-and-feel-specific actions to the
// DesktopManager
// object maintained by the JDesktopPane.
// 
// The JInternalFrame content pane
// is where you add child components.
// As a convenience, the add, remove, and setLayout
// methods of this class are overridden, so that they delegate calls
// to the corresponding methods of the ContentPane.
// For example, you can add a child component to an internal frame as follows:
// 
//       internalFrame.add(child);
// 
// And the child will be added to the contentPane.
// The content pane is actually managed by an instance of
// JRootPane,
// which also manages a layout pane, glass pane, and
// optional menu bar for the internal frame. Please see the
// JRootPane
// documentation for a complete description of these components.
// Refer to RootPaneContainer
// for details on adding, removing and setting the LayoutManager
// of a JInternalFrame.
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
class JInternalFrame extends JComponent with Accessible, with WindowConstants, with RootPaneContainer {

    @stub
    // Creates a non-resizable, non-closable, non-maximizable,
    // non-iconifiable JInternalFrame with no title.
    def this() = ???

    @stub
    // Creates a non-resizable, non-closable, non-maximizable,
    // non-iconifiable JInternalFrame with the specified title.
    def this(title: String) = ???

    @stub
    // Creates a non-closable, non-maximizable, non-iconifiable
    // JInternalFrame with the specified title
    // and resizability.
    def this(title: String, resizable: Boolean) = ???

    @stub
    // Creates a non-maximizable, non-iconifiable JInternalFrame
    // with the specified title, resizability, and
    // closability.
    def this(title: String, resizable: Boolean, closable: Boolean) = ???

    @stub
    // Creates a non-iconifiable JInternalFrame
    // with the specified title,
    // resizability, closability, and maximizability.
    def this(title: String, resizable: Boolean, closable: Boolean, maximizable: Boolean) = ???

    @stub
    // This class implements accessibility support for the
    // JInternalFrame class.
    protected def JInternalFrame.AccessibleJInternalFrame: class = ???

    @stub
    // The frame can be closed.
    protected def closable: Boolean = ???

    @stub
    // The icon that is displayed when this internal frame is iconified.
    protected def desktopIcon: JInternalFrame.JDesktopIcon = ???

    @stub
    // The icon shown in the top-left corner of this internal frame.
    protected def frameIcon: Icon = ???

    @stub
    // The frame can "iconified" (shrunk down and displayed as
    // an icon-image).
    protected def iconable: Boolean = ???

    @stub
    // The frame has been closed.
    protected def isClosed: Boolean = ???

    @stub
    // The frame has been iconified.
    protected def isIcon: Boolean = ???

    @stub
    // The frame has been expanded to its maximum size.
    protected def isMaximum: Boolean = ???

    @stub
    // The frame is currently selected.
    protected def isSelected: Boolean = ???

    @stub
    // The frame can be expanded to the size of the desktop pane.
    protected def maximizable: Boolean = ???

    @stub
    // The frame's size can be changed.
    protected def resizable: Boolean = ???

    @stub
    // The JRootPane instance that manages the
    // content pane
    // and optional menu bar for this internal frame, as well as the
    // glass pane.
    protected def rootPane: JRootPane = ???

    @stub
    // If true then calls to add and setLayout
    // will be forwarded to the contentPane.
    protected def rootPaneCheckingEnabled: Boolean = ???

    @stub
    // The title displayed in this internal frame's title bar.
    protected def title: String = ???

    @stub
    // Adds the specified child Component.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Adds the specified listener to receive internal
    // frame events from this internal frame.
    def addInternalFrameListener(l: InternalFrameListener): Unit = ???

    @stub
    // Called by the constructor to set up the JRootPane.
    protected def createRootPane(): JRootPane = ???

    @stub
    // Makes this internal frame
    // invisible, unselected, and closed.
    def dispose(): Unit = ???

    @stub
    // Fires an
    // INTERNAL_FRAME_CLOSING event
    // and then performs the action specified by
    // the internal frame's default close operation.
    def doDefaultCloseAction(): Unit = ???

    @stub
    // Fires an internal frame event.
    protected def fireInternalFrameEvent(id: Int): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this
    // JInternalFrame.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the content pane for this internal frame.
    def getContentPane(): Container = ???

    @stub
    // Returns the default operation that occurs when the user
    // initiates a "close" on this internal frame.
    def getDefaultCloseOperation(): Int = ???

    @stub
    // Returns the JDesktopIcon used when this
    // JInternalFrame is iconified.
    def getDesktopIcon(): JInternalFrame.JDesktopIcon = ???

    @stub
    // Convenience method that searches the ancestor hierarchy for a
    // JDesktop instance.
    def getDesktopPane(): JDesktopPane = ???

    @stub
    // Always returns null because JInternalFrames
    // must always be roots of a focus
    // traversal cycle.
    def getFocusCycleRootAncestor(): Container = ???

    @stub
    // If this JInternalFrame is active,
    // returns the child that has focus.
    def getFocusOwner(): Component = ???

    @stub
    // Returns the image displayed in the title bar of this internal frame (usually
    // in the top-left corner).
    def getFrameIcon(): Icon = ???

    @stub
    // Returns the glass pane for this internal frame.
    def getGlassPane(): Component = ???

    @stub
    // Returns an array of all the InternalFrameListeners added
    // to this JInternalFrame with
    // addInternalFrameListener.
    def getInternalFrameListeners(): Array[InternalFrameListener] = ???

    @stub
    // Returns the current JMenuBar for this
    // JInternalFrame, or null
    // if no menu bar has been set.
    def getJMenuBar(): JMenuBar = ???

    @stub
    // Returns the last Cursor that was set by the
    // setCursor method that is not a resizable
    // Cursor.
    def getLastCursor(): Cursor = ???

    @stub
    // Convenience method for getting the layer attribute of this component.
    def getLayer(): Int = ???

    @stub
    // Returns the layered pane for this internal frame.
    def getLayeredPane(): JLayeredPane = ???

    @stub
    // Deprecated. 
    //As of Swing version 1.0.3,
    // replaced by getJMenuBar().
    //
    def getMenuBar(): JMenuBar = ???

    @stub
    // Returns the child component of this JInternalFrame
    // that will receive the
    // focus when this JInternalFrame is selected.
    def getMostRecentFocusOwner(): Component = ???

    @stub
    // If the JInternalFrame is not in maximized state, returns
    // getBounds(); otherwise, returns the bounds that the
    // JInternalFrame would be restored to.
    def getNormalBounds(): Rectangle = ???

    @stub
    // Returns the rootPane object for this internal frame.
    def getRootPane(): JRootPane = ???

    @stub
    // Returns the title of the JInternalFrame.
    def getTitle(): String = ???

    @stub
    // Returns the look-and-feel object that renders this component.
    def getUI(): InternalFrameUI = ???

    @stub
    // Returns the name of the look-and-feel
    // class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Gets the warning string that is displayed with this internal frame.
    def getWarningString(): String = ???

    @stub
    // 
    def hide(): Unit = ???

    @stub
    // Returns whether this JInternalFrame can be closed by
    // some user action.
    def isClosable(): Boolean = ???

    @stub
    // Returns whether this JInternalFrame is currently closed.
    def isClosed(): Boolean = ???

    @stub
    // Always returns true because all JInternalFrames must be
    // roots of a focus traversal cycle.
    def isFocusCycleRoot(): Boolean = ???

    @stub
    // Returns whether the JInternalFrame is currently iconified.
    def isIcon(): Boolean = ???

    @stub
    // Gets the iconable property,
    // which by default is false.
    def isIconifiable(): Boolean = ???

    @stub
    // Gets the value of the maximizable property.
    def isMaximizable(): Boolean = ???

    @stub
    // Returns whether the JInternalFrame is currently maximized.
    def isMaximum(): Boolean = ???

    @stub
    // Returns whether the JInternalFrame can be resized
    // by some user action.
    def isResizable(): Boolean = ???

    @stub
    // Returns whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def isRootPaneCheckingEnabled(): Boolean = ???

    @stub
    // Returns whether the JInternalFrame is the
    // currently "selected" or active frame.
    def isSelected(): Boolean = ???

    @stub
    // Convenience method that moves this component to position -1 if its
    // parent is a JLayeredPane.
    def moveToBack(): Unit = ???

    @stub
    // Convenience method that moves this component to position 0 if its
    // parent is a JLayeredPane.
    def moveToFront(): Unit = ???

    @stub
    // Causes subcomponents of this JInternalFrame
    // to be laid out at their preferred size.
    def pack(): Unit = ???

    @stub
    // Overridden to allow optimized painting when the
    // internal frame is being dragged.
    protected def paintComponent(g: Graphics): Unit = ???

    @stub
    // Returns a string representation of this JInternalFrame.
    protected def paramString(): String = ???

    @stub
    // Removes the specified component from the container.
    def remove(comp: Component): Unit = ???

    @stub
    // Removes the specified internal frame listener so that it no longer
    // receives internal frame events from this internal frame.
    def removeInternalFrameListener(l: InternalFrameListener): Unit = ???

    @stub
    // Moves and resizes this component.
    def reshape(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Requests the internal frame to restore focus to the
    // last subcomponent that had focus.
    def restoreSubcomponentFocus(): Unit = ???

    @stub
    // Sets whether this JInternalFrame can be closed by
    // some user action.
    def setClosable(b: Boolean): Unit = ???

    @stub
    // Closes this internal frame if the argument is true.
    def setClosed(b: Boolean): Unit = ???

    @stub
    // Sets this JInternalFrame's contentPane
    // property.
    def setContentPane(c: Container): Unit = ???

    @stub
    // Sets the cursor image to the specified cursor.
    def setCursor(cursor: Cursor): Unit = ???

    @stub
    // Sets the operation that will happen by default when
    // the user initiates a "close" on this internal frame.
    def setDefaultCloseOperation(operation: Int): Unit = ???

    @stub
    // Sets the JDesktopIcon associated with this
    // JInternalFrame.
    def setDesktopIcon(d: JInternalFrame.JDesktopIcon): Unit = ???

    @stub
    // Does nothing because JInternalFrames must always be roots of a focus
    // traversal cycle.
    def setFocusCycleRoot(focusCycleRoot: Boolean): Unit = ???

    @stub
    // Sets an image to be displayed in the titlebar of this internal frame (usually
    // in the top-left corner).
    def setFrameIcon(icon: Icon): Unit = ???

    @stub
    // Sets this JInternalFrame's
    // glassPane property.
    def setGlassPane(glass: Component): Unit = ???

    @stub
    // Iconifies or de-iconifies this internal frame,
    // if the look and feel supports iconification.
    def setIcon(b: Boolean): Unit = ???

    @stub
    // Sets the iconable property,
    // which must be true
    // for the user to be able to
    // make the JInternalFrame an icon.
    def setIconifiable(b: Boolean): Unit = ???

    @stub
    // Sets the menuBar property for this JInternalFrame.
    def setJMenuBar(m: JMenuBar): Unit = ???

    @stub
    // Convenience method for setting the layer attribute of this component.
    def setLayer(layer: Int): Unit = ???

    @stub
    // Convenience method for setting the layer attribute of this component.
    def setLayer(layer: Integer): Unit = ???

    @stub
    // Sets this JInternalFrame's
    // layeredPane property.
    def setLayeredPane(layered: JLayeredPane): Unit = ???

    @stub
    // Ensures that, by default, the layout of this component cannot be set.
    def setLayout(manager: LayoutManager): Unit = ???

    @stub
    // Sets the maximizable property,
    // which determines whether the JInternalFrame
    // can be maximized by
    // some user action.
    def setMaximizable(b: Boolean): Unit = ???

    @stub
    // Maximizes and restores this internal frame.
    def setMaximum(b: Boolean): Unit = ???

    @stub
    // Deprecated. 
    //As of Swing version 1.0.3
    //  replaced by setJMenuBar(JMenuBar m).
    //
    def setMenuBar(m: JMenuBar): Unit = ???

    @stub
    // Sets the normal bounds for this internal frame, the bounds that
    // this internal frame would be restored to from its maximized state.
    def setNormalBounds(r: Rectangle): Unit = ???

    @stub
    // Sets whether the JInternalFrame can be resized by some
    // user action.
    def setResizable(b: Boolean): Unit = ???

    @stub
    // Sets the rootPane property
    // for this JInternalFrame.
    protected def setRootPane(root: JRootPane): Unit = ???

    @stub
    // Sets whether calls to add and
    // setLayout are forwarded to the contentPane.
    protected def setRootPaneCheckingEnabled(enabled: Boolean): Unit = ???

    @stub
    // Selects or deselects the internal frame
    // if it's showing.
    def setSelected(selected: Boolean): Unit = ???

    @stub
    // Sets the JInternalFrame title.
    def setTitle(title: String): Unit = ???

    @stub
    // Sets the UI delegate for this JInternalFrame.
    def setUI(ui: InternalFrameUI): Unit = ???

    @stub
    // If the internal frame is not visible,
    // brings the internal frame to the front,
    // makes it visible,
    // and attempts to select it.
    def show(): Unit = ???

    @stub
    // Sends this internal frame to the back.
    def toBack(): Unit = ???

    @stub
    // Brings this internal frame to the front.
    def toFront(): Unit = ???
}

object JInternalFrame {
    @stub
    // Bound property name.
    def CONTENT_PANE_PROPERTY: String = ???

    @stub
    // Bound property name.
    def FRAME_ICON_PROPERTY: String = ???

    @stub
    // Bound property name.
    def GLASS_PANE_PROPERTY: String = ???

    @stub
    // Constrained property name indicating that the internal frame is closed.
    def IS_CLOSED_PROPERTY: String = ???

    @stub
    // Constrained property name indicating that the internal frame is iconified.
    def IS_ICON_PROPERTY: String = ???

    @stub
    // Constrained property name indicating that the internal frame is maximized.
    def IS_MAXIMUM_PROPERTY: String = ???

    @stub
    // Constrained property name indicated that this frame has
    // selected status.
    def IS_SELECTED_PROPERTY: String = ???

    @stub
    // Bound property name.
    def LAYERED_PANE_PROPERTY: String = ???

    @stub
    // Bound property name.
    def MENU_BAR_PROPERTY: String = ???

    @stub
    // Bound property name.
    def ROOT_PANE_PROPERTY: String = ???
}
