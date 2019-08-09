package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object}

// One or more variables that together maintain a running long
// value updated using a supplied function.  When updates (method
// accumulate(long)) are contended across threads, the set of variables
// may grow dynamically to reduce contention.  Method get()
// (or, equivalently, longValue()) returns the current value
// across the variables maintaining updates.
//
// This class is usually preferable to AtomicLong when
// multiple threads update a common value that is used for purposes such
// as collecting statistics, not for fine-grained synchronization
// control.  Under low update contention, the two classes have similar
// characteristics. But under high contention, expected throughput of
// this class is significantly higher, at the expense of higher space
// consumption.
//
// The order of accumulation within or across threads is not
// guaranteed and cannot be depended upon, so this class is only
// applicable to functions for which the order of accumulation does
// not matter. The supplied accumulator function should be
// side-effect-free, since it may be re-applied when attempted updates
// fail due to contention among threads. The function is applied with
// the current value as its first argument, and the given update as
// the second argument.  For example, to maintain a running maximum
// value, you could supply Long::max along with Long.MIN_VALUE as the identity.
//
// Class LongAdder provides analogs of the functionality of
// this class for the common special case of maintaining counts and
// sums.  The call new LongAdder() is equivalent to new
// LongAccumulator((x, y) -> x + y, 0L.
//
// This class extends Number, but does not define
// methods such as equals, hashCode and compareTo because instances are expected to be mutated, and so are
// not useful as collection keys.
class LongAccumulator extends Number with Serializable {

    @stub
    // Updates with the given value.
    def accumulate(x: Long): Unit = ???

    @stub
    // Returns the current value as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Returns the current value as a float
    // after a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Returns the current value.
    def get(): Long = ???

    @stub
    // Equivalent in effect to get() followed by reset().
    def getThenReset(): Long = ???

    @stub
    // Returns the current value as an int
    // after a narrowing primitive conversion.
    def intValue(): Int = ???

    @stub
    // Equivalent to get().
    def longValue(): Long = ???

    @stub
    // Resets variables maintaining updates to the identity value.
    def reset(): Unit = ???
}