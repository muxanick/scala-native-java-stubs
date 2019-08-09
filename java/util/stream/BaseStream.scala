package java.util.stream

import java.lang.{AutoCloseable, Runnable}
import java.util.{Iterator, Spliterator}

// Base interface for streams, which are sequences of elements supporting
// sequential and parallel aggregate operations.  The following example
// illustrates an aggregate operation using the stream types Stream
// and IntStream, computing the sum of the weights of the red widgets:
//
// 
//     int sum = widgets.stream()
//                      .filter(w -> w.getColor() == RED)
//                      .mapToInt(w -> w.getWeight())
//                      .sum();
// 
//
// See the class documentation for Stream and the package documentation
// for java.util.stream for additional
// specification of streams, stream operations, stream pipelines, and
// parallelism, which governs the behavior of all stream types.
trait BaseStream[T, S <: BaseStream[T, S]] extends AutoCloseable {

    @stub
    // Closes this stream, causing all close handlers for this stream pipeline
    // to be called.
    def close(): Unit = ???

    @stub
    // Returns whether this stream, if a terminal operation were to be executed,
    // would execute in parallel.
    def isParallel(): Boolean = ???

    @stub
    // Returns an iterator for the elements of this stream.
    def iterator(): Iterator[T] = ???

    @stub
    // Returns an equivalent stream with an additional close handler.
    def onClose(closeHandler: Runnable): S = ???

    @stub
    // Returns an equivalent stream that is parallel.
    def parallel(): S = ???

    @stub
    // Returns an equivalent stream that is sequential.
    def sequential(): S = ???

    @stub
    // Returns a spliterator for the elements of this stream.
    def spliterator(): Spliterator[T] = ???
}
