package java.nio.charset

import java.lang.{Error, Exception, Object, Throwable}
import scala.scalanative.annotation.stub

/** Error thrown when the decodeLoop method of
 *  a CharsetDecoder, or the encodeLoop method of a CharsetEncoder, throws an unexpected
 *  exception.
 */
class CoderMalfunctionError extends Error {

    /** Initializes an instance of this class. */
    @stub
    def this(cause: Exception) = ???
}
