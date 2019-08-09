package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener, MouseEvent, MouseListener, MouseMotionListener}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{AbstractButton, JComponent}
import javax.swing.event.{ChangeEvent, ChangeListener}

// Button Listener
class BasicButtonListener extends Object with MouseListener, with MouseMotionListener, with FocusListener, with ChangeListener, with PropertyChangeListener {

    @stub
    // 
    protected def checkOpacity(b: AbstractButton): Unit = ???

    @stub
    // Invoked when a component gains the keyboard focus.
    def focusGained(e: FocusEvent): Unit = ???

    @stub
    // Invoked when a component loses the keyboard focus.
    def focusLost(e: FocusEvent): Unit = ???

    @stub
    // Register default key actions: pressing space to "click" a
    // button and registring the keyboard mnemonic (if any).
    def installKeyboardActions(c: JComponent): Unit = ???

    @stub
    // Invoked when the mouse button has been clicked (pressed
    // and released) on a component.
    def mouseClicked(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button is pressed on a component and then
    // dragged.
    def mouseDragged(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse enters a component.
    def mouseEntered(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse exits a component.
    def mouseExited(e: MouseEvent): Unit = ???

    @stub
    // Invoked when the mouse cursor has been moved onto a component
    // but no buttons have been pushed.
    def mouseMoved(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button has been pressed on a component.
    def mousePressed(e: MouseEvent): Unit = ???

    @stub
    // Invoked when a mouse button has been released on a component.
    def mouseReleased(e: MouseEvent): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // Invoked when the target of the listener has changed its state.
    def stateChanged(e: ChangeEvent): Unit = ???
}
