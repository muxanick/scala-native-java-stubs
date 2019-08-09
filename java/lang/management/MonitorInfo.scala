package java.lang.management

import java.lang.Object
import javax.management.openmbean.CompositeData

/** Information about an object monitor lock.  An object monitor is locked
 *  when entering a synchronization block or method on that object.
 * 
 *  MXBean Mapping
 *  MonitorInfo is mapped to a CompositeData
 *  with attributes as specified in
 *  the from method.
 */
class MonitorInfo extends LockInfo {

    /** Returns the depth in the stack trace where the object monitor
     *  was locked.
     */
    @stub
    def getLockedStackDepth(): Int = ???
}

object MonitorInfo {
    /** Returns a MonitorInfo object represented by the
     *  given CompositeData.
     */
    @stub
    def from(cd: CompositeData): MonitorInfo = ???
}
