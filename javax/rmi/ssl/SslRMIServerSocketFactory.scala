package javax.rmi.ssl

import java.lang.{Object, String}
import java.net.ServerSocket
import java.rmi.server.RMIServerSocketFactory
import javax.net.ssl.SSLContext

// An SslRMIServerSocketFactory instance is used by the RMI
// runtime in order to obtain server sockets for RMI calls via SSL.
//
// This class implements RMIServerSocketFactory over
// the Secure Sockets Layer (SSL) or Transport Layer Security (TLS)
// protocols.
//
// This class creates SSL sockets using the default
// SSLSocketFactory (see SSLSocketFactory.getDefault()) or the default
// SSLServerSocketFactory (see SSLServerSocketFactory.getDefault()) unless the
// constructor taking an SSLContext is
// used in which case the SSL sockets are created using
// the SSLSocketFactory returned by
// SSLContext.getSocketFactory() or the
// SSLServerSocketFactory returned by
// SSLContext.getServerSocketFactory().
//
// When an SSLContext is not supplied all the instances of this
// class share the same keystore, and the same truststore (when client
// authentication is required by the server). This behavior can be modified
// by supplying an already initialized SSLContext instance.
class SslRMIServerSocketFactory extends Object with RMIServerSocketFactory {

    @stub
    // Creates a new SslRMIServerSocketFactory with
    // the default SSL socket configuration.
    def this() = ???

    @stub
    // Creates a new SslRMIServerSocketFactory with the
    // specified SSLContext and SSL socket configuration.
    def this(context: SSLContext, enabledCipherSuites: Array[String], enabledProtocols: Array[String], needClientAuth: Boolean) = ???

    @stub
    // Creates a server socket that accepts SSL connections
    // configured according to this factory's SSL socket configuration
    // parameters.
    def createServerSocket(port: Int): ServerSocket = ???

    @stub
    // Indicates whether some other object is "equal to" this one.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the names of the cipher suites enabled on SSL
    // connections accepted by server sockets created by this factory,
    // or null if this factory uses the cipher suites
    // that are enabled by default.
    def getEnabledCipherSuites(): Array[String] = ???

    @stub
    // Returns the names of the protocol versions enabled on SSL
    // connections accepted by server sockets created by this factory,
    // or null if this factory uses the protocol versions
    // that are enabled by default.
    def getEnabledProtocols(): Array[String] = ???

    @stub
    // Returns true if client authentication is
    // required on SSL connections accepted by server sockets created
    // by this factory.
    def getNeedClientAuth(): Boolean = ???
}
