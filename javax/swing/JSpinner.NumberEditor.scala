package javax.swing

import java.awt.{Component, Container}
import java.lang.Object
import java.text.DecimalFormat

// An editor for a JSpinner whose model is a
// SpinnerNumberModel.  The value of the editor is
// displayed with a JFormattedTextField whose format
// is defined by a NumberFormatter instance whose
// minimum and maximum properties
// are mapped to the SpinnerNumberModel.
object JSpinner.NumberEditor extends JSpinner.DefaultEditor {

    @stub
    // Construct a JSpinner editor that supports displaying
    // and editing the value of a SpinnerNumberModel
    // with a JFormattedTextField.
    def NumberEditor(spinner: JSpinner) = ???

    @stub
    // Returns the java.text.DecimalFormat object the
    // JFormattedTextField uses to parse and format
    // numbers.
    def getFormat(): DecimalFormat = ???
}
