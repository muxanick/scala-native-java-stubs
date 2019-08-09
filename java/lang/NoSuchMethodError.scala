package java.lang

import scala.scalanative.annotation.stub

/** Thrown if an application tries to call a specified method of a
 *  class (either static or instance), and that class no longer has a
 *  definition of that method.
 *  
 *  Normally, this error is caught by the compiler; this error can
 *  only occur at run time if the definition of a class has
 *  incompatibly changed.
 */
class NoSuchMethodError extends IncompatibleClassChangeError {

    /** Constructs a NoSuchMethodError with no detail message. */
    @stub
    def this() = ???

    /** Constructs a NoSuchMethodError with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
