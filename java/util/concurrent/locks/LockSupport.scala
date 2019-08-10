package java.util.concurrent.locks

import java.lang.{Object, Thread}
import scala.scalanative.annotation.stub

/** Basic thread blocking primitives for creating locks and other
 *  synchronization classes.
 * 
 *  This class associates, with each thread that uses it, a permit
 *  (in the sense of the Semaphore class). A call to park will return immediately
 *  if the permit is available, consuming it in the process; otherwise
 *  it may block.  A call to unpark makes the permit
 *  available, if it was not already available. (Unlike with Semaphores
 *  though, permits do not accumulate. There is at most one.)
 * 
 *  Methods park and unpark provide efficient
 *  means of blocking and unblocking threads that do not encounter the
 *  problems that cause the deprecated methods Thread.suspend
 *  and Thread.resume to be unusable for such purposes: Races
 *  between one thread invoking park and another thread trying
 *  to unpark it will preserve liveness, due to the
 *  permit. Additionally, park will return if the caller's
 *  thread was interrupted, and timeout versions are supported. The
 *  park method may also return at any other time, for "no
 *  reason", so in general must be invoked within a loop that rechecks
 *  conditions upon return. In this sense park serves as an
 *  optimization of a "busy wait" that does not waste as much time
 *  spinning, but must be paired with an unpark to be
 *  effective.
 * 
 *  The three forms of park each also support a
 *  blocker object parameter. This object is recorded while
 *  the thread is blocked to permit monitoring and diagnostic tools to
 *  identify the reasons that threads are blocked. (Such tools may
 *  access blockers using method getBlocker(Thread).)
 *  The use of these forms rather than the original forms without this
 *  parameter is strongly encouraged. The normal argument to supply as
 *  a blocker within a lock implementation is this.
 * 
 *  These methods are designed to be used as tools for creating
 *  higher-level synchronization utilities, and are not in themselves
 *  useful for most concurrency control applications.  The park
 *  method is designed for use only in constructions of the form:
 * 
 *    
 *  while (!canProceed()) { ... LockSupport.park(this); }
 * 
 *  where neither canProceed nor any other actions prior to the
 *  call to park entail locking or blocking.  Because only one
 *  permit is associated with each thread, any intermediary uses of
 *  park could interfere with its intended effects.
 * 
 *  Sample Usage. Here is a sketch of a first-in-first-out
 *  non-reentrant lock class:
 *    
 *  class FIFOMutex {
 *    private final AtomicBoolean locked = new AtomicBoolean(false);
 *    private final Queue<Thread> waiters
 *      = new ConcurrentLinkedQueue<Thread>();
 * 
 *    public void lock() {
 *      boolean wasInterrupted = false;
 *      Thread current = Thread.currentThread();
 *      waiters.add(current);
 * 
 *      // Block while not first in queue or cannot acquire lock
 *      while (waiters.peek() != current ||
 *             !locked.compareAndSet(false, true)) {
 *        LockSupport.park(this);
 *        if (Thread.interrupted()) // ignore interrupts while waiting
 *          wasInterrupted = true;
 *      }
 * 
 *      waiters.remove();
 *      if (wasInterrupted)          // reassert interrupt status on exit
 *        current.interrupt();
 *    }
 * 
 *    public void unlock() {
 *      locked.set(false);
 *      LockSupport.unpark(waiters.peek());
 *    }
 *  }
 */
class LockSupport extends Object {
}

object LockSupport {
    /** Returns the blocker object supplied to the most recent
     *  invocation of a park method that has not yet unblocked, or null
     *  if not blocked.
     */
    @stub
    def getBlocker(t: Thread): Any = ???

    /** Disables the current thread for thread scheduling purposes unless the
     *  permit is available.
     */
    @stub
    def park(): Unit = ???

    /** Disables the current thread for thread scheduling purposes unless the
     *  permit is available.
     */
    @stub
    def park(blocker: Any): Unit = ???

    /** Disables the current thread for thread scheduling purposes, for up to
     *  the specified waiting time, unless the permit is available.
     */
    @stub
    def parkNanos(nanos: Long): Unit = ???

    /** Disables the current thread for thread scheduling purposes, for up to
     *  the specified waiting time, unless the permit is available.
     */
    @stub
    def parkNanos(blocker: Any, nanos: Long): Unit = ???

    /** Disables the current thread for thread scheduling purposes, until
     *  the specified deadline, unless the permit is available.
     */
    @stub
    def parkUntil(deadline: Long): Unit = ???

    /** Disables the current thread for thread scheduling purposes, until
     *  the specified deadline, unless the permit is available.
     */
    @stub
    def parkUntil(blocker: Any, deadline: Long): Unit = ???

    /** Makes available the permit for the given thread, if it
     *  was not already available.
     */
    @stub
    def unpark(thread: Thread): Unit = ???
}
