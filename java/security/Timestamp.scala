package java.security

import java.io.Serializable
import java.lang.Object
import java.security.cert.CertPath
import java.util.Date

// This class encapsulates information about a signed timestamp.
// It is immutable.
// It includes the timestamp's date and time as well as information about the
// Timestamping Authority (TSA) which generated and signed the timestamp.
final class Timestamp extends Object with Serializable {

    @stub
    // Tests for equality between the specified object and this
    // timestamp.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the certificate path for the Timestamping Authority.
    def getSignerCertPath(): CertPath = ???

    @stub
    // Returns the date and time when the timestamp was generated.
    def getTimestamp(): Date = ???

    @stub
    // Returns the hash code value for this timestamp.
    def hashCode(): Int = ???
}
