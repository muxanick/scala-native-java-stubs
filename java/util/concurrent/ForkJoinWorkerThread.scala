package java.util.concurrent

import java.lang.{Object, Thread, Throwable}

/** A thread managed by a ForkJoinPool, which executes
 *  ForkJoinTasks.
 *  This class is subclassable solely for the sake of adding
 *  functionality -- there are no overridable methods dealing with
 *  scheduling or execution.  However, you can override initialization
 *  and termination methods surrounding the main task processing loop.
 *  If you do create such a subclass, you will also need to supply a
 *  custom ForkJoinPool.ForkJoinWorkerThreadFactory to
 *  use it in a ForkJoinPool.
 */
class ForkJoinWorkerThread extends Thread {

    /** Returns the pool hosting this thread. */
    @stub
    def getPool(): ForkJoinPool = ???

    /** Returns the unique index number of this thread in its pool. */
    @stub
    def getPoolIndex(): Int = ???

    /** Initializes internal state after construction but before
     *  processing any tasks.
     */
    @stub
    protected def onStart(): Unit = ???

    /** Performs cleanup associated with termination of this worker
     *  thread.
     */
    @stub
    protected def onTermination(exception: Throwable): Unit = ???
}
