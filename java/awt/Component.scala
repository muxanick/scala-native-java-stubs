package java.awt

import java.awt.dnd.DropTarget
import java.awt.event.{ComponentEvent, ComponentListener, FocusEvent, FocusListener, HierarchyBoundsListener, HierarchyEvent, HierarchyListener, InputMethodEvent, InputMethodListener, KeyEvent, KeyListener, MouseEvent, MouseListener, MouseMotionListener, MouseWheelEvent, MouseWheelListener}
import java.awt.im.{InputContext, InputMethodRequests}
import java.awt.image.{ColorModel, ImageObserver, ImageProducer, VolatileImage}
import java.beans.PropertyChangeListener
import java.io.{PrintStream, PrintWriter, Serializable}
import java.lang.{Class, Object, String}
import java.util.{EventListener, Locale, Set}
import javax.accessibility.AccessibleContext

// A component is an object having a graphical representation
// that can be displayed on the screen and that can interact with the
// user. Examples of components are the buttons, checkboxes, and scrollbars
// of a typical graphical user interface. 
// The Component class is the abstract superclass of
// the nonmenu-related Abstract Window Toolkit components. Class
// Component can also be extended directly to create a
// lightweight component. A lightweight component is a component that is
// not associated with a native window. On the contrary, a heavyweight
// component is associated with a native window. The isLightweight()
// method may be used to distinguish between the two kinds of the components.
// 
// Lightweight and heavyweight components may be mixed in a single component
// hierarchy. However, for correct operating of such a mixed hierarchy of
// components, the whole hierarchy must be valid. When the hierarchy gets
// invalidated, like after changing the bounds of components, or
// adding/removing components to/from containers, the whole hierarchy must be
// validated afterwards by means of the Container.validate() method
// invoked on the top-most invalid container of the hierarchy.
//
// Serialization
// It is important to note that only AWT listeners which conform
// to the Serializable protocol will be saved when
// the object is stored.  If an AWT object has listeners that
// aren't marked serializable, they will be dropped at
// writeObject time.  Developers will need, as always,
// to consider the implications of making an object serializable.
// One situation to watch out for is this:
// 
//    import java.awt.*;
//    import java.awt.event.*;
//    import java.io.Serializable;
//
//    class MyApp implements ActionListener, Serializable
//    {
//        BigObjectThatShouldNotBeSerializedWithAButton bigOne;
//        Button aButton = new Button();
//
//        MyApp()
//        {
//            // Oops, now aButton has a listener with a reference
//            // to bigOne!
//            aButton.addActionListener(this);
//        }
//
//        public void actionPerformed(ActionEvent e)
//        {
//            System.out.println("Hello There");
//        }
//    }
// 
// In this example, serializing aButton by itself
// will cause MyApp and everything it refers to
// to be serialized as well.  The problem is that the listener
// is serializable by coincidence, not by design.  To separate
// the decisions about MyApp and the
// ActionListener being serializable one can use a
// nested class, as in the following example:
// 
//    import java.awt.*;
//    import java.awt.event.*;
//    import java.io.Serializable;
//
//    class MyApp implements java.io.Serializable
//    {
//         BigObjectThatShouldNotBeSerializedWithAButton bigOne;
//         Button aButton = new Button();
//
//         static class MyActionListener implements ActionListener
//         {
//             public void actionPerformed(ActionEvent e)
//             {
//                 System.out.println("Hello There");
//             }
//         }
//
//         MyApp()
//         {
//             aButton.addActionListener(new MyActionListener());
//         }
//    }
// 
// 
// Note: For more information on the paint mechanisms utilitized
// by AWT and Swing, including information on how to write the most
// efficient painting code, see
// Painting in AWT and Swing.
// 
// For details on the focus subsystem, see
// 
// How to Use the Focus Subsystem,
// a section in The Java Tutorial, and the
// Focus Specification
// for more information.
abstract class Component extends Object with ImageObserver, with MenuContainer, with Serializable {

    // Inner class of Component used to provide default support for
    // accessibility.
    protected def Component.AccessibleAWTComponent: class

    // Inner class for blitting offscreen surfaces to a component.
    protected def Component.BltBufferStrategy: class

    // The AccessibleContext associated with this Component.
    protected def accessibleContext: AccessibleContext

