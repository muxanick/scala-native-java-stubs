package javax.swing.plaf.basic

import java.awt.event.{KeyAdapter, KeyEvent}
import java.lang.Object
import javax.swing.Action
import scala.scalanative.annotation.stub

/** This is used to get multiple key down events to appropriately generate
 *  events.
 */
class BasicTreeUI_KeyHandler extends KeyAdapter {

    /**  */
    @stub
    def KeyHandler() = ???

    /** Set to true while keyPressed is active. */
    @stub
    protected val isKeyDown: Boolean = ???

    /** Key code that is being generated for. */
    @stub
    protected val repeatKeyAction: Action = ???

    /** Invoked when a key has been pressed. */
    @stub
    def keyPressed(e: KeyEvent): Unit = ???

    /** Invoked when a key has been released. */
    @stub
    def keyReleased(e: KeyEvent): Unit = ???

    /** Invoked when a key has been typed. */
    @stub
    def keyTyped(e: KeyEvent): Unit = ???
}
