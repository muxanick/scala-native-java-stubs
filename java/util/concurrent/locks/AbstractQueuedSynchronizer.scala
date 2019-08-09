package java.util.concurrent.locks

import java.io.Serializable
import java.lang.{Object, String, Thread}
import java.util.Collection

/** Provides a framework for implementing blocking locks and related
 *  synchronizers (semaphores, events, etc) that rely on
 *  first-in-first-out (FIFO) wait queues.  This class is designed to
 *  be a useful basis for most kinds of synchronizers that rely on a
 *  single atomic int value to represent state. Subclasses
 *  must define the protected methods that change this state, and which
 *  define what that state means in terms of this object being acquired
 *  or released.  Given these, the other methods in this class carry
 *  out all queuing and blocking mechanics. Subclasses can maintain
 *  other state fields, but only the atomically updated int
 *  value manipulated using methods getState(), setState(int) and compareAndSetState(int, int) is tracked with respect
 *  to synchronization.
 * 
 *  Subclasses should be defined as non-public internal helper
 *  classes that are used to implement the synchronization properties
 *  of their enclosing class.  Class
 *  AbstractQueuedSynchronizer does not implement any
 *  synchronization interface.  Instead it defines methods such as
 *  acquireInterruptibly(int) that can be invoked as
 *  appropriate by concrete locks and related synchronizers to
 *  implement their public methods.
 * 
 *  This class supports either or both a default exclusive
 *  mode and a shared mode. When acquired in exclusive mode,
 *  attempted acquires by other threads cannot succeed. Shared mode
 *  acquires by multiple threads may (but need not) succeed. This class
 *  does not "understand" these differences except in the
 *  mechanical sense that when a shared mode acquire succeeds, the next
 *  waiting thread (if one exists) must also determine whether it can
 *  acquire as well. Threads waiting in the different modes share the
 *  same FIFO queue. Usually, implementation subclasses support only
 *  one of these modes, but both can come into play for example in a
 *  ReadWriteLock. Subclasses that support only exclusive or
 *  only shared modes need not define the methods supporting the unused mode.
 * 
 *  This class defines a nested AbstractQueuedSynchronizer.ConditionObject class that
 *  can be used as a Condition implementation by subclasses
 *  supporting exclusive mode for which method isHeldExclusively() reports whether synchronization is exclusively
 *  held with respect to the current thread, method release(int)
 *  invoked with the current getState() value fully releases
 *  this object, and acquire(int), given this saved state value,
 *  eventually restores this object to its previous acquired state.  No
 *  AbstractQueuedSynchronizer method otherwise creates such a
 *  condition, so if this constraint cannot be met, do not use it.  The
 *  behavior of AbstractQueuedSynchronizer.ConditionObject depends of course on the
 *  semantics of its synchronizer implementation.
 * 
 *  This class provides inspection, instrumentation, and monitoring
 *  methods for the internal queue, as well as similar methods for
 *  condition objects. These can be exported as desired into classes
 *  using an AbstractQueuedSynchronizer for their
 *  synchronization mechanics.
 * 
 *  Serialization of this class stores only the underlying atomic
 *  integer maintaining state, so deserialized objects have empty
 *  thread queues. Typical subclasses requiring serializability will
 *  define a readObject method that restores this to a known
 *  initial state upon deserialization.
 * 
 *  Usage
 * 
 *  To use this class as the basis of a synchronizer, redefine the
 *  following methods, as applicable, by inspecting and/or modifying
 *  the synchronization state using getState(), setState(int) and/or compareAndSetState(int, int):
 * 
 *  
 *   tryAcquire(int)
 *   tryRelease(int)
 *   tryAcquireShared(int)
 *   tryReleaseShared(int)
 *   isHeldExclusively()
 *  
 * 
 *  Each of these methods by default throws UnsupportedOperationException.  Implementations of these methods
 *  must be internally thread-safe, and should in general be short and
 *  not block. Defining these methods is the only supported
 *  means of using this class. All other methods are declared
 *  final because they cannot be independently varied.
 * 
 *  You may also find the inherited methods from AbstractOwnableSynchronizer useful to keep track of the thread
 *  owning an exclusive synchronizer.  You are encouraged to use them
 *  -- this enables monitoring and diagnostic tools to assist users in
 *  determining which threads hold locks.
 * 
 *  Even though this class is based on an internal FIFO queue, it
 *  does not automatically enforce FIFO acquisition policies.  The core
 *  of exclusive synchronization takes the form:
 * 
 *  
 *  Acquire:
 *      while (!tryAcquire(arg)) {
 *         enqueue thread if it is not already queued;
 *         possibly block current thread;
 *      }
 * 
 *  Release:
 *      if (tryRelease(arg))
 *         unblock the first queued thread;
 *  
 * 
 *  (Shared mode is similar but may involve cascading signals.)
 * 
 *  Because checks in acquire are invoked before
 *  enqueuing, a newly acquiring thread may barge ahead of
 *  others that are blocked and queued.  However, you can, if desired,
 *  define tryAcquire and/or tryAcquireShared to
 *  disable barging by internally invoking one or more of the inspection
 *  methods, thereby providing a fair FIFO acquisition order.
 *  In particular, most fair synchronizers can define tryAcquire
 *  to return false if hasQueuedPredecessors() (a method
 *  specifically designed to be used by fair synchronizers) returns
 *  true.  Other variations are possible.
 * 
 *  Throughput and scalability are generally highest for the
 *  default barging (also known as greedy,
 *  renouncement, and convoy-avoidance) strategy.
 *  While this is not guaranteed to be fair or starvation-free, earlier
 *  queued threads are allowed to recontend before later queued
 *  threads, and each recontention has an unbiased chance to succeed
 *  against incoming threads.  Also, while acquires do not
 *  "spin" in the usual sense, they may perform multiple
 *  invocations of tryAcquire interspersed with other
 *  computations before blocking.  This gives most of the benefits of
 *  spins when exclusive synchronization is only briefly held, without
 *  most of the liabilities when it isn't. If so desired, you can
 *  augment this by preceding calls to acquire methods with
 *  "fast-path" checks, possibly prechecking hasContended()
 *  and/or hasQueuedThreads() to only do so if the synchronizer
 *  is likely not to be contended.
 * 
 *  This class provides an efficient and scalable basis for
 *  synchronization in part by specializing its range of use to
 *  synchronizers that can rely on int state, acquire, and
 *  release parameters, and an internal FIFO wait queue. When this does
 *  not suffice, you can build synchronizers from a lower level using
 *  atomic classes, your own custom
 *  Queue classes, and LockSupport blocking
 *  support.
 * 
 *  Usage Examples
 * 
 *  Here is a non-reentrant mutual exclusion lock class that uses
 *  the value zero to represent the unlocked state, and one to
 *  represent the locked state. While a non-reentrant lock
 *  does not strictly require recording of the current owner
 *  thread, this class does so anyway to make usage easier to monitor.
 *  It also supports conditions and exposes
 *  one of the instrumentation methods:
 * 
 *    
 *  class Mutex implements Lock, java.io.Serializable {
 * 
 *    // Our internal helper class
 *    private static class Sync extends AbstractQueuedSynchronizer {
 *      // Reports whether in locked state
 *      protected boolean isHeldExclusively() {
 *        return getState() == 1;
 *      }
 * 
 *      // Acquires the lock if state is zero
 *      public boolean tryAcquire(int acquires) {
 *        assert acquires == 1; // Otherwise unused
 *        if (compareAndSetState(0, 1)) {
 *          setExclusiveOwnerThread(Thread.currentThread());
 *          return true;
 *        }
 *        return false;
 *      }
 * 
 *      // Releases the lock by setting state to zero
 *      protected boolean tryRelease(int releases) {
 *        assert releases == 1; // Otherwise unused
 *        if (getState() == 0) throw new IllegalMonitorStateException();
 *        setExclusiveOwnerThread(null);
 *        setState(0);
 *        return true;
 *      }
 * 
 *      // Provides a Condition
 *      Condition newCondition() { return new ConditionObject(); }
 * 
 *      // Deserializes properly
 *      private void readObject(ObjectInputStream s)
 *          throws IOException, ClassNotFoundException {
 *        s.defaultReadObject();
 *        setState(0); // reset to unlocked state
 *      }
 *    }
 * 
 *    // The sync object does all the hard work. We just forward to it.
 *    private final Sync sync = new Sync();
 * 
 *    public void lock()                { sync.acquire(1); }
 *    public boolean tryLock()          { return sync.tryAcquire(1); }
 *    public void unlock()              { sync.release(1); }
 *    public Condition newCondition()   { return sync.newCondition(); }
 *    public boolean isLocked()         { return sync.isHeldExclusively(); }
 *    public boolean hasQueuedThreads() { return sync.hasQueuedThreads(); }
 *    public void lockInterruptibly() throws InterruptedException {
 *      sync.acquireInterruptibly(1);
 *    }
 *    public boolean tryLock(long timeout, TimeUnit unit)
 *        throws InterruptedException {
 *      return sync.tryAcquireNanos(1, unit.toNanos(timeout));
 *    }
 *  }
 * 
 *  Here is a latch class that is like a
 *  CountDownLatch
 *  except that it only requires a single signal to
 *  fire. Because a latch is non-exclusive, it uses the shared
 *  acquire and release methods.
 * 
 *    
 *  class BooleanLatch {
 * 
 *    private static class Sync extends AbstractQueuedSynchronizer {
 *      boolean isSignalled() { return getState() != 0; }
 * 
 *      protected int tryAcquireShared(int ignore) {
 *        return isSignalled() ? 1 : -1;
 *      }
 * 
 *      protected boolean tryReleaseShared(int ignore) {
 *        setState(1);
 *        return true;
 *      }
 *    }
 * 
 *    private final Sync sync = new Sync();
 *    public boolean isSignalled() { return sync.isSignalled(); }
 *    public void signal()         { sync.releaseShared(1); }
 *    public void await() throws InterruptedException {
 *      sync.acquireSharedInterruptibly(1);
 *    }
 *  }
 */
