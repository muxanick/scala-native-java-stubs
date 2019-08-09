package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to connect a SocketChannel for which a non-blocking connection operation is already in
 *  progress.
 */
class ConnectionPendingException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
