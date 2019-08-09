package java.security

import java.io.Serializable
import java.lang.Object
import java.security.cert.CertPath

// This class encapsulates information about a code signer.
// It is immutable.
final class CodeSigner extends Object with Serializable {

    @stub
    // Tests for equality between the specified object and this
    // code signer.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the signer's certificate path.
    def getSignerCertPath(): CertPath = ???

    @stub
    // Returns the signature timestamp.
    def getTimestamp(): Timestamp = ???

    @stub
    // Returns the hash code value for this code signer.
    def hashCode(): Int = ???
}
