package javax.tools

import java.lang.Boolean
import java.util.concurrent.Callable

/** Interface representing a future for a documentation task.  The
 *  task has not yet started.  To start the task, call
 *  the call method.
 * 
 *  Before calling the call method, additional aspects of the
 *  task can be configured, for example, by calling the
 *  setLocale method.
 */
object trait DocumentationTool.DocumentationTask extends Callable[Boolean] {

    /** Performs this documentation task. */
    @stub
    def call(): Boolean = ???
}
