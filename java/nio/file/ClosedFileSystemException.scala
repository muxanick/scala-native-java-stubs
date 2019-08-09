package java.nio.file

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

// Unchecked exception thrown when an attempt is made to invoke an operation on
// a file and the file system is closed.
class ClosedFileSystemException extends IllegalStateException {
}
