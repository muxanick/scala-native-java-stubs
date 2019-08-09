package javax.swing

import java.awt.{Component, Container}
import java.awt.event.{FocusEvent, InputMethodEvent}
import java.lang.{Object, String}
import java.text.Format
import javax.swing.text.{Document, JTextComponent}

// JFormattedTextField extends JTextField adding
// support for formatting arbitrary values, as well as retrieving a particular
// object once the user has edited the text. The following illustrates
// configuring a JFormattedTextField to edit dates:
// 
//   JFormattedTextField ftf = new JFormattedTextField();
//   ftf.setValue(new Date());
// 
// 
// Once a JFormattedTextField has been created, you can
// listen for editing changes by way of adding
// a PropertyChangeListener and listening for
// PropertyChangeEvents with the property name value.
// 
// JFormattedTextField allows
// configuring what action should be taken when focus is lost. The possible
// configurations are:
// 
// ValueDescription
// JFormattedTextField.REVERT
//            Revert the display to match that of getValue,
//                possibly losing the current edit.
//        JFormattedTextField.COMMIT
//            Commits the current value. If the value being edited
//                isn't considered a legal value by the
//                AbstractFormatter that is, a
//                ParseException is thrown, then the value
//                will not change, and then edited value will persist.
//        JFormattedTextField.COMMIT_OR_REVERT
//            Similar to COMMIT, but if the value isn't
//                legal, behave like REVERT.
//        JFormattedTextField.PERSIST
//            Do nothing, don't obtain a new
//                AbstractFormatter, and don't update the value.
// 
// The default is JFormattedTextField.COMMIT_OR_REVERT,
// refer to setFocusLostBehavior(int) for more information on this.
// 
// JFormattedTextField allows the focus to leave, even if
// the currently edited value is invalid. To lock the focus down while the
// JFormattedTextField is an invalid edit state
// you can attach an InputVerifier. The following code snippet
// shows a potential implementation of such an InputVerifier:
// 
// public class FormattedTextFieldVerifier extends InputVerifier {
//     public boolean verify(JComponent input) {
//         if (input instanceof JFormattedTextField) {
//             JFormattedTextField ftf = (JFormattedTextField)input;
//             AbstractFormatter formatter = ftf.getFormatter();
//             if (formatter != null) {
//                 String text = ftf.getText();
//                 try {
//                      formatter.stringToValue(text);
//                      return true;
//                  } catch (ParseException pe) {
//                      return false;
//                  }
//              }
//          }
//          return true;
//      }
//      public boolean shouldYieldFocus(JComponent input) {
//          return verify(input);
//      }
//  }
// 
// 
// Alternatively, you could invoke commitEdit, which would also
// commit the value.
// 
// JFormattedTextField does not do the formatting it self,
// rather formatting is done through an instance of
// JFormattedTextField.AbstractFormatter which is obtained from
// an instance of JFormattedTextField.AbstractFormatterFactory.
// Instances of JFormattedTextField.AbstractFormatter are
// notified when they become active by way of the
// install method, at which point the
// JFormattedTextField.AbstractFormatter can install whatever
// it needs to, typically a DocumentFilter. Similarly when
// JFormattedTextField no longer
// needs the AbstractFormatter, it will invoke
// uninstall.
// 
// JFormattedTextField typically
// queries the AbstractFormatterFactory for an
// AbstractFormat when it gains or loses focus. Although this
// can change based on the focus lost policy. If the focus lost
// policy is JFormattedTextField.PERSIST
// and the JFormattedTextField has been edited, the
// AbstractFormatterFactory will not be queried until the
// value has been committed. Similarly if the focus lost policy is
// JFormattedTextField.COMMIT and an exception
// is thrown from stringToValue, the
// AbstractFormatterFactory will not be queried when focus is
// lost or gained.
// 
// JFormattedTextField.AbstractFormatter
// is also responsible for determining when values are committed to
// the JFormattedTextField. Some
// JFormattedTextField.AbstractFormatters will make new values
// available on every edit, and others will never commit the value. You can
// force the current value to be obtained
// from the current JFormattedTextField.AbstractFormatter
// by way of invoking commitEdit. commitEdit will
// be invoked whenever return is pressed in the
// JFormattedTextField.
// 
// If an AbstractFormatterFactory has not been explicitly
// set, one will be set based on the Class of the value type after
// setValue has been invoked (assuming value is non-null).
// For example, in the following code an appropriate
// AbstractFormatterFactory and AbstractFormatter
// will be created to handle formatting of numbers:
// 
//   JFormattedTextField tf = new JFormattedTextField();
//   tf.setValue(100);
// 
// 
// Warning: As the AbstractFormatter will
// typically install a DocumentFilter on the
// Document, and a NavigationFilter on the
// JFormattedTextField you should not install your own. If you do,
// you are likely to see odd behavior in that the editing policy of the
// AbstractFormatter will not be enforced.
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
class JFormattedTextField extends JTextField {

