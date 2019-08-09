package javax.swing.plaf.basic

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import scala.scalanative.annotation.stub

/** Provides the look and feel implementation for
 *  JFormattedTextField.
 */
class BasicFormattedTextFieldUI extends BasicTextFieldUI {

    /**  */
    @stub
    def this() = ???

    /** Fetches the name used as a key to lookup properties through the
     *  UIManager.
     */
    @stub
    protected def getPropertyPrefix(): String = ???
}

object BasicFormattedTextFieldUI {
    /** Creates a UI for a JFormattedTextField. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
