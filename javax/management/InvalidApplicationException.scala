package javax.management

import java.lang.{Exception, Object, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when an attempt is made to apply either of the following: A
 *  subquery expression to an MBean or a qualified attribute expression
 *  to an MBean of the wrong class.  This exception is used internally
 *  by JMX during the evaluation of a query.  User code does not
 *  usually see it.
 */
class InvalidApplicationException extends Exception {

    /** Constructs an InvalidApplicationException with the specified Object. */
    @stub
    def this(val: Any) = ???
}
