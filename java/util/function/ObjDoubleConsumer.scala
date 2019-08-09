package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts an object-valued and a
 *  double-valued argument, and returns no result.  This is the
 *  (reference, double) specialization of BiConsumer.
 *  Unlike most other functional interfaces, ObjDoubleConsumer is
 *  expected to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(Object, double).
 */
@FunctionalInterface trait ObjDoubleConsumer[T] {

    /** Performs this operation on the given arguments. */
    @stub
    def accept(t: T, value: Double): Unit = ???
}
