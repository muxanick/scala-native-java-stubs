package javax.xml.crypto

import java.io.PrintStream
import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// This exception is thrown when a particular XML mechanism is requested but
// is not available in the environment.
//
// A NoSuchMechanismException can contain a cause: another
// throwable that caused this NoSuchMechanismException to get
// thrown.
class NoSuchMechanismException extends RuntimeException {

    @stub
    // Constructs a new NoSuchMechanismException with
    // null as its detail message.
    def this() = ???

    @stub
    // Constructs a new NoSuchMechanismException with the
    // specified detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new NoSuchMechanismException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Returns the cause of this NoSuchMechanismException or
    // null if the cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Prints this NoSuchMechanismException, its backtrace and
    // the cause's backtrace to the standard error stream.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this NoSuchMechanismException, its backtrace and
    // the cause's backtrace to the specified print stream.
    def printStackTrace(s: PrintStream): Unit = ???
}
