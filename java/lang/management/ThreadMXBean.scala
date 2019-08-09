package java.lang.management

import scala.scalanative.annotation.stub

/** The management interface for the thread system of
 *  the Java virtual machine.
 * 
 *   A Java virtual machine has a single instance of the implementation
 *  class of this interface.  This instance implementing this interface is
 *  an MXBean
 *  that can be obtained by calling
 *  the ManagementFactory.getThreadMXBean() method or
 *  from the platform MBeanServer method.
 * 
 *  The ObjectName for uniquely identifying the MXBean for
 *  the thread system within an MBeanServer is:
 *  
 *     java.lang:type=Threading
 *  
 * 
 *  It can be obtained by calling the
 *  PlatformManagedObject.getObjectName() method.
 * 
 *  Thread ID
 *  Thread ID is a positive long value returned by calling the
 *  Thread.getId() method for a thread.
 *  The thread ID is unique during its lifetime.  When a thread
 *  is terminated, this thread ID may be reused.
 * 
 *   Some methods in this interface take a thread ID or an array
 *  of thread IDs as the input parameter and return per-thread information.
 * 
 *  Thread CPU time
 *  A Java virtual machine implementation may support measuring
 *  the CPU time for the current thread, for any thread, or for no threads.
 * 
 *  
 *  The isThreadCpuTimeSupported() method can be used to determine
 *  if a Java virtual machine supports measuring of the CPU time for any
 *  thread.  The isCurrentThreadCpuTimeSupported() method can
 *  be used to determine if a Java virtual machine supports measuring of
 *  the CPU time for the current  thread.
 *  A Java virtual machine implementation that supports CPU time measurement
 *  for any thread will also support that for the current thread.
 * 
 *   The CPU time provided by this interface has nanosecond precision
 *  but not necessarily nanosecond accuracy.
 * 
 *  
 *  A Java virtual machine may disable CPU time measurement
 *  by default.
 *  The isThreadCpuTimeEnabled() and setThreadCpuTimeEnabled(boolean)
 *  methods can be used to test if CPU time measurement is enabled
 *  and to enable/disable this support respectively.
 *  Enabling thread CPU measurement could be expensive in some
 *  Java virtual machine implementations.
 * 
 *  Thread Contention Monitoring
 *  Some Java virtual machines may support thread contention monitoring.
 *  When thread contention monitoring is enabled, the accumulated elapsed
 *  time that the thread has blocked for synchronization or waited for
 *  notification will be collected and returned in the
 *  ThreadInfo object.
 *  
 *  The isThreadContentionMonitoringSupported() method can be used to
 *  determine if a Java virtual machine supports thread contention monitoring.
 *  The thread contention monitoring is disabled by default.  The
 *  setThreadContentionMonitoringEnabled(boolean) method can be used to enable
 *  thread contention monitoring.
 * 
 *  Synchronization Information and Deadlock Detection
 *  Some Java virtual machines may support monitoring of
 *  object monitor usage and
 *  ownable synchronizer usage.
 *  The getThreadInfo(long[], boolean, boolean) and
 *  dumpAllThreads(boolean, boolean) methods can be used to obtain the thread stack trace
 *  and synchronization information including which
 *  lock a thread is blocked to
 *  acquire or waiting on and which locks the thread currently owns.
 *  
 *  The ThreadMXBean interface provides the
 *  findMonitorDeadlockedThreads() and
 *  findDeadlockedThreads() methods to find deadlocks in
 *  the running application.
 */
trait ThreadMXBean extends PlatformManagedObject {

    /** Returns the thread info for all live threads with stack trace
     *  and synchronization information.
     */
    @stub
    def dumpAllThreads(lockedMonitors: Boolean, lockedSynchronizers: Boolean): Array[ThreadInfo] = ???

    /** Finds cycles of threads that are in deadlock waiting to acquire
     *  object monitors or
     *  ownable synchronizers.
     */
    @stub
    def findDeadlockedThreads(): Array[Long] = ???

    /** Finds cycles of threads that are in deadlock waiting to acquire
     *  object monitors.
     */
    @stub
    def findMonitorDeadlockedThreads(): Array[Long] = ???

