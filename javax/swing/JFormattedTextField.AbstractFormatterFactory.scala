package javax.swing

import java.lang.Object
import scala.scalanative.annotation.stub

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
object abstract JFormattedTextField_AbstractFormatterFactory extends Object {

    /**  */
    @stub
    def AbstractFormatterFactory() = ???

    /** Returns an AbstractFormatter that can handle formatting
     *  of the passed in JFormattedTextField.
     */
    def getFormatter(tf: JFormattedTextField): JFormattedTextField.AbstractFormatter
}
