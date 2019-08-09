package java.util

/** A Spliterator specialized for primitive values. */
object trait Spliterator.OfPrimitive[T, T_CONS, T_SPLITR <: Spliterator.OfPrimitive[T, T_CONS, T_SPLITR]] extends Spliterator[T] {

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
    def tryAdvance(action: T_CONS): Boolean = ???
}
