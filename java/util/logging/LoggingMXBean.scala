package java.util.logging

import java.lang.String
import java.util.List

// The management interface for the logging facility. It is recommended
// to use the PlatformLoggingMXBean management
// interface that implements all attributes defined in this
// LoggingMXBean.  The
// ManagementFactory.getPlatformMXBean method can be used to obtain
// the PlatformLoggingMXBean object representing the management
// interface for logging.
//
// There is a single global instance of the LoggingMXBean.
// This instance is an MXBean that
// can be obtained by calling the LogManager.getLoggingMXBean()
// method or from the
// platform MBeanServer.
// 
// The ObjectName that uniquely identifies
// the management interface for logging within the MBeanServer is:
// 
//    java.util.logging:type=Logging
// 
// 
// The instance registered in the platform MBeanServer
// is also a PlatformLoggingMXBean.
trait LoggingMXBean {

    @stub
    // Gets the name of the log level associated with the specified logger.
    def getLoggerLevel(loggerName: String): String = ???

    @stub
    // Returns the list of currently registered logger names.
    def getLoggerNames(): List[String] = ???

    @stub
    // Returns the name of the parent for the specified logger.
    def getParentLoggerName(loggerName: String): String = ???
}
