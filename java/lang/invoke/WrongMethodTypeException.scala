package java.lang.invoke

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown to indicate that code has attempted to call a method handle
 *  via the wrong method type.  As with the bytecode representation of
 *  normal Java method calls, method handle calls are strongly typed
 *  to a specific type descriptor associated with a call site.
 *  
 *  This exception may also be thrown when two method handles are
 *  composed, and the system detects that their types cannot be
 *  matched up correctly.  This amounts to an early evaluation
 *  of the type mismatch, at method handle construction time,
 *  instead of when the mismatched method handle is called.
 */
class WrongMethodTypeException extends RuntimeException {

    /** Constructs a WrongMethodTypeException with no detail message. */
    @stub
    def this() = ???

    /** Constructs a WrongMethodTypeException with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
