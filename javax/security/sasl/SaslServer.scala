package javax.security.sasl

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Performs SASL authentication as a server.
 * 
 *  A server such an LDAP server gets an instance of this
 *  class in order to perform authentication defined by a specific SASL
 *  mechanism. Invoking methods on the SaslServer instance
 *  generates challenges according to the SASL
 *  mechanism implemented by the SaslServer.
 *  As the authentication proceeds, the instance
 *  encapsulates the state of a SASL server's authentication exchange.
 * 
 *  Here's an example of how an LDAP server might use a SaslServer.
 *  It first gets an instance of a SaslServer for the SASL mechanism
 *  requested by the client:
 * 
 *  SaslServer ss = Sasl.createSaslServer(mechanism,
 *      "ldap", myFQDN, props, callbackHandler);
 * 
 *  It can then proceed to use the server for authentication.
 *  For example, suppose the LDAP server received an LDAP BIND request
 *  containing the name of the SASL mechanism and an (optional) initial
 *  response. It then might use the server as follows:
 * 
 *  while (!ss.isComplete()) {
 *      try {
 *          byte[] challenge = ss.evaluateResponse(response);
 *          if (ss.isComplete()) {
 *              status = ldap.sendBindResponse(mechanism, challenge, SUCCESS);
 *          } else {
 *              status = ldap.sendBindResponse(mechanism, challenge,
 *                    SASL_BIND_IN_PROGRESS);
 *              response = ldap.readBindRequest();
 *          }
 *      } catch (SaslException e) {
 *           status = ldap.sendErrorResponse(e);
 *           break;
 *      }
 *  }
 *  if (ss.isComplete() && status == SUCCESS) {
 *     String qop = (String) sc.getNegotiatedProperty(Sasl.QOP);
 *     if (qop != null
 *         && (qop.equalsIgnoreCase("auth-int")
 *             || qop.equalsIgnoreCase("auth-conf"))) {
 * 
 *       // Use SaslServer.wrap() and SaslServer.unwrap() for future
 *       // communication with client
 *       ldap.in = new SecureInputStream(ss, ldap.in);
 *       ldap.out = new SecureOutputStream(ss, ldap.out);
 *     }
 *  }
 * 
 */
trait SaslServer {

    /** Disposes of any system resources or security-sensitive information
     *  the SaslServer might be using.
     */
    @stub
    def dispose(): Unit = ???

    /** Evaluates the response data and generates a challenge. */
    @stub
    def evaluateResponse(response: Array[Byte]): Array[Byte] = ???

    /** Reports the authorization ID in effect for the client of this
     *  session.
     */
    @stub
    def getAuthorizationID(): String = ???

    /** Returns the IANA-registered mechanism name of this SASL server. */
    @stub
    def getMechanismName(): String = ???

    /** Retrieves the negotiated property. */
    @stub
    def getNegotiatedProperty(propName: String): Object = ???

    /** Determines whether the authentication exchange has completed. */
    @stub
    def isComplete(): Boolean = ???

    /** Unwraps a byte array received from the client. */
    @stub
    def unwrap(incoming: Array[Byte], offset: Int, len: Int): Array[Byte] = ???

    /** Wraps a byte array to be sent to the client. */
    @stub
    def wrap(outgoing: Array[Byte], offset: Int, len: Int): Array[Byte] = ???
}
