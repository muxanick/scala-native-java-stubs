package javax.net.ssl

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Reports an error in the operation of the SSL protocol.  Normally
 *  this indicates a flaw in one of the protocol implementations.
 */
class SSLProtocolException extends SSLException {

    /** Constructs an exception reporting an SSL protocol error
     *  detected by an SSL subsystem.
     */
    @stub
    def this(reason: String) = ???
}
