package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object, String}
import java.util.function.{LongBinaryOperator, LongUnaryOperator}

// A long value that may be updated atomically.  See the
// java.util.concurrent.atomic package specification for
// description of the properties of atomic variables. An
// AtomicLong is used in applications such as atomically
// incremented sequence numbers, and cannot be used as a replacement
// for a Long. However, this class does extend
// Number to allow uniform access by tools and utilities that
// deal with numerically-based classes.
class AtomicLong extends Number with Serializable {

    @stub
    // Creates a new AtomicLong with initial value 0.
    def this() = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function to the current and given values,
    // returning the updated value.
    def accumulateAndGet(x: Long, accumulatorFunction: LongBinaryOperator): Long = ???

    @stub
    // Atomically adds the given value to the current value.
    def addAndGet(delta: Long): Long = ???

    @stub
    // Atomically sets the value to the given updated value
    // if the current value == the expected value.
    def compareAndSet(expect: Long, update: Long): Boolean = ???

    @stub
    // Atomically decrements by one the current value.
    def decrementAndGet(): Long = ???

    @stub
    // Returns the value of this AtomicLong as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Returns the value of this AtomicLong as a float
    // after a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Gets the current value.
    def get(): Long = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function to the current and given values,
    // returning the previous value.
    def getAndAccumulate(x: Long, accumulatorFunction: LongBinaryOperator): Long = ???

    @stub
    // Atomically adds the given value to the current value.
    def getAndAdd(delta: Long): Long = ???

    @stub
    // Atomically decrements by one the current value.
    def getAndDecrement(): Long = ???

    @stub
    // Atomically increments by one the current value.
    def getAndIncrement(): Long = ???

    @stub
    // Atomically sets to the given value and returns the old value.
    def getAndSet(newValue: Long): Long = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function, returning the previous value.
    def getAndUpdate(updateFunction: LongUnaryOperator): Long = ???

    @stub
    // Atomically increments by one the current value.
    def incrementAndGet(): Long = ???

    @stub
    // Returns the value of this AtomicLong as an int
    // after a narrowing primitive conversion.
    def intValue(): Int = ???

    @stub
    // Eventually sets to the given value.
    def lazySet(newValue: Long): Unit = ???

    @stub
    // Returns the value of this AtomicLong as a long.
    def longValue(): Long = ???

    @stub
    // Sets to the given value.
    def set(newValue: Long): Unit = ???

    @stub
    // Returns the String representation of the current value.
    def toString(): String = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function, returning the updated value.
    def updateAndGet(updateFunction: LongUnaryOperator): Long = ???
}
