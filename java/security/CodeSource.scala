package java.security

import java.io.Serializable
import java.lang.{Object, String}
import java.net.URL
import java.security.cert.Certificate
import scala.scalanative.annotation.stub

/** This class extends the concept of a codebase to
 *  encapsulate not only the location (URL) but also the certificate chains
 *  that were used to verify signed code originating from that location.
 */
class CodeSource extends Object with Serializable {

    /** Constructs a CodeSource and associates it with the specified
     *  location and set of certificates.
     */
    @stub
    def this(url: URL, certs: Array[Certificate]) = ???

    /** Constructs a CodeSource and associates it with the specified
     *  location and set of code signers.
     */
    @stub
    def this(url: URL, signers: Array[CodeSigner]) = ???

    /** Tests for equality between the specified object and this
     *  object.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the certificates associated with this CodeSource. */
    @stub
    def getCertificates(): Array[Certificate] = ???

    /** Returns the code signers associated with this CodeSource. */
    @stub
    def getCodeSigners(): Array[CodeSigner] = ???

    /** Returns the location associated with this CodeSource. */
    @stub
    def getLocation(): URL = ???

    /** Returns the hash code value for this object. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if this CodeSource object "implies" the specified CodeSource. */
    @stub
    def implies(codesource: CodeSource): Boolean = ???

    /** Returns a string describing this CodeSource, telling its
     *  URL and certificates.
     */
    @stub
    def toString(): String = ???
}
