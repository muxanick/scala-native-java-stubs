package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts two input arguments and returns no
 *  result.  This is the two-arity specialization of Consumer.
 *  Unlike most other functional interfaces, BiConsumer is expected
 *  to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(Object, Object).
 */
@FunctionalInterface
trait BiConsumer[T, U] {

    /** Performs this operation on the given arguments. */
    @stub
    def accept(t: T, u: U): Unit = ???

    /** Returns a composed BiConsumer that performs, in sequence, this
     *  operation followed by the after operation.
     */
    @stub
    def andThen(after: BiConsumer[_ >: T, _ >: U]): BiConsumer[T, U] = ???
}
