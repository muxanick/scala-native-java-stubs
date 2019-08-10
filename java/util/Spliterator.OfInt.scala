package java.util

import java.lang.Integer
import java.util.function.{Consumer, IntConsumer}
import scala.scalanative.annotation.stub

/** A Spliterator specialized for int values. */
trait Spliterator_OfInt extends Spliterator.OfPrimitive[Integer, IntConsumer, Spliterator.OfInt] {

    /** Performs the given action for each remaining element, sequentially in
     *  the current thread, until all elements have been processed or the action
     *  throws an exception.
     */
    @stub
    def forEachRemaining(action: Consumer[_ >: Integer]): Unit = ???

    /** Performs the given action for each remaining element, sequentially in
     *  the current thread, until all elements have been processed or the
     *  action throws an exception.
     */
    @stub
    def forEachRemaining(action: IntConsumer): Unit = ???

    /** If a remaining element exists, performs the given action on it,
     *  returning true; else returns false.
     */
    @stub
    def tryAdvance(action: Consumer[_ >: Integer]): Boolean = ???

    /** If a remaining element exists, performs the given action on it,
     *  returning true; else returns false.
     */
    @stub
    def tryAdvance(action: IntConsumer): Boolean = ???

    /** If this spliterator can be partitioned, returns a Spliterator
     *  covering elements, that will, upon return from this method, not
     *  be covered by this Spliterator.
     */
    @stub
    def trySplit(): Spliterator.OfInt = ???
}
