package java.util.function

import java.lang.{FunctionalInterface, Object}
import scala.scalanative.annotation.stub

/** Represents a predicate (boolean-valued function) of one argument.
 * 
 *  This is a functional interface
 *  whose functional method is test(Object).
 */
@FunctionalInterface trait Predicate[T] {

    /** Returns a composed predicate that represents a short-circuiting logical
     *  AND of this predicate and another.
     */
    @stub
    def and(other: Predicate[_ >: T]): Predicate[T] = ???

    /** Returns a predicate that represents the logical negation of this
     *  predicate.
     */
    @stub
    def negate(): Predicate[T] = ???

    /** Returns a composed predicate that represents a short-circuiting logical
     *  OR of this predicate and another.
     */
    @stub
    def or(other: Predicate[_ >: T]): Predicate[T] = ???

    /** Evaluates this predicate on the given argument. */
    @stub
    def test(t: T): Boolean = ???
}

object Predicate {
    /** Returns a predicate that tests if two arguments are equal according
     *  to Objects.equals(Object, Object).
     */
    @stub
    def isEqual[T](targetRef: Object): Predicate[T] = ???
}
