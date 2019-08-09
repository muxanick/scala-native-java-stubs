package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String}
import java.util.concurrent.TimeUnit

// The lock returned by method ReentrantReadWriteLock.readLock().
object ReentrantReadWriteLock.ReadLock extends Object with Lock, with Serializable {

    @stub
    // Acquires the read lock.
    def lock(): Unit = ???

    @stub
    // Acquires the read lock unless the current thread is
    // interrupted.
    def lockInterruptibly(): Unit = ???

    @stub
    // Throws UnsupportedOperationException because
    // ReadLocks do not support conditions.
    def newCondition(): Condition = ???

    @stub
    // Returns a string identifying this lock, as well as its lock state.
    def toString(): String = ???

    @stub
    // Acquires the read lock only if the write lock is not held by
    // another thread at the time of invocation.
    def tryLock(): Boolean = ???

    @stub
    // Acquires the read lock if the write lock is not held by
    // another thread within the given waiting time and the
    // current thread has not been interrupted.
    def tryLock(timeout: Long, unit: TimeUnit): Boolean = ???
}
