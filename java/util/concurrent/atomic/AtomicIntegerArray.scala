package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import java.util.function.{IntBinaryOperator, IntUnaryOperator}
import scala.scalanative.annotation.stub

/** An int array in which elements may be updated atomically.
 *  See the java.util.concurrent.atomic package
 *  specification for description of the properties of atomic
 *  variables.
 */
class AtomicIntegerArray extends Object with Serializable {

    /** Creates a new AtomicIntegerArray of the given length, with all
     *  elements initially zero.
     */
    @stub
    def this(length: Int) = ???

    /** Creates a new AtomicIntegerArray with the same length as, and
     *  all elements copied from, the given array.
     */
    @stub
    def this(array: Array[Int]) = ???

    /** Atomically updates the element at index i with the
     *  results of applying the given function to the current and
     *  given values, returning the updated value.
     */
    @stub
    def accumulateAndGet(i: Int, x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    /** Atomically adds the given value to the element at index i. */
    @stub
    def addAndGet(i: Int, delta: Int): Int = ???

    /** Atomically sets the element at position i to the given
     *  updated value if the current value == the expected value.
     */
    @stub
    def compareAndSet(i: Int, expect: Int, update: Int): Boolean = ???

    /** Atomically decrements by one the element at index i. */
    @stub
    def decrementAndGet(i: Int): Int = ???

    /** Gets the current value at position i. */
    @stub
    def get(i: Int): Int = ???

    /** Atomically updates the element at index i with the
     *  results of applying the given function to the current and
     *  given values, returning the previous value.
     */
    @stub
    def getAndAccumulate(i: Int, x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    /** Atomically adds the given value to the element at index i. */
    @stub
    def getAndAdd(i: Int, delta: Int): Int = ???

    /** Atomically decrements by one the element at index i. */
    @stub
    def getAndDecrement(i: Int): Int = ???

    /** Atomically increments by one the element at index i. */
    @stub
    def getAndIncrement(i: Int): Int = ???

    /** Atomically sets the element at position i to the given
     *  value and returns the old value.
     */
    @stub
    def getAndSet(i: Int, newValue: Int): Int = ???

    /** Atomically updates the element at index i with the results
     *  of applying the given function, returning the previous value.
     */
    @stub
    def getAndUpdate(i: Int, updateFunction: IntUnaryOperator): Int = ???

    /** Atomically increments by one the element at index i. */
    @stub
    def incrementAndGet(i: Int): Int = ???

    /** Eventually sets the element at position i to the given value. */
    @stub
    def lazySet(i: Int, newValue: Int): Unit = ???

    /** Returns the length of the array. */
    @stub
    def length(): Int = ???

    /** Sets the element at position i to the given value. */
    @stub
    def set(i: Int, newValue: Int): Unit = ???

    /** Returns the String representation of the current values of array. */
    @stub
    def toString(): String = ???

    /** Atomically updates the element at index i with the results
     *  of applying the given function, returning the updated value.
     */
    @stub
    def updateAndGet(i: Int, updateFunction: IntUnaryOperator): Int = ???

    /** Atomically sets the element at position i to the given
     *  updated value if the current value == the expected value.
     */
    @stub
    def weakCompareAndSet(i: Int, expect: Int, update: Int): Boolean = ???
}
