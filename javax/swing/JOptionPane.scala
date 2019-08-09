package javax.swing

import java.awt.{Component, Container, Frame}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.OptionPaneUI

// JOptionPane makes it easy to pop up a standard dialog box that
// prompts users for a value or informs them of something.
// For information about using JOptionPane, see
// How to Make Dialogs,
// a section in The Java Tutorial.
//
// 
//
// While the JOptionPane
// class may appear complex because of the large number of methods, almost
// all uses of this class are one-line calls to one of the static
// showXxxDialog methods shown below:
// 
//
//
// 
// 
//    Method Name
//    Description
// 
// 
//    showConfirmDialog
//    Asks a confirming question, like yes/no/cancel.
// 
// 
//    showInputDialog
//    Prompt for some input.
// 
// 
//   showMessageDialog
//   Tell the user about something that has happened.
// 
// 
//   showOptionDialog
//   The Grand Unification of the above three.
// 
// 
//
// 
// Each of these methods also comes in a showInternalXXX
// flavor, which uses an internal frame to hold the dialog box (see
// JInternalFrame).
// Multiple convenience methods have also been defined -- overloaded
// versions of the basic methods that use different parameter lists.
// 
// All dialogs are modal. Each showXxxDialog method blocks
// the caller until the user's interaction is complete.
//
// 
// 
//  icon
//  message
// 
// 
//  input value
// 
// 
//   option buttons
// 
// 
//
// The basic appearance of one of these dialog boxes is generally
// similar to the picture at the right, although the various
// look-and-feels are
// ultimately responsible for the final result.  In particular, the
// look-and-feels will adjust the layout to accommodate the option pane's
// ComponentOrientation property.
// 
// 
// Parameters:
// The parameters to these methods follow consistent patterns:
// 
// 
// parentComponent
// Defines the Component that is to be the parent of this
// dialog box.
// It is used in two ways: the Frame that contains
// it is used as the Frame
// parent for the dialog box, and its screen coordinates are used in
// the placement of the dialog box. In general, the dialog box is placed
// just below the component. This parameter may be null,
// in which case a default Frame is used as the parent,
// and the dialog will be
// centered on the screen (depending on the L&F).
// message
// A descriptive message to be placed in the dialog box.
// In the most common usage, message is just a String or
// String constant.
// However, the type of this parameter is actually Object. Its
// interpretation depends on its type:
// 
// Object[]An array of objects is interpreted as a series of
//                 messages (one per object) arranged in a vertical stack.
//                 The interpretation is recursive -- each object in the
//                 array is interpreted according to its type.
// ComponentThe Component is displayed in the dialog.
// IconThe Icon is wrapped in a JLabel
//               and displayed in the dialog.
// othersThe object is converted to a String by calling
//               its toString method. The result is wrapped in a
//               JLabel and displayed.
// 
// messageTypeDefines the style of the message. The Look and Feel
// manager may lay out the dialog differently depending on this value, and
// will often provide a default icon. The possible values are:
// 
// ERROR_MESSAGE
// INFORMATION_MESSAGE
// WARNING_MESSAGE
// QUESTION_MESSAGE
// PLAIN_MESSAGE
// 
// optionTypeDefines the set of option buttons that appear at
// the bottom of the dialog box:
// 
// DEFAULT_OPTION
// YES_NO_OPTION
// YES_NO_CANCEL_OPTION
// OK_CANCEL_OPTION
// 
// You aren't limited to this set of option buttons.  You can provide any
// buttons you want using the options parameter.
// optionsA more detailed description of the set of option buttons
// that will appear at the bottom of the dialog box.
// The usual value for the options parameter is an array of
// Strings. But
// the parameter type is an array of Objects.
// A button is created for each object depending on its type:
// 
// ComponentThe component is added to the button row directly.
// IconA JButton is created with this as its label.
// otherThe Object is converted to a string using its
//              toString method and the result is used to
//              label a JButton.
// 
// iconA decorative icon to be placed in the dialog box. A default
// value for this is determined by the messageType parameter.
// titleThe title for the dialog box.
// initialValueThe default selection (input value).
// 
// 
// 
// When the selection is changed, setValue is invoked,
// which generates a PropertyChangeEvent.
// 
// If a JOptionPane has configured to all input
// setWantsInput
// the bound property JOptionPane.INPUT_VALUE_PROPERTY
//  can also be listened
// to, to determine when the user has input or selected a value.
// 
// When one of the showXxxDialog methods returns an integer,
// the possible values are:
// 
// YES_OPTION
// NO_OPTION
// CANCEL_OPTION
// OK_OPTION
// CLOSED_OPTION
// 
// Examples:
// 
// Show an error dialog that displays the message, 'alert':
// 
// JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
// 
// Show an internal information dialog with the message, 'information':
// 
// JOptionPane.showInternalMessageDialog(frame, "information",
//             "information", JOptionPane.INFORMATION_MESSAGE);
// 
// Show an information panel with the options yes/no and message 'choose one':
// JOptionPane.showConfirmDialog(null,
//             "choose one", "choose one", JOptionPane.YES_NO_OPTION);
// 
// Show an internal information dialog with the options yes/no/cancel and
// message 'please choose one' and title information:
// JOptionPane.showInternalConfirmDialog(frame,
//             "please choose one", "information",
//             JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
// 
// Show a warning dialog with the options OK, CANCEL, title 'Warning', and
// message 'Click OK to continue':
// 
// Object[] options = { "OK", "CANCEL" };
// JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
//             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
//             null, options, options[0]);
// 
// Show a dialog asking the user to type in a String:
// 
// String inputValue = JOptionPane.showInputDialog("Please input a value");
// 
// Show a dialog asking the user to select a String:
// 
// Object[] possibleValues = { "First", "Second", "Third" };
// Object selectedValue = JOptionPane.showInputDialog(null,
//             "Choose one", "Input",
//             JOptionPane.INFORMATION_MESSAGE, null,
//             possibleValues, possibleValues[0]);
// 
// 
// Direct Use:
// To create and use an JOptionPane directly, the
// standard pattern is roughly as follows:
// 
//     JOptionPane pane = new JOptionPane(arguments);
//     pane.set.Xxxx(...); // Configure
//     JDialog dialog = pane.createDialog(parentComponent, title);
//     dialog.show();
//     Object selectedValue = pane.getValue();
//     if(selectedValue == null)
//       return CLOSED_OPTION;
//     //If there is not an array of option buttons:
//     if(options == null) {
//       if(selectedValue instanceof Integer)
//          return ((Integer)selectedValue).intValue();
//       return CLOSED_OPTION;
//     }
//     //If there is an array of option buttons:
//     for(int counter = 0, maxCounter = options.length;
//        counter < maxCounter; counter++) {
//        if(options[counter].equals(selectedValue))
//        return counter;
//     }
//     return CLOSED_OPTION;
// 
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
class JOptionPane extends JComponent with Accessible {

