package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This immutable class represents a point on an elliptic curve (EC)
 *  in affine coordinates. Other coordinate systems can
 *  extend this class to represent this point in other
 *  coordinates.
 */
class ECPoint extends Object {

    /** Creates an ECPoint from the specified affine x-coordinate
     *  x and affine y-coordinate y.
     */
    @stub
    def this(x: BigInteger, y: BigInteger) = ???

    /** Compares this elliptic curve point for equality with
     *  the specified object.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the affine x-coordinate x. */
    @stub
    def getAffineX(): BigInteger = ???

    /** Returns the affine y-coordinate y. */
    @stub
    def getAffineY(): BigInteger = ???

    /** Returns a hash code value for this elliptic curve point. */
    @stub
    def hashCode(): Int = ???
}

object ECPoint {
    /** This defines the point at infinity. */
    @stub
    val POINT_INFINITY: ECPoint = ???
}
