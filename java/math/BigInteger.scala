package java.math

import java.lang.{Comparable, Number, Object, String}
import java.util.Random
import scala.scalanative.annotation.stub

/** Immutable arbitrary-precision integers.  All operations behave as if
 *  BigIntegers were represented in two's-complement notation (like Java's
 *  primitive integer types).  BigInteger provides analogues to all of Java's
 *  primitive integer operators, and all relevant methods from java.lang.Math.
 *  Additionally, BigInteger provides operations for modular arithmetic, GCD
 *  calculation, primality testing, prime generation, bit manipulation,
 *  and a few other miscellaneous operations.
 * 
 *  Semantics of arithmetic operations exactly mimic those of Java's integer
 *  arithmetic operators, as defined in The Java Language Specification.
 *  For example, division by zero throws an ArithmeticException, and
 *  division of a negative by a positive yields a negative (or zero) remainder.
 *  All of the details in the Spec concerning overflow are ignored, as
 *  BigIntegers are made as large as necessary to accommodate the results of an
 *  operation.
 * 
 *  Semantics of shift operations extend those of Java's shift operators
 *  to allow for negative shift distances.  A right-shift with a negative
 *  shift distance results in a left shift, and vice-versa.  The unsigned
 *  right shift operator (>>>) is omitted, as this operation makes
 *  little sense in combination with the "infinite word size" abstraction
 *  provided by this class.
 * 
 *  Semantics of bitwise logical operations exactly mimic those of Java's
 *  bitwise integer operators.  The binary operators (and,
 *  or, xor) implicitly perform sign extension on the shorter
 *  of the two operands prior to performing the operation.
 * 
 *  Comparison operations perform signed integer comparisons, analogous to
 *  those performed by Java's relational and equality operators.
 * 
 *  Modular arithmetic operations are provided to compute residues, perform
 *  exponentiation, and compute multiplicative inverses.  These methods always
 *  return a non-negative result, between 0 and (modulus - 1),
 *  inclusive.
 * 
 *  Bit operations operate on a single bit of the two's-complement
 *  representation of their operand.  If necessary, the operand is sign-
 *  extended so that it contains the designated bit.  None of the single-bit
 *  operations can produce a BigInteger with a different sign from the
 *  BigInteger being operated on, as they affect only a single bit, and the
 *  "infinite word size" abstraction provided by this class ensures that there
 *  are infinitely many "virtual sign bits" preceding each BigInteger.
 * 
 *  For the sake of brevity and clarity, pseudo-code is used throughout the
 *  descriptions of BigInteger methods.  The pseudo-code expression
 *  (i + j) is shorthand for "a BigInteger whose value is
 *  that of the BigInteger i plus that of the BigInteger j."
 *  The pseudo-code expression (i == j) is shorthand for
 *  "true if and only if the BigInteger i represents the same
 *  value as the BigInteger j."  Other pseudo-code expressions are
 *  interpreted similarly.
 * 
 *  All methods and constructors in this class throw
 *  NullPointerException when passed
 *  a null object reference for any input parameter.
 * 
 *  BigInteger must support values in the range
 *  -2Integer.MAX_VALUE (exclusive) to
 *  +2Integer.MAX_VALUE (exclusive)
 *  and may support values outside of that range.
 * 
 *  The range of probable prime values is limited and may be less than
 *  the full supported positive range of BigInteger.
 *  The range must be at least 1 to 2500000000.
 */
class BigInteger extends Number with Comparable[BigInteger] {

    /** Translates a byte array containing the two's-complement binary
     *  representation of a BigInteger into a BigInteger.
     */
    @stub
    def this(val: Array[Byte]) = ???

    /** Translates the sign-magnitude representation of a BigInteger into a
     *  BigInteger.
     */
    @stub
    def this(signum: Int, magnitude: Array[Byte]) = ???

    /** Constructs a randomly generated positive BigInteger that is probably
     *  prime, with the specified bitLength.
     */
    @stub
    def this(bitLength: Int, certainty: Int, rnd: Random) = ???

    /** Constructs a randomly generated BigInteger, uniformly distributed over
     *  the range 0 to (2numBits - 1), inclusive.
     */
    @stub
    def this(numBits: Int, rnd: Random) = ???

    /** Translates the decimal String representation of a BigInteger into a
     *  BigInteger.
     */
    @stub
    def this(val: String) = ???

    /** Translates the String representation of a BigInteger in the
     *  specified radix into a BigInteger.
     */
    @stub
    def this(val: String, radix: Int) = ???

    /** Returns a BigInteger whose value is the absolute value of this
     *  BigInteger.
     */
    @stub
    def abs(): BigInteger = ???

