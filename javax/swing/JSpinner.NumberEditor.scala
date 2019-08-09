package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import java.text.DecimalFormat
import scala.scalanative.annotation.stub

/** An editor for a JSpinner whose model is a
 *  SpinnerNumberModel.  The value of the editor is
 *  displayed with a JFormattedTextField whose format
 *  is defined by a NumberFormatter instance whose
 *  minimum and maximum properties
 *  are mapped to the SpinnerNumberModel.
 */
object JSpinner.NumberEditor extends JSpinner.DefaultEditor {

    /** Construct a JSpinner editor that supports displaying
     *  and editing the value of a SpinnerNumberModel
     *  with a JFormattedTextField.
     */
    @stub
    def NumberEditor(spinner: JSpinner) = ???

    /** Construct a JSpinner editor that supports displaying
     *  and editing the value of a SpinnerNumberModel
     *  with a JFormattedTextField.
     */
    @stub
    def NumberEditor(spinner: JSpinner, decimalFormatPattern: String) = ???

    /** Returns the java.text.DecimalFormat object the
     *  JFormattedTextField uses to parse and format
     *  numbers.
     */
    @stub
    def getFormat(): DecimalFormat = ???

    /** Return our spinner ancestor's SpinnerNumberModel. */
    @stub
    def getModel(): SpinnerNumberModel = ???
}
