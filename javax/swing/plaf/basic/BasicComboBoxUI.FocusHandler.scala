package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This listener hides the popup when the focus is lost.  It also repaints
 *  when focus is gained or lost.
 * 
 *  This public inner class should be treated as protected.
 *  Instantiate it only within subclasses of
 *  BasicComboBoxUI.
 */
class BasicComboBoxUI_FocusHandler extends Object with FocusListener {

    /**  */
    @stub
    def FocusHandler() = ???

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Invoked when a component loses the keyboard focus. */
    @stub
    def focusLost(e: FocusEvent): Unit = ???
}
