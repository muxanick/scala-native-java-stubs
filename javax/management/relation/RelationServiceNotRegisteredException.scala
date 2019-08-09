package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

/** This exception is raised when an access is done to the Relation Service and
 *  that one is not registered.
 */
class RelationServiceNotRegisteredException extends RelationException {

    /** Default constructor, no message put in exception. */
    @stub
    def this() = ???
}
