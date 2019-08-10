package javax.net.ssl

import java.lang.{Object, String}
import java.security.Principal
import java.security.cert.Certificate
import javax.security.cert.X509Certificate
import scala.scalanative.annotation.stub

/** In SSL, sessions are used to describe an ongoing relationship between
 *  two entities.  Each SSL connection involves one session at a time, but
 *  that session may be used on many connections between those entities,
 *  simultaneously or sequentially.  The session used on a connection may
 *  also be replaced by a different session.  Sessions are created, or
 *  rejoined, as part of the SSL handshaking protocol. Sessions may be
 *  invalidated due to policies affecting security or resource usage,
 *  or by an application explicitly calling invalidate.
 *  Session management policies are typically used to tune performance.
 * 
 *   In addition to the standard session attributes, SSL sessions expose
 *  these read-only attributes:  
 * 
 *        Peer Identity.  Sessions are between a particular
 *       client and a particular server.  The identity of the peer may
 *       have been established as part of session setup.  Peers are
 *       generally identified by X.509 certificate chains.
 * 
 *        Cipher Suite Name.  Cipher suites describe the
 *       kind of cryptographic protection that's used by connections
 *       in a particular session.
 * 
 *        Peer Host.  All connections in a session are
 *       between the same two hosts.  The address of the host on the other
 *       side of the connection is available.
 * 
 *       
 * 
 *   Sessions may be explicitly invalidated.  Invalidation may also
 *  be done implicitly, when faced with certain kinds of errors.
 */
trait SSLSession {

    /** Gets the current size of the largest application data that is
     *  expected when using this session.
     */
    @stub
    def getApplicationBufferSize(): Int = ???

    /** Returns the name of the SSL cipher suite which is used for all
     *  connections in the session.
     */
    @stub
    def getCipherSuite(): String = ???

    /** Returns the time at which this Session representation was created,
     *  in milliseconds since midnight, January 1, 1970 UTC.
     */
    @stub
    def getCreationTime(): Long = ???

    /** Returns the identifier assigned to this Session. */
    @stub
    def getId(): Array[Byte] = ???

    /** Returns the last time this Session representation was accessed by the
     *  session level infrastructure, in milliseconds since
     *  midnight, January 1, 1970 UTC.
     */
    @stub
    def getLastAccessedTime(): Long = ???

    /** Returns the certificate(s) that were sent to the peer during
     *  handshaking.
     */
    @stub
    def getLocalCertificates(): Array[Certificate] = ???

    /** Returns the principal that was sent to the peer during handshaking. */
    @stub
    def getLocalPrincipal(): Principal = ???

    /** Gets the current size of the largest SSL/TLS packet that is expected
     *  when using this session.
     */
    @stub
    def getPacketBufferSize(): Int = ???

    /** Returns the identity of the peer which was identified as part
     *  of defining the session.
     */
    @stub
    def getPeerCertificateChain(): Array[X509Certificate] = ???

    /** Returns the identity of the peer which was established as part
     *  of defining the session.
     */
    @stub
    def getPeerCertificates(): Array[Certificate] = ???

    /** Returns the host name of the peer in this session. */
    @stub
    def getPeerHost(): String = ???

    /** Returns the port number of the peer in this session. */
    @stub
    def getPeerPort(): Int = ???

    /** Returns the identity of the peer which was established as part of
     *  defining the session.
     */
    @stub
    def getPeerPrincipal(): Principal = ???

    /** Returns the standard name of the protocol used for all
     *  connections in the session.
     */
    @stub
    def getProtocol(): String = ???

    /** Returns the context in which this session is bound. */
    @stub
    def getSessionContext(): SSLSessionContext = ???

    /** Returns the object bound to the given name in the session's
     *  application layer data.
     */
    @stub
    def getValue(name: String): Any = ???

    /** Returns an array of the names of all the application layer
     *  data objects bound into the Session.
     */
    @stub
    def getValueNames(): Array[String] = ???

    /** Invalidates the session. */
    @stub
    def invalidate(): Unit = ???

    /** Returns whether this session is valid and available for resuming or
     *  joining.
     */
    @stub
    def isValid(): Boolean = ???

    /** Binds the specified value object into the
     *  session's application layer data
     *  with the given name.
     */
    @stub
    def putValue(name: String, value: Any): Unit = ???

    /** Removes the object bound to the given name in the session's
     *  application layer data.
     */
    @stub
    def removeValue(name: String): Unit = ???
}
