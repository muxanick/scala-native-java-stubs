package javax.net.ssl

import java.lang.{Object, String}
import java.security.{KeyStore, Provider}
import scala.scalanative.annotation.stub

/** This class acts as a factory for trust managers based on a
 *  source of trust material. Each trust manager manages a specific
 *  type of trust material for use by secure sockets. The trust
 *  material is based on a KeyStore and/or provider specific sources.
 */
class TrustManagerFactory extends Object {

    /** Creates a TrustManagerFactory object. */
    @stub
    protected def this(factorySpi: TrustManagerFactorySpi, provider: Provider, algorithm: String) = ???

    /** Returns the algorithm name of this TrustManagerFactory
     *  object.
     */
    @stub
    def getAlgorithm(): String = ???

    /** Returns the provider of this TrustManagerFactory object. */
    @stub
    def getProvider(): Provider = ???

    /** Returns one trust manager for each type of trust material. */
    @stub
    def getTrustManagers(): Array[TrustManager] = ???

    /** Initializes this factory with a source of certificate
     *  authorities and related trust material.
     */
    @stub
    def init(ks: KeyStore): Unit = ???

    /** Initializes this factory with a source of provider-specific
     *  trust material.
     */
    @stub
    def init(spec: ManagerFactoryParameters): Unit = ???
}

object TrustManagerFactory {
    /** Obtains the default TrustManagerFactory algorithm name. */
    @stub
    def getDefaultAlgorithm(): String = ???

    /** Returns a TrustManagerFactory object that acts as a
     *  factory for trust managers.
     */
    @stub
    def getInstance(algorithm: String): TrustManagerFactory = ???

    /** Returns a TrustManagerFactory object that acts as a
     *  factory for trust managers.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): TrustManagerFactory = ???

    /** Returns a TrustManagerFactory object that acts as a
     *  factory for trust managers.
     */
    @stub
    def getInstance(algorithm: String, provider: String): TrustManagerFactory = ???
}
