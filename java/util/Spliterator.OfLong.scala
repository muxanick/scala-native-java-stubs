package java.util

import java.lang.Long
import java.util.function.{Consumer, LongConsumer}

/** A Spliterator specialized for long values. */
object trait Spliterator.OfLong extends Spliterator.OfPrimitive[Long, LongConsumer, Spliterator.OfLong] {

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
    def tryAdvance(action: LongConsumer): Boolean = ???
}
