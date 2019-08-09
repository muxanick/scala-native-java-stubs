package java.util.concurrent

import java.lang.{Exception, Object, String, Throwable}

// Exception thrown when attempting to retrieve the result of a task
// that aborted by throwing an exception. This exception can be
// inspected using the Throwable.getCause() method.
class ExecutionException extends Exception {

    @stub
    // Constructs an ExecutionException with no detail message.
    protected def this() = ???

    @stub
    // Constructs an ExecutionException with the specified detail
    // message.
    protected def this(message: String) = ???

    @stub
    // Constructs an ExecutionException with the specified detail
    // message and cause.
    def this(message: String, cause: Throwable) = ???
}
