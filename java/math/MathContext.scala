package java.math

import java.io.Serializable
import java.lang.Object

// Immutable objects which encapsulate the context settings which
// describe certain rules for numerical operators, such as those
// implemented by the BigDecimal class.
//
// The base-independent settings are:
// 
// precision:
// the number of digits to be used for an operation; results are
// rounded to this precision
//
// roundingMode:
// a RoundingMode object which specifies the algorithm to be
// used for rounding.
// 
final class MathContext extends Object with Serializable {

    @stub
    // Constructs a new MathContext with the specified
    // precision and the HALF_UP rounding
    // mode.
    def this(setPrecision: Int) = ???

    @stub
    // Constructs a new MathContext with a specified
    // precision and rounding mode.
    def this(setPrecision: Int, setRoundingMode: RoundingMode) = ???

    @stub
    // Compares this MathContext with the specified
    // Object for equality.
    def equals(x: Object): Boolean = ???

    @stub
    // Returns the precision setting.
    def getPrecision(): Int = ???

    @stub
    // Returns the roundingMode setting.
    def getRoundingMode(): RoundingMode = ???

    @stub
    // Returns the hash code for this MathContext.
    def hashCode(): Int = ???
}

object MathContext {
    @stub
    // A MathContext object with a precision setting
    //  matching the IEEE 754R Decimal128 format, 34 digits, and a
    //  rounding mode of HALF_EVEN, the
    //  IEEE 754R default.
    def DECIMAL128: MathContext = ???

    @stub
    // A MathContext object with a precision setting
    //  matching the IEEE 754R Decimal32 format, 7 digits, and a
    //  rounding mode of HALF_EVEN, the
    //  IEEE 754R default.
    def DECIMAL32: MathContext = ???

    @stub
    // A MathContext object with a precision setting
    //  matching the IEEE 754R Decimal64 format, 16 digits, and a
    //  rounding mode of HALF_EVEN, the
    //  IEEE 754R default.
    def DECIMAL64: MathContext = ???
}
