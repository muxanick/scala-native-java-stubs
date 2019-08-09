package javax.swing

import java.awt.{Component, Container, Dimension, Graphics, Insets, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.ToolBarUI
import scala.scalanative.annotation.stub

/** JToolBar provides a component that is useful for
 *  displaying commonly used Actions or controls.
 *  For examples and information on using tool bars see
 *  How to Use Tool Bars,
 *  a section in The Java Tutorial.
 * 
 *  
 *  With most look and feels,
 *  the user can drag out a tool bar into a separate window
 *  (unless the floatable property is set to false).
 *  For drag-out to work correctly, it is recommended that you add
 *  JToolBar instances to one of the four "sides" of a
 *  container whose layout manager is a BorderLayout,
 *  and do not add children to any of the other four "sides".
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
class JToolBar extends JComponent with SwingConstants with Accessible {

    /** Creates a new tool bar; orientation defaults to HORIZONTAL. */
    @stub
    def this() = ???

    /** Creates a new tool bar with the specified orientation. */
    @stub
    def this(orientation: Int) = ???

    /** Creates a new tool bar with the specified name. */
    @stub
    def this(name: String) = ???

    /** Creates a new tool bar with a specified name and
     *  orientation.
     */
    @stub
    def this(name: String, orientation: Int) = ???

    /** This class implements accessibility support for the
     *  JToolBar class.
     */
    @stub
    protected object AccessibleJToolBar extends JToolBar.AccessibleJToolBar

    /** Adds a new JButton which dispatches the action. */
    @stub
    def add(a: Action): JButton = ???

    /** If a JButton is being added, it is initially
     *  set to be disabled.
     */
    @stub
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    /** Appends a separator of default size to the end of the tool bar. */
    @stub
    def addSeparator(): Unit = ???

    /** Appends a separator of a specified size to the end
     *  of the tool bar.
     */
    @stub
    def addSeparator(size: Dimension): Unit = ???

    /** Returns a properly configured PropertyChangeListener
     *  which updates the control as changes to the Action occur,
     *  or null if the default
     *  property change listener for the control is desired.
     */
    @stub
    protected def createActionChangeListener(b: JButton): PropertyChangeListener = ???

    /** Factory method which creates the JButton for
     *  Actions added to the JToolBar.
     */
    @stub
    protected def createActionComponent(a: Action): JButton = ???

    /** Gets the AccessibleContext associated with this JToolBar. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the component at the specified index. */
    @stub
    def getComponentAtIndex(i: Int): Component = ???

    /** Returns the index of the specified component. */
    @stub
    def getComponentIndex(c: Component): Int = ???

    /** Returns the margin between the tool bar's border and
     *  its buttons.
     */
    @stub
    def getMargin(): Insets = ???

    /** Returns the current orientation of the tool bar. */
    @stub
    def getOrientation(): Int = ???

    /** Returns the tool bar's current UI. */
    @stub
    def getUI(): ToolBarUI = ???

    /** Returns the name of the L&F class that renders this component. */
    @stub
    def getUIClassID(): String = ???

    /** Gets the borderPainted property. */
    @stub
    def isBorderPainted(): Boolean = ???

    /** Gets the floatable property. */
    @stub
    def isFloatable(): Boolean = ???

    /** Returns the rollover state. */
    @stub
    def isRollover(): Boolean = ???

    /** Paints the tool bar's border if the borderPainted property
     *  is true.
     */
    @stub
    protected def paintBorder(g: Graphics): Unit = ???

    /** Returns a string representation of this JToolBar. */
    @stub
    protected def paramString(): String = ???

    /** Sets the borderPainted property, which is
     *  true if the border should be painted.
     */
    @stub
    def setBorderPainted(b: Boolean): Unit = ???

    /** Sets the floatable property,
     *  which must be true for the user to move the tool bar.
     */
    @stub
    def setFloatable(b: Boolean): Unit = ???

    /** Sets the layout manager for this container. */
    @stub
    def setLayout(mgr: LayoutManager): Unit = ???

    /** Sets the margin between the tool bar's border and
     *  its buttons.
     */
    @stub
    def setMargin(m: Insets): Unit = ???

    /** Sets the orientation of the tool bar. */
    @stub
    def setOrientation(o: Int): Unit = ???

    /** Sets the rollover state of this toolbar. */
    @stub
    def setRollover(rollover: Boolean): Unit = ???

    /** Sets the L&F object that renders this component. */
    @stub
    def setUI(ui: ToolBarUI): Unit = ???

    /** Notification from the UIFactory that the L&F has changed. */
    @stub
    def updateUI(): Unit = ???
}

object JToolBar {
    /** A toolbar-specific separator. */
    @stub
    object Separator extends JToolBar.Separator
}
