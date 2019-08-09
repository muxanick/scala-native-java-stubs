package java.nio.channels

import java.io.IOException
import java.lang.{Exception, Object, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception received by a thread when another thread interrupts it
 *  while it is blocked in an I/O operation upon a channel.  Before this
 *  exception is thrown the channel will have been closed and the interrupt
 *  status of the previously-blocked thread will have been set.
 */
class ClosedByInterruptException extends AsynchronousCloseException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
