package java.util

import java.lang.Integer
import java.util.function.{Consumer, IntConsumer}
import scala.scalanative.annotation.stub

/** An Iterator specialized for int values. */
object trait PrimitiveIterator.OfInt extends PrimitiveIterator[Integer, IntConsumer] {

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
    val Integer: default = ???

    /** Returns the next int element in the iteration. */
    @stub
    def nextInt(): Int = ???
}
