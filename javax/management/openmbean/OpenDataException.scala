package javax.management.openmbean

import java.lang.{Exception, Object, Throwable}
import javax.management.JMException

// This checked exception is thrown when an open type, an open data  or an open MBean metadata info instance
// could not be constructed because one or more validity constraints were not met.
class OpenDataException extends JMException {

    @stub
    // An OpenDataException with no detail message.
    def this() = ???
}
