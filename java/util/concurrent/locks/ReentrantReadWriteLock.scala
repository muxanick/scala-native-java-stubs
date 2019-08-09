package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String, Thread}
import java.util.Collection

// An implementation of ReadWriteLock supporting similar
// semantics to ReentrantLock.
// This class has the following properties:
//
// 
// Acquisition order
//
// This class does not impose a reader or writer preference
// ordering for lock access.  However, it does support an optional
// fairness policy.
//
// 
// Non-fair mode (default)
// When constructed as non-fair (the default), the order of entry
// to the read and write lock is unspecified, subject to reentrancy
// constraints.  A nonfair lock that is continuously contended may
// indefinitely postpone one or more reader or writer threads, but
// will normally have higher throughput than a fair lock.
//
// Fair mode
// When constructed as fair, threads contend for entry using an
// approximately arrival-order policy. When the currently held lock
// is released, either the longest-waiting single writer thread will
// be assigned the write lock, or if there is a group of reader threads
// waiting longer than all waiting writer threads, that group will be
// assigned the read lock.
//
// A thread that tries to acquire a fair read lock (non-reentrantly)
// will block if either the write lock is held, or there is a waiting
// writer thread. The thread will not acquire the read lock until
// after the oldest currently waiting writer thread has acquired and
// released the write lock. Of course, if a waiting writer abandons
// its wait, leaving one or more reader threads as the longest waiters
// in the queue with the write lock free, then those readers will be
// assigned the read lock.
//
// A thread that tries to acquire a fair write lock (non-reentrantly)
// will block unless both the read lock and write lock are free (which
// implies there are no waiting threads).  (Note that the non-blocking
// ReentrantReadWriteLock.ReadLock.tryLock() and ReentrantReadWriteLock.WriteLock.tryLock() methods
// do not honor this fair setting and will immediately acquire the lock
// if it is possible, regardless of waiting threads.)
// 
// 
//
// Reentrancy
//
// This lock allows both readers and writers to reacquire read or
// write locks in the style of a ReentrantLock. Non-reentrant
// readers are not allowed until all write locks held by the writing
// thread have been released.
//
// Additionally, a writer can acquire the read lock, but not
// vice-versa.  Among other applications, reentrancy can be useful
// when write locks are held during calls or callbacks to methods that
// perform reads under read locks.  If a reader tries to acquire the
// write lock it will never succeed.
//
// Lock downgrading
// Reentrancy also allows downgrading from the write lock to a read lock,
// by acquiring the write lock, then the read lock and then releasing the
// write lock. However, upgrading from a read lock to the write lock is
// not possible.
//
// Interruption of lock acquisition
// The read lock and write lock both support interruption during lock
// acquisition.
//
// Condition support
// The write lock provides a Condition implementation that
// behaves in the same way, with respect to the write lock, as the
// Condition implementation provided by
// ReentrantLock.newCondition() does for ReentrantLock.
// This Condition can, of course, only be used with the write lock.
//
// The read lock does not support a Condition and
// readLock().newCondition() throws
// UnsupportedOperationException.
//
// Instrumentation
// This class supports methods to determine whether locks
// are held or contended. These methods are designed for monitoring
// system state, not for synchronization control.
// 
//
// Serialization of this class behaves in the same way as built-in
// locks: a deserialized lock is in the unlocked state, regardless of
// its state when serialized.
//
// Sample usages. Here is a code sketch showing how to perform
// lock downgrading after updating a cache (exception handling is
// particularly tricky when handling multiple locks in a non-nested
// fashion):
//
//  
// class CachedData {
//   Object data;
//   volatile boolean cacheValid;
//   final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
//
//   void processCachedData() {
//     rwl.readLock().lock();
//     if (!cacheValid) {
//       // Must release read lock before acquiring write lock
//       rwl.readLock().unlock();
//       rwl.writeLock().lock();
//       try {
//         // Recheck state because another thread might have
//         // acquired write lock and changed state before we did.
//         if (!cacheValid) {
//           data = ...
//           cacheValid = true;
//         }
//         // Downgrade by acquiring read lock before releasing write lock
//         rwl.readLock().lock();
//       } finally {
//         rwl.writeLock().unlock(); // Unlock write, still hold read
//       }
//     }
//
//     try {
//       use(data);
//     } finally {
//       rwl.readLock().unlock();
//     }
//   }
// }
//
// ReentrantReadWriteLocks can be used to improve concurrency in some
// uses of some kinds of Collections. This is typically worthwhile
// only when the collections are expected to be large, accessed by
// more reader threads than writer threads, and entail operations with
// overhead that outweighs synchronization overhead. For example, here
// is a class using a TreeMap that is expected to be large and
// concurrently accessed.
//
//   
// class RWDictionary {
//   private final Map<String, Data> m = new TreeMap<String, Data>();
//   private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
//   private final Lock r = rwl.readLock();
//   private final Lock w = rwl.writeLock();
//
//   public Data get(String key) {
//     r.lock();
//     try { return m.get(key); }
//     finally { r.unlock(); }
//   }
//   public String[] allKeys() {
//     r.lock();
//     try { return m.keySet().toArray(); }
//     finally { r.unlock(); }
//   }
//   public Data put(String key, Data value) {
//     w.lock();
//     try { return m.put(key, value); }
//     finally { w.unlock(); }
//   }
//   public void clear() {
//     w.lock();
//     try { m.clear(); }
//     finally { w.unlock(); }
//   }
// }
//
// Implementation Notes
//
// This lock supports a maximum of 65535 recursive write locks
// and 65535 read locks. Attempts to exceed these limits result in
// Error throws from locking methods.
class ReentrantReadWriteLock extends Object with ReadWriteLock, with Serializable {

