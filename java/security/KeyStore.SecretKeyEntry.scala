package java.security

import java.lang.Object
import java.util.Set
import javax.crypto.SecretKey

/** A KeyStore entry that holds a SecretKey. */
final object KeyStore.SecretKeyEntry extends Object with KeyStore.Entry {

    /** Constructs a SecretKeyEntry with a
     *  SecretKey.
     */
    @stub
    def SecretKeyEntry(secretKey: SecretKey) = ???

    /** Retrieves the attributes associated with an entry. */
    @stub
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    /** Gets the SecretKey from this entry. */
    @stub
    def getSecretKey(): SecretKey = ???
}
