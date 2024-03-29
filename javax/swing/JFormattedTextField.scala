package javax.swing

import java.awt.{Component, Container}
import java.awt.event.{FocusEvent, InputMethodEvent}
import java.io.Serializable
import java.lang.{Object, String}
import java.text.Format
import javax.swing.text.{Document, DocumentFilter, JTextComponent, NavigationFilter}
import scala.scalanative.annotation.stub

/** JFormattedTextField extends JTextField adding
 *  support for formatting arbitrary values, as well as retrieving a particular
 *  object once the user has edited the text. The following illustrates
 *  configuring a JFormattedTextField to edit dates:
 *  
 *    JFormattedTextField ftf = new JFormattedTextField();
 *    ftf.setValue(new Date());
 *  
 *  
 *  Once a JFormattedTextField has been created, you can
 *  listen for editing changes by way of adding
 *  a PropertyChangeListener and listening for
 *  PropertyChangeEvents with the property name value.
 *  
 *  JFormattedTextField allows
 *  configuring what action should be taken when focus is lost. The possible
 *  configurations are:
 *  
 *  ValueDescription
 *  JFormattedTextField.REVERT
 *             Revert the display to match that of getValue,
 *                 possibly losing the current edit.
 *         JFormattedTextField.COMMIT
 *             Commits the current value. If the value being edited
 *                 isn't considered a legal value by the
 *                 AbstractFormatter that is, a
 *                 ParseException is thrown, then the value
 *                 will not change, and then edited value will persist.
 *         JFormattedTextField.COMMIT_OR_REVERT
 *             Similar to COMMIT, but if the value isn't
 *                 legal, behave like REVERT.
 *         JFormattedTextField.PERSIST
 *             Do nothing, don't obtain a new
 *                 AbstractFormatter, and don't update the value.
 *  
 *  The default is JFormattedTextField.COMMIT_OR_REVERT,
 *  refer to setFocusLostBehavior(int) for more information on this.
 *  
 *  JFormattedTextField allows the focus to leave, even if
 *  the currently edited value is invalid. To lock the focus down while the
 *  JFormattedTextField is an invalid edit state
 *  you can attach an InputVerifier. The following code snippet
 *  shows a potential implementation of such an InputVerifier:
 *  
 *  public class FormattedTextFieldVerifier extends InputVerifier {
 *      public boolean verify(JComponent input) {
 *          if (input instanceof JFormattedTextField) {
 *              JFormattedTextField ftf = (JFormattedTextField)input;
 *              AbstractFormatter formatter = ftf.getFormatter();
 *              if (formatter != null) {
 *                  String text = ftf.getText();
 *                  try {
 *                       formatter.stringToValue(text);
 *                       return true;
 *                   } catch (ParseException pe) {
 *                       return false;
 *                   }
 *               }
 *           }
 *           return true;
 *       }
 *       public boolean shouldYieldFocus(JComponent input) {
 *           return verify(input);
 *       }
 *   }
 *  
 *  
 *  Alternatively, you could invoke commitEdit, which would also
 *  commit the value.
 *  
 *  JFormattedTextField does not do the formatting it self,
 *  rather formatting is done through an instance of
 *  JFormattedTextField.AbstractFormatter which is obtained from
 *  an instance of JFormattedTextField.AbstractFormatterFactory.
 *  Instances of JFormattedTextField.AbstractFormatter are
 *  notified when they become active by way of the
 *  install method, at which point the
 *  JFormattedTextField.AbstractFormatter can install whatever
 *  it needs to, typically a DocumentFilter. Similarly when
 *  JFormattedTextField no longer
 *  needs the AbstractFormatter, it will invoke
 *  uninstall.
 *  
 *  JFormattedTextField typically
 *  queries the AbstractFormatterFactory for an
 *  AbstractFormat when it gains or loses focus. Although this
 *  can change based on the focus lost policy. If the focus lost
 *  policy is JFormattedTextField.PERSIST
 *  and the JFormattedTextField has been edited, the
 *  AbstractFormatterFactory will not be queried until the
 *  value has been committed. Similarly if the focus lost policy is
 *  JFormattedTextField.COMMIT and an exception
 *  is thrown from stringToValue, the
 *  AbstractFormatterFactory will not be queried when focus is
 *  lost or gained.
 *  
 *  JFormattedTextField.AbstractFormatter
 *  is also responsible for determining when values are committed to
 *  the JFormattedTextField. Some
 *  JFormattedTextField.AbstractFormatters will make new values
 *  available on every edit, and others will never commit the value. You can
 *  force the current value to be obtained
 *  from the current JFormattedTextField.AbstractFormatter
 *  by way of invoking commitEdit. commitEdit will
 *  be invoked whenever return is pressed in the
 *  JFormattedTextField.
 *  
 *  If an AbstractFormatterFactory has not been explicitly
 *  set, one will be set based on the Class of the value type after
 *  setValue has been invoked (assuming value is non-null).
 *  For example, in the following code an appropriate
 *  AbstractFormatterFactory and AbstractFormatter
 *  will be created to handle formatting of numbers:
 *  
 *    JFormattedTextField tf = new JFormattedTextField();
 *    tf.setValue(100);
 *  
 *  
 *  Warning: As the AbstractFormatter will
 *  typically install a DocumentFilter on the
 *  Document, and a NavigationFilter on the
 *  JFormattedTextField you should not install your own. If you do,
 *  you are likely to see odd behavior in that the editing policy of the
 *  AbstractFormatter will not be enforced.
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
class JFormattedTextField extends JTextField {

    /** Creates a JFormattedTextField with no
     *  AbstractFormatterFactory.
     */
    @stub
    def this() = ???

    /** Creates a JFormattedTextField. */
    @stub
    def this(format: Format) = ???

    /** Creates a JFormattedTextField with the specified
     *  AbstractFormatter.
     */
    @stub
    def this(formatter: JFormattedTextField.AbstractFormatter) = ???

    /** Creates a JFormattedTextField with the specified
     *  AbstractFormatterFactory.
     */
    @stub
    def this(factory: JFormattedTextField.AbstractFormatterFactory) = ???

    /** Creates a JFormattedTextField with the specified
     *  AbstractFormatterFactory and initial value.
     */
    @stub
    def this(factory: JFormattedTextField.AbstractFormatterFactory, currentValue: Any) = ???

    /** Creates a JFormattedTextField with the specified value. */
    @stub
    def this(value: Any) = ???

    /** Forces the current value to be taken from the
     *  AbstractFormatter and set as the current value.
     */
    @stub
    def commitEdit(): Unit = ???

    /** Fetches the command list for the editor. */
    @stub
    def getActions(): Array[Action] = ???

    /** Returns the behavior when focus is lost. */
    @stub
    def getFocusLostBehavior(): Int = ???

    /** Returns the AbstractFormatter that is used to format and
     *  parse the current value.
     */
    @stub
    def getFormatter(): JFormattedTextField.AbstractFormatter = ???

    /** Returns the current AbstractFormatterFactory. */
    @stub
    def getFormatterFactory(): JFormattedTextField.AbstractFormatterFactory = ???

    /** Gets the class ID for a UI. */
    @stub
    def getUIClassID(): String = ???

    /** Returns the last valid value. */
    @stub
    def getValue(): Any = ???

    /** Invoked when the user inputs an invalid value. */
    @stub
    protected def invalidEdit(): Unit = ???

    /** Returns true if the current value being edited is valid. */
    @stub
    def isEditValid(): Boolean = ???

    /** Processes any focus events, such as
     *  FocusEvent.FOCUS_GAINED or
     *  FocusEvent.FOCUS_LOST.
     */
    @stub
    protected def processFocusEvent(e: FocusEvent): Unit = ???

    /** Processes any input method events, such as
     *  InputMethodEvent.INPUT_METHOD_TEXT_CHANGED or
     *  InputMethodEvent.CARET_POSITION_CHANGED.
     */
    @stub
    protected def processInputMethodEvent(e: InputMethodEvent): Unit = ???

    /** Associates the editor with a text document. */
    @stub
    def setDocument(doc: Document): Unit = ???

    /** Sets the behavior when focus is lost. */
    @stub
    def setFocusLostBehavior(behavior: Int): Unit = ???

    /** Sets the current AbstractFormatter. */
    @stub
    protected def setFormatter(format: JFormattedTextField.AbstractFormatter): Unit = ???

    /** Sets the AbstractFormatterFactory. */
    @stub
    def setFormatterFactory(tf: JFormattedTextField.AbstractFormatterFactory): Unit = ???

    /** Sets the value that will be formatted by an
     *  AbstractFormatter obtained from the current
     *  AbstractFormatterFactory.
     */
    @stub
    def setValue(value: Any): Unit = ???
}

