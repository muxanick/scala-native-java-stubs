package java.util.function

import java.lang.FunctionalInterface

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
}
