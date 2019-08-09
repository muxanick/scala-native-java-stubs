package java.security.interfaces

import java.math.BigInteger
import java.security.PrivateKey
import scala.scalanative.annotation.stub

/** The standard interface to a DSA private key. DSA (Digital Signature
 *  Algorithm) is defined in NIST's FIPS-186.
 */
trait DSAPrivateKey extends DSAKey with PrivateKey {

    /** Returns the value of the private key, x. */
    @stub
    def getX(): BigInteger = ???
}

object DSAPrivateKey {
    /** The class fingerprint that is set to indicate
     *  serialization compatibility with a previous
     *  version of the class.
     */
    @stub
    val serialVersionUID: Long = ???
}
