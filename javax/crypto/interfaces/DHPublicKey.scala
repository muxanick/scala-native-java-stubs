package javax.crypto.interfaces

import java.math.BigInteger
import java.security.PublicKey
import scala.scalanative.annotation.stub

/** The interface to a Diffie-Hellman public key. */
trait DHPublicKey extends DHKey with PublicKey {

    /** Returns the public value, y. */
    @stub
    def getY(): BigInteger = ???
}

object DHPublicKey {
    /** The class fingerprint that is set to indicate serialization
     *  compatibility since J2SE 1.4.
     */
    @stub
    val serialVersionUID: Long = ???
}
