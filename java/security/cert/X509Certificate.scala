package java.security.cert

import java.lang.{Object, String}
import java.math.BigInteger
import java.security.Principal
import java.util.{Collection, Date, List}
import javax.security.auth.x500.X500Principal

// 
// Abstract class for X.509 certificates. This provides a standard
// way to access all the attributes of an X.509 certificate.
// 
// In June of 1996, the basic X.509 v3 format was completed by
// ISO/IEC and ANSI X9, which is described below in ASN.1:
// 
// Certificate  ::=  SEQUENCE  {
//     tbsCertificate       TBSCertificate,
//     signatureAlgorithm   AlgorithmIdentifier,
//     signature            BIT STRING  }
// 
// 
// These certificates are widely used to support authentication and
// other functionality in Internet security systems. Common applications
// include Privacy Enhanced Mail (PEM), Transport Layer Security (SSL),
// code signing for trusted software distribution, and Secure Electronic
// Transactions (SET).
// 
// These certificates are managed and vouched for by Certificate
// Authorities (CAs). CAs are services which create certificates by
// placing data in the X.509 standard format and then digitally signing
// that data. CAs act as trusted third parties, making introductions
// between principals who have no direct knowledge of each other.
// CA certificates are either signed by themselves, or by some other
// CA such as a "root" CA.
// 
// More information can be found in
// RFC 3280: Internet X.509
// Public Key Infrastructure Certificate and CRL Profile.
// 
// The ASN.1 definition of tbsCertificate is:
// 
// TBSCertificate  ::=  SEQUENCE  {
//     version         [0]  EXPLICIT Version DEFAULT v1,
//     serialNumber         CertificateSerialNumber,
//     signature            AlgorithmIdentifier,
//     issuer               Name,
//     validity             Validity,
//     subject              Name,
//     subjectPublicKeyInfo SubjectPublicKeyInfo,
//     issuerUniqueID  [1]  IMPLICIT UniqueIdentifier OPTIONAL,
//                          -- If present, version must be v2 or v3
//     subjectUniqueID [2]  IMPLICIT UniqueIdentifier OPTIONAL,
//                          -- If present, version must be v2 or v3
//     extensions      [3]  EXPLICIT Extensions OPTIONAL
//                          -- If present, version must be v3
//     }
// 
// 
// Certificates are instantiated using a certificate factory. The following is
// an example of how to instantiate an X.509 certificate:
// 
// try (InputStream inStream = new FileInputStream("fileName-of-cert")) {
//     CertificateFactory cf = CertificateFactory.getInstance("X.509");
//     X509Certificate cert = (X509Certificate)cf.generateCertificate(inStream);
// }
// 
abstract class X509Certificate extends Certificate with X509Extension {

    // Checks that the certificate is currently valid.
    def checkValidity(): Unit

    // Checks that the given date is within the certificate's
    // validity period.
    def checkValidity(date: Date): Unit

    // Gets the certificate constraints path length from the
    // critical BasicConstraints extension, (OID = 2.5.29.19).
    def getBasicConstraints(): Int

    // Gets an unmodifiable list of Strings representing the OBJECT
    // IDENTIFIERs of the ExtKeyUsageSyntax field of the
    // extended key usage extension, (OID = 2.5.29.37).
    def getExtendedKeyUsage(): List[String]

    // Gets an immutable collection of issuer alternative names from the
    // IssuerAltName extension, (OID = 2.5.29.18).
    def getIssuerAlternativeNames(): Collection[List[_]]

    // Denigrated, replaced by getIssuerX500Principal().
    def getIssuerDN(): Principal

    // Gets the issuerUniqueID value from the certificate.
    def getIssuerUniqueID(): Array[Boolean]

    // Returns the issuer (issuer distinguished name) value from the
    // certificate as an X500Principal.
    def getIssuerX500Principal(): X500Principal

    // Gets a boolean array representing bits of
    // the KeyUsage extension, (OID = 2.5.29.15).
    def getKeyUsage(): Array[Boolean]

    // Gets the notAfter date from the validity period of
    // the certificate.
    def getNotAfter(): Date

    // Gets the notBefore date from the validity period of
    // the certificate.
    def getNotBefore(): Date

    // Gets the serialNumber value from the certificate.
    def getSerialNumber(): BigInteger

    // Gets the signature algorithm name for the certificate
    // signature algorithm.
    def getSigAlgName(): String

    // Gets the signature algorithm OID string from the certificate.
    def getSigAlgOID(): String

    // Gets the DER-encoded signature algorithm parameters from this
    // certificate's signature algorithm.
    def getSigAlgParams(): Array[Byte]

    // Gets the signature value (the raw signature bits) from
    // the certificate.
    def getSignature(): Array[Byte]

    // Gets an immutable collection of subject alternative names from the
    // SubjectAltName extension, (OID = 2.5.29.17).
    def getSubjectAlternativeNames(): Collection[List[_]]

    // Denigrated, replaced by getSubjectX500Principal().
    def getSubjectDN(): Principal

    // Gets the subjectUniqueID value from the certificate.
    def getSubjectUniqueID(): Array[Boolean]

    // Returns the subject (subject distinguished name) value from the
    // certificate as an X500Principal.
    def getSubjectX500Principal(): X500Principal

    // Gets the DER-encoded certificate information, the
    // tbsCertificate from this certificate.
    def getTBSCertificate(): Array[Byte]

    // Gets the version (version number) value from the
    // certificate.
    def getVersion(): Int
}
