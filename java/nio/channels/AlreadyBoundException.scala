package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to bind the socket a
 *  network oriented channel that is already bound.
 */
class AlreadyBoundException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
