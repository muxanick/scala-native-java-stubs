package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import java.util.function.{BinaryOperator, UnaryOperator}

/** An object reference that may be updated atomically. See the java.util.concurrent.atomic package specification for description
 *  of the properties of atomic variables.
 */
class AtomicReference[V] extends Object with Serializable {

    /** Creates a new AtomicReference with null initial value. */
    @stub
    def this() = ???

    /** Atomically updates the current value with the results of
     *  applying the given function to the current and given values,
     *  returning the updated value.
     */
    @stub
    def accumulateAndGet(x: V, accumulatorFunction: BinaryOperator[V]): V = ???

    /** Atomically sets the value to the given updated value
     *  if the current value == the expected value.
     */
    @stub
    def compareAndSet(expect: V, update: V): Boolean = ???

    /** Gets the current value. */
    @stub
    def get(): V = ???

    /** Atomically updates the current value with the results of
     *  applying the given function to the current and given values,
     *  returning the previous value.
     */
    @stub
    def getAndAccumulate(x: V, accumulatorFunction: BinaryOperator[V]): V = ???

    /** Atomically sets to the given value and returns the old value. */
    @stub
    def getAndSet(newValue: V): V = ???

    /** Atomically updates the current value with the results of
     *  applying the given function, returning the previous value.
     */
    @stub
    def getAndUpdate(updateFunction: UnaryOperator[V]): V = ???

    /** Eventually sets to the given value. */
    @stub
    def lazySet(newValue: V): Unit = ???

    /** Sets to the given value. */
    @stub
    def set(newValue: V): Unit = ???

    /** Returns the String representation of the current value. */
    @stub
    def toString(): String = ???

    /** Atomically updates the current value with the results of
     *  applying the given function, returning the updated value.
     */
    @stub
    def updateAndGet(updateFunction: UnaryOperator[V]): V = ???
}
