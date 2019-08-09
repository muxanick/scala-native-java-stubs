package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This immutable class represents a point on an elliptic curve (EC)
// in affine coordinates. Other coordinate systems can
// extend this class to represent this point in other
// coordinates.
class ECPoint extends Object {

    @stub
    // Compares this elliptic curve point for equality with
    // the specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the affine x-coordinate x.
    def getAffineX(): BigInteger = ???

    @stub
    // Returns the affine y-coordinate y.
    def getAffineY(): BigInteger = ???
}
