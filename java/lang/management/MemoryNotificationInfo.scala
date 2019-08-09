package java.lang.management

import java.lang.{Object, String}
import javax.management.openmbean.CompositeData

/** The information about a memory notification.
 * 
 *  
 *  A memory notification is emitted by MemoryMXBean
 *  when the Java virtual machine detects that the memory usage
 *  of a memory pool is exceeding a threshold value.
 *  The notification emitted will contain the memory notification
 *  information about the detected condition:
 *  
 *    The name of the memory pool.
 *    The memory usage of the memory pool when the notification
 *        was constructed.
 *    The number of times that the memory usage has crossed
 *        a threshold when the notification was constructed.
 *        For usage threshold notifications, this count will be the
 *        usage threshold
 *        count.  For collection threshold notifications,
 *        this count will be the
 *        collection usage threshold count.
 *        
 *  
 * 
 *  
 *  A CompositeData representing
 *  the MemoryNotificationInfo object
 *  is stored in the
 *  user data
 *  of a notification.
 *  The from method is provided to convert from
 *  a CompositeData to a MemoryNotificationInfo
 *  object. For example:
 * 
 *  
 *       Notification notif;
 * 
 *       // receive the notification emitted by MemoryMXBean and set to notif
 *       ...
 * 
 *       String notifType = notif.getType();
 *       if (notifType.equals(MemoryNotificationInfo.MEMORY_THRESHOLD_EXCEEDED) ||
 *           notifType.equals(MemoryNotificationInfo.MEMORY_COLLECTION_THRESHOLD_EXCEEDED)) {
 *           // retrieve the memory notification information
 *           CompositeData cd = (CompositeData) notif.getUserData();
 *           MemoryNotificationInfo info = MemoryNotificationInfo.from(cd);
 *           ....
 *       }
 *  
 * 
 *  
 *  The types of notifications emitted by MemoryMXBean are:
 *  
 *    A usage threshold exceeded notification.
 *        This notification will be emitted when
 *        the memory usage of a memory pool is increased and has reached
 *        or exceeded its
 *         usage threshold value.
 *        Subsequent crossing of the usage threshold value does not cause
 *        further notification until the memory usage has returned
 *        to become less than the usage threshold value.
 *        
 *    A collection usage threshold exceeded notification.
 *        This notification will be emitted when
 *        the memory usage of a memory pool is greater than or equal to its
 *        
 *        collection usage threshold after the Java virtual machine
 *        has expended effort in recycling unused objects in that
 *        memory pool.
 *  
 */
class MemoryNotificationInfo extends Object {

    /** Returns the number of times that the memory usage has crossed
     *  a threshold when the notification was constructed.
     */
    @stub
    def getCount(): Long = ???

    /** Returns the name of the memory pool that triggers this notification. */
    @stub
    def getPoolName(): String = ???
}

object MemoryNotificationInfo {
    /** Notification type denoting that
     *  the memory usage of a memory pool is greater than or equal to its
     *  
     *  collection usage threshold after the Java virtual machine
     *  has expended effort in recycling unused objects in that
     *  memory pool.
     */
    @stub
    val MEMORY_COLLECTION_THRESHOLD_EXCEEDED: String = ???

    /** Returns a MemoryNotificationInfo object represented by the
     *  given CompositeData.
     */
    @stub
    def from(cd: CompositeData): MemoryNotificationInfo = ???
}
