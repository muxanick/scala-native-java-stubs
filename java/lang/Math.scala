package java.lang

/** The class Math contains methods for performing basic
 *  numeric operations such as the elementary exponential, logarithm,
 *  square root, and trigonometric functions.
 * 
 *  Unlike some of the numeric methods of class
 *  StrictMath, all implementations of the equivalent
 *  functions of class Math are not defined to return the
 *  bit-for-bit same results.  This relaxation permits
 *  better-performing implementations where strict reproducibility is
 *  not required.
 * 
 *  By default many of the Math methods simply call
 *  the equivalent method in StrictMath for their
 *  implementation.  Code generators are encouraged to use
 *  platform-specific native libraries or microprocessor instructions,
 *  where available, to provide higher-performance implementations of
 *  Math methods.  Such higher-performance
 *  implementations still must conform to the specification for
 *  Math.
 * 
 *  The quality of implementation specifications concern two
 *  properties, accuracy of the returned result and monotonicity of the
 *  method.  Accuracy of the floating-point Math methods is
 *  measured in terms of ulps, units in the last place.  For a
 *  given floating-point format, an ulp of a
 *  specific real number value is the distance between the two
 *  floating-point values bracketing that numerical value.  When
 *  discussing the accuracy of a method as a whole rather than at a
 *  specific argument, the number of ulps cited is for the worst-case
 *  error at any argument.  If a method always has an error less than
 *  0.5 ulps, the method always returns the floating-point number
 *  nearest the exact result; such a method is correctly
 *  rounded.  A correctly rounded method is generally the best a
 *  floating-point approximation can be; however, it is impractical for
 *  many floating-point methods to be correctly rounded.  Instead, for
 *  the Math class, a larger error bound of 1 or 2 ulps is
 *  allowed for certain methods.  Informally, with a 1 ulp error bound,
 *  when the exact result is a representable number, the exact result
 *  should be returned as the computed result; otherwise, either of the
 *  two floating-point values which bracket the exact result may be
 *  returned.  For exact results large in magnitude, one of the
 *  endpoints of the bracket may be infinite.  Besides accuracy at
 *  individual arguments, maintaining proper relations between the
 *  method at different arguments is also important.  Therefore, most
 *  methods with more than 0.5 ulp errors are required to be
 *  semi-monotonic: whenever the mathematical function is
 *  non-decreasing, so is the floating-point approximation, likewise,
 *  whenever the mathematical function is non-increasing, so is the
 *  floating-point approximation.  Not all approximations that have 1
 *  ulp accuracy will automatically meet the monotonicity requirements.
 * 
 *  
 *  The platform uses signed two's complement integer arithmetic with
 *  int and long primitive types.  The developer should choose
 *  the primitive type to ensure that arithmetic operations consistently
 *  produce correct results, which in some cases means the operations
 *  will not overflow the range of values of the computation.
 *  The best practice is to choose the primitive type and algorithm to avoid
 *  overflow. In cases where the size is int or long and
 *  overflow errors need to be detected, the methods addExact,
 *  subtractExact, multiplyExact, and toIntExact
 *  throw an ArithmeticException when the results overflow.
 *  For other arithmetic operations such as divide, absolute value,
 *  increment, decrement, and negation overflow occurs only with
 *  a specific minimum or maximum value and should be checked against
 *  the minimum or maximum as appropriate.
 */
final class Math extends Object {
}

object Math {
    /** The double value that is closer than any other to
     *  e, the base of the natural logarithms.
     */
    @stub
    val E: Double = ???

    /** Returns the absolute value of a double value. */
    @stub
    def abs(a: Double): Double = ???

    /** Returns the absolute value of a float value. */
    @stub
    def abs(a: Float): Float = ???

    /** Returns the absolute value of an int value. */
    @stub
    def abs(a: Int): Int = ???

    /** Returns the absolute value of a long value. */
    @stub
    def abs(a: Long): Long = ???

    /** Returns the arc cosine of a value; the returned angle is in the
     *  range 0.0 through pi.
     */
    @stub
    def acos(a: Double): Double = ???

    /** Returns the sum of its arguments,
     *  throwing an exception if the result overflows an int.
     */
    @stub
    def addExact(x: Int, y: Int): Int = ???

    /** Returns the sum of its arguments,
     *  throwing an exception if the result overflows a long.
     */
    @stub
    def addExact(x: Long, y: Long): Long = ???

    /** Returns the arc sine of a value; the returned angle is in the
     *  range -pi/2 through pi/2.
     */
    @stub
    def asin(a: Double): Double = ???

    /** Returns the arc tangent of a value; the returned angle is in the
     *  range -pi/2 through pi/2.
     */
    @stub
    def atan(a: Double): Double = ???

