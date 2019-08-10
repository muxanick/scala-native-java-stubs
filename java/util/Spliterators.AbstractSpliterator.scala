package java.util

import java.lang.Object
import scala.scalanative.annotation.stub

/** An abstract Spliterator that implements trySplit to
 *  permit limited parallelism.
 * 
 *  An extending class need only
 *  implement tryAdvance.
 *  The extending class should override
 *  forEach if it can
 *  provide a more performant implementation.
 */
object abstract Spliterators_AbstractSpliterator[T] extends Object with Spliterator[T] {

    /** Creates a spliterator reporting the given estimated size and
     *  additionalCharacteristics.
     */
    @stub
    protected def AbstractSpliterator(est: Long, additionalCharacteristics: Int) = ???

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

    /** If this spliterator can be partitioned, returns a Spliterator
     *  covering elements, that will, upon return from this method, not
     *  be covered by this Spliterator.
     */
    @stub
    def trySplit(): Spliterator[T] = ???
}
