package java.security

import java.lang.{Object, String}
import java.util.Set
import javax.crypto.SecretKey
import scala.scalanative.annotation.stub

/** A KeyStore entry that holds a SecretKey. */
final object KeyStore.SecretKeyEntry extends Object with KeyStore.Entry {

    /** Constructs a SecretKeyEntry with a
     *  SecretKey.
     */
    @stub
    def SecretKeyEntry(secretKey: SecretKey) = ???

    /** Constructs a SecretKeyEntry with a SecretKey and
     *  associated entry attributes.
     */
    @stub
    def SecretKeyEntry(secretKey: SecretKey, attributes: Set[KeyStore.Entry.Attribute]) = ???

    /** Retrieves the attributes associated with an entry. */
    @stub
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    /** Gets the SecretKey from this entry. */
    @stub
    def getSecretKey(): SecretKey = ???

    /** Returns a string representation of this SecretKeyEntry. */
    @stub
    def toString(): String = ???
}
