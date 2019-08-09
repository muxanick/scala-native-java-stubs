package javax.swing.plaf.synth

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicTextFieldUI, BasicTextUI}

// Provides the Synth L&F UI delegate for
// JFormattedTextField.
class SynthFormattedTextFieldUI extends SynthTextFieldUI {

    @stub
    // Fetches the name used as a key to lookup properties through the
    // UIManager.
    protected def getPropertyPrefix(): String = ???
}

object SynthFormattedTextFieldUI {
    @stub
    // Creates a UI for a JFormattedTextField.
    def createUI(c: JComponent): ComponentUI = ???
}
