package java.awt

import java.lang.{Exception, Object, RuntimeException, String, Throwable, UnsupportedOperationException}
import scala.scalanative.annotation.stub

/** Thrown when code that is dependent on a keyboard, display, or mouse
 *  is called in an environment that does not support a keyboard, display,
 *  or mouse.
 */
class HeadlessException extends UnsupportedOperationException {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    def this(msg: String) = ???

    /** Returns the detail message string of this throwable. */
    @stub
    def getMessage(): String = ???
}
