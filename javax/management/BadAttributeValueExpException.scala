package javax.management

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when an invalid MBean attribute is passed to a query
 *  constructing method.  This exception is used internally by JMX
 *  during the evaluation of a query.  User code does not usually
 *  see it.
 */
class BadAttributeValueExpException extends Exception {

    /** Constructs a BadAttributeValueExpException using the specified Object to
     *  create the toString() value.
     */
    @stub
    def this(val: Any) = ???

    /** Returns the string representing the object. */
    @stub
    def toString(): String = ???
}
