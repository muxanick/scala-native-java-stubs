package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String}
import java.util.concurrent.TimeUnit

// The lock returned by method ReentrantReadWriteLock.writeLock().
object ReentrantReadWriteLock.WriteLock extends Object with Lock, with Serializable {

    @stub
    // Queries the number of holds on this write lock by the current
    // thread.
    def getHoldCount(): Int = ???

    @stub
    // Queries if this write lock is held by the current thread.
    def isHeldByCurrentThread(): Boolean = ???

    @stub
    // Acquires the write lock.
    def lock(): Unit = ???

    @stub
    // Acquires the write lock unless the current thread is
    // interrupted.
    def lockInterruptibly(): Unit = ???

    @stub
    // Returns a Condition instance for use with this
    // Lock instance.
    def newCondition(): Condition = ???

    @stub
    // Returns a string identifying this lock, as well as its lock
    // state.
    def toString(): String = ???

    @stub
    // Acquires the write lock only if it is not held by another thread
    // at the time of invocation.
    def tryLock(): Boolean = ???

    @stub
    // Acquires the write lock if it is not held by another thread
    // within the given waiting time and the current thread has
    // not been interrupted.
    def tryLock(timeout: Long, unit: TimeUnit): Boolean = ???
}
