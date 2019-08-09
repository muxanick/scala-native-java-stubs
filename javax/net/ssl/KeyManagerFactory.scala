package javax.net.ssl

import java.lang.{Object, String}
import java.security.{KeyStore, Provider}

/** This class acts as a factory for key managers based on a
 *  source of key material. Each key manager manages a specific
 *  type of key material for use by secure sockets. The key
 *  material is based on a KeyStore and/or provider specific sources.
 */
class KeyManagerFactory extends Object {

    /** Returns the algorithm name of this KeyManagerFactory object. */
    @stub
    def getAlgorithm(): String = ???

    /** Returns one key manager for each type of key material. */
    @stub
    def getKeyManagers(): Array[KeyManager] = ???

    /** Returns the provider of this KeyManagerFactory object. */
    @stub
    def getProvider(): Provider = ???

    /** Initializes this factory with a source of key material. */
    @stub
    def init(ks: KeyStore, password: Array[Char]): Unit = ???
}

object KeyManagerFactory {
    /** Obtains the default KeyManagerFactory algorithm name. */
    @stub
    def getDefaultAlgorithm(): String = ???

    /** Returns a KeyManagerFactory object that acts as a
     *  factory for key managers.
     */
    @stub
    def getInstance(algorithm: String): KeyManagerFactory = ???

    /** Returns a KeyManagerFactory object that acts as a
     *  factory for key managers.
     */
    @stub
    def getInstance(algorithm: String, provider: Provider): KeyManagerFactory = ???

    /** Returns a KeyManagerFactory object that acts as a
     *  factory for key managers.
     */
    @stub
    def getInstance(algorithm: String, provider: String): KeyManagerFactory = ???
}
