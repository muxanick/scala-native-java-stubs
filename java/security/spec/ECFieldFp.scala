package java.security.spec

import java.lang.Object
import java.math.BigInteger

/** This immutable class defines an elliptic curve (EC) prime
 *  finite field.
 */
class ECFieldFp extends Object with ECField {

    /** Compares this prime finite field for equality with the
     *  specified object.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Returns the field size in bits which is size of prime p
     *  for this prime finite field.
     */
    @stub
    def getFieldSize(): Int = ???

    /** Returns the prime p of this prime finite field. */
    @stub
    def getP(): BigInteger = ???
}