    // Deprecated. 
    //As of JDK version 1.1,
    // should register this component as ActionListener on component
    // which fires action events.
    //
    def action(evt: Event, what: Object): Boolean

    // Adds the specified popup menu to the component.
    def add(popup: PopupMenu): Unit

    // Adds the specified component listener to receive component events from
    // this component.
    def addComponentListener(l: ComponentListener): Unit

    // Adds the specified focus listener to receive focus events from
    // this component when this component gains input focus.
    def addFocusListener(l: FocusListener): Unit

    // Adds the specified hierarchy bounds listener to receive hierarchy
    // bounds events from this component when the hierarchy to which this
    // container belongs changes.
    def addHierarchyBoundsListener(l: HierarchyBoundsListener): Unit

    // Adds the specified hierarchy listener to receive hierarchy changed
    // events from this component when the hierarchy to which this container
    // belongs changes.
    def addHierarchyListener(l: HierarchyListener): Unit

    // Adds the specified input method listener to receive
    // input method events from this component.
    def addInputMethodListener(l: InputMethodListener): Unit

    // Adds the specified key listener to receive key events from
    // this component.
    def addKeyListener(l: KeyListener): Unit

    // Adds the specified mouse listener to receive mouse events from
    // this component.
    def addMouseListener(l: MouseListener): Unit

    // Adds the specified mouse motion listener to receive mouse motion
    // events from this component.
    def addMouseMotionListener(l: MouseMotionListener): Unit

    // Adds the specified mouse wheel listener to receive mouse wheel events
    // from this component.
    def addMouseWheelListener(l: MouseWheelListener): Unit

    // Makes this Component displayable by connecting it to a
    // native screen resource.
    def addNotify(): Unit

    // Adds a PropertyChangeListener to the listener list.
    def addPropertyChangeListener(listener: PropertyChangeListener): Unit

    // Adds a PropertyChangeListener to the listener list for a specific
    // property.
    def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit

    // Sets the ComponentOrientation property of this component
    // and all components contained within it.
    def applyComponentOrientation(orientation: ComponentOrientation): Unit

