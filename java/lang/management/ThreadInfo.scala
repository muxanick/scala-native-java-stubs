package java.lang.management

import java.lang.{Object, StackTraceElement, String, Thread.State}
import javax.management.openmbean.CompositeData

// Thread information. ThreadInfo contains the information
// about a thread including:
// General thread information
// 
//   Thread ID.
//   Name of the thread.
// 
//
// Execution information
// 
//   Thread state.
//   The object upon which the thread is blocked due to:
//       
//       waiting to enter a synchronization block/method, or
//       waiting to be notified in a Object.wait method,
//           or
//       parking due to a LockSupport.park call.
//       
//   
//   The ID of the thread that owns the object
//       that the thread is blocked.
//   Stack trace of the thread.
//   List of object monitors locked by the thread.
//   List of 
//       ownable synchronizers locked by the thread.
// 
//
// Synchronization Statistics
// 
//   The number of times that the thread has blocked for
//       synchronization or waited for notification.
//   The accumulated elapsed time that the thread has blocked
//       for synchronization or waited for notification
//       since thread contention monitoring
//       was enabled. Some Java virtual machine implementation
//       may not support this.  The
//       ThreadMXBean.isThreadContentionMonitoringSupported()
//       method can be used to determine if a Java virtual machine
//       supports this.
// 
//
// This thread information class is designed for use in monitoring of
// the system, not for synchronization control.
//
// MXBean Mapping
// ThreadInfo is mapped to a CompositeData
// with attributes as specified in
// the from method.
class ThreadInfo extends Object {

    @stub
    // Returns the total number of times that
    // the thread associated with this ThreadInfo
    // blocked to enter or reenter a monitor.
    def getBlockedCount(): Long = ???

    @stub
    // Returns the approximate accumulated elapsed time (in milliseconds)
    // that the thread associated with this ThreadInfo
    // has blocked to enter or reenter a monitor
    // since thread contention monitoring is enabled.
    def getBlockedTime(): Long = ???

    @stub
    // Returns an array of MonitorInfo objects, each of which
    // represents an object monitor currently locked by the thread
    // associated with this ThreadInfo.
    def getLockedMonitors(): Array[MonitorInfo] = ???

    @stub
    // Returns an array of LockInfo objects, each of which
    // represents an ownable
    // synchronizer currently locked by the thread associated with
    // this ThreadInfo.
    def getLockedSynchronizers(): Array[LockInfo] = ???

    @stub
    // Returns the LockInfo of an object for which
    // the thread associated with this ThreadInfo
    // is blocked waiting.
    def getLockInfo(): LockInfo = ???

    @stub
    // Returns the string representation
    // of an object for which the thread associated with this
    // ThreadInfo is blocked waiting.
    def getLockName(): String = ???

    @stub
    // Returns the ID of the thread which owns the object
    // for which the thread associated with this ThreadInfo
    // is blocked waiting.
    def getLockOwnerId(): Long = ???

    @stub
    // Returns the name of the thread which owns the object
    // for which the thread associated with this ThreadInfo
    // is blocked waiting.
    def getLockOwnerName(): String = ???

    @stub
    // Returns the stack trace of the thread
    // associated with this ThreadInfo.
    def getStackTrace(): Array[StackTraceElement] = ???

    @stub
    // Returns the ID of the thread associated with this ThreadInfo.
    def getThreadId(): Long = ???

    @stub
    // Returns the name of the thread associated with this ThreadInfo.
    def getThreadName(): String = ???

    @stub
    // Returns the state of the thread associated with this ThreadInfo.
    def getThreadState(): Thread.State = ???

    @stub
    // Returns the total number of times that
    // the thread associated with this ThreadInfo
    // waited for notification.
    def getWaitedCount(): Long = ???

    @stub
    // Returns the approximate accumulated elapsed time (in milliseconds)
    // that the thread associated with this ThreadInfo
    // has waited for notification
    // since thread contention monitoring is enabled.
    def getWaitedTime(): Long = ???

    @stub
    // Tests if the thread associated with this ThreadInfo
    // is executing native code via the Java Native Interface (JNI).
    def isInNative(): Boolean = ???

    @stub
    // Tests if the thread associated with this ThreadInfo
    // is suspended.
    def isSuspended(): Boolean = ???
}

object ThreadInfo {
    @stub
    // Returns a ThreadInfo object represented by the
    // given CompositeData.
    def from(cd: CompositeData): ThreadInfo = ???
}
