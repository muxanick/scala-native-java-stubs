package java.util.concurrent

import java.lang.{Exception, Object, RuntimeException, String, Throwable}

/** Exception thrown by an Executor when a task cannot be
 *  accepted for execution.
 */
class RejectedExecutionException extends RuntimeException {

    /** Constructs a RejectedExecutionException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a RejectedExecutionException with the
     *  specified detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a RejectedExecutionException with the
     *  specified detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???
}
