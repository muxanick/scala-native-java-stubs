package javax.swing.plaf.metal

import java.awt.Graphics
import java.lang.{Object, String}
import javax.swing.{JComponent, JLabel}
import javax.swing.plaf.{ComponentUI, LabelUI}
import javax.swing.plaf.basic.BasicLabelUI
import scala.scalanative.annotation.stub

/** A Windows L&F implementation of LabelUI.  This implementation
 *  is completely static, i.e. there's only one UIView implementation
 *  that's shared by all JLabel objects.
 */
class MetalLabelUI extends BasicLabelUI {

    /**  */
    @stub
    def this() = ???

    /** Just paint the text gray (Label.disabledForeground) rather than
     *  in the labels foreground color.
     */
    @stub
    protected def paintDisabledText(l: JLabel, g: Graphics, s: String, textX: Int, textY: Int): Unit = ???
}

object MetalLabelUI {
    /** The default MetalLabelUI instance. */
    @stub
    protected val metalLabelUI: MetalLabelUI = ???

    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
