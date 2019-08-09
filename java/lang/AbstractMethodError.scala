package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an application tries to call an abstract method.
 *  Normally, this error is caught by the compiler; this error can
 *  only occur at run time if the definition of some class has
 *  incompatibly changed since the currently executing method was last
 *  compiled.
 */
class AbstractMethodError extends IncompatibleClassChangeError {

    /** Constructs an AbstractMethodError with no detail  message. */
    @stub
    def this() = ???

    /** Constructs an AbstractMethodError with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
