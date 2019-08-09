package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object, String}
import scala.scalanative.annotation.stub

/** One or more variables that together maintain an initially zero
 *  long sum.  When updates (method add(long)) are contended
 *  across threads, the set of variables may grow dynamically to reduce
 *  contention. Method sum() (or, equivalently, longValue()) returns the current total combined across the
 *  variables maintaining the sum.
 * 
 *  This class is usually preferable to AtomicLong when
 *  multiple threads update a common sum that is used for purposes such
 *  as collecting statistics, not for fine-grained synchronization
 *  control.  Under low update contention, the two classes have similar
 *  characteristics. But under high contention, expected throughput of
 *  this class is significantly higher, at the expense of higher space
 *  consumption.
 * 
 *  LongAdders can be used with a ConcurrentHashMap to maintain a scalable
 *  frequency map (a form of histogram or multiset). For example, to
 *  add a count to a ConcurrentHashMap<String,LongAdder> freqs,
 *  initializing if not already present, you can use freqs.computeIfAbsent(k -> new LongAdder()).increment();
 * 
 *  This class extends Number, but does not define
 *  methods such as equals, hashCode and compareTo because instances are expected to be mutated, and so are
 *  not useful as collection keys.
 */
class LongAdder extends Number with Serializable {

    /** Creates a new adder with initial sum of zero. */
    @stub
    def this() = ???

    /** Adds the given value. */
    @stub
    def add(x: Long): Unit = ???

    /** Equivalent to add(-1). */
    @stub
    def decrement(): Unit = ???

    /** Returns the sum() as a double after a widening
     *  primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Returns the sum() as a float
     *  after a widening primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Equivalent to add(1). */
    @stub
    def increment(): Unit = ???

    /** Returns the sum() as an int after a narrowing
     *  primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Equivalent to sum(). */
    @stub
    def longValue(): Long = ???

    /** Resets variables maintaining the sum to zero. */
    @stub
    def reset(): Unit = ???

    /** Returns the current sum. */
    @stub
    def sum(): Long = ???

    /** Equivalent in effect to sum() followed by reset(). */
    @stub
    def sumThenReset(): Long = ???

    /** Returns the String representation of the sum(). */
    @stub
    def toString(): String = ???
}
