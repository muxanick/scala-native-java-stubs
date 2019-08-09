package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Reports a bad SSL key.  Normally, this indicates misconfiguration
 *  of the server or client SSL certificate and private key.
 */
class SSLKeyException extends SSLException {
}
