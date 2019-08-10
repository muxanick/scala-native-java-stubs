package java.util

import java.lang.{Double, Integer, Long}
import java.util.function.{Consumer, DoubleConsumer, IntConsumer, LongConsumer}
import scala.scalanative.annotation.stub

/** A base type for primitive specializations of Iterator.  Specialized
 *  subtypes are provided for int, long, and
 *  double values.
 * 
 *  The specialized subtype default implementations of Iterator.next()
 *  and Iterator.forEachRemaining(java.util.function.Consumer) box
 *  primitive values to instances of their corresponding wrapper class.  Such
 *  boxing may offset any advantages gained when using the primitive
 *  specializations.  To avoid boxing, the corresponding primitive-based methods
 *  should be used.  For example, PrimitiveIterator.OfInt.nextInt() and
 *  PrimitiveIterator.OfInt.forEachRemaining(java.util.function.IntConsumer)
 *  should be used in preference to PrimitiveIterator.OfInt.next() and
 *  PrimitiveIterator.OfInt.forEachRemaining(java.util.function.Consumer).
 * 
 *  Iteration of primitive values using boxing-based methods
 *  next() and
 *  forEachRemaining(),
 *  does not affect the order in which the values, transformed to boxed values,
 *  are encountered.
 */
trait PrimitiveIterator[T, T_CONS] extends Iterator[T] {

    /** Performs the given action for each remaining element, in the order
     *  elements occur when iterating, until all elements have been processed
     *  or the action throws an exception.
     */
    @stub
    def forEachRemaining(action: T_CONS): Unit = ???
}

object PrimitiveIterator {
    /** An Iterator specialized for double values. */
    trait OfDouble extends PrimitiveIterator[Double, DoubleConsumer] {

        /** Performs the given action for each remaining element until all elements
         *  have been processed or the action throws an exception.
         */
        @stub
        def forEachRemaining(action: Consumer[_ >: Double]): Unit = ???

        /** Performs the given action for each remaining element until all elements
         *  have been processed or the action throws an exception.
         */
        @stub
        def forEachRemaining(action: DoubleConsumer): Unit = ???

        /** Returns the next element in the iteration. */
        @stub
        def next(): Double = ???

        /** Returns the next double element in the iteration. */
        @stub
        def nextDouble(): Double = ???
    }


    /** An Iterator specialized for int values. */
    trait OfInt extends PrimitiveIterator[Integer, IntConsumer] {

        /** Performs the given action for each remaining element until all elements
         *  have been processed or the action throws an exception.
         */
        @stub
        def forEachRemaining(action: Consumer[_ >: Integer]): Unit = ???

        /** Performs the given action for each remaining element until all elements
         *  have been processed or the action throws an exception.
         */
        @stub
        def forEachRemaining(action: IntConsumer): Unit = ???

        /** Returns the next element in the iteration. */
        @stub
        def next(): Integer = ???

        /** Returns the next int element in the iteration. */
        @stub
        def nextInt(): Int = ???
    }


    /** An Iterator specialized for long values. */
    trait OfLong extends PrimitiveIterator[Long, LongConsumer] {

        /** Performs the given action for each remaining element until all elements
         *  have been processed or the action throws an exception.
         */
        @stub
        def forEachRemaining(action: Consumer[_ >: Long]): Unit = ???

        /** Performs the given action for each remaining element until all elements
         *  have been processed or the action throws an exception.
         */
        @stub
        def forEachRemaining(action: LongConsumer): Unit = ???

        /** Returns the next element in the iteration. */
        @stub
        def next(): Long = ???

        /** Returns the next long element in the iteration. */
        @stub
        def nextLong(): Long = ???
    }

}