    @stub
    // Creates a JFormattedTextField with no
    // AbstractFormatterFactory.
    def this() = ???

    @stub
    // Creates a JFormattedTextField.
    def this(format: Format) = ???

    @stub
    // Creates a JFormattedTextField with the specified
    // AbstractFormatter.
    def this(formatter: JFormattedTextField.AbstractFormatter) = ???

    @stub
    // Creates a JFormattedTextField with the specified
    // AbstractFormatterFactory.
    def this(factory: JFormattedTextField.AbstractFormatterFactory) = ???

    @stub
    // Creates a JFormattedTextField with the specified
    // AbstractFormatterFactory and initial value.
    def this(factory: JFormattedTextField.AbstractFormatterFactory, currentValue: Object) = ???

    @stub
    // Forces the current value to be taken from the
    // AbstractFormatter and set as the current value.
    def commitEdit(): Unit = ???

    @stub
    // Fetches the command list for the editor.
    def getActions(): Array[Action] = ???

    @stub
    // Returns the behavior when focus is lost.
    def getFocusLostBehavior(): Int = ???

    @stub
    // Returns the AbstractFormatter that is used to format and
    // parse the current value.
    def getFormatter(): JFormattedTextField.AbstractFormatter = ???

    @stub
    // Returns the current AbstractFormatterFactory.
    def getFormatterFactory(): JFormattedTextField.AbstractFormatterFactory = ???

    @stub
    // Gets the class ID for a UI.
    def getUIClassID(): String = ???

    @stub
    // Returns the last valid value.
    def getValue(): Object = ???

    @stub
    // Invoked when the user inputs an invalid value.
    protected def invalidEdit(): Unit = ???

    @stub
    // Returns true if the current value being edited is valid.
    def isEditValid(): Boolean = ???

    @stub
    // Processes any focus events, such as
    // FocusEvent.FOCUS_GAINED or
    // FocusEvent.FOCUS_LOST.
    protected def processFocusEvent(e: FocusEvent): Unit = ???

    @stub
    // Processes any input method events, such as
    // InputMethodEvent.INPUT_METHOD_TEXT_CHANGED or
    // InputMethodEvent.CARET_POSITION_CHANGED.
    protected def processInputMethodEvent(e: InputMethodEvent): Unit = ???

    @stub
    // Associates the editor with a text document.
    def setDocument(doc: Document): Unit = ???

    @stub
    // Sets the behavior when focus is lost.
    def setFocusLostBehavior(behavior: Int): Unit = ???

    @stub
    // Sets the current AbstractFormatter.
    protected def setFormatter(format: JFormattedTextField.AbstractFormatter): Unit = ???

    @stub
    // Sets the AbstractFormatterFactory.
    def setFormatterFactory(tf: JFormattedTextField.AbstractFormatterFactory): Unit = ???
}

object JFormattedTextField {
    @stub
    // Instances of AbstractFormatter are used by
    // JFormattedTextField to handle the conversion both
    // from an Object to a String, and back from a String to an Object.
    def JFormattedTextField.AbstractFormatter: class = ???

    @stub
    // Constant identifying that when focus is lost,
    // commitEdit should be invoked.
    def COMMIT: Int = ???

    @stub
    // Constant identifying that when focus is lost,
    // commitEdit should be invoked.
    def COMMIT_OR_REVERT: Int = ???

    @stub
    // Constant identifying that when focus is lost, the edited value
    // should be left.
    def PERSIST: Int = ???
}
