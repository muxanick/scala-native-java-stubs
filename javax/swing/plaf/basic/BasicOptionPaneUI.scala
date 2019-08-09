package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, GridBagConstraints, LayoutManager}
import java.awt.event.ActionListener
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JOptionPane}
import javax.swing.plaf.{ComponentUI, OptionPaneUI}

// Provides the basic look and feel for a JOptionPane.
// BasicMessagePaneUI provides a means to place an icon,
// message and buttons into a Container.
// Generally, the layout will look like:
// 
//        ------------------
//        | i | message    |
//        | c | message    |
//        | o | message    |
//        | n | message    |
//        ------------------
//        |     buttons    |
//        |________________|
// 
// icon is an instance of Icon that is wrapped inside a
// JLabel.  The message is an opaque object and is tested
// for the following: if the message is a Component it is
// added to the Container, if it is an Icon
// it is wrapped inside a JLabel and added to the
// Container otherwise it is wrapped inside a JLabel.
// 
// The above layout is used when the option pane's
// ComponentOrientation property is horizontal, left-to-right.
// The layout will be adjusted appropriately for other orientations.
// 
// The Container, message, icon, and buttons are all
// determined from abstract methods.
class BasicOptionPaneUI extends OptionPaneUI {

    @stub
    // This class should be treated as a "protected" inner class.
    def BasicOptionPaneUI.ButtonActionListener: class = ???

    @stub
    // This is set to true in validateComponent if a Component is contained
    // in either the message or the buttons.
    protected def hasCustomComponents: Boolean = ???

    @stub
    // Component to receive focus when messaged with selectInitialValue.
    protected def initialFocusComponent: Component = ???

    @stub
    // JComponent provide for input if optionPane.getWantsInput() returns
    // true.
    protected def inputComponent: JComponent = ???

    @stub
    // 
    protected def minimumSize: Dimension = ???

    @stub
    // JOptionPane that the receiver is providing the
    // look and feel for.
    protected def optionPane: JOptionPane = ???

    @stub
    // Creates the appropriate object to represent each of the objects in
    // buttons and adds it to container.
    protected def addButtonComponents(container: Container, buttons: Array[Object], initialIndex: Int): Unit = ???

    @stub
    // Creates and adds a JLabel representing the icon returned from
    // getIcon to top.
    protected def addIcon(top: Container): Unit = ???

    @stub
    // Creates the appropriate object to represent msg and
    // places it into container.
    protected def addMessageComponents(container: Container, cons: GridBagConstraints, msg: Object, maxll: Int, internallyCreated: Boolean): Unit = ???

    @stub
    // Recursively creates new JLabel instances to represent d.
    protected def burstStringInto(c: Container, d: String, maxll: Int): Unit = ???

    @stub
    // Returns true if in the last call to validateComponent the message
    // or buttons contained a subclass of Component.
    def containsCustomComponents(op: JOptionPane): Boolean = ???

    @stub
    // 
    protected def createButtonActionListener(buttonIndex: Int): ActionListener = ???

    @stub
    // Creates and returns a Container containing the buttons.
    protected def createButtonArea(): Container = ???

    @stub
    // 
    protected def createLayoutManager(): LayoutManager = ???

    @stub
    // Messaged from installComponents to create a Container containing the
    // body of the message.
    protected def createMessageArea(): Container = ???

    @stub
    // 
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    @stub
    // 
    protected def createSeparator(): Container = ???

    @stub
    // Returns the buttons to display from the JOptionPane the receiver is
    // providing the look and feel for.
    protected def getButtons(): Array[Object] = ???

    @stub
    // Returns the icon from the JOptionPane the receiver is providing
    // the look and feel for, or the default icon as returned from
    // getDefaultIcon.
    protected def getIcon(): Icon = ???

    @stub
    // Returns the icon to use for the passed in type.
    protected def getIconForType(messageType: Int): Icon = ???

    @stub
    // Returns the initial index into the buttons to select.
    protected def getInitialValueIndex(): Int = ???

    @stub
    // Returns the maximum number of characters to place on a line.
    protected def getMaxCharactersPerLineCount(): Int = ???

    @stub
    // Returns the message to display from the JOptionPane the receiver is
    // providing the look and feel for.
    protected def getMessage(): Object = ???

    @stub
    // Returns the minimum size the option pane should be.
    def getMinimumOptionPaneSize(): Dimension = ???

    @stub
    // If c is the JOptionPane the receiver
    // is contained in, the preferred
    // size that is returned is the maximum of the preferred size of
    // the LayoutManager for the JOptionPane, and
    // getMinimumOptionPaneSize.
    def getPreferredSize(c: JComponent): Dimension = ???

    @stub
    // Returns true, basic L&F wants all the buttons to have the same
    // width.
    protected def getSizeButtonsToSameWidth(): Boolean = ???

    @stub
    // 
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
    // Installs the receiver as the L&F for the passed in
    // JOptionPane.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Sets the input value in the option pane the receiver is providing
    // the look and feel for based on the value in the inputComponent.
    protected def resetInputValue(): Unit = ???

    @stub
    // If inputComponent is non-null, the focus is requested on that,
    // otherwise request focus on the default value
    def selectInitialValue(op: JOptionPane): Unit = ???

    @stub
    // 
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
}

object BasicOptionPaneUI {
    @stub
    // ButtonAreaLayout behaves in a similar manner to
    // FlowLayout.
    def BasicOptionPaneUI.ButtonAreaLayout: class = ???

    @stub
    // 
    def MinimumHeight: Int = ???

    @stub
    // 
    def MinimumWidth: Int = ???

    @stub
    // Creates a new BasicOptionPaneUI instance.
    def createUI(x: JComponent): ComponentUI = ???
}
