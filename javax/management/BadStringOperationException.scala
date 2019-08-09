package javax.management

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when an invalid string operation is passed
 *  to a method for constructing a query.
 */
class BadStringOperationException extends Exception {

    /** Constructs a BadStringOperationException with the specified detail
     *  message.
     */
    @stub
    def this(message: String) = ???

    /** Returns the string representing the object. */
    @stub
    def toString(): String = ???
}