    /** Returns a BigInteger whose value is (this + val). */
    @stub
    def add(val: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is (this & val). */
    @stub
    def and(val: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is (this & ~val). */
    @stub
    def andNot(val: BigInteger): BigInteger = ???

    /** Returns the number of bits in the two's complement representation
     *  of this BigInteger that differ from its sign bit.
     */
    @stub
    def bitCount(): Int = ???

    /** Returns the number of bits in the minimal two's-complement
     *  representation of this BigInteger, excluding a sign bit.
     */
    @stub
    def bitLength(): Int = ???

    /** Converts this BigInteger to a byte, checking
     *  for lost information.
     */
    @stub
    def byteValueExact(): Byte = ???

    /** Returns a BigInteger whose value is equivalent to this BigInteger
     *  with the designated bit cleared.
     */
    @stub
    def clearBit(n: Int): BigInteger = ???

    /** Compares this BigInteger with the specified BigInteger. */
    @stub
    def compareTo(val: BigInteger): Int = ???

    /** Returns a BigInteger whose value is (this / val). */
    @stub
    def divide(val: BigInteger): BigInteger = ???

    /** Returns an array of two BigIntegers containing (this / val)
     *  followed by (this % val).
     */
    @stub
    def divideAndRemainder(val: BigInteger): Array[BigInteger] = ???

    /** Converts this BigInteger to a double. */
    @stub
    def doubleValue(): Double = ???

    /** Compares this BigInteger with the specified Object for equality. */
    @stub
    def equals(x: Any): Boolean = ???

    /** Returns a BigInteger whose value is equivalent to this BigInteger
     *  with the designated bit flipped.
     */
    @stub
    def flipBit(n: Int): BigInteger = ???

    /** Converts this BigInteger to a float. */
    @stub
    def floatValue(): Float = ???

    /** Returns a BigInteger whose value is the greatest common divisor of
     *  abs(this) and abs(val).
     */
    @stub
    def gcd(val: BigInteger): BigInteger = ???

    /** Returns the index of the rightmost (lowest-order) one bit in this
     *  BigInteger (the number of zero bits to the right of the rightmost
     *  one bit).
     */
    @stub
    def getLowestSetBit(): Int = ???

    /** Returns the hash code for this BigInteger. */
    @stub
    def hashCode(): Int = ???

    /** Converts this BigInteger to an int. */
    @stub
    def intValue(): Int = ???

    /** Converts this BigInteger to an int, checking
     *  for lost information.
     */
    @stub
    def intValueExact(): Int = ???

    /** Returns true if this BigInteger is probably prime,
     *  false if it's definitely composite.
     */
    @stub
    def isProbablePrime(certainty: Int): Boolean = ???

    /** Converts this BigInteger to a long. */
    @stub
    def longValue(): Long = ???

    /** Converts this BigInteger to a long, checking
     *  for lost information.
     */
    @stub
    def longValueExact(): Long = ???

    /** Returns the maximum of this BigInteger and val. */
    @stub
    def max(val: BigInteger): BigInteger = ???

    /** Returns the minimum of this BigInteger and val. */
    @stub
    def min(val: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is (this mod m). */
    @stub
    def mod(m: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is (this-1 mod m). */
    @stub
    def modInverse(m: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is
     *  (thisexponent mod m).
     */
    @stub
    def modPow(exponent: BigInteger, m: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is (this * val). */
    @stub
    def multiply(val: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is (-this). */
    @stub
    def negate(): BigInteger = ???

    /** Returns the first integer greater than this BigInteger that
     *  is probably prime.
     */
    @stub
    def nextProbablePrime(): BigInteger = ???

    /** Returns a BigInteger whose value is (~this). */
    @stub
    def not(): BigInteger = ???

    /** Returns a BigInteger whose value is (this | val). */
    @stub
    def or(val: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is (thisexponent). */
    @stub
    def pow(exponent: Int): BigInteger = ???

    /** Returns a BigInteger whose value is (this % val). */
    @stub
    def remainder(val: BigInteger): BigInteger = ???

    /** Returns a BigInteger whose value is equivalent to this BigInteger
     *  with the designated bit set.
     */
    @stub
    def setBit(n: Int): BigInteger = ???

    /** Returns a BigInteger whose value is (this << n). */
    @stub
    def shiftLeft(n: Int): BigInteger = ???

    /** Returns a BigInteger whose value is (this >> n). */
    @stub
    def shiftRight(n: Int): BigInteger = ???

    /** Converts this BigInteger to a short, checking
     *  for lost information.
     */
    @stub
    def shortValueExact(): Short = ???

    /** Returns the signum function of this BigInteger. */
    @stub
    def signum(): Int = ???

    /** Returns a BigInteger whose value is (this - val). */
    @stub
    def subtract(val: BigInteger): BigInteger = ???

    /** Returns true if and only if the designated bit is set. */
    @stub
    def testBit(n: Int): Boolean = ???

    /** Returns a byte array containing the two's-complement
     *  representation of this BigInteger.
     */
    @stub
    def toByteArray(): Array[Byte] = ???

    /** Returns the decimal String representation of this BigInteger. */
    @stub
    def toString(): String = ???

    /** Returns the String representation of this BigInteger in the
     *  given radix.
     */
    @stub
    def toString(radix: Int): String = ???

    /** Returns a BigInteger whose value is (this ^ val). */
    @stub
    def xor(val: BigInteger): BigInteger = ???
}

object BigInteger {
    /** The BigInteger constant one. */
    @stub
    val ONE: BigInteger = ???

    /** The BigInteger constant ten. */
    @stub
    val TEN: BigInteger = ???

    /** The BigInteger constant zero. */
    @stub
    val ZERO: BigInteger = ???

    /** Returns a positive BigInteger that is probably prime, with the
     *  specified bitLength.
     */
    @stub
    def probablePrime(bitLength: Int, rnd: Random): BigInteger = ???

    /** Returns a BigInteger whose value is equal to that of the
     *  specified long.
     */
    @stub
    def valueOf(val: Long): BigInteger = ???
}