    /** Returns all live thread IDs. */
    @stub
    def getAllThreadIds(): Array[Long] = ???

    /** Returns the total CPU time for the current thread in nanoseconds. */
    @stub
    def getCurrentThreadCpuTime(): Long = ???

    /** Returns the CPU time that the current thread has executed
     *  in user mode in nanoseconds.
     */
    @stub
    def getCurrentThreadUserTime(): Long = ???

    /** Returns the current number of live daemon threads. */
    @stub
    def getDaemonThreadCount(): Int = ???

    /** Returns the peak live thread count since the Java virtual machine
     *  started or peak was reset.
     */
    @stub
    def getPeakThreadCount(): Int = ???

    /** Returns the current number of live threads including both
     *  daemon and non-daemon threads.
     */
    @stub
    def getThreadCount(): Int = ???

    /** Returns the total CPU time for a thread of the specified ID in nanoseconds. */
    @stub
    def getThreadCpuTime(id: Long): Long = ???

    /** Returns the thread info for a thread of the specified
     *  id with no stack trace.
     */
    @stub
    def getThreadInfo(id: Long): ThreadInfo = ???

    /** Returns the thread info for each thread
     *  whose ID is in the input array ids with no stack trace.
     */
    @stub
    def getThreadInfo(ids: Array[Long]): Array[ThreadInfo] = ???

    /** Returns the thread info for each thread
     *  whose ID is in the input array ids, with stack trace
     *  and synchronization information.
     */
    @stub
    def getThreadInfo(ids: Array[Long], lockedMonitors: Boolean, lockedSynchronizers: Boolean): Array[ThreadInfo] = ???

    /** Returns the thread info for each thread
     *  whose ID is in the input array ids,
     *  with stack trace of a specified number of stack trace elements.
     */
    @stub
    def getThreadInfo(ids: Array[Long], maxDepth: Int): Array[ThreadInfo] = ???

    /** Returns a thread info for a thread of the specified id,
     *  with stack trace of a specified number of stack trace elements.
     */
    @stub
    def getThreadInfo(id: Long, maxDepth: Int): ThreadInfo = ???

    /** Returns the CPU time that a thread of the specified ID
     *  has executed in user mode in nanoseconds.
     */
    @stub
    def getThreadUserTime(id: Long): Long = ???

    /** Returns the total number of threads created and also started
     *  since the Java virtual machine started.
     */
    @stub
    def getTotalStartedThreadCount(): Long = ???

    /** Tests if the Java virtual machine supports CPU time
     *  measurement for the current thread.
     */
    @stub
    def isCurrentThreadCpuTimeSupported(): Boolean = ???

    /** Tests if the Java virtual machine supports monitoring of
     *  object monitor usage.
     */
    @stub
    def isObjectMonitorUsageSupported(): Boolean = ???

    /** Tests if the Java virtual machine supports monitoring of
     *  
     *  ownable synchronizer usage.
     */
    @stub
    def isSynchronizerUsageSupported(): Boolean = ???

    /** Tests if thread contention monitoring is enabled. */
    @stub
    def isThreadContentionMonitoringEnabled(): Boolean = ???

    /** Tests if the Java virtual machine supports thread contention monitoring. */
    @stub
    def isThreadContentionMonitoringSupported(): Boolean = ???

    /** Tests if thread CPU time measurement is enabled. */
    @stub
    def isThreadCpuTimeEnabled(): Boolean = ???

    /** Tests if the Java virtual machine implementation supports CPU time
     *  measurement for any thread.
     */
    @stub
    def isThreadCpuTimeSupported(): Boolean = ???

    /** Resets the peak thread count to the current number of
     *  live threads.
     */
    @stub
    def resetPeakThreadCount(): Unit = ???

    /** Enables or disables thread contention monitoring. */
    @stub
    def setThreadContentionMonitoringEnabled(enable: Boolean): Unit = ???

    /** Enables or disables thread CPU time measurement. */
    @stub
    def setThreadCpuTimeEnabled(enable: Boolean): Unit = ???
}
