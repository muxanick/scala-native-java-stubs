package javax.swing.tree

import java.lang.{Exception, Object, Throwable}
import javax.swing.event.TreeExpansionEvent

/** Exception used to stop and expand/collapse from happening.
 *  See How to Write a Tree-Will-Expand Listener
 *  in The Java Tutorial
 *  for further information and examples.
 */
class ExpandVetoException extends Exception {

    /** Constructs an ExpandVetoException object with no message. */
    @stub
    def this(event: TreeExpansionEvent) = ???
}
