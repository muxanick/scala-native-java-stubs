package javax.xml.crypto

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

// Indicates an exceptional condition that occurred during the XML
// marshalling or unmarshalling process.
//
// A MarshalException can contain a cause: another
// throwable that caused this MarshalException to get thrown.
class MarshalException extends Exception {

    @stub
    // Constructs a new MarshalException with
    // null as its detail message.
    def this() = ???

    @stub
    // Constructs a new MarshalException with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new MarshalException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Returns the cause of this MarshalException or
    // null if the cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Prints this MarshalException, its backtrace and
    // the cause's backtrace to the standard error stream.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this MarshalException, its backtrace and
    // the cause's backtrace to the specified print stream.
    def printStackTrace(s: PrintStream): Unit = ???
}
