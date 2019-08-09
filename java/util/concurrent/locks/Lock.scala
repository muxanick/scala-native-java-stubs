package java.util.concurrent.locks

import java.util.concurrent.TimeUnit
import scala.scalanative.annotation.stub

/** Lock implementations provide more extensive locking
 *  operations than can be obtained using synchronized methods
 *  and statements.  They allow more flexible structuring, may have
 *  quite different properties, and may support multiple associated
 *  Condition objects.
 * 
 *  A lock is a tool for controlling access to a shared resource by
 *  multiple threads. Commonly, a lock provides exclusive access to a
 *  shared resource: only one thread at a time can acquire the lock and
 *  all access to the shared resource requires that the lock be
 *  acquired first. However, some locks may allow concurrent access to
 *  a shared resource, such as the read lock of a ReadWriteLock.
 * 
 *  The use of synchronized methods or statements provides
 *  access to the implicit monitor lock associated with every object, but
 *  forces all lock acquisition and release to occur in a block-structured way:
 *  when multiple locks are acquired they must be released in the opposite
 *  order, and all locks must be released in the same lexical scope in which
 *  they were acquired.
 * 
 *  While the scoping mechanism for synchronized methods
 *  and statements makes it much easier to program with monitor locks,
 *  and helps avoid many common programming errors involving locks,
 *  there are occasions where you need to work with locks in a more
 *  flexible way. For example, some algorithms for traversing
 *  concurrently accessed data structures require the use of
 *  "hand-over-hand" or "chain locking": you
 *  acquire the lock of node A, then node B, then release A and acquire
 *  C, then release B and acquire D and so on.  Implementations of the
 *  Lock interface enable the use of such techniques by
 *  allowing a lock to be acquired and released in different scopes,
 *  and allowing multiple locks to be acquired and released in any
 *  order.
 * 
 *  With this increased flexibility comes additional
 *  responsibility. The absence of block-structured locking removes the
 *  automatic release of locks that occurs with synchronized
 *  methods and statements. In most cases, the following idiom
 *  should be used:
 * 
 *    
 *  Lock l = ...;
 *  l.lock();
 *  try {
 *    // access the resource protected by this lock
 *  } finally {
 *    l.unlock();
 *  }
 * 
 *  When locking and unlocking occur in different scopes, care must be
 *  taken to ensure that all code that is executed while the lock is
 *  held is protected by try-finally or try-catch to ensure that the
 *  lock is released when necessary.
 * 
 *  Lock implementations provide additional functionality
 *  over the use of synchronized methods and statements by
 *  providing a non-blocking attempt to acquire a lock (tryLock()), an attempt to acquire the lock that can be
 *  interrupted (lockInterruptibly(), and an attempt to acquire
 *  the lock that can timeout (tryLock(long, TimeUnit)).
 * 
 *  A Lock class can also provide behavior and semantics
 *  that is quite different from that of the implicit monitor lock,
 *  such as guaranteed ordering, non-reentrant usage, or deadlock
 *  detection. If an implementation provides such specialized semantics
 *  then the implementation must document those semantics.
 * 
 *  Note that Lock instances are just normal objects and can
 *  themselves be used as the target in a synchronized statement.
 *  Acquiring the
 *  monitor lock of a Lock instance has no specified relationship
 *  with invoking any of the lock() methods of that instance.
 *  It is recommended that to avoid confusion you never use Lock
 *  instances in this way, except within their own implementation.
 * 
 *  Except where noted, passing a null value for any
 *  parameter will result in a NullPointerException being
 *  thrown.
 * 
 *  Memory Synchronization
 * 
 *  All Lock implementations must enforce the same
 *  memory synchronization semantics as provided by the built-in monitor
 *  lock, as described in
 *  
 *  The Java Language Specification (17.4 Memory Model):
 *  
 *  A successful lock operation has the same memory
 *  synchronization effects as a successful Lock action.
 *  A successful unlock operation has the same
 *  memory synchronization effects as a successful Unlock action.
 *  
 * 
 *  Unsuccessful locking and unlocking operations, and reentrant
 *  locking/unlocking operations, do not require any memory
 *  synchronization effects.
 * 
 *  Implementation Considerations
 * 
 *  The three forms of lock acquisition (interruptible,
 *  non-interruptible, and timed) may differ in their performance
 *  characteristics, ordering guarantees, or other implementation
 *  qualities.  Further, the ability to interrupt the ongoing
 *  acquisition of a lock may not be available in a given Lock
 *  class.  Consequently, an implementation is not required to define
 *  exactly the same guarantees or semantics for all three forms of
 *  lock acquisition, nor is it required to support interruption of an
 *  ongoing lock acquisition.  An implementation is required to clearly
 *  document the semantics and guarantees provided by each of the
 *  locking methods. It must also obey the interruption semantics as
 *  defined in this interface, to the extent that interruption of lock
 *  acquisition is supported: which is either totally, or only on
 *  method entry.
 * 
 *  As interruption generally implies cancellation, and checks for
 *  interruption are often infrequent, an implementation can favor responding
 *  to an interrupt over normal method return. This is true even if it can be
 *  shown that the interrupt occurred after another action may have unblocked
 *  the thread. An implementation should document this behavior.
 */
trait Lock {

    /** Acquires the lock. */
    @stub
    def lock(): Unit = ???

    /** Acquires the lock unless the current thread is
     *  interrupted.
     */
    @stub
    def lockInterruptibly(): Unit = ???

    /** Returns a new Condition instance that is bound to this
     *  Lock instance.
     */
    @stub
    def newCondition(): Condition = ???

    /** Acquires the lock only if it is free at the time of invocation. */
    @stub
    def tryLock(): Boolean = ???

    /** Acquires the lock if it is free within the given waiting time and the
     *  current thread has not been interrupted.
     */
    @stub
    def tryLock(time: Long, unit: TimeUnit): Boolean = ???

    /** Releases the lock. */
    @stub
    def unlock(): Unit = ???
}
