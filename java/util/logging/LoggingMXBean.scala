package java.util.logging

import java.lang.String
import java.util.List
import scala.scalanative.annotation.stub

/** The management interface for the logging facility. It is recommended
 *  to use the PlatformLoggingMXBean management
 *  interface that implements all attributes defined in this
 *  LoggingMXBean.  The
 *  ManagementFactory.getPlatformMXBean method can be used to obtain
 *  the PlatformLoggingMXBean object representing the management
 *  interface for logging.
 * 
 *  There is a single global instance of the LoggingMXBean.
 *  This instance is an MXBean that
 *  can be obtained by calling the LogManager.getLoggingMXBean()
 *  method or from the
 *  platform MBeanServer.
 *  
 *  The ObjectName that uniquely identifies
 *  the management interface for logging within the MBeanServer is:
 *  
 *     java.util.logging:type=Logging
 *  
 *  
 *  The instance registered in the platform MBeanServer
 *  is also a PlatformLoggingMXBean.
 */
trait LoggingMXBean {

    /** Gets the name of the log level associated with the specified logger. */
    @stub
    def getLoggerLevel(loggerName: String): String = ???

    /** Returns the list of currently registered logger names. */
    @stub
    def getLoggerNames(): List[String] = ???

    /** Returns the name of the parent for the specified logger. */
    @stub
    def getParentLoggerName(loggerName: String): String = ???

    /** Sets the specified logger to the specified new level. */
    @stub
    def setLoggerLevel(loggerName: String, levelName: String): Unit = ???
}
