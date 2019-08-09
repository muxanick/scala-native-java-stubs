package javax.net.ssl

import java.lang.{Object, String}
import java.security.{Provider, SecureRandom}

// Instances of this class represent a secure socket protocol
// implementation which acts as a factory for secure socket
// factories or SSLEngines. This class is initialized
// with an optional set of key and trust managers and source of
// secure random bytes.
//
//  Every implementation of the Java platform is required to support the
// following standard SSLContext protocol:
// 
// TLSv1
// 
// This protocol is described in the 
// SSLContext section of the
// Java Cryptography Architecture Standard Algorithm Name Documentation.
// Consult the release documentation for your implementation to see if any
// other algorithms are supported.
class SSLContext extends Object {

    @stub
    // Creates a new SSLEngine using this context.
    def createSSLEngine(): SSLEngine = ???

    @stub
    // Creates a new SSLEngine using this context using
    // advisory peer information.
    def createSSLEngine(peerHost: String, peerPort: Int): SSLEngine = ???

    @stub
    // Returns the client session context, which represents the set of
    // SSL sessions available for use during the handshake phase of
    // client-side SSL sockets.
    def getClientSessionContext(): SSLSessionContext = ???

    @stub
    // Returns a copy of the SSLParameters indicating the default
    // settings for this SSL context.
    def getDefaultSSLParameters(): SSLParameters = ???

    @stub
    // Returns the protocol name of this SSLContext object.
    def getProtocol(): String = ???

    @stub
    // Returns the provider of this SSLContext object.
    def getProvider(): Provider = ???

    @stub
    // Returns the server session context, which represents the set of
    // SSL sessions available for use during the handshake phase of
    // server-side SSL sockets.
    def getServerSessionContext(): SSLSessionContext = ???

    @stub
    // Returns a ServerSocketFactory object for
    // this context.
    def getServerSocketFactory(): SSLServerSocketFactory = ???

    @stub
    // Returns a SocketFactory object for this
    // context.
    def getSocketFactory(): SSLSocketFactory = ???

    @stub
    // Returns a copy of the SSLParameters indicating the supported
    // settings for this SSL context.
    def getSupportedSSLParameters(): SSLParameters = ???

    @stub
    // Initializes this context.
    def init(km: Array[KeyManager], tm: Array[TrustManager], random: SecureRandom): Unit = ???
}

object SSLContext {
    @stub
    // Returns the default SSL context.
    def getDefault(): SSLContext = ???

    @stub
    // Returns a SSLContext object that implements the
    // specified secure socket protocol.
    def getInstance(protocol: String): SSLContext = ???

    @stub
    // Returns a SSLContext object that implements the
    // specified secure socket protocol.
    def getInstance(protocol: String, provider: Provider): SSLContext = ???

    @stub
    // Returns a SSLContext object that implements the
    // specified secure socket protocol.
    def getInstance(protocol: String, provider: String): SSLContext = ???
}
