package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.{JComponent, JPopupMenu}
import javax.swing.plaf.{ComponentUI, PopupMenuUI}
import scala.scalanative.annotation.stub

/** A Windows L&F implementation of PopupMenuUI.  This implementation
 *  is a "combined" view/controller.
 */
class BasicPopupMenuUI extends PopupMenuUI {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val popupMenu: JPopupMenu = ???

    /**  */
    @stub
    def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def installListeners(): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /**  */
    @stub
    def isPopupTrigger(e: MouseEvent): Boolean = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallKeyboardActions(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicPopupMenuUI {
    /**  */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
