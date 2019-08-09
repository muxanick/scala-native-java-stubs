package javax.swing.plaf.synth

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.BasicButtonUI

// Provides the Synth L&F UI delegate for
// JToggleButton.
class SynthToggleButtonUI extends SynthButtonUI {

    @stub
    // 
    protected def getPropertyPrefix(): String = ???
}

object SynthToggleButtonUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(b: JComponent): ComponentUI = ???
}
