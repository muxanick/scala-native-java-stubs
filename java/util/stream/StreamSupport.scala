package java.util.stream

import java.lang.Object
import java.util.{Spliterator, Spliterator.OfDouble, Spliterator.OfInt, Spliterator.OfLong}
import java.util.function.Supplier
import scala.scalanative.annotation.stub

/** Low-level utility methods for creating and manipulating streams.
 * 
 *  This class is mostly for library writers presenting stream views
 *  of data structures; most static stream methods intended for end users are in
 *  the various Stream classes.
 */
final class StreamSupport extends Object {
}

object StreamSupport {
    /** Creates a new sequential or parallel DoubleStream from a
     *  Spliterator.OfDouble.
     */
    @stub
    def doubleStream(spliterator: Spliterator.OfDouble, parallel: Boolean): DoubleStream = ???

    /** Creates a new sequential or parallel DoubleStream from a
     *  Supplier of Spliterator.OfDouble.
     */
    @stub
    def doubleStream(supplier: Supplier[_ <: Spliterator.OfDouble], characteristics: Int, parallel: Boolean): DoubleStream = ???

    /** Creates a new sequential or parallel IntStream from a
     *  Spliterator.OfInt.
     */
    @stub
    def intStream(spliterator: Spliterator.OfInt, parallel: Boolean): IntStream = ???

    /** Creates a new sequential or parallel IntStream from a
     *  Supplier of Spliterator.OfInt.
     */
    @stub
    def intStream(supplier: Supplier[_ <: Spliterator.OfInt], characteristics: Int, parallel: Boolean): IntStream = ???

    /** Creates a new sequential or parallel LongStream from a
     *  Spliterator.OfLong.
     */
    @stub
    def longStream(spliterator: Spliterator.OfLong, parallel: Boolean): LongStream = ???

    /** Creates a new sequential or parallel LongStream from a
     *  Supplier of Spliterator.OfLong.
     */
    @stub
    def longStream(supplier: Supplier[_ <: Spliterator.OfLong], characteristics: Int, parallel: Boolean): LongStream = ???

    /** Creates a new sequential or parallel Stream from a
     *  Spliterator.
     */
    @stub
    def stream[T](spliterator: Spliterator[T], parallel: Boolean): Stream[T] = ???

    /** Creates a new sequential or parallel Stream from a
     *  Supplier of Spliterator.
     */
    @stub
    def stream[T](supplier: Supplier[_ <: Spliterator[T]], characteristics: Int, parallel: Boolean): Stream[T] = ???
}
