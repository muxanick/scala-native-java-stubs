package javax.management.openmbean

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** This runtime exception is thrown to indicate that the index of a row to be added to a tabular data instance
 *  is already used to refer to another row in this tabular data instance.
 */
class KeyAlreadyExistsException extends IllegalArgumentException {

    /** A KeyAlreadyExistsException with no detail message. */
    @stub
    def this() = ???

    /** A KeyAlreadyExistsException with a detail message. */
    @stub
    def this(msg: String) = ???
}
