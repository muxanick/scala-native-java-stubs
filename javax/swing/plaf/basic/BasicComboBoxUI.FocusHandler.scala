package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object

// This listener hides the popup when the focus is lost.  It also repaints
// when focus is gained or lost.
//
// This public inner class should be treated as protected.
// Instantiate it only within subclasses of
// BasicComboBoxUI.
class BasicComboBoxUI.FocusHandler extends Object with FocusListener {

    @stub
    // Invoked when a component gains the keyboard focus.
    def focusGained(e: FocusEvent): Unit = ???
}
