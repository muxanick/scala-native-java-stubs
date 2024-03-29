package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown to indicate that the result being returned
 *  or returned so far is partial, and that the operation cannot
 *  be completed.  For example, when listing a context, this exception
 *  indicates that returned results only represents some of the bindings
 *  in the context.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class PartialResultException extends NamingException {

    /** Constructs a new instance of PartialResultException. */
    @stub
    def this() = ???

    /** Constructs a new instance of the exception using the explanation
     *  message specified.
     */
    @stub
    def this(explanation: String) = ???
}
