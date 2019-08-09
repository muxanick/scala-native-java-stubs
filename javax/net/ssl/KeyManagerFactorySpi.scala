package javax.net.ssl

import java.lang.Object
import java.security.KeyStore
import scala.scalanative.annotation.stub

/** This class defines the Service Provider Interface (SPI)
 *  for the KeyManagerFactory class.
 * 
 *   All the abstract methods in this class must be implemented by each
 *  cryptographic service provider who wishes to supply the implementation
 *  of a particular key manager factory.
 */
abstract class KeyManagerFactorySpi extends Object {

    /**  */
    @stub
    def this() = ???

    /** Returns one key manager for each type of key material. */
    protected def engineGetKeyManagers(): Array[KeyManager]

    /** Initializes this factory with a source of key material. */
    protected def engineInit(ks: KeyStore, password: Array[Char]): Unit

    /** Initializes this factory with a source of key material. */
    protected def engineInit(spec: ManagerFactoryParameters): Unit
}
