package javax.swing

import java.awt.{AWTKeyStroke, Color, Component, Component.BaselineResizeBehavior, Container, Dimension, Font, FontMetrics, Graphics, Insets, Point, Rectangle}
import java.awt.event.{ActionListener, KeyEvent, MouseEvent}
import java.beans.VetoableChangeListener
import java.io.Serializable
import java.lang.{Class, Object, String}
import java.util.{EventListener, Locale, Set}
import javax.swing.border.Border
import javax.swing.event.{AncestorListener, EventListenerList}
import javax.swing.plaf.ComponentUI
import scala.scalanative.annotation.stub

/** The base class for all Swing components except top-level containers.
 *  To use a component that inherits from JComponent,
 *  you must place the component in a containment hierarchy
 *  whose root is a top-level Swing container.
 *  Top-level Swing containers --
 *  such as JFrame, JDialog,
 *  and JApplet --
 *  are specialized components
 *  that provide a place for other Swing components to paint themselves.
 *  For an explanation of containment hierarchies, see
 *  Swing Components and the Containment Hierarchy,
 *  a section in The Java Tutorial.
 * 
 *  
 *  The JComponent class provides:
 *  
 *  The base class for both standard and custom components
 *      that use the Swing architecture.
 *  A "pluggable look and feel" (L&F) that can be specified by the
 *      programmer or (optionally) selected by the user at runtime.
 *      The look and feel for each component is provided by a
 *      UI delegate -- an object that descends from
 *      ComponentUI.
 *      See How
 *      to Set the Look and Feel
 *      in The Java Tutorial
 *      for more information.
 *  Comprehensive keystroke handling.
 *      See the document How to Use Key Bindings,
 *      an article in The Java Tutorial,
 *      for more information.
 *  Support for tool tips --
 *      short descriptions that pop up when the cursor lingers
 *      over a component.
 *      See How
 *      to Use Tool Tips
 *      in The Java Tutorial
 *      for more information.
 *  Support for accessibility.
 *      JComponent contains all of the methods in the
 *      Accessible interface,
 *      but it doesn't actually implement the interface.  That is the
 *      responsibility of the individual classes
 *      that extend JComponent.
 *  Support for component-specific properties.
 *      With the putClientProperty(java.lang.Object, java.lang.Object)
 *      and getClientProperty(java.lang.Object) methods,
 *      you can associate name-object pairs
 *      with any object that descends from JComponent.
 *  An infrastructure for painting
 *      that includes double buffering and support for borders.
 *      For more information see Painting and
 *  How
 *      to Use Borders,
 *      both of which are sections in The Java Tutorial.
 *  
 *  For more information on these subjects, see the
 *  Swing package description
 *  and The Java Tutorial section
 *  The JComponent Class.
 *  
 *  JComponent and its subclasses document default values
 *  for certain properties.  For example, JTable documents the
 *  default row height as 16.  Each JComponent subclass
 *  that has a ComponentUI will create the
 *  ComponentUI as part of its constructor.  In order
 *  to provide a particular look and feel each
 *  ComponentUI may set properties back on the
 *  JComponent that created it.  For example, a custom
 *  look and feel may require JTables to have a row
 *  height of 24. The documented defaults are the value of a property
 *  BEFORE the ComponentUI has been installed.  If you
 *  need a specific value for a particular property you should
 *  explicitly set it.
 *  
 *  In release 1.4, the focus subsystem was rearchitected.
 *  For more information, see
 *  
 *  How to Use the Focus Subsystem,
 *  a section in The Java Tutorial.
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
abstract class JComponent extends Container with Serializable {

    /** Default JComponent constructor. */
    @stub
    def this() = ???

    /** Inner class of JComponent used to provide default support for
     *  accessibility.
     */
    type AccessibleJComponent = JComponent_AccessibleJComponent

    /** A list of event listeners for this component. */
    protected val listenerList: EventListenerList

    /** The look and feel delegate for this component. */
    protected val ui: ComponentUI

    /** Registers listener so that it will receive
     *  AncestorEvents when it or any of its ancestors
     *  move or are made visible or invisible.
     */
    def addAncestorListener(listener: AncestorListener): Unit

    /** Notifies this component that it now has a parent component. */
    def addNotify(): Unit

    /** Adds a VetoableChangeListener to the listener list. */
    def addVetoableChangeListener(listener: VetoableChangeListener): Unit

    /** Returns the Component's "visible rect rectangle" -  the
     *  intersection of the visible rectangles for this component
     *  and all of its ancestors.
     */
    def computeVisibleRect(visibleRect: Rectangle): Unit

    /** Gives the UI delegate an opportunity to define the precise
     *  shape of this component for the sake of mouse processing.
     */
    def contains(x: Int, y: Int): Boolean

    /** Returns the instance of JToolTip that should be used
     *  to display the tooltip.
     */
    def createToolTip(): JToolTip

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by java.awt.Component.setEnabled(boolean).
     * 
     */
    def disable(): Unit

    /** Deprecated. 
     * As of JDK version 1.1,
     *  replaced by java.awt.Component.setEnabled(boolean).
     * 
     */
    def enable(): Unit

    /** Support for reporting bound property changes for boolean properties. */
    def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean): Unit

    /** Reports a bound property change. */
    def firePropertyChange(propertyName: String, oldValue: Char, newValue: Char): Unit

    /** Support for reporting bound property changes for integer properties. */
    def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int): Unit

    /** Supports reporting constrained property changes. */
    protected def fireVetoableChange(propertyName: String, oldValue: Any, newValue: Any): Unit

    /** Returns the object that will perform the action registered for a
     *  given keystroke.
     */
    def getActionForKeyStroke(aKeyStroke: KeyStroke): ActionListener

    /** Returns the ActionMap used to determine what
     *  Action to fire for particular KeyStroke
     *  binding.
     */
    def getActionMap(): ActionMap

    /** Overrides Container.getAlignmentX to return
     *  the vertical alignment.
     */
    def getAlignmentX(): Float

    /** Overrides Container.getAlignmentY to return
     *  the horizontal alignment.
     */
    def getAlignmentY(): Float

    /** Returns an array of all the ancestor listeners
     *  registered on this component.
     */
    def getAncestorListeners(): Array[AncestorListener]

    /** Gets the autoscrolls property. */
    def getAutoscrolls(): Boolean

    /** Returns the baseline. */
    def getBaseline(width: Int, height: Int): Int

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    def getBaselineResizeBehavior(): Component.BaselineResizeBehavior

    /** Returns the border of this component or null if no
     *  border is currently set.
     */
    def getBorder(): Border

    /** Stores the bounds of this component into "return value"
     *  rv and returns rv.
     */
    def getBounds(rv: Rectangle): Rectangle

    /** Returns the value of the property with the specified key. */
    def getClientProperty(key: Any): Any

    /** Returns the graphics object used to paint this component. */
    protected def getComponentGraphics(g: Graphics): Graphics

    /** Returns JPopupMenu that assigned for this component. */
    def getComponentPopupMenu(): JPopupMenu

    /** Returns the condition that determines whether a registered action
     *  occurs in response to the specified keystroke.
     */
    def getConditionForKeyStroke(aKeyStroke: KeyStroke): Int

    /** Returns the state of graphics debugging. */
    def getDebugGraphicsOptions(): Int

    /** Gets the FontMetrics for the specified Font. */
    def getFontMetrics(font: Font): FontMetrics

    /** Returns this component's graphics context, which lets you draw
     *  on a component.
     */
    def getGraphics(): Graphics

    /** Returns the current height of this component. */
    def getHeight(): Int

    /** Returns true if the JPopupMenu should be inherited from the parent. */
    def getInheritsPopupMenu(): Boolean

    /** Returns the InputMap that is used when the
     *  component has focus.
     */
    def getInputMap(): InputMap

    /** Returns the InputMap that is used during
     *  condition.
     */
    def getInputMap(condition: Int): InputMap

    /** Returns the input verifier for this component. */
    def getInputVerifier(): InputVerifier

    /** If a border has been set on this component, returns the
     *  border's insets; otherwise calls super.getInsets.
     */
    def getInsets(): Insets

    /** Returns an Insets object containing this component's inset
     *  values.
     */
    def getInsets(insets: Insets): Insets

    /** Returns an array of all the objects currently registered
     *  as FooListeners
     *  upon this JComponent.
     */
    def getListeners[T <: EventListener](listenerType: Class[T]): Array[T]

    /** Stores the x,y origin of this component into "return value"
     *  rv and returns rv.
     */
    def getLocation(rv: Point): Point

    /** If the maximum size has been set to a non-null value
     *  just returns it.
     */
    def getMaximumSize(): Dimension

    /** If the minimum size has been set to a non-null value
     *  just returns it.
     */
    def getMinimumSize(): Dimension

    /** Deprecated. 
     * As of 1.4, replaced by FocusTraversalPolicy.
     * 
     */
    def getNextFocusableComponent(): Component

    /** Returns the preferred location to display the popup menu in this
     *  component's coordinate system.
     */
    def getPopupLocation(event: MouseEvent): Point

    /** If the preferredSize has been set to a
     *  non-null value just returns it.
     */
    def getPreferredSize(): Dimension

    /** Returns the KeyStrokes that will initiate
     *  registered actions.
     */
    def getRegisteredKeyStrokes(): Array[KeyStroke]

    /** Returns the JRootPane ancestor for this component. */
    def getRootPane(): JRootPane

    /** Stores the width/height of this component into "return value"
     *  rv and returns rv.
     */
    def getSize(rv: Dimension): Dimension

    /** Returns the tooltip location in this component's coordinate system. */
    def getToolTipLocation(event: MouseEvent): Point

    /** Returns the tooltip string that has been set with
     *  setToolTipText.
     */
    def getToolTipText(): String

    /** Returns the string to be used as the tooltip for event. */
    def getToolTipText(event: MouseEvent): String

    /** Returns the top-level ancestor of this component (either the
     *  containing Window or Applet),
     *  or null if this component has not
     *  been added to any container.
     */
    def getTopLevelAncestor(): Container

    /** Gets the transferHandler property. */
    def getTransferHandler(): TransferHandler

    /** Returns the UIDefaults key used to
     *  look up the name of the swing.plaf.ComponentUI
     *  class that defines the look and feel
     *  for this component.
     */
    def getUIClassID(): String

    /** Returns the value that indicates whether the input verifier for the
     *  current focus owner will be called before this component requests
     *  focus.
     */
    def getVerifyInputWhenFocusTarget(): Boolean

    /** Returns an array of all the vetoable change listeners
     *  registered on this component.
     */
    def getVetoableChangeListeners(): Array[VetoableChangeListener]

    /** Returns the Component's "visible rectangle" -  the
     *  intersection of this component's visible rectangle,
     *  new Rectangle(0, 0, getWidth(), getHeight()),
     *  and all of its ancestors' visible rectangles.
     */
    def getVisibleRect(): Rectangle

    /** Returns the current width of this component. */
    def getWidth(): Int

    /** Returns the current x coordinate of the component's origin. */
    def getX(): Int

    /** Returns the current y coordinate of the component's origin. */
    def getY(): Int

    /** Requests that this Component get the input focus, and that this
     *  Component's top-level ancestor become the focused Window.
     */
    def grabFocus(): Unit

    /** Deprecated.  */
    def hide(): Unit

    /** Returns whether this component should use a buffer to paint. */
    def isDoubleBuffered(): Boolean

    /** Deprecated. 
     * As of 1.4, replaced by
     *    Component.setFocusTraversalKeys(int, Set) and
     *    Container.setFocusCycleRoot(boolean).
     * 
     */
    def isManagingFocus(): Boolean

    /** Returns true if this component is completely opaque. */
    def isOpaque(): Boolean

    /** Returns true if this component tiles its children -- that is, if
     *  it can guarantee that the children will not overlap.
     */
    def isOptimizedDrawingEnabled(): Boolean

    /** Returns true if the current painting operation on this
     *  component is part of a print operation.
     */
    def isPaintingForPrint(): Boolean

    /** Returns true if a paint triggered on a child component should cause
     *  painting to originate from this Component, or one of its ancestors.
     */
    protected def isPaintingOrigin(): Boolean

    /** Returns true if the component is currently painting a tile. */
    def isPaintingTile(): Boolean

    /** Returns true if this JComponent should
     *  get focus; otherwise returns false.
     */
    def isRequestFocusEnabled(): Boolean

    /** If this method returns true, revalidate calls by
     *  descendants of this component will cause the entire tree
     *  beginning with this root to be validated.
     */
    def isValidateRoot(): Boolean

    /** Invoked by Swing to draw components. */
    def paint(g: Graphics): Unit

    /** Paints the component's border. */
    protected def paintBorder(g: Graphics): Unit

    /** Paints this component's children. */
    protected def paintChildren(g: Graphics): Unit

    /** Calls the UI delegate's paint method, if the UI delegate
     *  is non-null.
     */
    protected def paintComponent(g: Graphics): Unit

    /** Paints the specified region in this component and all of its
     *  descendants that overlap the region, immediately.
     */
    def paintImmediately(x: Int, y: Int, w: Int, h: Int): Unit

    /** Paints the specified region now. */
    def paintImmediately(r: Rectangle): Unit

    /** Returns a string representation of this JComponent. */
    protected def paramString(): String

    /** Invoke this method to print the component to the specified
     *  Graphics.
     */
    def print(g: Graphics): Unit

    /** Invoke this method to print the component. */
    def printAll(g: Graphics): Unit

    /** Prints the component's border. */
    protected def printBorder(g: Graphics): Unit

    /** Prints this component's children. */
    protected def printChildren(g: Graphics): Unit

    /** This is invoked during a printing operation. */
    protected def printComponent(g: Graphics): Unit

    /** Processes any key events that the component itself
     *  recognizes.
     */
    protected def processComponentKeyEvent(e: KeyEvent): Unit

    /** Invoked to process the key bindings for ks as the result
     *  of the KeyEvent e.
     */
    protected def processKeyBinding(ks: KeyStroke, e: KeyEvent, condition: Int, pressed: Boolean): Boolean

    /** Overrides processKeyEvent to process events. */
    protected def processKeyEvent(e: KeyEvent): Unit

    /** Processes mouse events occurring on this component by
     *  dispatching them to any registered
     *  MouseListener objects, refer to
     *  Component.processMouseEvent(MouseEvent)
     *  for a complete description of this method.
     */
    protected def processMouseEvent(e: MouseEvent): Unit

    /** Processes mouse motion events, such as MouseEvent.MOUSE_DRAGGED. */
    protected def processMouseMotionEvent(e: MouseEvent): Unit

    /** Adds an arbitrary key/value "client property" to this component. */
    def putClientProperty(key: Any, value: Any): Unit

    /** This method is now obsolete, please use a combination of
     *  getActionMap() and getInputMap() for
     *  similar behavior.
     */
    def registerKeyboardAction(anAction: ActionListener, aKeyStroke: KeyStroke, aCondition: Int): Unit

    /** This method is now obsolete, please use a combination of
     *  getActionMap() and getInputMap() for
     *  similar behavior.
     */
    def registerKeyboardAction(anAction: ActionListener, aCommand: String, aKeyStroke: KeyStroke, aCondition: Int): Unit

    /** Unregisters listener so that it will no longer receive
     *  AncestorEvents.
     */
    def removeAncestorListener(listener: AncestorListener): Unit

    /** Notifies this component that it no longer has a parent component. */
    def removeNotify(): Unit

    /** Removes a VetoableChangeListener from the listener list. */
    def removeVetoableChangeListener(listener: VetoableChangeListener): Unit

    /** Adds the specified region to the dirty region list if the component
     *  is showing.
     */
    def repaint(tm: Long, x: Int, y: Int, width: Int, height: Int): Unit

    /** Adds the specified region to the dirty region list if the component
     *  is showing.
     */
    def repaint(r: Rectangle): Unit

    /** Deprecated. 
     * As of 1.4, replaced by
     *  FocusTraversalPolicy.getDefaultComponent(Container).requestFocus()
     * 
     */
    def requestDefaultFocus(): Boolean

    /** Requests that this Component gets the input focus. */
    def requestFocus(): Unit

    /** Requests that this Component gets the input focus. */
    def requestFocus(temporary: Boolean): Boolean

    /** Requests that this Component gets the input focus. */
    def requestFocusInWindow(): Boolean

    /** Requests that this Component gets the input focus. */
    protected def requestFocusInWindow(temporary: Boolean): Boolean

    /** Unregisters all the bindings in the first tier InputMaps
     *  and ActionMap.
     */
    def resetKeyboardActions(): Unit

    /** Deprecated. 
     * As of JDK 5,
     *  replaced by Component.setBounds(int, int, int, int).
     *  
     *  Moves and resizes this component.
     * 
     */
    def reshape(x: Int, y: Int, w: Int, h: Int): Unit

    /** Supports deferred automatic layout. */
    def revalidate(): Unit

    /** Forwards the scrollRectToVisible() message to the
     *  JComponent's parent.
     */
    def scrollRectToVisible(aRect: Rectangle): Unit

    /** Sets the ActionMap to am. */
    def setActionMap(am: ActionMap): Unit

    /** Sets the the vertical alignment. */
    def setAlignmentX(alignmentX: Float): Unit

    /** Sets the the horizontal alignment. */
    def setAlignmentY(alignmentY: Float): Unit

    /** Sets the autoscrolls property. */
    def setAutoscrolls(autoscrolls: Boolean): Unit

    /** Sets the background color of this component. */
    def setBackground(bg: Color): Unit

    /** Sets the border of this component. */
    def setBorder(border: Border): Unit

    /** Sets the JPopupMenu for this JComponent. */
    def setComponentPopupMenu(popup: JPopupMenu): Unit

    /** Enables or disables diagnostic information about every graphics
     *  operation performed within the component or one of its children.
     */
    def setDebugGraphicsOptions(debugOptions: Int): Unit

    /** Sets whether this component should use a buffer to paint. */
    def setDoubleBuffered(aFlag: Boolean): Unit

    /** Sets whether or not this component is enabled. */
    def setEnabled(enabled: Boolean): Unit

    /** Sets the focus traversal keys for a given traversal operation for this
     *  Component.
     */
    def setFocusTraversalKeys(id: Int, keystrokes: Set[_ <: AWTKeyStroke]): Unit

    /** Sets the font for this component. */
    def setFont(font: Font): Unit

    /** Sets the foreground color of this component. */
    def setForeground(fg: Color): Unit

    /** Sets whether or not getComponentPopupMenu should delegate
     *  to the parent if this component does not have a JPopupMenu
     *  assigned to it.
     */
    def setInheritsPopupMenu(value: Boolean): Unit

    /** Sets the InputMap to use under the condition
     *  condition to
     *  map.
     */
    def setInputMap(condition: Int, map: InputMap): Unit

    /** Sets the input verifier for this component. */
    def setInputVerifier(inputVerifier: InputVerifier): Unit

    /** Sets the maximum size of this component to a constant
     *  value.
     */
    def setMaximumSize(maximumSize: Dimension): Unit

    /** Sets the minimum size of this component to a constant
     *  value.
     */
    def setMinimumSize(minimumSize: Dimension): Unit

    /** Deprecated. 
     * As of 1.4, replaced by FocusTraversalPolicy
     * 
     */
    def setNextFocusableComponent(aComponent: Component): Unit

    /** If true the component paints every pixel within its bounds. */
    def setOpaque(isOpaque: Boolean): Unit

    /** Sets the preferred size of this component. */
    def setPreferredSize(preferredSize: Dimension): Unit

    /** Provides a hint as to whether or not this JComponent
     *  should get focus.
     */
    def setRequestFocusEnabled(requestFocusEnabled: Boolean): Unit

    /** Registers the text to display in a tool tip. */
    def setToolTipText(text: String): Unit

    /** Sets the TransferHandler, which provides support for transfer
     *  of data into and out of this component via cut/copy/paste and drag
     *  and drop.
     */
    def setTransferHandler(newHandler: TransferHandler): Unit

    /** Sets the look and feel delegate for this component. */
    protected def setUI(newUI: ComponentUI): Unit

    /** Sets the value to indicate whether input verifier for the
     *  current focus owner will be called before this component requests
     *  focus.
     */
    def setVerifyInputWhenFocusTarget(verifyInputWhenFocusTarget: Boolean): Unit

    /** Makes the component visible or invisible. */
    def setVisible(aFlag: Boolean): Unit

    /** This method is now obsolete. */
    def unregisterKeyboardAction(aKeyStroke: KeyStroke): Unit

    /** Calls paint. */
    def update(g: Graphics): Unit

    /** Resets the UI property to a value from the current look and feel. */
    def updateUI(): Unit
}

