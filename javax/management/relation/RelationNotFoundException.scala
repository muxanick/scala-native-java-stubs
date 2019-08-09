package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

/** This exception is raised when there is no relation for a given relation id
 *  in a Relation Service.
 */
class RelationNotFoundException extends RelationException {

    /** Default constructor, no message put in exception. */
    @stub
    def this() = ???
}
