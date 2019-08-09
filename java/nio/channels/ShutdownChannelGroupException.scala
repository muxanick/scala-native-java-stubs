package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to construct a channel in 
 *  a group that is shutdown or the completion handler for an I/O operation 
 *  cannot be invoked because the channel group has terminated.
 */
class ShutdownChannelGroupException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
