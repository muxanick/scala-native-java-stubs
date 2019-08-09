package java.nio.file

import java.lang.{Exception, IllegalArgumentException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when an attempt is made to invoke a method on an
 *  object created by one file system provider with a parameter created by a
 *  different file system provider.
 */
class ProviderMismatchException extends IllegalArgumentException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???

    /** Constructs an instance of this class. */
    @stub
    def this(msg: String) = ???
}
