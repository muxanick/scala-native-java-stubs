package java.util.concurrent

import java.lang.Object

// A handler for rejected tasks that throws a
// RejectedExecutionException.
object ThreadPoolExecutor.AbortPolicy extends Object with RejectedExecutionHandler {
