package java.util.concurrent

import java.io.Serializable
import java.lang.{Object, String, Thread}
import java.util.Collection

/** A counting semaphore.  Conceptually, a semaphore maintains a set of
 *  permits.  Each acquire() blocks if necessary until a permit is
 *  available, and then takes it.  Each release() adds a permit,
 *  potentially releasing a blocking acquirer.
 *  However, no actual permit objects are used; the Semaphore just
 *  keeps a count of the number available and acts accordingly.
 * 
 *  Semaphores are often used to restrict the number of threads than can
 *  access some (physical or logical) resource. For example, here is
 *  a class that uses a semaphore to control access to a pool of items:
 *    
 *  class Pool {
 *    private static final int MAX_AVAILABLE = 100;
 *    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
 * 
 *    public Object getItem() throws InterruptedException {
 *      available.acquire();
 *      return getNextAvailableItem();
 *    }
 * 
 *    public void putItem(Object x) {
 *      if (markAsUnused(x))
 *        available.release();
 *    }
 * 
 *    // Not a particularly efficient data structure; just for demo
 * 
 *    protected Object[] items = ... whatever kinds of items being managed
 *    protected boolean[] used = new boolean[MAX_AVAILABLE];
 * 
 *    protected synchronized Object getNextAvailableItem() {
 *      for (int i = 0; i < MAX_AVAILABLE; ++i) {
 *        if (!used[i]) {
 *           used[i] = true;
 *           return items[i];
 *        }
 *      }
 *      return null; // not reached
 *    }
 * 
 *    protected synchronized boolean markAsUnused(Object item) {
 *      for (int i = 0; i < MAX_AVAILABLE; ++i) {
 *        if (item == items[i]) {
 *           if (used[i]) {
 *             used[i] = false;
 *             return true;
 *           } else
 *             return false;
 *        }
 *      }
 *      return false;
 *    }
 *  }
 * 
 *  Before obtaining an item each thread must acquire a permit from
 *  the semaphore, guaranteeing that an item is available for use. When
 *  the thread has finished with the item it is returned back to the
 *  pool and a permit is returned to the semaphore, allowing another
 *  thread to acquire that item.  Note that no synchronization lock is
 *  held when acquire() is called as that would prevent an item
 *  from being returned to the pool.  The semaphore encapsulates the
 *  synchronization needed to restrict access to the pool, separately
 *  from any synchronization needed to maintain the consistency of the
 *  pool itself.
 * 
 *  A semaphore initialized to one, and which is used such that it
 *  only has at most one permit available, can serve as a mutual
 *  exclusion lock.  This is more commonly known as a binary
 *  semaphore, because it only has two states: one permit
 *  available, or zero permits available.  When used in this way, the
 *  binary semaphore has the property (unlike many Lock
 *  implementations), that the "lock" can be released by a
 *  thread other than the owner (as semaphores have no notion of
 *  ownership).  This can be useful in some specialized contexts, such
 *  as deadlock recovery.
 * 
 *   The constructor for this class optionally accepts a
 *  fairness parameter. When set false, this class makes no
 *  guarantees about the order in which threads acquire permits. In
 *  particular, barging is permitted, that is, a thread
 *  invoking acquire() can be allocated a permit ahead of a
 *  thread that has been waiting - logically the new thread places itself at
 *  the head of the queue of waiting threads. When fairness is set true, the
 *  semaphore guarantees that threads invoking any of the acquire methods are selected to obtain permits in the order in
 *  which their invocation of those methods was processed
 *  (first-in-first-out; FIFO). Note that FIFO ordering necessarily
 *  applies to specific internal points of execution within these
 *  methods.  So, it is possible for one thread to invoke
 *  acquire before another, but reach the ordering point after
 *  the other, and similarly upon return from the method.
 *  Also note that the untimed tryAcquire methods do not
 *  honor the fairness setting, but will take any permits that are
 *  available.
 * 
 *  Generally, semaphores used to control resource access should be
 *  initialized as fair, to ensure that no thread is starved out from
 *  accessing a resource. When using semaphores for other kinds of
 *  synchronization control, the throughput advantages of non-fair
 *  ordering often outweigh fairness considerations.
 * 
 *  This class also provides convenience methods to acquire and release multiple
 *  permits at a time.  Beware of the increased risk of indefinite
 *  postponement when these methods are used without fairness set true.
 * 
 *  Memory consistency effects: Actions in a thread prior to calling
 *  a "release" method such as release()
 *  happen-before
 *  actions following a successful "acquire" method such as acquire()
 *  in another thread.
 */
class Semaphore extends Object with Serializable {

    /** Creates a Semaphore with the given number of
     *  permits and nonfair fairness setting.
     */
    @stub
    def this(permits: Int) = ???

    /** Acquires a permit from this semaphore, blocking until one is
     *  available, or the thread is interrupted.
     */
    @stub
    def acquire(): Unit = ???

    /** Acquires the given number of permits from this semaphore,
     *  blocking until all are available,
     *  or the thread is interrupted.
     */
    @stub
    def acquire(permits: Int): Unit = ???

    /** Acquires a permit from this semaphore, blocking until one is
     *  available.
     */
    @stub
    def acquireUninterruptibly(): Unit = ???

    /** Acquires the given number of permits from this semaphore,
     *  blocking until all are available.
     */
    @stub
    def acquireUninterruptibly(permits: Int): Unit = ???

    /** Returns the current number of permits available in this semaphore. */
    @stub
    def availablePermits(): Int = ???

    /** Acquires and returns all permits that are immediately available. */
    @stub
    def drainPermits(): Int = ???

    /** Returns a collection containing threads that may be waiting to acquire. */
    @stub
    protected def getQueuedThreads(): Collection[Thread] = ???

    /** Returns an estimate of the number of threads waiting to acquire. */
    @stub
    def getQueueLength(): Int = ???

    /** Queries whether any threads are waiting to acquire. */
    @stub
    def hasQueuedThreads(): Boolean = ???

    /** Returns true if this semaphore has fairness set true. */
    @stub
    def isFair(): Boolean = ???

    /** Shrinks the number of available permits by the indicated
     *  reduction.
     */
    @stub
    protected def reducePermits(reduction: Int): Unit = ???

    /** Releases a permit, returning it to the semaphore. */
    @stub
    def release(): Unit = ???

    /** Releases the given number of permits, returning them to the semaphore. */
    @stub
    def release(permits: Int): Unit = ???

    /** Returns a string identifying this semaphore, as well as its state. */
    @stub
    def toString(): String = ???

    /** Acquires a permit from this semaphore, only if one is available at the
     *  time of invocation.
     */
    @stub
    def tryAcquire(): Boolean = ???

    /** Acquires the given number of permits from this semaphore, only
     *  if all are available at the time of invocation.
     */
    @stub
    def tryAcquire(permits: Int): Boolean = ???

    /** Acquires the given number of permits from this semaphore, if all
     *  become available within the given waiting time and the current
     *  thread has not been interrupted.
     */
    @stub
    def tryAcquire(permits: Int, timeout: Long, unit: TimeUnit): Boolean = ???
}
