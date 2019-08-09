package java.security.interfaces

import java.math.BigInteger
import java.security.PublicKey
import scala.scalanative.annotation.stub

/** The interface to an RSA public key. */
trait RSAPublicKey extends PublicKey with RSAKey {

    /** Returns the public exponent. */
    @stub
    def getPublicExponent(): BigInteger = ???
}

object RSAPublicKey {
    /** The type fingerprint that is set to indicate
     *  serialization compatibility with a previous
     *  version of the type.
     */
    @stub
    val serialVersionUID: Long = ???
}
