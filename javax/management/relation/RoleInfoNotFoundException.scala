package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

/** This exception is raised when there is no role info with given name in a
 *  given relation type.
 */
class RoleInfoNotFoundException extends RelationException {

    /** Default constructor, no message put in exception. */
    @stub
    def this() = ???
}
