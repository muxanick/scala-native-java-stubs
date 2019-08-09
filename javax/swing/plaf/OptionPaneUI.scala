package javax.swing.plaf

import java.lang.Object
import javax.swing.JOptionPane
import scala.scalanative.annotation.stub

/** Pluggable look and feel interface for JOptionPane. */
abstract class OptionPaneUI extends ComponentUI {

    /**  */
    @stub
    def this() = ???

    /** Returns true if the user has supplied instances of Component for
     *  either the options or message.
     */
    def containsCustomComponents(op: JOptionPane): Boolean

    /** Requests the component representing the default value to have
     *  focus.
     */
    def selectInitialValue(op: JOptionPane): Unit
}
