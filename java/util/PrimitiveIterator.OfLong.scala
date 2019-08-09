package java.util

import java.lang.Long
import java.util.function.{Consumer, LongConsumer}
import scala.scalanative.annotation.stub

/** An Iterator specialized for long values. */
object trait PrimitiveIterator.OfLong extends PrimitiveIterator[Long, LongConsumer] {

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
