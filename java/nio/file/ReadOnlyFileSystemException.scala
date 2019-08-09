package java.nio.file

import java.lang.{Exception, Object, RuntimeException, Throwable, UnsupportedOperationException}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to update an object
 *  associated with a read-only FileSystem.
 */
class ReadOnlyFileSystemException extends UnsupportedOperationException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
