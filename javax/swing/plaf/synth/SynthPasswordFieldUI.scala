package javax.swing.plaf.synth

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicTextFieldUI, BasicTextUI}
import javax.swing.text.{Element, View}

/** Provides the Synth L&F UI delegate for
 *  JPasswordField.
 */
class SynthPasswordFieldUI extends SynthTextFieldUI {

    /** Creates a view (PasswordView) for an element. */
    @stub
    def create(elem: Element): View = ???

    /** Fetches the name used as a key to look up properties through the
     *  UIManager.
     */
    @stub
    protected def getPropertyPrefix(): String = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???
}

object SynthPasswordFieldUI {
    /** Creates a UI for a JPasswordField. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
