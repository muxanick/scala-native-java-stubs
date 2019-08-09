package java.lang.management

import java.lang.String
import java.util.List

// The management interface for the logging facility.
//
// There is a single global instance of the PlatformLoggingMXBean.
// The ManagementFactory.getPlatformMXBean method can be used to obtain
// the PlatformLoggingMXBean object as follows:
// 
//     PlatformLoggingMXBean logging = ManagementFactory.getPlatformMXBean(PlatformLoggingMXBean.class);
// 
// The PlatformLoggingMXBean object is also registered with the
// platform MBeanServer.
// The ObjectName for uniquely
// identifying the PlatformLoggingMXBean within an MBeanServer is:
// 
//      java.util.logging:type=Logging
// 
//
// The instance registered in the platform MBeanServer with
// this ObjectName implements all attributes defined by
// LoggingMXBean.
trait PlatformLoggingMXBean extends PlatformManagedObject {

    @stub
    // Gets the name of the log level associated with the specified logger.
    def getLoggerLevel(loggerName: String): String = ???

    @stub
    // Returns the list of the currently registered
    // logger names.
    def getLoggerNames(): List[String] = ???

    @stub
    // Returns the name of the
    // parent
    // for the specified logger.
    def getParentLoggerName(loggerName: String): String = ???
}
