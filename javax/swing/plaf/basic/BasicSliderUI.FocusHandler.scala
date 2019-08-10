package javax.swing.plaf.basic

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Focus-change listener.
 *  
 *  This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of Foo.
 */
class BasicSliderUI_FocusHandler extends Object with FocusListener {

    /**  */
    @stub
    def FocusHandler() = ???

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Invoked when a component loses the keyboard focus. */
    @stub
    def focusLost(e: FocusEvent): Unit = ???
}
