package javax.swing.plaf.synth

import java.lang.{Object, String}
import javax.swing.{AbstractButton, Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.BasicButtonUI

/** Provides the Synth L&F UI delegate for
 *  JRadioButton.
 */
class SynthRadioButtonUI extends SynthToggleButtonUI {

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /** Returns the Icon used in calculating the
     *  preferred/minimum/maximum size.
     */
    @stub
    protected def getSizingIcon(b: AbstractButton): Icon = ???
}

object SynthRadioButtonUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
