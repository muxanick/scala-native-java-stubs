package java.lang.management

import java.lang.String
import java.util.List
import scala.scalanative.annotation.stub

/** The management interface for the logging facility.
 * 
 *  There is a single global instance of the PlatformLoggingMXBean.
 *  The ManagementFactory.getPlatformMXBean method can be used to obtain
 *  the PlatformLoggingMXBean object as follows:
 *  
 *      PlatformLoggingMXBean logging = ManagementFactory.getPlatformMXBean(PlatformLoggingMXBean.class);
 *  
 *  The PlatformLoggingMXBean object is also registered with the
 *  platform MBeanServer.
 *  The ObjectName for uniquely
 *  identifying the PlatformLoggingMXBean within an MBeanServer is:
 *  
 *       java.util.logging:type=Logging
 *  
 * 
 *  The instance registered in the platform MBeanServer with
 *  this ObjectName implements all attributes defined by
 *  LoggingMXBean.
 */
trait PlatformLoggingMXBean extends PlatformManagedObject {

    /** Gets the name of the log level associated with the specified logger. */
    @stub
    def getLoggerLevel(loggerName: String): String = ???

    /** Returns the list of the currently registered
     *  logger names.
     */
    @stub
    def getLoggerNames(): List[String] = ???

    /** Returns the name of the
     *  parent
     *  for the specified logger.
     */
    @stub
    def getParentLoggerName(loggerName: String): String = ???

    /** Sets the specified logger to the specified new
     *  level.
     */
    @stub
    def setLoggerLevel(loggerName: String, levelName: String): Unit = ???
}
