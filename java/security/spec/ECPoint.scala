package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This immutable class represents a point on an elliptic curve (EC)
 *  in affine coordinates. Other coordinate systems can
 *  extend this class to represent this point in other
 *  coordinates.
 */
class ECPoint extends Object {

    /** Compares this elliptic curve point for equality with
     *  the specified object.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the affine x-coordinate x. */
    @stub
    def getAffineX(): BigInteger = ???

    /** Returns the affine y-coordinate y. */
    @stub
    def getAffineY(): BigInteger = ???
}
