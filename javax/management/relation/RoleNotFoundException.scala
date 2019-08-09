package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

/** This exception is raised when a role in a relation does not exist, or is not
 *  readable, or is not settable.
 */
class RoleNotFoundException extends RelationException {

    /** Default constructor, no message put in exception. */
    @stub
    def this() = ???
}
