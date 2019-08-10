package java.lang

import java.io.Serializable
import scala.scalanative.annotation.stub

/** An element in a stack trace, as returned by Throwable.getStackTrace().  Each element represents a single stack frame.
 *  All stack frames except for the one at the top of the stack represent
 *  a method invocation.  The frame at the top of the stack represents the
 *  execution point at which the stack trace was generated.  Typically,
 *  this is the point at which the throwable corresponding to the stack trace
 *  was created.
 */
final class StackTraceElement extends Object with Serializable {

    /** Creates a stack trace element representing the specified execution
     *  point.
     */
    @stub
    def this(declaringClass: String, methodName: String, fileName: String, lineNumber: Int) = ???

    /** Returns true if the specified object is another
     *  StackTraceElement instance representing the same execution
     *  point as this instance.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns the fully qualified name of the class containing the
     *  execution point represented by this stack trace element.
     */
    @stub
    def getClassName(): String = ???

    /** Returns the name of the source file containing the execution point
     *  represented by this stack trace element.
     */
    @stub
    def getFileName(): String = ???

    /** Returns the line number of the source line containing the execution
     *  point represented by this stack trace element.
     */
    @stub
    def getLineNumber(): Int = ???

    /** Returns the name of the method containing the execution point
     *  represented by this stack trace element.
     */
    @stub
    def getMethodName(): String = ???

    /** Returns a hash code value for this stack trace element. */
    @stub
    def hashCode(): Int = ???

    /** Returns true if the method containing the execution point
     *  represented by this stack trace element is a native method.
     */
    @stub
    def isNativeMethod(): Boolean = ???

    /** Returns a string representation of this stack trace element. */
    @stub
    def toString(): String = ???
}
