package java.nio.channels

import java.io.IOException
import java.lang.{Exception, Object, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception received by a thread when another thread closes the
 *  channel or the part of the channel upon which it is blocked in an I/O
 *  operation.
 */
class AsynchronousCloseException extends ClosedChannelException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
