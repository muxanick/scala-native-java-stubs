package javax.security.sasl

import java.lang.String
import java.util.Map
import javax.security.auth.callback.CallbackHandler

/** An interface for creating instances of SaslServer.
 *  A class that implements this interface
 *  must be thread-safe and handle multiple simultaneous
 *  requests. It must also have a public constructor that accepts no
 *  argument.
 * 
 *  This interface is not normally accessed directly by a server, which will use the
 *  Sasl static methods
 *  instead. However, a particular environment may provide and install a
 *  new or different SaslServerFactory.
 */
trait SaslServerFactory {

    /** Creates a SaslServer using the parameters supplied. */
    @stub
    def createSaslServer(mechanism: String, protocol: String, serverName: String, props: Map[String, _], cbh: CallbackHandler): SaslServer = ???
}
