package javax.swing.plaf.synth

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}
import javax.swing.plaf.basic.BasicMenuItemUI

// Provides the Synth L&F UI delegate for
// JRadioButtonMenuItem.
class SynthRadioButtonMenuItemUI extends SynthMenuItemUI {

    @stub
    // 
    protected def getPropertyPrefix(): String = ???
}

object SynthRadioButtonMenuItemUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(b: JComponent): ComponentUI = ???
}
