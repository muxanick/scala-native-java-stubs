package javax.xml.crypto

import java.io.{PrintStream, PrintWriter}
import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown when a particular XML mechanism is requested but
 *  is not available in the environment.
 * 
 *  A NoSuchMechanismException can contain a cause: another
 *  throwable that caused this NoSuchMechanismException to get
 *  thrown.
 */
class NoSuchMechanismException extends RuntimeException {

    /** Constructs a new NoSuchMechanismException with
     *  null as its detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new NoSuchMechanismException with the
     *  specified detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs a new NoSuchMechanismException with the
     *  specified detail message and cause.
     */
    @stub
    def this(message: String, cause: Throwable) = ???

    /** Constructs a new NoSuchMechanismException with the
     *  specified cause and a detail message of
     *  (cause==null ? null : cause.toString()) (which typically
     *  contains the class and detail message of cause).
     */
    @stub
    def this(cause: Throwable) = ???

    /** Returns the cause of this NoSuchMechanismException or
     *  null if the cause is nonexistent or unknown.
     */
    @stub
    def getCause(): Throwable = ???

    /** Prints this NoSuchMechanismException, its backtrace and
     *  the cause's backtrace to the standard error stream.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Prints this NoSuchMechanismException, its backtrace and
     *  the cause's backtrace to the specified print stream.
     */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???

    /** Prints this NoSuchMechanismException, its backtrace and
     *  the cause's backtrace to the specified print writer.
     */
    @stub
    def printStackTrace(s: PrintWriter): Unit = ???
}
