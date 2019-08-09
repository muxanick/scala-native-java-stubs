package java.nio

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to reset a buffer
 *  when its mark is not defined.
 */
class InvalidMarkException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
