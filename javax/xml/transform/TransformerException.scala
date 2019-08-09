package javax.xml.transform

import java.io.{PrintStream, PrintWriter}
import java.lang.{Exception, Object, String, Throwable}

// This class specifies an exceptional condition that occurred
// during the transformation process.
class TransformerException extends Exception {

    @stub
    // Create a new TransformerException.
    def this(message: String) = ???

    @stub
    // Create a new TransformerException from a message and a Locator.
    def this(message: String, locator: SourceLocator) = ???

    @stub
    // Wrap an existing exception in a TransformerException.
    def this(message: String, locator: SourceLocator, e: Throwable) = ???

    @stub
    // Wrap an existing exception in a TransformerException.
    def this(message: String, e: Throwable) = ???

    @stub
    // Returns the cause of this throwable or null if the
    // cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // This method retrieves an exception that this exception wraps.
    def getException(): Throwable = ???

    @stub
    // Get the location information as a string.
    def getLocationAsString(): String = ???

    @stub
    // Method getLocator retrieves an instance of a SourceLocator
    // object that specifies where an error occurred.
    def getLocator(): SourceLocator = ???

    @stub
    // Get the error message with location information
    // appended.
    def getMessageAndLocation(): String = ???

    @stub
    // Initializes the cause of this throwable to the specified value.
    def initCause(cause: Throwable): Throwable = ???

    @stub
    // Print the the trace of methods from where the error
    // originated.
    def printStackTrace(): Unit = ???

    @stub
    // Print the the trace of methods from where the error
    // originated.
    def printStackTrace(s: PrintStream): Unit = ???

    @stub
    // Print the the trace of methods from where the error
    // originated.
    def printStackTrace(s: PrintWriter): Unit = ???
}
