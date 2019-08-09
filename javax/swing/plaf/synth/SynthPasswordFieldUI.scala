package javax.swing.plaf.synth

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicTextFieldUI, BasicTextUI}
import javax.swing.text.{Element, View}

// Provides the Synth L&F UI delegate for
// JPasswordField.
class SynthPasswordFieldUI extends SynthTextFieldUI {

    @stub
    // Creates a view (PasswordView) for an element.
    def create(elem: Element): View = ???

    @stub
    // Fetches the name used as a key to look up properties through the
    // UIManager.
    protected def getPropertyPrefix(): String = ???

    @stub
    // 
    protected def installKeyboardActions(): Unit = ???
}

object SynthPasswordFieldUI {
    @stub
    // Creates a UI for a JPasswordField.
    def createUI(c: JComponent): ComponentUI = ???
}
