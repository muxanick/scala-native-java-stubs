package javax.swing

import java.awt.event.{FocusEvent, FocusListener}
import java.lang.Object
import scala.scalanative.annotation.stub

/** Fire PropertyChange listener, if one is registered,
 *  when focus events happen
 */
protected class JComponent_AccessibleJComponent_AccessibleFocusHandler extends Object with FocusListener {

    /**  */
    @stub
    protected def AccessibleFocusHandler() = ???

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(event: FocusEvent): Unit = ???

    /** Invoked when a component loses the keyboard focus. */
    @stub
    def focusLost(event: FocusEvent): Unit = ???
}
