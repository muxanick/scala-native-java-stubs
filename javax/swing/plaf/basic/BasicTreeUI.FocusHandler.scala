package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Repaints the lead selection row when focus is lost/gained. */
class BasicTreeUI_FocusHandler extends Object with FocusListener {

    /**  */
    @stub
    def FocusHandler() = ???

    /** Invoked when focus is activated on the tree we're in, redraws the
     *  lead row.
     */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Invoked when focus is activated on the tree we're in, redraws the
     *  lead row.
     */
    @stub
    def focusLost(e: FocusEvent): Unit = ???
}
