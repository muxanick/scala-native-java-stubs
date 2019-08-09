package java.nio.file

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to invoke an operation on
 *  a file and the file system is closed.
 */
class ClosedFileSystemException extends IllegalStateException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
