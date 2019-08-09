package java.security.cert

import java.lang.{Object, String}
import java.math.BigInteger
import java.security.PublicKey
import java.util.{Collection, Date, List, Set}
import javax.security.auth.x500.X500Principal

// A CertSelector that selects X509Certificates that
// match all specified criteria. This class is particularly useful when
// selecting certificates from a CertStore to build a
// PKIX-compliant certification path.
// 
// When first constructed, an X509CertSelector has no criteria
// enabled and each of the get methods return a default value
// (null, or -1 for the getBasicConstraints method). Therefore, the match
// method would return true for any X509Certificate.
// Typically, several criteria are enabled (by calling
// setIssuer or
// setKeyUsage, for instance) and then the
// X509CertSelector is passed to
// CertStore.getCertificates or some similar
// method.
// 
// Several criteria can be enabled (by calling setIssuer
// and setSerialNumber,
// for example) such that the match method
// usually uniquely matches a single X509Certificate. We say
// usually, since it is possible for two issuing CAs to have the same
// distinguished name and each issue a certificate with the same serial
// number. Other unique combinations include the issuer, subject,
// subjectKeyIdentifier and/or the subjectPublicKey criteria.
// 
// Please refer to RFC 3280:
// Internet X.509 Public Key Infrastructure Certificate and CRL Profile for
// definitions of the X.509 certificate extensions mentioned below.
// 
// Concurrent Access
// 
// Unless otherwise specified, the methods defined in this class are not
// thread-safe. Multiple threads that need to access a single
// object concurrently should synchronize amongst themselves and
// provide the necessary locking. Multiple threads each manipulating
// separate objects need not synchronize.
class X509CertSelector extends Object with CertSelector {

    @stub
    // Adds a name to the pathToNames criterion.
    def addPathToName(type: Int, name: Array[Byte]): Unit = ???

    @stub
    // Adds a name to the pathToNames criterion.
    def addPathToName(type: Int, name: String): Unit = ???

    @stub
    // Adds a name to the subjectAlternativeNames criterion.
    def addSubjectAlternativeName(type: Int, name: Array[Byte]): Unit = ???

    @stub
    // Adds a name to the subjectAlternativeNames criterion.
    def addSubjectAlternativeName(type: Int, name: String): Unit = ???

    @stub
    // Returns a copy of this object.
    def clone(): Object = ???

    @stub
    // Returns the authorityKeyIdentifier criterion.
    def getAuthorityKeyIdentifier(): Array[Byte] = ???

    @stub
    // Returns the basic constraints constraint.
    def getBasicConstraints(): Int = ???

    @stub
    // Returns the certificateEquals criterion.
    def getCertificate(): X509Certificate = ???

    @stub
    // Returns the certificateValid criterion.
    def getCertificateValid(): Date = ???

    @stub
    // Returns the extendedKeyUsage criterion.
    def getExtendedKeyUsage(): Set[String] = ???

    @stub
    // Returns the issuer criterion as an X500Principal.
    def getIssuer(): X500Principal = ???

    @stub
    // Returns the issuer criterion as a byte array.
    def getIssuerAsBytes(): Array[Byte] = ???

    @stub
    // Denigrated, use getIssuer() or
    // getIssuerAsBytes() instead.
    def getIssuerAsString(): String = ???

    @stub
    // Returns the keyUsage criterion.
    def getKeyUsage(): Array[Boolean] = ???

    @stub
    // Indicates if the X509Certificate must contain all
    // or at least one of the subjectAlternativeNames
    // specified in the setSubjectAlternativeNames or addSubjectAlternativeName methods.
    def getMatchAllSubjectAltNames(): Boolean = ???

    @stub
    // Returns the name constraints criterion.
    def getNameConstraints(): Array[Byte] = ???

    @stub
    // Returns a copy of the pathToNames criterion.
    def getPathToNames(): Collection[List[_]] = ???

    @stub
    // Returns the policy criterion.
    def getPolicy(): Set[String] = ???

    @stub
    // Returns the privateKeyValid criterion.
    def getPrivateKeyValid(): Date = ???

    @stub
    // Returns the serialNumber criterion.
    def getSerialNumber(): BigInteger = ???

