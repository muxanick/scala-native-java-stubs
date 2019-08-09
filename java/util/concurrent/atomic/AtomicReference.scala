package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Object, String}
import java.util.function.{BinaryOperator, UnaryOperator}

// An object reference that may be updated atomically. See the java.util.concurrent.atomic package specification for description
// of the properties of atomic variables.
class AtomicReference[V] extends Object with Serializable {

    @stub
    // Creates a new AtomicReference with null initial value.
    def this() = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function to the current and given values,
    // returning the updated value.
    def accumulateAndGet(x: V, accumulatorFunction: BinaryOperator[V]): V = ???

    @stub
    // Atomically sets the value to the given updated value
    // if the current value == the expected value.
    def compareAndSet(expect: V, update: V): Boolean = ???

    @stub
    // Gets the current value.
    def get(): V = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function to the current and given values,
    // returning the previous value.
    def getAndAccumulate(x: V, accumulatorFunction: BinaryOperator[V]): V = ???

    @stub
    // Atomically sets to the given value and returns the old value.
    def getAndSet(newValue: V): V = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function, returning the previous value.
    def getAndUpdate(updateFunction: UnaryOperator[V]): V = ???

    @stub
    // Eventually sets to the given value.
    def lazySet(newValue: V): Unit = ???

    @stub
    // Sets to the given value.
    def set(newValue: V): Unit = ???

    @stub
    // Returns the String representation of the current value.
    def toString(): String = ???

    @stub
    // Atomically updates the current value with the results of
    // applying the given function, returning the updated value.
    def updateAndGet(updateFunction: UnaryOperator[V]): V = ???
}
