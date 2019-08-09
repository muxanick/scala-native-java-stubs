package javax.swing.plaf.synth

import java.lang.{Object, String}
import javax.swing.{AbstractButton, Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.BasicButtonUI

// Provides the Synth L&F UI delegate for
// JRadioButton.
class SynthRadioButtonUI extends SynthToggleButtonUI {

    @stub
    // 
    protected def getPropertyPrefix(): String = ???

    @stub
    // Returns the Icon used in calculating the
    // preferred/minimum/maximum size.
    protected def getSizingIcon(b: AbstractButton): Icon = ???
}

object SynthRadioButtonUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(b: JComponent): ComponentUI = ???
}
