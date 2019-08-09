package java.lang.management

import java.lang.String
import java.util.{List, Map}

// The management interface for the runtime system of
// the Java virtual machine.
//
//  A Java virtual machine has a single instance of the implementation
// class of this interface.  This instance implementing this interface is
// an MXBean
// that can be obtained by calling
// the ManagementFactory.getRuntimeMXBean() method or
// from the platform MBeanServer method.
//
// The ObjectName for uniquely identifying the MXBean for
// the runtime system within an MBeanServer is:
// 
//    java.lang:type=Runtime
// 
//
// It can be obtained by calling the
// PlatformManagedObject.getObjectName() method.
//
//  This interface defines several convenient methods for accessing
// system properties about the Java virtual machine.
trait RuntimeMXBean extends PlatformManagedObject {

    @stub
    // Returns the boot class path that is used by the bootstrap class loader
    // to search for class files.
    def getBootClassPath(): String = ???

    @stub
    // Returns the Java class path that is used by the system class loader
    // to search for class files.
    def getClassPath(): String = ???

    @stub
    // Returns the input arguments passed to the Java virtual machine
    // which does not include the arguments to the main method.
    def getInputArguments(): List[String] = ???

    @stub
    // Returns the Java library path.
    def getLibraryPath(): String = ???

    @stub
    // Returns the version of the specification for the management interface
    // implemented by the running Java virtual machine.
    def getManagementSpecVersion(): String = ???

    @stub
    // Returns the name representing the running Java virtual machine.
    def getName(): String = ???

    @stub
    // Returns the Java virtual machine specification name.
    def getSpecName(): String = ???

    @stub
    // Returns the Java virtual machine specification vendor.
    def getSpecVendor(): String = ???

    @stub
    // Returns the Java virtual machine specification version.
    def getSpecVersion(): String = ???

    @stub
    // Returns the start time of the Java virtual machine in milliseconds.
    def getStartTime(): Long = ???

    @stub
    // Returns a map of names and values of all system properties.
    def getSystemProperties(): Map[String, String] = ???

    @stub
    // Returns the uptime of the Java virtual machine in milliseconds.
    def getUptime(): Long = ???

    @stub
    // Returns the Java virtual machine implementation name.
    def getVmName(): String = ???

    @stub
    // Returns the Java virtual machine implementation vendor.
    def getVmVendor(): String = ???

    @stub
    // Returns the Java virtual machine implementation version.
    def getVmVersion(): String = ???
}