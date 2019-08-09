package java.util.function

import java.lang.FunctionalInterface

/** Represents an operation that accepts two input arguments and returns no
 *  result.  This is the two-arity specialization of Consumer.
 *  Unlike most other functional interfaces, BiConsumer is expected
 *  to operate via side-effects.
 * 
 *  This is a functional interface
 *  whose functional method is accept(Object, Object).
 */
@FunctionalInterface trait BiConsumer[T, U] {

    /** Performs this operation on the given arguments. */
    @stub
    def accept(t: T, u: U): Unit = ???
}
