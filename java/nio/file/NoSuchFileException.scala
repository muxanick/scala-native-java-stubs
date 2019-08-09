package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** Checked exception thrown when an attempt is made to access a file that does
 *  not exist.
 */
class NoSuchFileException extends FileSystemException {

    /** Constructs an instance of this class. */
    @stub
    def this(file: String) = ???
}
