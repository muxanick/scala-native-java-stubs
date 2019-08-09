package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

// This exception is raised when there is no relation type with given name in
// Relation Service.
class RelationTypeNotFoundException extends RelationException {

    @stub
    // Default constructor, no message put in exception.
    def this() = ???
}
