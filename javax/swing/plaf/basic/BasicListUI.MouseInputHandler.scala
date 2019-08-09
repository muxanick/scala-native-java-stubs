package javax.swing.plaf.basic

import java.awt.event.MouseEvent
import java.lang.Object
import javax.swing.event.MouseInputListener

// Mouse input, and focus handling for JList.  An instance of this
// class is added to the appropriate java.awt.Component lists
// at installUI() time.  Note keyboard input is handled with JComponent
// KeyboardActions, see installKeyboardActions().
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BasicListUI.MouseInputHandler extends Object with MouseInputListener {

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
}
