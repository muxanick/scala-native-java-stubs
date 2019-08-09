package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

// This exception is raised when relation id provided for a relation is already
// used.
class InvalidRelationIdException extends RelationException {

    @stub
    // Default constructor, no message put in exception.
    def this() = ???
}
