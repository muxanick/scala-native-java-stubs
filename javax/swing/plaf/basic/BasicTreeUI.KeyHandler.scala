package javax.swing.plaf.basic

import java.awt.event.{KeyAdapter, KeyEvent}
import java.lang.Object

// This is used to get multiple key down events to appropriately generate
// events.
class BasicTreeUI.KeyHandler extends KeyAdapter {

    @stub
    // Set to true while keyPressed is active.
    protected def isKeyDown: Boolean = ???

    @stub
    // Invoked when a key has been pressed.
    def keyPressed(e: KeyEvent): Unit = ???

    @stub
    // Invoked when a key has been released.
    def keyReleased(e: KeyEvent): Unit = ???
}
