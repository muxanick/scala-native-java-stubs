package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

// Checked exception thrown when a file cannot be moved as an atomic file system
// operation.
class AtomicMoveNotSupportedException extends FileSystemException {
}
