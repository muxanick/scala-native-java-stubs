package java.nio

import java.lang.{Exception, Object, RuntimeException, Throwable, UnsupportedOperationException}
import scala.scalanative.annotation.stub

/** Unchecked exception thrown when a content-mutation method such as
 *  put or compact is invoked upon a read-only buffer.
 */
class ReadOnlyBufferException extends UnsupportedOperationException {

    /** Constructs an instance of this class. */
    @stub
    def this() = ???
}
