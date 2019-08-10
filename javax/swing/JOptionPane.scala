package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Frame}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext, AccessibleRole}
import javax.swing.plaf.OptionPaneUI
import scala.scalanative.annotation.stub

/** JOptionPane makes it easy to pop up a standard dialog box that
 *  prompts users for a value or informs them of something.
 *  For information about using JOptionPane, see
 *  How to Make Dialogs,
 *  a section in The Java Tutorial.
 * 
 *  
 * 
 *  While the JOptionPane
 *  class may appear complex because of the large number of methods, almost
 *  all uses of this class are one-line calls to one of the static
 *  showXxxDialog methods shown below:
 *  
 * 
 * 
 *  
 *  
 *     Method Name
 *     Description
 *  
 *  
 *     showConfirmDialog
 *     Asks a confirming question, like yes/no/cancel.
 *  
 *  
 *     showInputDialog
 *     Prompt for some input.
 *  
 *  
 *    showMessageDialog
 *    Tell the user about something that has happened.
 *  
 *  
 *    showOptionDialog
 *    The Grand Unification of the above three.
 *  
 *  
 * 
 *  
 *  Each of these methods also comes in a showInternalXXX
 *  flavor, which uses an internal frame to hold the dialog box (see
 *  JInternalFrame).
 *  Multiple convenience methods have also been defined -- overloaded
 *  versions of the basic methods that use different parameter lists.
 *  
 *  All dialogs are modal. Each showXxxDialog method blocks
 *  the caller until the user's interaction is complete.
 * 
 *  
 *  
 *   icon
 *   message
 *  
 *  
 *   input value
 *  
 *  
 *    option buttons
 *  
 *  
 * 
 *  The basic appearance of one of these dialog boxes is generally
 *  similar to the picture at the right, although the various
 *  look-and-feels are
 *  ultimately responsible for the final result.  In particular, the
 *  look-and-feels will adjust the layout to accommodate the option pane's
 *  ComponentOrientation property.
 *  
 *  
 *  Parameters:
 *  The parameters to these methods follow consistent patterns:
 *  
 *  
 *  parentComponent
 *  Defines the Component that is to be the parent of this
 *  dialog box.
 *  It is used in two ways: the Frame that contains
 *  it is used as the Frame
 *  parent for the dialog box, and its screen coordinates are used in
 *  the placement of the dialog box. In general, the dialog box is placed
 *  just below the component. This parameter may be null,
 *  in which case a default Frame is used as the parent,
 *  and the dialog will be
 *  centered on the screen (depending on the L&F).
 *  message
 *  A descriptive message to be placed in the dialog box.
 *  In the most common usage, message is just a String or
 *  String constant.
 *  However, the type of this parameter is actually Object. Its
 *  interpretation depends on its type:
 *  
 *  Object[]An array of objects is interpreted as a series of
 *                  messages (one per object) arranged in a vertical stack.
 *                  The interpretation is recursive -- each object in the
 *                  array is interpreted according to its type.
 *  ComponentThe Component is displayed in the dialog.
 *  IconThe Icon is wrapped in a JLabel
 *                and displayed in the dialog.
 *  othersThe object is converted to a String by calling
 *                its toString method. The result is wrapped in a
 *                JLabel and displayed.
 *  
 *  messageTypeDefines the style of the message. The Look and Feel
 *  manager may lay out the dialog differently depending on this value, and
 *  will often provide a default icon. The possible values are:
 *  
 *  ERROR_MESSAGE
 *  INFORMATION_MESSAGE
 *  WARNING_MESSAGE
 *  QUESTION_MESSAGE
 *  PLAIN_MESSAGE
 *  
 *  optionTypeDefines the set of option buttons that appear at
 *  the bottom of the dialog box:
 *  
 *  DEFAULT_OPTION
 *  YES_NO_OPTION
 *  YES_NO_CANCEL_OPTION
 *  OK_CANCEL_OPTION
 *  
 *  You aren't limited to this set of option buttons.  You can provide any
 *  buttons you want using the options parameter.
 *  optionsA more detailed description of the set of option buttons
 *  that will appear at the bottom of the dialog box.
 *  The usual value for the options parameter is an array of
 *  Strings. But
 *  the parameter type is an array of Objects.
 *  A button is created for each object depending on its type:
 *  
 *  ComponentThe component is added to the button row directly.
 *  IconA JButton is created with this as its label.
 *  otherThe Object is converted to a string using its
 *               toString method and the result is used to
 *               label a JButton.
 *  
 *  iconA decorative icon to be placed in the dialog box. A default
 *  value for this is determined by the messageType parameter.
 *  titleThe title for the dialog box.
 *  initialValueThe default selection (input value).
 *  
 *  
 *  
 *  When the selection is changed, setValue is invoked,
 *  which generates a PropertyChangeEvent.
 *  
 *  If a JOptionPane has configured to all input
 *  setWantsInput
 *  the bound property JOptionPane.INPUT_VALUE_PROPERTY
 *   can also be listened
 *  to, to determine when the user has input or selected a value.
 *  
 *  When one of the showXxxDialog methods returns an integer,
 *  the possible values are:
 *  
 *  YES_OPTION
 *  NO_OPTION
 *  CANCEL_OPTION
 *  OK_OPTION
 *  CLOSED_OPTION
 *  
 *  Examples:
 *  
 *  Show an error dialog that displays the message, 'alert':
 *  
 *  JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
 *  
 *  Show an internal information dialog with the message, 'information':
 *  
 *  JOptionPane.showInternalMessageDialog(frame, "information",
 *              "information", JOptionPane.INFORMATION_MESSAGE);
 *  
 *  Show an information panel with the options yes/no and message 'choose one':
 *  JOptionPane.showConfirmDialog(null,
 *              "choose one", "choose one", JOptionPane.YES_NO_OPTION);
 *  
 *  Show an internal information dialog with the options yes/no/cancel and
 *  message 'please choose one' and title information:
 *  JOptionPane.showInternalConfirmDialog(frame,
 *              "please choose one", "information",
 *              JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
 *  
 *  Show a warning dialog with the options OK, CANCEL, title 'Warning', and
 *  message 'Click OK to continue':
 *  
 *  Object[] options = { "OK", "CANCEL" };
 *  JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
 *              JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
 *              null, options, options[0]);
 *  
 *  Show a dialog asking the user to type in a String:
 *  
 *  String inputValue = JOptionPane.showInputDialog("Please input a value");
 *  
 *  Show a dialog asking the user to select a String:
 *  
 *  Object[] possibleValues = { "First", "Second", "Third" };
 *  Object selectedValue = JOptionPane.showInputDialog(null,
 *              "Choose one", "Input",
 *              JOptionPane.INFORMATION_MESSAGE, null,
 *              possibleValues, possibleValues[0]);
 *  
 *  
 *  Direct Use:
 *  To create and use an JOptionPane directly, the
 *  standard pattern is roughly as follows:
 *  
 *      JOptionPane pane = new JOptionPane(arguments);
 *      pane.set.Xxxx(...); // Configure
 *      JDialog dialog = pane.createDialog(parentComponent, title);
 *      dialog.show();
 *      Object selectedValue = pane.getValue();
 *      if(selectedValue == null)
 *        return CLOSED_OPTION;
 *      //If there is not an array of option buttons:
 *      if(options == null) {
 *        if(selectedValue instanceof Integer)
 *           return ((Integer)selectedValue).intValue();
 *        return CLOSED_OPTION;
 *      }
 *      //If there is an array of option buttons:
 *      for(int counter = 0, maxCounter = options.length;
 *         counter < maxCounter; counter++) {
 *         if(options[counter].equals(selectedValue))
 *         return counter;
 *      }
 *      return CLOSED_OPTION;
 *  
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
class JOptionPane extends JComponent with Accessible {

    /** Creates a JOptionPane with a test message. */
    @stub
    def this() = ???

    /** Creates a instance of JOptionPane to display a
     *  message using the
     *  plain-message message type and the default options delivered by
     *  the UI.
     */
    @stub
    def this(message: Any) = ???

    /** Creates an instance of JOptionPane to display a message
     *  with the specified message type and the default options,
     */
    @stub
    def this(message: Any, messageType: Int) = ???

    /** Creates an instance of JOptionPane to display a message
     *  with the specified message type and options.
     */
    @stub
    def this(message: Any, messageType: Int, optionType: Int) = ???

    /** Creates an instance of JOptionPane to display a message
     *  with the specified message type, options, and icon.
     */
    @stub
    def this(message: Any, messageType: Int, optionType: Int, icon: Icon) = ???

    /** Creates an instance of JOptionPane to display a message
     *  with the specified message type, icon, and options.
     */
    @stub
    def this(message: Any, messageType: Int, optionType: Int, icon: Icon, options: Array[Object]) = ???

    /** Creates an instance of JOptionPane to display a message
     *  with the specified message type, icon, and options, with the
     *  initially-selected option specified.
     */
    @stub
    def this(message: Any, messageType: Int, optionType: Int, icon: Icon, options: Array[Object], initialValue: Any) = ???

    /** This class implements accessibility support for the
     *  JOptionPane class.  It provides an implementation of the
     *  Java Accessibility API appropriate to option pane user-interface
     *  elements.
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
    protected class AccessibleJOptionPane extends JComponent.AccessibleJComponent {

        /**  */
        @stub
        protected def this() = ???

        /** Get the role of this object. */
        @stub
        def getAccessibleRole(): AccessibleRole = ???
    }


    /** Icon used in pane. */
    @stub
    protected val icon: Icon = ???

    /** Initial value to select in selectionValues. */
    @stub
    protected val initialSelectionValue: Any = ???

    /** Value that should be initially selected in options. */
    @stub
    protected val initialValue: Any = ???

    /** Value the user has input. */
    @stub
    protected val inputValue: Any = ???

    /** Message to display. */
    @stub
    protected val message: Any = ???

    /** Message type. */
    @stub
    protected val messageType: Int = ???

    /** Options to display to the user. */
    @stub
    protected val options: Array[Object] = ???

    /** Option type, one of DEFAULT_OPTION,
     *  YES_NO_OPTION,
     *  YES_NO_CANCEL_OPTION or
     *  OK_CANCEL_OPTION.
     */
    @stub
    protected val optionType: Int = ???

    /** Array of values the user can choose from. */
    @stub
    protected val selectionValues: Array[Object] = ???

    /** Currently selected value, will be a valid option, or
     *  UNINITIALIZED_VALUE or null.
     */
    @stub
    protected val value: Any = ???

    /** If true, a UI widget will be provided to the user to get input. */
    @stub
    protected val wantsInput: Boolean = ???

    /** Creates and returns a new JDialog wrapping
     *  this centered on the parentComponent
     *  in the parentComponent's frame.
     */
    @stub
    def createDialog(parentComponent: Component, title: String): JDialog = ???

    /** Creates and returns a new parentless JDialog
     *  with the specified title.
     */
    @stub
    def createDialog(title: String): JDialog = ???

    /** Creates and returns an instance of JInternalFrame. */
    @stub
    def createInternalFrame(parentComponent: Component, title: String): JInternalFrame = ???

    /** Returns the AccessibleContext associated with this JOptionPane. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the icon this pane displays. */
    @stub
    def getIcon(): Icon = ???

    /** Returns the input value that is displayed as initially selected to the user. */
    @stub
    def getInitialSelectionValue(): Any = ???

    /** Returns the initial value. */
    @stub
    def getInitialValue(): Any = ???

    /** Returns the value the user has input, if wantsInput
     *  is true.
     */
    @stub
    def getInputValue(): Any = ???

    /** Returns the maximum number of characters to place on a line in a
     *  message.
     */
    @stub
    def getMaxCharactersPerLineCount(): Int = ???

    /** Returns the message-object this pane displays. */
    @stub
    def getMessage(): Any = ???

    /** Returns the message type. */
    @stub
    def getMessageType(): Int = ???

    /** Returns the choices the user can make. */
    @stub
    def getOptions(): Array[Object] = ???

    /** Returns the type of options that are displayed. */
    @stub
    def getOptionType(): Int = ???

    /** Returns the input selection values. */
    @stub
    def getSelectionValues(): Array[Object] = ???

    /** Returns the UI object which implements the L&F for this component. */
    @stub
    def getUI(): OptionPaneUI = ???

    /** Returns the name of the UI class that implements the
     *  L&F for this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns the value the user has selected. */
    @stub
    def getValue(): Any = ???

    /** Returns the value of the wantsInput property. */
    @stub
    def getWantsInput(): Boolean = ???

    /** Returns a string representation of this JOptionPane. */
    @stub
    protected def paramString(): String = ???

    /** Requests that the initial value be selected, which will set
     *  focus to the initial value.
     */
    @stub
    def selectInitialValue(): Unit = ???

    /** Sets the icon to display. */
    @stub
    def setIcon(newIcon: Icon): Unit = ???

    /** Sets the input value that is initially displayed as selected to the user. */
    @stub
    def setInitialSelectionValue(newValue: Any): Unit = ???

    /** Sets the initial value that is to be enabled -- the
     *  Component
     *  that has the focus when the pane is initially displayed.
     */
    @stub
    def setInitialValue(newInitialValue: Any): Unit = ???

    /** Sets the input value that was selected or input by the user. */
    @stub
    def setInputValue(newValue: Any): Unit = ???

    /** Sets the option pane's message-object. */
    @stub
    def setMessage(newMessage: Any): Unit = ???

    /** Sets the option pane's message type. */
    @stub
    def setMessageType(newType: Int): Unit = ???

    /** Sets the options this pane displays. */
    @stub
    def setOptions(newOptions: Array[Object]): Unit = ???

    /** Sets the options to display. */
    @stub
    def setOptionType(newType: Int): Unit = ???

    /** Sets the input selection values for a pane that provides the user
     *  with a list of items to choose from.
     */
    @stub
    def setSelectionValues(newValues: Array[Object]): Unit = ???

    /** Sets the UI object which implements the L&F for this component. */
    @stub
    def setUI(ui: OptionPaneUI): Unit = ???

    /** Sets the value the user has chosen. */
    @stub
    def setValue(newValue: Any): Unit = ???

    /** Sets the wantsInput property. */
    @stub
    def setWantsInput(newValue: Boolean): Unit = ???

    /** Notification from the UIManager that the L&F has changed. */
    @stub
    def updateUI(): Unit = ???
}

