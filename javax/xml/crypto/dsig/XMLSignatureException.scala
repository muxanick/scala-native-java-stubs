package javax.xml.crypto.dsig

import java.io.PrintStream
import java.lang.{Exception, Object, String, Throwable}

/** Indicates an exceptional condition that occurred during the XML
 *  signature generation or validation process.
 * 
 *  An XMLSignatureException can contain a cause: another
 *  throwable that caused this XMLSignatureException to get thrown.
 */
class XMLSignatureException extends Exception {

    /** Constructs a new XMLSignatureException with
     *  null as its detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new XMLSignatureException with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new XMLSignatureException with the
     *  specified detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Returns the cause of this XMLSignatureException or
     *  null if the cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** Prints this XMLSignatureException, its backtrace and
     *  the cause's backtrace to the standard error stream.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Prints this XMLSignatureException, its backtrace and
     *  the cause's backtrace to the specified print stream.
     */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???
}
