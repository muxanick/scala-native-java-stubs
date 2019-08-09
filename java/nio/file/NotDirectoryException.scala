package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Checked exception thrown when a file system operation, intended for a
 *  directory, fails because the file is not a directory.
 */
class NotDirectoryException extends FileSystemException {
}
