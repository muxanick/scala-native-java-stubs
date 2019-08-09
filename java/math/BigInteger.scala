package java.math

import java.lang.{Comparable, Number, Object, String}
import java.util.Random

// Immutable arbitrary-precision integers.  All operations behave as if
// BigIntegers were represented in two's-complement notation (like Java's
// primitive integer types).  BigInteger provides analogues to all of Java's
// primitive integer operators, and all relevant methods from java.lang.Math.
// Additionally, BigInteger provides operations for modular arithmetic, GCD
// calculation, primality testing, prime generation, bit manipulation,
// and a few other miscellaneous operations.
//
// Semantics of arithmetic operations exactly mimic those of Java's integer
// arithmetic operators, as defined in The Java Language Specification.
// For example, division by zero throws an ArithmeticException, and
// division of a negative by a positive yields a negative (or zero) remainder.
// All of the details in the Spec concerning overflow are ignored, as
// BigIntegers are made as large as necessary to accommodate the results of an
// operation.
//
// Semantics of shift operations extend those of Java's shift operators
// to allow for negative shift distances.  A right-shift with a negative
// shift distance results in a left shift, and vice-versa.  The unsigned
// right shift operator (>>>) is omitted, as this operation makes
// little sense in combination with the "infinite word size" abstraction
// provided by this class.
//
// Semantics of bitwise logical operations exactly mimic those of Java's
// bitwise integer operators.  The binary operators (and,
// or, xor) implicitly perform sign extension on the shorter
// of the two operands prior to performing the operation.
//
// Comparison operations perform signed integer comparisons, analogous to
// those performed by Java's relational and equality operators.
//
// Modular arithmetic operations are provided to compute residues, perform
// exponentiation, and compute multiplicative inverses.  These methods always
// return a non-negative result, between 0 and (modulus - 1),
// inclusive.
//
// Bit operations operate on a single bit of the two's-complement
// representation of their operand.  If necessary, the operand is sign-
// extended so that it contains the designated bit.  None of the single-bit
// operations can produce a BigInteger with a different sign from the
// BigInteger being operated on, as they affect only a single bit, and the
// "infinite word size" abstraction provided by this class ensures that there
// are infinitely many "virtual sign bits" preceding each BigInteger.
//
// For the sake of brevity and clarity, pseudo-code is used throughout the
// descriptions of BigInteger methods.  The pseudo-code expression
// (i + j) is shorthand for "a BigInteger whose value is
// that of the BigInteger i plus that of the BigInteger j."
// The pseudo-code expression (i == j) is shorthand for
// "true if and only if the BigInteger i represents the same
// value as the BigInteger j."  Other pseudo-code expressions are
// interpreted similarly.
//
// All methods and constructors in this class throw
// NullPointerException when passed
// a null object reference for any input parameter.
//
// BigInteger must support values in the range
// -2Integer.MAX_VALUE (exclusive) to
// +2Integer.MAX_VALUE (exclusive)
// and may support values outside of that range.
//
// The range of probable prime values is limited and may be less than
// the full supported positive range of BigInteger.
// The range must be at least 1 to 2500000000.
class BigInteger extends Number with Comparable[BigInteger] {

    @stub
    // Translates a byte array containing the two's-complement binary
    // representation of a BigInteger into a BigInteger.
    def this(val: Array[Byte]) = ???

    @stub
    // Translates the sign-magnitude representation of a BigInteger into a
    // BigInteger.
    def this(signum: Int, magnitude: Array[Byte]) = ???

    @stub
    // Constructs a randomly generated positive BigInteger that is probably
    // prime, with the specified bitLength.
    def this(bitLength: Int, certainty: Int, rnd: Random) = ???

    @stub
    // Constructs a randomly generated BigInteger, uniformly distributed over
    // the range 0 to (2numBits - 1), inclusive.
    def this(numBits: Int, rnd: Random) = ???

    @stub
    // Translates the decimal String representation of a BigInteger into a
    // BigInteger.
    def this(val: String) = ???

