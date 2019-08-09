package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String, Thread}
import java.util.Collection
import java.util.concurrent.TimeUnit

/** A reentrant mutual exclusion Lock with the same basic
 *  behavior and semantics as the implicit monitor lock accessed using
 *  synchronized methods and statements, but with extended
 *  capabilities.
 * 
 *  A ReentrantLock is owned by the thread last
 *  successfully locking, but not yet unlocking it. A thread invoking
 *  lock will return, successfully acquiring the lock, when
 *  the lock is not owned by another thread. The method will return
 *  immediately if the current thread already owns the lock. This can
 *  be checked using methods isHeldByCurrentThread(), and getHoldCount().
 * 
 *  The constructor for this class accepts an optional
 *  fairness parameter.  When set true, under
 *  contention, locks favor granting access to the longest-waiting
 *  thread.  Otherwise this lock does not guarantee any particular
 *  access order.  Programs using fair locks accessed by many threads
 *  may display lower overall throughput (i.e., are slower; often much
 *  slower) than those using the default setting, but have smaller
 *  variances in times to obtain locks and guarantee lack of
 *  starvation. Note however, that fairness of locks does not guarantee
 *  fairness of thread scheduling. Thus, one of many threads using a
 *  fair lock may obtain it multiple times in succession while other
 *  active threads are not progressing and not currently holding the
 *  lock.
 *  Also note that the untimed tryLock() method does not
 *  honor the fairness setting. It will succeed if the lock
 *  is available even if other threads are waiting.
 * 
 *  It is recommended practice to always immediately
 *  follow a call to lock with a try block, most
 *  typically in a before/after construction such as:
 * 
 *    
 *  class X {
 *    private final ReentrantLock lock = new ReentrantLock();
 *    // ...
 * 
 *    public void m() {
 *      lock.lock();  // block until condition holds
 *      try {
 *        // ... method body
 *      } finally {
 *        lock.unlock()
 *      }
 *    }
 *  }
 * 
 *  In addition to implementing the Lock interface, this
 *  class defines a number of public and protected
 *  methods for inspecting the state of the lock.  Some of these
 *  methods are only useful for instrumentation and monitoring.
 * 
 *  Serialization of this class behaves in the same way as built-in
 *  locks: a deserialized lock is in the unlocked state, regardless of
 *  its state when serialized.
 * 
 *  This lock supports a maximum of 2147483647 recursive locks by
 *  the same thread. Attempts to exceed this limit result in
 *  Error throws from locking methods.
 */
class ReentrantLock extends Object with Lock with Serializable {

    /** Creates an instance of ReentrantLock. */
    @stub
    def this() = ???

    /** Queries the number of holds on this lock by the current thread. */
    @stub
    def getHoldCount(): Int = ???

    /** Returns the thread that currently owns this lock, or
     *  null if not owned.
     */
    @stub
    protected def getOwner(): Thread = ???

    /** Returns a collection containing threads that may be waiting to
     *  acquire this lock.
     */
    @stub
    protected def getQueuedThreads(): Collection[Thread] = ???

    /** Returns an estimate of the number of threads waiting to
     *  acquire this lock.
     */
    @stub
    def getQueueLength(): Int = ???

    /** Returns a collection containing those threads that may be
     *  waiting on the given condition associated with this lock.
     */
    @stub
    protected def getWaitingThreads(condition: Condition): Collection[Thread] = ???

    /** Returns an estimate of the number of threads waiting on the
     *  given condition associated with this lock.
     */
    @stub
    def getWaitQueueLength(condition: Condition): Int = ???

    /** Queries whether the given thread is waiting to acquire this
     *  lock.
     */
    @stub
    def hasQueuedThread(thread: Thread): Boolean = ???

    /** Queries whether any threads are waiting to acquire this lock. */
    @stub
    def hasQueuedThreads(): Boolean = ???

    /** Queries whether any threads are waiting on the given condition
     *  associated with this lock.
     */
    @stub
    def hasWaiters(condition: Condition): Boolean = ???

    /** Returns true if this lock has fairness set true. */
    @stub
    def isFair(): Boolean = ???

    /** Queries if this lock is held by the current thread. */
    @stub
    def isHeldByCurrentThread(): Boolean = ???

    /** Queries if this lock is held by any thread. */
    @stub
    def isLocked(): Boolean = ???

    /** Acquires the lock. */
    @stub
    def lock(): Unit = ???

    /** Acquires the lock unless the current thread is
     *  interrupted.
     */
    @stub
    def lockInterruptibly(): Unit = ???

    /** Returns a Condition instance for use with this
     *  Lock instance.
     */
    @stub
    def newCondition(): Condition = ???

    /** Returns a string identifying this lock, as well as its lock state. */
    @stub
    def toString(): String = ???

    /** Acquires the lock only if it is not held by another thread at the time
     *  of invocation.
     */
    @stub
    def tryLock(): Boolean = ???

    /** Acquires the lock if it is not held by another thread within the given
     *  waiting time and the current thread has not been
     *  interrupted.
     */
    @stub
    def tryLock(timeout: Long, unit: TimeUnit): Boolean = ???
}
