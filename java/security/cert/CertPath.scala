package java.security.cert

import java.io.Serializable
import java.lang.{Object, String}
import java.util.{Iterator, List}
import scala.scalanative.annotation.stub

/** An immutable sequence of certificates (a certification path).
 *  
 *  This is an abstract class that defines the methods common to all
 *  CertPaths. Subclasses can handle different kinds of
 *  certificates (X.509, PGP, etc.).
 *  
 *  All CertPath objects have a type, a list of
 *  Certificates, and one or more supported encodings. Because the
 *  CertPath class is immutable, a CertPath cannot
 *  change in any externally visible way after being constructed. This
 *  stipulation applies to all public fields and methods of this class and any
 *  added or overridden by subclasses.
 *  
 *  The type is a String that identifies the type of
 *  Certificates in the certification path. For each
 *  certificate cert in a certification path certPath,
 *  cert.getType().equals(certPath.getType()) must be
 *  true.
 *  
 *  The list of Certificates is an ordered List of
 *  zero or more Certificates. This List and all
 *  of the Certificates contained in it must be immutable.
 *  
 *  Each CertPath object must support one or more encodings
 *  so that the object can be translated into a byte array for storage or
 *  transmission to other parties. Preferably, these encodings should be
 *  well-documented standards (such as PKCS#7). One of the encodings supported
 *  by a CertPath is considered the default encoding. This
 *  encoding is used if no encoding is explicitly requested (for the
 *  getEncoded() method, for instance).
 *  
 *  All CertPath objects are also Serializable.
 *  CertPath objects are resolved into an alternate
 *  CertPathRep object during serialization. This allows
 *  a CertPath object to be serialized into an equivalent
 *  representation regardless of its underlying implementation.
 *  
 *  CertPath objects can be created with a
 *  CertificateFactory or they can be returned by other classes,
 *  such as a CertPathBuilder.
 *  
 *  By convention, X.509 CertPaths (consisting of
 *  X509Certificates), are ordered starting with the target
 *  certificate and ending with a certificate issued by the trust anchor. That
 *  is, the issuer of one certificate is the subject of the following one. The
 *  certificate representing the TrustAnchor should not be
 *  included in the certification path. Unvalidated X.509 CertPaths
 *  may not follow these conventions. PKIX CertPathValidators will
 *  detect any departure from these conventions that cause the certification
 *  path to be invalid and throw a CertPathValidatorException.
 * 
 *   Every implementation of the Java platform is required to support the
 *  following standard CertPath encodings:
 *  
 *  PKCS7
 *  PkiPath
 *  
 *  These encodings are described in the 
 *  CertPath Encodings section of the
 *  Java Cryptography Architecture Standard Algorithm Name Documentation.
 *  Consult the release documentation for your implementation to see if any
 *  other encodings are supported.
 *  
 *  Concurrent Access
 *  
 *  All CertPath objects must be thread-safe. That is, multiple
 *  threads may concurrently invoke the methods defined in this class on a
 *  single CertPath object (or more than one) with no
 *  ill effects. This is also true for the List returned by
 *  CertPath.getCertificates.
 *  
 *  Requiring CertPath objects to be immutable and thread-safe
 *  allows them to be passed around to various pieces of code without worrying
 *  about coordinating access.  Providing this thread-safety is
 *  generally not difficult, since the CertPath and
 *  List objects in question are immutable.
 */
abstract class CertPath extends Object with Serializable {

    /** Creates a CertPath of the specified type. */
    @stub
    protected def this(type: String) = ???

    /** Compares this certification path for equality with the specified
     *  object.
     */
    def equals(other: Any): Boolean

    /** Returns the list of certificates in this certification path. */
    def getCertificates(): List[_ <: Certificate]

    /** Returns the encoded form of this certification path, using the default
     *  encoding.
     */
    def getEncoded(): Array[Byte]

    /** Returns the encoded form of this certification path, using the
     *  specified encoding.
     */
    def getEncoded(encoding: String): Array[Byte]

    /** Returns an iteration of the encodings supported by this certification
     *  path, with the default encoding first.
     */
    def getEncodings(): Iterator[String]

    /** Returns the type of Certificates in this certification
     *  path.
     */
    def getType(): String

    /** Returns the hashcode for this certification path. */
    def hashCode(): Int

    /** Returns a string representation of this certification path. */
    def toString(): String

    /** Replaces the CertPath to be serialized with a
     *  CertPathRep object.
     */
    protected def writeReplace(): Any
}

object CertPath {
    /** Alternate CertPath class for serialization. */
    protected object CertPathRep extends Object with Serializable {

        /** Creates a CertPathRep with the specified
         *  type and encoded form of a certification path.
         */
        @stub
        protected def apply(type: String, data: Array[Byte]) = ???

        /** Returns a CertPath constructed from the type and data. */
        @stub
        protected def readResolve(): Any = ???
    }

}
