package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, Thread}
import java.util.{Collection, Date}
import java.util.concurrent.TimeUnit
import scala.scalanative.annotation.stub

/** Condition implementation for a AbstractQueuedSynchronizer serving as the basis of a Lock implementation.
 * 
 *  Method documentation for this class describes mechanics,
 *  not behavioral specifications from the point of view of Lock
 *  and Condition users. Exported versions of this class will in
 *  general need to be accompanied by documentation describing
 *  condition semantics that rely on those of the associated
 *  AbstractQueuedSynchronizer.
 * 
 *  This class is Serializable, but all fields are transient,
 *  so deserialized conditions have no waiters.
 */
class AbstractQueuedSynchronizer_ConditionObject extends Object with Condition with Serializable {

    /** Creates a new ConditionObject instance. */
    @stub
    def ConditionObject() = ???

    /** Implements interruptible condition wait. */
    @stub
    def await(): Unit = ???

    /** Implements timed condition wait. */
    @stub
    def await(time: Long, unit: TimeUnit): Boolean = ???

    /** Implements timed condition wait. */
    @stub
    def awaitNanos(nanosTimeout: Long): Long = ???

    /** Implements uninterruptible condition wait. */
    @stub
    def awaitUninterruptibly(): Unit = ???

    /** Implements absolute timed condition wait. */
    @stub
    def awaitUntil(deadline: Date): Boolean = ???

    /** Returns a collection containing those threads that may be
     *  waiting on this Condition.
     */
    @stub
    protected def getWaitingThreads(): Collection[Thread] = ???

    /** Returns an estimate of the number of threads waiting on
     *  this condition.
     */
    @stub
    protected def getWaitQueueLength(): Int = ???

    /** Queries whether any threads are waiting on this condition. */
    @stub
    protected def hasWaiters(): Boolean = ???

    /** Moves the longest-waiting thread, if one exists, from the
     *  wait queue for this condition to the wait queue for the
     *  owning lock.
     */
    @stub
    def signal(): Unit = ???

    /** Moves all threads from the wait queue for this condition to
     *  the wait queue for the owning lock.
     */
    @stub
    def signalAll(): Unit = ???
}
