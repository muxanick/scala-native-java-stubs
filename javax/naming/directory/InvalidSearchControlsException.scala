package javax.naming.directory

import java.lang.{Exception, Object, String, Throwable}
import javax.naming.NamingException
import scala.scalanative.annotation.stub

/** This exception is thrown when the specification of
 *  the SearchControls for a search operation is invalid. For example, if the scope is
 *  set to a value other than OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE,
 *  this exception is thrown.
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class InvalidSearchControlsException extends NamingException {

    /** Constructs a new instance of InvalidSearchControlsException. */
    @stub
    def this() = ???

    /** Constructs a new instance of InvalidSearchControlsException
     *  with an explanation.
     */
    @stub
    def this(msg: String) = ???
}
