package java.security.spec

import java.lang.Object

// This immutable class specifies the set of domain parameters
// used with elliptic curve cryptography (ECC).
class ECParameterSpec extends Object with AlgorithmParameterSpec {

    @stub
    // Returns the cofactor.
    def getCofactor(): Int = ???

    @stub
    // Returns the elliptic curve that this parameter defines.
    def getCurve(): EllipticCurve = ???

    @stub
    // Returns the generator which is also known as the base point.
    def getGenerator(): ECPoint = ???
}
