package javax.xml.crypto

import java.io.{PrintStream, PrintWriter}
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Indicates an exceptional condition that occurred during the XML
 *  marshalling or unmarshalling process.
 * 
 *  A MarshalException can contain a cause: another
 *  throwable that caused this MarshalException to get thrown.
 */
class MarshalException extends Exception {

    /** Constructs a new MarshalException with
     *  null as its detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new MarshalException with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new MarshalException with the
     *  specified detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new MarshalException with the specified cause
     *  and a detail message of (cause==null ? null : cause.toString())
     *  (which typically contains the class and detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???

    /** Returns the cause of this MarshalException or
     *  null if the cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** Prints this MarshalException, its backtrace and
     *  the cause's backtrace to the standard error stream.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Prints this MarshalException, its backtrace and
     *  the cause's backtrace to the specified print stream.
     */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???

    /** Prints this MarshalException, its backtrace and
     *  the cause's backtrace to the specified print writer.
     */
    @stub
    def printStackTrace(s: PrintWriter): Unit = ???
}
