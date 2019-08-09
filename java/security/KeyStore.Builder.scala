package java.security

import java.io.File
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A description of a to-be-instantiated KeyStore object.
 * 
 *  An instance of this class encapsulates the information needed to
 *  instantiate and initialize a KeyStore object. That process is
 *  triggered when the getKeyStore() method is called.
 * 
 *  This makes it possible to decouple configuration from KeyStore
 *  object creation and e.g. delay a password prompt until it is
 *  needed.
 */
object abstract KeyStore.Builder extends Object {

    /** Construct a new Builder. */
    @stub
    protected def Builder() = ???

    /** Returns the KeyStore described by this object. */
    @stub
    def getKeyStore(): KeyStore

    /** Returns the ProtectionParameters that should be used to obtain
     *  the Entry with the given alias.
     */
    @stub
    def getProtectionParameter(alias: String): KeyStore.ProtectionParameter

    /** Returns a new Builder that encapsulates the given KeyStore. */
    @stub
    def newInstance(keyStore: KeyStore, protectionParameter: KeyStore.ProtectionParameter): KeyStore.Builder = ???

    /** Returns a new Builder object. */
    @stub
    def newInstance(type: String, provider: Provider, file: File, protection: KeyStore.ProtectionParameter): KeyStore.Builder = ???

    /** Returns a new Builder object. */
    @stub
    def newInstance(type: String, provider: Provider, protection: KeyStore.ProtectionParameter): KeyStore.Builder = ???
}
