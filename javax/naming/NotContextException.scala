package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when a naming operation proceeds to a point
 *  where a context is required to continue the operation, but the
 *  resolved object is not a context. For example, Context.destroy() requires
 *  that the named object be a context. If it is not, NotContextException
 *  is thrown. Another example is a non-context being encountered during
 *  the resolution phase of the Context methods.
 * 
 *  It is also thrown when a particular subtype of context is required,
 *  such as a DirContext, and the resolved object is a context but not of
 *  the required subtype.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class NotContextException extends NamingException {

    /** Constructs a new instance of NotContextException. */
    @stub
    def this() = ???

    /** Constructs a new instance of NotContextException using an
     *  explanation.
     */
    @stub
    def this(explanation: String) = ???
}
