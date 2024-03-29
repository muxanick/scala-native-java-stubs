package javax.swing.text

import java.io.Serializable
import java.lang.Object
import javax.swing.{JFormattedTextField, JFormattedTextField.AbstractFormatter, JFormattedTextField.AbstractFormatterFactory}
import scala.scalanative.annotation.stub

/** An implementation of
 *  JFormattedTextField.AbstractFormatterFactory.
 *  DefaultFormatterFactory allows specifying a number of
 *  different JFormattedTextField.AbstractFormatters that are to
 *  be used.
 *  The most important one is the default one
 *  (setDefaultFormatter). The default formatter will be used
 *  if a more specific formatter could not be found. The following process
 *  is used to determine the appropriate formatter to use.
 *  
 *    Is the passed in value null? Use the null formatter.
 *    Does the JFormattedTextField have focus? Use the edit
 *        formatter.
 *    Otherwise, use the display formatter.
 *    If a non-null AbstractFormatter has not been found, use
 *        the default formatter.
 *  
 *  
 *  The following code shows how to configure a
 *  JFormattedTextField with two
 *  JFormattedTextField.AbstractFormatters, one for display and
 *  one for editing.
 *  
 *  JFormattedTextField.AbstractFormatter editFormatter = ...;
 *  JFormattedTextField.AbstractFormatter displayFormatter = ...;
 *  DefaultFormatterFactory factory = new DefaultFormatterFactory(
 *                  displayFormatter, displayFormatter, editFormatter);
 *  JFormattedTextField tf = new JFormattedTextField(factory);
 *  
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
class DefaultFormatterFactory extends JFormattedTextField.AbstractFormatterFactory with Serializable {

    /**  */
    @stub
    def this() = ???

    /** Creates a DefaultFormatterFactory with the specified
     *  JFormattedTextField.AbstractFormatter.
     */
    @stub
    def this(defaultFormat: JFormattedTextField.AbstractFormatter) = ???

    /** Creates a DefaultFormatterFactory with the specified
     *  JFormattedTextField.AbstractFormatters.
     */
    @stub
    def this(defaultFormat: JFormattedTextField.AbstractFormatter, displayFormat: JFormattedTextField.AbstractFormatter) = ???

    /** Creates a DefaultFormatterFactory with the specified
     *  JFormattedTextField.AbstractFormatters.
     */
    @stub
    def this(defaultFormat: JFormattedTextField.AbstractFormatter, displayFormat: JFormattedTextField.AbstractFormatter, editFormat: JFormattedTextField.AbstractFormatter) = ???

    /** Creates a DefaultFormatterFactory with the specified
     *  JFormattedTextField.AbstractFormatters.
     */
    @stub
    def this(defaultFormat: JFormattedTextField.AbstractFormatter, displayFormat: JFormattedTextField.AbstractFormatter, editFormat: JFormattedTextField.AbstractFormatter, nullFormat: JFormattedTextField.AbstractFormatter) = ???

    /** Returns the JFormattedTextField.AbstractFormatter to use
     *  as a last resort, eg in case a display, edit or null
     *  JFormattedTextField.AbstractFormatter
     *  has not been specified.
     */
    @stub
    def getDefaultFormatter(): JFormattedTextField.AbstractFormatter = ???

    /** Returns the JFormattedTextField.AbstractFormatter to use
     *  if the JFormattedTextField is not being edited and either
     *  the value is not-null, or the value is null and a null formatter has
     *  has not been specified.
     */
    @stub
    def getDisplayFormatter(): JFormattedTextField.AbstractFormatter = ???

    /** Returns the JFormattedTextField.AbstractFormatter to use
     *  if the JFormattedTextField is being edited and either
     *  the value is not-null, or the value is null and a null formatter has
     *  has not been specified.
     */
    @stub
    def getEditFormatter(): JFormattedTextField.AbstractFormatter = ???

    /** Returns either the default formatter, display formatter, editor
     *  formatter or null formatter based on the state of the
     *  JFormattedTextField.
     */
    @stub
    def getFormatter(source: JFormattedTextField): JFormattedTextField.AbstractFormatter = ???

    /** Returns the formatter to use if the value is null. */
    @stub
    def getNullFormatter(): JFormattedTextField.AbstractFormatter = ???

    /** Sets the JFormattedTextField.AbstractFormatter to use as
     *  a last resort, eg in case a display, edit or null
     *  JFormattedTextField.AbstractFormatter has not been
     *  specified.
     */
    @stub
    def setDefaultFormatter(atf: JFormattedTextField.AbstractFormatter): Unit = ???

    /** Sets the JFormattedTextField.AbstractFormatter to use if
     *  the JFormattedTextField is not being edited and either
     *  the value is not-null, or the value is null and a null formatter has
     *  has not been specified.
     */
    @stub
    def setDisplayFormatter(atf: JFormattedTextField.AbstractFormatter): Unit = ???

    /** Sets the JFormattedTextField.AbstractFormatter to use if
     *  the JFormattedTextField is being edited and either
     *  the value is not-null, or the value is null and a null formatter has
     *  has not been specified.
     */
    @stub
    def setEditFormatter(atf: JFormattedTextField.AbstractFormatter): Unit = ???

    /** Sets the formatter to use if the value of the JFormattedTextField is
     *  null.
     */
    @stub
    def setNullFormatter(atf: JFormattedTextField.AbstractFormatter): Unit = ???
}
