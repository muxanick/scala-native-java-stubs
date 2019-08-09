package java.lang.management

import java.lang.String
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** The management interface for the runtime system of
 *  the Java virtual machine.
 * 
 *   A Java virtual machine has a single instance of the implementation
 *  class of this interface.  This instance implementing this interface is
 *  an MXBean
 *  that can be obtained by calling
 *  the ManagementFactory.getRuntimeMXBean() method or
 *  from the platform MBeanServer method.
 * 
 *  The ObjectName for uniquely identifying the MXBean for
 *  the runtime system within an MBeanServer is:
 *  
 *     java.lang:type=Runtime
 *  
 * 
 *  It can be obtained by calling the
 *  PlatformManagedObject.getObjectName() method.
 * 
 *   This interface defines several convenient methods for accessing
 *  system properties about the Java virtual machine.
 */
trait RuntimeMXBean extends PlatformManagedObject {

    /** Returns the boot class path that is used by the bootstrap class loader
     *  to search for class files.
     */
    @stub
    def getBootClassPath(): String = ???

    /** Returns the Java class path that is used by the system class loader
     *  to search for class files.
     */
    @stub
    def getClassPath(): String = ???

    /** Returns the input arguments passed to the Java virtual machine
     *  which does not include the arguments to the main method.
     */
    @stub
    def getInputArguments(): List[String] = ???

    /** Returns the Java library path. */
    @stub
    def getLibraryPath(): String = ???

    /** Returns the version of the specification for the management interface
     *  implemented by the running Java virtual machine.
     */
    @stub
    def getManagementSpecVersion(): String = ???

    /** Returns the name representing the running Java virtual machine. */
    @stub
    def getName(): String = ???

    /** Returns the Java virtual machine specification name. */
    @stub
    def getSpecName(): String = ???

    /** Returns the Java virtual machine specification vendor. */
    @stub
    def getSpecVendor(): String = ???

    /** Returns the Java virtual machine specification version. */
    @stub
    def getSpecVersion(): String = ???

    /** Returns the start time of the Java virtual machine in milliseconds. */
    @stub
    def getStartTime(): Long = ???

    /** Returns a map of names and values of all system properties. */
    @stub
    def getSystemProperties(): Map[String, String] = ???

    /** Returns the uptime of the Java virtual machine in milliseconds. */
    @stub
    def getUptime(): Long = ???

    /** Returns the Java virtual machine implementation name. */
    @stub
    def getVmName(): String = ???

    /** Returns the Java virtual machine implementation vendor. */
    @stub
    def getVmVendor(): String = ???

    /** Returns the Java virtual machine implementation version. */
    @stub
    def getVmVersion(): String = ???

    /** Tests if the Java virtual machine supports the boot class path
     *  mechanism used by the bootstrap class loader to search for class
     *  files.
     */
    @stub
    def isBootClassPathSupported(): Boolean = ???
}
