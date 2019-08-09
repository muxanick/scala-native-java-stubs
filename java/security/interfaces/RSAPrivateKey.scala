package java.security.interfaces

import java.math.BigInteger
import java.security.PrivateKey
import scala.scalanative.annotation.stub

/** The interface to an RSA private key. */
trait RSAPrivateKey extends PrivateKey with RSAKey {

    /** Returns the private exponent. */
    @stub
    def getPrivateExponent(): BigInteger = ???
}

object RSAPrivateKey {
    /** The type fingerprint that is set to indicate
     *  serialization compatibility with a previous
     *  version of the type.
     */
    @stub
    val serialVersionUID: Long = ???
}