abstract class AbstractQueuedSynchronizer extends AbstractOwnableSynchronizer with Serializable {

    /** Acquires in exclusive mode, ignoring interrupts. */
    def acquire(arg: Int): Unit

    /** Acquires in exclusive mode, aborting if interrupted. */
    def acquireInterruptibly(arg: Int): Unit

    /** Acquires in shared mode, ignoring interrupts. */
    def acquireShared(arg: Int): Unit

    /** Acquires in shared mode, aborting if interrupted. */
    def acquireSharedInterruptibly(arg: Int): Unit

    /** Atomically sets synchronization state to the given updated
     *  value if the current state value equals the expected value.
     */
    protected def compareAndSetState(expect: Int, update: Int): Boolean

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
    protected def getState(): Int

    /** Returns a collection containing those threads that may be
     *  waiting on the given condition associated with this
     *  synchronizer.
     */
    def getWaitingThreads(condition: AbstractQueuedSynchronizer.ConditionObject): Collection[Thread]

    /** Returns an estimate of the number of threads waiting on the
     *  given condition associated with this synchronizer.
     */
    def getWaitQueueLength(condition: AbstractQueuedSynchronizer.ConditionObject): Int

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
    def hasWaiters(condition: AbstractQueuedSynchronizer.ConditionObject): Boolean

