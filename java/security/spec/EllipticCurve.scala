package java.security.spec

import java.lang.Object
import java.math.BigInteger

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

    /** Compares this elliptic curve for equality with the
     *  specified object.
     */
    @stub
    def equals(obj: Object): Boolean = ???

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
}
