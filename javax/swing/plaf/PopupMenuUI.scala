package javax.swing.plaf

import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.{JPopupMenu, Popup}
import scala.scalanative.annotation.stub

/** Pluggable look and feel interface for JPopupMenu. */
abstract class PopupMenuUI extends ComponentUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the Popup that will be responsible for
     *  displaying the JPopupMenu.
     */
    def getPopup(popup: JPopupMenu, x: Int, y: Int): Popup

    /**  */
    def isPopupTrigger(e: MouseEvent): Boolean
}
