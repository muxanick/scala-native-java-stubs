package java.awt.event

import java.util.EventListener

// The listener interface for receiving keyboard focus events on
// a component.
// The class that is interested in processing a focus event
// either implements this interface (and all the methods it
// contains) or extends the abstract FocusAdapter class
// (overriding only the methods of interest).
// The listener object created from that class is then registered with a
// component using the component's addFocusListener
// method. When the component gains or loses the keyboard focus,
// the relevant method in the listener object
// is invoked, and the FocusEvent is passed to it.
trait FocusListener extends EventListener {

    @stub
    // Invoked when a component gains the keyboard focus.
    def focusGained(e: FocusEvent): Unit = ???
}
