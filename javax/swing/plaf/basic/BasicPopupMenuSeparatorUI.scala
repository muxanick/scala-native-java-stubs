package javax.swing.plaf.basic

import java.awt.Dimension
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, SeparatorUI}

/** A Basic L&F implementation of PopupMenuSeparatorUI.  This implementation
 *  is a "combined" view/controller.
 */
class BasicPopupMenuSeparatorUI extends BasicSeparatorUI {

    /** Returns the specified component's preferred size appropriate for
     *  the look and feel.
     */
    @stub
    def getPreferredSize(c: JComponent): Dimension = ???
}

object BasicPopupMenuSeparatorUI {
    /**  */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
