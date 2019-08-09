package java.security

import java.lang.Object
import java.security.cert.Certificate
import java.util.Set

/** A KeyStore entry that holds a PrivateKey
 *  and corresponding certificate chain.
 */
final object KeyStore.PrivateKeyEntry extends Object with KeyStore.Entry {

    /** Constructs a PrivateKeyEntry with a
     *  PrivateKey and corresponding certificate chain.
     */
    @stub
    def PrivateKeyEntry(privateKey: PrivateKey, chain: Array[Certificate]) = ???

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
}
