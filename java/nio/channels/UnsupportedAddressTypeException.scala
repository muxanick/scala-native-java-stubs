package java.nio.channels

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to bind or connect
 *  to a socket address of a type that is not supported.
 */
class UnsupportedAddressTypeException extends IllegalArgumentException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
