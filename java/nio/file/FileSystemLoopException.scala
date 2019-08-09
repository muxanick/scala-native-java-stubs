package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Checked exception thrown when a file system loop, or cycle, is encountered. */
class FileSystemLoopException extends FileSystemException {
}
