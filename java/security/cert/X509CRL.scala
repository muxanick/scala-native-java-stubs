package java.security.cert

import java.lang.{Object, String}
import java.math.BigInteger
import java.security.{Principal, Provider, PublicKey}
import java.util.{Date, Set}
import javax.security.auth.x500.X500Principal

/** 
 *  Abstract class for an X.509 Certificate Revocation List (CRL).
 *  A CRL is a time-stamped list identifying revoked certificates.
 *  It is signed by a Certificate Authority (CA) and made freely
 *  available in a public repository.
 * 
 *  Each revoked certificate is
 *  identified in a CRL by its certificate serial number. When a
 *  certificate-using system uses a certificate (e.g., for verifying a
 *  remote user's digital signature), that system not only checks the
 *  certificate signature and validity but also acquires a suitably-
 *  recent CRL and checks that the certificate serial number is not on
 *  that CRL.  The meaning of "suitably-recent" may vary with local
 *  policy, but it usually means the most recently-issued CRL.  A CA
 *  issues a new CRL on a regular periodic basis (e.g., hourly, daily, or
 *  weekly).  Entries are added to CRLs as revocations occur, and an
 *  entry may be removed when the certificate expiration date is reached.
 *  
 *  The X.509 v2 CRL format is described below in ASN.1:
 *  
 *  CertificateList  ::=  SEQUENCE  {
 *      tbsCertList          TBSCertList,
 *      signatureAlgorithm   AlgorithmIdentifier,
 *      signature            BIT STRING  }
 *  
 *  
 *  More information can be found in
 *  RFC 3280: Internet X.509
 *  Public Key Infrastructure Certificate and CRL Profile.
 *  
 *  The ASN.1 definition of tbsCertList is:
 *  
 *  TBSCertList  ::=  SEQUENCE  {
 *      version                 Version OPTIONAL,
 *                              -- if present, must be v2
 *      signature               AlgorithmIdentifier,
 *      issuer                  Name,
 *      thisUpdate              ChoiceOfTime,
 *      nextUpdate              ChoiceOfTime OPTIONAL,
 *      revokedCertificates     SEQUENCE OF SEQUENCE  {
 *          userCertificate         CertificateSerialNumber,
 *          revocationDate          ChoiceOfTime,
 *          crlEntryExtensions      Extensions OPTIONAL
 *                                  -- if present, must be v2
 *          }  OPTIONAL,
 *      crlExtensions           [0]  EXPLICIT Extensions OPTIONAL
 *                                   -- if present, must be v2
 *      }
 *  
 *  
 *  CRLs are instantiated using a certificate factory. The following is an
 *  example of how to instantiate an X.509 CRL:
 *  
 *  try (InputStream inStream = new FileInputStream("fileName-of-crl")) {
 *      CertificateFactory cf = CertificateFactory.getInstance("X.509");
 *      X509CRL crl = (X509CRL)cf.generateCRL(inStream);
 *  }
 *  
 */
abstract class X509CRL extends CRL with X509Extension {

    /** Compares this CRL for equality with the given
     *  object.
     */
    def equals(other: Object): Boolean

    /** Returns the ASN.1 DER-encoded form of this CRL. */
    def getEncoded(): Array[Byte]

    /** Denigrated, replaced by getIssuerX500Principal(). */
    def getIssuerDN(): Principal

    /** Returns the issuer (issuer distinguished name) value from the
     *  CRL as an X500Principal.
     */
    def getIssuerX500Principal(): X500Principal

    /** Gets the nextUpdate date from the CRL. */
    def getNextUpdate(): Date

    /** Gets the CRL entry, if any, with the given certificate serialNumber. */
    def getRevokedCertificate(serialNumber: BigInteger): X509CRLEntry

    /** Get the CRL entry, if any, for the given certificate. */
    def getRevokedCertificate(certificate: X509Certificate): X509CRLEntry

    /** Gets all the entries from this CRL. */
    def getRevokedCertificates(): Set[_ <: X509CRLEntry]

    /** Gets the signature algorithm name for the CRL
     *  signature algorithm.
     */
    def getSigAlgName(): String

    /** Gets the signature algorithm OID string from the CRL. */
    def getSigAlgOID(): String

    /** Gets the DER-encoded signature algorithm parameters from this
     *  CRL's signature algorithm.
     */
    def getSigAlgParams(): Array[Byte]

    /** Gets the signature value (the raw signature bits) from
     *  the CRL.
     */
    def getSignature(): Array[Byte]

    /** Gets the DER-encoded CRL information, the
     *  tbsCertList from this CRL.
     */
    def getTBSCertList(): Array[Byte]

    /** Gets the thisUpdate date from the CRL. */
    def getThisUpdate(): Date

    /** Gets the version (version number) value from the CRL. */
    def getVersion(): Int

    /** Returns a hashcode value for this CRL from its
     *  encoded form.
     */
    def hashCode(): Int

    /** Verifies that this CRL was signed using the
     *  private key that corresponds to the given public key.
     */
    def verify(key: PublicKey): Unit

    /** Verifies that this CRL was signed using the
     *  private key that corresponds to the given public key.
     */
    def verify(key: PublicKey, sigProvider: Provider): Unit
}
