package java.security.cert

import java.lang.{Object, String}
import java.math.BigInteger
import java.security.PublicKey
import java.util.{Collection, Date, List, Set}
import javax.security.auth.x500.X500Principal

/** A CertSelector that selects X509Certificates that
 *  match all specified criteria. This class is particularly useful when
 *  selecting certificates from a CertStore to build a
 *  PKIX-compliant certification path.
 *  
 *  When first constructed, an X509CertSelector has no criteria
 *  enabled and each of the get methods return a default value
 *  (null, or -1 for the getBasicConstraints method). Therefore, the match
 *  method would return true for any X509Certificate.
 *  Typically, several criteria are enabled (by calling
 *  setIssuer or
 *  setKeyUsage, for instance) and then the
 *  X509CertSelector is passed to
 *  CertStore.getCertificates or some similar
 *  method.
 *  
 *  Several criteria can be enabled (by calling setIssuer
 *  and setSerialNumber,
 *  for example) such that the match method
 *  usually uniquely matches a single X509Certificate. We say
 *  usually, since it is possible for two issuing CAs to have the same
 *  distinguished name and each issue a certificate with the same serial
 *  number. Other unique combinations include the issuer, subject,
 *  subjectKeyIdentifier and/or the subjectPublicKey criteria.
 *  
 *  Please refer to RFC 3280:
 *  Internet X.509 Public Key Infrastructure Certificate and CRL Profile for
 *  definitions of the X.509 certificate extensions mentioned below.
 *  
 *  Concurrent Access
 *  
 *  Unless otherwise specified, the methods defined in this class are not
 *  thread-safe. Multiple threads that need to access a single
 *  object concurrently should synchronize amongst themselves and
 *  provide the necessary locking. Multiple threads each manipulating
 *  separate objects need not synchronize.
 */
class X509CertSelector extends Object with CertSelector {

    /** Adds a name to the pathToNames criterion. */
    @stub
    def addPathToName(type: Int, name: Array[Byte]): Unit = ???

    /** Adds a name to the pathToNames criterion. */
    @stub
    def addPathToName(type: Int, name: String): Unit = ???

    /** Adds a name to the subjectAlternativeNames criterion. */
    @stub
    def addSubjectAlternativeName(type: Int, name: Array[Byte]): Unit = ???

    /** Adds a name to the subjectAlternativeNames criterion. */
    @stub
    def addSubjectAlternativeName(type: Int, name: String): Unit = ???

    /** Returns a copy of this object. */
    @stub
    def clone(): Object = ???

    /** Returns the authorityKeyIdentifier criterion. */
    @stub
    def getAuthorityKeyIdentifier(): Array[Byte] = ???

    /** Returns the basic constraints constraint. */
    @stub
    def getBasicConstraints(): Int = ???

    /** Returns the certificateEquals criterion. */
    @stub
    def getCertificate(): X509Certificate = ???

    /** Returns the certificateValid criterion. */
    @stub
    def getCertificateValid(): Date = ???

    /** Returns the extendedKeyUsage criterion. */
    @stub
    def getExtendedKeyUsage(): Set[String] = ???

    /** Returns the issuer criterion as an X500Principal. */
    @stub
    def getIssuer(): X500Principal = ???

    /** Returns the issuer criterion as a byte array. */
    @stub
    def getIssuerAsBytes(): Array[Byte] = ???

    /** Denigrated, use getIssuer() or
     *  getIssuerAsBytes() instead.
     */
    @stub
    def getIssuerAsString(): String = ???

    /** Returns the keyUsage criterion. */
    @stub
    def getKeyUsage(): Array[Boolean] = ???

    /** Indicates if the X509Certificate must contain all
     *  or at least one of the subjectAlternativeNames
     *  specified in the setSubjectAlternativeNames or addSubjectAlternativeName methods.
     */
    @stub
    def getMatchAllSubjectAltNames(): Boolean = ???

    /** Returns the name constraints criterion. */
    @stub
    def getNameConstraints(): Array[Byte] = ???

    /** Returns a copy of the pathToNames criterion. */
    @stub
    def getPathToNames(): Collection[List[_]] = ???

    /** Returns the policy criterion. */
    @stub
    def getPolicy(): Set[String] = ???

    /** Returns the privateKeyValid criterion. */
    @stub
    def getPrivateKeyValid(): Date = ???

    /** Returns the serialNumber criterion. */
    @stub
    def getSerialNumber(): BigInteger = ???

