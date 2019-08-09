package javax.swing.event

import java.util.EventListener

/** A popup menu listener */
trait PopupMenuListener extends EventListener {

    /** This method is called when the popup menu is canceled */
    @stub
    def popupMenuCanceled(e: PopupMenuEvent): Unit = ???

    /** This method is called before the popup menu becomes invisible
     *  Note that a JPopupMenu can become invisible any time
     */
    @stub
    def popupMenuWillBecomeInvisible(e: PopupMenuEvent): Unit = ???
}
