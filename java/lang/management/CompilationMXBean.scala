package java.lang.management

import java.lang.String
import scala.scalanative.annotation.stub

/** The management interface for the compilation system of
 *  the Java virtual machine.
 * 
 *   A Java virtual machine has a single instance of the implementation
 *  class of this interface.  This instance implementing this interface is
 *  an MXBean
 *  that can be obtained by calling
 *  the ManagementFactory.getCompilationMXBean() method or
 *  from the platform MBeanServer method.
 * 
 *  The ObjectName for uniquely identifying the MXBean for
 *  the compilation system within an MBeanServer is:
 *  
 *   java.lang:type=Compilation
 *  
 * 
 *  It can be obtained by calling the
 *  PlatformManagedObject.getObjectName() method.
 */
trait CompilationMXBean extends PlatformManagedObject {

    /** Returns the name of the Just-in-time (JIT) compiler. */
    @stub
    def getName(): String = ???

    /** Returns the approximate accumulated elapsed time (in milliseconds)
     *  spent in compilation.
     */
    @stub
    def getTotalCompilationTime(): Long = ???

    /** Tests if the Java virtual machine supports the monitoring of
     *  compilation time.
     */
    @stub
    def isCompilationTimeMonitoringSupported(): Boolean = ???
}
