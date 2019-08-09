package java.util

import java.lang.Integer
import java.util.function.{Consumer, IntConsumer}

// A Spliterator specialized for int values.
object trait Spliterator.OfInt extends Spliterator.OfPrimitive[Integer, IntConsumer, Spliterator.OfInt] {

    @stub
    // Performs the given action for each remaining element, sequentially in
    // the current thread, until all elements have been processed or the action
    // throws an exception.
    def Unit: default = ???

    @stub
    // Performs the given action for each remaining element, sequentially in
    // the current thread, until all elements have been processed or the
    // action throws an exception.
    def Unit: default = ???

    @stub
    // If a remaining element exists, performs the given action on it,
    // returning true; else returns false.
    def Boolean: default = ???

    @stub
    // If a remaining element exists, performs the given action on it,
    // returning true; else returns false.
    def tryAdvance(action: IntConsumer): Boolean = ???
}
