package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This immutable class defines an elliptic curve (EC)
// characteristic 2 finite field.
class ECFieldF2m extends Object with ECField {

    @stub
    // Creates an elliptic curve characteristic 2 finite
    // field which has 2^m elements with normal basis.
    def this(m: Int) = ???

    @stub
    // Creates an elliptic curve characteristic 2 finite
    // field which has 2^m elements with
    // polynomial basis.
    def this(m: Int, rp: BigInteger) = ???

    @stub
    // Compares this finite field for equality with the
    // specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the field size in bits which is m
    // for this characteristic 2 finite field.
    def getFieldSize(): Int = ???

    @stub
    // Returns the value m of this characteristic
    // 2 finite field.
    def getM(): Int = ???

    @stub
    // Returns an integer array which contains the order of the
    // middle term(s) of the reduction polynomial for polynomial
    // basis or null for normal basis.
    def getMidTermsOfReductionPolynomial(): Array[Int] = ???

    @stub
    // Returns a BigInteger whose i-th bit corresponds to the
    // i-th coefficient of the reduction polynomial for polynomial
    // basis or null for normal basis.
    def getReductionPolynomial(): BigInteger = ???
}
