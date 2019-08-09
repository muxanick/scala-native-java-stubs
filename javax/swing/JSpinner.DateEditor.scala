package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import java.text.SimpleDateFormat
import scala.scalanative.annotation.stub

/** An editor for a JSpinner whose model is a
 *  SpinnerDateModel.  The value of the editor is
 *  displayed with a JFormattedTextField whose format
 *  is defined by a DateFormatter instance whose
 *  minimum and maximum properties
 *  are mapped to the SpinnerDateModel.
 */
object JSpinner.DateEditor extends JSpinner.DefaultEditor {

    /** Construct a JSpinner editor that supports displaying
     *  and editing the value of a SpinnerDateModel
     *  with a JFormattedTextField.
     */
    @stub
    def DateEditor(spinner: JSpinner) = ???

    /** Construct a JSpinner editor that supports displaying
     *  and editing the value of a SpinnerDateModel
     *  with a JFormattedTextField.
     */
    @stub
    def DateEditor(spinner: JSpinner, dateFormatPattern: String) = ???

    /** Returns the java.text.SimpleDateFormat object the
     *  JFormattedTextField uses to parse and format
     *  numbers.
     */
    @stub
    def getFormat(): SimpleDateFormat = ???

    /** Return our spinner ancestor's SpinnerDateModel. */
    @stub
    def getModel(): SpinnerDateModel = ???
}
