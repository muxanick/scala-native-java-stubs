package java.security.spec

import java.lang.Object

/** This immutable class specifies the set of domain parameters
 *  used with elliptic curve cryptography (ECC).
 */
class ECParameterSpec extends Object with AlgorithmParameterSpec {

    /** Returns the cofactor. */
    @stub
    def getCofactor(): Int = ???

    /** Returns the elliptic curve that this parameter defines. */
    @stub
    def getCurve(): EllipticCurve = ???

    /** Returns the generator which is also known as the base point. */
    @stub
    def getGenerator(): ECPoint = ???
}
