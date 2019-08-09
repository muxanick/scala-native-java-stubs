package java.util.concurrent

// A ScheduledFuture that is Runnable. Successful
// execution of the run method causes completion of the
// Future and allows access to its results.
trait RunnableScheduledFuture[V] extends RunnableFuture[V] , ScheduledFuture[V] {
}
