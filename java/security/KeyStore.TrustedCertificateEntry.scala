package java.security

import java.lang.Object
import java.security.cert.Certificate
import java.util.Set

// A KeyStore entry that holds a trusted
// Certificate.
object final KeyStore.TrustedCertificateEntry extends Object with KeyStore.Entry {

    @stub
    // Constructs a TrustedCertificateEntry with a
    // trusted Certificate.
    def TrustedCertificateEntry(trustedCert: Certificate) = ???

    @stub
    // Retrieves the attributes associated with an entry.
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    @stub
    // Gets the trusted Certficate from this entry.
    def getTrustedCertificate(): Certificate = ???
}
