package java.util

import java.lang.Object

// An abstract Spliterator that implements trySplit to
// permit limited parallelism.
//
// An extending class need only
// implement tryAdvance.
// The extending class should override
// forEach if it can
// provide a more performant implementation.
object abstract Spliterators.AbstractSpliterator[T] extends Object with Spliterator[T] {

    @stub
    // Returns a set of characteristics of this Spliterator and its
    // elements.
    def characteristics(): Int = ???

    @stub
    // Returns an estimate of the number of elements that would be
    // encountered by a Spliterator.forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
    def estimateSize(): Long = ???
}
