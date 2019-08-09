package javax.net.ssl

import java.lang.{Object, String}
import java.net.ServerSocket

/** This class extends ServerSockets and
 *  provides secure server sockets using protocols such as the Secure
 *  Sockets Layer (SSL) or Transport Layer Security (TLS) protocols.
 *  
 *  Instances of this class are generally created using a
 *  SSLServerSocketFactory.  The primary function
 *  of SSLServerSockets
 *  is to create SSLSockets by accepting
 *  connections.
 *  
 *  SSLServerSockets contain several pieces of state data
 *  which are inherited by the SSLSocket at
 *  socket creation.  These include the enabled cipher
 *  suites and protocols, whether client
 *  authentication is necessary, and whether created sockets should
 *  begin handshaking in client or server mode.  The state
 *  inherited by the created SSLSocket can be
 *  overriden by calling the appropriate methods.
 */
abstract class SSLServerSocket extends ServerSocket {

    /** Used only by subclasses. */
    @stub
    protected def this() = ???

    /** Used only by subclasses. */
    @stub
    protected def this(port: Int) = ???

    /** Used only by subclasses. */
    @stub
    protected def this(port: Int, backlog: Int) = ???

    /** Returns the list of cipher suites which are currently enabled
     *  for use by newly accepted connections.
     */
    def getEnabledCipherSuites(): Array[String]

    /** Returns the names of the protocols which are currently
     *  enabled for use by the newly accepted connections.
     */
    def getEnabledProtocols(): Array[String]

    /** Returns true if new SSL sessions may be established by the
     *  sockets which are created from this server socket.
     */
    def getEnableSessionCreation(): Boolean

    /** Returns true if client authentication will be required on
     *  newly accepted server-mode SSLSockets.
     */
    def getNeedClientAuth(): Boolean

    /** Returns the SSLParameters in effect for newly accepted connections. */
    def getSSLParameters(): SSLParameters

    /** Returns the names of the cipher suites which could be enabled for use
     *  on an SSL connection.
     */
    def getSupportedCipherSuites(): Array[String]

    /** Returns the names of the protocols which could be enabled for use. */
    def getSupportedProtocols(): Array[String]

    /** Returns true if accepted connections will be in SSL client mode. */
    def getUseClientMode(): Boolean

    /** Returns true if client authentication will be requested on
     *  newly accepted server-mode connections.
     */
    def getWantClientAuth(): Boolean

    /** Sets the cipher suites enabled for use by accepted connections. */
    def setEnabledCipherSuites(suites: Array[String]): Unit

    /** Controls which particular protocols are enabled for use by
     *  accepted connections.
     */
    def setEnabledProtocols(protocols: Array[String]): Unit

    /** Controls whether new SSL sessions may be established by the
     *  sockets which are created from this server socket.
     */
    def setEnableSessionCreation(flag: Boolean): Unit

    /** Controls whether accepted server-mode
     *  SSLSockets will be initially configured to
     *  require client authentication.
     */
    def setNeedClientAuth(need: Boolean): Unit

    /** Applies SSLParameters to newly accepted connections. */
    def setSSLParameters(params: SSLParameters): Unit

    /** Controls whether accepted connections are in the (default) SSL
     *  server mode, or the SSL client mode.
     */
    def setUseClientMode(mode: Boolean): Unit
}
