package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Dimension, Font, Rectangle}
import java.awt.event.ActionListener
import java.beans.PropertyChangeListener
import java.lang.{Object, String}
import javax.accessibility.{AccessibleContext, AccessibleStateSet}
import javax.swing.text.{Document, JTextComponent, JTextComponent.AccessibleJTextComponent}
import scala.scalanative.annotation.stub

/** JTextField is a lightweight component that allows the editing
 *  of a single line of text.
 *  For information on and examples of using text fields,
 *  see
 *  How to Use Text Fields
 *  in The Java Tutorial.
 * 
 *  
 *  JTextField is intended to be source-compatible
 *  with java.awt.TextField where it is reasonable to do so.  This
 *  component has capabilities not found in the java.awt.TextField
 *  class.  The superclass should be consulted for additional capabilities.
 *  
 *  JTextField has a method to establish the string used as the
 *  command string for the action event that gets fired.  The
 *  java.awt.TextField used the text of the field as the command
 *  string for the ActionEvent.
 *  JTextField will use the command
 *  string set with the setActionCommand method if not null,
 *  otherwise it will use the text of the field as a compatibility with
 *  java.awt.TextField.
 *  
 *  The method setEchoChar and getEchoChar
 *  are not provided directly to avoid a new implementation of a
 *  pluggable look-and-feel inadvertently exposing password characters.
 *  To provide password-like services a separate class JPasswordField
 *  extends JTextField to provide this service with an independently
 *  pluggable look-and-feel.
 *  
 *  The java.awt.TextField could be monitored for changes by adding
 *  a TextListener for TextEvent's.
 *  In the JTextComponent based
 *  components, changes are broadcasted from the model via a
 *  DocumentEvent to DocumentListeners.
 *  The DocumentEvent gives
 *  the location of the change and the kind of change if desired.
 *  The code fragment might look something like:
 *  
 *      DocumentListener myListener = ??;
 *      JTextField myArea = ??;
 *      myArea.getDocument().addDocumentListener(myListener);
 *  
 *  
 *  The horizontal alignment of JTextField can be set to be left
 *  justified, leading justified, centered, right justified or trailing justified.
 *  Right/trailing justification is useful if the required size
 *  of the field text is smaller than the size allocated to it.
 *  This is determined by the setHorizontalAlignment
 *  and getHorizontalAlignment methods.  The default
 *  is to be leading justified.
 *  
 *  How the text field consumes VK_ENTER events depends
 *  on whether the text field has any action listeners.
 *  If so, then VK_ENTER results in the listeners
 *  getting an ActionEvent,
 *  and the VK_ENTER event is consumed.
 *  This is compatible with how AWT text fields handle VK_ENTER events.
 *  If the text field has no action listeners, then as of v 1.3 the VK_ENTER
 *  event is not consumed.  Instead, the bindings of ancestor components
 *  are processed, which enables the default button feature of
 *  JFC/Swing to work.
 *  
 *  Customized fields can easily be created by extending the model and
 *  changing the default model provided.  For example, the following piece
 *  of code will create a field that holds only upper case characters.  It
 *  will work even if text is pasted into from the clipboard or it is altered via
 *  programmatic changes.
 *  
 * 
 *  public class UpperCaseField extends JTextField {
 *  
 *      public UpperCaseField(int cols) {
 *          super(cols);
 *      }
 *  
 *      protected Document createDefaultModel() {
 *          return new UpperCaseDocument();
 *      }
 *  
 *      static class UpperCaseDocument extends PlainDocument {
 *  
 *          public void insertString(int offs, String str, AttributeSet a)
 *              throws BadLocationException {
 *  
 *              if (str == null) {
 *                  return;
 *              }
 *              char[] upper = str.toCharArray();
 *              for (int i = 0; i < upper.length; i++) {
 *                  upper[i] = Character.toUpperCase(upper[i]);
 *              }
 *              super.insertString(offs, new String(upper), a);
 *          }
 *      }
 *  }
 * 
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
class JTextField extends JTextComponent with SwingConstants {

    /** Constructs a new TextField. */
    @stub
    def this() = ???

    /** Constructs a new JTextField that uses the given text
     *  storage model and the given number of columns.
     */
    @stub
    def this(doc: Document, text: String, columns: Int) = ???

    /** Constructs a new empty TextField with the specified
     *  number of columns.
     */
    @stub
    def this(columns: Int) = ???

    /** Constructs a new TextField initialized with the
     *  specified text.
     */
    @stub
    def this(text: String) = ???

    /** Constructs a new TextField initialized with the
     *  specified text and columns.
     */
    @stub
    def this(text: String, columns: Int) = ???

    /** This class implements accessibility support for the
     *  JTextField class.  It provides an implementation of the
     *  Java Accessibility API appropriate to text field user-interface
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
    protected class AccessibleJTextField extends JTextComponent.AccessibleJTextComponent {

        /**  */
        @stub
        protected def this() = ???

        /** Gets the state set of this object. */
        @stub
        def getAccessibleStateSet(): AccessibleStateSet = ???
    }


    /** Updates the textfield's state in response to property changes in
     *  associated action.
     */
    @stub
    protected def actionPropertyChanged(action: Action, propertyName: String): Unit = ???

    /** Adds the specified action listener to receive
     *  action events from this textfield.
     */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Sets the properties on this textfield to match those in the specified
     *  Action.
     */
    @stub
    protected def configurePropertiesFromAction(a: Action): Unit = ???

    /** Creates and returns a PropertyChangeListener that is
     *  responsible for listening for changes from the specified
     *  Action and updating the appropriate properties.
     */
    @stub
    protected def createActionPropertyChangeListener(a: Action): PropertyChangeListener = ???

    /** Creates the default implementation of the model
     *  to be used at construction if one isn't explicitly
     *  given.
     */
    @stub
    protected def createDefaultModel(): Document = ???

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    @stub
    protected def fireActionPerformed(): Unit = ???

    /** Gets the AccessibleContext associated with this
     *  JTextField.
     */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the currently set Action for this
     *  ActionEvent source, or null
     *  if no Action is set.
     */
    @stub
    def getAction(): Action = ???

    /** Returns an array of all the ActionListeners added
     *  to this JTextField with addActionListener().
     */
    @stub
    def getActionListeners(): Array[ActionListener] = ???

    /** Fetches the command list for the editor. */
    @stub
    def getActions(): Array[Action] = ???

    /** Returns the number of columns in this TextField. */
    @stub
    def getColumns(): Int = ???

    /** Returns the column width. */
    @stub
    protected def getColumnWidth(): Int = ???

    /** Returns the horizontal alignment of the text. */
    @stub
    def getHorizontalAlignment(): Int = ???

    /** Gets the visibility of the text field. */
    @stub
    def getHorizontalVisibility(): BoundedRangeModel = ???

    /** Returns the preferred size Dimensions needed for this
     *  TextField.
     */
    @stub
    def getPreferredSize(): Dimension = ???

    /** Gets the scroll offset, in pixels. */
    @stub
    def getScrollOffset(): Int = ???

    /** Gets the class ID for a UI. */
    @stub
    def getUIClassID(): String = ???

    /** Calls to revalidate that come from within the
     *  textfield itself will
     *  be handled by validating the textfield, unless the textfield
     *  is contained within a JViewport,
     *  in which case this returns false.
     */
    @stub
    def isValidateRoot(): Boolean = ???

    /** Returns a string representation of this JTextField. */
    @stub
    protected def paramString(): String = ???

    /** Processes action events occurring on this textfield by
     *  dispatching them to any registered ActionListener objects.
     */
    @stub
    def postActionEvent(): Unit = ???

    /** Removes the specified action listener so that it no longer
     *  receives action events from this textfield.
     */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Scrolls the field left or right. */
    @stub
    def scrollRectToVisible(r: Rectangle): Unit = ???

    /** Sets the Action for the ActionEvent source. */
    @stub
    def setAction(a: Action): Unit = ???

    /** Sets the command string used for action events. */
    @stub
    def setActionCommand(command: String): Unit = ???

    /** Sets the number of columns in this TextField,
     *  and then invalidate the layout.
     */
    @stub
    def setColumns(columns: Int): Unit = ???

    /** Associates the editor with a text document. */
    @stub
    def setDocument(doc: Document): Unit = ???

    /** Sets the current font. */
    @stub
    def setFont(f: Font): Unit = ???

    /** Sets the horizontal alignment of the text. */
    @stub
    def setHorizontalAlignment(alignment: Int): Unit = ???

    /** Sets the scroll offset, in pixels. */
    @stub
    def setScrollOffset(scrollOffset: Int): Unit = ???
}

object JTextField {
    /** Name of the action to send notification that the
     *  contents of the field have been accepted.
     */
    @stub
    val notifyAction: String = ???
}
