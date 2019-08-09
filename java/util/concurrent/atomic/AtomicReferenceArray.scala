package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import java.util.function.{BinaryOperator, UnaryOperator}

/** An array of object references in which elements may be updated
 *  atomically.  See the java.util.concurrent.atomic package
 *  specification for description of the properties of atomic
 *  variables.
 */
class AtomicReferenceArray[E] extends Object with Serializable {

    /** Creates a new AtomicReferenceArray with the same length as, and
     *  all elements copied from, the given array.
     */
    @stub
    def this(array: Array[E]) = ???

    /** Atomically updates the element at index i with the
     *  results of applying the given function to the current and
     *  given values, returning the updated value.
     */
    @stub
    def accumulateAndGet(i: Int, x: E, accumulatorFunction: BinaryOperator[E]): E = ???

    /** Atomically sets the element at position i to the given
     *  updated value if the current value == the expected value.
     */
    @stub
    def compareAndSet(i: Int, expect: E, update: E): Boolean = ???

    /** Gets the current value at position i. */
    @stub
    def get(i: Int): E = ???

    /** Atomically updates the element at index i with the
     *  results of applying the given function to the current and
     *  given values, returning the previous value.
     */
    @stub
    def getAndAccumulate(i: Int, x: E, accumulatorFunction: BinaryOperator[E]): E = ???

    /** Atomically sets the element at position i to the given
     *  value and returns the old value.
     */
    @stub
    def getAndSet(i: Int, newValue: E): E = ???

    /** Atomically updates the element at index i with the results
     *  of applying the given function, returning the previous value.
     */
    @stub
    def getAndUpdate(i: Int, updateFunction: UnaryOperator[E]): E = ???

    /** Eventually sets the element at position i to the given value. */
    @stub
    def lazySet(i: Int, newValue: E): Unit = ???

    /** Returns the length of the array. */
    @stub
    def length(): Int = ???

    /** Sets the element at position i to the given value. */
    @stub
    def set(i: Int, newValue: E): Unit = ???

    /** Returns the String representation of the current values of array. */
    @stub
    def toString(): String = ???

    /** Atomically updates the element at index i with the results
     *  of applying the given function, returning the updated value.
     */
    @stub
    def updateAndGet(i: Int, updateFunction: UnaryOperator[E]): E = ???
}
