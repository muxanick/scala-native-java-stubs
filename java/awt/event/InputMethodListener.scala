package java.awt.event

import java.util.EventListener
import scala.scalanative.annotation.stub

/** The listener interface for receiving input method events. A text editing
 *  component has to install an input method event listener in order to work
 *  with input methods.
 * 
 *  
 *  The text editing component also has to provide an instance of InputMethodRequests.
 */
trait InputMethodListener extends EventListener {

    /** Invoked when the caret within composed text has changed. */
    @stub
    def caretPositionChanged(event: InputMethodEvent): Unit = ???

    /** Invoked when the text entered through an input method has changed. */
    @stub
    def inputMethodTextChanged(event: InputMethodEvent): Unit = ???
}
