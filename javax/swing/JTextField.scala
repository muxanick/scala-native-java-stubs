package javax.swing

import java.awt.{Component, Container, Dimension, Font, Rectangle}
import java.awt.event.ActionListener
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.AccessibleContext
import javax.swing.text.{Document, JTextComponent}

// JTextField is a lightweight component that allows the editing
// of a single line of text.
// For information on and examples of using text fields,
// see
// How to Use Text Fields
// in The Java Tutorial.
//
// 
// JTextField is intended to be source-compatible
// with java.awt.TextField where it is reasonable to do so.  This
// component has capabilities not found in the java.awt.TextField
// class.  The superclass should be consulted for additional capabilities.
// 
// JTextField has a method to establish the string used as the
// command string for the action event that gets fired.  The
// java.awt.TextField used the text of the field as the command
// string for the ActionEvent.
// JTextField will use the command
// string set with the setActionCommand method if not null,
// otherwise it will use the text of the field as a compatibility with
// java.awt.TextField.
// 
// The method setEchoChar and getEchoChar
// are not provided directly to avoid a new implementation of a
// pluggable look-and-feel inadvertently exposing password characters.
// To provide password-like services a separate class JPasswordField
// extends JTextField to provide this service with an independently
// pluggable look-and-feel.
// 
// The java.awt.TextField could be monitored for changes by adding
// a TextListener for TextEvent's.
// In the JTextComponent based
// components, changes are broadcasted from the model via a
// DocumentEvent to DocumentListeners.
// The DocumentEvent gives
// the location of the change and the kind of change if desired.
// The code fragment might look something like:
// 
//     DocumentListener myListener = ??;
//     JTextField myArea = ??;
//     myArea.getDocument().addDocumentListener(myListener);
// 
// 
// The horizontal alignment of JTextField can be set to be left
// justified, leading justified, centered, right justified or trailing justified.
// Right/trailing justification is useful if the required size
// of the field text is smaller than the size allocated to it.
// This is determined by the setHorizontalAlignment
// and getHorizontalAlignment methods.  The default
// is to be leading justified.
// 
// How the text field consumes VK_ENTER events depends
// on whether the text field has any action listeners.
// If so, then VK_ENTER results in the listeners
// getting an ActionEvent,
// and the VK_ENTER event is consumed.
// This is compatible with how AWT text fields handle VK_ENTER events.
// If the text field has no action listeners, then as of v 1.3 the VK_ENTER
// event is not consumed.  Instead, the bindings of ancestor components
// are processed, which enables the default button feature of
// JFC/Swing to work.
// 
// Customized fields can easily be created by extending the model and
// changing the default model provided.  For example, the following piece
// of code will create a field that holds only upper case characters.  It
// will work even if text is pasted into from the clipboard or it is altered via
// programmatic changes.
// 
//
// public class UpperCaseField extends JTextField {
// 
//     public UpperCaseField(int cols) {
//         super(cols);
//     }
// 
//     protected Document createDefaultModel() {
//         return new UpperCaseDocument();
//     }
// 
//     static class UpperCaseDocument extends PlainDocument {
// 
//         public void insertString(int offs, String str, AttributeSet a)
//             throws BadLocationException {
// 
//             if (str == null) {
//                 return;
//             }
//             char[] upper = str.toCharArray();
//             for (int i = 0; i < upper.length; i++) {
//                 upper[i] = Character.toUpperCase(upper[i]);
//             }
//             super.insertString(offs, new String(upper), a);
//         }
//     }
// }
//
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
class JTextField extends JTextComponent with SwingConstants {

    @stub
    // Constructs a new TextField.
    def this() = ???

    @stub
    // Constructs a new JTextField that uses the given text
    // storage model and the given number of columns.
    def this(doc: Document, text: String, columns: Int) = ???

    @stub
    // Constructs a new empty TextField with the specified
    // number of columns.
    def this(columns: Int) = ???

    @stub
    // Constructs a new TextField initialized with the
    // specified text.
    def this(text: String) = ???

    @stub
    // Updates the textfield's state in response to property changes in
    // associated action.
    protected def actionPropertyChanged(action: Action, propertyName: String): Unit = ???

    @stub
    // Adds the specified action listener to receive
    // action events from this textfield.
    def addActionListener(l: ActionListener): Unit = ???

    @stub
    // Sets the properties on this textfield to match those in the specified
    // Action.
    protected def configurePropertiesFromAction(a: Action): Unit = ???

    @stub
    // Creates and returns a PropertyChangeListener that is
    // responsible for listening for changes from the specified
    // Action and updating the appropriate properties.
    protected def createActionPropertyChangeListener(a: Action): PropertyChangeListener = ???

    @stub
    // Creates the default implementation of the model
    // to be used at construction if one isn't explicitly
    // given.
    protected def createDefaultModel(): Document = ???

    @stub
    // Notifies all listeners that have registered interest for
    // notification on this event type.
    protected def fireActionPerformed(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this
    // JTextField.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the currently set Action for this
    // ActionEvent source, or null
    // if no Action is set.
    def getAction(): Action = ???

    @stub
    // Returns an array of all the ActionListeners added
    // to this JTextField with addActionListener().
    def getActionListeners(): Array[ActionListener] = ???

    @stub
    // Fetches the command list for the editor.
    def getActions(): Array[Action] = ???

    @stub
    // Returns the number of columns in this TextField.
    def getColumns(): Int = ???

    @stub
    // Returns the column width.
    protected def getColumnWidth(): Int = ???

    @stub
    // Returns the horizontal alignment of the text.
    def getHorizontalAlignment(): Int = ???

    @stub
    // Gets the visibility of the text field.
    def getHorizontalVisibility(): BoundedRangeModel = ???

    @stub
    // Returns the preferred size Dimensions needed for this
    // TextField.
    def getPreferredSize(): Dimension = ???

    @stub
    // Gets the scroll offset, in pixels.
    def getScrollOffset(): Int = ???

    @stub
    // Gets the class ID for a UI.
    def getUIClassID(): String = ???

    @stub
    // Calls to revalidate that come from within the
    // textfield itself will
    // be handled by validating the textfield, unless the textfield
    // is contained within a JViewport,
    // in which case this returns false.
    def isValidateRoot(): Boolean = ???

    @stub
    // Returns a string representation of this JTextField.
    protected def paramString(): String = ???

    @stub
    // Processes action events occurring on this textfield by
    // dispatching them to any registered ActionListener objects.
    def postActionEvent(): Unit = ???

    @stub
    // Removes the specified action listener so that it no longer
    // receives action events from this textfield.
    def removeActionListener(l: ActionListener): Unit = ???

    @stub
    // Scrolls the field left or right.
    def scrollRectToVisible(r: Rectangle): Unit = ???

    @stub
    // Sets the Action for the ActionEvent source.
    def setAction(a: Action): Unit = ???

    @stub
    // Sets the command string used for action events.
    def setActionCommand(command: String): Unit = ???

    @stub
    // Sets the number of columns in this TextField,
    // and then invalidate the layout.
    def setColumns(columns: Int): Unit = ???

    @stub
    // Associates the editor with a text document.
    def setDocument(doc: Document): Unit = ???

    @stub
    // Sets the current font.
    def setFont(f: Font): Unit = ???

    @stub
    // Sets the horizontal alignment of the text.
    def setHorizontalAlignment(alignment: Int): Unit = ???
}