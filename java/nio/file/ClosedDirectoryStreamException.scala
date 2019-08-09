package java.nio.file

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, Throwable}

/** Unchecked exception thrown when an attempt is made to invoke an operation on
 *  a directory stream that is closed.
 */
class ClosedDirectoryStreamException extends IllegalStateException {
}
