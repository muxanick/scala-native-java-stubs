package javax.security.sasl

import java.lang.{Object, String}

// Performs SASL authentication as a server.
//
// A server such an LDAP server gets an instance of this
// class in order to perform authentication defined by a specific SASL
// mechanism. Invoking methods on the SaslServer instance
// generates challenges according to the SASL
// mechanism implemented by the SaslServer.
// As the authentication proceeds, the instance
// encapsulates the state of a SASL server's authentication exchange.
//
// Here's an example of how an LDAP server might use a SaslServer.
// It first gets an instance of a SaslServer for the SASL mechanism
// requested by the client:
//
// SaslServer ss = Sasl.createSaslServer(mechanism,
//     "ldap", myFQDN, props, callbackHandler);
//
// It can then proceed to use the server for authentication.
// For example, suppose the LDAP server received an LDAP BIND request
// containing the name of the SASL mechanism and an (optional) initial
// response. It then might use the server as follows:
//
// while (!ss.isComplete()) {
//     try {
//         byte[] challenge = ss.evaluateResponse(response);
//         if (ss.isComplete()) {
//             status = ldap.sendBindResponse(mechanism, challenge, SUCCESS);
//         } else {
//             status = ldap.sendBindResponse(mechanism, challenge,
//                   SASL_BIND_IN_PROGRESS);
//             response = ldap.readBindRequest();
//         }
//     } catch (SaslException e) {
//          status = ldap.sendErrorResponse(e);
//          break;
//     }
// }
// if (ss.isComplete() && status == SUCCESS) {
//    String qop = (String) sc.getNegotiatedProperty(Sasl.QOP);
//    if (qop != null
//        && (qop.equalsIgnoreCase("auth-int")
//            || qop.equalsIgnoreCase("auth-conf"))) {
//
//      // Use SaslServer.wrap() and SaslServer.unwrap() for future
//      // communication with client
//      ldap.in = new SecureInputStream(ss, ldap.in);
//      ldap.out = new SecureOutputStream(ss, ldap.out);
//    }
// }
//
trait SaslServer {

    @stub
    // Disposes of any system resources or security-sensitive information
    // the SaslServer might be using.
    def dispose(): Unit = ???

    @stub
    // Evaluates the response data and generates a challenge.
    def evaluateResponse(response: Array[Byte]): Array[Byte] = ???

    @stub
    // Reports the authorization ID in effect for the client of this
    // session.
    def getAuthorizationID(): String = ???

    @stub
    // Returns the IANA-registered mechanism name of this SASL server.
    def getMechanismName(): String = ???

    @stub
    // Retrieves the negotiated property.
    def getNegotiatedProperty(propName: String): Object = ???

    @stub
    // Determines whether the authentication exchange has completed.
    def isComplete(): Boolean = ???

    @stub
    // Unwraps a byte array received from the client.
    def unwrap(incoming: Array[Byte], offset: Int, len: Int): Array[Byte] = ???
}
