package javax.xml.transform

import java.io.{PrintStream, PrintWriter}
import java.lang.{Exception, Object, String, Throwable}

/** This class specifies an exceptional condition that occurred
 *  during the transformation process.
 */
class TransformerException extends Exception {

    /** Create a new TransformerException. */
    @stub
    def this(message: String) = ???

    /** Create a new TransformerException from a message and a Locator. */
    @stub
    def this(message: String, locator: SourceLocator) = ???

    /** Wrap an existing exception in a TransformerException. */
    @stub
    def this(message: String, locator: SourceLocator, e: Throwable) = ???

    /** Wrap an existing exception in a TransformerException. */
    @stub
    def this(message: String, e: Throwable) = ???

    /** Returns the cause of this throwable or null if the
     *  cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** This method retrieves an exception that this exception wraps. */
    @stub
    def getException(): Throwable = ???

    /** Get the location information as a string. */
    @stub
    def getLocationAsString(): String = ???

    /** Method getLocator retrieves an instance of a SourceLocator
     *  object that specifies where an error occurred.
     */
    @stub
    def getLocator(): SourceLocator = ???

    /** Get the error message with location information
     *  appended.
     */
    @stub
    def getMessageAndLocation(): String = ???

    /** Initializes the cause of this throwable to the specified value. */
    @stub
    def initCause(cause: Throwable): Throwable = ???

    /** Print the the trace of methods from where the error
     *  originated.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Print the the trace of methods from where the error
     *  originated.
     */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???

    /** Print the the trace of methods from where the error
     *  originated.
     */
    @stub
    def printStackTrace(s: PrintWriter): Unit = ???
}
