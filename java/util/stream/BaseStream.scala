package java.util.stream

import java.lang.{AutoCloseable, Runnable}
import java.util.{Iterator, Spliterator}
import scala.scalanative.annotation.stub

/** Base interface for streams, which are sequences of elements supporting
 *  sequential and parallel aggregate operations.  The following example
 *  illustrates an aggregate operation using the stream types Stream
 *  and IntStream, computing the sum of the weights of the red widgets:
 * 
 *  
 *      int sum = widgets.stream()
 *                       .filter(w -> w.getColor() == RED)
 *                       .mapToInt(w -> w.getWeight())
 *                       .sum();
 *  
 * 
 *  See the class documentation for Stream and the package documentation
 *  for java.util.stream for additional
 *  specification of streams, stream operations, stream pipelines, and
 *  parallelism, which governs the behavior of all stream types.
 */
trait BaseStream[T, S <: BaseStream[T, S]] extends AutoCloseable {

    /** Closes this stream, causing all close handlers for this stream pipeline
     *  to be called.
     */
    @stub
    def close(): Unit = ???

    /** Returns whether this stream, if a terminal operation were to be executed,
     *  would execute in parallel.
     */
    @stub
    def isParallel(): Boolean = ???

    /** Returns an iterator for the elements of this stream. */
    @stub
    def iterator(): Iterator[T] = ???

    /** Returns an equivalent stream with an additional close handler. */
    @stub
    def onClose(closeHandler: Runnable): S = ???

    /** Returns an equivalent stream that is parallel. */
    @stub
    def parallel(): S = ???

    /** Returns an equivalent stream that is sequential. */
    @stub
    def sequential(): S = ???

    /** Returns a spliterator for the elements of this stream. */
    @stub
    def spliterator(): Spliterator[T] = ???

    /** Returns an equivalent stream that is
     *  unordered.
     */
    @stub
    def unordered(): S = ???
}
