package java.lang.reflect

import java.lang.{Exception, Object, ReflectiveOperationException, Throwable}

// InvocationTargetException is a checked exception that wraps
// an exception thrown by an invoked method or constructor.
//
// As of release 1.4, this exception has been retrofitted to conform to
// the general purpose exception-chaining mechanism.  The "target exception"
// that is provided at construction time and accessed via the
// getTargetException() method is now known as the cause,
// and may be accessed via the Throwable.getCause() method,
// as well as the aforementioned "legacy method."
class InvocationTargetException extends ReflectiveOperationException {

    @stub
    // Constructs an InvocationTargetException with
    // null as the target exception.
    protected def this() = ???

    @stub
    // Constructs a InvocationTargetException with a target exception.
    def this(target: Throwable) = ???

    @stub
    // Returns the cause of this exception (the thrown target exception,
    // which may be null).
    def getCause(): Throwable = ???
}