package java.nio.channels

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to invoke an I/O
 *  operation upon a closed selector.
 */
class ClosedSelectorException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
