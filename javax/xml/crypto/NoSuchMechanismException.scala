package javax.xml.crypto

import java.io.PrintStream
import java.lang.{Exception, Object, RuntimeException, String, Throwable}

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
}
