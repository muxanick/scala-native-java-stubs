package javax.management.monitor

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import javax.management.JMRuntimeException
import scala.scalanative.annotation.stub

/** Exception thrown by the monitor when a monitor setting becomes invalid while the monitor is running.
 *  
 *  As the monitor attributes may change at runtime, a check is performed before each observation.
 *  If a monitor attribute has become invalid, a monitor setting exception is thrown.
 */
class MonitorSettingException extends JMRuntimeException {

    /** Default constructor. */
    @stub
    def this() = ???

    /** Constructor that allows an error message to be specified. */
    @stub
    def this(message: String) = ???
}