    // Returns whether the Set of focus traversal keys for the given focus
    // traversal operation has been explicitly defined for this Component.
    def areFocusTraversalKeysSet(id: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getBounds().
    //
    def bounds(): Rectangle

    // Returns the status of the construction of a screen representation
    // of the specified image.
    def checkImage(image: Image, observer: ImageObserver): Int

    // Returns the status of the construction of a screen representation
    // of the specified image.
    def checkImage(image: Image, width: Int, height: Int, observer: ImageObserver): Int

    // Potentially coalesce an event being posted with an existing
    // event.
    protected def coalesceEvents(existingEvent: AWTEvent, newEvent: AWTEvent): AWTEvent

    // Checks whether this component "contains" the specified point,
    // where x and y are defined to be
    // relative to the coordinate system of this component.
    def contains(x: Int, y: Int): Boolean

    // Checks whether this component "contains" the specified point,
    // where the point's x and y coordinates are defined
    // to be relative to the coordinate system of this component.
    def contains(p: Point): Boolean

    // Creates an image from the specified image producer.
    def createImage(producer: ImageProducer): Image

    // Creates an off-screen drawable image
    //     to be used for double buffering.
    def createImage(width: Int, height: Int): Image

    // Creates a volatile off-screen drawable image
    //     to be used for double buffering.
    def createVolatileImage(width: Int, height: Int): VolatileImage

    // Creates a volatile off-screen drawable image, with the given capabilities.
    def createVolatileImage(width: Int, height: Int, caps: ImageCapabilities): VolatileImage

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by dispatchEvent(AWTEvent e).
    //
    def deliverEvent(e: Event): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setEnabled(boolean).
    //
    def disable(): Unit

    // Disables the events defined by the specified event mask parameter
    // from being delivered to this component.
    protected def disableEvents(eventsToDisable: Long): Unit

    // Dispatches an event to this component or one of its sub components.
    def dispatchEvent(e: AWTEvent): Unit

    // Prompts the layout manager to lay out this component.
    def doLayout(): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setEnabled(boolean).
    //
    def enable(): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setEnabled(boolean).
    //
    def enable(b: Boolean): Unit

    // Enables the events defined by the specified event mask parameter
    // to be delivered to this component.
    protected def enableEvents(eventsToEnable: Long): Unit

    // Enables or disables input method support for this component.
    def enableInputMethods(enable: Boolean): Unit

    // Support for reporting bound property changes for boolean properties.
    protected def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit

    // Reports a bound property change.
    def firePropertyChange(propertyName: String, oldValue: Byte, newValue: Byte): Unit

    // Reports a bound property change.
    def firePropertyChange(propertyName: String, oldValue: Char, newValue: Char): Unit

    // Reports a bound property change.
    def firePropertyChange(propertyName: String, oldValue: double, newValue: double): Unit

    // Reports a bound property change.
    def firePropertyChange(propertyName: String, oldValue: float, newValue: float): Unit

    // Support for reporting bound property changes for integer properties.
    protected def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit

    // Reports a bound property change.
    def firePropertyChange(propertyName: String, oldValue: Long, newValue: Long): Unit

    // Support for reporting bound property changes for Object properties.
    protected def firePropertyChange(propertyName: String, oldValue: Object, newValue: Object): Unit

    // Reports a bound property change.
    def firePropertyChange(propertyName: String, oldValue: Short, newValue: Short): Unit

    // Gets the AccessibleContext associated
    // with this Component.
    def getAccessibleContext(): AccessibleContext

    // Returns the alignment along the x axis.
    def getAlignmentX(): float

    // Returns the alignment along the y axis.
    def getAlignmentY(): float

    // Gets the background color of this component.
    def getBackground(): Color

    // Returns the baseline.
    def getBaseline(width: Int, height: Int): Int

    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(): Component.BaselineResizeBehavior

    // Gets the bounds of this component in the form of a
    // Rectangle object.
    def getBounds(): Rectangle

    // Stores the bounds of this component into "return value" rv and
    // return rv.
    def getBounds(rv: Rectangle): Rectangle

    // Gets the instance of ColorModel used to display
    // the component on the output device.
    def getColorModel(): ColorModel

    // Determines if this component or one of its immediate
    // subcomponents contains the (x, y) location,
    // and if so, returns the containing component.
    def getComponentAt(x: Int, y: Int): Component

    // Returns the component or subcomponent that contains the
    // specified point.
    def getComponentAt(p: Point): Component

    // Returns an array of all the component listeners
    // registered on this component.
    def getComponentListeners(): Array[ComponentListener]

    // Retrieves the language-sensitive orientation that is to be used to order
    // the elements or text within this component.
    def getComponentOrientation(): ComponentOrientation

    // Gets the cursor set in the component.
    def getCursor(): Cursor

    // Gets the DropTarget associated with this
    // Component.
    def getDropTarget(): DropTarget

    // Returns the Container which is the focus cycle root of this Component's
    // focus traversal cycle.
    def getFocusCycleRootAncestor(): Container

    // Returns an array of all the focus listeners
    // registered on this component.
    def getFocusListeners(): Array[FocusListener]

    // Returns the Set of focus traversal keys for a given traversal operation
    // for this Component.
    def getFocusTraversalKeys(id: Int): Set[AWTKeyStroke]

    // Returns whether focus traversal keys are enabled for this Component.
    def getFocusTraversalKeysEnabled(): Boolean

    // Gets the font of this component.
    def getFont(): Font

    // Gets the font metrics for the specified font.
    def getFontMetrics(font: Font): FontMetrics

    // Gets the foreground color of this component.
    def getForeground(): Color

    // Creates a graphics context for this component.
    def getGraphics(): Graphics

    // Gets the GraphicsConfiguration associated with this
    // Component.
    def getGraphicsConfiguration(): GraphicsConfiguration

    // Returns the current height of this component.
    def getHeight(): Int

    // Returns an array of all the hierarchy bounds listeners
    // registered on this component.
    def getHierarchyBoundsListeners(): Array[HierarchyBoundsListener]

    // Returns an array of all the hierarchy listeners
    // registered on this component.
    def getHierarchyListeners(): Array[HierarchyListener]

    // 
    def getIgnoreRepaint(): Boolean

    // Gets the input context used by this component for handling
    // the communication with input methods when text is entered
    // in this component.
    def getInputContext(): InputContext

    // Returns an array of all the input method listeners
    // registered on this component.
    def getInputMethodListeners(): Array[InputMethodListener]

    // Gets the input method request handler which supports
    // requests from input methods for this component.
    def getInputMethodRequests(): InputMethodRequests

    // Returns an array of all the key listeners
    // registered on this component.
    def getKeyListeners(): Array[KeyListener]

    // Returns an array of all the objects currently registered
    // as FooListeners
    // upon this Component.
    def Array[T]: [T <: EventListener]

    // Gets the locale of this component.
    def getLocale(): Locale

    // Gets the location of this component in the form of a
    // point specifying the component's top-left corner.
    def getLocation(): Point

    // Stores the x,y origin of this component into "return value" rv
    // and return rv.
    def getLocation(rv: Point): Point

    // Gets the location of this component in the form of a point
    // specifying the component's top-left corner in the screen's
    // coordinate space.
    def getLocationOnScreen(): Point

    // Gets the maximum size of this component.
    def getMaximumSize(): Dimension

    // Gets the minimum size of this component.
    def getMinimumSize(): Dimension

    // Returns an array of all the mouse listeners
    // registered on this component.
    def getMouseListeners(): Array[MouseListener]

    // Returns an array of all the mouse motion listeners
    // registered on this component.
    def getMouseMotionListeners(): Array[MouseMotionListener]

    // Returns the position of the mouse pointer in this Component's
    // coordinate space if the Component is directly under the mouse
    // pointer, otherwise returns null.
    def getMousePosition(): Point

    // Returns an array of all the mouse wheel listeners
    // registered on this component.
    def getMouseWheelListeners(): Array[MouseWheelListener]

    // Gets the name of the component.
    def getName(): String

    // Gets the parent of this component.
    def getParent(): Container

    // Deprecated. 
    //As of JDK version 1.1,
    // programs should not directly manipulate peers;
    // replaced by boolean isDisplayable().
    //
    def getPeer(): java.awt.peer.ComponentPeer

    // Gets the preferred size of this component.
    def getPreferredSize(): Dimension

    // Returns an array of all the property change listeners
    // registered on this component.
    def getPropertyChangeListeners(): Array[PropertyChangeListener]

    // Returns an array of all the listeners which have been associated
    // with the named property.
    def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener]

