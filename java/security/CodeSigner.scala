package java.security

import java.io.Serializable
import java.lang.Object
import java.security.cert.CertPath

/** This class encapsulates information about a code signer.
 *  It is immutable.
 */
final class CodeSigner extends Object with Serializable {

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
}