    @stub
    // Creates a JOptionPane with a test message.
    def this() = ???

    @stub
    // Creates a instance of JOptionPane to display a
    // message using the
    // plain-message message type and the default options delivered by
    // the UI.
    def this(message: Object) = ???

    @stub
    // Creates an instance of JOptionPane to display a message
    // with the specified message type and the default options,
    def this(message: Object, messageType: Int) = ???

    @stub
    // Creates an instance of JOptionPane to display a message
    // with the specified message type and options.
    def this(message: Object, messageType: Int, optionType: Int) = ???

    @stub
    // Creates an instance of JOptionPane to display a message
    // with the specified message type, options, and icon.
    def this(message: Object, messageType: Int, optionType: Int, icon: Icon) = ???

    @stub
    // Creates an instance of JOptionPane to display a message
    // with the specified message type, icon, and options.
    def this(message: Object, messageType: Int, optionType: Int, icon: Icon, options: Array[Object]) = ???

    @stub
    // Icon used in pane.
    protected def icon: Icon = ???

    @stub
    // Initial value to select in selectionValues.
    protected def initialSelectionValue: Object = ???

    @stub
    // Value that should be initially selected in options.
    protected def initialValue: Object = ???

    @stub
    // Value the user has input.
    protected def inputValue: Object = ???

    @stub
    // Message to display.
    protected def message: Object = ???

    @stub
    // Message type.
    protected def messageType: Int = ???

    @stub
    // Options to display to the user.
    protected def options: Array[Object] = ???

    @stub
    // Option type, one of DEFAULT_OPTION,
    // YES_NO_OPTION,
    // YES_NO_CANCEL_OPTION or
    // OK_CANCEL_OPTION.
    protected def optionType: Int = ???

