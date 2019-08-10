package java.security

import java.lang.{Object, String}
import java.security.cert.Certificate
import java.util.Set
import scala.scalanative.annotation.stub

/** A KeyStore entry that holds a PrivateKey
 *  and corresponding certificate chain.
 */
final object KeyStore_PrivateKeyEntry extends Object with KeyStore.Entry {

    /** Constructs a PrivateKeyEntry with a
     *  PrivateKey and corresponding certificate chain.
     */
    @stub
    def PrivateKeyEntry(privateKey: PrivateKey, chain: Array[Certificate]) = ???

    /** Constructs a PrivateKeyEntry with a PrivateKey and
     *  corresponding certificate chain and associated entry attributes.
     */
    @stub
    def PrivateKeyEntry(privateKey: PrivateKey, chain: Array[Certificate], attributes: Set[KeyStore.Entry.Attribute]) = ???

    /** Retrieves the attributes associated with an entry. */
    @stub
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    /** Gets the end entity Certificate
     *  from the certificate chain in this entry.
     */
    @stub
    def getCertificate(): Certificate = ???

    /** Gets the Certificate chain from this entry. */
    @stub
    def getCertificateChain(): Array[Certificate] = ???

    /** Gets the PrivateKey from this entry. */
    @stub
    def getPrivateKey(): PrivateKey = ???

    /** Returns a string representation of this PrivateKeyEntry. */
    @stub
    def toString(): String = ???
}
