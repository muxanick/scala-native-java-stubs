package java.security.interfaces

import java.math.BigInteger
import java.security.PrivateKey
import scala.scalanative.annotation.stub

/** The interface to an elliptic curve (EC) private key. */
trait ECPrivateKey extends PrivateKey with ECKey {

    /** Returns the private value S. */
    @stub
    def getS(): BigInteger = ???
}

object ECPrivateKey {
    /** The class fingerprint that is set to indicate
     *  serialization compatibility.
     */
    @stub
    val serialVersionUID: Long = ???
}
