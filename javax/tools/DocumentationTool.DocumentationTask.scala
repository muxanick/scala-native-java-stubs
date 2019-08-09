package javax.tools

import java.lang.Boolean
import java.util.Locale
import java.util.concurrent.Callable
import scala.scalanative.annotation.stub

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

    /** Set the locale to be applied when formatting diagnostics and
     *  other localized data.
     */
    @stub
    def setLocale(locale: Locale): Unit = ???
}
