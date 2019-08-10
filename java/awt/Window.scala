package java.awt

import java.awt.event.{WindowEvent, WindowFocusListener, WindowListener, WindowStateListener}
import java.awt.im.InputContext
import java.awt.image.BufferStrategy
import java.beans.PropertyChangeListener
import java.lang.{Class, Object, String}
import java.util.{EventListener, List, Locale, ResourceBundle, Set}
import javax.accessibility.{Accessible, AccessibleContext}
import scala.scalanative.annotation.stub

/** A Window object is a top-level window with no borders and no
 *  menubar.
 *  The default layout for a window is BorderLayout.
 *  
 *  A window must have either a frame, dialog, or another window defined as its
 *  owner when it's constructed.
 *  
 *  In a multi-screen environment, you can create a Window
 *  on a different screen device by constructing the Window
 *  with Window(Window, GraphicsConfiguration).  The
 *  GraphicsConfiguration object is one of the
 *  GraphicsConfiguration objects of the target screen device.
 *  
 *  In a virtual device multi-screen environment in which the desktop
 *  area could span multiple physical screen devices, the bounds of all
 *  configurations are relative to the virtual device coordinate system.
 *  The origin of the virtual-coordinate system is at the upper left-hand
 *  corner of the primary physical screen.  Depending on the location of
 *  the primary screen in the virtual device, negative coordinates are
 *  possible, as shown in the following figure.
 *  
 *  
 *  
 *  In such an environment, when calling setLocation,
 *  you must pass a virtual coordinate to this method.  Similarly,
 *  calling getLocationOnScreen on a Window returns
 *  virtual device coordinates.  Call the getBounds method
 *  of a GraphicsConfiguration to find its origin in the virtual
 *  coordinate system.
 *  
 *  The following code sets the location of a Window
 *  at (10, 10) relative to the origin of the physical screen
 *  of the corresponding GraphicsConfiguration.  If the
 *  bounds of the GraphicsConfiguration is not taken
 *  into account, the Window location would be set
 *  at (10, 10) relative to the virtual-coordinate system and would appear
 *  on the primary physical screen, which might be different from the
 *  physical screen of the specified GraphicsConfiguration.
 * 
 *  
 *       Window w = new Window(Window owner, GraphicsConfiguration gc);
 *       Rectangle bounds = gc.getBounds();
 *       w.setLocation(10 + bounds.x, 10 + bounds.y);
 *  
 * 
 *  
 *  Note: the location and size of top-level windows (including
 *  Windows, Frames, and Dialogs)
 *  are under the control of the desktop's window management system.
 *  Calls to setLocation, setSize, and
 *  setBounds are requests (not directives) which are
 *  forwarded to the window management system.  Every effort will be
 *  made to honor such requests.  However, in some cases the window
 *  management system may ignore such requests, or modify the requested
 *  geometry in order to place and size the Window in a way
 *  that more closely matches the desktop settings.
 *  
 *  Due to the asynchronous nature of native event handling, the results
 *  returned by getBounds, getLocation,
 *  getLocationOnScreen, and getSize might not
 *  reflect the actual geometry of the Window on screen until the last
 *  request has been processed.  During the processing of subsequent
 *  requests these values might change accordingly while the window
 *  management system fulfills the requests.
 *  
 *  An application may set the size and location of an invisible
 *  Window arbitrarily, but the window management system may
 *  subsequently change its size and/or location when the
 *  Window is made visible. One or more ComponentEvents
 *  will be generated to indicate the new geometry.
 *  
 *  Windows are capable of generating the following WindowEvents:
 *  WindowOpened, WindowClosed, WindowGainedFocus, WindowLostFocus.
 */
class Window extends Container with Accessible {

    /** Constructs a new, initially invisible window with the specified
     *  Frame as its owner.
     */
    @stub
    def this(owner: Frame) = ???

    /** Constructs a new, initially invisible window with the specified
     *  Window as its owner.
     */
    @stub
    def this(owner: Window) = ???

    /** Constructs a new, initially invisible window with the specified owner
     *  Window and a GraphicsConfiguration
     *  of a screen device.
     */
    @stub
    def this(owner: Window, gc: GraphicsConfiguration) = ???

