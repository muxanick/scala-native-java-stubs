package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts a single input argument and returns no
 *  result. Unlike most other functional interfaces, Consumer is expected
 *  to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(Object).
 */
@FunctionalInterface trait Consumer[T] {

    /** Performs this operation on the given argument. */
    @stub
    def accept(t: T): Unit = ???

    /** Returns a composed Consumer that performs, in sequence, this
     *  operation followed by the after operation.
     */
    @stub
    def andThen(after: Consumer[_ >: T]): Consumer[T] = ???
}