object JOptionPane {
    /** Return value from class method if CANCEL is chosen. */
    @stub
    val CANCEL_OPTION: Int = ???

    /** Return value from class method if user closes window without selecting
     *  anything, more than likely this should be treated as either a
     *  CANCEL_OPTION or NO_OPTION.
     */
    @stub
    val CLOSED_OPTION: Int = ???

    /** Type meaning Look and Feel should not supply any options -- only
     *  use the options from the JOptionPane.
     */
    @stub
    val DEFAULT_OPTION: Int = ???

    /** Used for error messages. */
    @stub
    val ERROR_MESSAGE: Int = ???

    /** Bound property name for icon. */
    @stub
    val ICON_PROPERTY: String = ???

    /** Used for information messages. */
    @stub
    val INFORMATION_MESSAGE: Int = ???

    /** Bound property name for initialSelectionValue. */
    @stub
    val INITIAL_SELECTION_VALUE_PROPERTY: String = ???

    /** Bound property name for initialValue. */
    @stub
    val INITIAL_VALUE_PROPERTY: String = ???

    /** Bound property name for inputValue. */
    @stub
    val INPUT_VALUE_PROPERTY: String = ???

    /** Bound property name for message. */
    @stub
    val MESSAGE_PROPERTY: String = ???

    /** Bound property name for type. */
    @stub
    val MESSAGE_TYPE_PROPERTY: String = ???

