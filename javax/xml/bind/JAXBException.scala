package javax.xml.bind

import java.io.{PrintStream, PrintWriter}
import java.lang.{Exception, Object, String, Throwable}

/** This is the root exception class for all JAXB exceptions. */
class JAXBException extends Exception {

    /** Construct a JAXBException with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Construct a JAXBException with the specified detail message and vendor
     *  specific errorCode.
     */
    @stub
    def this(message: String, errorCode: String) = ???

    /** Construct a JAXBException with the specified detail message, vendor
     *  specific errorCode, and linkedException.
     */
    @stub
    def this(message: String, errorCode: String, exception: Throwable) = ???

    /** Construct a JAXBException with the specified detail message and
     *  linkedException.
     */
    @stub
    def this(message: String, exception: Throwable) = ???

    /** Returns the cause of this throwable or null if the
     *  cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** Get the vendor specific error code */
    @stub
    def getErrorCode(): String = ???

    /** Get the linked exception */
    @stub
    def getLinkedException(): Throwable = ???

    /** Prints this JAXBException and its stack trace (including the stack trace
     *  of the linkedException if it is non-null) to System.err.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Prints this JAXBException and its stack trace (including the stack trace
     *  of the linkedException if it is non-null) to the PrintStream.
     */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???

    /** Prints this JAXBException and its stack trace (including the stack trace
     *  of the linkedException if it is non-null) to the PrintWriter.
     */
    @stub
    def printStackTrace(s: PrintWriter): Unit = ???

    /** Add a linked Exception. */
    @stub
    def setLinkedException(exception: Throwable): Unit = ???
}
