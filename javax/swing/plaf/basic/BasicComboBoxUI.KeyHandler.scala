package javax.swing.plaf.basic

import java.awt.event.{KeyAdapter, KeyEvent}
import java.lang.Object
import scala.scalanative.annotation.stub

/** This listener checks to see if the key event isn't a navigation key.  If
 *  it finds a key event that wasn't a navigation key it dispatches it to
 *  JComboBox.selectWithKeyChar() so that it can do type-ahead.
 * 
 *  This public inner class should be treated as protected.
 *  Instantiate it only within subclasses of
 *  BasicComboBoxUI.
 */
class BasicComboBoxUI_KeyHandler extends KeyAdapter {

    /**  */
    @stub
    def KeyHandler() = ???

    /** Invoked when a key has been pressed. */
    @stub
    def keyPressed(e: KeyEvent): Unit = ???
}
