package java.util.concurrent

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception thrown when a thread tries to wait upon a barrier that is
 *  in a broken state, or which enters the broken state while the thread
 *  is waiting.
 */
class BrokenBarrierException extends Exception {

    /** Constructs a BrokenBarrierException with no specified detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a BrokenBarrierException with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???
}
