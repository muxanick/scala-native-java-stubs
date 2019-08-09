package java.security

import java.lang.Object
import java.security.cert.Certificate
import java.util.Set

// A KeyStore entry that holds a PrivateKey
// and corresponding certificate chain.
object final KeyStore.PrivateKeyEntry extends Object with KeyStore.Entry {

    @stub
    // Constructs a PrivateKeyEntry with a
    // PrivateKey and corresponding certificate chain.
    def PrivateKeyEntry(privateKey: PrivateKey, chain: Array[Certificate]) = ???

    @stub
    // Retrieves the attributes associated with an entry.
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    @stub
    // Gets the end entity Certificate
    // from the certificate chain in this entry.
    def getCertificate(): Certificate = ???

    @stub
    // Gets the Certificate chain from this entry.
    def getCertificateChain(): Array[Certificate] = ???

    @stub
    // Gets the PrivateKey from this entry.
    def getPrivateKey(): PrivateKey = ???
}
