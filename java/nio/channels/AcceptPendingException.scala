package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to initiate an accept
 *  operation on a channel and a previous accept operation has not completed.
 */
class AcceptPendingException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
