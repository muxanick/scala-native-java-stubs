package java.lang

// The class Math contains methods for performing basic
// numeric operations such as the elementary exponential, logarithm,
// square root, and trigonometric functions.
//
// Unlike some of the numeric methods of class
// StrictMath, all implementations of the equivalent
// functions of class Math are not defined to return the
// bit-for-bit same results.  This relaxation permits
// better-performing implementations where strict reproducibility is
// not required.
//
// By default many of the Math methods simply call
// the equivalent method in StrictMath for their
// implementation.  Code generators are encouraged to use
// platform-specific native libraries or microprocessor instructions,
// where available, to provide higher-performance implementations of
// Math methods.  Such higher-performance
// implementations still must conform to the specification for
// Math.
//
// The quality of implementation specifications concern two
// properties, accuracy of the returned result and monotonicity of the
// method.  Accuracy of the floating-point Math methods is
// measured in terms of ulps, units in the last place.  For a
// given floating-point format, an ulp of a
// specific real number value is the distance between the two
// floating-point values bracketing that numerical value.  When
// discussing the accuracy of a method as a whole rather than at a
// specific argument, the number of ulps cited is for the worst-case
// error at any argument.  If a method always has an error less than
// 0.5 ulps, the method always returns the floating-point number
// nearest the exact result; such a method is correctly
// rounded.  A correctly rounded method is generally the best a
// floating-point approximation can be; however, it is impractical for
// many floating-point methods to be correctly rounded.  Instead, for
// the Math class, a larger error bound of 1 or 2 ulps is
// allowed for certain methods.  Informally, with a 1 ulp error bound,
// when the exact result is a representable number, the exact result
// should be returned as the computed result; otherwise, either of the
// two floating-point values which bracket the exact result may be
// returned.  For exact results large in magnitude, one of the
// endpoints of the bracket may be infinite.  Besides accuracy at
// individual arguments, maintaining proper relations between the
// method at different arguments is also important.  Therefore, most
// methods with more than 0.5 ulp errors are required to be
// semi-monotonic: whenever the mathematical function is
// non-decreasing, so is the floating-point approximation, likewise,
// whenever the mathematical function is non-increasing, so is the
// floating-point approximation.  Not all approximations that have 1
// ulp accuracy will automatically meet the monotonicity requirements.
//
// 
// The platform uses signed two's complement integer arithmetic with
// int and long primitive types.  The developer should choose
// the primitive type to ensure that arithmetic operations consistently
// produce correct results, which in some cases means the operations
// will not overflow the range of values of the computation.
// The best practice is to choose the primitive type and algorithm to avoid
// overflow. In cases where the size is int or long and
// overflow errors need to be detected, the methods addExact,
// subtractExact, multiplyExact, and toIntExact
// throw an ArithmeticException when the results overflow.
// For other arithmetic operations such as divide, absolute value,
// increment, decrement, and negation overflow occurs only with
// a specific minimum or maximum value and should be checked against
// the minimum or maximum as appropriate.
final class Math extends Object {
}

object Math {
    @stub
    // The double value that is closer than any other to
    // e, the base of the natural logarithms.
    def E: double = ???

    @stub
    // Returns the absolute value of a double value.
    def abs(a: double): double = ???

    @stub
    // Returns the absolute value of a float value.
    def abs(a: float): float = ???

    @stub
    // Returns the absolute value of an int value.
    def abs(a: Int): Int = ???

    @stub
    // Returns the absolute value of a long value.
    def abs(a: Long): Long = ???

    @stub
    // Returns the arc cosine of a value; the returned angle is in the
    // range 0.0 through pi.
    def acos(a: double): double = ???

    @stub
    // Returns the sum of its arguments,
    // throwing an exception if the result overflows an int.
    def addExact(x: Int, y: Int): Int = ???

    @stub
    // Returns the sum of its arguments,
    // throwing an exception if the result overflows a long.
    def addExact(x: Long, y: Long): Long = ???

    @stub
    // Returns the arc sine of a value; the returned angle is in the
    // range -pi/2 through pi/2.
    def asin(a: double): double = ???

    @stub
    // Returns the arc tangent of a value; the returned angle is in the
    // range -pi/2 through pi/2.
    def atan(a: double): double = ???

