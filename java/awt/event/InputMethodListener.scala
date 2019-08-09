package java.awt.event

import java.util.EventListener

// The listener interface for receiving input method events. A text editing
// component has to install an input method event listener in order to work
// with input methods.
//
// 
// The text editing component also has to provide an instance of InputMethodRequests.
trait InputMethodListener extends EventListener {

    @stub
    // Invoked when the caret within composed text has changed.
    def caretPositionChanged(event: InputMethodEvent): Unit = ???
}
