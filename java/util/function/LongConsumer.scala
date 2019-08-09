package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents an operation that accepts a single long-valued argument and
 *  returns no result.  This is the primitive type specialization of
 *  Consumer for long.  Unlike most other functional interfaces,
 *  LongConsumer is expected to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(long).
 */
@FunctionalInterface trait LongConsumer {

    /** Performs this operation on the given argument. */
    @stub
    def accept(value: Long): Unit = ???

    /** Returns a composed LongConsumer that performs, in sequence, this
     *  operation followed by the after operation.
     */
    @stub
    val this: default = ???
}
