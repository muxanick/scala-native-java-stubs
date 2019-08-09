package javax.net.ssl

import java.lang.{Object, String}
import java.security.AlgorithmConstraints
import java.util.{Collection, List}

// Encapsulates parameters for an SSL/TLS connection. The parameters
// are the list of ciphersuites to be accepted in an SSL/TLS handshake,
// the list of protocols to be allowed, the endpoint identification
// algorithm during SSL/TLS handshaking, the Server Name Indication (SNI),
// the algorithm constraints and whether SSL/TLS servers should request
// or require client authentication, etc.
// 
// SSLParameters can be created via the constructors in this class.
// Objects can also be obtained using the getSSLParameters()
// methods in
// SSLSocket and
// SSLServerSocket and
// SSLEngine or the
// getDefaultSSLParameters() and
// getSupportedSSLParameters()
// methods in SSLContext.
// 
// SSLParameters can be applied to a connection via the methods
// SSLSocket.setSSLParameters() and
// SSLServerSocket.setSSLParameters()
// and SSLEngine.setSSLParameters().
class SSLParameters extends Object {

    @stub
    // Constructs SSLParameters.
    def this() = ???

    @stub
    // Constructs SSLParameters from the specified array of ciphersuites.
    def this(cipherSuites: Array[String]) = ???

    @stub
    // Returns the cryptographic algorithm constraints.
    def getAlgorithmConstraints(): AlgorithmConstraints = ???

    @stub
    // Returns a copy of the array of ciphersuites or null if none
    // have been set.
    def getCipherSuites(): Array[String] = ???

    @stub
    // Gets the endpoint identification algorithm.
    def getEndpointIdentificationAlgorithm(): String = ???

    @stub
    // Returns whether client authentication should be required.
    def getNeedClientAuth(): Boolean = ???

    @stub
    // Returns a copy of the array of protocols or null if none
    // have been set.
    def getProtocols(): Array[String] = ???

    @stub
    // Returns a List containing all SNIServerNames of the
    // Server Name Indication (SNI) parameter, or null if none has been set.
    def getServerNames(): List[SNIServerName] = ???

    @stub
    // Returns a Collection containing all SNIMatchers of the
    // Server Name Indication (SNI) parameter, or null if none has been set.
    def getSNIMatchers(): Collection[SNIMatcher] = ???

    @stub
    // Returns whether the local cipher suites preference should be honored.
    def getUseCipherSuitesOrder(): Boolean = ???

    @stub
    // Returns whether client authentication should be requested.
    def getWantClientAuth(): Boolean = ???

    @stub
    // Sets the cryptographic algorithm constraints, which will be used
    // in addition to any configured by the runtime environment.
    def setAlgorithmConstraints(constraints: AlgorithmConstraints): Unit = ???

    @stub
    // Sets the array of ciphersuites.
    def setCipherSuites(cipherSuites: Array[String]): Unit = ???

    @stub
    // Sets the endpoint identification algorithm.
    def setEndpointIdentificationAlgorithm(algorithm: String): Unit = ???

    @stub
    // Sets whether client authentication should be required.
    def setNeedClientAuth(needClientAuth: Boolean): Unit = ???

    @stub
    // Sets the array of protocols.
    def setProtocols(protocols: Array[String]): Unit = ???

    @stub
    // Sets the desired SNIServerNames of the Server Name
    // Indication (SNI) parameter.
    def setServerNames(serverNames: List[SNIServerName]): Unit = ???

    @stub
    // Sets the SNIMatchers of the Server Name Indication (SNI)
    // parameter.
    def setSNIMatchers(matchers: Collection[SNIMatcher]): Unit = ???

    @stub
    // Sets whether the local cipher suites preference should be honored.
    def setUseCipherSuitesOrder(honorOrder: Boolean): Unit = ???
}
