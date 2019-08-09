package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown to indicate that there is an error in the underlying
 *  protocol, such as a TCP error.
 */
class ProtocolException extends IOException {

    /** Constructs a new ProtocolException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a new ProtocolException with the
     *  specified detail message.
     */
    @stub
    def this(host: String) = ???
}
