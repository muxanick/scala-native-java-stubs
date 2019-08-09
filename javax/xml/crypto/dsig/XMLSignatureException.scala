package javax.xml.crypto.dsig

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

// Indicates an exceptional condition that occurred during the XML
// signature generation or validation process.
//
// An XMLSignatureException can contain a cause: another
// throwable that caused this XMLSignatureException to get thrown.
class XMLSignatureException extends Exception {

    @stub
    // Constructs a new XMLSignatureException with
    // null as its detail message.
    def this() = ???

    @stub
    // Constructs a new XMLSignatureException with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new XMLSignatureException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Returns the cause of this XMLSignatureException or
    // null if the cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Prints this XMLSignatureException, its backtrace and
    // the cause's backtrace to the standard error stream.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this XMLSignatureException, its backtrace and
    // the cause's backtrace to the specified print stream.
    def printStackTrace(s: PrintStream): Unit = ???
}
