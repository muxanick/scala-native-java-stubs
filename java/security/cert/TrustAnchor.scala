package java.security.cert

import java.lang.{Object, String}
import java.security.PublicKey
import javax.security.auth.x500.X500Principal
import scala.scalanative.annotation.stub

/** A trust anchor or most-trusted Certification Authority (CA).
 *  
 *  This class represents a "most-trusted CA", which is used as a trust anchor
 *  for validating X.509 certification paths. A most-trusted CA includes the
 *  public key of the CA, the CA's name, and any constraints upon the set of
 *  paths which may be validated using this key. These parameters can be
 *  specified in the form of a trusted X509Certificate or as
 *  individual parameters.
 *  
 *  Concurrent Access
 *  All TrustAnchor objects must be immutable and
 *  thread-safe. That is, multiple threads may concurrently invoke the
 *  methods defined in this class on a single TrustAnchor
 *  object (or more than one) with no ill effects. Requiring
 *  TrustAnchor objects to be immutable and thread-safe
 *  allows them to be passed around to various pieces of code without
 *  worrying about coordinating access. This stipulation applies to all
 *  public fields and methods of this class and any added or overridden
 *  by subclasses.
 */
class TrustAnchor extends Object {

    /** Creates an instance of TrustAnchor where the
     *  most-trusted CA is specified as a distinguished name and public key.
     */
    @stub
    def this(caName: String, pubKey: PublicKey, nameConstraints: Array[Byte]) = ???

    /** Creates an instance of TrustAnchor where the
     *  most-trusted CA is specified as an X500Principal and public key.
     */
    @stub
    def this(caPrincipal: X500Principal, pubKey: PublicKey, nameConstraints: Array[Byte]) = ???

    /** Creates an instance of TrustAnchor with the specified
     *  X509Certificate and optional name constraints, which
     *  are intended to be used as additional constraints when validating
     *  an X.509 certification path.
     */
    @stub
    def this(trustedCert: X509Certificate, nameConstraints: Array[Byte]) = ???

    /** Returns the name of the most-trusted CA as an X500Principal. */
    @stub
    def getCA(): X500Principal = ???

    /** Returns the name of the most-trusted CA in RFC 2253 String
     *  format.
     */
    @stub
    def getCAName(): String = ???

    /** Returns the public key of the most-trusted CA. */
    @stub
    def getCAPublicKey(): PublicKey = ???

    /** Returns the name constraints parameter. */
    @stub
    def getNameConstraints(): Array[Byte] = ???

    /** Returns the most-trusted CA certificate. */
    @stub
    def getTrustedCert(): X509Certificate = ???

    /** Returns a formatted string describing the TrustAnchor. */
    @stub
    def toString(): String = ???
}