object JFormattedTextField {
    /** Instances of AbstractFormatter are used by
     *  JFormattedTextField to handle the conversion both
     *  from an Object to a String, and back from a String to an Object.
     *  AbstractFormatters can also enforce editing policies,
     *  or navigation policies, or manipulate the
     *  JFormattedTextField in any way it sees fit to
     *  enforce the desired policy.
     *  
     *  An AbstractFormatter can only be active in
     *  one JFormattedTextField at a time.
     *  JFormattedTextField invokes
     *  install when it is ready to use it followed
     *  by uninstall when done. Subclasses
     *  that wish to install additional state should override
     *  install and message super appropriately.
     *  
     *  Subclasses must override the conversion methods
     *  stringToValue and valueToString. Optionally
     *  they can override getActions,
     *  getNavigationFilter and getDocumentFilter
     *  to restrict the JFormattedTextField in a particular
     *  way.
     *  
     *  Subclasses that allow the JFormattedTextField to be in
     *  a temporarily invalid state should invoke setEditValid
     *  at the appropriate times.
     */
    abstract object AbstractFormatter extends Object with Serializable {

        /**  */
        @stub
        def apply() = ???

        /** Clones the AbstractFormatter. */
        @stub
        protected def clone(): Any = ???

        /** Subclass and override if you wish to provide a custom set of
         *  Actions.
         */
        @stub
        protected def getActions(): Array[Action] = ???

