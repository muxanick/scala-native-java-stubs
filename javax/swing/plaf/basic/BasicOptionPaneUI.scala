package javax.swing.plaf.basic

import java.awt.{Component, Container, Dimension, GridBagConstraints, LayoutManager}
import java.awt.event.{ActionEvent, ActionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.{Icon, JComponent, JOptionPane}
import javax.swing.plaf.{ComponentUI, OptionPaneUI}
import scala.scalanative.annotation.stub

/** Provides the basic look and feel for a JOptionPane.
 *  BasicMessagePaneUI provides a means to place an icon,
 *  message and buttons into a Container.
 *  Generally, the layout will look like:
 *  
 *         ------------------
 *         | i | message    |
 *         | c | message    |
 *         | o | message    |
 *         | n | message    |
 *         ------------------
 *         |     buttons    |
 *         |________________|
 *  
 *  icon is an instance of Icon that is wrapped inside a
 *  JLabel.  The message is an opaque object and is tested
 *  for the following: if the message is a Component it is
 *  added to the Container, if it is an Icon
 *  it is wrapped inside a JLabel and added to the
 *  Container otherwise it is wrapped inside a JLabel.
 *  
 *  The above layout is used when the option pane's
 *  ComponentOrientation property is horizontal, left-to-right.
 *  The layout will be adjusted appropriately for other orientations.
 *  
 *  The Container, message, icon, and buttons are all
 *  determined from abstract methods.
 */
class BasicOptionPaneUI extends OptionPaneUI {

    /**  */
    @stub
    def this() = ???

    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicOptionPaneUI.
     */
    class ButtonActionListener extends Object with ActionListener {

        /**  */
        @stub
        def this(buttonIndex: Int) = ???

        /**  */
        @stub
        protected val buttonIndex: Int = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicOptionPaneUI.
     */
    class PropertyChangeHandler extends Object with PropertyChangeListener {

        /**  */
        @stub
        def this() = ???

        /** If the source of the PropertyChangeEvent e equals the
         *  optionPane and is one of the ICON_PROPERTY, MESSAGE_PROPERTY,
         *  OPTIONS_PROPERTY or INITIAL_VALUE_PROPERTY,
         *  validateComponent is invoked.
         */
        @stub
        def propertyChange(e: PropertyChangeEvent): Unit = ???
    }


    /** This is set to true in validateComponent if a Component is contained
     *  in either the message or the buttons.
     */
    @stub
    protected val hasCustomComponents: Boolean = ???

    /** Component to receive focus when messaged with selectInitialValue. */
    @stub
    protected val initialFocusComponent: Component = ???

    /** JComponent provide for input if optionPane.getWantsInput() returns
     *  true.
     */
    @stub
    protected val inputComponent: JComponent = ???

    /**  */
    @stub
    protected val minimumSize: Dimension = ???

    /** JOptionPane that the receiver is providing the
     *  look and feel for.
     */
    @stub
    protected val optionPane: JOptionPane = ???

    /**  */
    @stub
    protected val propertyChangeListener: PropertyChangeListener = ???

    /** Creates the appropriate object to represent each of the objects in
     *  buttons and adds it to container.
     */
    @stub
    protected def addButtonComponents(container: Container, buttons: Array[Object], initialIndex: Int): Unit = ???

    /** Creates and adds a JLabel representing the icon returned from
     *  getIcon to top.
     */
    @stub
    protected def addIcon(top: Container): Unit = ???

    /** Creates the appropriate object to represent msg and
     *  places it into container.
     */
    @stub
    protected def addMessageComponents(container: Container, cons: GridBagConstraints, msg: Any, maxll: Int, internallyCreated: Boolean): Unit = ???

    /** Recursively creates new JLabel instances to represent d. */
    @stub
    protected def burstStringInto(c: Container, d: String, maxll: Int): Unit = ???

    /** Returns true if in the last call to validateComponent the message
     *  or buttons contained a subclass of Component.
     */
    @stub
    def containsCustomComponents(op: JOptionPane): Boolean = ???

    /**  */
    @stub
    protected def createButtonActionListener(buttonIndex: Int): ActionListener = ???

    /** Creates and returns a Container containing the buttons. */
    @stub
    protected def createButtonArea(): Container = ???

    /**  */
    @stub
    protected def createLayoutManager(): LayoutManager = ???

    /** Messaged from installComponents to create a Container containing the
     *  body of the message.
     */
    @stub
    protected def createMessageArea(): Container = ???

    /**  */
    @stub
    protected def createPropertyChangeListener(): PropertyChangeListener = ???

    /**  */
    @stub
    protected def createSeparator(): Container = ???

    /** Returns the buttons to display from the JOptionPane the receiver is
     *  providing the look and feel for.
     */
    @stub
    protected def getButtons(): Array[Object] = ???

    /** Returns the icon from the JOptionPane the receiver is providing
     *  the look and feel for, or the default icon as returned from
     *  getDefaultIcon.
     */
    @stub
    protected def getIcon(): Icon = ???

    /** Returns the icon to use for the passed in type. */
    @stub
    protected def getIconForType(messageType: Int): Icon = ???

    /** Returns the initial index into the buttons to select. */
    @stub
    protected def getInitialValueIndex(): Int = ???

    /** Returns the maximum number of characters to place on a line. */
    @stub
    protected def getMaxCharactersPerLineCount(): Int = ???

    /** Returns the message to display from the JOptionPane the receiver is
     *  providing the look and feel for.
     */
    @stub
    protected def getMessage(): Any = ???

    /** Returns the minimum size the option pane should be. */
    @stub
    def getMinimumOptionPaneSize(): Dimension = ???

    /** If c is the JOptionPane the receiver
     *  is contained in, the preferred
     *  size that is returned is the maximum of the preferred size of
     *  the LayoutManager for the JOptionPane, and
     *  getMinimumOptionPaneSize.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Returns true, basic L&F wants all the buttons to have the same
     *  width.
     */
    @stub
    protected def getSizeButtonsToSameWidth(): Boolean = ???

    /**  */
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

    /** Installs the receiver as the L&F for the passed in
     *  JOptionPane.
     */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Sets the input value in the option pane the receiver is providing
     *  the look and feel for based on the value in the inputComponent.
     */
    @stub
    protected def resetInputValue(): Unit = ???

    /** If inputComponent is non-null, the focus is requested on that,
     *  otherwise request focus on the default value
     */
    @stub
    def selectInitialValue(op: JOptionPane): Unit = ???

    /**  */
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

    /** Removes the receiver from the L&F controller of the passed in split
     *  pane.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicOptionPaneUI {
    /** ButtonAreaLayout behaves in a similar manner to
     *  FlowLayout. It lays out all components from left to
     *  right. If syncAllWidths is true, the widths of each
     *  component will be set to the largest preferred size width.
     * 
     *  This class should be treated as a "protected" inner class.
     *  Instantiate it only within subclasses of BasicOptionPaneUI.
     */
    object ButtonAreaLayout extends Object with LayoutManager {

        /**  */
        @stub
        def apply(syncAllWidths: Boolean, padding: Int) = ???

        /** If true, children are lumped together in parent. */
        @stub
        protected val centersChildren: Boolean = ???

        /**  */
        @stub
        protected val padding: Int = ???

        /**  */
        @stub
        protected val syncAllWidths: Boolean = ???

        /** If the layout manager uses a per-component string,
         *  adds the component comp to the layout,
         *  associating it
         *  with the string specified by name.
         */
        @stub
        def addLayoutComponent(string: String, comp: Component): Unit = ???

        /**  */
        @stub
        def getCentersChildren(): Boolean = ???

        /**  */
        @stub
        def getPadding(): Int = ???

        /**  */
        @stub
        def getSyncAllWidths(): Boolean = ???

        /** Lays out the specified container. */
        @stub
        def layoutContainer(container: Container): Unit = ???

        /** Calculates the minimum size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def minimumLayoutSize(c: Container): Dimension = ???

        /** Calculates the preferred size dimensions for the specified
         *  container, given the components it contains.
         */
        @stub
        def preferredLayoutSize(c: Container): Dimension = ???

        /** Removes the specified component from the layout. */
        @stub
        def removeLayoutComponent(c: Component): Unit = ???

        /**  */
        @stub
        def setCentersChildren(newValue: Boolean): Unit = ???

        /**  */
        @stub
        def setPadding(newPadding: Int): Unit = ???

        /**  */
        @stub
        def setSyncAllWidths(newValue: Boolean): Unit = ???
    }


    /**  */
    @stub
    val MinimumHeight: Int = ???

    /**  */
    @stub
    val MinimumWidth: Int = ???

    /** Creates a new BasicOptionPaneUI instance. */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
