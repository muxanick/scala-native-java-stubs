package java.security

import java.lang.Object
import java.security.cert.Certificate
import java.util.Set

/** A KeyStore entry that holds a trusted
 *  Certificate.
 */
final object KeyStore.TrustedCertificateEntry extends Object with KeyStore.Entry {

    /** Constructs a TrustedCertificateEntry with a
     *  trusted Certificate.
     */
    @stub
    def TrustedCertificateEntry(trustedCert: Certificate) = ???

    /** Retrieves the attributes associated with an entry. */
    @stub
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    /** Gets the trusted Certficate from this entry. */
    @stub
    def getTrustedCertificate(): Certificate = ???
}
