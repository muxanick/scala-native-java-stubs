package javax.swing.plaf.metal

import java.awt.{Dimension, Graphics}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, SeparatorUI}
import javax.swing.plaf.basic.BasicSeparatorUI
import scala.scalanative.annotation.stub

/** A Metal L&F implementation of PopupMenuSeparatorUI.  This implementation
 *  is a "combined" view/controller.
 */
class MetalPopupMenuSeparatorUI extends MetalSeparatorUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???

    /** Paints the specified component appropriately for the look and feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???
}

object MetalPopupMenuSeparatorUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
