package javax.swing.plaf.metal

import java.awt.Dimension
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, SeparatorUI}
import javax.swing.plaf.basic.BasicSeparatorUI

/** A Metal L&F implementation of PopupMenuSeparatorUI.  This implementation
 *  is a "combined" view/controller.
 */
class MetalPopupMenuSeparatorUI extends MetalSeparatorUI {

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???
}

object MetalPopupMenuSeparatorUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
