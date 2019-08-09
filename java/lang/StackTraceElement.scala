package java.lang

import java.io.Serializable

// An element in a stack trace, as returned by Throwable.getStackTrace().  Each element represents a single stack frame.
// All stack frames except for the one at the top of the stack represent
// a method invocation.  The frame at the top of the stack represents the
// execution point at which the stack trace was generated.  Typically,
// this is the point at which the throwable corresponding to the stack trace
// was created.
final class StackTraceElement extends Object with Serializable {

    @stub
    // Returns true if the specified object is another
    // StackTraceElement instance representing the same execution
    // point as this instance.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the fully qualified name of the class containing the
    // execution point represented by this stack trace element.
    def getClassName(): String = ???

    @stub
    // Returns the name of the source file containing the execution point
    // represented by this stack trace element.
    def getFileName(): String = ???

    @stub
    // Returns the line number of the source line containing the execution
    // point represented by this stack trace element.
    def getLineNumber(): Int = ???

    @stub
    // Returns the name of the method containing the execution point
    // represented by this stack trace element.
    def getMethodName(): String = ???

    @stub
    // Returns a hash code value for this stack trace element.
    def hashCode(): Int = ???

    @stub
    // Returns true if the method containing the execution point
    // represented by this stack trace element is a native method.
    def isNativeMethod(): Boolean = ???
}
