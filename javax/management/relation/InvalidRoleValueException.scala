package javax.management.relation

import java.lang.{Exception, Object, String, Throwable}
import javax.management.JMException
import scala.scalanative.annotation.stub

/** Role value is invalid.
 *  This exception is raised when, in a role, the number of referenced MBeans
 *  in given value is less than expected minimum degree, or the number of
 *  referenced MBeans in provided value exceeds expected maximum degree, or
 *  one referenced MBean in the value is not an Object of the MBean
 *  class expected for that role, or an MBean provided for that role does not
 *  exist.
 */
class InvalidRoleValueException extends RelationException {

    /** Default constructor, no message put in exception. */
    @stub
    def this() = ???

    /** Constructor with given message put in exception. */
    @stub
    def this(message: String) = ???
}