    // Returns the size of this component in the form of a
    // Dimension object.
    def getSize(): Dimension

    // Stores the width/height of this component into "return value" rv
    // and return rv.
    def getSize(rv: Dimension): Dimension

    // Gets the toolkit of this component.
    def getToolkit(): Toolkit

    // Gets this component's locking object (the object that owns the thread
    // synchronization monitor) for AWT component-tree and layout
    // operations.
    def getTreeLock(): Object

    // Returns the current width of this component.
    def getWidth(): Int

    // Returns the current x coordinate of the components origin.
    def getX(): Int

    // Returns the current y coordinate of the components origin.
    def getY(): Int

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processFocusEvent(FocusEvent).
    //
    def gotFocus(evt: Event, what: Object): Boolean

    // Deprecated. 
    //As of JDK version 1.1
    // replaced by processEvent(AWTEvent).
    //
    def handleEvent(evt: Event): Boolean

    // Returns true if this Component is the
    // focus owner.
    def hasFocus(): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setVisible(boolean).
    //
    def hide(): Unit

    // Repaints the component when the image has changed.
    def imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, w: Int, h: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by contains(int, int).
    //
    def inside(x: Int, y: Int): Boolean

    // Invalidates this component and its ancestors.
    def invalidate(): Unit

    // Returns whether the background color has been explicitly set for this
    // Component.
    def isBackgroundSet(): Boolean

    // Returns whether the cursor has been explicitly set for this Component.
    def isCursorSet(): Boolean

    // Determines whether this component is displayable.
    def isDisplayable(): Boolean

    // Returns true if this component is painted to an offscreen image
    // ("buffer") that's copied to the screen later.
    def isDoubleBuffered(): Boolean

    // Determines whether this component is enabled.
    def isEnabled(): Boolean

    // Returns whether this Component can be focused.
    def isFocusable(): Boolean

