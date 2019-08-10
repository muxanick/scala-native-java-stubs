package java.util.concurrent

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** A task that returns a result and may throw an exception.
 *  Implementors define a single method with no arguments called
 *  call.
 * 
 *  The Callable interface is similar to Runnable, in that both are designed for classes whose
 *  instances are potentially executed by another thread.  A
 *  Runnable, however, does not return a result and cannot
 *  throw a checked exception.
 * 
 *  The Executors class contains utility methods to
 *  convert from other common forms to Callable classes.
 */
@FunctionalInterface
trait Callable[V] {

    /** Computes a result, or throws an exception if unable to do so. */
    @stub
    def call(): V = ???
}
