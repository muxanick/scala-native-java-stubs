package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving keyboard events (keystrokes).
 *  The class that is interested in processing a keyboard event
 *  either implements this interface (and all the methods it
 *  contains) or extends the abstract KeyAdapter class
 *  (overriding only the methods of interest).
 *  
 *  The listener object created from that class is then registered with a
 *  component using the component's addKeyListener
 *  method. A keyboard event is generated when a key is pressed, released,
 *  or typed. The relevant method in the listener
 *  object is then invoked, and the KeyEvent is passed to it.
 */
trait KeyListener extends EventListener {

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
