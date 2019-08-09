package javax.management

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Exceptions thrown by JMX implementations.
 *  It does not include the runtime exceptions.
 */
class JMException extends Exception {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Constructor that allows a specific error message to be specified. */
    @stub
    def this(msg: String) = ???
}
