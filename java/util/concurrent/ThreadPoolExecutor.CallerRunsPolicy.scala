package java.util.concurrent

import java.lang.Object

// A handler for rejected tasks that runs the rejected task
// directly in the calling thread of the execute method,
// unless the executor has been shut down, in which case the task
// is discarded.
object ThreadPoolExecutor.CallerRunsPolicy extends Object with RejectedExecutionHandler {
