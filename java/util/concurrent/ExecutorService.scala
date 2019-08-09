package java.util.concurrent

import java.lang.Runnable
import java.util.{Collection, List}

/** An Executor that provides methods to manage termination and
 *  methods that can produce a Future for tracking progress of
 *  one or more asynchronous tasks.
 * 
 *  An ExecutorService can be shut down, which will cause
 *  it to reject new tasks.  Two different methods are provided for
 *  shutting down an ExecutorService. The shutdown()
 *  method will allow previously submitted tasks to execute before
 *  terminating, while the shutdownNow() method prevents waiting
 *  tasks from starting and attempts to stop currently executing tasks.
 *  Upon termination, an executor has no tasks actively executing, no
 *  tasks awaiting execution, and no new tasks can be submitted.  An
 *  unused ExecutorService should be shut down to allow
 *  reclamation of its resources.
 * 
 *  Method submit extends base method Executor.execute(Runnable) by creating and returning a Future
 *  that can be used to cancel execution and/or wait for completion.
 *  Methods invokeAny and invokeAll perform the most
 *  commonly useful forms of bulk execution, executing a collection of
 *  tasks and then waiting for at least one, or all, to
 *  complete. (Class ExecutorCompletionService can be used to
 *  write customized variants of these methods.)
 * 
 *  The Executors class provides factory methods for the
 *  executor services provided in this package.
 * 
 *  Usage Examples
 * 
 *  Here is a sketch of a network service in which threads in a thread
 *  pool service incoming requests. It uses the preconfigured Executors.newFixedThreadPool(int) factory method:
 * 
 *    
 *  class NetworkService implements Runnable {
 *    private final ServerSocket serverSocket;
 *    private final ExecutorService pool;
 * 
 *    public NetworkService(int port, int poolSize)
 *        throws IOException {
 *      serverSocket = new ServerSocket(port);
 *      pool = Executors.newFixedThreadPool(poolSize);
 *    }
 * 
 *    public void run() { // run the service
 *      try {
 *        for (;;) {
 *          pool.execute(new Handler(serverSocket.accept()));
 *        }
 *      } catch (IOException ex) {
 *        pool.shutdown();
 *      }
 *    }
 *  }
 * 
 *  class Handler implements Runnable {
 *    private final Socket socket;
 *    Handler(Socket socket) { this.socket = socket; }
 *    public void run() {
 *      // read and service request on socket
 *    }
 *  }
 * 
 *  The following method shuts down an ExecutorService in two phases,
 *  first by calling shutdown to reject incoming tasks, and then
 *  calling shutdownNow, if necessary, to cancel any lingering tasks:
 * 
 *    
 *  void shutdownAndAwaitTermination(ExecutorService pool) {
 *    pool.shutdown(); // Disable new tasks from being submitted
 *    try {
 *      // Wait a while for existing tasks to terminate
 *      if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
 *        pool.shutdownNow(); // Cancel currently executing tasks
 *        // Wait a while for tasks to respond to being cancelled
 *        if (!pool.awaitTermination(60, TimeUnit.SECONDS))
 *            System.err.println("Pool did not terminate");
 *      }
 *    } catch (InterruptedException ie) {
 *      // (Re-)Cancel if current thread also interrupted
 *      pool.shutdownNow();
 *      // Preserve interrupt status
 *      Thread.currentThread().interrupt();
 *    }
 *  }
 * 
 *  Memory consistency effects: Actions in a thread prior to the
 *  submission of a Runnable or Callable task to an
 *  ExecutorService
 *  happen-before
 *  any actions taken by that task, which in turn happen-before the
 *  result is retrieved via Future.get().
 */
trait ExecutorService extends Executor {

    /** Blocks until all tasks have completed execution after a shutdown
     *  request, or the timeout occurs, or the current thread is
     *  interrupted, whichever happens first.
     */
    @stub
    def awaitTermination(timeout: Long, unit: TimeUnit): Boolean = ???

    /** Executes the given tasks, returning a list of Futures holding
     *  their status and results when all complete.
     */
    @stub
    def invokeAll[T](tasks: Collection[_ <: Callable[T]]): List[Future[T]] = ???

    /** Executes the given tasks, returning a list of Futures holding
     *  their status and results
     *  when all complete or the timeout expires, whichever happens first.
     */
    @stub
    def invokeAll[T](tasks: Collection[_ <: Callable[T]], timeout: Long, unit: TimeUnit): List[Future[T]] = ???

    /** Executes the given tasks, returning the result
     *  of one that has completed successfully (i.e., without throwing
     *  an exception), if any do.
     */
    @stub
    def invokeAny[T](tasks: Collection[_ <: Callable[T]]): T = ???

    /** Executes the given tasks, returning the result
     *  of one that has completed successfully (i.e., without throwing
     *  an exception), if any do before the given timeout elapses.
     */
    @stub
    def invokeAny[T](tasks: Collection[_ <: Callable[T]], timeout: Long, unit: TimeUnit): T = ???

    /** Returns true if this executor has been shut down. */
    @stub
    def isShutdown(): Boolean = ???

    /** Returns true if all tasks have completed following shut down. */
    @stub
    def isTerminated(): Boolean = ???

    /** Initiates an orderly shutdown in which previously submitted
     *  tasks are executed, but no new tasks will be accepted.
     */
    @stub
    def shutdown(): Unit = ???

    /** Attempts to stop all actively executing tasks, halts the
     *  processing of waiting tasks, and returns a list of the tasks
     *  that were awaiting execution.
     */
    @stub
    def shutdownNow(): List[Runnable] = ???

    /** Submits a value-returning task for execution and returns a
     *  Future representing the pending results of the task.
     */
    @stub
    def submit[T](task: Callable[T]): Future[T] = ???

    /** Submits a Runnable task for execution and returns a Future
     *  representing that task.
     */
    @stub
    def submit(task: Runnable): Future[_] = ???
}
