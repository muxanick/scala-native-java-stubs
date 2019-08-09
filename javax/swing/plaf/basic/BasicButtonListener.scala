package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener, MouseEvent, MouseListener, MouseMotionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{AbstractButton, JComponent}
import javax.swing.event.{ChangeEvent, ChangeListener}

/** Button Listener */
class BasicButtonListener extends Object with MouseListener with MouseMotionListener with FocusListener with ChangeListener with PropertyChangeListener {

    /**  */
    @stub
    protected def checkOpacity(b: AbstractButton): Unit = ???

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Invoked when a component loses the keyboard focus. */
    @stub
    def focusLost(e: FocusEvent): Unit = ???

    /** Register default key actions: pressing space to "click" a
     *  button and registring the keyboard mnemonic (if any).
     */
    @stub
    def installKeyboardActions(c: JComponent): Unit = ???

    /** Invoked when the mouse button has been clicked (pressed
     *  and released) on a component.
     */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button is pressed on a component and then
     *  dragged.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse enters a component. */
    @stub
    def mouseEntered(e: MouseEvent): Unit = ???

    /** Invoked when the mouse exits a component. */
    @stub
    def mouseExited(e: MouseEvent): Unit = ???

    /** Invoked when the mouse cursor has been moved onto a component
     *  but no buttons have been pushed.
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been pressed on a component. */
    @stub
    def mousePressed(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button has been released on a component. */
    @stub
    def mouseReleased(e: MouseEvent): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Invoked when the target of the listener has changed its state. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