    /** Return value from class method if NO is chosen. */
    @stub
    val NO_OPTION: Int = ???

    /** Type used for showConfirmDialog. */
    @stub
    val OK_CANCEL_OPTION: Int = ???

    /** Return value form class method if OK is chosen. */
    @stub
    val OK_OPTION: Int = ???

    /** Bound property name for optionType. */
    @stub
    val OPTION_TYPE_PROPERTY: String = ???

    /** Bound property name for option. */
    @stub
    val OPTIONS_PROPERTY: String = ???

    /** No icon is used. */
    @stub
    val PLAIN_MESSAGE: Int = ???

    /** Used for questions. */
    @stub
    val QUESTION_MESSAGE: Int = ???

    /** Bound property name for selectionValues. */
    @stub
    val SELECTION_VALUES_PROPERTY: String = ???

    /** Indicates that the user has not yet selected a value. */
    @stub
    val UNINITIALIZED_VALUE: Any = ???

    /** Bound property name for value. */
    @stub
    val VALUE_PROPERTY: String = ???

    /** Bound property name for wantsInput. */
    @stub
    val WANTS_INPUT_PROPERTY: String = ???

    /** Used for warning messages. */
    @stub
    val WARNING_MESSAGE: Int = ???

    /** Type used for showConfirmDialog. */
    @stub
    val YES_NO_CANCEL_OPTION: Int = ???

