package javax.net.ssl

import java.lang.{Object, String}
import java.net.{HttpURLConnection, URLConnection}
import java.security.Principal
import java.security.cert.Certificate

// HttpsURLConnection extends HttpURLConnection
// with support for https-specific features.
// 
// See 
// http://www.w3.org/pub/WWW/Protocols/ and
//  RFC 2818 
// for more details on the
// https specification.
// 
// This class uses HostnameVerifier and
// SSLSocketFactory.
// There are default implementations defined for both classes.
// However, the implementations can be replaced on a per-class (static) or
// per-instance basis.  All new HttpsURLConnections instances
// will be assigned
// the "default" static values at instance creation, but they can be overriden
// by calling the appropriate per-instance set method(s) before
// connecting.
abstract class HttpsURLConnection extends HttpURLConnection {

    // Returns the cipher suite in use on this connection.
    def getCipherSuite(): String

    // Gets the HostnameVerifier in place on this instance.
    def getHostnameVerifier(): HostnameVerifier

    // Returns the certificate(s) that were sent to the server during
    // handshaking.
    def getLocalCertificates(): Array[Certificate]

    // Returns the principal that was sent to the server during handshaking.
    def getLocalPrincipal(): Principal

    // Returns the server's principal which was established as part of
    // defining the session.
    def getPeerPrincipal(): Principal

    // Returns the server's certificate chain which was established
    // as part of defining the session.
    def getServerCertificates(): Array[Certificate]

    // Gets the SSL socket factory to be used when creating sockets
    // for secure https URL connections.
    def getSSLSocketFactory(): SSLSocketFactory

    // Sets the HostnameVerifier for this instance.
    def setHostnameVerifier(v: HostnameVerifier): Unit
}

object HttpsURLConnection {
    @stub
    // Gets the default HostnameVerifier that is inherited
    // by new instances of this class.
    def getDefaultHostnameVerifier(): HostnameVerifier = ???

    @stub
    // Gets the default static SSLSocketFactory that is
    // inherited by new instances of this class.
    def getDefaultSSLSocketFactory(): SSLSocketFactory = ???

    @stub
    // Sets the default HostnameVerifier inherited by a
    // new instance of this class.
    def setDefaultHostnameVerifier(v: HostnameVerifier): Unit = ???

    @stub
    // Sets the default SSLSocketFactory inherited by new
    // instances of this class.
    def setDefaultSSLSocketFactory(sf: SSLSocketFactory): Unit = ???
}