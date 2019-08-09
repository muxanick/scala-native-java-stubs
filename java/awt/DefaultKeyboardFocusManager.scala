package java.awt

import java.awt.event.KeyEvent
import java.lang.Object

// The default KeyboardFocusManager for AWT applications. Focus traversal is
// done in response to a Component's focus traversal keys, and using a
// Container's FocusTraversalPolicy.
// 
// Please see
// 
// How to Use the Focus Subsystem,
// a section in The Java Tutorial, and the
// Focus Specification
// for more information.
class DefaultKeyboardFocusManager extends KeyboardFocusManager {

    @stub
    // Releases for normal dispatching to the current focus owner all
    // KeyEvents which were enqueued because of a call to
    // enqueueKeyEvents with the same timestamp and Component.
    protected def dequeueKeyEvents(after: Long, untilFocused: Component): Unit = ???

    @stub
    // Discards all KeyEvents which were enqueued because of one or more calls
    // to enqueueKeyEvents with the specified Component, or one of
    // its descendants.
    protected def discardKeyEvents(comp: Component): Unit = ???

    @stub
    // This method is called by the AWT event dispatcher requesting that the
    // current KeyboardFocusManager dispatch the specified event on its behalf.
    def dispatchEvent(e: AWTEvent): Boolean = ???

    @stub
    // Called by dispatchEvent if no other
    // KeyEventDispatcher in the dispatcher chain dispatched the KeyEvent, or
    // if no other KeyEventDispatchers are registered.
    def dispatchKeyEvent(e: KeyEvent): Boolean = ???

    @stub
    // Moves the focus down one focus traversal cycle.
    def downFocusCycle(aContainer: Container): Unit = ???

    @stub
    // Delays dispatching of KeyEvents until the specified Component becomes
    // the focus owner.
    protected def enqueueKeyEvents(after: Long, untilFocused: Component): Unit = ???

    @stub
    // Focuses the Component after aComponent, typically based on a
    // FocusTraversalPolicy.
    def focusNextComponent(aComponent: Component): Unit = ???

    @stub
    // Focuses the Component before aComponent, typically based on a
    // FocusTraversalPolicy.
    def focusPreviousComponent(aComponent: Component): Unit = ???

    @stub
    // This method will be called by dispatchKeyEvent.
    def postProcessKeyEvent(e: KeyEvent): Boolean = ???

    @stub
    // This method initiates a focus traversal operation if and only if the
    // KeyEvent represents a focus traversal key for the specified
    // focusedComponent.
    def processKeyEvent(focusedComponent: Component, e: KeyEvent): Unit = ???
}