    /** Type used for showConfirmDialog. */
    @stub
    val YES_NO_OPTION: Int = ???

    /** Return value from class method if YES is chosen. */
    @stub
    val YES_OPTION: Int = ???

    /** Returns the specified component's desktop pane. */
    @stub
    def getDesktopPaneForComponent(parentComponent: Component): JDesktopPane = ???

    /** Returns the specified component's Frame. */
    @stub
    def getFrameForComponent(parentComponent: Component): Frame = ???

    /** Returns the Frame to use for the class methods in
     *  which a frame is not provided.
     */
    @stub
    def getRootFrame(): Frame = ???

    /** Sets the frame to use for class methods in which a frame is
     *  not provided.
     */
    @stub
    def setRootFrame(newRootFrame: Frame): Unit = ???

    /** Brings up a dialog with the options Yes,
     *  No and Cancel; with the
     *  title, Select an Option.
     */
    @stub
    def showConfirmDialog(parentComponent: Component, message: Any): Int = ???

    /** Brings up a dialog where the number of choices is determined
     *  by the optionType parameter.
     */
    @stub
    def showConfirmDialog(parentComponent: Component, message: Any, title: String, optionType: Int): Int = ???

    /** Brings up a dialog where the number of choices is determined
     *  by the optionType parameter, where the
     *  messageType
     *  parameter determines the icon to display.
     */
    @stub
    def showConfirmDialog(parentComponent: Component, message: Any, title: String, optionType: Int, messageType: Int): Int = ???

