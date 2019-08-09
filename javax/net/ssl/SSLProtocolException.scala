package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, Throwable}

/** Reports an error in the operation of the SSL protocol.  Normally
 *  this indicates a flaw in one of the protocol implementations.
 */
class SSLProtocolException extends SSLException {
}
