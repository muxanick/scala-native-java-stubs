package java.util.concurrent

import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// Exception thrown by an Executor when a task cannot be
// accepted for execution.
class RejectedExecutionException extends RuntimeException {

    @stub
    // Constructs a RejectedExecutionException with no detail message.
    def this() = ???

    @stub
    // Constructs a RejectedExecutionException with the
    // specified detail message.
    def this(message: String) = ???

    @stub
    // Constructs a RejectedExecutionException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???
}
