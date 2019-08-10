package javax.swing.plaf.basic

import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Scroll-event listener.
 * 
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of Foo.
 */
class BasicSliderUI_ScrollListener extends Object with ActionListener {

    /**  */
    @stub
    def ScrollListener() = ???

    /**  */
    @stub
    def ScrollListener(dir: Int, block: Boolean) = ???

    /** Invoked when an action occurs. */
    @stub
    def actionPerformed(e: ActionEvent): Unit = ???

    /**  */
    @stub
    def setDirection(direction: Int): Unit = ???

    /**  */
    @stub
    def setScrollByBlock(block: Boolean): Unit = ???
}
