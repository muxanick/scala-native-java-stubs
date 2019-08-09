package javax.swing.event

import java.util.EventListener

// A popup menu listener
trait PopupMenuListener extends EventListener {

    @stub
    // This method is called when the popup menu is canceled
    def popupMenuCanceled(e: PopupMenuEvent): Unit = ???

    @stub
    // This method is called before the popup menu becomes invisible
    // Note that a JPopupMenu can become invisible any time
    def popupMenuWillBecomeInvisible(e: PopupMenuEvent): Unit = ???
}
