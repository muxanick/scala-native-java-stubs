package java.lang

import scala.scalanative.annotation.stub

/** Thrown if an application attempts to access or modify a field, or
 *  to call a method that it does not have access to.
 *  
 *  Normally, this error is caught by the compiler; this error can
 *  only occur at run time if the definition of a class has
 *  incompatibly changed.
 */
class IllegalAccessError extends IncompatibleClassChangeError {

    /** Constructs an IllegalAccessError with no detail message. */
    @stub
    def this() = ???

    /** Constructs an IllegalAccessError with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
