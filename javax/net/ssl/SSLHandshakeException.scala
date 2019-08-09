package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Indicates that the client and server could not negotiate the
 *  desired level of security.  The connection is no longer usable.
 */
class SSLHandshakeException extends SSLException {

    /** Constructs an exception reporting an error found by
     *  an SSL subsystem during handshaking.
     */
    @stub
    def this(reason: String) = ???
}
