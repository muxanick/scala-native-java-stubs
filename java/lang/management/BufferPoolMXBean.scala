package java.lang.management

import java.lang.String

/** The management interface for a buffer pool, for example a pool of
 *  direct or mapped buffers.
 * 
 *   A class implementing this interface is an
 *  MXBean. A Java
 *  virtual machine has one or more implementations of this interface. The getPlatformMXBeans
 *  method can be used to obtain the list of BufferPoolMXBean objects
 *  representing the management interfaces for pools of buffers as follows:
 *  
 *      List<BufferPoolMXBean> pools = ManagementFactory.getPlatformMXBeans(BufferPoolMXBean.class);
 *  
 * 
 *   The management interfaces are also registered with the platform MBeanServer. The ObjectName that uniquely identifies the
 *  management interface within the MBeanServer takes the form:
 *  
 *      java.nio:type=BufferPool,name=pool name
 *  
 *  where pool name is the name of the buffer pool.
 */
trait BufferPoolMXBean extends PlatformManagedObject {

    /** Returns an estimate of the number of buffers in the pool. */
    @stub
    def getCount(): Long = ???

    /** Returns an estimate of the memory that the Java virtual machine is using
     *  for this buffer pool.
     */
    @stub
    def getMemoryUsed(): Long = ???

    /** Returns the name representing this buffer pool. */
    @stub
    def getName(): String = ???
}
