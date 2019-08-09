package java.awt

import java.awt.event.{WindowEvent, WindowFocusListener, WindowListener, WindowStateListener}
import java.awt.im.InputContext
import java.awt.image.BufferStrategy
import java.beans.PropertyChangeListener
import java.lang.{Class, Object, String}
import java.util.{EventListener, List, Locale, ResourceBundle, Set}
import javax.accessibility.{Accessible, AccessibleContext}

// A Window object is a top-level window with no borders and no
// menubar.
// The default layout for a window is BorderLayout.
// 
// A window must have either a frame, dialog, or another window defined as its
// owner when it's constructed.
// 
// In a multi-screen environment, you can create a Window
// on a different screen device by constructing the Window
// with Window(Window, GraphicsConfiguration).  The
// GraphicsConfiguration object is one of the
// GraphicsConfiguration objects of the target screen device.
// 
// In a virtual device multi-screen environment in which the desktop
// area could span multiple physical screen devices, the bounds of all
// configurations are relative to the virtual device coordinate system.
// The origin of the virtual-coordinate system is at the upper left-hand
// corner of the primary physical screen.  Depending on the location of
// the primary screen in the virtual device, negative coordinates are
// possible, as shown in the following figure.
// 
// 
// 
// In such an environment, when calling setLocation,
// you must pass a virtual coordinate to this method.  Similarly,
// calling getLocationOnScreen on a Window returns
// virtual device coordinates.  Call the getBounds method
// of a GraphicsConfiguration to find its origin in the virtual
// coordinate system.
// 
// The following code sets the location of a Window
// at (10, 10) relative to the origin of the physical screen
// of the corresponding GraphicsConfiguration.  If the
// bounds of the GraphicsConfiguration is not taken
// into account, the Window location would be set
// at (10, 10) relative to the virtual-coordinate system and would appear
// on the primary physical screen, which might be different from the
// physical screen of the specified GraphicsConfiguration.
//
// 
//      Window w = new Window(Window owner, GraphicsConfiguration gc);
//      Rectangle bounds = gc.getBounds();
//      w.setLocation(10 + bounds.x, 10 + bounds.y);
// 
//
// 
// Note: the location and size of top-level windows (including
// Windows, Frames, and Dialogs)
// are under the control of the desktop's window management system.
// Calls to setLocation, setSize, and
// setBounds are requests (not directives) which are
// forwarded to the window management system.  Every effort will be
// made to honor such requests.  However, in some cases the window
// management system may ignore such requests, or modify the requested
// geometry in order to place and size the Window in a way
// that more closely matches the desktop settings.
// 
// Due to the asynchronous nature of native event handling, the results
// returned by getBounds, getLocation,
// getLocationOnScreen, and getSize might not
// reflect the actual geometry of the Window on screen until the last
// request has been processed.  During the processing of subsequent
// requests these values might change accordingly while the window
// management system fulfills the requests.
// 
// An application may set the size and location of an invisible
// Window arbitrarily, but the window management system may
// subsequently change its size and/or location when the
// Window is made visible. One or more ComponentEvents
// will be generated to indicate the new geometry.
// 
// Windows are capable of generating the following WindowEvents:
// WindowOpened, WindowClosed, WindowGainedFocus, WindowLostFocus.
class Window extends Container with Accessible {

    @stub
    // Constructs a new, initially invisible window with the specified
    // Frame as its owner.
    def this(owner: Frame) = ???

    @stub
    // Constructs a new, initially invisible window with the specified
    // Window as its owner.
    def this(owner: Window) = ???

    @stub
    // This class implements accessibility support for the
    // Window class.
    protected def Window.AccessibleAWTWindow: class = ???

    @stub
    // Makes this Window displayable by creating the connection to its
    // native screen resource.
    def addNotify(): Unit = ???

    @stub
    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    @stub
    // Adds a PropertyChangeListener to the listener list for a specific
    // property.
    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = ???

    @stub
    // Adds the specified window focus listener to receive window events
    // from this window.
    def addWindowFocusListener(l: WindowFocusListener): Unit = ???

    @stub
    // Adds the specified window listener to receive window events from
    // this window.
    def addWindowListener(l: WindowListener): Unit = ???

    @stub
    // Adds the specified window state listener to receive window
    // events from this window.
    def addWindowStateListener(l: WindowStateListener): Unit = ???

    @stub
    // Deprecated. 
    //As of J2SE 1.4, replaced by
    // Component.applyComponentOrientation.
    //
    def applyResourceBundle(rb: ResourceBundle): Unit = ???

    @stub
    // Deprecated. 
    //As of J2SE 1.4, replaced by
    // Component.applyComponentOrientation.
    //
    def applyResourceBundle(rbName: String): Unit = ???

    @stub
    // Creates a new strategy for multi-buffering on this component.
    def createBufferStrategy(numBuffers: Int): Unit = ???

