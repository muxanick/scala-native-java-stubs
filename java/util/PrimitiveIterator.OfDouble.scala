package java.util

import java.lang.Double
import java.util.function.{Consumer, DoubleConsumer}
import scala.scalanative.annotation.stub

/** An Iterator specialized for double values. */
object trait PrimitiveIterator.OfDouble extends PrimitiveIterator[Double, DoubleConsumer] {

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
