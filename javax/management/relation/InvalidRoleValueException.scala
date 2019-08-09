package javax.management.relation

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

// Role value is invalid.
// This exception is raised when, in a role, the number of referenced MBeans
// in given value is less than expected minimum degree, or the number of
// referenced MBeans in provided value exceeds expected maximum degree, or
// one referenced MBean in the value is not an Object of the MBean
// class expected for that role, or an MBean provided for that role does not
// exist.
class InvalidRoleValueException extends RelationException {

    @stub
    // Default constructor, no message put in exception.
    def this() = ???
}