    @stub
    // Returns the subject criterion as an X500Principal.
    def getSubject(): X500Principal = ???

    @stub
    // Returns a copy of the subjectAlternativeNames criterion.
    def getSubjectAlternativeNames(): Collection[List[_]] = ???

    @stub
    // Returns the subject criterion as a byte array.
    def getSubjectAsBytes(): Array[Byte] = ???

    @stub
    // Denigrated, use getSubject() or
    // getSubjectAsBytes() instead.
    def getSubjectAsString(): String = ???

    @stub
    // Returns the subjectKeyIdentifier criterion.
    def getSubjectKeyIdentifier(): Array[Byte] = ???

    @stub
    // Returns the subjectPublicKey criterion.
    def getSubjectPublicKey(): PublicKey = ???

    @stub
    // Returns the subjectPublicKeyAlgID criterion.
    def getSubjectPublicKeyAlgID(): String = ???

    @stub
    // Decides whether a Certificate should be selected.
    def match(cert: Certificate): Boolean = ???

    @stub
    // Sets the authorityKeyIdentifier criterion.
    def setAuthorityKeyIdentifier(authorityKeyID: Array[Byte]): Unit = ???

    @stub
    // Sets the basic constraints constraint.
    def setBasicConstraints(minMaxPathLen: Int): Unit = ???

    @stub
    // Sets the certificateEquals criterion.
    def setCertificate(cert: X509Certificate): Unit = ???

    @stub
    // Sets the certificateValid criterion.
    def setCertificateValid(certValid: Date): Unit = ???

    @stub
    // Sets the extendedKeyUsage criterion.
    def setExtendedKeyUsage(keyPurposeSet: Set[String]): Unit = ???

    @stub
    // Sets the issuer criterion.
    def setIssuer(issuerDN: Array[Byte]): Unit = ???

    @stub
    // Denigrated, use setIssuer(X500Principal)
    // or setIssuer(byte[]) instead.
    def setIssuer(issuerDN: String): Unit = ???

    @stub
    // Sets the issuer criterion.
    def setIssuer(issuer: X500Principal): Unit = ???

    @stub
    // Sets the keyUsage criterion.
    def setKeyUsage(keyUsage: Array[Boolean]): Unit = ???

    @stub
    // Enables/disables matching all of the subjectAlternativeNames
    // specified in the setSubjectAlternativeNames or addSubjectAlternativeName methods.
    def setMatchAllSubjectAltNames(matchAllNames: Boolean): Unit = ???

    @stub
    // Sets the name constraints criterion.
    def setNameConstraints(bytes: Array[Byte]): Unit = ???

    @stub
    // Sets the pathToNames criterion.
    def setPathToNames(names: Collection[List[_]]): Unit = ???

    @stub
    // Sets the policy constraint.
    def setPolicy(certPolicySet: Set[String]): Unit = ???

    @stub
    // Sets the privateKeyValid criterion.
    def setPrivateKeyValid(privateKeyValid: Date): Unit = ???

    @stub
    // Sets the serialNumber criterion.
    def setSerialNumber(serial: BigInteger): Unit = ???

    @stub
    // Sets the subject criterion.
    def setSubject(subjectDN: Array[Byte]): Unit = ???

    @stub
    // Denigrated, use setSubject(X500Principal)
    // or setSubject(byte[]) instead.
    def setSubject(subjectDN: String): Unit = ???

    @stub
    // Sets the subject criterion.
    def setSubject(subject: X500Principal): Unit = ???

    @stub
    // Sets the subjectAlternativeNames criterion.
    def setSubjectAlternativeNames(names: Collection[List[_]]): Unit = ???

    @stub
    // Sets the subjectKeyIdentifier criterion.
    def setSubjectKeyIdentifier(subjectKeyID: Array[Byte]): Unit = ???

    @stub
    // Sets the subjectPublicKey criterion.
    def setSubjectPublicKey(key: Array[Byte]): Unit = ???

    @stub
    // Sets the subjectPublicKey criterion.
    def setSubjectPublicKey(key: PublicKey): Unit = ???

    @stub
    // Sets the subjectPublicKeyAlgID criterion.
    def setSubjectPublicKeyAlgID(oid: String): Unit = ???
}
