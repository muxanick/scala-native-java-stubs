package javax.crypto.interfaces

import java.math.BigInteger
import java.security.PrivateKey
import scala.scalanative.annotation.stub

/** The interface to a Diffie-Hellman private key. */
trait DHPrivateKey extends DHKey with PrivateKey {

    /** Returns the private value, x. */
    @stub
    def getX(): BigInteger = ???
}

object DHPrivateKey {
    /** The class fingerprint that is set to indicate serialization
     *  compatibility since J2SE 1.4.
     */
    @stub
    val serialVersionUID: Long = ???
}