    @stub
    // Array of values the user can choose from.
    protected def selectionValues: Array[Object] = ???

    @stub
    // Currently selected value, will be a valid option, or
    // UNINITIALIZED_VALUE or null.
    protected def value: Object = ???

    @stub
    // If true, a UI widget will be provided to the user to get input.
    protected def wantsInput: Boolean = ???

    @stub
    // Creates and returns a new JDialog wrapping
    // this centered on the parentComponent
    // in the parentComponent's frame.
    def createDialog(parentComponent: Component, title: String): JDialog = ???

    @stub
    // Creates and returns a new parentless JDialog
    // with the specified title.
    def createDialog(title: String): JDialog = ???

    @stub
    // Creates and returns an instance of JInternalFrame.
    def createInternalFrame(parentComponent: Component, title: String): JInternalFrame = ???

    @stub
    // Returns the AccessibleContext associated with this JOptionPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the icon this pane displays.
    def getIcon(): Icon = ???

    @stub
    // Returns the input value that is displayed as initially selected to the user.
    def getInitialSelectionValue(): Object = ???

    @stub
    // Returns the initial value.
    def getInitialValue(): Object = ???

    @stub
    // Returns the value the user has input, if wantsInput
    // is true.
    def getInputValue(): Object = ???

    @stub
    // Returns the maximum number of characters to place on a line in a
    // message.
    def getMaxCharactersPerLineCount(): Int = ???

    @stub
    // Returns the message-object this pane displays.
    def getMessage(): Object = ???

    @stub
    // Returns the message type.
    def getMessageType(): Int = ???

    @stub
    // Returns the choices the user can make.
    def getOptions(): Array[Object] = ???

    @stub
    // Returns the type of options that are displayed.
    def getOptionType(): Int = ???

    @stub
    // Returns the input selection values.
    def getSelectionValues(): Array[Object] = ???

    @stub
    // Returns the UI object which implements the L&F for this component.
    def getUI(): OptionPaneUI = ???

    @stub
    // Returns the name of the UI class that implements the
    // L&F for this component.
    def getUIClassID(): String = ???

    @stub
    // Returns the value the user has selected.
    def getValue(): Object = ???

    @stub
    // Returns the value of the wantsInput property.
    def getWantsInput(): Boolean = ???

    @stub
    // Returns a string representation of this JOptionPane.
    protected def paramString(): String = ???

    @stub
    // Requests that the initial value be selected, which will set
    // focus to the initial value.
    def selectInitialValue(): Unit = ???

    @stub
    // Sets the icon to display.
    def setIcon(newIcon: Icon): Unit = ???

    @stub
    // Sets the input value that is initially displayed as selected to the user.
    def setInitialSelectionValue(newValue: Object): Unit = ???

    @stub
    // Sets the initial value that is to be enabled -- the
    // Component
    // that has the focus when the pane is initially displayed.
    def setInitialValue(newInitialValue: Object): Unit = ???

    @stub
    // Sets the input value that was selected or input by the user.
    def setInputValue(newValue: Object): Unit = ???

    @stub
    // Sets the option pane's message-object.
    def setMessage(newMessage: Object): Unit = ???

    @stub
    // Sets the option pane's message type.
    def setMessageType(newType: Int): Unit = ???

    @stub
    // Sets the options this pane displays.
    def setOptions(newOptions: Array[Object]): Unit = ???

    @stub
    // Sets the options to display.
    def setOptionType(newType: Int): Unit = ???

    @stub
    // Sets the input selection values for a pane that provides the user
    // with a list of items to choose from.
    def setSelectionValues(newValues: Array[Object]): Unit = ???

    @stub
    // Sets the UI object which implements the L&F for this component.
    def setUI(ui: OptionPaneUI): Unit = ???

    @stub
    // Sets the value the user has chosen.
    def setValue(newValue: Object): Unit = ???

    @stub
    // Sets the wantsInput property.
    def setWantsInput(newValue: Boolean): Unit = ???
}

object JOptionPane {
    @stub
    // Return value from class method if CANCEL is chosen.
    def CANCEL_OPTION: Int = ???

    @stub
    // Return value from class method if user closes window without selecting
    // anything, more than likely this should be treated as either a
    // CANCEL_OPTION or NO_OPTION.
    def CLOSED_OPTION: Int = ???

