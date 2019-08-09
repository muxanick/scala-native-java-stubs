package javax.security.sasl

import java.lang.{Object, String}
import java.util.{Enumeration, Map}
import javax.security.auth.callback.CallbackHandler

// A static class for creating SASL clients and servers.
//
// This class defines the policy of how to locate, load, and instantiate
// SASL clients and servers.
//
// For example, an application or library gets a SASL client by doing
// something like:
//
// SaslClient sc = Sasl.createSaslClient(mechanisms,
//     authorizationId, protocol, serverName, props, callbackHandler);
//
// It can then proceed to use the instance to create an authentication connection.
//
// Similarly, a server gets a SASL server by using code that looks as follows:
//
// SaslServer ss = Sasl.createSaslServer(mechanism,
//     protocol, serverName, props, callbackHandler);
//
class Sasl extends Object {
}

object Sasl {
    @stub
    // The name of a property that specifies the bound server name for
    // an unbound server.
    def BOUND_SERVER_NAME: String = ???

    @stub
    // The name of a property that specifies the credentials to use.
    def CREDENTIALS: String = ???

    @stub
    // The name of a property that specifies the maximum size of the receive
    // buffer in bytes of SaslClient/SaslServer.
    def MAX_BUFFER: String = ???

    @stub
    // The name of a property that specifies whether mechanisms that implement
    // forward secrecy between sessions are required.
    def POLICY_FORWARD_SECRECY: String = ???

    @stub
    // The name of a property that specifies whether
    // mechanisms susceptible to active (non-dictionary) attacks
    // are not permitted.
    def POLICY_NOACTIVE: String = ???

    @stub
    // The name of a property that specifies whether mechanisms that accept
    // anonymous login are not permitted.
    def POLICY_NOANONYMOUS: String = ???

    @stub
    // The name of a property that specifies whether
    // mechanisms susceptible to passive dictionary attacks are not permitted.
    def POLICY_NODICTIONARY: String = ???

    @stub
    // The name of a property that specifies
    // whether mechanisms susceptible to simple plain passive attacks (e.g.,
    // "PLAIN") are not permitted.
    def POLICY_NOPLAINTEXT: String = ???

    @stub
    // The name of a property that specifies whether
    // mechanisms that pass client credentials are required.
    def POLICY_PASS_CREDENTIALS: String = ???

    @stub
    // The name of a property that specifies the quality-of-protection to use.
    def QOP: String = ???

    @stub
    // The name of a property that specifies the maximum size of the raw send
    // buffer in bytes of SaslClient/SaslServer.
    def RAW_SEND_SIZE: String = ???

    @stub
    // The name of a property that specifies whether to reuse previously
    // authenticated session information.
    def REUSE: String = ???

    @stub
    // The name of a property that specifies whether the
    // server must authenticate to the client.
    def SERVER_AUTH: String = ???

    @stub
    // Creates a SaslClient using the parameters supplied.
    def createSaslClient(mechanisms: Array[String], authorizationId: String, protocol: String, serverName: String, props: Map[String, _], cbh: CallbackHandler): SaslClient = ???

    @stub
    // Creates a SaslServer for the specified mechanism.
    def createSaslServer(mechanism: String, protocol: String, serverName: String, props: Map[String, _], cbh: CallbackHandler): SaslServer = ???

    @stub
    // Gets an enumeration of known factories for producing SaslClient.
    def getSaslClientFactories(): Enumeration[SaslClientFactory] = ???
}
