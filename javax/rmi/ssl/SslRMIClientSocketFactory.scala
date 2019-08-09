package javax.rmi.ssl

import java.io.Serializable
import java.lang.{Object, String}
import java.net.Socket
import java.rmi.server.RMIClientSocketFactory
import scala.scalanative.annotation.stub

/** An SslRMIClientSocketFactory instance is used by the RMI
 *  runtime in order to obtain client sockets for RMI calls via SSL.
 * 
 *  This class implements RMIClientSocketFactory over
 *  the Secure Sockets Layer (SSL) or Transport Layer Security (TLS)
 *  protocols.
 * 
 *  This class creates SSL sockets using the default
 *  SSLSocketFactory (see SSLSocketFactory.getDefault()).  All instances of this class are
 *  functionally equivalent.  In particular, they all share the same
 *  truststore, and the same keystore when client authentication is
 *  required by the server.  This behavior can be modified in
 *  subclasses by overriding the createSocket(String,int)
 *  method; in that case, equals and hashCode may also need to be overridden.
 * 
 *  If the system property
 *  javax.rmi.ssl.client.enabledCipherSuites is specified,
 *  the createSocket(String,int) method will call SSLSocket.setEnabledCipherSuites(String[]) before returning the
 *  socket.  The value of this system property is a string that is a
 *  comma-separated list of SSL/TLS cipher suites to enable.
 * 
 *  If the system property
 *  javax.rmi.ssl.client.enabledProtocols is specified,
 *  the createSocket(String,int) method will call SSLSocket.setEnabledProtocols(String[]) before returning the
 *  socket.  The value of this system property is a string that is a
 *  comma-separated list of SSL/TLS protocol versions to enable.
 */
class SslRMIClientSocketFactory extends Object with RMIClientSocketFactory with Serializable {

    /** Creates a new SslRMIClientSocketFactory. */
    @stub
    def this() = ???

    /** Creates an SSL socket. */
    @stub
    def createSocket(host: String, port: Int): Socket = ???

    /** Indicates whether some other object is "equal to" this one. */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns a hash code value for this
     *  SslRMIClientSocketFactory.
     */
    @stub
    def hashCode(): Int = ???
}