    @stub
    // Type meaning Look and Feel should not supply any options -- only
    // use the options from the JOptionPane.
    def DEFAULT_OPTION: Int = ???

    @stub
    // Used for error messages.
    def ERROR_MESSAGE: Int = ???

    @stub
    // Bound property name for icon.
    def ICON_PROPERTY: String = ???

    @stub
    // Used for information messages.
    def INFORMATION_MESSAGE: Int = ???

    @stub
    // Bound property name for initialSelectionValue.
    def INITIAL_SELECTION_VALUE_PROPERTY: String = ???

    @stub
    // Bound property name for initialValue.
    def INITIAL_VALUE_PROPERTY: String = ???

    @stub
    // Bound property name for inputValue.
    def INPUT_VALUE_PROPERTY: String = ???

    @stub
    // Bound property name for message.
    def MESSAGE_PROPERTY: String = ???

    @stub
    // Bound property name for type.
    def MESSAGE_TYPE_PROPERTY: String = ???

    @stub
    // Return value from class method if NO is chosen.
    def NO_OPTION: Int = ???

    @stub
    // Type used for showConfirmDialog.
    def OK_CANCEL_OPTION: Int = ???

    @stub
    // Return value form class method if OK is chosen.
    def OK_OPTION: Int = ???

    @stub
    // Bound property name for optionType.
    def OPTION_TYPE_PROPERTY: String = ???

    @stub
    // Bound property name for option.
    def OPTIONS_PROPERTY: String = ???

    @stub
    // No icon is used.
    def PLAIN_MESSAGE: Int = ???

    @stub
    // Used for questions.
    def QUESTION_MESSAGE: Int = ???

    @stub
    // Bound property name for selectionValues.
    def SELECTION_VALUES_PROPERTY: String = ???

    @stub
    // Indicates that the user has not yet selected a value.
    def UNINITIALIZED_VALUE: Object = ???

    @stub
    // Bound property name for value.
    def VALUE_PROPERTY: String = ???

    @stub
    // Bound property name for wantsInput.
    def WANTS_INPUT_PROPERTY: String = ???

    @stub
    // Used for warning messages.
    def WARNING_MESSAGE: Int = ???

    @stub
    // Type used for showConfirmDialog.
    def YES_NO_CANCEL_OPTION: Int = ???

    @stub
    // Type used for showConfirmDialog.
    def YES_NO_OPTION: Int = ???

    @stub
    // Returns the specified component's desktop pane.
    def getDesktopPaneForComponent(parentComponent: Component): JDesktopPane = ???

    @stub
    // Returns the specified component's Frame.
    def getFrameForComponent(parentComponent: Component): Frame = ???

    @stub
    // Returns the Frame to use for the class methods in
    // which a frame is not provided.
    def getRootFrame(): Frame = ???

    @stub
    // Sets the frame to use for class methods in which a frame is
    // not provided.
    def setRootFrame(newRootFrame: Frame): Unit = ???

    @stub
    // Brings up a dialog with the options Yes,
    // No and Cancel; with the
    // title, Select an Option.
    def showConfirmDialog(parentComponent: Component, message: Object): Int = ???

    @stub
    // Brings up a dialog where the number of choices is determined
    // by the optionType parameter.
    def showConfirmDialog(parentComponent: Component, message: Object, title: String, optionType: Int): Int = ???

    @stub
    // Brings up a dialog where the number of choices is determined
    // by the optionType parameter, where the
    // messageType
    // parameter determines the icon to display.
    def showConfirmDialog(parentComponent: Component, message: Object, title: String, optionType: Int, messageType: Int): Int = ???

    @stub
    // Brings up a dialog with a specified icon, where the number of
    // choices is determined by the optionType parameter.
    def showConfirmDialog(parentComponent: Component, message: Object, title: String, optionType: Int, messageType: Int, icon: Icon): Int = ???

    @stub
    // Shows a question-message dialog requesting input from the user
    // parented to parentComponent.
    def showInputDialog(parentComponent: Component, message: Object): String = ???

    @stub
    // Shows a question-message dialog requesting input from the user and
    // parented to parentComponent.
    def showInputDialog(parentComponent: Component, message: Object, initialSelectionValue: Object): String = ???

