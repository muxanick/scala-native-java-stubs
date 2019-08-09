package java.lang.management

import java.lang.String
import scala.scalanative.annotation.stub

/** The management interface for a memory manager.
 *  A memory manager manages one or more memory pools of the
 *  Java virtual machine.
 * 
 *   A Java virtual machine has one or more memory managers.
 *  An instance implementing this interface is
 *  an MXBean
 *  that can be obtained by calling
 *  the ManagementFactory.getMemoryManagerMXBeans() method or
 *  from the platform MBeanServer method.
 * 
 *  The ObjectName for uniquely identifying the MXBean for
 *  a memory manager within an MBeanServer is:
 *  
 *    java.lang:type=MemoryManager,name=manager's name
 *  
 * 
 *  It can be obtained by calling the
 *  PlatformManagedObject.getObjectName() method.
 */
trait MemoryManagerMXBean extends PlatformManagedObject {

    /** Returns the name of memory pools that this memory manager manages. */
    @stub
    def getMemoryPoolNames(): Array[String] = ???

    /** Returns the name representing this memory manager. */
    @stub
    def getName(): String = ???

    /** Tests if this memory manager is valid in the Java virtual
     *  machine.
     */
    @stub
    def isValid(): Boolean = ???
}
