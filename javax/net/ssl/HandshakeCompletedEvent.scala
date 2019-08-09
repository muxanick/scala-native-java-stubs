package javax.net.ssl

import java.lang.{Object, String}
import java.security.Principal
import java.security.cert.Certificate
import java.util.EventObject
import javax.security.cert.X509Certificate
import scala.scalanative.annotation.stub

/** This event indicates that an SSL handshake completed on a given
 *  SSL connection.  All of the core information about that handshake's
 *  result is captured through an "SSLSession" object.  As a convenience,
 *  this event class provides direct access to some important session
 *  attributes.
 * 
 *   The source of this event is the SSLSocket on which handshaking
 *  just completed.
 */
class HandshakeCompletedEvent extends EventObject {

    /** Constructs a new HandshakeCompletedEvent. */
    @stub
    def this(sock: SSLSocket, s: SSLSession) = ???

    /** Returns the cipher suite in use by the session which was produced
     *  by the handshake.
     */
    @stub
    def getCipherSuite(): String = ???

    /** Returns the certificate(s) that were sent to the peer during
     *  handshaking.
     */
    @stub
    def getLocalCertificates(): Array[Certificate] = ???

    /** Returns the principal that was sent to the peer during handshaking. */
    @stub
    def getLocalPrincipal(): Principal = ???

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

    /** Returns the identity of the peer which was established as part of
     *  defining the session.
     */
    @stub
    def getPeerPrincipal(): Principal = ???

    /** Returns the session that triggered this event. */
    @stub
    def getSession(): SSLSession = ???

    /** Returns the socket which is the source of this event. */
    @stub
    def getSocket(): SSLSocket = ???
}
