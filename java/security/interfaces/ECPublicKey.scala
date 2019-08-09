package java.security.interfaces

import java.security.PublicKey
import java.security.spec.ECPoint
import scala.scalanative.annotation.stub

/** The interface to an elliptic curve (EC) public key. */
trait ECPublicKey extends PublicKey with ECKey {

    /** Returns the public point W. */
    @stub
    def getW(): ECPoint = ???
}

object ECPublicKey {
    /** The class fingerprint that is set to indicate
     *  serialization compatibility.
     */
    @stub
    val serialVersionUID: Long = ???
}
