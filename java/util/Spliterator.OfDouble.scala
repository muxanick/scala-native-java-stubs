package java.util

import java.lang.Double
import java.util.function.{Consumer, DoubleConsumer}
import scala.scalanative.annotation.stub

/** A Spliterator specialized for double values. */
object trait Spliterator.OfDouble extends Spliterator.OfPrimitive[Double, DoubleConsumer, Spliterator.OfDouble] {

    /** Performs the given action for each remaining element, sequentially in
     *  the current thread, until all elements have been processed or the action
     *  throws an exception.
     */
    @stub
    val Unit: default = ???

    /** Performs the given action for each remaining element, sequentially in
     *  the current thread, until all elements have been processed or the
     *  action throws an exception.
     */
    @stub
    val Unit: default = ???

    /** If a remaining element exists, performs the given action on it,
     *  returning true; else returns false.
     */
    @stub
    val Boolean: default = ???

    /** If a remaining element exists, performs the given action on it,
     *  returning true; else returns false.
     */
    @stub
    def tryAdvance(action: DoubleConsumer): Boolean = ???

    /** If this spliterator can be partitioned, returns a Spliterator
     *  covering elements, that will, upon return from this method, not
     *  be covered by this Spliterator.
     */
    @stub
    def trySplit(): Spliterator.OfDouble = ???
}
