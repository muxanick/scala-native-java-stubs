package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

// This exception is raised when, in a role info, its minimum degree is greater
// than its maximum degree.
class InvalidRoleInfoException extends RelationException {

    @stub
    // Default constructor, no message put in exception.
    def this() = ???
}
