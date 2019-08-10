package java.lang

import scala.scalanative.annotation.stub

/** Interface for handlers invoked when a Thread abruptly
 *  terminates due to an uncaught exception.
 *  When a thread is about to terminate due to an uncaught exception
 *  the Java Virtual Machine will query the thread for its
 *  UncaughtExceptionHandler using
 *  Thread.getUncaughtExceptionHandler() and will invoke the handler's
 *  uncaughtException method, passing the thread and the
 *  exception as arguments.
 *  If a thread has not had its UncaughtExceptionHandler
 *  explicitly set, then its ThreadGroup object acts as its
 *  UncaughtExceptionHandler. If the ThreadGroup object
 *  has no
 *  special requirements for dealing with the exception, it can forward
 *  the invocation to the default uncaught exception handler.
 */
@FunctionalInterface trait Thread_UncaughtExceptionHandler {

    /** Method invoked when the given thread terminates due to the
     *  given uncaught exception.
     */
    @stub
    def uncaughtException(t: Thread, e: Throwable): Unit = ???
}
