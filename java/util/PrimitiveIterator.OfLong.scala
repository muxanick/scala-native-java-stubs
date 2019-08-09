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
    val Unit: default = ???

    /** Performs the given action for each remaining element until all elements
     *  have been processed or the action throws an exception.
     */
    @stub
    val Unit: default = ???

    /** Returns the next element in the iteration. */
    @stub
    val Long: default = ???

    /** Returns the next long element in the iteration. */
    @stub
    def nextLong(): Long = ???
}
