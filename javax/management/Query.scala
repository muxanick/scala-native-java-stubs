package javax.management

import java.lang.{Number, Object, String}
import scala.scalanative.annotation.stub

/** Constructs query object constraints.
 * 
 *  The MBean Server can be queried for MBeans that meet a particular
 *  condition, using its queryNames or
 *  queryMBeans method.  The QueryExp
 *  parameter to the method can be any implementation of the interface
 *  QueryExp, but it is usually best to obtain the QueryExp
 *  value by calling the static methods in this class.  This is particularly
 *  true when querying a remote MBean Server: a custom implementation of the
 *  QueryExp interface might not be present in the remote MBean Server,
 *  but the methods in this class return only standard classes that are
 *  part of the JMX implementation.
 * 
 *  As an example, suppose you wanted to find all MBeans where the Enabled attribute is true and the Owner attribute is "Duke". Here is how you could construct the appropriate QueryExp by
 *  chaining together method calls:
 * 
 *  
 *  QueryExp query =
 *      Query.and(Query.eq(Query.attr("Enabled"), Query.value(true)),
 *                Query.eq(Query.attr("Owner"), Query.value("Duke")));
 *  
 */
class Query extends Object {

    /** Basic constructor. */
    @stub
    def this() = ???
}

object Query {
    /** A code representing the div(javax.management.ValueExp, javax.management.ValueExp) expression. */
    @stub
    val DIV: Int = ???

    /** A code representing the eq(javax.management.ValueExp, javax.management.ValueExp) query. */
    @stub
    val EQ: Int = ???

    /** A code representing the geq(javax.management.ValueExp, javax.management.ValueExp) query. */
    @stub
    val GE: Int = ???

    /** A code representing the gt(javax.management.ValueExp, javax.management.ValueExp) query. */
    @stub
    val GT: Int = ???

    /** A code representing the leq(javax.management.ValueExp, javax.management.ValueExp) query. */
    @stub
    val LE: Int = ???

    /** A code representing the lt(javax.management.ValueExp, javax.management.ValueExp) query. */
    @stub
    val LT: Int = ???

    /** A code representing the minus(javax.management.ValueExp, javax.management.ValueExp) expression. */
    @stub
    val MINUS: Int = ???

    /** A code representing the plus(javax.management.ValueExp, javax.management.ValueExp) expression. */
    @stub
    val PLUS: Int = ???

    /** A code representing the times(javax.management.ValueExp, javax.management.ValueExp) expression. */
    @stub
    val TIMES: Int = ???

    /** Returns a query expression that is the conjunction of two other query
     *  expressions.
     */
    @stub
    def and(q1: QueryExp, q2: QueryExp): QueryExp = ???

    /** Returns a query expression that represents a matching constraint on
     *  a string argument.
     */
    @stub
    def anySubString(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    /** Returns a new attribute expression. */
    @stub
    def attr(name: String): AttributeValueExp = ???

    /** Returns a new qualified attribute expression. */
    @stub
    def attr(className: String, name: String): AttributeValueExp = ???

    /** Returns a query expression that represents the constraint that one
     *  value is between two other values.
     */
    @stub
    def between(v1: ValueExp, v2: ValueExp, v3: ValueExp): QueryExp = ???

    /** Returns a new class attribute expression which can be used in any
     *  Query call that expects a ValueExp.
     */
    @stub
    def classattr(): AttributeValueExp = ???

    /** Returns a binary expression representing the quotient of two numeric
     *  values.
     */
    @stub
    def div(value1: ValueExp, value2: ValueExp): ValueExp = ???

    /** Returns a query expression that represents an equality constraint on
     *  two values.
     */
    @stub
    def eq(v1: ValueExp, v2: ValueExp): QueryExp = ???

    /** Returns a query expression that represents a matching constraint on
     *  a string argument.
     */
    @stub
    def finalSubString(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    /** Returns a query expression that represents a "greater than or equal
     *  to" constraint on two values.
     */
    @stub
    def geq(v1: ValueExp, v2: ValueExp): QueryExp = ???

    /** Returns a query expression that represents a "greater than" constraint on
     *  two values.
     */
    @stub
    def gt(v1: ValueExp, v2: ValueExp): QueryExp = ???

    /** Returns an expression constraining a value to be one of an explicit list. */
    @stub
    def in(val: ValueExp, valueList: Array[ValueExp]): QueryExp = ???

    /** Returns a query expression that represents a matching constraint on
     *  a string argument.
     */
    @stub
    def initialSubString(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    /** Returns a query expression that represents an inheritance constraint
     *  on an MBean class.
     */
    @stub
    def isInstanceOf(classNameValue: StringValueExp): QueryExp = ???

    /** Returns a query expression that represents a "less than or equal to"
     *  constraint on two values.
     */
    @stub
    def leq(v1: ValueExp, v2: ValueExp): QueryExp = ???

    /** Returns a query expression that represents a "less than" constraint on
     *  two values.
     */
    @stub
    def lt(v1: ValueExp, v2: ValueExp): QueryExp = ???

    /** Returns a query expression that represents a matching constraint on
     *  a string argument.
     */
    @stub
    def match(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    /** Returns a binary expression representing the difference between two numeric
     *  values.
     */
    @stub
    def minus(value1: ValueExp, value2: ValueExp): ValueExp = ???

    /** Returns a constraint that is the negation of its argument. */
    @stub
    def not(queryExp: QueryExp): QueryExp = ???

    /** Returns a query expression that is the disjunction of two other query
     *  expressions.
     */
    @stub
    def or(q1: QueryExp, q2: QueryExp): QueryExp = ???

    /** Returns a binary expression representing the sum of two numeric values,
     *  or the concatenation of two string values.
     */
    @stub
    def plus(value1: ValueExp, value2: ValueExp): ValueExp = ???

    /** Returns a binary expression representing the product of two numeric values. */
    @stub
    def times(value1: ValueExp, value2: ValueExp): ValueExp = ???

    /** Returns a boolean value expression that can be used in any Query call
     *  that expects a ValueExp.
     */
    @stub
    def value(val: Boolean): ValueExp = ???

    /** Returns a numeric value expression that can be used in any Query call
     *  that expects a ValueExp.
     */
    @stub
    def value(val: Double): ValueExp = ???

    /** Returns a numeric value expression that can be used in any Query call
     *  that expects a ValueExp.
     */
    @stub
    def value(val: Float): ValueExp = ???

    /** Returns a numeric value expression that can be used in any Query call
     *  that expects a ValueExp.
     */
    @stub
    def value(val: Int): ValueExp = ???

    /** Returns a numeric value expression that can be used in any Query call
     *  that expects a ValueExp.
     */
    @stub
    def value(val: Long): ValueExp = ???

    /** Returns a numeric value expression that can be used in any Query call
     *  that expects a ValueExp.
     */
    @stub
    def value(val: Number): ValueExp = ???

    /** Returns a new string expression. */
    @stub
    def value(val: String): StringValueExp = ???
}