    @stub
    // Shows a dialog requesting input from the user parented to
    // parentComponent with the dialog having the title
    // title and message type messageType.
    def showInputDialog(parentComponent: Component, message: Object, title: String, messageType: Int): String = ???

    @stub
    // Prompts the user for input in a blocking dialog where the
    // initial selection, possible selections, and all other options can
    // be specified.
    def showInputDialog(parentComponent: Component, message: Object, title: String, messageType: Int, icon: Icon, selectionValues: Array[Object], initialSelectionValue: Object): Object = ???

    @stub
    // Shows a question-message dialog requesting input from the user.
    def showInputDialog(message: Object): String = ???

    @stub
    // Shows a question-message dialog requesting input from the user, with
    // the input value initialized to initialSelectionValue.
    def showInputDialog(message: Object, initialSelectionValue: Object): String = ???

    @stub
    // Brings up an internal dialog panel with the options Yes, No
    // and Cancel; with the title, Select an Option.
    def showInternalConfirmDialog(parentComponent: Component, message: Object): Int = ???

    @stub
    // Brings up a internal dialog panel where the number of choices
    // is determined by the optionType parameter.
    def showInternalConfirmDialog(parentComponent: Component, message: Object, title: String, optionType: Int): Int = ???

    @stub
    // Brings up an internal dialog panel where the number of choices
    // is determined by the optionType parameter, where
    // the messageType parameter determines the icon to display.
    def showInternalConfirmDialog(parentComponent: Component, message: Object, title: String, optionType: Int, messageType: Int): Int = ???

    @stub
    // Brings up an internal dialog panel with a specified icon, where
    // the number of choices is determined by the optionType
    // parameter.
    def showInternalConfirmDialog(parentComponent: Component, message: Object, title: String, optionType: Int, messageType: Int, icon: Icon): Int = ???

    @stub
    // Shows an internal question-message dialog requesting input from
    // the user parented to parentComponent.
    def showInternalInputDialog(parentComponent: Component, message: Object): String = ???

    @stub
    // Shows an internal dialog requesting input from the user parented
    // to parentComponent with the dialog having the title
    // title and message type messageType.
    def showInternalInputDialog(parentComponent: Component, message: Object, title: String, messageType: Int): String = ???

    @stub
    // Prompts the user for input in a blocking internal dialog where
    // the initial selection, possible selections, and all other
    // options can be specified.
    def showInternalInputDialog(parentComponent: Component, message: Object, title: String, messageType: Int, icon: Icon, selectionValues: Array[Object], initialSelectionValue: Object): Object = ???

    @stub
    // Brings up an internal confirmation dialog panel.
    def showInternalMessageDialog(parentComponent: Component, message: Object): Unit = ???

    @stub
    // Brings up an internal dialog panel that displays a message
    // using a default icon determined by the messageType
    // parameter.
    def showInternalMessageDialog(parentComponent: Component, message: Object, title: String, messageType: Int): Unit = ???

    @stub
    // Brings up an internal dialog panel displaying a message,
    // specifying all parameters.
    def showInternalMessageDialog(parentComponent: Component, message: Object, title: String, messageType: Int, icon: Icon): Unit = ???

    @stub
    // Brings up an internal dialog panel with a specified icon, where
    // the initial choice is determined by the initialValue
    // parameter and the number of choices is determined by the
    // optionType parameter.
    def showInternalOptionDialog(parentComponent: Component, message: Object, title: String, optionType: Int, messageType: Int, icon: Icon, options: Array[Object], initialValue: Object): Int = ???

    @stub
    // Brings up an information-message dialog titled "Message".
    def showMessageDialog(parentComponent: Component, message: Object): Unit = ???

    @stub
    // Brings up a dialog that displays a message using a default
    // icon determined by the messageType parameter.
    def showMessageDialog(parentComponent: Component, message: Object, title: String, messageType: Int): Unit = ???

    @stub
    // Brings up a dialog displaying a message, specifying all parameters.
    def showMessageDialog(parentComponent: Component, message: Object, title: String, messageType: Int, icon: Icon): Unit = ???

    @stub
    // Brings up a dialog with a specified icon, where the initial
    // choice is determined by the initialValue parameter and
    // the number of choices is determined by the optionType
    // parameter.
    def showOptionDialog(parentComponent: Component, message: Object, title: String, optionType: Int, messageType: Int, icon: Icon, options: Array[Object], initialValue: Object): Int = ???
}
