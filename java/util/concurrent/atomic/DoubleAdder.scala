package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object}

/** One or more variables that together maintain an initially zero
 *  double sum.  When updates (method add(double)) are
 *  contended across threads, the set of variables may grow dynamically
 *  to reduce contention.  Method sum() (or, equivalently doubleValue()) returns the current total combined across the
 *  variables maintaining the sum. The order of accumulation within or
 *  across threads is not guaranteed. Thus, this class may not be
 *  applicable if numerical stability is required, especially when
 *  combining values of substantially different orders of magnitude.
 * 
 *  This class is usually preferable to alternatives when multiple
 *  threads update a common value that is used for purposes such as
 *  summary statistics that are frequently updated but less frequently
 *  read.
 * 
 *  This class extends Number, but does not define
 *  methods such as equals, hashCode and compareTo because instances are expected to be mutated, and so are
 *  not useful as collection keys.
 */
class DoubleAdder extends Number with Serializable {

    /** Adds the given value. */
    @stub
    def add(x: Double): Unit = ???

    /** Equivalent to sum(). */
    @stub
    def doubleValue(): Double = ???

    /** Returns the sum() as a float
     *  after a narrowing primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Returns the sum() as an int after a
     *  narrowing primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Returns the sum() as a long after a
     *  narrowing primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Resets variables maintaining the sum to zero. */
    @stub
    def reset(): Unit = ???

    /** Returns the current sum. */
    @stub
    def sum(): Double = ???

    /** Equivalent in effect to sum() followed by reset(). */
    @stub
    def sumThenReset(): Double = ???
}
