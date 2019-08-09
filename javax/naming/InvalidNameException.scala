package javax.naming

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception indicates that the name being specified does
 *  not conform to the naming syntax of a naming system.
 *  This exception is thrown by any of the methods that does name
 *  parsing (such as those in Context, DirContext, CompositeName and CompoundName).
 *  
 *  Synchronization and serialization issues that apply to NamingException
 *  apply directly here.
 */
class InvalidNameException extends NamingException {

    /** Constructs an instance of InvalidNameException with
     *  all fields set to null.
     */
    @stub
    def this() = ???

    /** Constructs an instance of InvalidNameException using an
     *  explanation of the problem.
     */
    @stub
    def this(explanation: String) = ???
}
