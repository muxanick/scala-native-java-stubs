package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to write
 *  to a channel that was not originally opened for writing.
 */
class NonWritableChannelException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
