package javax.net.ssl

import java.lang.{Object, String}
import java.security.{Provider, SecureRandom}
import scala.scalanative.annotation.stub

/** Instances of this class represent a secure socket protocol
 *  implementation which acts as a factory for secure socket
 *  factories or SSLEngines. This class is initialized
 *  with an optional set of key and trust managers and source of
 *  secure random bytes.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard SSLContext protocol:
 *  
 *  TLSv1
 *  
 *  This protocol is described in the 
 *  SSLContext section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other algorithms are supported.
 */
class SSLContext extends Object {

    /** Creates an SSLContext object. */
    @stub
    protected def this(contextSpi: SSLContextSpi, provider: Provider, protocol: String) = ???

    /** Creates a new SSLEngine using this context. */
    @stub
    def createSSLEngine(): SSLEngine = ???

    /** Creates a new SSLEngine using this context using
     *  advisory peer information.
     */
    @stub
    def createSSLEngine(peerHost: String, peerPort: Int): SSLEngine = ???

    /** Returns the client session context, which represents the set of
     *  SSL sessions available for use during the handshake phase of
     *  client-side SSL sockets.
     */
    @stub
    def getClientSessionContext(): SSLSessionContext = ???

    /** Returns a copy of the SSLParameters indicating the default
     *  settings for this SSL context.
     */
    @stub
    def getDefaultSSLParameters(): SSLParameters = ???

    /** Returns the protocol name of this SSLContext object. */
    @stub
    def getProtocol(): String = ???

    /** Returns the provider of this SSLContext object. */
    @stub
    def getProvider(): Provider = ???

    /** Returns the server session context, which represents the set of
     *  SSL sessions available for use during the handshake phase of
     *  server-side SSL sockets.
     */
    @stub
    def getServerSessionContext(): SSLSessionContext = ???

    /** Returns a ServerSocketFactory object for
     *  this context.
     */
    @stub
    def getServerSocketFactory(): SSLServerSocketFactory = ???

    /** Returns a SocketFactory object for this
     *  context.
     */
    @stub
    def getSocketFactory(): SSLSocketFactory = ???

    /** Returns a copy of the SSLParameters indicating the supported
     *  settings for this SSL context.
     */
    @stub
    def getSupportedSSLParameters(): SSLParameters = ???

    /** Initializes this context. */
    @stub
    def init(km: Array[KeyManager], tm: Array[TrustManager], random: SecureRandom): Unit = ???
}

object SSLContext {
    /** Returns the default SSL context. */
    @stub
    def getDefault(): SSLContext = ???

    /** Returns a SSLContext object that implements the
     *  specified secure socket protocol.
     */
    @stub
    def getInstance(protocol: String): SSLContext = ???

    /** Returns a SSLContext object that implements the
     *  specified secure socket protocol.
     */
    @stub
    def getInstance(protocol: String, provider: Provider): SSLContext = ???

    /** Returns a SSLContext object that implements the
     *  specified secure socket protocol.
     */
    @stub
    def getInstance(protocol: String, provider: String): SSLContext = ???

    /** Sets the default SSL context. */
    @stub
    def setDefault(context: SSLContext): Unit = ???
}
