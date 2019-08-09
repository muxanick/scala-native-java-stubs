package javax.swing.plaf.synth

import java.awt.Graphics
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}
import javax.swing.plaf.basic.BasicMenuItemUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JRadioButtonMenuItem.
 */
class SynthRadioButtonMenuItemUI extends SynthMenuItemUI {

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

object SynthRadioButtonMenuItemUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(b: JComponent): ComponentUI = ???
}
