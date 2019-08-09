package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when a malformed link was encountered while
 *  resolving or constructing a link.
 *  
 *  Synchronization and serialization issues that apply to LinkException
 *  apply directly here.
 */
class MalformedLinkException extends LinkException {

    /** Constructs a new instance of Malformed LinkException. */
    @stub
    def this() = ???

    /** Constructs a new instance of MalformedLinkException with an explanation
     *  All the other fields are initialized to null.
     */
    @stub
    def this(explanation: String) = ???
}
