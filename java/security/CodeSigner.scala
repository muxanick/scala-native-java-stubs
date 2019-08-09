package java.security

import java.io.Serializable
import java.lang.{Object, String}
import java.security.cert.CertPath
import scala.scalanative.annotation.stub

/** This class encapsulates information about a code signer.
 *  It is immutable.
 */
final class CodeSigner extends Object with Serializable {

    /** Constructs a CodeSigner object. */
    @stub
    def this(signerCertPath: CertPath, timestamp: Timestamp) = ???

    /** Tests for equality between the specified object and this
     *  code signer.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the signer's certificate path. */
    @stub
    def getSignerCertPath(): CertPath = ???

    /** Returns the signature timestamp. */
    @stub
    def getTimestamp(): Timestamp = ???

    /** Returns the hash code value for this code signer. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string describing this code signer. */
    @stub
    def toString(): String = ???
}
