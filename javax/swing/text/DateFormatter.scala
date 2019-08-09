package javax.swing.text

import java.lang.Object
import java.text.DateFormat
import javax.swing.JFormattedTextField.AbstractFormatter
import scala.scalanative.annotation.stub

/** DateFormatter is an InternationalFormatter that does its
 *  formatting by way of an instance of java.text.DateFormat.
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
class DateFormatter extends InternationalFormatter {

    /** This is shorthand for
     *  new DateFormatter(DateFormat.getDateInstance()).
     */
    @stub
    def this() = ???

    /** Returns a DateFormatter configured with the specified
     *  Format instance.
     */
    @stub
    def this(format: DateFormat) = ???

    /** Sets the format that dictates the legal values that can be edited
     *  and displayed.
     */
    @stub
    def setFormat(format: DateFormat): Unit = ???
}
