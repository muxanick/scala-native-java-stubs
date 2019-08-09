package javax.naming.ldap

import java.lang.{Object, String}
import javax.net.ssl.{HostnameVerifier, SSLSession, SSLSocketFactory}
import scala.scalanative.annotation.stub

/** This class implements the LDAPv3 Extended Response for StartTLS as
 *  defined in
 *  Lightweight Directory
 *  Access Protocol (v3): Extension for Transport Layer Security
 * 
 *  The object identifier for StartTLS is 1.3.6.1.4.1.1466.20037
 *  and no extended response value is defined.
 * 
 * 
 *  The Start TLS extended request and response are used to establish
 *  a TLS connection over the existing LDAP connection associated with
 *  the JNDI context on which extendedOperation() is invoked.
 *  Typically, a JNDI program uses the StartTLS extended request and response
 *  classes as follows.
 *  
 *  import javax.naming.ldap.*;
 * 
 *  // Open an LDAP association
 *  LdapContext ctx = new InitialLdapContext();
 * 
 *  // Perform a StartTLS extended operation
 *  StartTlsResponse tls =
 *      (StartTlsResponse) ctx.extendedOperation(new StartTlsRequest());
 * 
 *  // Open a TLS connection (over the existing LDAP association) and get details
 *  // of the negotiated TLS session: cipher suite, peer certificate, ...
 *  SSLSession session = tls.negotiate();
 * 
 *  // ... use ctx to perform protected LDAP operations
 * 
 *  // Close the TLS connection (revert back to the underlying LDAP association)
 *  tls.close();
 * 
 *  // ... use ctx to perform unprotected LDAP operations
 * 
 *  // Close the LDAP association
 *  ctx.close;
 *  
 */
abstract class StartTlsResponse extends Object with ExtendedResponse {

    /** Constructs a StartTLS extended response. */
    @stub
    protected def this() = ???

    /** Closes the TLS connection gracefully and reverts back to the underlying
     *  connection.
     */
    def close(): Unit

    /** Retrieves the StartTLS response's ASN.1 BER encoded value. */
    def getEncodedValue(): Array[Byte]

    /** Retrieves the StartTLS response's object identifier string. */
    def getID(): String

    /** Negotiates a TLS session using the default SSL socket factory. */
    def negotiate(): SSLSession

    /** Negotiates a TLS session using an SSL socket factory. */
    def negotiate(factory: SSLSocketFactory): SSLSession

    /** Overrides the default list of cipher suites enabled for use on the
     *  TLS connection.
     */
    def setEnabledCipherSuites(suites: Array[String]): Unit

    /** Sets the hostname verifier used by negotiate()
     *  after the TLS handshake has completed and the default hostname
     *  verification has failed.
     */
    def setHostnameVerifier(verifier: HostnameVerifier): Unit
}

object StartTlsResponse {
    /** The StartTLS extended response's assigned object identifier
     *  is 1.3.6.1.4.1.1466.20037.
     */
    @stub
    val OID: String = ???
}
