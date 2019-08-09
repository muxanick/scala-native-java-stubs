package javax.security.cert

import java.io.InputStream
import java.lang.{Object, String}
import java.math.BigInteger
import java.security.Principal
import java.util.Date

/** Abstract class for X.509 v1 certificates. This provides a standard
 *  way to access all the version 1 attributes of an X.509 certificate.
 *  Attributes that are specific to X.509 v2 or v3 are not available
 *  through this interface. Future API evolution will provide full access to
 *  complete X.509 v3 attributes.
 *  
 *  The basic X.509 format was defined by
 *  ISO/IEC and ANSI X9 and is described below in ASN.1:
 *  
 *  Certificate  ::=  SEQUENCE  {
 *      tbsCertificate       TBSCertificate,
 *      signatureAlgorithm   AlgorithmIdentifier,
 *      signature            BIT STRING  }
 *  
 *  
 *  These certificates are widely used to support authentication and
 *  other functionality in Internet security systems. Common applications
 *  include Privacy Enhanced Mail (PEM), Transport Layer Security (SSL),
 *  code signing for trusted software distribution, and Secure Electronic
 *  Transactions (SET).
 *  
 *  These certificates are managed and vouched for by Certificate
 *  Authorities (CAs). CAs are services which create certificates by
 *  placing data in the X.509 standard format and then digitally signing
 *  that data. CAs act as trusted third parties, making introductions
 *  between principals who have no direct knowledge of each other.
 *  CA certificates are either signed by themselves, or by some other
 *  CA such as a "root" CA.
 *  
 *  The ASN.1 definition of tbsCertificate is:
 *  
 *  TBSCertificate  ::=  SEQUENCE  {
 *      version         [0]  EXPLICIT Version DEFAULT v1,
 *      serialNumber         CertificateSerialNumber,
 *      signature            AlgorithmIdentifier,
 *      issuer               Name,
 *      validity             Validity,
 *      subject              Name,
 *      subjectPublicKeyInfo SubjectPublicKeyInfo,
 *      }
 *  
 *  
 *  Here is sample code to instantiate an X.509 certificate:
 *  
 *  InputStream inStream = new FileInputStream("fileName-of-cert");
 *  X509Certificate cert = X509Certificate.getInstance(inStream);
 *  inStream.close();
 *  
 *  OR
 *  
 *  byte[] certData = <certificate read from a file, say>
 *  X509Certificate cert = X509Certificate.getInstance(certData);
 *  
 *  
 *  In either case, the code that instantiates an X.509 certificate
 *  consults the value of the cert.provider.x509v1 security property
 *  to locate the actual implementation or instantiates a default implementation.
 *  
 *  The cert.provider.x509v1 property is set to a default
 *  implementation for X.509 such as:
 *  
 *  cert.provider.x509v1=com.sun.security.cert.internal.x509.X509V1CertImpl
 *  
 *  
 *  The value of this cert.provider.x509v1 property has to be
 *  changed to instantiate another implementation. If this security
 *  property is not set, a default implementation will be used.
 *  Currently, due to possible security restrictions on access to
 *  Security properties, this value is looked up and cached at class
 *  initialization time and will fallback on a default implementation if
 *  the Security property is not accessible.
 * 
 *  Note: The classes in the package javax.security.cert
 *  exist for compatibility with earlier versions of the
 *  Java Secure Sockets Extension (JSSE). New applications should instead
 *  use the standard Java SE certificate classes located in
 *  java.security.cert.
 */
abstract class X509Certificate extends Certificate {

    /** Checks that the certificate is currently valid. */
    def checkValidity(): Unit

    /** Checks that the specified date is within the certificate's
     *  validity period.
     */
    def checkValidity(date: Date): Unit

    /** Gets the issuer (issuer distinguished name) value from
     *  the certificate.
     */
    def getIssuerDN(): Principal

    /** Gets the notAfter date from the validity period of
     *  the certificate.
     */
    def getNotAfter(): Date

    /** Gets the notBefore date from the validity period of
     *  the certificate.
     */
    def getNotBefore(): Date

    /** Gets the serialNumber value from the certificate. */
    def getSerialNumber(): BigInteger

    /** Gets the signature algorithm name for the certificate
     *  signature algorithm.
     */
    def getSigAlgName(): String

    /** Gets the signature algorithm OID string from the certificate. */
    def getSigAlgOID(): String

    /** Gets the DER-encoded signature algorithm parameters from this
     *  certificate's signature algorithm.
     */
    def getSigAlgParams(): Array[Byte]

    /** Gets the subject (subject distinguished name) value
     *  from the certificate.
     */
    def getSubjectDN(): Principal
}

object X509Certificate {
    /** Instantiates an X509Certificate object, and initializes it with
     *  the specified byte array.
     */
    @stub
    def getInstance(certData: Array[Byte]): X509Certificate = ???

    /** Instantiates an X509Certificate object, and initializes it with
     *  the data read from the input stream inStream.
     */
    @stub
    def getInstance(inStream: InputStream): X509Certificate = ???
}
