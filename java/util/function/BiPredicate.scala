package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a predicate (boolean-valued function) of two arguments.  This is
 *  the two-arity specialization of Predicate.
 * 
 *  This is a functional interface
 *  whose functional method is test(Object, Object).
 */
@FunctionalInterface trait BiPredicate[T, U] {

    /** Returns a composed predicate that represents a short-circuiting logical
     *  AND of this predicate and another.
     */
    @stub
    val BiPredicate[T, U]: default = ???

    /** Returns a predicate that represents the logical negation of this
     *  predicate.
     */
    @stub
    val BiPredicate[T, U]: default = ???

    /** Returns a composed predicate that represents a short-circuiting logical
     *  OR of this predicate and another.
     */
    @stub
    val BiPredicate[T, U]: default = ???

    /** Evaluates this predicate on the given arguments. */
    @stub
    def test(t: T, u: U): Boolean = ???
}
