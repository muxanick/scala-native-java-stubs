package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object, String}
import java.util.function.DoubleBinaryOperator
import scala.scalanative.annotation.stub

/** One or more variables that together maintain a running double
 *  value updated using a supplied function.  When updates (method
 *  accumulate(double)) are contended across threads, the set of variables
 *  may grow dynamically to reduce contention.  Method get()
 *  (or, equivalently, doubleValue()) returns the current value
 *  across the variables maintaining updates.
 * 
 *  This class is usually preferable to alternatives when multiple
 *  threads update a common value that is used for purposes such as
 *  summary statistics that are frequently updated but less frequently
 *  read.
 * 
 *  The supplied accumulator function should be side-effect-free,
 *  since it may be re-applied when attempted updates fail due to
 *  contention among threads. The function is applied with the current
 *  value as its first argument, and the given update as the second
 *  argument.  For example, to maintain a running maximum value, you
 *  could supply Double::max along with Double.NEGATIVE_INFINITY as the identity. The order of
 *  accumulation within or across threads is not guaranteed. Thus, this
 *  class may not be applicable if numerical stability is required,
 *  especially when combining values of substantially different orders
 *  of magnitude.
 * 
 *  Class DoubleAdder provides analogs of the functionality
 *  of this class for the common special case of maintaining sums.  The
 *  call new DoubleAdder() is equivalent to new
 *  DoubleAccumulator((x, y) -> x + y, 0.0).
 * 
 *  This class extends Number, but does not define
 *  methods such as equals, hashCode and compareTo because instances are expected to be mutated, and so are
 *  not useful as collection keys.
 */
class DoubleAccumulator extends Number with Serializable {

    /** Creates a new instance using the given accumulator function
     *  and identity element.
     */
    @stub
    def this(accumulatorFunction: DoubleBinaryOperator, identity: Double) = ???

    /** Updates with the given value. */
    @stub
    def accumulate(x: Double): Unit = ???

    /** Equivalent to get(). */
    @stub
    def doubleValue(): Double = ???

    /** Returns the current value as a float
     *  after a narrowing primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Returns the current value. */
    @stub
    def get(): Double = ???

    /** Equivalent in effect to get() followed by reset(). */
    @stub
    def getThenReset(): Double = ???

    /** Returns the current value as an int
     *  after a narrowing primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Returns the current value as a long
     *  after a narrowing primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Resets variables maintaining updates to the identity value. */
    @stub
    def reset(): Unit = ???

    /** Returns the String representation of the current value. */
    @stub
    def toString(): String = ???
}