    @stub
    // Creates a new ReentrantReadWriteLock with
    // default (nonfair) ordering properties.
    def this() = ???

    @stub
    // Returns the thread that currently owns the write lock, or
    // null if not owned.
    protected def getOwner(): Thread = ???

    @stub
    // Returns a collection containing threads that may be waiting to
    // acquire the read lock.
    protected def getQueuedReaderThreads(): Collection[Thread] = ???

    @stub
    // Returns a collection containing threads that may be waiting to
    // acquire either the read or write lock.
    protected def getQueuedThreads(): Collection[Thread] = ???

    @stub
    // Returns a collection containing threads that may be waiting to
    // acquire the write lock.
    protected def getQueuedWriterThreads(): Collection[Thread] = ???

    @stub
    // Returns an estimate of the number of threads waiting to acquire
    // either the read or write lock.
    def getQueueLength(): Int = ???

    @stub
    // Queries the number of reentrant read holds on this lock by the
    // current thread.
    def getReadHoldCount(): Int = ???

    @stub
    // Queries the number of read locks held for this lock.
    def getReadLockCount(): Int = ???

    @stub
    // Returns a collection containing those threads that may be
    // waiting on the given condition associated with the write lock.
    protected def getWaitingThreads(condition: Condition): Collection[Thread] = ???

    @stub
    // Returns an estimate of the number of threads waiting on the
    // given condition associated with the write lock.
    def getWaitQueueLength(condition: Condition): Int = ???

    @stub
    // Queries the number of reentrant write holds on this lock by the
    // current thread.
    def getWriteHoldCount(): Int = ???

    @stub
    // Queries whether the given thread is waiting to acquire either
    // the read or write lock.
    def hasQueuedThread(thread: Thread): Boolean = ???

    @stub
    // Queries whether any threads are waiting to acquire the read or
    // write lock.
    def hasQueuedThreads(): Boolean = ???

    @stub
    // Queries whether any threads are waiting on the given condition
    // associated with the write lock.
    def hasWaiters(condition: Condition): Boolean = ???

    @stub
    // Returns true if this lock has fairness set true.
    def isFair(): Boolean = ???

    @stub
    // Queries if the write lock is held by any thread.
    def isWriteLocked(): Boolean = ???

    @stub
    // Queries if the write lock is held by the current thread.
    def isWriteLockedByCurrentThread(): Boolean = ???

    @stub
    // Returns the lock used for reading.
    def readLock(): ReentrantReadWriteLock.ReadLock = ???

    @stub
    // Returns a string identifying this lock, as well as its lock state.
    def toString(): String = ???
}

object ReentrantReadWriteLock {
    @stub
    // The lock returned by method readLock().
    def ReentrantReadWriteLock.ReadLock: class = ???
}