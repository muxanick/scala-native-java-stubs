package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This immutable class holds the necessary values needed to represent
 *  an elliptic curve.
 */
class EllipticCurve extends Object {

    /** Creates an elliptic curve with the specified elliptic field
     *  field and the coefficients a and
     *  b.
     */
    @stub
    def this(field: ECField, a: BigInteger, b: BigInteger) = ???

    /** Creates an elliptic curve with the specified elliptic field
     *  field, the coefficients a and
     *  b, and the seed used for curve generation.
     */
    @stub
    def this(field: ECField, a: BigInteger, b: BigInteger, seed: Array[Byte]) = ???

    /** Compares this elliptic curve for equality with the
     *  specified object.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the first coefficient a of the
     *  elliptic curve.
     */
    @stub
    def getA(): BigInteger = ???

    /** Returns the second coefficient b of the
     *  elliptic curve.
     */
    @stub
    def getB(): BigInteger = ???

    /** Returns the finite field field that this
     *  elliptic curve is over.
     */
    @stub
    def getField(): ECField = ???

    /** Returns the seeding bytes seed used
     *  during curve generation.
     */
    @stub
    def getSeed(): Array[Byte] = ???

    /** Returns a hash code value for this elliptic curve. */
    @stub
    def hashCode(): Int = ???
}
