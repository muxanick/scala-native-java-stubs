package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** Checked exception thrown when an attempt is made to create a file or
 *  directory and a file of that name already exists.
 */
class FileAlreadyExistsException extends FileSystemException {

    /** Constructs an instance of this class. */
    @stub
    def this(file: String) = ???
}