    /** Returns the subject criterion as an X500Principal. */
    @stub
    def getSubject(): X500Principal = ???

    /** Returns a copy of the subjectAlternativeNames criterion. */
    @stub
    def getSubjectAlternativeNames(): Collection[List[_]] = ???

    /** Returns the subject criterion as a byte array. */
    @stub
    def getSubjectAsBytes(): Array[Byte] = ???

    /** Denigrated, use getSubject() or
     *  getSubjectAsBytes() instead.
     */
    @stub
    def getSubjectAsString(): String = ???

    /** Returns the subjectKeyIdentifier criterion. */
    @stub
    def getSubjectKeyIdentifier(): Array[Byte] = ???

    /** Returns the subjectPublicKey criterion. */
    @stub
    def getSubjectPublicKey(): PublicKey = ???

    /** Returns the subjectPublicKeyAlgID criterion. */
    @stub
    def getSubjectPublicKeyAlgID(): String = ???

    /** Decides whether a Certificate should be selected. */
    @stub
    def match(cert: Certificate): Boolean = ???

    /** Sets the authorityKeyIdentifier criterion. */
    @stub
    def setAuthorityKeyIdentifier(authorityKeyID: Array[Byte]): Unit = ???

    /** Sets the basic constraints constraint. */
    @stub
    def setBasicConstraints(minMaxPathLen: Int): Unit = ???

    /** Sets the certificateEquals criterion. */
    @stub
    def setCertificate(cert: X509Certificate): Unit = ???

    /** Sets the certificateValid criterion. */
    @stub
    def setCertificateValid(certValid: Date): Unit = ???

    /** Sets the extendedKeyUsage criterion. */
    @stub
    def setExtendedKeyUsage(keyPurposeSet: Set[String]): Unit = ???

    /** Sets the issuer criterion. */
    @stub
    def setIssuer(issuerDN: Array[Byte]): Unit = ???

    /** Denigrated, use setIssuer(X500Principal)
     *  or setIssuer(byte[]) instead.
     */
    @stub
    def setIssuer(issuerDN: String): Unit = ???

    /** Sets the issuer criterion. */
    @stub
    def setIssuer(issuer: X500Principal): Unit = ???

    /** Sets the keyUsage criterion. */
    @stub
    def setKeyUsage(keyUsage: Array[Boolean]): Unit = ???

    /** Enables/disables matching all of the subjectAlternativeNames
     *  specified in the setSubjectAlternativeNames or addSubjectAlternativeName methods.
     */
    @stub
    def setMatchAllSubjectAltNames(matchAllNames: Boolean): Unit = ???

    /** Sets the name constraints criterion. */
    @stub
    def setNameConstraints(bytes: Array[Byte]): Unit = ???

    /** Sets the pathToNames criterion. */
    @stub
    def setPathToNames(names: Collection[List[_]]): Unit = ???

    /** Sets the policy constraint. */
    @stub
    def setPolicy(certPolicySet: Set[String]): Unit = ???

    /** Sets the privateKeyValid criterion. */
    @stub
    def setPrivateKeyValid(privateKeyValid: Date): Unit = ???

    /** Sets the serialNumber criterion. */
    @stub
    def setSerialNumber(serial: BigInteger): Unit = ???

    /** Sets the subject criterion. */
    @stub
    def setSubject(subjectDN: Array[Byte]): Unit = ???

    /** Denigrated, use setSubject(X500Principal)
     *  or setSubject(byte[]) instead.
     */
    @stub
    def setSubject(subjectDN: String): Unit = ???

    /** Sets the subject criterion. */
    @stub
    def setSubject(subject: X500Principal): Unit = ???

    /** Sets the subjectAlternativeNames criterion. */
    @stub
    def setSubjectAlternativeNames(names: Collection[List[_]]): Unit = ???

    /** Sets the subjectKeyIdentifier criterion. */
    @stub
    def setSubjectKeyIdentifier(subjectKeyID: Array[Byte]): Unit = ???

    /** Sets the subjectPublicKey criterion. */
    @stub
    def setSubjectPublicKey(key: Array[Byte]): Unit = ???

    /** Sets the subjectPublicKey criterion. */
    @stub
    def setSubjectPublicKey(key: PublicKey): Unit = ???

    /** Sets the subjectPublicKeyAlgID criterion. */
    @stub
    def setSubjectPublicKeyAlgID(oid: String): Unit = ???
}
