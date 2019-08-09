package javax.net.ssl

import java.lang.{Object, String}
import java.net.{InetAddress, Socket}
import scala.scalanative.annotation.stub

/** This class extends Sockets and provides secure
 *  socket using protocols such as the "Secure
 *  Sockets Layer" (SSL) or IETF "Transport Layer Security" (TLS) protocols.
 *  
 *  Such sockets are normal stream sockets, but they
 *  add a layer of security protections over the underlying network transport
 *  protocol, such as TCP.  Those protections include: 
 * 
 *        Integrity Protection.  SSL protects against
 *       modification of messages by an active wiretapper.
 * 
 *        Authentication.  In most modes, SSL provides
 *       peer authentication.  Servers are usually authenticated,
 *       and clients may be authenticated as requested by servers.
 * 
 *        Confidentiality (Privacy Protection).  In most
 *       modes, SSL encrypts data being sent between client and server.
 *       This protects the confidentiality of data, so that passive
 *       wiretappers won't see sensitive data such as financial
 *       information or personal information of many kinds.
 * 
 *       
 * 
 *  These kinds of protection are specified by a "cipher suite", which
 *  is a combination of cryptographic algorithms used by a given SSL connection.
 *  During the negotiation process, the two endpoints must agree on
 *  a ciphersuite that is available in both environments.
 *  If there is no such suite in common, no SSL connection can
 *  be established, and no data can be exchanged.
 * 
 *   The cipher suite used is established by a negotiation process
 *  called "handshaking".  The goal of this
 *  process is to create or rejoin a "session", which may protect many
 *  connections over time.  After handshaking has completed, you can access
 *  session attributes by using the getSession method.
 *  The initial handshake on this connection can be initiated in
 *  one of three ways: 
 * 
 *        calling startHandshake which explicitly
 *               begins handshakes, or
 *        any attempt to read or write application data on
 *               this socket causes an implicit handshake, or
 *        a call to getSession tries to set up a session
 *               if there is no currently valid session, and
 *               an implicit handshake is done.
 *  
 * 
 *  If handshaking fails for any reason, the SSLSocket
 *  is closed, and no further communications can be done.
 * 
 *  There are two groups of cipher suites which you will need to know
 *  about when managing cipher suites: 
 * 
 *        Supported cipher suites:  all the suites which are
 *       supported by the SSL implementation.  This list is reported
 *       using getSupportedCipherSuites.
 * 
 *        Enabled cipher suites, which may be fewer
 *       than the full set of supported suites.  This group is
 *       set using the setEnabledCipherSuites method, and
 *       queried using the getEnabledCipherSuites method.
 *       Initially, a default set of cipher suites will be enabled on
 *       a new socket that represents the minimum suggested configuration.
 * 
 *       
 * 
 *   Implementation defaults require that only cipher
 *  suites which authenticate servers and provide confidentiality
 *  be enabled by default.
 *  Only if both sides explicitly agree to unauthenticated and/or
 *  non-private (unencrypted) communications will such a ciphersuite be
 *  selected.
 * 
 *  When SSLSockets are first created, no handshaking
 *  is done so that applications may first set their communication
 *  preferences:  what cipher suites to use, whether the socket should be
 *  in client or server mode, etc.
 *  However, security is always provided by the time that application data
 *  is sent over the connection.
 * 
 *   You may register to receive event notification of handshake
 *  completion.  This involves
 *  the use of two additional classes.  HandshakeCompletedEvent
 *  objects are passed to HandshakeCompletedListener instances,
 *  which are registered by users of this API.
 * 
 *  SSLSockets are created by SSLSocketFactorys,
 *  or by accepting a connection from a
 *  SSLServerSocket.
 * 
 *  A SSL socket must choose to operate in the client or server mode.
 *  This will determine who begins the handshaking process, as well
 *  as which messages should be sent by each party.  Each
 *  connection must have one client and one server, or handshaking
 *  will not progress properly.  Once the initial handshaking has started, a
 *  socket can not switch between client and server modes, even when
 *  performing renegotiations.
 */
abstract class SSLSocket extends Socket {

    /** Used only by subclasses. */
    @stub
    protected def this() = ???

    /** Used only by subclasses. */
    @stub
    protected def this(address: InetAddress, port: Int) = ???

    /** Used only by subclasses. */
    @stub
    protected def this(address: InetAddress, port: Int, clientAddress: InetAddress, clientPort: Int) = ???

    /** Used only by subclasses. */
    @stub
    protected def this(host: String, port: Int) = ???

    /** Used only by subclasses. */
    @stub
    protected def this(host: String, port: Int, clientAddress: InetAddress, clientPort: Int) = ???

    /** Registers an event listener to receive notifications that an
     *  SSL handshake has completed on this connection.
     */
    def addHandshakeCompletedListener(listener: HandshakeCompletedListener): Unit

    /** Returns the names of the SSL cipher suites which are currently
     *  enabled for use on this connection.
     */
    def getEnabledCipherSuites(): Array[String]

    /** Returns the names of the protocol versions which are currently
     *  enabled for use on this connection.
     */
    def getEnabledProtocols(): Array[String]

    /** Returns true if new SSL sessions may be established by this socket. */
    def getEnableSessionCreation(): Boolean

    /** Returns the SSLSession being constructed during a SSL/TLS
     *  handshake.
     */
    def getHandshakeSession(): SSLSession

    /** Returns true if the socket will require client authentication. */
    def getNeedClientAuth(): Boolean

    /** Returns the SSL Session in use by this connection. */
    def getSession(): SSLSession

    /** Returns the SSLParameters in effect for this SSLSocket. */
    def getSSLParameters(): SSLParameters

    /** Returns the names of the cipher suites which could be enabled for use
     *  on this connection.
     */
    def getSupportedCipherSuites(): Array[String]

    /** Returns the names of the protocols which could be enabled for use
     *  on an SSL connection.
     */
    def getSupportedProtocols(): Array[String]

    /** Returns true if the socket is set to use client mode when
     *  handshaking.
     */
    def getUseClientMode(): Boolean

    /** Returns true if the socket will request client authentication. */
    def getWantClientAuth(): Boolean

    /** Removes a previously registered handshake completion listener. */
    def removeHandshakeCompletedListener(listener: HandshakeCompletedListener): Unit

    /** Sets the cipher suites enabled for use on this connection. */
    def setEnabledCipherSuites(suites: Array[String]): Unit

    /** Sets the protocol versions enabled for use on this connection. */
    def setEnabledProtocols(protocols: Array[String]): Unit

    /** Controls whether new SSL sessions may be established by this socket. */
    def setEnableSessionCreation(flag: Boolean): Unit

    /** Configures the socket to require client authentication. */
    def setNeedClientAuth(need: Boolean): Unit

    /** Applies SSLParameters to this socket. */
    def setSSLParameters(params: SSLParameters): Unit

    /** Configures the socket to use client (or server) mode when
     *  handshaking.
     */
    def setUseClientMode(mode: Boolean): Unit

    /** Configures the socket to request client authentication. */
    def setWantClientAuth(want: Boolean): Unit

    /** Starts an SSL handshake on this connection. */
    def startHandshake(): Unit
}
