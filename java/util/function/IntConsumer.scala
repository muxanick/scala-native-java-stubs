package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts a single int-valued argument and
 *  returns no result.  This is the primitive type specialization of
 *  Consumer for int.  Unlike most other functional interfaces,
 *  IntConsumer is expected to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(int).
 */
@FunctionalInterface trait IntConsumer {

    /** Performs this operation on the given argument. */
    @stub
    def accept(value: Int): Unit = ???

    /** Returns a composed IntConsumer that performs, in sequence, this
     *  operation followed by the after operation.
     */
    @stub
    val this: default = ???
}
