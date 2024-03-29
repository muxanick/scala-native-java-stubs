package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when the finishConnect method of a SocketChannel is invoked without first
 *  successfully invoking its connect method.
 */
class NoConnectionPendingException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
