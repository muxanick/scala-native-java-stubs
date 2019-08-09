package javax.management.openmbean

import java.lang.{Exception, Object, String, Throwable}
import javax.management.JMException
import scala.scalanative.annotation.stub

/** This checked exception is thrown when an open type, an open data  or an open MBean metadata info instance
 *  could not be constructed because one or more validity constraints were not met.
 */
class OpenDataException extends JMException {

    /** An OpenDataException with no detail message. */
    @stub
    def this() = ???

    /** An OpenDataException with a detail message. */
    @stub
    def this(msg: String) = ???
}
