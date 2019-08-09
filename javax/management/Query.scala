package javax.management

import java.lang.{Number, Object, String}

// Constructs query object constraints.
//
// The MBean Server can be queried for MBeans that meet a particular
// condition, using its queryNames or
// queryMBeans method.  The QueryExp
// parameter to the method can be any implementation of the interface
// QueryExp, but it is usually best to obtain the QueryExp
// value by calling the static methods in this class.  This is particularly
// true when querying a remote MBean Server: a custom implementation of the
// QueryExp interface might not be present in the remote MBean Server,
// but the methods in this class return only standard classes that are
// part of the JMX implementation.
//
// As an example, suppose you wanted to find all MBeans where the Enabled attribute is true and the Owner attribute is "Duke". Here is how you could construct the appropriate QueryExp by
// chaining together method calls:
//
// 
// QueryExp query =
//     Query.and(Query.eq(Query.attr("Enabled"), Query.value(true)),
//               Query.eq(Query.attr("Owner"), Query.value("Duke")));
// 
class Query extends Object {
}

object Query {
    @stub
    // A code representing the div(javax.management.ValueExp, javax.management.ValueExp) expression.
    def DIV: Int = ???

    @stub
    // A code representing the eq(javax.management.ValueExp, javax.management.ValueExp) query.
    def EQ: Int = ???

    @stub
    // A code representing the geq(javax.management.ValueExp, javax.management.ValueExp) query.
    def GE: Int = ???

    @stub
    // A code representing the gt(javax.management.ValueExp, javax.management.ValueExp) query.
    def GT: Int = ???

    @stub
    // A code representing the leq(javax.management.ValueExp, javax.management.ValueExp) query.
    def LE: Int = ???

    @stub
    // A code representing the lt(javax.management.ValueExp, javax.management.ValueExp) query.
    def LT: Int = ???

    @stub
    // A code representing the minus(javax.management.ValueExp, javax.management.ValueExp) expression.
    def MINUS: Int = ???

    @stub
    // A code representing the plus(javax.management.ValueExp, javax.management.ValueExp) expression.
    def PLUS: Int = ???

    @stub
    // Returns a query expression that is the conjunction of two other query
    // expressions.
    def and(q1: QueryExp, q2: QueryExp): QueryExp = ???

    @stub
    // Returns a query expression that represents a matching constraint on
    // a string argument.
    def anySubString(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    @stub
    // Returns a new attribute expression.
    def attr(name: String): AttributeValueExp = ???

    @stub
    // Returns a new qualified attribute expression.
    def attr(className: String, name: String): AttributeValueExp = ???

    @stub
    // Returns a query expression that represents the constraint that one
    // value is between two other values.
    def between(v1: ValueExp, v2: ValueExp, v3: ValueExp): QueryExp = ???

    @stub
    // Returns a new class attribute expression which can be used in any
    // Query call that expects a ValueExp.
    def classattr(): AttributeValueExp = ???

    @stub
    // Returns a binary expression representing the quotient of two numeric
    // values.
    def div(value1: ValueExp, value2: ValueExp): ValueExp = ???

    @stub
    // Returns a query expression that represents an equality constraint on
    // two values.
    def eq(v1: ValueExp, v2: ValueExp): QueryExp = ???

    @stub
    // Returns a query expression that represents a matching constraint on
    // a string argument.
    def finalSubString(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    @stub
    // Returns a query expression that represents a "greater than or equal
    // to" constraint on two values.
    def geq(v1: ValueExp, v2: ValueExp): QueryExp = ???

    @stub
    // Returns a query expression that represents a "greater than" constraint on
    // two values.
    def gt(v1: ValueExp, v2: ValueExp): QueryExp = ???

    @stub
    // Returns an expression constraining a value to be one of an explicit list.
    def in(val: ValueExp, valueList: Array[ValueExp]): QueryExp = ???

    @stub
    // Returns a query expression that represents a matching constraint on
    // a string argument.
    def initialSubString(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    @stub
    // Returns a query expression that represents an inheritance constraint
    // on an MBean class.
    def isInstanceOf(classNameValue: StringValueExp): QueryExp = ???

    @stub
    // Returns a query expression that represents a "less than or equal to"
    // constraint on two values.
    def leq(v1: ValueExp, v2: ValueExp): QueryExp = ???

    @stub
    // Returns a query expression that represents a "less than" constraint on
    // two values.
    def lt(v1: ValueExp, v2: ValueExp): QueryExp = ???

    @stub
    // Returns a query expression that represents a matching constraint on
    // a string argument.
    def match(a: AttributeValueExp, s: StringValueExp): QueryExp = ???

    @stub
    // Returns a binary expression representing the difference between two numeric
    // values.
    def minus(value1: ValueExp, value2: ValueExp): ValueExp = ???

    @stub
    // Returns a constraint that is the negation of its argument.
    def not(queryExp: QueryExp): QueryExp = ???

    @stub
    // Returns a query expression that is the disjunction of two other query
    // expressions.
    def or(q1: QueryExp, q2: QueryExp): QueryExp = ???

    @stub
    // Returns a binary expression representing the sum of two numeric values,
    // or the concatenation of two string values.
    def plus(value1: ValueExp, value2: ValueExp): ValueExp = ???

    @stub
    // Returns a binary expression representing the product of two numeric values.
    def times(value1: ValueExp, value2: ValueExp): ValueExp = ???

    @stub
    // Returns a boolean value expression that can be used in any Query call
    // that expects a ValueExp.
    def value(val: Boolean): ValueExp = ???

    @stub
    // Returns a numeric value expression that can be used in any Query call
    // that expects a ValueExp.
    def value(val: double): ValueExp = ???

    @stub
    // Returns a numeric value expression that can be used in any Query call
    // that expects a ValueExp.
    def value(val: float): ValueExp = ???

    @stub
    // Returns a numeric value expression that can be used in any Query call
    // that expects a ValueExp.
    def value(val: Int): ValueExp = ???

    @stub
    // Returns a numeric value expression that can be used in any Query call
    // that expects a ValueExp.
    def value(val: Long): ValueExp = ???

    @stub
    // Returns a numeric value expression that can be used in any Query call
    // that expects a ValueExp.
    def value(val: Number): ValueExp = ???
}
