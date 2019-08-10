package javax.swing.plaf.basic

import java.awt.event.{KeyEvent, KeyListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of BasicTableUI.
 *  As of Java 2 platform v1.3 this class is no longer used.
 *  Instead JTable
 *  overrides processKeyBinding to dispatch the event to
 *  the current TableCellEditor.
 */
class BasicTableUI_KeyHandler extends Object with KeyListener {

    /**  */
    @stub
    def KeyHandler() = ???

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
