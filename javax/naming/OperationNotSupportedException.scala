package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when a context implementation does not support
 *  the operation being invoked.
 *  For example, if a server does not support the Context.bind() method
 *  it would throw OperationNotSupportedException when the bind() method
 *  is invoked on it.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class OperationNotSupportedException extends NamingException {

    /** Constructs a new instance of OperationNotSupportedException. */
    @stub
    def this() = ???

    /** Constructs a new instance of OperationNotSupportedException using an
     *  explanation.
     */
    @stub
    def this(explanation: String) = ???
}
