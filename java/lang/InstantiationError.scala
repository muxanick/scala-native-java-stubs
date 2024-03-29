package java.lang

import scala.scalanative.annotation.stub

/** Thrown when an application tries to use the Java new
 *  construct to instantiate an abstract class or an interface.
 *  
 *  Normally, this error is caught by the compiler; this error can
 *  only occur at run time if the definition of a class has
 *  incompatibly changed.
 */
class InstantiationError extends IncompatibleClassChangeError {

    /** Constructs an InstantiationError with no detail  message. */
    @stub
    def this() = ???

    /** Constructs an InstantiationError with the specified
     *  detail message.
     */
    @stub
    def this(s: String) = ???
}
