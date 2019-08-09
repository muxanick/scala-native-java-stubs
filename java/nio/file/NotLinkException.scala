package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// Checked exception thrown when a file system operation fails because a file
// is not a symbolic link.
class NotLinkException extends FileSystemException {

    @stub
    // Constructs an instance of this class.
    def this(file: String) = ???
}
