package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts a single double-valued argument and
 *  returns no result.  This is the primitive type specialization of
 *  Consumer for double.  Unlike most other functional interfaces,
 *  DoubleConsumer is expected to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(double).
 */
@FunctionalInterface trait DoubleConsumer {

    /** Performs this operation on the given argument. */
    @stub
    def accept(value: Double): Unit = ???

    /** Returns a composed DoubleConsumer that performs, in sequence, this
     *  operation followed by the after operation.
     */
    @stub
    def andThen(after: DoubleConsumer): DoubleConsumer = ???
}
