package javax.net.ssl

import java.lang.Object
import java.security.KeyStore

/** This class defines the Service Provider Interface (SPI)
 *  for the TrustManagerFactory class.
 * 
 *   All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a particular trust manager factory.
 */
abstract class TrustManagerFactorySpi extends Object {

    /** Returns one trust manager for each type of trust material. */
    protected def engineGetTrustManagers(): Array[TrustManager]

    /** Initializes this factory with a source of certificate
     *  authorities and related trust material.
     */
    protected def engineInit(ks: KeyStore): Unit
}
