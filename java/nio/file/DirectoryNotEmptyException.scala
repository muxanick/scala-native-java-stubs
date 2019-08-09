package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Checked exception thrown when a file system operation fails because a
 *  directory is not empty.
 */
class DirectoryNotEmptyException extends FileSystemException {

    /** Constructs an instance of this class. */
    @stub
    def this(dir: String) = ???
}