object JComponent {
    /** The comment to display when the cursor is over the component,
     *  also known as a "value tip", "flyover help", or "flyover label".
     */
    @stub
    val TOOL_TIP_TEXT_KEY: String = ???

    /** Constant used by some of the APIs to mean that no condition is defined. */
    @stub
    val UNDEFINED_CONDITION: Int = ???

    /** Constant used for registerKeyboardAction that
     *  means that the command should be invoked when the receiving
     *  component is an ancestor of the focused component or is
     *  itself the focused component.
     */
    @stub
    val WHEN_ANCESTOR_OF_FOCUSED_COMPONENT: Int = ???

    /** Constant used for registerKeyboardAction that
     *  means that the command should be invoked when
     *  the component has the focus.
     */
    @stub
    val WHEN_FOCUSED: Int = ???

    /** Constant used for registerKeyboardAction that
     *  means that the command should be invoked when
     *  the receiving component is in the window that has the focus
     *  or is itself the focused component.
     */
    @stub
    val WHEN_IN_FOCUSED_WINDOW: Int = ???

    /** Returns the default locale used to initialize each JComponent's
     *  locale property upon creation.
     */
    @stub
    def getDefaultLocale(): Locale = ???

    /** Returns true if this component is lightweight, that is, if it doesn't
     *  have a native window system peer.
     */
    @stub
    def isLightweightComponent(c: Component): Boolean = ???

    /** Sets the default locale used to initialize each JComponent's locale
     *  property upon creation.
     */
    @stub
    def setDefaultLocale(l: Locale): Unit = ???
}