    // Returns whether the specified Container is the focus cycle root of this
    // Component's focus traversal cycle.
    def isFocusCycleRoot(container: Container): Boolean

    // Returns true if this Component is the
    //    focus owner.
    def isFocusOwner(): Boolean

    // Deprecated. 
    //As of 1.4, replaced by isFocusable().
    //
    def isFocusTraversable(): Boolean

    // Returns whether the font has been explicitly set for this Component.
    def isFontSet(): Boolean

    // Returns whether the foreground color has been explicitly set for this
    // Component.
    def isForegroundSet(): Boolean

    // A lightweight component doesn't have a native toolkit peer.
    def isLightweight(): Boolean

    // Returns true if the maximum size has been set to a non-null
    // value otherwise returns false.
    def isMaximumSizeSet(): Boolean

    // Returns whether or not setMinimumSize has been
    // invoked with a non-null value.
    def isMinimumSizeSet(): Boolean

    // Returns true if this component is completely opaque, returns
    // false by default.
    def isOpaque(): Boolean

    // Returns true if the preferred size has been set to a
    // non-null value otherwise returns false.
    def isPreferredSizeSet(): Boolean

    // Determines whether this component is showing on screen.
    def isShowing(): Boolean

    // Determines whether this component is valid.
    def isValid(): Boolean

