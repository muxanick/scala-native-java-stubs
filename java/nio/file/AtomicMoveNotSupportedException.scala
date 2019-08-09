package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception thrown when a file cannot be moved as an atomic file system
 *  operation.
 */
class AtomicMoveNotSupportedException extends FileSystemException {

    /** Constructs an instance of this class. */
    @stub
    def this(source: String, target: String, reason: String) = ???
}
