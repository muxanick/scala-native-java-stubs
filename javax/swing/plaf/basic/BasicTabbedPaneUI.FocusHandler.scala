package javax.swing.plaf.basic

import java.awt.event.{FocusAdapter, FocusEvent}
import java.lang.Object

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicTabbedPaneUI.
 */
class BasicTabbedPaneUI.FocusHandler extends FocusAdapter {

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(e: FocusEvent): Unit = ???
}
