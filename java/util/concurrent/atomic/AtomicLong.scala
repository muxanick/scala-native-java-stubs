package java.util.concurrent.atomic

import java.io.Serializable
import java.lang.{Number, Object, String}
import java.util.function.{LongBinaryOperator, LongUnaryOperator}
import scala.scalanative.annotation.stub

/** A long value that may be updated atomically.  See the
 *  java.util.concurrent.atomic package specification for
 *  description of the properties of atomic variables. An
 *  AtomicLong is used in applications such as atomically
 *  incremented sequence numbers, and cannot be used as a replacement
 *  for a Long. However, this class does extend
 *  Number to allow uniform access by tools and utilities that
 *  deal with numerically-based classes.
 */
class AtomicLong extends Number with Serializable {

    /** Creates a new AtomicLong with initial value 0. */
    @stub
    def this() = ???

    /** Creates a new AtomicLong with the given initial value. */
    @stub
    def this(initialValue: Long) = ???

    /** Atomically updates the current value with the results of
     *  applying the given function to the current and given values,
     *  returning the updated value.
     */
    @stub
    def accumulateAndGet(x: Long, accumulatorFunction: LongBinaryOperator): Long = ???

    /** Atomically adds the given value to the current value. */
    @stub
    def addAndGet(delta: Long): Long = ???

    /** Atomically sets the value to the given updated value
     *  if the current value == the expected value.
     */
    @stub
    def compareAndSet(expect: Long, update: Long): Boolean = ???

    /** Atomically decrements by one the current value. */
    @stub
    def decrementAndGet(): Long = ???

    /** Returns the value of this AtomicLong as a double
     *  after a widening primitive conversion.
     */
    @stub
    def doubleValue(): Double = ???

    /** Returns the value of this AtomicLong as a float
     *  after a widening primitive conversion.
     */
    @stub
    def floatValue(): Float = ???

    /** Gets the current value. */
    @stub
    def get(): Long = ???

    /** Atomically updates the current value with the results of
     *  applying the given function to the current and given values,
     *  returning the previous value.
     */
    @stub
    def getAndAccumulate(x: Long, accumulatorFunction: LongBinaryOperator): Long = ???

    /** Atomically adds the given value to the current value. */
    @stub
    def getAndAdd(delta: Long): Long = ???

    /** Atomically decrements by one the current value. */
    @stub
    def getAndDecrement(): Long = ???

    /** Atomically increments by one the current value. */
    @stub
    def getAndIncrement(): Long = ???

    /** Atomically sets to the given value and returns the old value. */
    @stub
    def getAndSet(newValue: Long): Long = ???

    /** Atomically updates the current value with the results of
     *  applying the given function, returning the previous value.
     */
    @stub
    def getAndUpdate(updateFunction: LongUnaryOperator): Long = ???

    /** Atomically increments by one the current value. */
    @stub
    def incrementAndGet(): Long = ???

    /** Returns the value of this AtomicLong as an int
     *  after a narrowing primitive conversion.
     */
    @stub
    def intValue(): Int = ???

    /** Eventually sets to the given value. */
    @stub
    def lazySet(newValue: Long): Unit = ???

    /** Returns the value of this AtomicLong as a long. */
    @stub
    def longValue(): Long = ???

    /** Sets to the given value. */
    @stub
    def set(newValue: Long): Unit = ???

    /** Returns the String representation of the current value. */
    @stub
    def toString(): String = ???

    /** Atomically updates the current value with the results of
     *  applying the given function, returning the updated value.
     */
    @stub
    def updateAndGet(updateFunction: LongUnaryOperator): Long = ???

    /** Atomically sets the value to the given updated value
     *  if the current value == the expected value.
     */
    @stub
    def weakCompareAndSet(expect: Long, update: Long): Boolean = ???
}