    @stub
    // Returns a BigInteger whose value is the absolute value of this
    // BigInteger.
    def abs(): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this + val).
    def add(val: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this & val).
    def and(val: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this & ~val).
    def andNot(val: BigInteger): BigInteger = ???

    @stub
    // Returns the number of bits in the two's complement representation
    // of this BigInteger that differ from its sign bit.
    def bitCount(): Int = ???

    @stub
    // Returns the number of bits in the minimal two's-complement
    // representation of this BigInteger, excluding a sign bit.
    def bitLength(): Int = ???

    @stub
    // Converts this BigInteger to a byte, checking
    // for lost information.
    def byteValueExact(): Byte = ???

    @stub
    // Returns a BigInteger whose value is equivalent to this BigInteger
    // with the designated bit cleared.
    def clearBit(n: Int): BigInteger = ???

    @stub
    // Compares this BigInteger with the specified BigInteger.
    def compareTo(val: BigInteger): Int = ???

    @stub
    // Returns a BigInteger whose value is (this / val).
    def divide(val: BigInteger): BigInteger = ???

    @stub
    // Returns an array of two BigIntegers containing (this / val)
    // followed by (this % val).
    def divideAndRemainder(val: BigInteger): Array[BigInteger] = ???

    @stub
    // Converts this BigInteger to a double.
    def doubleValue(): double = ???

    @stub
    // Compares this BigInteger with the specified Object for equality.
    def equals(x: Object): Boolean = ???

    @stub
    // Returns a BigInteger whose value is equivalent to this BigInteger
    // with the designated bit flipped.
    def flipBit(n: Int): BigInteger = ???

    @stub
    // Converts this BigInteger to a float.
    def floatValue(): float = ???

    @stub
    // Returns a BigInteger whose value is the greatest common divisor of
    // abs(this) and abs(val).
    def gcd(val: BigInteger): BigInteger = ???

    @stub
    // Returns the index of the rightmost (lowest-order) one bit in this
    // BigInteger (the number of zero bits to the right of the rightmost
    // one bit).
    def getLowestSetBit(): Int = ???

    @stub
    // Returns the hash code for this BigInteger.
    def hashCode(): Int = ???

    @stub
    // Converts this BigInteger to an int.
    def intValue(): Int = ???

    @stub
    // Converts this BigInteger to an int, checking
    // for lost information.
    def intValueExact(): Int = ???

    @stub
    // Returns true if this BigInteger is probably prime,
    // false if it's definitely composite.
    def isProbablePrime(certainty: Int): Boolean = ???

    @stub
    // Converts this BigInteger to a long.
    def longValue(): Long = ???

    @stub
    // Converts this BigInteger to a long, checking
    // for lost information.
    def longValueExact(): Long = ???

    @stub
    // Returns the maximum of this BigInteger and val.
    def max(val: BigInteger): BigInteger = ???

    @stub
    // Returns the minimum of this BigInteger and val.
    def min(val: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this mod m).
    def mod(m: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this-1 mod m).
    def modInverse(m: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is
    // (thisexponent mod m).
    def modPow(exponent: BigInteger, m: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this * val).
    def multiply(val: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (-this).
    def negate(): BigInteger = ???

    @stub
    // Returns the first integer greater than this BigInteger that
    // is probably prime.
    def nextProbablePrime(): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (~this).
    def not(): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this | val).
    def or(val: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (thisexponent).
    def pow(exponent: Int): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this % val).
    def remainder(val: BigInteger): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is equivalent to this BigInteger
    // with the designated bit set.
    def setBit(n: Int): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this << n).
    def shiftLeft(n: Int): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is (this >> n).
    def shiftRight(n: Int): BigInteger = ???

    @stub
    // Converts this BigInteger to a short, checking
    // for lost information.
    def shortValueExact(): Short = ???

    @stub
    // Returns the signum function of this BigInteger.
    def signum(): Int = ???

    @stub
    // Returns a BigInteger whose value is (this - val).
    def subtract(val: BigInteger): BigInteger = ???

    @stub
    // Returns true if and only if the designated bit is set.
    def testBit(n: Int): Boolean = ???

    @stub
    // Returns a byte array containing the two's-complement
    // representation of this BigInteger.
    def toByteArray(): Array[Byte] = ???

    @stub
    // Returns the decimal String representation of this BigInteger.
    def toString(): String = ???

    @stub
    // Returns the String representation of this BigInteger in the
    // given radix.
    def toString(radix: Int): String = ???
}

object BigInteger {
    @stub
    // The BigInteger constant one.
    def ONE: BigInteger = ???

    @stub
    // The BigInteger constant ten.
    def TEN: BigInteger = ???

    @stub
    // Returns a positive BigInteger that is probably prime, with the
    // specified bitLength.
    def probablePrime(bitLength: Int, rnd: Random): BigInteger = ???

    @stub
    // Returns a BigInteger whose value is equal to that of the
    // specified long.
    def valueOf(val: Long): BigInteger = ???
}
