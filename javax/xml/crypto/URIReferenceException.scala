package javax.xml.crypto

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

/** Indicates an exceptional condition thrown while dereferencing a
 *  URIReference.
 * 
 *  A URIReferenceException can contain a cause: another
 *  throwable that caused this URIReferenceException to get thrown.
 */
class URIReferenceException extends Exception {

    /** Constructs a new URIReferenceException with
     *  null as its detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new URIReferenceException with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new URIReferenceException with the
     *  specified detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new URIReferenceException with the
     *  specified detail message, cause and URIReference.
     */
    @stub
    def this(message: String, cause: Throwable, uriReference: URIReference) = ???

    /** Returns the cause of this URIReferenceException or
     *  null if the cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** Returns the URIReference that was being dereferenced
     *  when the exception was thrown.
     */
    @stub
    def getURIReference(): URIReference = ???

    /** Prints this URIReferenceException, its backtrace and
     *  the cause's backtrace to the standard error stream.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Prints this URIReferenceException, its backtrace and
     *  the cause's backtrace to the specified print stream.
     */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???
}
