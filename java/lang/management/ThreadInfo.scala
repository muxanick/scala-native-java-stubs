package java.lang.management

import java.lang.{Object, StackTraceElement, String, Thread.State}
import javax.management.openmbean.CompositeData

/** Thread information. ThreadInfo contains the information
 *  about a thread including:
 *  General thread information
 *  
 *    Thread ID.
 *    Name of the thread.
 *  
 * 
 *  Execution information
 *  
 *    Thread state.
 *    The object upon which the thread is blocked due to:
 *        
 *        waiting to enter a synchronization block/method, or
 *        waiting to be notified in a Object.wait method,
 *            or
 *        parking due to a LockSupport.park call.
 *        
 *    
 *    The ID of the thread that owns the object
 *        that the thread is blocked.
 *    Stack trace of the thread.
 *    List of object monitors locked by the thread.
 *    List of 
 *        ownable synchronizers locked by the thread.
 *  
 * 
 *  Synchronization Statistics
 *  
 *    The number of times that the thread has blocked for
 *        synchronization or waited for notification.
 *    The accumulated elapsed time that the thread has blocked
 *        for synchronization or waited for notification
 *        since thread contention monitoring
 *        was enabled. Some Java virtual machine implementation
 *        may not support this.  The
 *        ThreadMXBean.isThreadContentionMonitoringSupported()
 *        method can be used to determine if a Java virtual machine
 *        supports this.
 *  
 * 
 *  This thread information class is designed for use in monitoring of
 *  the system, not for synchronization control.
 * 
 *  MXBean Mapping
 *  ThreadInfo is mapped to a CompositeData
 *  with attributes as specified in
 *  the from method.
 */
class ThreadInfo extends Object {

    /** Returns the total number of times that
     *  the thread associated with this ThreadInfo
     *  blocked to enter or reenter a monitor.
     */
    @stub
    def getBlockedCount(): Long = ???

    /** Returns the approximate accumulated elapsed time (in milliseconds)
     *  that the thread associated with this ThreadInfo
     *  has blocked to enter or reenter a monitor
     *  since thread contention monitoring is enabled.
     */
    @stub
    def getBlockedTime(): Long = ???

    /** Returns an array of MonitorInfo objects, each of which
     *  represents an object monitor currently locked by the thread
     *  associated with this ThreadInfo.
     */
    @stub
    def getLockedMonitors(): Array[MonitorInfo] = ???

    /** Returns an array of LockInfo objects, each of which
     *  represents an ownable
     *  synchronizer currently locked by the thread associated with
     *  this ThreadInfo.
     */
    @stub
    def getLockedSynchronizers(): Array[LockInfo] = ???

    /** Returns the LockInfo of an object for which
     *  the thread associated with this ThreadInfo
     *  is blocked waiting.
     */
    @stub
    def getLockInfo(): LockInfo = ???

    /** Returns the string representation
     *  of an object for which the thread associated with this
     *  ThreadInfo is blocked waiting.
     */
    @stub
    def getLockName(): String = ???

    /** Returns the ID of the thread which owns the object
     *  for which the thread associated with this ThreadInfo
     *  is blocked waiting.
     */
    @stub
    def getLockOwnerId(): Long = ???

    /** Returns the name of the thread which owns the object
     *  for which the thread associated with this ThreadInfo
     *  is blocked waiting.
     */
    @stub
    def getLockOwnerName(): String = ???

    /** Returns the stack trace of the thread
     *  associated with this ThreadInfo.
     */
    @stub
    def getStackTrace(): Array[StackTraceElement] = ???

    /** Returns the ID of the thread associated with this ThreadInfo. */
    @stub
    def getThreadId(): Long = ???

    /** Returns the name of the thread associated with this ThreadInfo. */
    @stub
    def getThreadName(): String = ???

    /** Returns the state of the thread associated with this ThreadInfo. */
    @stub
    def getThreadState(): Thread.State = ???

    /** Returns the total number of times that
     *  the thread associated with this ThreadInfo
     *  waited for notification.
     */
    @stub
    def getWaitedCount(): Long = ???

    /** Returns the approximate accumulated elapsed time (in milliseconds)
     *  that the thread associated with this ThreadInfo
     *  has waited for notification
     *  since thread contention monitoring is enabled.
     */
    @stub
    def getWaitedTime(): Long = ???

    /** Tests if the thread associated with this ThreadInfo
     *  is executing native code via the Java Native Interface (JNI).
     */
    @stub
    def isInNative(): Boolean = ???

    /** Tests if the thread associated with this ThreadInfo
     *  is suspended.
     */
    @stub
    def isSuspended(): Boolean = ???
}

object ThreadInfo {
    /** Returns a ThreadInfo object represented by the
     *  given CompositeData.
     */
    @stub
    def from(cd: CompositeData): ThreadInfo = ???
}
