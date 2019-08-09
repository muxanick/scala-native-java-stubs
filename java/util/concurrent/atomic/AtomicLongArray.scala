package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import java.util.function.{LongBinaryOperator, LongUnaryOperator}

/** A long array in which elements may be updated atomically.
 *  See the java.util.concurrent.atomic package specification
 *  for description of the properties of atomic variables.
 */
class AtomicLongArray extends Object with Serializable {

    /** Creates a new AtomicLongArray of the given length, with all
     *  elements initially zero.
     */
    @stub
    def this(length: Int) = ???

    /** Atomically updates the element at index i with the
     *  results of applying the given function to the current and
     *  given values, returning the updated value.
     */
    @stub
    def accumulateAndGet(i: Int, x: Long, accumulatorFunction: LongBinaryOperator): Long = ???

    /** Atomically adds the given value to the element at index i. */
    @stub
    def addAndGet(i: Int, delta: Long): Long = ???

    /** Atomically sets the element at position i to the given
     *  updated value if the current value == the expected value.
     */
    @stub
    def compareAndSet(i: Int, expect: Long, update: Long): Boolean = ???

    /** Atomically decrements by one the element at index i. */
    @stub
    def decrementAndGet(i: Int): Long = ???

    /** Gets the current value at position i. */
    @stub
    def get(i: Int): Long = ???

    /** Atomically updates the element at index i with the
     *  results of applying the given function to the current and
     *  given values, returning the previous value.
     */
    @stub
    def getAndAccumulate(i: Int, x: Long, accumulatorFunction: LongBinaryOperator): Long = ???

    /** Atomically adds the given value to the element at index i. */
    @stub
    def getAndAdd(i: Int, delta: Long): Long = ???

    /** Atomically decrements by one the element at index i. */
    @stub
    def getAndDecrement(i: Int): Long = ???

    /** Atomically increments by one the element at index i. */
    @stub
    def getAndIncrement(i: Int): Long = ???

    /** Atomically sets the element at position i to the given value
     *  and returns the old value.
     */
    @stub
    def getAndSet(i: Int, newValue: Long): Long = ???

    /** Atomically updates the element at index i with the results
     *  of applying the given function, returning the previous value.
     */
    @stub
    def getAndUpdate(i: Int, updateFunction: LongUnaryOperator): Long = ???

    /** Atomically increments by one the element at index i. */
    @stub
    def incrementAndGet(i: Int): Long = ???

    /** Eventually sets the element at position i to the given value. */
    @stub
    def lazySet(i: Int, newValue: Long): Unit = ???

    /** Returns the length of the array. */
    @stub
    def length(): Int = ???

    /** Sets the element at position i to the given value. */
    @stub
    def set(i: Int, newValue: Long): Unit = ???

    /** Returns the String representation of the current values of array. */
    @stub
    def toString(): String = ???

    /** Atomically updates the element at index i with the results
     *  of applying the given function, returning the updated value.
     */
    @stub
    def updateAndGet(i: Int, updateFunction: LongUnaryOperator): Long = ???
}