        /** Subclass and override if you wish to provide a
         *  DocumentFilter to restrict what can be input.
         */
        @stub
        protected def getDocumentFilter(): DocumentFilter = ???

        /** Returns the current JFormattedTextField the
         *  AbstractFormatter is installed on.
         */
        @stub
        protected def getFormattedTextField(): JFormattedTextField = ???

        /** Subclass and override if you wish to provide a filter to restrict
         *  where the user can navigate to.
         */
        @stub
        protected def getNavigationFilter(): NavigationFilter = ???

        /** Installs the AbstractFormatter onto a particular
         *  JFormattedTextField.
         */
        @stub
        def install(ftf: JFormattedTextField): Unit = ???

        /** This should be invoked when the user types an invalid character. */
        @stub
        protected def invalidEdit(): Unit = ???

        /** Invoke this to update the editValid property of the
         *  JFormattedTextField.
         */
        @stub
        protected def setEditValid(valid: Boolean): Unit = ???

        /** Parses text returning an arbitrary Object. */
        def stringToValue(text: String): Any

        /** Uninstalls any state the AbstractFormatter may have
         *  installed on the JFormattedTextField.
         */
        @stub
        def uninstall(): Unit = ???

        /** Returns the string value to display for value. */
        def valueToString(value: Any): String
    }


    /** Instances of AbstractFormatterFactory are used by
     *  JFormattedTextField to obtain instances of
     *  AbstractFormatter which in turn are used to format values.
     *  AbstractFormatterFactory can return different
     *  AbstractFormatters based on the state of the
     *  JFormattedTextField, perhaps returning different
     *  AbstractFormatters when the
     *  JFormattedTextField has focus vs when it
     *  doesn't have focus.
     */
    abstract object AbstractFormatterFactory extends Object {

        /**  */
        @stub
        def apply() = ???

        /** Returns an AbstractFormatter that can handle formatting
         *  of the passed in JFormattedTextField.
         */
        def getFormatter(tf: JFormattedTextField): JFormattedTextField.AbstractFormatter
    }


    /** Constant identifying that when focus is lost,
     *  commitEdit should be invoked.
     */
    @stub
    val COMMIT: Int = ???

    /** Constant identifying that when focus is lost,
     *  commitEdit should be invoked.
     */
    @stub
    val COMMIT_OR_REVERT: Int = ???

    /** Constant identifying that when focus is lost, the edited value
     *  should be left.
     */
    @stub
    val PERSIST: Int = ???

    /** Constant identifying that when focus is lost, editing value should
     *  be reverted to current value set on the
     *  JFormattedTextField.
     */
    @stub
    val REVERT: Int = ???
}