    /** This class implements accessibility support for the
     *  Window class.
     */
    protected type AccessibleAWTWindow = Window_AccessibleAWTWindow

    /** Makes this Window displayable by creating the connection to its
     *  native screen resource.
     */
    @stub
    def addNotify(): Unit = ???

    /** Adds a PropertyChangeListener to the listener list. */
    @stub
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit = ???

    /** Adds a PropertyChangeListener to the listener list for a specific
     *  property.
     */
    @stub
    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit = ???

    /** Adds the specified window focus listener to receive window events
     *  from this window.
     */
    @stub
    def addWindowFocusListener(l: WindowFocusListener): Unit = ???

    /** Adds the specified window listener to receive window events from
     *  this window.
     */
    @stub
    def addWindowListener(l: WindowListener): Unit = ???

    /** Adds the specified window state listener to receive window
     *  events from this window.
     */
    @stub
    def addWindowStateListener(l: WindowStateListener): Unit = ???

    /** Deprecated. 
     * As of J2SE 1.4, replaced by
     *  Component.applyComponentOrientation.
     * 
     */
    @stub
    def applyResourceBundle(rb: ResourceBundle): Unit = ???

    /** Deprecated. 
     * As of J2SE 1.4, replaced by
     *  Component.applyComponentOrientation.
     * 
     */
    @stub
    def applyResourceBundle(rbName: String): Unit = ???

    /** Creates a new strategy for multi-buffering on this component. */
    @stub
    def createBufferStrategy(numBuffers: Int): Unit = ???

    /** Creates a new strategy for multi-buffering on this component with the
     *  required buffer capabilities.
     */
    @stub
    def createBufferStrategy(numBuffers: Int, caps: BufferCapabilities): Unit = ???

    /** Releases all of the native screen resources used by this
     *  Window, its subcomponents, and all of its owned
     *  children.
     */
    @stub
    def dispose(): Unit = ???

    /** Gets the AccessibleContext associated with this Window. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Gets the background color of this window. */
    @stub
    def getBackground(): Color = ???

    /** Returns the BufferStrategy used by this component. */
    @stub
    def getBufferStrategy(): BufferStrategy = ???

    /** Returns whether this Window can become the focused Window if it meets
     *  the other requirements outlined in isFocusableWindow.
     */
    @stub
    def getFocusableWindowState(): Boolean = ???

    /** Always returns null because Windows have no ancestors; they
     *  represent the top of the Component hierarchy.
     */
    @stub
    def getFocusCycleRootAncestor(): Container = ???

    /** Returns the child Component of this Window that has focus if this Window
     *  is focused; returns null otherwise.
     */
    @stub
    def getFocusOwner(): Component = ???

    /** Gets a focus traversal key for this Window. */
    @stub
    def getFocusTraversalKeys(id: Int): Set[AWTKeyStroke] = ???

    /** Returns the sequence of images to be displayed as the icon for this window. */
    @stub
    def getIconImages(): List[Image] = ???

