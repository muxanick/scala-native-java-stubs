package javax.swing.plaf

import java.lang.Object
import javax.swing.{JPopupMenu, Popup}

// Pluggable look and feel interface for JPopupMenu.
abstract class PopupMenuUI extends ComponentUI {

    // Returns the Popup that will be responsible for
    // displaying the JPopupMenu.
    def getPopup(popup: JPopupMenu, x: Int, y: Int): Popup
}
