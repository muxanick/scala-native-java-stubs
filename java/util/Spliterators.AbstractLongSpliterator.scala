package java.util

import java.lang.Object

/** An abstract Spliterator.OfLong that implements trySplit
 *  to permit limited parallelism.
 * 
 *  To implement a spliterator an extending class need only
 *  implement Spliterator.OfLong.tryAdvance(java.util.function.LongConsumer)
 *  tryAdvance}.  The extending class should override
 *  Spliterator.OfLong.forEachRemaining(java.util.function.LongConsumer) forEach} if it
 *  can provide a more performant implementation.
 */
object abstract Spliterators.AbstractLongSpliterator extends Object with Spliterator.OfLong {

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
