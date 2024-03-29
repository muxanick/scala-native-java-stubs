package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when
 *  a loop was detected will attempting to resolve a link, or an implementation
 *  specific limit on link counts has been reached.
 *  
 *  Synchronization and serialization issues that apply to LinkException
 *  apply directly here.
 */
class LinkLoopException extends LinkException {

    /** Constructs a new instance of LinkLoopException. */
    @stub
    def this() = ???

    /** Constructs a new instance of LinkLoopException with an explanation
     *  All the other fields are initialized to null.
     */
    @stub
    def this(explanation: String) = ???
}
