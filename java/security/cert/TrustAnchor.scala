package java.security.cert

import java.lang.{Object, String}
import java.security.PublicKey
import javax.security.auth.x500.X500Principal

// A trust anchor or most-trusted Certification Authority (CA).
// 
// This class represents a "most-trusted CA", which is used as a trust anchor
// for validating X.509 certification paths. A most-trusted CA includes the
// public key of the CA, the CA's name, and any constraints upon the set of
// paths which may be validated using this key. These parameters can be
// specified in the form of a trusted X509Certificate or as
// individual parameters.
// 
// Concurrent Access
// All TrustAnchor objects must be immutable and
// thread-safe. That is, multiple threads may concurrently invoke the
// methods defined in this class on a single TrustAnchor
// object (or more than one) with no ill effects. Requiring
// TrustAnchor objects to be immutable and thread-safe
// allows them to be passed around to various pieces of code without
// worrying about coordinating access. This stipulation applies to all
// public fields and methods of this class and any added or overridden
// by subclasses.
class TrustAnchor extends Object {

    @stub
    // Creates an instance of TrustAnchor where the
    // most-trusted CA is specified as a distinguished name and public key.
    def this(caName: String, pubKey: PublicKey, nameConstraints: Array[Byte]) = ???

    @stub
    // Creates an instance of TrustAnchor where the
    // most-trusted CA is specified as an X500Principal and public key.
    def this(caPrincipal: X500Principal, pubKey: PublicKey, nameConstraints: Array[Byte]) = ???

    @stub
    // Returns the name of the most-trusted CA as an X500Principal.
    def getCA(): X500Principal = ???

    @stub
    // Returns the name of the most-trusted CA in RFC 2253 String
    // format.
    def getCAName(): String = ???

    @stub
    // Returns the public key of the most-trusted CA.
    def getCAPublicKey(): PublicKey = ???

    @stub
    // Returns the name constraints parameter.
    def getNameConstraints(): Array[Byte] = ???

    @stub
    // Returns the most-trusted CA certificate.
    def getTrustedCert(): X509Certificate = ???
}
