package javax.xml.crypto

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

// Indicates an exceptional condition thrown by a KeySelector.
//
// A KeySelectorException can contain a cause: another
// throwable that caused this KeySelectorException to get thrown.
class KeySelectorException extends Exception {

    @stub
    // Constructs a new KeySelectorException with
    // null as its detail message.
    def this() = ???

    @stub
    // Constructs a new KeySelectorException with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new KeySelectorException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Returns the cause of this KeySelectorException or
    // null if the cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Prints this KeySelectorException, its backtrace and
    // the cause's backtrace to the standard error stream.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this KeySelectorException, its backtrace and
    // the cause's backtrace to the specified print stream.
    def printStackTrace(s: PrintStream): Unit = ???
}
