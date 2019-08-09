package java.util.concurrent

import java.lang.Object

// A handler for rejected tasks that discards the oldest unhandled
// request and then retries execute, unless the executor
// is shut down, in which case the task is discarded.
object ThreadPoolExecutor.DiscardOldestPolicy extends Object with RejectedExecutionHandler {
