package javax.swing.plaf.basic

import java.awt.event.{KeyAdapter, KeyEvent}
import java.lang.Object

/** This is used to get multiple key down events to appropriately generate
 *  events.
 */
class BasicTreeUI.KeyHandler extends KeyAdapter {

    /** Set to true while keyPressed is active. */
    @stub
    protected val isKeyDown: Boolean = ???

    /** Invoked when a key has been pressed. */
    @stub
    def keyPressed(e: KeyEvent): Unit = ???

    /** Invoked when a key has been released. */
    @stub
    def keyReleased(e: KeyEvent): Unit = ???
}
