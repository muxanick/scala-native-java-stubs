package javax.net.ssl

import java.lang.{Object, String}
import java.security.AlgorithmConstraints
import java.util.{Collection, List}

/** Encapsulates parameters for an SSL/TLS connection. The parameters
 *  are the list of ciphersuites to be accepted in an SSL/TLS handshake,
 *  the list of protocols to be allowed, the endpoint identification
 *  algorithm during SSL/TLS handshaking, the Server Name Indication (SNI),
 *  the algorithm constraints and whether SSL/TLS servers should request
 *  or require client authentication, etc.
 *  
 *  SSLParameters can be created via the constructors in this class.
 *  Objects can also be obtained using the getSSLParameters()
 *  methods in
 *  SSLSocket and
 *  SSLServerSocket and
 *  SSLEngine or the
 *  getDefaultSSLParameters() and
 *  getSupportedSSLParameters()
 *  methods in SSLContext.
 *  
 *  SSLParameters can be applied to a connection via the methods
 *  SSLSocket.setSSLParameters() and
 *  SSLServerSocket.setSSLParameters()
 *  and SSLEngine.setSSLParameters().
 */
class SSLParameters extends Object {

    /** Constructs SSLParameters. */
    @stub
    def this() = ???

    /** Constructs SSLParameters from the specified array of ciphersuites. */
    @stub
    def this(cipherSuites: Array[String]) = ???

    /** Returns the cryptographic algorithm constraints. */
    @stub
    def getAlgorithmConstraints(): AlgorithmConstraints = ???

    /** Returns a copy of the array of ciphersuites or null if none
     *  have been set.
     */
    @stub
    def getCipherSuites(): Array[String] = ???

    /** Gets the endpoint identification algorithm. */
    @stub
    def getEndpointIdentificationAlgorithm(): String = ???

    /** Returns whether client authentication should be required. */
    @stub
    def getNeedClientAuth(): Boolean = ???

    /** Returns a copy of the array of protocols or null if none
     *  have been set.
     */
    @stub
    def getProtocols(): Array[String] = ???

    /** Returns a List containing all SNIServerNames of the
     *  Server Name Indication (SNI) parameter, or null if none has been set.
     */
    @stub
    def getServerNames(): List[SNIServerName] = ???

    /** Returns a Collection containing all SNIMatchers of the
     *  Server Name Indication (SNI) parameter, or null if none has been set.
     */
    @stub
    def getSNIMatchers(): Collection[SNIMatcher] = ???

    /** Returns whether the local cipher suites preference should be honored. */
    @stub
    def getUseCipherSuitesOrder(): Boolean = ???

    /** Returns whether client authentication should be requested. */
    @stub
    def getWantClientAuth(): Boolean = ???

    /** Sets the cryptographic algorithm constraints, which will be used
     *  in addition to any configured by the runtime environment.
     */
    @stub
    def setAlgorithmConstraints(constraints: AlgorithmConstraints): Unit = ???

    /** Sets the array of ciphersuites. */
    @stub
    def setCipherSuites(cipherSuites: Array[String]): Unit = ???

    /** Sets the endpoint identification algorithm. */
    @stub
    def setEndpointIdentificationAlgorithm(algorithm: String): Unit = ???

    /** Sets whether client authentication should be required. */
    @stub
    def setNeedClientAuth(needClientAuth: Boolean): Unit = ???

    /** Sets the array of protocols. */
    @stub
    def setProtocols(protocols: Array[String]): Unit = ???

    /** Sets the desired SNIServerNames of the Server Name
     *  Indication (SNI) parameter.
     */
    @stub
    def setServerNames(serverNames: List[SNIServerName]): Unit = ???

    /** Sets the SNIMatchers of the Server Name Indication (SNI)
     *  parameter.
     */
    @stub
    def setSNIMatchers(matchers: Collection[SNIMatcher]): Unit = ???

    /** Sets whether the local cipher suites preference should be honored. */
    @stub
    def setUseCipherSuitesOrder(honorOrder: Boolean): Unit = ???
}
