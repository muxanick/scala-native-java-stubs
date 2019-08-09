package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Indicates that the client and server could not negotiate the
 *  desired level of security.  The connection is no longer usable.
 */
class SSLHandshakeException extends SSLException {
}
