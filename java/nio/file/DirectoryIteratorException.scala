package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, RuntimeException, Throwable}
import java.util.ConcurrentModificationException
import scala.scalanative.annotation.stub

/** Runtime exception thrown if an I/O error is encountered when iterating over
 *  the entries in a directory. The I/O error is retrieved as an IOException using the getCause() method.
 */
final class DirectoryIteratorException extends ConcurrentModificationException {

    /** Constructs an instance of this class. */
    @stub
    def this(cause: IOException) = ???

    /** Returns the cause of this exception. */
    @stub
    def getCause(): IOException = ???
}
