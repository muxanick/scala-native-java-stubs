package javax.net.ssl

import java.lang.{Object, String}
import java.security.{KeyStore, Provider}

// This class acts as a factory for key managers based on a
// source of key material. Each key manager manages a specific
// type of key material for use by secure sockets. The key
// material is based on a KeyStore and/or provider specific sources.
class KeyManagerFactory extends Object {

    @stub
    // Returns the algorithm name of this KeyManagerFactory object.
    def getAlgorithm(): String = ???

    @stub
    // Returns one key manager for each type of key material.
    def getKeyManagers(): Array[KeyManager] = ???

    @stub
    // Returns the provider of this KeyManagerFactory object.
    def getProvider(): Provider = ???

    @stub
    // Initializes this factory with a source of key material.
    def init(ks: KeyStore, password: Array[Char]): Unit = ???
}

object KeyManagerFactory {
    @stub
    // Obtains the default KeyManagerFactory algorithm name.
    def getDefaultAlgorithm(): String = ???

    @stub
    // Returns a KeyManagerFactory object that acts as a
    // factory for key managers.
    def getInstance(algorithm: String): KeyManagerFactory = ???

    @stub
    // Returns a KeyManagerFactory object that acts as a
    // factory for key managers.
    def getInstance(algorithm: String, provider: Provider): KeyManagerFactory = ???

    @stub
    // Returns a KeyManagerFactory object that acts as a
    // factory for key managers.
    def getInstance(algorithm: String, provider: String): KeyManagerFactory = ???
}