    @stub
    // Returns the angle theta from the conversion of rectangular
    // coordinates (x, y) to polar
    // coordinates (r, theta).
    def atan2(y: double, x: double): double = ???

    @stub
    // Returns the cube root of a double value.
    def cbrt(a: double): double = ???

    @stub
    // Returns the smallest (closest to negative infinity)
    // double value that is greater than or equal to the
    // argument and is equal to a mathematical integer.
    def ceil(a: double): double = ???

    @stub
    // Returns the first floating-point argument with the sign of the
    // second floating-point argument.
    def copySign(magnitude: double, sign: double): double = ???

    @stub
    // Returns the first floating-point argument with the sign of the
    // second floating-point argument.
    def copySign(magnitude: float, sign: float): float = ???

    @stub
    // Returns the trigonometric cosine of an angle.
    def cos(a: double): double = ???

    @stub
    // Returns the hyperbolic cosine of a double value.
    def cosh(x: double): double = ???

    @stub
    // Returns the argument decremented by one, throwing an exception if the
    // result overflows an int.
    def decrementExact(a: Int): Int = ???

    @stub
    // Returns the argument decremented by one, throwing an exception if the
    // result overflows a long.
    def decrementExact(a: Long): Long = ???

    @stub
    // Returns Euler's number e raised to the power of a
    // double value.
    def exp(a: double): double = ???

    @stub
    // Returns ex -1.
    def expm1(x: double): double = ???

    @stub
    // Returns the largest (closest to positive infinity)
    // double value that is less than or equal to the
    // argument and is equal to a mathematical integer.
    def floor(a: double): double = ???

    @stub
    // Returns the largest (closest to positive infinity)
    // int value that is less than or equal to the algebraic quotient.
    def floorDiv(x: Int, y: Int): Int = ???

    @stub
    // Returns the largest (closest to positive infinity)
    // long value that is less than or equal to the algebraic quotient.
    def floorDiv(x: Long, y: Long): Long = ???

    @stub
    // Returns the floor modulus of the int arguments.
    def floorMod(x: Int, y: Int): Int = ???

    @stub
    // Returns the floor modulus of the long arguments.
    def floorMod(x: Long, y: Long): Long = ???

    @stub
    // Returns the unbiased exponent used in the representation of a
    // double.
    def getExponent(d: double): Int = ???

    @stub
    // Returns the unbiased exponent used in the representation of a
    // float.
    def getExponent(f: float): Int = ???

    @stub
    // Returns sqrt(x2 +y2)
    // without intermediate overflow or underflow.
    def hypot(x: double, y: double): double = ???

    @stub
    // Computes the remainder operation on two arguments as prescribed
    // by the IEEE 754 standard.
    def IEEEremainder(f1: double, f2: double): double = ???

    @stub
    // Returns the argument incremented by one, throwing an exception if the
    // result overflows an int.
    def incrementExact(a: Int): Int = ???

    @stub
    // Returns the argument incremented by one, throwing an exception if the
    // result overflows a long.
    def incrementExact(a: Long): Long = ???

    @stub
    // Returns the natural logarithm (base e) of a double
    // value.
    def log(a: double): double = ???

    @stub
    // Returns the base 10 logarithm of a double value.
    def log10(a: double): double = ???

    @stub
    // Returns the natural logarithm of the sum of the argument and 1.
    def log1p(x: double): double = ???

    @stub
    // Returns the greater of two double values.
    def max(a: double, b: double): double = ???

    @stub
    // Returns the greater of two float values.
    def max(a: float, b: float): float = ???

    @stub
    // Returns the greater of two int values.
    def max(a: Int, b: Int): Int = ???

    @stub
    // Returns the greater of two long values.
    def max(a: Long, b: Long): Long = ???

    @stub
    // Returns the smaller of two double values.
    def min(a: double, b: double): double = ???

    @stub
    // Returns the smaller of two float values.
    def min(a: float, b: float): float = ???

    @stub
    // Returns the smaller of two int values.
    def min(a: Int, b: Int): Int = ???

    @stub
    // Returns the smaller of two long values.
    def min(a: Long, b: Long): Long = ???

