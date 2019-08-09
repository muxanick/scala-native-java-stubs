package java.lang.management

import java.lang.{Object, String}
import javax.management.openmbean.CompositeData
import scala.scalanative.annotation.stub

/** Information about a lock.  A lock can be a built-in object monitor,
 *  an ownable synchronizer, or the Condition
 *  object associated with synchronizers.
 *  
 *  An ownable synchronizer is
 *  a synchronizer that may be exclusively owned by a thread and uses
 *  AbstractOwnableSynchronizer
 *  (or its subclass) to implement its synchronization property.
 *  ReentrantLock and
 *  ReentrantReadWriteLock are
 *  two examples of ownable synchronizers provided by the platform.
 * 
 *  MXBean Mapping
 *  LockInfo is mapped to a CompositeData
 *  as specified in the from method.
 */
class LockInfo extends Object {

    /** Constructs a LockInfo object. */
    @stub
    def this(className: String, identityHashCode: Int) = ???

    /** Returns the fully qualified name of the class of the lock object. */
    @stub
    def getClassName(): String = ???

    /** Returns the identity hash code of the lock object
     *  returned from the System.identityHashCode(java.lang.Object) method.
     */
    @stub
    def getIdentityHashCode(): Int = ???

    /** Returns a string representation of a lock. */
    @stub
    def toString(): String = ???
}

object LockInfo {
    /** Returns a LockInfo object represented by the
     *  given CompositeData.
     */
    @stub
    def from(cd: CompositeData): LockInfo = ???
}
