package javax.security.sasl

import java.lang.String
import java.util.Map
import javax.security.auth.callback.CallbackHandler

// An interface for creating instances of SaslClient.
// A class that implements this interface
// must be thread-safe and handle multiple simultaneous
// requests. It must also have a public constructor that accepts no
// argument.
//
// This interface is not normally accessed directly by a client, which will use the
// Sasl static methods
// instead. However, a particular environment may provide and install a
// new or different SaslClientFactory.
trait SaslClientFactory {

    @stub
    // Creates a SaslClient using the parameters supplied.
    def createSaslClient(mechanisms: Array[String], authorizationId: String, protocol: String, serverName: String, props: Map[String, _], cbh: CallbackHandler): SaslClient = ???
}
