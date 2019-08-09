package javax.swing.plaf.synth

import java.awt.Graphics
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicTextFieldUI, BasicTextUI}
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JFormattedTextField.
 */
class SynthFormattedTextFieldUI extends SynthTextFieldUI {

    /**  */
    @stub
    def this() = ???

    /** Fetches the name used as a key to lookup properties through the
     *  UIManager.
     */
    @stub
    protected def getPropertyPrefix(): String = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
}

object SynthFormattedTextFieldUI {
    /** Creates a UI for a JFormattedTextField. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
