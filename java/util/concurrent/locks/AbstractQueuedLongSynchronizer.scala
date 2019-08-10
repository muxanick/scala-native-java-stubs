package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String, Thread}
import java.util.Collection
import scala.scalanative.annotation.stub

/** A version of AbstractQueuedSynchronizer in
 *  which synchronization state is maintained as a long.
 *  This class has exactly the same structure, properties, and methods
 *  as AbstractQueuedSynchronizer with the exception
 *  that all state-related parameters and results are defined
 *  as long rather than int. This class
 *  may be useful when creating synchronizers such as
 *  multilevel locks and barriers that require
 *  64 bits of state.
 * 
 *  See AbstractQueuedSynchronizer for usage
 *  notes and examples.
 */
abstract class AbstractQueuedLongSynchronizer extends AbstractOwnableSynchronizer with Serializable {

    /** Creates a new AbstractQueuedLongSynchronizer instance
     *  with initial synchronization state of zero.
     */
    @stub
    protected def this() = ???

    /** Condition implementation for a AbstractQueuedLongSynchronizer serving as the basis of a Lock implementation. */
    type ConditionObject = AbstractQueuedLongSynchronizer_ConditionObject

    /** Acquires in exclusive mode, ignoring interrupts. */
    def acquire(arg: Long): Unit

    /** Acquires in exclusive mode, aborting if interrupted. */
    def acquireInterruptibly(arg: Long): Unit

    /** Acquires in shared mode, ignoring interrupts. */
    def acquireShared(arg: Long): Unit

    /** Acquires in shared mode, aborting if interrupted. */
    def acquireSharedInterruptibly(arg: Long): Unit

    /** Atomically sets synchronization state to the given updated
     *  value if the current state value equals the expected value.
     */
    protected def compareAndSetState(expect: Long, update: Long): Boolean

    /** Returns a collection containing threads that may be waiting to
     *  acquire in exclusive mode.
     */
    def getExclusiveQueuedThreads(): Collection[Thread]

    /** Returns the first (longest-waiting) thread in the queue, or
     *  null if no threads are currently queued.
     */
    def getFirstQueuedThread(): Thread

    /** Returns a collection containing threads that may be waiting to
     *  acquire.
     */
    def getQueuedThreads(): Collection[Thread]

    /** Returns an estimate of the number of threads waiting to
     *  acquire.
     */
    def getQueueLength(): Int

    /** Returns a collection containing threads that may be waiting to
     *  acquire in shared mode.
     */
    def getSharedQueuedThreads(): Collection[Thread]

    /** Returns the current value of synchronization state. */
    protected def getState(): Long

    /** Returns a collection containing those threads that may be
     *  waiting on the given condition associated with this
     *  synchronizer.
     */
    def getWaitingThreads(condition: AbstractQueuedLongSynchronizer.ConditionObject): Collection[Thread]

    /** Returns an estimate of the number of threads waiting on the
     *  given condition associated with this synchronizer.
     */
    def getWaitQueueLength(condition: AbstractQueuedLongSynchronizer.ConditionObject): Int

    /** Queries whether any threads have ever contended to acquire this
     *  synchronizer; that is if an acquire method has ever blocked.
     */
    def hasContended(): Boolean

    /** Queries whether any threads have been waiting to acquire longer
     *  than the current thread.
     */
    def hasQueuedPredecessors(): Boolean

    /** Queries whether any threads are waiting to acquire. */
    def hasQueuedThreads(): Boolean

    /** Queries whether any threads are waiting on the given condition
     *  associated with this synchronizer.
     */
    def hasWaiters(condition: AbstractQueuedLongSynchronizer.ConditionObject): Boolean

    /** Returns true if synchronization is held exclusively with
     *  respect to the current (calling) thread.
     */
    protected def isHeldExclusively(): Boolean

    /** Returns true if the given thread is currently queued. */
    def isQueued(thread: Thread): Boolean

    /** Queries whether the given ConditionObject
     *  uses this synchronizer as its lock.
     */
    def owns(condition: AbstractQueuedLongSynchronizer.ConditionObject): Boolean

    /** Releases in exclusive mode. */
    def release(arg: Long): Boolean

    /** Releases in shared mode. */
    def releaseShared(arg: Long): Boolean

    /** Sets the value of synchronization state. */
    protected def setState(newState: Long): Unit

    /** Returns a string identifying this synchronizer, as well as its state. */
    def toString(): String

    /** Attempts to acquire in exclusive mode. */
    protected def tryAcquire(arg: Long): Boolean

    /** Attempts to acquire in exclusive mode, aborting if interrupted,
     *  and failing if the given timeout elapses.
     */
    def tryAcquireNanos(arg: Long, nanosTimeout: Long): Boolean

    /** Attempts to acquire in shared mode. */
    protected def tryAcquireShared(arg: Long): Long

    /** Attempts to acquire in shared mode, aborting if interrupted, and
     *  failing if the given timeout elapses.
     */
    def tryAcquireSharedNanos(arg: Long, nanosTimeout: Long): Boolean

    /** Attempts to set the state to reflect a release in exclusive
     *  mode.
     */
    protected def tryRelease(arg: Long): Boolean

    /** Attempts to set the state to reflect a release in shared mode. */
    protected def tryReleaseShared(arg: Long): Boolean
}
