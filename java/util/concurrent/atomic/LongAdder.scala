package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object}

// One or more variables that together maintain an initially zero
// long sum.  When updates (method add(long)) are contended
// across threads, the set of variables may grow dynamically to reduce
// contention. Method sum() (or, equivalently, longValue()) returns the current total combined across the
// variables maintaining the sum.
//
// This class is usually preferable to AtomicLong when
// multiple threads update a common sum that is used for purposes such
// as collecting statistics, not for fine-grained synchronization
// control.  Under low update contention, the two classes have similar
// characteristics. But under high contention, expected throughput of
// this class is significantly higher, at the expense of higher space
// consumption.
//
// LongAdders can be used with a ConcurrentHashMap to maintain a scalable
// frequency map (a form of histogram or multiset). For example, to
// add a count to a ConcurrentHashMap<String,LongAdder> freqs,
// initializing if not already present, you can use freqs.computeIfAbsent(k -> new LongAdder()).increment();
//
// This class extends Number, but does not define
// methods such as equals, hashCode and compareTo because instances are expected to be mutated, and so are
// not useful as collection keys.
class LongAdder extends Number with Serializable {

    @stub
    // Adds the given value.
    def add(x: Long): Unit = ???

    @stub
    // Equivalent to add(-1).
    def decrement(): Unit = ???

    @stub
    // Returns the sum() as a double after a widening
    // primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Returns the sum() as a float
    // after a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Equivalent to add(1).
    def increment(): Unit = ???

    @stub
    // Returns the sum() as an int after a narrowing
    // primitive conversion.
    def intValue(): Int = ???

    @stub
    // Equivalent to sum().
    def longValue(): Long = ???

    @stub
    // Resets variables maintaining the sum to zero.
    def reset(): Unit = ???

    @stub
    // Returns the current sum.
    def sum(): Long = ???

    @stub
    // Equivalent in effect to sum() followed by reset().
    def sumThenReset(): Long = ???
}
