package java.awt

import java.lang.{Exception, Object, RuntimeException, Throwable, UnsupportedOperationException}

/** Thrown when code that is dependent on a keyboard, display, or mouse
 *  is called in an environment that does not support a keyboard, display,
 *  or mouse.
 */
class HeadlessException extends UnsupportedOperationException {

    /**  */
    @stub
    def this() = ???
}
