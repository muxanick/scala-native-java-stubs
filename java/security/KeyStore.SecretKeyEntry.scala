package java.security

import java.lang.Object
import java.util.Set
import javax.crypto.SecretKey

// A KeyStore entry that holds a SecretKey.
object final KeyStore.SecretKeyEntry extends Object with KeyStore.Entry {

    @stub
    // Constructs a SecretKeyEntry with a
    // SecretKey.
    def SecretKeyEntry(secretKey: SecretKey) = ???

    @stub
    // Retrieves the attributes associated with an entry.
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    @stub
    // Gets the SecretKey from this entry.
    def getSecretKey(): SecretKey = ???
}
