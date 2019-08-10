package javax.swing

import java.awt.{Component, Container}
import java.lang.Object
import scala.scalanative.annotation.stub

/** An editor for a JSpinner whose model is a
 *  SpinnerListModel.
 */
object JSpinner_ListEditor extends JSpinner.DefaultEditor {

    /** Construct a JSpinner editor that supports displaying
     *  and editing the value of a SpinnerListModel
     *  with a JFormattedTextField.
     */
    @stub
    def ListEditor(spinner: JSpinner) = ???

    /** Return our spinner ancestor's SpinnerNumberModel. */
    @stub
    def getModel(): SpinnerListModel = ???
}
