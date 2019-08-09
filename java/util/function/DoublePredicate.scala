package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a predicate (boolean-valued function) of one double-valued
 *  argument. This is the double-consuming primitive type specialization
 *  of Predicate.
 * 
 *  This is a functional interface
 *  whose functional method is test(double).
 */
@FunctionalInterface trait DoublePredicate {

    /** Returns a composed predicate that represents a short-circuiting logical
     *  AND of this predicate and another.
     */
    @stub
    val this: default = ???

    /** Returns a predicate that represents the logical negation of this
     *  predicate.
     */
    @stub
    val this: default = ???

    /** Returns a composed predicate that represents a short-circuiting logical
     *  OR of this predicate and another.
     */
    @stub
    val this: default = ???

    /** Evaluates this predicate on the given argument. */
    @stub
    def test(value: Double): Boolean = ???
}
