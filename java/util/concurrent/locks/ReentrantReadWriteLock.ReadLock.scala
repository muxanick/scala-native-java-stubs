package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String}
import java.util.concurrent.TimeUnit
import scala.scalanative.annotation.stub

/** The lock returned by method ReentrantReadWriteLock.readLock(). */
object ReentrantReadWriteLock.ReadLock extends Object with Lock with Serializable {

    /** Constructor for use by subclasses */
    @stub
    protected def ReadLock(lock: ReentrantReadWriteLock) = ???

    /** Acquires the read lock. */
    @stub
    def lock(): Unit = ???

    /** Acquires the read lock unless the current thread is
     *  interrupted.
     */
    @stub
    def lockInterruptibly(): Unit = ???

    /** Throws UnsupportedOperationException because
     *  ReadLocks do not support conditions.
     */
    @stub
    def newCondition(): Condition = ???

    /** Returns a string identifying this lock, as well as its lock state. */
    @stub
    def toString(): String = ???

    /** Acquires the read lock only if the write lock is not held by
     *  another thread at the time of invocation.
     */
    @stub
    def tryLock(): Boolean = ???

    /** Acquires the read lock if the write lock is not held by
     *  another thread within the given waiting time and the
     *  current thread has not been interrupted.
     */
    @stub
    def tryLock(timeout: Long, unit: TimeUnit): Boolean = ???

    /** Attempts to release this lock. */
    @stub
    def unlock(): Unit = ???
}
