package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent}
import java.lang.Object

// A listener to be registered upon the combo box
// (not its popup menu)
// to handle mouse events
// that affect the state of the popup menu.
// The main purpose of this listener is to make the popup menu
// appear and disappear.
// This listener also helps
// with click-and-drag scenarios by setting the selection if the mouse was
// released over the list during a drag.
//
// 
// Warning:
// We recommend that you not
// create subclasses of this class.
// If you absolutely must create a subclass,
// be sure to invoke the superclass
// version of each method.
protected class BasicComboPopup.InvocationMouseHandler extends MouseAdapter {

    @stub
    // Responds to mouse-pressed events on the combo box.
    def mousePressed(e: MouseEvent): Unit = ???
}
