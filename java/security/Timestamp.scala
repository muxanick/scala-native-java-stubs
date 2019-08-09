package java.security

import java.io.Serializable
import java.lang.Object
import java.security.cert.CertPath
import java.util.Date

/** This class encapsulates information about a signed timestamp.
 *  It is immutable.
 *  It includes the timestamp's date and time as well as information about the
 *  Timestamping Authority (TSA) which generated and signed the timestamp.
 */
final class Timestamp extends Object with Serializable {

    /** Tests for equality between the specified object and this
     *  timestamp.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the certificate path for the Timestamping Authority. */
    @stub
    def getSignerCertPath(): CertPath = ???

    /** Returns the date and time when the timestamp was generated. */
    @stub
    def getTimestamp(): Date = ???

    /** Returns the hash code value for this timestamp. */
    @stub
    def hashCode(): Int = ???
}