    /** Returns true if synchronization is held exclusively with
     *  respect to the current (calling) thread.
     */
    protected def isHeldExclusively(): Boolean

    /** Returns true if the given thread is currently queued. */
    def isQueued(thread: Thread): Boolean

    /** Queries whether the given ConditionObject
     *  uses this synchronizer as its lock.
     */
    def owns(condition: AbstractQueuedSynchronizer.ConditionObject): Boolean

    /** Releases in exclusive mode. */
    def release(arg: Int): Boolean

    /** Releases in shared mode. */
    def releaseShared(arg: Int): Boolean

    /** Sets the value of synchronization state. */
    protected def setState(newState: Int): Unit

    /** Returns a string identifying this synchronizer, as well as its state. */
    def toString(): String

    /** Attempts to acquire in exclusive mode. */
    protected def tryAcquire(arg: Int): Boolean

    /** Attempts to acquire in exclusive mode, aborting if interrupted,
     *  and failing if the given timeout elapses.
     */
    def tryAcquireNanos(arg: Int, nanosTimeout: Long): Boolean

    /** Attempts to acquire in shared mode. */
    protected def tryAcquireShared(arg: Int): Int

    /** Attempts to acquire in shared mode, aborting if interrupted, and
     *  failing if the given timeout elapses.
     */
    def tryAcquireSharedNanos(arg: Int, nanosTimeout: Long): Boolean

    /** Attempts to set the state to reflect a release in exclusive
     *  mode.
     */
    protected def tryRelease(arg: Int): Boolean
}
