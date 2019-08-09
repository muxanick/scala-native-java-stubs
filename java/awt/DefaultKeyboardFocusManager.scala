package java.awt

import java.awt.event.KeyEvent
import java.lang.Object

/** The default KeyboardFocusManager for AWT applications. Focus traversal is
 *  done in response to a Component's focus traversal keys, and using a
 *  Container's FocusTraversalPolicy.
 *  
 *  Please see
 *  
 *  How to Use the Focus Subsystem,
 *  a section in The Java Tutorial, and the
 *  Focus Specification
 *  for more information.
 */
class DefaultKeyboardFocusManager extends KeyboardFocusManager {

    /** Releases for normal dispatching to the current focus owner all
     *  KeyEvents which were enqueued because of a call to
     *  enqueueKeyEvents with the same timestamp and Component.
     */
    @stub
    protected def dequeueKeyEvents(after: Long, untilFocused: Component): Unit = ???

    /** Discards all KeyEvents which were enqueued because of one or more calls
     *  to enqueueKeyEvents with the specified Component, or one of
     *  its descendants.
     */
    @stub
    protected def discardKeyEvents(comp: Component): Unit = ???

    /** This method is called by the AWT event dispatcher requesting that the
     *  current KeyboardFocusManager dispatch the specified event on its behalf.
     */
    @stub
    def dispatchEvent(e: AWTEvent): Boolean = ???

    /** Called by dispatchEvent if no other
     *  KeyEventDispatcher in the dispatcher chain dispatched the KeyEvent, or
     *  if no other KeyEventDispatchers are registered.
     */
    @stub
    def dispatchKeyEvent(e: KeyEvent): Boolean = ???

    /** Moves the focus down one focus traversal cycle. */
    @stub
    def downFocusCycle(aContainer: Container): Unit = ???

    /** Delays dispatching of KeyEvents until the specified Component becomes
     *  the focus owner.
     */
    @stub
    protected def enqueueKeyEvents(after: Long, untilFocused: Component): Unit = ???

    /** Focuses the Component after aComponent, typically based on a
     *  FocusTraversalPolicy.
     */
    @stub
    def focusNextComponent(aComponent: Component): Unit = ???

    /** Focuses the Component before aComponent, typically based on a
     *  FocusTraversalPolicy.
     */
    @stub
    def focusPreviousComponent(aComponent: Component): Unit = ???

    /** This method will be called by dispatchKeyEvent. */
    @stub
    def postProcessKeyEvent(e: KeyEvent): Boolean = ???

    /** This method initiates a focus traversal operation if and only if the
     *  KeyEvent represents a focus traversal key for the specified
     *  focusedComponent.
     */
    @stub
    def processKeyEvent(focusedComponent: Component, e: KeyEvent): Unit = ???
}
