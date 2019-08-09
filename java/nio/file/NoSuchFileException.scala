package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// Checked exception thrown when an attempt is made to access a file that does
// not exist.
class NoSuchFileException extends FileSystemException {

    @stub
    // Constructs an instance of this class.
    def this(file: String) = ???
}
