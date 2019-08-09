package java.security.spec

import java.lang.Object
import java.math.BigInteger

// This immutable class defines an elliptic curve (EC) prime
// finite field.
class ECFieldFp extends Object with ECField {

    @stub
    // Compares this prime finite field for equality with the
    // specified object.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the field size in bits which is size of prime p
    // for this prime finite field.
    def getFieldSize(): Int = ???

    @stub
    // Returns the prime p of this prime finite field.
    def getP(): BigInteger = ???
}