    /** Returns the angle theta from the conversion of rectangular
     *  coordinates (x, y) to polar
     *  coordinates (r, theta).
     */
    @stub
    def atan2(y: Double, x: Double): Double = ???

    /** Returns the cube root of a double value. */
    @stub
    def cbrt(a: Double): Double = ???

    /** Returns the smallest (closest to negative infinity)
     *  double value that is greater than or equal to the
     *  argument and is equal to a mathematical integer.
     */
    @stub
    def ceil(a: Double): Double = ???

    /** Returns the first floating-point argument with the sign of the
     *  second floating-point argument.
     */
    @stub
    def copySign(magnitude: Double, sign: Double): Double = ???

    /** Returns the first floating-point argument with the sign of the
     *  second floating-point argument.
     */
    @stub
    def copySign(magnitude: Float, sign: Float): Float = ???

    /** Returns the trigonometric cosine of an angle. */
    @stub
    def cos(a: Double): Double = ???

    /** Returns the hyperbolic cosine of a double value. */
    @stub
    def cosh(x: Double): Double = ???

    /** Returns the argument decremented by one, throwing an exception if the
     *  result overflows an int.
     */
    @stub
    def decrementExact(a: Int): Int = ???

    /** Returns the argument decremented by one, throwing an exception if the
     *  result overflows a long.
     */
    @stub
    def decrementExact(a: Long): Long = ???

    /** Returns Euler's number e raised to the power of a
     *  double value.
     */
    @stub
    def exp(a: Double): Double = ???

    /** Returns ex -1. */
    @stub
    def expm1(x: Double): Double = ???

    /** Returns the largest (closest to positive infinity)
     *  double value that is less than or equal to the
     *  argument and is equal to a mathematical integer.
     */
    @stub
    def floor(a: Double): Double = ???

    /** Returns the largest (closest to positive infinity)
     *  int value that is less than or equal to the algebraic quotient.
     */
    @stub
    def floorDiv(x: Int, y: Int): Int = ???

    /** Returns the largest (closest to positive infinity)
     *  long value that is less than or equal to the algebraic quotient.
     */
    @stub
    def floorDiv(x: Long, y: Long): Long = ???

    /** Returns the floor modulus of the int arguments. */
    @stub
    def floorMod(x: Int, y: Int): Int = ???

    /** Returns the floor modulus of the long arguments. */
    @stub
    def floorMod(x: Long, y: Long): Long = ???

    /** Returns the unbiased exponent used in the representation of a
     *  double.
     */
    @stub
    def getExponent(d: Double): Int = ???

    /** Returns the unbiased exponent used in the representation of a
     *  float.
     */
    @stub
    def getExponent(f: Float): Int = ???

    /** Returns sqrt(x2 +y2)
     *  without intermediate overflow or underflow.
     */
    @stub
    def hypot(x: Double, y: Double): Double = ???

    /** Computes the remainder operation on two arguments as prescribed
     *  by the IEEE 754 standard.
     */
    @stub
    def IEEEremainder(f1: Double, f2: Double): Double = ???

    /** Returns the argument incremented by one, throwing an exception if the
     *  result overflows an int.
     */
    @stub
    def incrementExact(a: Int): Int = ???

    /** Returns the argument incremented by one, throwing an exception if the
     *  result overflows a long.
     */
    @stub
    def incrementExact(a: Long): Long = ???

    /** Returns the natural logarithm (base e) of a double
     *  value.
     */
    @stub
    def log(a: Double): Double = ???

    /** Returns the base 10 logarithm of a double value. */
    @stub
    def log10(a: Double): Double = ???

    /** Returns the natural logarithm of the sum of the argument and 1. */
    @stub
    def log1p(x: Double): Double = ???

    /** Returns the greater of two double values. */
    @stub
    def max(a: Double, b: Double): Double = ???

    /** Returns the greater of two float values. */
    @stub
    def max(a: Float, b: Float): Float = ???

    /** Returns the greater of two int values. */
    @stub
    def max(a: Int, b: Int): Int = ???

    /** Returns the greater of two long values. */
    @stub
    def max(a: Long, b: Long): Long = ???

    /** Returns the smaller of two double values. */
    @stub
    def min(a: Double, b: Double): Double = ???

    /** Returns the smaller of two float values. */
    @stub
    def min(a: Float, b: Float): Float = ???

    /** Returns the smaller of two int values. */
    @stub
    def min(a: Int, b: Int): Int = ???

    /** Returns the smaller of two long values. */
    @stub
    def min(a: Long, b: Long): Long = ???