    // Determines whether this component should be visible when its
    // parent is visible.
    def isVisible(): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processKeyEvent(KeyEvent).
    //
    def keyDown(evt: Event, key: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processKeyEvent(KeyEvent).
    //
    def keyUp(evt: Event, key: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by doLayout().
    //
    def layout(): Unit

    // Prints a listing of this component to the standard system output
    // stream System.out.
    def list(): Unit

    // Prints a listing of this component to the specified output
    // stream.
    def list(out: PrintStream): Unit

    // Prints out a list, starting at the specified indentation, to the
    // specified print stream.
    def list(out: PrintStream, indent: Int): Unit

    // Prints a listing to the specified print writer.
    def list(out: PrintWriter): Unit

    // Prints out a list, starting at the specified indentation, to
    // the specified print writer.
    def list(out: PrintWriter, indent: Int): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getComponentAt(int, int).
    //
    def locate(x: Int, y: Int): Component

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getLocation().
    //
    def location(): Point

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processFocusEvent(FocusEvent).
    //
    def lostFocus(evt: Event, what: Object): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getMinimumSize().
    //
    def minimumSize(): Dimension

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processMouseEvent(MouseEvent).
    //
    def mouseDown(evt: Event, x: Int, y: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processMouseMotionEvent(MouseEvent).
    //
    def mouseDrag(evt: Event, x: Int, y: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processMouseEvent(MouseEvent).
    //
    def mouseEnter(evt: Event, x: Int, y: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processMouseEvent(MouseEvent).
    //
    def mouseExit(evt: Event, x: Int, y: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processMouseMotionEvent(MouseEvent).
    //
    def mouseMove(evt: Event, x: Int, y: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by processMouseEvent(MouseEvent).
    //
    def mouseUp(evt: Event, x: Int, y: Int): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setLocation(int, int).
    //
    def move(x: Int, y: Int): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by transferFocus().
    //
    def nextFocus(): Unit

    // Paints this component.
    def paint(g: Graphics): Unit

    // Paints this component and all of its subcomponents.
    def paintAll(g: Graphics): Unit

    // Returns a string representing the state of this component.
    protected def paramString(): String

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by dispatchEvent(AWTEvent).
    //
    def postEvent(e: Event): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getPreferredSize().
    //
    def preferredSize(): Dimension

    // Prepares an image for rendering on this component.
    def prepareImage(image: Image, observer: ImageObserver): Boolean

    // Prepares an image for rendering on this component at the
    // specified width and height.
    def prepareImage(image: Image, width: Int, height: Int, observer: ImageObserver): Boolean

    // Prints this component.
    def print(g: Graphics): Unit

    // Prints this component and all of its subcomponents.
    def printAll(g: Graphics): Unit

    // Processes component events occurring on this component by
    // dispatching them to any registered
    // ComponentListener objects.
    protected def processComponentEvent(e: ComponentEvent): Unit

    // Processes events occurring on this component.
    protected def processEvent(e: AWTEvent): Unit

    // Processes focus events occurring on this component by
    // dispatching them to any registered
    // FocusListener objects.
    protected def processFocusEvent(e: FocusEvent): Unit

    // Processes hierarchy bounds events occurring on this component by
    // dispatching them to any registered
    // HierarchyBoundsListener objects.
    protected def processHierarchyBoundsEvent(e: HierarchyEvent): Unit

    // Processes hierarchy events occurring on this component by
    // dispatching them to any registered
    // HierarchyListener objects.
    protected def processHierarchyEvent(e: HierarchyEvent): Unit

    // Processes input method events occurring on this component by
    // dispatching them to any registered
    // InputMethodListener objects.
    protected def processInputMethodEvent(e: InputMethodEvent): Unit

    // Processes key events occurring on this component by
    // dispatching them to any registered
    // KeyListener objects.
    protected def processKeyEvent(e: KeyEvent): Unit

    // Processes mouse events occurring on this component by
    // dispatching them to any registered
    // MouseListener objects.
    protected def processMouseEvent(e: MouseEvent): Unit

    // Processes mouse motion events occurring on this component by
    // dispatching them to any registered
    // MouseMotionListener objects.
    protected def processMouseMotionEvent(e: MouseEvent): Unit

    // Processes mouse wheel events occurring on this component by
    // dispatching them to any registered
    // MouseWheelListener objects.
    protected def processMouseWheelEvent(e: MouseWheelEvent): Unit

    // Removes the specified popup menu from the component.
    def remove(popup: MenuComponent): Unit

    // Removes the specified component listener so that it no longer
    // receives component events from this component.
    def removeComponentListener(l: ComponentListener): Unit

    // Removes the specified focus listener so that it no longer
    // receives focus events from this component.
    def removeFocusListener(l: FocusListener): Unit

    // Removes the specified hierarchy bounds listener so that it no longer
    // receives hierarchy bounds events from this component.
    def removeHierarchyBoundsListener(l: HierarchyBoundsListener): Unit

    // Removes the specified hierarchy listener so that it no longer
    // receives hierarchy changed events from this component.
    def removeHierarchyListener(l: HierarchyListener): Unit

    // Removes the specified input method listener so that it no longer
    // receives input method events from this component.
    def removeInputMethodListener(l: InputMethodListener): Unit

    // Removes the specified key listener so that it no longer
    // receives key events from this component.
    def removeKeyListener(l: KeyListener): Unit

    // Removes the specified mouse listener so that it no longer
    // receives mouse events from this component.
    def removeMouseListener(l: MouseListener): Unit

    // Removes the specified mouse motion listener so that it no longer
    // receives mouse motion events from this component.
    def removeMouseMotionListener(l: MouseMotionListener): Unit

    // Removes the specified mouse wheel listener so that it no longer
    // receives mouse wheel events from this component.
    def removeMouseWheelListener(l: MouseWheelListener): Unit

    // Makes this Component undisplayable by destroying it native
    // screen resource.
    def removeNotify(): Unit

    // Removes a PropertyChangeListener from the listener list.
    def removePropertyChangeListener(listener: PropertyChangeListener): Unit

    // Removes a PropertyChangeListener from the listener
    // list for a specific property.
    def removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener): Unit

    // Repaints this component.
    def repaint(): Unit

    // Repaints the specified rectangle of this component.
    def repaint(x: Int, y: Int, width: Int, height: Int): Unit

    // Repaints the component.
    def repaint(tm: Long): Unit

    // Repaints the specified rectangle of this component within
    // tm milliseconds.
    def repaint(tm: Long, x: Int, y: Int, width: Int, height: Int): Unit

    // Requests that this Component get the input focus, and that this
    // Component's top-level ancestor become the focused Window.
    def requestFocus(): Unit

    // Requests that this Component get the input focus,
    // and that this Component's top-level ancestor
    // become the focused Window.
    protected def requestFocus(temporary: Boolean): Boolean

    // Requests that this Component get the input focus, if this
    // Component's top-level ancestor is already the focused
    // Window.
    def requestFocusInWindow(): Boolean

    // Requests that this Component get the input focus,
    // if this Component's top-level ancestor is already
    // the focused Window.
    protected def requestFocusInWindow(temporary: Boolean): Boolean

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setBounds(int, int, int, int).
    //
    def reshape(x: Int, y: Int, width: Int, height: Int): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setSize(Dimension).
    //
    def resize(d: Dimension): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setSize(int, int).
    //
    def resize(width: Int, height: Int): Unit

    // Revalidates the component hierarchy up to the nearest validate root.
    def revalidate(): Unit

    // Sets the background color of this component.
    def setBackground(c: Color): Unit

    // Moves and resizes this component.
    def setBounds(x: Int, y: Int, width: Int, height: Int): Unit

    // Moves and resizes this component to conform to the new
    // bounding rectangle r.
    def setBounds(r: Rectangle): Unit

    // Sets the language-sensitive orientation that is to be used to order
    // the elements or text within this component.
    def setComponentOrientation(o: ComponentOrientation): Unit

    // Sets the cursor image to the specified cursor.
    def setCursor(cursor: Cursor): Unit

    // Associate a DropTarget with this component.
    def setDropTarget(dt: DropTarget): Unit

    // Enables or disables this component, depending on the value of the
    // parameter b.
    def setEnabled(b: Boolean): Unit

    // Sets the focusable state of this Component to the specified value.
    def setFocusable(focusable: Boolean): Unit

    // Sets the focus traversal keys for a given traversal operation for this
    // Component.
    def setFocusTraversalKeys(id: Int, keystrokes: Set[_ <: AWTKeyStroke]): Unit

    // Sets whether focus traversal keys are enabled for this Component.
    def setFocusTraversalKeysEnabled(focusTraversalKeysEnabled: Boolean): Unit

    // Sets the font of this component.
    def setFont(f: Font): Unit

    // Sets the foreground color of this component.
    def setForeground(c: Color): Unit

    // Sets whether or not paint messages received from the operating system
    // should be ignored.
    def setIgnoreRepaint(ignoreRepaint: Boolean): Unit

    // Sets the locale of this component.
    def setLocale(l: Locale): Unit

    // Moves this component to a new location.
    def setLocation(x: Int, y: Int): Unit

    // Moves this component to a new location.
    def setLocation(p: Point): Unit

    // Sets the maximum size of this component to a constant
    // value.
    def setMaximumSize(maximumSize: Dimension): Unit

    // Sets the minimum size of this component to a constant
    // value.
    def setMinimumSize(minimumSize: Dimension): Unit

    // Sets the name of the component to the specified string.
    def setName(name: String): Unit

    // Sets the preferred size of this component to a constant
    // value.
    def setPreferredSize(preferredSize: Dimension): Unit

    // Resizes this component so that it has width d.width
    // and height d.height.
    def setSize(d: Dimension): Unit

    // Resizes this component so that it has width width
    // and height height.
    def setSize(width: Int, height: Int): Unit

    // Shows or hides this component depending on the value of parameter
    // b.
    def setVisible(b: Boolean): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setVisible(boolean).
    //
    def show(): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by setVisible(boolean).
    //
    def show(b: Boolean): Unit

    // Deprecated. 
    //As of JDK version 1.1,
    // replaced by getSize().
    //
    def size(): Dimension

    // Returns a string representation of this component and its values.
    def toString(): String

    // Transfers the focus to the next component, as though this Component were
    // the focus owner.
    def transferFocus(): Unit

    // Transfers the focus to the previous component, as though this Component
    // were the focus owner.
    def transferFocusBackward(): Unit

    // Transfers the focus up one focus traversal cycle.
    def transferFocusUpCycle(): Unit

    // Updates this component.
    def update(g: Graphics): Unit
}

object Component {
    @stub
    // Enumeration of the common ways the baseline of a component can
    // change as the size changes.
    def Component.BaselineResizeBehavior: class = ???

    @stub
    // Ease-of-use constant for getAlignmentY.
    def BOTTOM_ALIGNMENT: float = ???

    @stub
    // Ease-of-use constant for getAlignmentY and
    // getAlignmentX.
    def CENTER_ALIGNMENT: float = ???

    @stub
    // Ease-of-use constant for getAlignmentX.
    def LEFT_ALIGNMENT: float = ???

    @stub
    // Ease-of-use constant for getAlignmentX.
    def RIGHT_ALIGNMENT: float = ???
}