    /** Gets the input context for this window. */
    @stub
    def getInputContext(): InputContext = ???

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this Window.
     */
    @stub
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T] = ???

    /** Gets the Locale object that is associated
     *  with this window, if the locale has been set.
     */
    @stub
    def getLocale(): Locale = ???

    /** Returns the modal exclusion type of this window. */
    @stub
    def getModalExclusionType(): Dialog.ModalExclusionType = ???

    /** Returns the child Component of this Window that will receive the focus
     *  when this Window is focused.
     */
    @stub
    def getMostRecentFocusOwner(): Component = ???

    /** Returns the opacity of the window. */
    @stub
    def getOpacity(): Float = ???

    /** Return an array containing all the windows this
     *  window currently owns.
     */
    @stub
    def getOwnedWindows(): Array[Window] = ???

    /** Returns the owner of this window. */
    @stub
    def getOwner(): Window = ???

    /** Returns the shape of the window. */
    @stub
    def getShape(): Shape = ???

    /** Returns the toolkit of this frame. */
    @stub
    def getToolkit(): Toolkit = ???

    /** Returns the type of the window. */
    @stub
    def getType(): Window.Type = ???

    /** Gets the warning string that is displayed with this window. */
    @stub
    def getWarningString(): String = ???

    /** Returns an array of all the window focus listeners
     *  registered on this window.
     */
    @stub
    def getWindowFocusListeners(): Array[WindowFocusListener] = ???

    /** Returns an array of all the window listeners
     *  registered on this window.
     */
    @stub
    def getWindowListeners(): Array[WindowListener] = ???

    /** Returns an array of all the window state listeners
     *  registered on this window.
     */
    @stub
    def getWindowStateListeners(): Array[WindowStateListener] = ???

    /** Deprecated. 
     * As of JDK version 1.5, replaced by
     *  setVisible(boolean).
     * 
     */
    @stub
    def hide(): Unit = ???

    /** Returns whether this Window is active. */
    @stub
    def isActive(): Boolean = ???

    /** Returns whether this window is an always-on-top window. */
    @stub
    def isAlwaysOnTop(): Boolean = ???

    /** Returns whether the always-on-top mode is supported for this
     *  window.
     */
    @stub
    def isAlwaysOnTopSupported(): Boolean = ???

    /** Returns whether this window should receive focus on subsequently being shown
     *  (with a call to setVisible(true)), or being moved to the front
     *  (with a call to toFront()).
     */
    @stub
    def isAutoRequestFocus(): Boolean = ???

    /** Returns whether this Window can become the focused Window, that is,
     *  whether this Window or any of its subcomponents can become the focus
     *  owner.
     */
    @stub
    def isFocusableWindow(): Boolean = ???

    /** Always returns true because all Windows must be roots of a
     *  focus traversal cycle.
     */
    @stub
    def isFocusCycleRoot(): Boolean = ???

    /** Returns whether this Window is focused. */
    @stub
    def isFocused(): Boolean = ???

    /** Returns true if this Window will appear at the default location
     *  for the native windowing system the next time this Window is made visible.
     */
    @stub
    def isLocationByPlatform(): Boolean = ???

    /** Indicates if the window is currently opaque. */
    @stub
    def isOpaque(): Boolean = ???

    /** Checks if this Window is showing on screen. */
    @stub
    def isShowing(): Boolean = ???

    /** Indicates if this container is a validate root. */
    @stub
    def isValidateRoot(): Boolean = ???

    /** Causes this Window to be sized to fit the preferred size
     *  and layouts of its subcomponents.
     */
    @stub
    def pack(): Unit = ???

    /** Paints the container. */
    @stub
    def paint(g: Graphics): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1
     *  replaced by dispatchEvent(AWTEvent).
     * 
     */
    @stub
    def postEvent(e: Event): Boolean = ???

    /** Processes events on this window. */
    @stub
    protected def processEvent(e: AWTEvent): Unit = ???

    /** Processes window events occurring on this window by
     *  dispatching them to any registered WindowListener objects.
     */
    @stub
    protected def processWindowEvent(e: WindowEvent): Unit = ???

    /** Processes window focus event occurring on this window by
     *  dispatching them to any registered WindowFocusListener objects.
     */
    @stub
    protected def processWindowFocusEvent(e: WindowEvent): Unit = ???

    /** Processes window state event occurring on this window by
     *  dispatching them to any registered WindowStateListener
     *  objects.
     */
    @stub
    protected def processWindowStateEvent(e: WindowEvent): Unit = ???

    /** Makes this Container undisplayable by removing its connection
     *  to its native screen resource.
     */
    @stub
    def removeNotify(): Unit = ???

    /** Removes the specified window focus listener so that it no longer
     *  receives window events from this window.
     */
    @stub
    def removeWindowFocusListener(l: WindowFocusListener): Unit = ???

    /** Removes the specified window listener so that it no longer
     *  receives window events from this window.
     */
    @stub
    def removeWindowListener(l: WindowListener): Unit = ???

    /** Removes the specified window state listener so that it no
     *  longer receives window events from this window.
     */
    @stub
    def removeWindowStateListener(l: WindowStateListener): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by setBounds(int, int, int, int).
     * 
     */
    @stub
    def reshape(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Sets whether this window should always be above other windows. */
    @stub
    def setAlwaysOnTop(alwaysOnTop: Boolean): Unit = ???

    /** Sets whether this window should receive focus on
     *  subsequently being shown (with a call to setVisible(true)),
     *  or being moved to the front (with a call to toFront()).
     */
    @stub
    def setAutoRequestFocus(autoRequestFocus: Boolean): Unit = ???

    /** Sets the background color of this window. */
    @stub
    def setBackground(bgColor: Color): Unit = ???

    /** Moves and resizes this component. */
    @stub
    def setBounds(x: Int, y: Int, width: Int, height: Int): Unit = ???

    /** Moves and resizes this component to conform to the new
     *  bounding rectangle r.
     */
    @stub
    def setBounds(r: Rectangle): Unit = ???

    /** Set the cursor image to a specified cursor. */
    @stub
    def setCursor(cursor: Cursor): Unit = ???

    /** Sets whether this Window can become the focused Window if it meets
     *  the other requirements outlined in isFocusableWindow.
     */
    @stub
    def setFocusableWindowState(focusableWindowState: Boolean): Unit = ???

    /** Does nothing because Windows must always be roots of a focus traversal
     *  cycle.
     */
    @stub
    def setFocusCycleRoot(focusCycleRoot: Boolean): Unit = ???

    /** Sets the image to be displayed as the icon for this window. */
    @stub
    def setIconImage(image: Image): Unit = ???

    /** Sets the sequence of images to be displayed as the icon
     *  for this window.
     */
    @stub
    def setIconImages(icons: List[_ <: Image]): Unit = ???

    /** Moves this component to a new location. */
    @stub
    def setLocation(x: Int, y: Int): Unit = ???

    /** Moves this component to a new location. */
    @stub
    def setLocation(p: Point): Unit = ???

    /** Sets whether this Window should appear at the default location for the
     *  native windowing system or at the current location (returned by
     *  getLocation) the next time the Window is made visible.
     */
    @stub
    def setLocationByPlatform(locationByPlatform: Boolean): Unit = ???

    /** Sets the location of the window relative to the specified
     *  component according to the following scenarios.
     */
    @stub
    def setLocationRelativeTo(c: Component): Unit = ???

    /** Sets the minimum size of this window to a constant
     *  value.
     */
    @stub
    def setMinimumSize(minimumSize: Dimension): Unit = ???

    /** Specifies the modal exclusion type for this window. */
    @stub
    def setModalExclusionType(exclusionType: Dialog.ModalExclusionType): Unit = ???

    /** Sets the opacity of the window. */
    @stub
    def setOpacity(opacity: Float): Unit = ???

    /** Sets the shape of the window. */
    @stub
    def setShape(shape: Shape): Unit = ???

    /** Resizes this component so that it has width d.width
     *  and height d.height.
     */
    @stub
    def setSize(d: Dimension): Unit = ???

    /** Resizes this component so that it has width width
     *  and height height.
     */
    @stub
    def setSize(width: Int, height: Int): Unit = ???

    /** Sets the type of the window. */
    @stub
    def setType(type: Window.Type): Unit = ???

    /** Shows or hides this Window depending on the value of parameter
     *  b.
     */
    @stub
    def setVisible(b: Boolean): Unit = ???

    /** Deprecated. 
     * As of JDK version 1.5, replaced by
     *  setVisible(boolean).
     * 
     */
    @stub
    def show(): Unit = ???

    /** If this Window is visible, sends this Window to the back and may cause
     *  it to lose focus or activation if it is the focused or active Window.
     */
    @stub
    def toBack(): Unit = ???

    /** If this Window is visible, brings this Window to the front and may make
     *  it the focused Window.
     */
    @stub
    def toFront(): Unit = ???
}

object Window {
    /** Enumeration of available window types. */
    type Type = Window_Type

    /** Returns an array of all Windows created by this application
     *  that have no owner.
     */
    @stub
    def getOwnerlessWindows(): Array[Window] = ???

    /** Returns an array of all Windows, both owned and ownerless,
     *  created by this application.
     */
    @stub
    def getWindows(): Array[Window] = ???
}
