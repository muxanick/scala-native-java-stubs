package java.util

import java.lang.Integer
import java.util.function.{Consumer, IntConsumer}

/** A Spliterator specialized for int values. */
object trait Spliterator.OfInt extends Spliterator.OfPrimitive[Integer, IntConsumer, Spliterator.OfInt] {

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
    def tryAdvance(action: IntConsumer): Boolean = ???
}
