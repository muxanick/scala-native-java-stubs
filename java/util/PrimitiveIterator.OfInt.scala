package java.util

import java.lang.Integer
import java.util.function.{Consumer, IntConsumer}
import scala.scalanative.annotation.stub

/** An Iterator specialized for int values. */
trait PrimitiveIterator_OfInt extends PrimitiveIterator[Integer, IntConsumer] {

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
