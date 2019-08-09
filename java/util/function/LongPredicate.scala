package java.util.function

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** Represents a predicate (boolean-valued function) of one long-valued
 *  argument. This is the long-consuming primitive type specialization of
 *  Predicate.
 * 
 *  This is a functional interface
 *  whose functional method is test(long).
 */
@FunctionalInterface trait LongPredicate {

    /** Returns a composed predicate that represents a short-circuiting logical
     *  AND of this predicate and another.
     */
    @stub
    def and(other: LongPredicate): LongPredicate = ???

    /** Returns a predicate that represents the logical negation of this
     *  predicate.
     */
    @stub
    def negate(): LongPredicate = ???

    /** Returns a composed predicate that represents a short-circuiting logical
     *  OR of this predicate and another.
     */
    @stub
    def or(other: LongPredicate): LongPredicate = ???

    /** Evaluates this predicate on the given argument. */
    @stub
    def test(value: Long): Boolean = ???
}
