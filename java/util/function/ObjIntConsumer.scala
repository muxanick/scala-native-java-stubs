package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts an object-valued and a
 *  int-valued argument, and returns no result.  This is the
 *  (reference, int) specialization of BiConsumer.
 *  Unlike most other functional interfaces, ObjIntConsumer is
 *  expected to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(Object, int).
 */
@FunctionalInterface
trait ObjIntConsumer[T] {

    /** Performs this operation on the given arguments. */
    @stub
    def accept(t: T, value: Int): Unit = ???
}
