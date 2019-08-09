package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicListUI.
 */
class BasicListUI.FocusHandler extends Object with FocusListener {

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Invoked when a component loses the keyboard focus. */
    @stub
    def focusLost(e: FocusEvent): Unit = ???
}
