package java.util.concurrent.atomic

import java.lang.{Class, Object, String}
import java.util.function.{IntBinaryOperator, IntUnaryOperator}

/** A reflection-based utility that enables atomic updates to
 *  designated volatile int fields of designated classes.
 *  This class is designed for use in atomic data structures in which
 *  several fields of the same node are independently subject to atomic
 *  updates.
 * 
 *  Note that the guarantees of the compareAndSet
 *  method in this class are weaker than in other atomic classes.
 *  Because this class cannot ensure that all uses of the field
 *  are appropriate for purposes of atomic access, it can
 *  guarantee atomicity only with respect to other invocations of
 *  compareAndSet and set on the same updater.
 */
abstract class AtomicIntegerFieldUpdater[T] extends Object {

    /** Atomically updates the field of the given object managed by this
     *  updater with the results of applying the given function to the
     *  current and given values, returning the updated value.
     */
    def accumulateAndGet(obj: T, x: Int, accumulatorFunction: IntBinaryOperator): Int

    /** Atomically adds the given value to the current value of the field of
     *  the given object managed by this updater.
     */
    def addAndGet(obj: T, delta: Int): Int

    /** Atomically sets the field of the given object managed by this updater
     *  to the given updated value if the current value == the
     *  expected value.
     */
    def compareAndSet(obj: T, expect: Int, update: Int): Boolean

    /** Atomically decrements by one the current value of the field of the
     *  given object managed by this updater.
     */
    def decrementAndGet(obj: T): Int

    /** Gets the current value held in the field of the given object managed
     *  by this updater.
     */
    def get(obj: T): Int

    /** Atomically updates the field of the given object managed by this
     *  updater with the results of applying the given function to the
     *  current and given values, returning the previous value.
     */
    def getAndAccumulate(obj: T, x: Int, accumulatorFunction: IntBinaryOperator): Int

    /** Atomically adds the given value to the current value of the field of
     *  the given object managed by this updater.
     */
    def getAndAdd(obj: T, delta: Int): Int

    /** Atomically decrements by one the current value of the field of the
     *  given object managed by this updater.
     */
    def getAndDecrement(obj: T): Int

    /** Atomically increments by one the current value of the field of the
     *  given object managed by this updater.
     */
    def getAndIncrement(obj: T): Int

    /** Atomically sets the field of the given object managed by this updater
     *  to the given value and returns the old value.
     */
    def getAndSet(obj: T, newValue: Int): Int

    /** Atomically updates the field of the given object managed by this updater
     *  with the results of applying the given function, returning the previous
     *  value.
     */
    def getAndUpdate(obj: T, updateFunction: IntUnaryOperator): Int

    /** Atomically increments by one the current value of the field of the
     *  given object managed by this updater.
     */
    def incrementAndGet(obj: T): Int

    /** Eventually sets the field of the given object managed by this
     *  updater to the given updated value.
     */
    def lazySet(obj: T, newValue: Int): Unit

    /** Sets the field of the given object managed by this updater to the
     *  given updated value.
     */
    def set(obj: T, newValue: Int): Unit

    /** Atomically updates the field of the given object managed by this updater
     *  with the results of applying the given function, returning the updated
     *  value.
     */
    def updateAndGet(obj: T, updateFunction: IntUnaryOperator): Int
}

object AtomicIntegerFieldUpdater {
    /** Creates and returns an updater for objects with the given field. */
    @stub
    def newUpdater[U](tclass: Class[U], fieldName: String): AtomicIntegerFieldUpdater[U] = ???
}
