package javax.management.relation

import java.lang.{Exception, Object, String, Throwable}
import javax.management.JMException
import scala.scalanative.annotation.stub

/** This exception is raised when there is no role info with given name in a
 *  given relation type.
 */
class RoleInfoNotFoundException extends RelationException {

    /** Default constructor, no message put in exception. */
    @stub
    def this() = ???

    /** Constructor with given message put in exception. */
    @stub
    def this(message: String) = ???
}
