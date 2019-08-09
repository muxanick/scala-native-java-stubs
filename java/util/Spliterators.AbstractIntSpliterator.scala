package java.util

import java.lang.Object

/** An abstract Spliterator.OfInt that implements trySplit to
 *  permit limited parallelism.
 * 
 *  To implement a spliterator an extending class need only
 *  implement Spliterator.OfInt.tryAdvance(java.util.function.IntConsumer)
 *  tryAdvance}.  The extending class should override
 *  Spliterator.OfInt.forEachRemaining(java.util.function.IntConsumer) forEach} if it
 *  can provide a more performant implementation.
 */
object abstract Spliterators.AbstractIntSpliterator extends Object with Spliterator.OfInt {

    /** Returns a set of characteristics of this Spliterator and its
     *  elements.
     */
    @stub
    def characteristics(): Int = ???

    /** Returns an estimate of the number of elements that would be
     *  encountered by a Spliterator.forEachRemaining(java.util.function.Consumer<? super T>) traversal, or returns Long.MAX_VALUE if infinite, unknown, or too expensive to compute.
     */
    @stub
    def estimateSize(): Long = ???
}
