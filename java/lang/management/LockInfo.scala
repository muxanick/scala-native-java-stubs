package java.lang.management

import java.lang.{Object, String}
import javax.management.openmbean.CompositeData

// Information about a lock.  A lock can be a built-in object monitor,
// an ownable synchronizer, or the Condition
// object associated with synchronizers.
// 
// An ownable synchronizer is
// a synchronizer that may be exclusively owned by a thread and uses
// AbstractOwnableSynchronizer
// (or its subclass) to implement its synchronization property.
// ReentrantLock and
// ReentrantReadWriteLock are
// two examples of ownable synchronizers provided by the platform.
//
// MXBean Mapping
// LockInfo is mapped to a CompositeData
// as specified in the from method.
class LockInfo extends Object {

    @stub
    // Returns the fully qualified name of the class of the lock object.
    def getClassName(): String = ???

    @stub
    // Returns the identity hash code of the lock object
    // returned from the System.identityHashCode(java.lang.Object) method.
    def getIdentityHashCode(): Int = ???
}

object LockInfo {
    @stub
    // Returns a LockInfo object represented by the
    // given CompositeData.
    def from(cd: CompositeData): LockInfo = ???
}
