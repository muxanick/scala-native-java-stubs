package java.awt.event

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract adapter class for receiving keyboard events.
 *  The methods in this class are empty. This class exists as
 *  convenience for creating listener objects.
 *  
 *  Extend this class to create a KeyEvent listener
 *  and override the methods for the events of interest. (If you implement the
 *  KeyListener interface, you have to define all of
 *  the methods in it. This abstract class defines null methods for them
 *  all, so you can only have to define methods for events you care about.)
 *  
 *  Create a listener object using the extended class and then register it with
 *  a component using the component's addKeyListener
 *  method. When a key is pressed, released, or typed,
 *  the relevant method in the listener object is invoked,
 *  and the KeyEvent is passed to it.
 */
abstract class KeyAdapter extends Object with KeyListener {

    /**  */
    @stub
    def this() = ???

    /** Invoked when a key has been pressed. */
    def keyPressed(e: KeyEvent): Unit

    /** Invoked when a key has been released. */
    def keyReleased(e: KeyEvent): Unit

    /** Invoked when a key has been typed. */
    def keyTyped(e: KeyEvent): Unit
}
