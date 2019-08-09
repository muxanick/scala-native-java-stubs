package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Checked exception thrown when a file system operation fails because a
// directory is not empty.
class DirectoryNotEmptyException extends FileSystemException {
}
