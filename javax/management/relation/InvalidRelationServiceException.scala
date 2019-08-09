package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

// This exception is raised when an invalid Relation Service is provided.
class InvalidRelationServiceException extends RelationException {

    @stub
    // Default constructor, no message put in exception.
    def this() = ???
}
