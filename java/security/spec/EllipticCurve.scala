package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This immutable class holds the necessary values needed to represent
// an elliptic curve.
class EllipticCurve extends Object {

    @stub
    // Creates an elliptic curve with the specified elliptic field
    // field and the coefficients a and
    // b.
    def this(field: ECField, a: BigInteger, b: BigInteger) = ???

    @stub
    // Compares this elliptic curve for equality with the
    // specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the first coefficient a of the
    // elliptic curve.
    def getA(): BigInteger = ???

    @stub
    // Returns the second coefficient b of the
    // elliptic curve.
    def getB(): BigInteger = ???

    @stub
    // Returns the finite field field that this
    // elliptic curve is over.
    def getField(): ECField = ???

    @stub
    // Returns the seeding bytes seed used
    // during curve generation.
    def getSeed(): Array[Byte] = ???
}
