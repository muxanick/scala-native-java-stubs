package javax.tools

import java.lang.{Boolean, Iterable}
import java.util.Locale
import java.util.concurrent.Callable
import javax.annotation.processing.Processor
import scala.scalanative.annotation.stub

/** Interface representing a future for a compilation task.  The
 *  compilation task has not yet started.  To start the task, call
 *  the call method.
 * 
 *  Before calling the call method, additional aspects of the
 *  task can be configured, for example, by calling the
 *  setProcessors method.
 */
trait JavaCompiler_CompilationTask extends Callable[Boolean] {

    /** Performs this compilation task. */
    @stub
    def call(): Boolean = ???

    /** Set the locale to be applied when formatting diagnostics and
     *  other localized data.
     */
    @stub
    def setLocale(locale: Locale): Unit = ???

    /** Sets processors (for annotation processing). */
    @stub
    def setProcessors(processors: Iterable[_ <: Processor]): Unit = ???
}