    /** Brings up a dialog with a specified icon, where the number of
     *  choices is determined by the optionType parameter.
     */
    @stub
    def showConfirmDialog(parentComponent: Component, message: Any, title: String, optionType: Int, messageType: Int, icon: Icon): Int = ???

    /** Shows a question-message dialog requesting input from the user
     *  parented to parentComponent.
     */
    @stub
    def showInputDialog(parentComponent: Component, message: Any): String = ???

    /** Shows a question-message dialog requesting input from the user and
     *  parented to parentComponent.
     */
    @stub
    def showInputDialog(parentComponent: Component, message: Any, initialSelectionValue: Any): String = ???

    /** Shows a dialog requesting input from the user parented to
     *  parentComponent with the dialog having the title
     *  title and message type messageType.
     */
    @stub
    def showInputDialog(parentComponent: Component, message: Any, title: String, messageType: Int): String = ???

    /** Prompts the user for input in a blocking dialog where the
     *  initial selection, possible selections, and all other options can
     *  be specified.
     */
    @stub
    def showInputDialog(parentComponent: Component, message: Any, title: String, messageType: Int, icon: Icon, selectionValues: Array[Object], initialSelectionValue: Any): Any = ???

    /** Shows a question-message dialog requesting input from the user. */
    @stub
    def showInputDialog(message: Any): String = ???

