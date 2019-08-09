package java.util.concurrent

import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// Exception thrown when an error or other exception is encountered
// in the course of completing a result or task.
class CompletionException extends RuntimeException {

    @stub
    // Constructs a CompletionException with no detail message.
    protected def this() = ???

    @stub
    // Constructs a CompletionException with the specified detail
    // message.
    protected def this(message: String) = ???

    @stub
    // Constructs a CompletionException with the specified detail
    // message and cause.
    def this(message: String, cause: Throwable) = ???
}
