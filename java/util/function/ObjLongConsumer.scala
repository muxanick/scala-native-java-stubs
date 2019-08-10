package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts an object-valued and a
 *  long-valued argument, and returns no result.  This is the
 *  (reference, long) specialization of BiConsumer.
 *  Unlike most other functional interfaces, ObjLongConsumer is
 *  expected to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(Object, long).
 */
@FunctionalInterface
trait ObjLongConsumer[T] {

    /** Performs this operation on the given arguments. */
    @stub
    def accept(t: T, value: Long): Unit = ???
}
