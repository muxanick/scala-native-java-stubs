package java.security

import java.io.File
import java.lang.{Object, String}

// A description of a to-be-instantiated KeyStore object.
//
// An instance of this class encapsulates the information needed to
// instantiate and initialize a KeyStore object. That process is
// triggered when the getKeyStore() method is called.
//
// This makes it possible to decouple configuration from KeyStore
// object creation and e.g. delay a password prompt until it is
// needed.
object abstract KeyStore.Builder extends Object {

    @stub
    // Returns the KeyStore described by this object.
    def getKeyStore(): KeyStore

    @stub
    // Returns the ProtectionParameters that should be used to obtain
    // the Entry with the given alias.
    def getProtectionParameter(alias: String): KeyStore.ProtectionParameter

    @stub
    // Returns a new Builder that encapsulates the given KeyStore.
    def newInstance(keyStore: KeyStore, protectionParameter: KeyStore.ProtectionParameter): KeyStore.Builder = ???

    @stub
    // Returns a new Builder object.
    def newInstance(type: String, provider: Provider, file: File, protection: KeyStore.ProtectionParameter): KeyStore.Builder = ???
}
