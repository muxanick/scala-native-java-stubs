package javax.management

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when an invalid expression is passed to a method for
 *  constructing a query.  This exception is used internally by JMX
 *  during the evaluation of a query.  User code does not usually see
 *  it.
 */
class BadBinaryOpValueExpException extends Exception {

    /** Constructs a BadBinaryOpValueExpException with the specified ValueExp. */
    @stub
    def this(exp: ValueExp) = ???

    /** Returns the ValueExp that originated the exception. */
    @stub
    def getExp(): ValueExp = ???

    /** Returns the string representing the object. */
    @stub
    def toString(): String = ???
}
