package javax.swing.tree

import java.lang.{Exception, Object, String, Throwable}
import javax.swing.event.TreeExpansionEvent
import scala.scalanative.annotation.stub

/** Exception used to stop and expand/collapse from happening.
 *  See How to Write a Tree-Will-Expand Listener
 *  in The Java Tutorial
 *  for further information and examples.
 */
class ExpandVetoException extends Exception {

    /** Constructs an ExpandVetoException object with no message. */
    @stub
    def this(event: TreeExpansionEvent) = ???

    /** Constructs an ExpandVetoException object with the specified message. */
    @stub
    def this(event: TreeExpansionEvent, message: String) = ???

    /** The event that the exception was created for. */
    @stub
    protected val event: TreeExpansionEvent = ???
}
