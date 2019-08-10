package javax.security.sasl

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Performs SASL authentication as a client.
 * 
 *  A protocol library such as one for LDAP gets an instance of this
 *  class in order to perform authentication defined by a specific SASL
 *  mechanism. Invoking methods on the SaslClient instance
 *  process challenges and create responses according to the SASL
 *  mechanism implemented by the SaslClient.
 *  As the authentication proceeds, the instance
 *  encapsulates the state of a SASL client's authentication exchange.
 * 
 *  Here's an example of how an LDAP library might use a SaslClient.
 *  It first gets an instance of a SaslClient:
 * 
 *  SaslClient sc = Sasl.createSaslClient(mechanisms,
 *      authorizationId, protocol, serverName, props, callbackHandler);
 * 
 *  It can then proceed to use the client for authentication.
 *  For example, an LDAP library might use the client as follows:
 * 
 *  // Get initial response and send to server
 *  byte[] response = (sc.hasInitialResponse() ? sc.evaluateChallenge(new byte[0]) :
 *      null);
 *  LdapResult res = ldap.sendBindRequest(dn, sc.getName(), response);
 *  while (!sc.isComplete() &&
 *      (res.status == SASL_BIND_IN_PROGRESS || res.status == SUCCESS)) {
 *      response = sc.evaluateChallenge(res.getBytes());
 *      if (res.status == SUCCESS) {
 *          // we're done; don't expect to send another BIND
 *          if (response != null) {
 *              throw new SaslException(
 *                  "Protocol error: attempting to send response after completion");
 *          }
 *          break;
 *      }
 *      res = ldap.sendBindRequest(dn, sc.getName(), response);
 *  }
 *  if (sc.isComplete() && res.status == SUCCESS) {
 *     String qop = (String) sc.getNegotiatedProperty(Sasl.QOP);
 *     if (qop != null
 *         && (qop.equalsIgnoreCase("auth-int")
 *             || qop.equalsIgnoreCase("auth-conf"))) {
 * 
 *       // Use SaslClient.wrap() and SaslClient.unwrap() for future
 *       // communication with server
 *       ldap.in = new SecureInputStream(sc, ldap.in);
 *       ldap.out = new SecureOutputStream(sc, ldap.out);
 *     }
 *  }
 * 
 * 
 *  If the mechanism has an initial response, the library invokes
 *  evaluateChallenge() with an empty
 *  challenge and to get initial response.
 *  Protocols such as IMAP4, which do not include an initial response with
 *  their first authentication command to the server, initiates the
 *  authentication without first calling hasInitialResponse()
 *  or evaluateChallenge().
 *  When the server responds to the command, it sends an initial challenge.
 *  For a SASL mechanism in which the client sends data first, the server should
 *  have issued a challenge with no data. This will then result in a call
 *  (on the client) to evaluateChallenge() with an empty challenge.
 */
trait SaslClient {

    /** Disposes of any system resources or security-sensitive information
     *  the SaslClient might be using.
     */
    @stub
    def dispose(): Unit = ???

    /** Evaluates the challenge data and generates a response. */
    @stub
    def evaluateChallenge(challenge: Array[Byte]): Array[Byte] = ???

    /** Returns the IANA-registered mechanism name of this SASL client. */
    @stub
    def getMechanismName(): String = ???

    /** Retrieves the negotiated property. */
    @stub
    def getNegotiatedProperty(propName: String): Any = ???

    /** Determines whether this mechanism has an optional initial response. */
    @stub
    def hasInitialResponse(): Boolean = ???

    /** Determines whether the authentication exchange has completed. */
    @stub
    def isComplete(): Boolean = ???

    /** Unwraps a byte array received from the server. */
    @stub
    def unwrap(incoming: Array[Byte], offset: Int, len: Int): Array[Byte] = ???

    /** Wraps a byte array to be sent to the server. */
    @stub
    def wrap(outgoing: Array[Byte], offset: Int, len: Int): Array[Byte] = ???
}
