package java.security.interfaces

import java.math.BigInteger
import java.security.PublicKey
import scala.scalanative.annotation.stub

/** The interface to a DSA public key. DSA (Digital Signature Algorithm)
 *  is defined in NIST's FIPS-186.
 */
trait DSAPublicKey extends DSAKey with PublicKey {

    /** Returns the value of the public key, y. */
    @stub
    def getY(): BigInteger = ???
}

object DSAPublicKey {
    /** The class fingerprint that is set to indicate
     *  serialization compatibility with a previous
     *  version of the class.
     */
    @stub
    val serialVersionUID: Long = ???
}
