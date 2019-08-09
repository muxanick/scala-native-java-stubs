package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Indicates that the peer's identity has not been verified.
 *  
 *  When the peer was not able to
 *  identify itself (for example; no certificate, the particular
 *  cipher suite being used does not support authentication, or no
 *  peer authentication was established during SSL handshaking) this
 *  exception is thrown.
 */
class SSLPeerUnverifiedException extends SSLException {

    /** Constructs an exception reporting that the SSL peer's
     *  identity has not been verified.
     */
    @stub
    def this(reason: String) = ???
}
