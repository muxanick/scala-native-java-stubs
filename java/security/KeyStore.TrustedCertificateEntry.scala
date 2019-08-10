package java.security

import java.lang.{Object, String}
import java.security.cert.Certificate
import java.util.Set
import scala.scalanative.annotation.stub

/** A KeyStore entry that holds a trusted
 *  Certificate.
 */
final object KeyStore_TrustedCertificateEntry extends Object with KeyStore.Entry {

    /** Constructs a TrustedCertificateEntry with a
     *  trusted Certificate.
     */
    @stub
    def TrustedCertificateEntry(trustedCert: Certificate) = ???

    /** Constructs a TrustedCertificateEntry with a
     *  trusted Certificate and associated entry attributes.
     */
    @stub
    def TrustedCertificateEntry(trustedCert: Certificate, attributes: Set[KeyStore.Entry.Attribute]) = ???

    /** Retrieves the attributes associated with an entry. */
    @stub
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???

    /** Gets the trusted Certficate from this entry. */
    @stub
    def getTrustedCertificate(): Certificate = ???

    /** Returns a string representation of this TrustedCertificateEntry. */
    @stub
    def toString(): String = ???
}
