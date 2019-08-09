package javax.security.sasl

import java.lang.{Object, String}
import java.util.{Enumeration, Map}
import javax.security.auth.callback.CallbackHandler

/** A static class for creating SASL clients and servers.
 * 
 *  This class defines the policy of how to locate, load, and instantiate
 *  SASL clients and servers.
 * 
 *  For example, an application or library gets a SASL client by doing
 *  something like:
 * 
 *  SaslClient sc = Sasl.createSaslClient(mechanisms,
 *      authorizationId, protocol, serverName, props, callbackHandler);
 * 
 *  It can then proceed to use the instance to create an authentication connection.
 * 
 *  Similarly, a server gets a SASL server by using code that looks as follows:
 * 
 *  SaslServer ss = Sasl.createSaslServer(mechanism,
 *      protocol, serverName, props, callbackHandler);
 * 
 */
class Sasl extends Object {
}

object Sasl {
    /** The name of a property that specifies the bound server name for
     *  an unbound server.
     */
    @stub
    val BOUND_SERVER_NAME: String = ???

    /** The name of a property that specifies the credentials to use. */
    @stub
    val CREDENTIALS: String = ???

    /** The name of a property that specifies the maximum size of the receive
     *  buffer in bytes of SaslClient/SaslServer.
     */
    @stub
    val MAX_BUFFER: String = ???

    /** The name of a property that specifies whether mechanisms that implement
     *  forward secrecy between sessions are required.
     */
    @stub
    val POLICY_FORWARD_SECRECY: String = ???

    /** The name of a property that specifies whether
     *  mechanisms susceptible to active (non-dictionary) attacks
     *  are not permitted.
     */
    @stub
    val POLICY_NOACTIVE: String = ???

    /** The name of a property that specifies whether mechanisms that accept
     *  anonymous login are not permitted.
     */
    @stub
    val POLICY_NOANONYMOUS: String = ???

    /** The name of a property that specifies whether
     *  mechanisms susceptible to passive dictionary attacks are not permitted.
     */
    @stub
    val POLICY_NODICTIONARY: String = ???

    /** The name of a property that specifies
     *  whether mechanisms susceptible to simple plain passive attacks (e.g.,
     *  "PLAIN") are not permitted.
     */
    @stub
    val POLICY_NOPLAINTEXT: String = ???

    /** The name of a property that specifies whether
     *  mechanisms that pass client credentials are required.
     */
    @stub
    val POLICY_PASS_CREDENTIALS: String = ???

    /** The name of a property that specifies the quality-of-protection to use. */
    @stub
    val QOP: String = ???

    /** The name of a property that specifies the maximum size of the raw send
     *  buffer in bytes of SaslClient/SaslServer.
     */
    @stub
    val RAW_SEND_SIZE: String = ???

    /** The name of a property that specifies whether to reuse previously
     *  authenticated session information.
     */
    @stub
    val REUSE: String = ???

    /** The name of a property that specifies whether the
     *  server must authenticate to the client.
     */
    @stub
    val SERVER_AUTH: String = ???

    /** Creates a SaslClient using the parameters supplied. */
    @stub
    def createSaslClient(mechanisms: Array[String], authorizationId: String, protocol: String, serverName: String, props: Map[String, _], cbh: CallbackHandler): SaslClient = ???

    /** Creates a SaslServer for the specified mechanism. */
    @stub
    def createSaslServer(mechanism: String, protocol: String, serverName: String, props: Map[String, _], cbh: CallbackHandler): SaslServer = ???

    /** Gets an enumeration of known factories for producing SaslClient. */
    @stub
    def getSaslClientFactories(): Enumeration[SaslClientFactory] = ???
}
