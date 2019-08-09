package java.lang.management

import scala.scalanative.annotation.stub

/** The management interface for the garbage collection of
 *  the Java virtual machine.  Garbage collection is the process
 *  that the Java virtual machine uses to find and reclaim unreachable
 *  objects to free up memory space.  A garbage collector is one type of
 *  memory manager.
 * 
 *   A Java virtual machine may have one or more instances of
 *  the implementation class of this interface.
 *  An instance implementing this interface is
 *  an MXBean
 *  that can be obtained by calling
 *  the ManagementFactory.getGarbageCollectorMXBeans() method or
 *  from the platform MBeanServer method.
 * 
 *  The ObjectName for uniquely identifying the MXBean for
 *  a garbage collector within an MBeanServer is:
 *  
 *    java.lang:type=GarbageCollector,name=collector's name
 *  
 * 
 *  It can be obtained by calling the
 *  PlatformManagedObject.getObjectName() method.
 * 
 *  A platform usually includes additional platform-dependent information
 *  specific to a garbage collection algorithm for monitoring.
 */
trait GarbageCollectorMXBean extends MemoryManagerMXBean {

    /** Returns the total number of collections that have occurred. */
    @stub
    def getCollectionCount(): Long = ???

    /** Returns the approximate accumulated collection elapsed time
     *  in milliseconds.
     */
    @stub
    def getCollectionTime(): Long = ???
}
