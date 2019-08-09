package java.lang.instrument

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown by an implementation of
 *  Instrumentation.redefineClasses
 *  when one of the specified classes cannot be modified.
 */
class UnmodifiableClassException extends Exception {

    /** Constructs an UnmodifiableClassException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs an UnmodifiableClassException with the
     *  specified detail message.
     */
    @stub
    def this(s: String) = ???
}
