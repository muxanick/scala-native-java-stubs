package javax.xml.crypto.dsig

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

// Indicates an exceptional condition that occurred while executing a
// transform algorithm.
//
// A TransformException can contain a cause: another
// throwable that caused this TransformException to get thrown.
class TransformException extends Exception {

    @stub
    // Constructs a new TransformException with
    // null as its detail message.
    def this() = ???

    @stub
    // Constructs a new TransformException with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new TransformException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Returns the cause of this TransformException or
    // null if the cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Prints this TransformException, its backtrace and
    // the cause's backtrace to the standard error stream.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this TransformException, its backtrace and
    // the cause's backtrace to the specified print stream.
    def printStackTrace(s: PrintStream): Unit = ???
}
