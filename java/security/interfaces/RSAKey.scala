package java.security.interfaces

import java.math.BigInteger
import scala.scalanative.annotation.stub

/** The interface to an RSA public or private key. */
trait RSAKey {

    /** Returns the modulus. */
    @stub
    def getModulus(): BigInteger = ???
}
