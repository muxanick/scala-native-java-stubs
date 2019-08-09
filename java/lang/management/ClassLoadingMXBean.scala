package java.lang.management

// The management interface for the class loading system of
// the Java virtual machine.
//
//  A Java virtual machine has a single instance of the implementation
// class of this interface.  This instance implementing this interface is
// an MXBean
// that can be obtained by calling
// the ManagementFactory.getClassLoadingMXBean() method or
// from the platform MBeanServer.
//
// The ObjectName for uniquely identifying the MXBean for
// the class loading system within an MBeanServer is:
// 
// java.lang:type=ClassLoading
// 
//
// It can be obtained by calling the
// PlatformManagedObject.getObjectName() method.
trait ClassLoadingMXBean extends PlatformManagedObject {

    @stub
    // Returns the number of classes that are currently loaded in the
    // Java virtual machine.
    def getLoadedClassCount(): Int = ???

    @stub
    // Returns the total number of classes that have been loaded since
    // the Java virtual machine has started execution.
    def getTotalLoadedClassCount(): Long = ???

    @stub
    // Returns the total number of classes unloaded since the Java virtual machine
    // has started execution.
    def getUnloadedClassCount(): Long = ???

    @stub
    // Tests if the verbose output for the class loading system is enabled.
    def isVerbose(): Boolean = ???
}
