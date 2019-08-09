package java.nio.file

import java.lang.{Exception, Object, RuntimeException, Throwable}
import java.util.ConcurrentModificationException

/** Runtime exception thrown if an I/O error is encountered when iterating over
 *  the entries in a directory. The I/O error is retrieved as an IOException using the getCause() method.
 */
final class DirectoryIteratorException extends ConcurrentModificationException {
}
