package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object

// Repaints the lead selection row when focus is lost/gained.
class BasicTreeUI.FocusHandler extends Object with FocusListener {

    @stub
    // Invoked when focus is activated on the tree we're in, redraws the
    // lead row.
    def focusGained(e: FocusEvent): Unit = ???
}
