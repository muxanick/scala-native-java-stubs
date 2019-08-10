package java.security.cert

import java.lang.{Object, String}
import java.math.BigInteger
import java.util.Date
import javax.security.auth.x500.X500Principal
import scala.scalanative.annotation.stub

/** Abstract class for a revoked certificate in a CRL (Certificate
 *  Revocation List).
 * 
 *  The ASN.1 definition for revokedCertificates is:
 *  
 *  revokedCertificates    SEQUENCE OF SEQUENCE  {
 *      userCertificate    CertificateSerialNumber,
 *      revocationDate     ChoiceOfTime,
 *      crlEntryExtensions Extensions OPTIONAL
 *                         -- if present, must be v2
 *  }  OPTIONAL
 * 
 *  CertificateSerialNumber  ::=  INTEGER
 * 
 *  Extensions  ::=  SEQUENCE SIZE (1..MAX) OF Extension
 * 
 *  Extension  ::=  SEQUENCE  {
 *      extnId        OBJECT IDENTIFIER,
 *      critical      BOOLEAN DEFAULT FALSE,
 *      extnValue     OCTET STRING
 *                    -- contains a DER encoding of a value
 *                    -- of the type registered for use with
 *                    -- the extnId object identifier value
 *  }
 *  
 */
abstract class X509CRLEntry extends Object with X509Extension {

    /**  */
    @stub
    def this() = ???

    /** Compares this CRL entry for equality with the given
     *  object.
     */
    def equals(other: Any): Boolean

    /** Get the issuer of the X509Certificate described by this entry. */
    def getCertificateIssuer(): X500Principal

    /** Returns the ASN.1 DER-encoded form of this CRL Entry,
     *  that is the inner SEQUENCE.
     */
    def getEncoded(): Array[Byte]

    /** Gets the revocation date from this X509CRLEntry,
     *  the revocationDate.
     */
    def getRevocationDate(): Date

    /** Returns the reason the certificate has been revoked, as specified
     *  in the Reason Code extension of this CRL entry.
     */
    def getRevocationReason(): CRLReason

    /** Gets the serial number from this X509CRLEntry,
     *  the userCertificate.
     */
    def getSerialNumber(): BigInteger

    /** Returns true if this CRL entry has extensions. */
    def hasExtensions(): Boolean

    /** Returns a hashcode value for this CRL entry from its
     *  encoded form.
     */
    def hashCode(): Int

    /** Returns a string representation of this CRL entry. */
    def toString(): String
}
