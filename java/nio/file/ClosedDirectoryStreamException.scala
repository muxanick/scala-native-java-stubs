package java.nio.file

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to invoke an operation on
 *  a directory stream that is closed.
 */
class ClosedDirectoryStreamException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
