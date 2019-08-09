package javax.swing.plaf.synth

import java.awt.Graphics
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ButtonUI, ComponentUI}
import javax.swing.plaf.basic.BasicButtonUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JCheckBox.
 */
class SynthCheckBoxUI extends SynthRadioButtonUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected def getPropertyPrefix(): String = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
}

object SynthCheckBoxUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