    /** Shows a question-message dialog requesting input from the user, with
     *  the input value initialized to initialSelectionValue.
     */
    @stub
    def showInputDialog(message: Any, initialSelectionValue: Any): String = ???

    /** Brings up an internal dialog panel with the options Yes, No
     *  and Cancel; with the title, Select an Option.
     */
    @stub
    def showInternalConfirmDialog(parentComponent: Component, message: Any): Int = ???

    /** Brings up a internal dialog panel where the number of choices
     *  is determined by the optionType parameter.
     */
    @stub
    def showInternalConfirmDialog(parentComponent: Component, message: Any, title: String, optionType: Int): Int = ???

    /** Brings up an internal dialog panel where the number of choices
     *  is determined by the optionType parameter, where
     *  the messageType parameter determines the icon to display.
     */
    @stub
    def showInternalConfirmDialog(parentComponent: Component, message: Any, title: String, optionType: Int, messageType: Int): Int = ???

    /** Brings up an internal dialog panel with a specified icon, where
     *  the number of choices is determined by the optionType
     *  parameter.
     */
    @stub
    def showInternalConfirmDialog(parentComponent: Component, message: Any, title: String, optionType: Int, messageType: Int, icon: Icon): Int = ???

    /** Shows an internal question-message dialog requesting input from
     *  the user parented to parentComponent.
     */
    @stub
    def showInternalInputDialog(parentComponent: Component, message: Any): String = ???

    /** Shows an internal dialog requesting input from the user parented
     *  to parentComponent with the dialog having the title
     *  title and message type messageType.
     */
    @stub
    def showInternalInputDialog(parentComponent: Component, message: Any, title: String, messageType: Int): String = ???

    /** Prompts the user for input in a blocking internal dialog where
     *  the initial selection, possible selections, and all other
     *  options can be specified.
     */
    @stub
    def showInternalInputDialog(parentComponent: Component, message: Any, title: String, messageType: Int, icon: Icon, selectionValues: Array[Object], initialSelectionValue: Any): Any = ???

    /** Brings up an internal confirmation dialog panel. */
    @stub
    def showInternalMessageDialog(parentComponent: Component, message: Any): Unit = ???

    /** Brings up an internal dialog panel that displays a message
     *  using a default icon determined by the messageType
     *  parameter.
     */
    @stub
    def showInternalMessageDialog(parentComponent: Component, message: Any, title: String, messageType: Int): Unit = ???

    /** Brings up an internal dialog panel displaying a message,
     *  specifying all parameters.
     */
    @stub
    def showInternalMessageDialog(parentComponent: Component, message: Any, title: String, messageType: Int, icon: Icon): Unit = ???

    /** Brings up an internal dialog panel with a specified icon, where
     *  the initial choice is determined by the initialValue
     *  parameter and the number of choices is determined by the
     *  optionType parameter.
     */
    @stub
    def showInternalOptionDialog(parentComponent: Component, message: Any, title: String, optionType: Int, messageType: Int, icon: Icon, options: Array[Object], initialValue: Any): Int = ???

    /** Brings up an information-message dialog titled "Message". */
    @stub
    def showMessageDialog(parentComponent: Component, message: Any): Unit = ???

    /** Brings up a dialog that displays a message using a default
     *  icon determined by the messageType parameter.
     */
    @stub
    def showMessageDialog(parentComponent: Component, message: Any, title: String, messageType: Int): Unit = ???

    /** Brings up a dialog displaying a message, specifying all parameters. */
    @stub
    def showMessageDialog(parentComponent: Component, message: Any, title: String, messageType: Int, icon: Icon): Unit = ???

    /** Brings up a dialog with a specified icon, where the initial
     *  choice is determined by the initialValue parameter and
     *  the number of choices is determined by the optionType
     *  parameter.
     */
    @stub
    def showOptionDialog(parentComponent: Component, message: Any, title: String, optionType: Int, messageType: Int, icon: Icon, options: Array[Object], initialValue: Any): Int = ???
}
