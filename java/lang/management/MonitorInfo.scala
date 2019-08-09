package java.lang.management

import java.lang.{Object, StackTraceElement, String}
import javax.management.openmbean.CompositeData
import scala.scalanative.annotation.stub

/** Information about an object monitor lock.  An object monitor is locked
 *  when entering a synchronization block or method on that object.
 * 
 *  MXBean Mapping
 *  MonitorInfo is mapped to a CompositeData
 *  with attributes as specified in
 *  the from method.
 */
class MonitorInfo extends LockInfo {

    /** Construct a MonitorInfo object. */
    @stub
    def this(className: String, identityHashCode: Int, stackDepth: Int, stackFrame: StackTraceElement) = ???

    /** Returns the depth in the stack trace where the object monitor
     *  was locked.
     */
    @stub
    def getLockedStackDepth(): Int = ???

    /** Returns the stack frame that locked the object monitor. */
    @stub
    def getLockedStackFrame(): StackTraceElement = ???
}

object MonitorInfo {
    /** Returns a MonitorInfo object represented by the
     *  given CompositeData.
     */
    @stub
    def from(cd: CompositeData): MonitorInfo = ???
}
