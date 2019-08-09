package javax.net.ssl

import java.lang.{Object, String}
import java.security.Principal
import java.security.cert.Certificate
import javax.security.cert.X509Certificate

// In SSL, sessions are used to describe an ongoing relationship between
// two entities.  Each SSL connection involves one session at a time, but
// that session may be used on many connections between those entities,
// simultaneously or sequentially.  The session used on a connection may
// also be replaced by a different session.  Sessions are created, or
// rejoined, as part of the SSL handshaking protocol. Sessions may be
// invalidated due to policies affecting security or resource usage,
// or by an application explicitly calling invalidate.
// Session management policies are typically used to tune performance.
//
//  In addition to the standard session attributes, SSL sessions expose
// these read-only attributes:  
//
//       Peer Identity.  Sessions are between a particular
//      client and a particular server.  The identity of the peer may
//      have been established as part of session setup.  Peers are
//      generally identified by X.509 certificate chains.
//
//       Cipher Suite Name.  Cipher suites describe the
//      kind of cryptographic protection that's used by connections
//      in a particular session.
//
//       Peer Host.  All connections in a session are
//      between the same two hosts.  The address of the host on the other
//      side of the connection is available.
//
//      
//
//  Sessions may be explicitly invalidated.  Invalidation may also
// be done implicitly, when faced with certain kinds of errors.
trait SSLSession {

    @stub
    // Gets the current size of the largest application data that is
    // expected when using this session.
    def getApplicationBufferSize(): Int = ???

    @stub
    // Returns the name of the SSL cipher suite which is used for all
    // connections in the session.
    def getCipherSuite(): String = ???

    @stub
    // Returns the time at which this Session representation was created,
    // in milliseconds since midnight, January 1, 1970 UTC.
    def getCreationTime(): Long = ???

    @stub
    // Returns the identifier assigned to this Session.
    def getId(): Array[Byte] = ???

    @stub
    // Returns the last time this Session representation was accessed by the
    // session level infrastructure, in milliseconds since
    // midnight, January 1, 1970 UTC.
    def getLastAccessedTime(): Long = ???

    @stub
    // Returns the certificate(s) that were sent to the peer during
    // handshaking.
    def getLocalCertificates(): Array[Certificate] = ???

    @stub
    // Returns the principal that was sent to the peer during handshaking.
    def getLocalPrincipal(): Principal = ???

    @stub
    // Gets the current size of the largest SSL/TLS packet that is expected
    // when using this session.
    def getPacketBufferSize(): Int = ???

    @stub
    // Returns the identity of the peer which was identified as part
    // of defining the session.
    def getPeerCertificateChain(): Array[X509Certificate] = ???

    @stub
    // Returns the identity of the peer which was established as part
    // of defining the session.
    def getPeerCertificates(): Array[Certificate] = ???

    @stub
    // Returns the host name of the peer in this session.
    def getPeerHost(): String = ???

    @stub
    // Returns the port number of the peer in this session.
    def getPeerPort(): Int = ???

    @stub
    // Returns the identity of the peer which was established as part of
    // defining the session.
    def getPeerPrincipal(): Principal = ???

    @stub
    // Returns the standard name of the protocol used for all
    // connections in the session.
    def getProtocol(): String = ???

    @stub
    // Returns the context in which this session is bound.
    def getSessionContext(): SSLSessionContext = ???

    @stub
    // Returns the object bound to the given name in the session's
    // application layer data.
    def getValue(name: String): Object = ???

    @stub
    // Returns an array of the names of all the application layer
    // data objects bound into the Session.
    def getValueNames(): Array[String] = ???

    @stub
    // Invalidates the session.
    def invalidate(): Unit = ???

    @stub
    // Returns whether this session is valid and available for resuming or
    // joining.
    def isValid(): Boolean = ???

    @stub
    // Binds the specified value object into the
    // session's application layer data
    // with the given name.
    def putValue(name: String, value: Object): Unit = ???
}
