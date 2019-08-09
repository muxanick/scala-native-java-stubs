package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object, String}
import java.util.function.{IntBinaryOperator, IntUnaryOperator}
import scala.scalanative.annotation.stub

/** An int value that may be updated atomically.  See the
 *  java.util.concurrent.atomic package specification for
 *  description of the properties of atomic variables. An
 *  AtomicInteger is used in applications such as atomically
 *  incremented counters, and cannot be used as a replacement for an
 *  Integer. However, this class does extend
 *  Number to allow uniform access by tools and utilities that
 *  deal with numerically-based classes.
 */
class AtomicInteger extends Number with Serializable {

    /** Creates a new AtomicInteger with initial value 0. */
    @stub
    def this() = ???

    /** Creates a new AtomicInteger with the given initial value. */
    @stub
    def this(initialValue: Int) = ???

    /** Atomically updates the current value with the results of
     *  applying the given function to the current and given values,
     *  returning the updated value.
     */
    @stub
    def accumulateAndGet(x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    /** Atomically adds the given value to the current value. */
    @stub
    def addAndGet(delta: Int): Int = ???

    /** Atomically sets the value to the given updated value
     *  if the current value == the expected value.
     */
    @stub
    def compareAndSet(expect: Int, update: Int): Boolean = ???

    /** Atomically decrements by one the current value. */
    @stub
    def decrementAndGet(): Int = ???

    /** Returns the value of this AtomicInteger as a double
     *  after a widening primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Returns the value of this AtomicInteger as a float
     *  after a widening primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Gets the current value. */
    @stub
    def get(): Int = ???

    /** Atomically updates the current value with the results of
     *  applying the given function to the current and given values,
     *  returning the previous value.
     */
    @stub
    def getAndAccumulate(x: Int, accumulatorFunction: IntBinaryOperator): Int = ???

    /** Atomically adds the given value to the current value. */
    @stub
    def getAndAdd(delta: Int): Int = ???

    /** Atomically decrements by one the current value. */
    @stub
    def getAndDecrement(): Int = ???

    /** Atomically increments by one the current value. */
    @stub
    def getAndIncrement(): Int = ???

    /** Atomically sets to the given value and returns the old value. */
    @stub
    def getAndSet(newValue: Int): Int = ???

    /** Atomically updates the current value with the results of
     *  applying the given function, returning the previous value.
     */
    @stub
    def getAndUpdate(updateFunction: IntUnaryOperator): Int = ???

    /** Atomically increments by one the current value. */
    @stub
    def incrementAndGet(): Int = ???

    /** Returns the value of this AtomicInteger as an int. */
    @stub
    def intValue(): Int = ???

    /** Eventually sets to the given value. */
    @stub
    def lazySet(newValue: Int): Unit = ???

    /** Returns the value of this AtomicInteger as a long
     *  after a widening primitive conversion.
     */
    @stub
    def longValue(): Long = ???

    /** Sets to the given value. */
    @stub
    def set(newValue: Int): Unit = ???

    /** Returns the String representation of the current value. */
    @stub
    def toString(): String = ???

    /** Atomically updates the current value with the results of
     *  applying the given function, returning the updated value.
     */
    @stub
    def updateAndGet(updateFunction: IntUnaryOperator): Int = ???

    /** Atomically sets the value to the given updated value
     *  if the current value == the expected value.
     */
    @stub
    def weakCompareAndSet(expect: Int, update: Int): Boolean = ???
}
