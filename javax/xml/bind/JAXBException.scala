package javax.xml.bind

import java.io.{PrintStream, PrintWriter}
import java.lang.{Exception, Object, String, Throwable}

// This is the root exception class for all JAXB exceptions.
class JAXBException extends Exception {

    @stub
    // Construct a JAXBException with the specified detail message.
    def this(message: String) = ???

    @stub
    // Construct a JAXBException with the specified detail message and vendor
    // specific errorCode.
    def this(message: String, errorCode: String) = ???

    @stub
    // Construct a JAXBException with the specified detail message, vendor
    // specific errorCode, and linkedException.
    def this(message: String, errorCode: String, exception: Throwable) = ???

    @stub
    // Construct a JAXBException with the specified detail message and
    // linkedException.
    def this(message: String, exception: Throwable) = ???

    @stub
    // Returns the cause of this throwable or null if the
    // cause is nonexistent or unknown.
    def getCause(): Throwable = ???

    @stub
    // Get the vendor specific error code
    def getErrorCode(): String = ???

    @stub
    // Get the linked exception
    def getLinkedException(): Throwable = ???

    @stub
    // Prints this JAXBException and its stack trace (including the stack trace
    // of the linkedException if it is non-null) to System.err.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this JAXBException and its stack trace (including the stack trace
    // of the linkedException if it is non-null) to the PrintStream.
    def printStackTrace(s: PrintStream): Unit = ???

    @stub
    // Prints this JAXBException and its stack trace (including the stack trace
    // of the linkedException if it is non-null) to the PrintWriter.
    def printStackTrace(s: PrintWriter): Unit = ???

    @stub
    // Add a linked Exception.
    def setLinkedException(exception: Throwable): Unit = ???
}
