package javax.xml.bind

import java.io.PrintStream
import java.lang.{Exception, Object, RuntimeException, String, Throwable}

/** This exception indicates that a violation of a dynamically checked type
 *  constraint was detected.
 * 
 *  
 *  This exception can be thrown by the generated setter methods of the schema
 *  derived Java content classes.  However, since fail-fast validation is
 *  an optional feature for JAXB Providers to support, not all setter methods
 *  will throw this exception when a type constraint is violated.
 * 
 *  
 *  If this exception is throw while invoking a fail-fast setter, the value of
 *  the property is guaranteed to remain unchanged, as if the setter were never
 *  called.
 */
class TypeConstraintException extends RuntimeException {

    /** Construct a TypeConstraintException with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Construct a TypeConstraintException with the specified detail message and vendor
     *  specific errorCode.
     */
    @stub
    def this(message: String, errorCode: String) = ???

    /** Construct a TypeConstraintException with the specified detail message,
     *  vendor specific errorCode, and linkedException.
     */
    @stub
    def this(message: String, errorCode: String, exception: Throwable) = ???

    /** Construct a TypeConstraintException with the specified detail message and
     *  linkedException.
     */
    @stub
    def this(message: String, exception: Throwable) = ???

    /** Get the vendor specific error code */
    @stub
    def getErrorCode(): String = ???

    /** Get the linked exception */
    @stub
    def getLinkedException(): Throwable = ???

    /** Prints this TypeConstraintException and its stack trace (including the stack trace
     *  of the linkedException if it is non-null) to System.err.
     */
    @stub
    def printStackTrace(): Unit = ???

    /** Prints this TypeConstraintException and its stack trace (including the stack trace
     *  of the linkedException if it is non-null) to the PrintStream.
     */
    @stub
    def printStackTrace(s: PrintStream): Unit = ???

    /** Add a linked Exception. */
    @stub
    def setLinkedException(exception: Throwable): Unit = ???
}
