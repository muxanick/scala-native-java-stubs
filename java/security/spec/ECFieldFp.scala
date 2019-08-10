package java.security.spec

import java.lang.Object
import java.math.BigInteger
import scala.scalanative.annotation.stub

/** This immutable class defines an elliptic curve (EC) prime
 *  finite field.
 */
class ECFieldFp extends Object with ECField {

    /** Creates an elliptic curve prime finite field
     *  with the specified prime p.
     */
    @stub
    def this(p: BigInteger) = ???

    /** Compares this prime finite field for equality with the
     *  specified object.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the field size in bits which is size of prime p
     *  for this prime finite field.
     */
    @stub
    def getFieldSize(): Int = ???

    /** Returns the prime p of this prime finite field. */
    @stub
    def getP(): BigInteger = ???

    /** Returns a hash code value for this prime finite field. */
    @stub
    def hashCode(): Int = ???
}
