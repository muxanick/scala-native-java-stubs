package javax.net.ssl

import java.lang.{Object, String}
import java.security.{KeyStore, Provider}

// This class acts as a factory for trust managers based on a
// source of trust material. Each trust manager manages a specific
// type of trust material for use by secure sockets. The trust
// material is based on a KeyStore and/or provider specific sources.
class TrustManagerFactory extends Object {

    @stub
    // Returns the algorithm name of this TrustManagerFactory
    // object.
    def getAlgorithm(): String = ???

    @stub
    // Returns the provider of this TrustManagerFactory object.
    def getProvider(): Provider = ???

    @stub
    // Returns one trust manager for each type of trust material.
    def getTrustManagers(): Array[TrustManager] = ???

    @stub
    // Initializes this factory with a source of certificate
    // authorities and related trust material.
    def init(ks: KeyStore): Unit = ???
}

object TrustManagerFactory {
    @stub
    // Obtains the default TrustManagerFactory algorithm name.
    def getDefaultAlgorithm(): String = ???

    @stub
    // Returns a TrustManagerFactory object that acts as a
    // factory for trust managers.
    def getInstance(algorithm: String): TrustManagerFactory = ???

    @stub
    // Returns a TrustManagerFactory object that acts as a
    // factory for trust managers.
    def getInstance(algorithm: String, provider: Provider): TrustManagerFactory = ???

    @stub
    // Returns a TrustManagerFactory object that acts as a
    // factory for trust managers.
    def getInstance(algorithm: String, provider: String): TrustManagerFactory = ???
}
