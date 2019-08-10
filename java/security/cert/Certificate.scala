package java.security.cert

import java.io.Serializable
import java.lang.{Object, String}
import java.security.{Provider, PublicKey}
import scala.scalanative.annotation.stub

/** Abstract class for managing a variety of identity certificates.
 *  An identity certificate is a binding of a principal to a public key which
 *  is vouched for by another principal.  (A principal represents
 *  an entity such as an individual user, a group, or a corporation.)
 * 
 *  This class is an abstraction for certificates that have different
 *  formats but important common uses.  For example, different types of
 *  certificates, such as X.509 and PGP, share general certificate
 *  functionality (like encoding and verifying) and
 *  some types of information (like a public key).
 *  
 *  X.509, PGP, and SDSI certificates can all be implemented by
 *  subclassing the Certificate class, even though they contain different
 *  sets of information, and they store and retrieve the information in
 *  different ways.
 */
abstract class Certificate extends Object with Serializable {

    /** Creates a certificate of the specified type. */
    @stub
    protected def this(type: String) = ???

    /** Compares this certificate for equality with the specified
     *  object.
     */
    def equals(other: Any): Boolean

    /** Returns the encoded form of this certificate. */
    def getEncoded(): Array[Byte]

    /** Gets the public key from this certificate. */
    def getPublicKey(): PublicKey

    /** Returns the type of this certificate. */
    def getType(): String

    /** Returns a hashcode value for this certificate from its
     *  encoded form.
     */
    def hashCode(): Int

    /** Returns a string representation of this certificate. */
    def toString(): String

    /** Verifies that this certificate was signed using the
     *  private key that corresponds to the specified public key.
     */
    def verify(key: PublicKey): Unit

    /** Verifies that this certificate was signed using the
     *  private key that corresponds to the specified public key.
     */
    def verify(key: PublicKey, sigProvider: Provider): Unit

    /** Verifies that this certificate was signed using the
     *  private key that corresponds to the specified public key.
     */
    def verify(key: PublicKey, sigProvider: String): Unit

    /** Replace the Certificate to be serialized. */
    protected def writeReplace(): Any
}

object Certificate {
    /** Alternate Certificate class for serialization. */
    protected object CertificateRep extends Object with Serializable {

        /** Construct the alternate Certificate class with the Certificate
         *  type and Certificate encoding bytes.
         */
        @stub
        protected def apply(type: String, data: Array[Byte]) = ???

        /** Resolve the Certificate Object. */
        @stub
        protected def readResolve(): Any = ???
    }

}
