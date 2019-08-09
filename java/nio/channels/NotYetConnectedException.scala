package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to invoke an I/O
 *  operation upon a socket channel that is not yet connected.
 */
class NotYetConnectedException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
