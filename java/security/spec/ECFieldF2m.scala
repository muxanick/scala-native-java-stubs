package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This immutable class defines an elliptic curve (EC)
 *  characteristic 2 finite field.
 */
class ECFieldF2m extends Object with ECField {

    /** Creates an elliptic curve characteristic 2 finite
     *  field which has 2^m elements with normal basis.
     */
    @stub
    def this(m: Int) = ???

    /** Creates an elliptic curve characteristic 2 finite
     *  field which has 2^m elements with
     *  polynomial basis.
     */
    @stub
    def this(m: Int, rp: BigInteger) = ???

    /** Compares this finite field for equality with the
     *  specified object.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the field size in bits which is m
     *  for this characteristic 2 finite field.
     */
    @stub
    def getFieldSize(): Int = ???

    /** Returns the value m of this characteristic
     *  2 finite field.
     */
    @stub
    def getM(): Int = ???

    /** Returns an integer array which contains the order of the
     *  middle term(s) of the reduction polynomial for polynomial
     *  basis or null for normal basis.
     */
    @stub
    def getMidTermsOfReductionPolynomial(): Array[Int] = ???

    /** Returns a BigInteger whose i-th bit corresponds to the
     *  i-th coefficient of the reduction polynomial for polynomial
     *  basis or null for normal basis.
     */
    @stub
    def getReductionPolynomial(): BigInteger = ???
}