    @stub
    // Creates a new strategy for multi-buffering on this component with the
    // required buffer capabilities.
    def createBufferStrategy(numBuffers: Int, caps: BufferCapabilities): Unit = ???

    @stub
    // Releases all of the native screen resources used by this
    // Window, its subcomponents, and all of its owned
    // children.
    def dispose(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this Window.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Gets the background color of this window.
    def getBackground(): Color = ???

    @stub
    // Returns the BufferStrategy used by this component.
    def getBufferStrategy(): BufferStrategy = ???

    @stub
    // Returns whether this Window can become the focused Window if it meets
    // the other requirements outlined in isFocusableWindow.
    def getFocusableWindowState(): Boolean = ???

    @stub
    // Always returns null because Windows have no ancestors; they
    // represent the top of the Component hierarchy.
    def getFocusCycleRootAncestor(): Container = ???

    @stub
    // Returns the child Component of this Window that has focus if this Window
    // is focused; returns null otherwise.
    def getFocusOwner(): Component = ???

    @stub
    // Gets a focus traversal key for this Window.
    def getFocusTraversalKeys(id: Int): Set[AWTKeyStroke] = ???

    @stub
    // Returns the sequence of images to be displayed as the icon for this window.
    def getIconImages(): List[Image] = ???

    @stub
    // Gets the input context for this window.
    def getInputContext(): InputContext = ???

    @stub
    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this Window.
    def Array[T]: [T <: EventListener] = ???

    @stub
    // Gets the Locale object that is associated
    // with this window, if the locale has been set.
    def getLocale(): Locale = ???

    @stub
    // Returns the modal exclusion type of this window.
    def getModalExclusionType(): Dialog.ModalExclusionType = ???

    @stub
    // Returns the child Component of this Window that will receive the focus
    // when this Window is focused.
    def getMostRecentFocusOwner(): Component = ???

    @stub
    // Returns the opacity of the window.
    def getOpacity(): float = ???

    @stub
    // Return an array containing all the windows this
    // window currently owns.
    def getOwnedWindows(): Array[Window] = ???

    @stub
    // Returns the owner of this window.
    def getOwner(): Window = ???

    @stub
    // Returns the shape of the window.
    def getShape(): Shape = ???

    @stub
    // Returns the toolkit of this frame.
    def getToolkit(): Toolkit = ???

    @stub
    // Returns the type of the window.
    def getType(): Window.Type = ???

    @stub
    // Gets the warning string that is displayed with this window.
    def getWarningString(): String = ???

    @stub
    // Returns an array of all the window focus listeners
    // registered on this window.
    def getWindowFocusListeners(): Array[WindowFocusListener] = ???

    @stub
    // Returns an array of all the window listeners
    // registered on this window.
    def getWindowListeners(): Array[WindowListener] = ???

    @stub
    // Returns an array of all the window state listeners
    // registered on this window.
    def getWindowStateListeners(): Array[WindowStateListener] = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.5, replaced by
    // setVisible(boolean).
    //
    def hide(): Unit = ???

    @stub
    // Returns whether this Window is active.
    def isActive(): Boolean = ???

    @stub
    // Returns whether this window is an always-on-top window.
    def isAlwaysOnTop(): Boolean = ???

    @stub
    // Returns whether the always-on-top mode is supported for this
    // window.
    def isAlwaysOnTopSupported(): Boolean = ???

    @stub
    // Returns whether this window should receive focus on subsequently being shown
    // (with a call to setVisible(true)), or being moved to the front
    // (with a call to toFront()).
    def isAutoRequestFocus(): Boolean = ???

    @stub
    // Returns whether this Window can become the focused Window, that is,
    // whether this Window or any of its subcomponents can become the focus
    // owner.
    def isFocusableWindow(): Boolean = ???

    @stub
    // Always returns true because all Windows must be roots of a
    // focus traversal cycle.
    def isFocusCycleRoot(): Boolean = ???

    @stub
    // Returns whether this Window is focused.
    def isFocused(): Boolean = ???

    @stub
    // Returns true if this Window will appear at the default location
    // for the native windowing system the next time this Window is made visible.
    def isLocationByPlatform(): Boolean = ???

    @stub
    // Indicates if the window is currently opaque.
    def isOpaque(): Boolean = ???

    @stub
    // Checks if this Window is showing on screen.
    def isShowing(): Boolean = ???

    @stub
    // Indicates if this container is a validate root.
    def isValidateRoot(): Boolean = ???

    @stub
    // Causes this Window to be sized to fit the preferred size
    // and layouts of its subcomponents.
    def pack(): Unit = ???

    @stub
    // Paints the container.
    def paint(g: Graphics): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1
    // replaced by dispatchEvent(AWTEvent).
    //
    def postEvent(e: Event): Boolean = ???

    @stub
    // Processes events on this window.
    protected def processEvent(e: AWTEvent): Unit = ???

    @stub
    // Processes window events occurring on this window by
    // dispatching them to any registered WindowListener objects.
    protected def processWindowEvent(e: WindowEvent): Unit = ???

    @stub
    // Processes window focus event occurring on this window by
    // dispatching them to any registered WindowFocusListener objects.
    protected def processWindowFocusEvent(e: WindowEvent): Unit = ???

    @stub
    // Processes window state event occurring on this window by
    // dispatching them to any registered WindowStateListener
    // objects.
    protected def processWindowStateEvent(e: WindowEvent): Unit = ???

    @stub
    // Makes this Container undisplayable by removing its connection
    // to its native screen resource.
    def removeNotify(): Unit = ???

    @stub
    // Removes the specified window focus listener so that it no longer
    // receives window events from this window.
    def removeWindowFocusListener(l: WindowFocusListener): Unit = ???

    @stub
    // Removes the specified window listener so that it no longer
    // receives window events from this window.
    def removeWindowListener(l: WindowListener): Unit = ???

    @stub
    // Removes the specified window state listener so that it no
    // longer receives window events from this window.
    def removeWindowStateListener(l: WindowStateListener): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setBounds(int, int, int, int).
    //
    def reshape(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Sets whether this window should always be above other windows.
    def setAlwaysOnTop(alwaysOnTop: Boolean): Unit = ???

    @stub
    // Sets whether this window should receive focus on
    // subsequently being shown (with a call to setVisible(true)),
    // or being moved to the front (with a call to toFront()).
    def setAutoRequestFocus(autoRequestFocus: Boolean): Unit = ???

    @stub
    // Sets the background color of this window.
    def setBackground(bgColor: Color): Unit = ???

    @stub
    // Moves and resizes this component.
    def setBounds(x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // Moves and resizes this component to conform to the new
    // bounding rectangle r.
    def setBounds(r: Rectangle): Unit = ???

    @stub
    // Set the cursor image to a specified cursor.
    def setCursor(cursor: Cursor): Unit = ???

    @stub
    // Sets whether this Window can become the focused Window if it meets
    // the other requirements outlined in isFocusableWindow.
    def setFocusableWindowState(focusableWindowState: Boolean): Unit = ???

    @stub
    // Does nothing because Windows must always be roots of a focus traversal
    // cycle.
    def setFocusCycleRoot(focusCycleRoot: Boolean): Unit = ???

    @stub
    // Sets the image to be displayed as the icon for this window.
    def setIconImage(image: Image): Unit = ???

    @stub
    // Sets the sequence of images to be displayed as the icon
    // for this window.
    def setIconImages(icons: List[_ <: Image]): Unit = ???

    @stub
    // Moves this component to a new location.
    def setLocation(x: Int, y: Int): Unit = ???

    @stub
    // Moves this component to a new location.
    def setLocation(p: Point): Unit = ???

    @stub
    // Sets whether this Window should appear at the default location for the
    // native windowing system or at the current location (returned by
    // getLocation) the next time the Window is made visible.
    def setLocationByPlatform(locationByPlatform: Boolean): Unit = ???

    @stub
    // Sets the location of the window relative to the specified
    // component according to the following scenarios.
    def setLocationRelativeTo(c: Component): Unit = ???

    @stub
    // Sets the minimum size of this window to a constant
    // value.
    def setMinimumSize(minimumSize: Dimension): Unit = ???

    @stub
    // Specifies the modal exclusion type for this window.
    def setModalExclusionType(exclusionType: Dialog.ModalExclusionType): Unit = ???

    @stub
    // Sets the opacity of the window.
    def setOpacity(opacity: float): Unit = ???

    @stub
    // Sets the shape of the window.
    def setShape(shape: Shape): Unit = ???

    @stub
    // Resizes this component so that it has width d.width
    // and height d.height.
    def setSize(d: Dimension): Unit = ???

    @stub
    // Resizes this component so that it has width width
    // and height height.
    def setSize(width: Int, height: Int): Unit = ???

    @stub
    // Sets the type of the window.
    def setType(type: Window.Type): Unit = ???

    @stub
    // Shows or hides this Window depending on the value of parameter
    // b.
    def setVisible(b: Boolean): Unit = ???

    @stub
    // Deprecated. 
    //As of JDK version 1.5, replaced by
    // setVisible(boolean).
    //
    def show(): Unit = ???

    @stub
    // If this Window is visible, sends this Window to the back and may cause
    // it to lose focus or activation if it is the focused or active Window.
    def toBack(): Unit = ???
}

object Window {
    @stub
    // Returns an array of all Windows created by this application
    // that have no owner.
    def getOwnerlessWindows(): Array[Window] = ???

    @stub
    // Returns an array of all Windows, both owned and ownerless,
    // created by this application.
    def getWindows(): Array[Window] = ???
}
