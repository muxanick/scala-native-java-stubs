package javax.xml.bind

import java.io.PrintStream
import java.lang.{Exception, Object, RuntimeException, String, Throwable}

// This exception indicates that a violation of a dynamically checked type
// constraint was detected.
//
// 
// This exception can be thrown by the generated setter methods of the schema
// derived Java content classes.  However, since fail-fast validation is
// an optional feature for JAXB Providers to support, not all setter methods
// will throw this exception when a type constraint is violated.
//
// 
// If this exception is throw while invoking a fail-fast setter, the value of
// the property is guaranteed to remain unchanged, as if the setter were never
// called.
class TypeConstraintException extends RuntimeException {

    @stub
    // Construct a TypeConstraintException with the specified detail message.
    def this(message: String) = ???

    @stub
    // Construct a TypeConstraintException with the specified detail message and vendor
    // specific errorCode.
    def this(message: String, errorCode: String) = ???

    @stub
    // Construct a TypeConstraintException with the specified detail message,
    // vendor specific errorCode, and linkedException.
    def this(message: String, errorCode: String, exception: Throwable) = ???

    @stub
    // Construct a TypeConstraintException with the specified detail message and
    // linkedException.
    def this(message: String, exception: Throwable) = ???

    @stub
    // Get the vendor specific error code
    def getErrorCode(): String = ???

    @stub
    // Get the linked exception
    def getLinkedException(): Throwable = ???

    @stub
    // Prints this TypeConstraintException and its stack trace (including the stack trace
    // of the linkedException if it is non-null) to System.err.
    def printStackTrace(): Unit = ???

    @stub
    // Prints this TypeConstraintException and its stack trace (including the stack trace
    // of the linkedException if it is non-null) to the PrintStream.
    def printStackTrace(s: PrintStream): Unit = ???

    @stub
    // Add a linked Exception.
    def setLinkedException(exception: Throwable): Unit = ???
}
