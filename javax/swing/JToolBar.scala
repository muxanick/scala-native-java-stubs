package javax.swing

import java.awt.{Component, Container, Dimension, Graphics, Insets, LayoutManager}
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.ToolBarUI

// JToolBar provides a component that is useful for
// displaying commonly used Actions or controls.
// For examples and information on using tool bars see
// How to Use Tool Bars,
// a section in The Java Tutorial.
//
// 
// With most look and feels,
// the user can drag out a tool bar into a separate window
// (unless the floatable property is set to false).
// For drag-out to work correctly, it is recommended that you add
// JToolBar instances to one of the four "sides" of a
// container whose layout manager is a BorderLayout,
// and do not add children to any of the other four "sides".
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
class JToolBar extends JComponent with SwingConstants, with Accessible {

    @stub
    // Creates a new tool bar; orientation defaults to HORIZONTAL.
    def this() = ???

    @stub
    // Creates a new tool bar with the specified orientation.
    def this(orientation: Int) = ???

    @stub
    // Creates a new tool bar with the specified name.
    def this(name: String) = ???

    @stub
    // This class implements accessibility support for the
    // JToolBar class.
    protected def JToolBar.AccessibleJToolBar: class = ???

    @stub
    // Adds a new JButton which dispatches the action.
    def add(a: Action): JButton = ???

    @stub
    // If a JButton is being added, it is initially
    // set to be disabled.
    protected def addImpl(comp: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Appends a separator of default size to the end of the tool bar.
    def addSeparator(): Unit = ???

    @stub
    // Appends a separator of a specified size to the end
    // of the tool bar.
    def addSeparator(size: Dimension): Unit = ???

    @stub
    // Returns a properly configured PropertyChangeListener
    // which updates the control as changes to the Action occur,
    // or null if the default
    // property change listener for the control is desired.
    protected def createActionChangeListener(b: JButton): PropertyChangeListener = ???

    @stub
    // Factory method which creates the JButton for
    // Actions added to the JToolBar.
    protected def createActionComponent(a: Action): JButton = ???

    @stub
    // Gets the AccessibleContext associated with this JToolBar.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the component at the specified index.
    def getComponentAtIndex(i: Int): Component = ???

    @stub
    // Returns the index of the specified component.
    def getComponentIndex(c: Component): Int = ???

    @stub
    // Returns the margin between the tool bar's border and
    // its buttons.
    def getMargin(): Insets = ???

    @stub
    // Returns the current orientation of the tool bar.
    def getOrientation(): Int = ???

    @stub
    // Returns the tool bar's current UI.
    def getUI(): ToolBarUI = ???

    @stub
    // Returns the name of the L&F class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Gets the borderPainted property.
    def isBorderPainted(): Boolean = ???

    @stub
    // Gets the floatable property.
    def isFloatable(): Boolean = ???

    @stub
    // Returns the rollover state.
    def isRollover(): Boolean = ???

    @stub
    // Paints the tool bar's border if the borderPainted property
    // is true.
    protected def paintBorder(g: Graphics): Unit = ???

    @stub
    // Returns a string representation of this JToolBar.
    protected def paramString(): String = ???

    @stub
    // Sets the borderPainted property, which is
    // true if the border should be painted.
    def setBorderPainted(b: Boolean): Unit = ???

    @stub
    // Sets the floatable property,
    // which must be true for the user to move the tool bar.
    def setFloatable(b: Boolean): Unit = ???

    @stub
    // Sets the layout manager for this container.
    def setLayout(mgr: LayoutManager): Unit = ???

    @stub
    // Sets the margin between the tool bar's border and
    // its buttons.
    def setMargin(m: Insets): Unit = ???

    @stub
    // Sets the orientation of the tool bar.
    def setOrientation(o: Int): Unit = ???

    @stub
    // Sets the rollover state of this toolbar.
    def setRollover(rollover: Boolean): Unit = ???

    @stub
    // Sets the L&F object that renders this component.
    def setUI(ui: ToolBarUI): Unit = ???
}
