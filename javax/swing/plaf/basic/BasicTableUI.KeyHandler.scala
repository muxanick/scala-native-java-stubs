package javax.swing.plaf.basic

import java.awt.event.{KeyEvent, KeyListener}
import java.lang.Object

// This class should be treated as a "protected" inner class.
// Instantiate it only within subclasses of BasicTableUI.
// As of Java 2 platform v1.3 this class is no longer used.
// Instead JTable
// overrides processKeyBinding to dispatch the event to
// the current TableCellEditor.
class BasicTableUI.KeyHandler extends Object with KeyListener {

    @stub
    // Invoked when a key has been pressed.
    def keyPressed(e: KeyEvent): Unit = ???

    @stub
    // Invoked when a key has been released.
    def keyReleased(e: KeyEvent): Unit = ???
}
