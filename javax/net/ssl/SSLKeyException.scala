package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Reports a bad SSL key.  Normally, this indicates misconfiguration
 *  of the server or client SSL certificate and private key.
 */
class SSLKeyException extends SSLException {

    /** Constructs an exception reporting a key management error
     *  found by an SSL subsystem.
     */
    @stub
    def this(reason: String) = ???
}
