package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object

// Focus-change listener.
// 
// This class should be treated as a "protected" inner class.
// Instantiate it only within subclasses of Foo.
class BasicSliderUI.FocusHandler extends Object with FocusListener {

    @stub
    // Invoked when a component gains the keyboard focus.
    def focusGained(e: FocusEvent): Unit = ???
}
