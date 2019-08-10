package java.util

import java.lang.Long
import java.util.function.{Consumer, LongConsumer}
import scala.scalanative.annotation.stub

/** A Spliterator specialized for long values. */
trait Spliterator_OfLong extends Spliterator.OfPrimitive[Long, LongConsumer, Spliterator.OfLong] {

    /** Performs the given action for each remaining element, sequentially in
     *  the current thread, until all elements have been processed or the action
     *  throws an exception.
     */
    @stub
    def forEachRemaining(action: Consumer[_ >: Long]): Unit = ???

    /** Performs the given action for each remaining element, sequentially in
     *  the current thread, until all elements have been processed or the
     *  action throws an exception.
     */
    @stub
    def forEachRemaining(action: LongConsumer): Unit = ???

    /** If a remaining element exists, performs the given action on it,
     *  returning true; else returns false.
     */
    @stub
    def tryAdvance(action: Consumer[_ >: Long]): Boolean = ???

    /** If a remaining element exists, performs the given action on it,
     *  returning true; else returns false.
     */
    @stub
    def tryAdvance(action: LongConsumer): Boolean = ???

    /** If this spliterator can be partitioned, returns a Spliterator
     *  covering elements, that will, upon return from this method, not
     *  be covered by this Spliterator.
     */
    @stub
    def trySplit(): Spliterator.OfLong = ???
}
