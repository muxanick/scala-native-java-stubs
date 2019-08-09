package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object, String}
import java.util.function.{IntBinaryOperator, IntUnaryOperator}

// An int value that may be updated atomically.  See the
// java.util.concurrent.atomic package specification for
// description of the properties of atomic variables. An
// AtomicInteger is used in applications such as atomically
// incremented counters, and cannot be used as a replacement for an
// Integer. However, this class does extend
// Number to allow uniform access by tools and utilities that
// deal with numerically-based classes.
class AtomicInteger extends Number with Serializable {

    @stub
    // Creates a new AtomicInteger with initial value 0.
    def this() = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function to the current and given values,
    // returning the updated value.
    def accumulateAndGet(x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    @stub
    // Atomically adds the given value to the current value.
    def addAndGet(delta: Int): Int = ???

    @stub
    // Atomically sets the value to the given updated value
    // if the current value == the expected value.
    def compareAndSet(expect: Int, update: Int): Boolean = ???

    @stub
    // Atomically decrements by one the current value.
    def decrementAndGet(): Int = ???

    @stub
    // Returns the value of this AtomicInteger as a double
    // after a widening primitive conversion.
    def doubleValue(): double = ???

    @stub
    // Returns the value of this AtomicInteger as a float
    // after a widening primitive conversion.
    def floatValue(): float = ???

    @stub
    // Gets the current value.
    def get(): Int = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function to the current and given values,
    // returning the previous value.
    def getAndAccumulate(x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    @stub
    // Atomically adds the given value to the current value.
    def getAndAdd(delta: Int): Int = ???

    @stub
    // Atomically decrements by one the current value.
    def getAndDecrement(): Int = ???

    @stub
    // Atomically increments by one the current value.
    def getAndIncrement(): Int = ???

    @stub
    // Atomically sets to the given value and returns the old value.
    def getAndSet(newValue: Int): Int = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function, returning the previous value.
    def getAndUpdate(updateFunction: IntUnaryOperator): Int = ???

    @stub
    // Atomically increments by one the current value.
    def incrementAndGet(): Int = ???

    @stub
    // Returns the value of this AtomicInteger as an int.
    def intValue(): Int = ???

    @stub
    // Eventually sets to the given value.
    def lazySet(newValue: Int): Unit = ???

    @stub
    // Returns the value of this AtomicInteger as a long
    // after a widening primitive conversion.
    def longValue(): Long = ???

    @stub
    // Sets to the given value.
    def set(newValue: Int): Unit = ???

    @stub
    // Returns the String representation of the current value.
    def toString(): String = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function, returning the updated value.
    def updateAndGet(updateFunction: IntUnaryOperator): Int = ???
}
