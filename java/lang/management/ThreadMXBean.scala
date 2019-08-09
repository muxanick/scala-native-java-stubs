package java.lang.management

// The management interface for the thread system of
// the Java virtual machine.
//
//  A Java virtual machine has a single instance of the implementation
// class of this interface.  This instance implementing this interface is
// an MXBean
// that can be obtained by calling
// the ManagementFactory.getThreadMXBean() method or
// from the platform MBeanServer method.
//
// The ObjectName for uniquely identifying the MXBean for
// the thread system within an MBeanServer is:
// 
//    java.lang:type=Threading
// 
//
// It can be obtained by calling the
// PlatformManagedObject.getObjectName() method.
//
// Thread ID
// Thread ID is a positive long value returned by calling the
// Thread.getId() method for a thread.
// The thread ID is unique during its lifetime.  When a thread
// is terminated, this thread ID may be reused.
//
//  Some methods in this interface take a thread ID or an array
// of thread IDs as the input parameter and return per-thread information.
//
// Thread CPU time
// A Java virtual machine implementation may support measuring
// the CPU time for the current thread, for any thread, or for no threads.
//
// 
// The isThreadCpuTimeSupported() method can be used to determine
// if a Java virtual machine supports measuring of the CPU time for any
// thread.  The isCurrentThreadCpuTimeSupported() method can
// be used to determine if a Java virtual machine supports measuring of
// the CPU time for the current  thread.
// A Java virtual machine implementation that supports CPU time measurement
// for any thread will also support that for the current thread.
//
//  The CPU time provided by this interface has nanosecond precision
// but not necessarily nanosecond accuracy.
//
// 
// A Java virtual machine may disable CPU time measurement
// by default.
// The isThreadCpuTimeEnabled() and setThreadCpuTimeEnabled(boolean)
// methods can be used to test if CPU time measurement is enabled
// and to enable/disable this support respectively.
// Enabling thread CPU measurement could be expensive in some
// Java virtual machine implementations.
//
// Thread Contention Monitoring
// Some Java virtual machines may support thread contention monitoring.
// When thread contention monitoring is enabled, the accumulated elapsed
// time that the thread has blocked for synchronization or waited for
// notification will be collected and returned in the
// ThreadInfo object.
// 
// The isThreadContentionMonitoringSupported() method can be used to
// determine if a Java virtual machine supports thread contention monitoring.
// The thread contention monitoring is disabled by default.  The
// setThreadContentionMonitoringEnabled(boolean) method can be used to enable
// thread contention monitoring.
//
// Synchronization Information and Deadlock Detection
// Some Java virtual machines may support monitoring of
// object monitor usage and
// ownable synchronizer usage.
// The getThreadInfo(long[], boolean, boolean) and
// dumpAllThreads(boolean, boolean) methods can be used to obtain the thread stack trace
// and synchronization information including which
// lock a thread is blocked to
// acquire or waiting on and which locks the thread currently owns.
// 
// The ThreadMXBean interface provides the
// findMonitorDeadlockedThreads() and
// findDeadlockedThreads() methods to find deadlocks in
// the running application.
trait ThreadMXBean extends PlatformManagedObject {

    @stub
    // Returns the thread info for all live threads with stack trace
    // and synchronization information.
    def dumpAllThreads(lockedMonitors: Boolean, lockedSynchronizers: Boolean): Array[ThreadInfo] = ???

    @stub
    // Finds cycles of threads that are in deadlock waiting to acquire
    // object monitors or
    // ownable synchronizers.
    def findDeadlockedThreads(): Array[Long] = ???

    @stub
    // Finds cycles of threads that are in deadlock waiting to acquire
    // object monitors.
    def findMonitorDeadlockedThreads(): Array[Long] = ???

    @stub
    // Returns all live thread IDs.
    def getAllThreadIds(): Array[Long] = ???

    @stub
    // Returns the total CPU time for the current thread in nanoseconds.
    def getCurrentThreadCpuTime(): Long = ???

    @stub
    // Returns the CPU time that the current thread has executed
    // in user mode in nanoseconds.
    def getCurrentThreadUserTime(): Long = ???

    @stub
    // Returns the current number of live daemon threads.
    def getDaemonThreadCount(): Int = ???

    @stub
    // Returns the peak live thread count since the Java virtual machine
    // started or peak was reset.
    def getPeakThreadCount(): Int = ???

    @stub
    // Returns the current number of live threads including both
    // daemon and non-daemon threads.
    def getThreadCount(): Int = ???

    @stub
    // Returns the total CPU time for a thread of the specified ID in nanoseconds.
    def getThreadCpuTime(id: Long): Long = ???

    @stub
    // Returns the thread info for a thread of the specified
    // id with no stack trace.
    def getThreadInfo(id: Long): ThreadInfo = ???

    @stub
    // Returns the thread info for each thread
    // whose ID is in the input array ids with no stack trace.
    def getThreadInfo(ids: Array[Long]): Array[ThreadInfo] = ???

    @stub
    // Returns the thread info for each thread
    // whose ID is in the input array ids, with stack trace
    // and synchronization information.
    def getThreadInfo(ids: Array[Long], lockedMonitors: Boolean, lockedSynchronizers: Boolean): Array[ThreadInfo] = ???

    @stub
    // Returns the thread info for each thread
    // whose ID is in the input array ids,
    // with stack trace of a specified number of stack trace elements.
    def getThreadInfo(ids: Array[Long], maxDepth: Int): Array[ThreadInfo] = ???

    @stub
    // Returns a thread info for a thread of the specified id,
    // with stack trace of a specified number of stack trace elements.
    def getThreadInfo(id: Long, maxDepth: Int): ThreadInfo = ???

    @stub
    // Returns the CPU time that a thread of the specified ID
    // has executed in user mode in nanoseconds.
    def getThreadUserTime(id: Long): Long = ???

    @stub
    // Returns the total number of threads created and also started
    // since the Java virtual machine started.
    def getTotalStartedThreadCount(): Long = ???

    @stub
    // Tests if the Java virtual machine supports CPU time
    // measurement for the current thread.
    def isCurrentThreadCpuTimeSupported(): Boolean = ???

    @stub
    // Tests if the Java virtual machine supports monitoring of
    // object monitor usage.
    def isObjectMonitorUsageSupported(): Boolean = ???

    @stub
    // Tests if the Java virtual machine supports monitoring of
    // 
    // ownable synchronizer usage.
    def isSynchronizerUsageSupported(): Boolean = ???

    @stub
    // Tests if thread contention monitoring is enabled.
    def isThreadContentionMonitoringEnabled(): Boolean = ???

    @stub
    // Tests if the Java virtual machine supports thread contention monitoring.
    def isThreadContentionMonitoringSupported(): Boolean = ???

    @stub
    // Tests if thread CPU time measurement is enabled.
    def isThreadCpuTimeEnabled(): Boolean = ???

    @stub
    // Tests if the Java virtual machine implementation supports CPU time
    // measurement for any thread.
    def isThreadCpuTimeSupported(): Boolean = ???

    @stub
    // Resets the peak thread count to the current number of
    // live threads.
    def resetPeakThreadCount(): Unit = ???

    @stub
    // Enables or disables thread contention monitoring.
    def setThreadContentionMonitoringEnabled(enable: Boolean): Unit = ???
}
