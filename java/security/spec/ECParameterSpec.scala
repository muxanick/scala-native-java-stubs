package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This immutable class specifies the set of domain parameters
 *  used with elliptic curve cryptography (ECC).
 */
class ECParameterSpec extends Object with AlgorithmParameterSpec {

    /** Creates elliptic curve domain parameters based on the
     *  specified values.
     */
    @stub
    def this(curve: EllipticCurve, g: ECPoint, n: BigInteger, h: Int) = ???

    /** Returns the cofactor. */
    @stub
    def getCofactor(): Int = ???

    /** Returns the elliptic curve that this parameter defines. */
    @stub
    def getCurve(): EllipticCurve = ???

    /** Returns the generator which is also known as the base point. */
    @stub
    def getGenerator(): ECPoint = ???

    /** Returns the order of the generator. */
    @stub
    def getOrder(): BigInteger = ???
}
