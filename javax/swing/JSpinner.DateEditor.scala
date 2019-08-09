package javax.swing

import java.awt.{Component, Container}
import java.lang.Object
import java.text.SimpleDateFormat

// An editor for a JSpinner whose model is a
// SpinnerDateModel.  The value of the editor is
// displayed with a JFormattedTextField whose format
// is defined by a DateFormatter instance whose
// minimum and maximum properties
// are mapped to the SpinnerDateModel.
object JSpinner.DateEditor extends JSpinner.DefaultEditor {

    @stub
    // Construct a JSpinner editor that supports displaying
    // and editing the value of a SpinnerDateModel
    // with a JFormattedTextField.
    def DateEditor(spinner: JSpinner) = ???

    @stub
    // Returns the java.text.SimpleDateFormat object the
    // JFormattedTextField uses to parse and format
    // numbers.
    def getFormat(): SimpleDateFormat = ???
}