    @stub
    // Returns the product of the arguments,
    // throwing an exception if the result overflows an int.
    def multiplyExact(x: Int, y: Int): Int = ???

    @stub
    // Returns the product of the arguments,
    // throwing an exception if the result overflows a long.
    def multiplyExact(x: Long, y: Long): Long = ???

    @stub
    // Returns the negation of the argument, throwing an exception if the
    // result overflows an int.
    def negateExact(a: Int): Int = ???

    @stub
    // Returns the negation of the argument, throwing an exception if the
    // result overflows a long.
    def negateExact(a: Long): Long = ???

    @stub
    // Returns the floating-point number adjacent to the first
    // argument in the direction of the second argument.
    def nextAfter(start: double, direction: double): double = ???

    @stub
    // Returns the floating-point number adjacent to the first
    // argument in the direction of the second argument.
    def nextAfter(start: float, direction: double): float = ???

    @stub
    // Returns the floating-point value adjacent to d in
    // the direction of negative infinity.
    def nextDown(d: double): double = ???

    @stub
    // Returns the floating-point value adjacent to f in
    // the direction of negative infinity.
    def nextDown(f: float): float = ???

    @stub
    // Returns the floating-point value adjacent to d in
    // the direction of positive infinity.
    def nextUp(d: double): double = ???

    @stub
    // Returns the floating-point value adjacent to f in
    // the direction of positive infinity.
    def nextUp(f: float): float = ???

    @stub
    // Returns the value of the first argument raised to the power of the
    // second argument.
    def pow(a: double, b: double): double = ???

    @stub
    // Returns a double value with a positive sign, greater
    // than or equal to 0.0 and less than 1.0.
    def random(): double = ???

    @stub
    // Returns the double value that is closest in value
    // to the argument and is equal to a mathematical integer.
    def rint(a: double): double = ???

    @stub
    // Returns the closest long to the argument, with ties
    // rounding to positive infinity.
    def round(a: double): Long = ???

    @stub
    // Returns the closest int to the argument, with ties
    // rounding to positive infinity.
    def round(a: float): Int = ???

    @stub
    // Returns d ×
    // 2scaleFactor rounded as if performed
    // by a single correctly rounded floating-point multiply to a
    // member of the double value set.
    def scalb(d: double, scaleFactor: Int): double = ???

    @stub
    // Returns f ×
    // 2scaleFactor rounded as if performed
    // by a single correctly rounded floating-point multiply to a
    // member of the float value set.
    def scalb(f: float, scaleFactor: Int): float = ???

    @stub
    // Returns the signum function of the argument; zero if the argument
    // is zero, 1.0 if the argument is greater than zero, -1.0 if the
    // argument is less than zero.
    def signum(d: double): double = ???

    @stub
    // Returns the signum function of the argument; zero if the argument
    // is zero, 1.0f if the argument is greater than zero, -1.0f if the
    // argument is less than zero.
    def signum(f: float): float = ???

    @stub
    // Returns the trigonometric sine of an angle.
    def sin(a: double): double = ???

    @stub
    // Returns the hyperbolic sine of a double value.
    def sinh(x: double): double = ???

    @stub
    // Returns the correctly rounded positive square root of a
    // double value.
    def sqrt(a: double): double = ???

    @stub
    // Returns the difference of the arguments,
    // throwing an exception if the result overflows an int.
    def subtractExact(x: Int, y: Int): Int = ???

    @stub
    // Returns the difference of the arguments,
    // throwing an exception if the result overflows a long.
    def subtractExact(x: Long, y: Long): Long = ???

    @stub
    // Returns the trigonometric tangent of an angle.
    def tan(a: double): double = ???

    @stub
    // Returns the hyperbolic tangent of a double value.
    def tanh(x: double): double = ???

    @stub
    // Converts an angle measured in radians to an approximately
    // equivalent angle measured in degrees.
    def toDegrees(angrad: double): double = ???

    @stub
    // Returns the value of the long argument;
    // throwing an exception if the value overflows an int.
    def toIntExact(value: Long): Int = ???

    @stub
    // Converts an angle measured in degrees to an approximately
    // equivalent angle measured in radians.
    def toRadians(angdeg: double): double = ???

    @stub
    // Returns the size of an ulp of the argument.
    def ulp(d: double): double = ???
}