    /** Returns the product of the arguments,
     *  throwing an exception if the result overflows an int.
     */
    @stub
    def multiplyExact(x: Int, y: Int): Int = ???

    /** Returns the product of the arguments,
     *  throwing an exception if the result overflows a long.
     */
    @stub
    def multiplyExact(x: Long, y: Long): Long = ???

    /** Returns the negation of the argument, throwing an exception if the
     *  result overflows an int.
     */
    @stub
    def negateExact(a: Int): Int = ???

    /** Returns the negation of the argument, throwing an exception if the
     *  result overflows a long.
     */
    @stub
    def negateExact(a: Long): Long = ???

    /** Returns the floating-point number adjacent to the first
     *  argument in the direction of the second argument.
     */
    @stub
    def nextAfter(start: Double, direction: Double): Double = ???

    /** Returns the floating-point number adjacent to the first
     *  argument in the direction of the second argument.
     */
    @stub
    def nextAfter(start: Float, direction: Double): Float = ???

    /** Returns the floating-point value adjacent to d in
     *  the direction of negative infinity.
     */
    @stub
    def nextDown(d: Double): Double = ???

    /** Returns the floating-point value adjacent to f in
     *  the direction of negative infinity.
     */
    @stub
    def nextDown(f: Float): Float = ???

    /** Returns the floating-point value adjacent to d in
     *  the direction of positive infinity.
     */
    @stub
    def nextUp(d: Double): Double = ???

    /** Returns the floating-point value adjacent to f in
     *  the direction of positive infinity.
     */
    @stub
    def nextUp(f: Float): Float = ???

    /** Returns the value of the first argument raised to the power of the
     *  second argument.
     */
    @stub
    def pow(a: Double, b: Double): Double = ???

    /** Returns a double value with a positive sign, greater
     *  than or equal to 0.0 and less than 1.0.
     */
    @stub
    def random(): Double = ???

    /** Returns the double value that is closest in value
     *  to the argument and is equal to a mathematical integer.
     */
    @stub
    def rint(a: Double): Double = ???

    /** Returns the closest long to the argument, with ties
     *  rounding to positive infinity.
     */
    @stub
    def round(a: Double): Long = ???

    /** Returns the closest int to the argument, with ties
     *  rounding to positive infinity.
     */
    @stub
    def round(a: Float): Int = ???

    /** Returns d ×
     *  2scaleFactor rounded as if performed
     *  by a single correctly rounded floating-point multiply to a
     *  member of the double value set.
     */
    @stub
    def scalb(d: Double, scaleFactor: Int): Double = ???

    /** Returns f ×
     *  2scaleFactor rounded as if performed
     *  by a single correctly rounded floating-point multiply to a
     *  member of the float value set.
     */
    @stub
    def scalb(f: Float, scaleFactor: Int): Float = ???

    /** Returns the signum function of the argument; zero if the argument
     *  is zero, 1.0 if the argument is greater than zero, -1.0 if the
     *  argument is less than zero.
     */
    @stub
    def signum(d: Double): Double = ???

    /** Returns the signum function of the argument; zero if the argument
     *  is zero, 1.0f if the argument is greater than zero, -1.0f if the
     *  argument is less than zero.
     */
    @stub
    def signum(f: Float): Float = ???

    /** Returns the trigonometric sine of an angle. */
    @stub
    def sin(a: Double): Double = ???

    /** Returns the hyperbolic sine of a double value. */
    @stub
    def sinh(x: Double): Double = ???

    /** Returns the correctly rounded positive square root of a
     *  double value.
     */
    @stub
    def sqrt(a: Double): Double = ???

    /** Returns the difference of the arguments,
     *  throwing an exception if the result overflows an int.
     */
    @stub
    def subtractExact(x: Int, y: Int): Int = ???

    /** Returns the difference of the arguments,
     *  throwing an exception if the result overflows a long.
     */
    @stub
    def subtractExact(x: Long, y: Long): Long = ???

    /** Returns the trigonometric tangent of an angle. */
    @stub
    def tan(a: Double): Double = ???

    /** Returns the hyperbolic tangent of a double value. */
    @stub
    def tanh(x: Double): Double = ???

    /** Converts an angle measured in radians to an approximately
     *  equivalent angle measured in degrees.
     */
    @stub
    def toDegrees(angrad: Double): Double = ???

    /** Returns the value of the long argument;
     *  throwing an exception if the value overflows an int.
     */
    @stub
    def toIntExact(value: Long): Int = ???

    /** Converts an angle measured in degrees to an approximately
     *  equivalent angle measured in radians.
     */
    @stub
    def toRadians(angdeg: Double): Double = ???

    /** Returns the size of an ulp of the argument. */
    @stub
    def ulp(d: Double): Double = ???
}
