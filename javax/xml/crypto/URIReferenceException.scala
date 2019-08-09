package javax.xml.crypto

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

// Indicates an exceptional condition thrown while dereferencing a
// URIReference.
//
// A URIReferenceException can contain a cause: another
// throwable that caused this URIReferenceException to get thrown.
class URIReferenceException extends Exception {

    @stub
    // Constructs a new URIReferenceException with
    // null as its detail message.
    def this() = ???

    @stub
    // Constructs a new URIReferenceException with the specified
    // detail message.
    def this(message: String) = ???

    @stub
    // Constructs a new URIReferenceException with the
    // specified detail message and cause.
    def this(message: String, cause: Throwable) = ???

    @stub
    // Constructs a new URIReferenceException with the
    // specified detail message, cause and URIReference.
    def this(message: String, cause: Throwable, uriReference: URIReference) = ???

    @stub
    // Returns the cause of this URIReferenceException or
    // null if the cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Returns the URIReference that was being dereferenced
    // when the exception was thrown.
    def getURIReference(): URIReference = ???

    @stub
    // Prints this URIReferenceException, its backtrace and
    // the cause's backtrace to the standard error stream.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this URIReferenceException, its backtrace and
    // the cause's backtrace to the specified print stream.
    def printStackTrace(s: PrintStream): Unit = ???
}
