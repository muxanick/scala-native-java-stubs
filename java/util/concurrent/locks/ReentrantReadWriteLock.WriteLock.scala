package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String}
import java.util.concurrent.TimeUnit
import scala.scalanative.annotation.stub

/** The lock returned by method ReentrantReadWriteLock.writeLock(). */
object ReentrantReadWriteLock.WriteLock extends Object with Lock with Serializable {

    /** Constructor for use by subclasses */
    @stub
    protected def WriteLock(lock: ReentrantReadWriteLock) = ???

    /** Queries the number of holds on this write lock by the current
     *  thread.
     */
    @stub
    def getHoldCount(): Int = ???

    /** Queries if this write lock is held by the current thread. */
    @stub
    def isHeldByCurrentThread(): Boolean = ???

    /** Acquires the write lock. */
    @stub
    def lock(): Unit = ???

    /** Acquires the write lock unless the current thread is
     *  interrupted.
     */
    @stub
    def lockInterruptibly(): Unit = ???

    /** Returns a Condition instance for use with this
     *  Lock instance.
     */
    @stub
    def newCondition(): Condition = ???

    /** Returns a string identifying this lock, as well as its lock
     *  state.
     */
    @stub
    def toString(): String = ???

    /** Acquires the write lock only if it is not held by another thread
     *  at the time of invocation.
     */
    @stub
    def tryLock(): Boolean = ???

    /** Acquires the write lock if it is not held by another thread
     *  within the given waiting time and the current thread has
     *  not been interrupted.
     */
    @stub
    def tryLock(timeout: Long, unit: TimeUnit): Boolean = ???

    /** Attempts to release this lock. */
    @stub
    def unlock(): Unit = ???
}
