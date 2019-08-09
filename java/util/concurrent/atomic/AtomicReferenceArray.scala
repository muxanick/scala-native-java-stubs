package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import java.util.function.{BinaryOperator, UnaryOperator}

// An array of object references in which elements may be updated
// atomically.  See the java.util.concurrent.atomic package
// specification for description of the properties of atomic
// variables.
class AtomicReferenceArray[E] extends Object with Serializable {

    @stub
    // Creates a new AtomicReferenceArray with the same length as, and
    // all elements copied from, the given array.
    def this(array: Array[E]) = ???

    @stub
    // Atomically updates the element at index i with the
    // results of applying the given function to the current and
    // given values, returning the updated value.
    def accumulateAndGet(i: Int, x: E, accumulatorFunction: BinaryOperator[E]): E = ???

    @stub
    // Atomically sets the element at position i to the given
    // updated value if the current value == the expected value.
    def compareAndSet(i: Int, expect: E, update: E): Boolean = ???

    @stub
    // Gets the current value at position i.
    def get(i: Int): E = ???

    @stub
    // Atomically updates the element at index i with the
    // results of applying the given function to the current and
    // given values, returning the previous value.
    def getAndAccumulate(i: Int, x: E, accumulatorFunction: BinaryOperator[E]): E = ???

    @stub
    // Atomically sets the element at position i to the given
    // value and returns the old value.
    def getAndSet(i: Int, newValue: E): E = ???

    @stub
    // Atomically updates the element at index i with the results
    // of applying the given function, returning the previous value.
    def getAndUpdate(i: Int, updateFunction: UnaryOperator[E]): E = ???

    @stub
    // Eventually sets the element at position i to the given value.
    def lazySet(i: Int, newValue: E): Unit = ???

    @stub
    // Returns the length of the array.
    def length(): Int = ???

    @stub
    // Sets the element at position i to the given value.
    def set(i: Int, newValue: E): Unit = ???

    @stub
    // Returns the String representation of the current values of array.
    def toString(): String = ???

    @stub
    // Atomically updates the element at index i with the results
    // of applying the given function, returning the updated value.
    def updateAndGet(i: Int, updateFunction: UnaryOperator[E]): E = ???
}
