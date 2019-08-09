package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown by methods to indicate that
 *  a binding cannot be added because the name is already bound to
 *  another object.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class NameAlreadyBoundException extends NamingException {

    /** Constructs a new instance of NameAlreadyBoundException. */
    @stub
    def this() = ???

    /** Constructs a new instance of NameAlreadyBoundException using the
     *  explanation supplied.
     */
    @stub
    def this(explanation: String) = ???
}
