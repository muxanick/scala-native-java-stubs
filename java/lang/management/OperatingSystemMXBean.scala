package java.lang.management

import java.lang.String
import scala.scalanative.annotation.stub

/** The management interface for the operating system on which
 *  the Java virtual machine is running.
 * 
 *   A Java virtual machine has a single instance of the implementation
 *  class of this interface.  This instance implementing this interface is
 *  an MXBean
 *  that can be obtained by calling
 *  the ManagementFactory.getOperatingSystemMXBean() method or
 *  from the platform MBeanServer method.
 * 
 *  The ObjectName for uniquely identifying the MXBean for
 *  the operating system within an MBeanServer is:
 *  
 *     java.lang:type=OperatingSystem
 *  
 * 
 *  It can be obtained by calling the
 *  PlatformManagedObject.getObjectName() method.
 * 
 *   This interface defines several convenient methods for accessing
 *  system properties about the operating system on which the Java
 *  virtual machine is running.
 */
trait OperatingSystemMXBean extends PlatformManagedObject {

    /** Returns the operating system architecture. */
    @stub
    def getArch(): String = ???

    /** Returns the number of processors available to the Java virtual machine. */
    @stub
    def getAvailableProcessors(): Int = ???

    /** Returns the operating system name. */
    @stub
    def getName(): String = ???

    /** Returns the system load average for the last minute. */
    @stub
    def getSystemLoadAverage(): Double = ???

    /** Returns the operating system version. */
    @stub
    def getVersion(): String = ???
}
