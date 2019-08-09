package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import java.util.function.{IntBinaryOperator, IntUnaryOperator}

// An int array in which elements may be updated atomically.
// See the java.util.concurrent.atomic package
// specification for description of the properties of atomic
// variables.
class AtomicIntegerArray extends Object with Serializable {

    @stub
    // Creates a new AtomicIntegerArray of the given length, with all
    // elements initially zero.
    def this(length: Int) = ???

    @stub
    // Atomically updates the element at index i with the
    // results of applying the given function to the current and
    // given values, returning the updated value.
    def accumulateAndGet(i: Int, x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    @stub
    // Atomically adds the given value to the element at index i.
    def addAndGet(i: Int, delta: Int): Int = ???

    @stub
    // Atomically sets the element at position i to the given
    // updated value if the current value == the expected value.
    def compareAndSet(i: Int, expect: Int, update: Int): Boolean = ???

    @stub
    // Atomically decrements by one the element at index i.
    def decrementAndGet(i: Int): Int = ???

    @stub
    // Gets the current value at position i.
    def get(i: Int): Int = ???

    @stub
    // Atomically updates the element at index i with the
    // results of applying the given function to the current and
    // given values, returning the previous value.
    def getAndAccumulate(i: Int, x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    @stub
    // Atomically adds the given value to the element at index i.
    def getAndAdd(i: Int, delta: Int): Int = ???

    @stub
    // Atomically decrements by one the element at index i.
    def getAndDecrement(i: Int): Int = ???

    @stub
    // Atomically increments by one the element at index i.
    def getAndIncrement(i: Int): Int = ???

    @stub
    // Atomically sets the element at position i to the given
    // value and returns the old value.
    def getAndSet(i: Int, newValue: Int): Int = ???

    @stub
    // Atomically updates the element at index i with the results
    // of applying the given function, returning the previous value.
    def getAndUpdate(i: Int, updateFunction: IntUnaryOperator): Int = ???

    @stub
    // Atomically increments by one the element at index i.
    def incrementAndGet(i: Int): Int = ???

    @stub
    // Eventually sets the element at position i to the given value.
    def lazySet(i: Int, newValue: Int): Unit = ???

    @stub
    // Returns the length of the array.
    def length(): Int = ???

    @stub
    // Sets the element at position i to the given value.
    def set(i: Int, newValue: Int): Unit = ???

    @stub
    // Returns the String representation of the current values of array.
    def toString(): String = ???

    @stub
    // Atomically updates the element at index i with the results
    // of applying the given function, returning the updated value.
    def updateAndGet(i: Int, updateFunction: IntUnaryOperator): Int = ???
}
