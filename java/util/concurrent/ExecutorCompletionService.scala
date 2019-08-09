package java.util.concurrent

import java.lang.{Object, Runnable}

/** A CompletionService that uses a supplied Executor
 *  to execute tasks.  This class arranges that submitted tasks are,
 *  upon completion, placed on a queue accessible using take.
 *  The class is lightweight enough to be suitable for transient use
 *  when processing groups of tasks.
 * 
 *  
 * 
 *  Usage Examples.
 * 
 *  Suppose you have a set of solvers for a certain problem, each
 *  returning a value of some type Result, and would like to
 *  run them concurrently, processing the results of each of them that
 *  return a non-null value, in some method use(Result r). You
 *  could write this as:
 * 
 *   
 *  void solve(Executor e,
 *             Collection<Callable<Result>> solvers)
 *      throws InterruptedException, ExecutionException {
 *      CompletionService<Result> ecs
 *          = new ExecutorCompletionService<Result>(e);
 *      for (Callable<Result> s : solvers)
 *          ecs.submit(s);
 *      int n = solvers.size();
 *      for (int i = 0; i < n; ++i) {
 *          Result r = ecs.take().get();
 *          if (r != null)
 *              use(r);
 *      }
 *  }
 * 
 *  Suppose instead that you would like to use the first non-null result
 *  of the set of tasks, ignoring any that encounter exceptions,
 *  and cancelling all other tasks when the first one is ready:
 * 
 *   
 *  void solve(Executor e,
 *             Collection<Callable<Result>> solvers)
 *      throws InterruptedException {
 *      CompletionService<Result> ecs
 *          = new ExecutorCompletionService<Result>(e);
 *      int n = solvers.size();
 *      List<Future<Result>> futures
 *          = new ArrayList<Future<Result>>(n);
 *      Result result = null;
 *      try {
 *          for (Callable<Result> s : solvers)
 *              futures.add(ecs.submit(s));
 *          for (int i = 0; i < n; ++i) {
 *              try {
 *                  Result r = ecs.take().get();
 *                  if (r != null) {
 *                      result = r;
 *                      break;
 *                  }
 *              } catch (ExecutionException ignore) {}
 *          }
 *      }
 *      finally {
 *          for (Future<Result> f : futures)
 *              f.cancel(true);
 *      }
 * 
 *      if (result != null)
 *          use(result);
 *  }
 */
class ExecutorCompletionService[V] extends Object with CompletionService[V] {

    /** Creates an ExecutorCompletionService using the supplied
     *  executor for base task execution and a
     *  LinkedBlockingQueue as a completion queue.
     */
    @stub
    def this(executor: Executor) = ???

    /** Retrieves and removes the Future representing the next
     *  completed task, or null if none are present.
     */
    @stub
    def poll(): Future[V] = ???

    /** Retrieves and removes the Future representing the next
     *  completed task, waiting if necessary up to the specified wait
     *  time if none are yet present.
     */
    @stub
    def poll(timeout: Long, unit: TimeUnit): Future[V] = ???

    /** Submits a value-returning task for execution and returns a Future
     *  representing the pending results of the task.
     */
    @stub
    def submit(task: Callable[V]): Future[V] = ???

    /** Submits a Runnable task for execution and returns a Future
     *  representing that task.
     */
    @stub
    def submit(task: Runnable, result: V): Future[V] = ???
}
