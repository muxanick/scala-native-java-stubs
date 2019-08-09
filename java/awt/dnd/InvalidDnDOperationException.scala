package java.awt.dnd

import java.lang.{Exception, IllegalStateException, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception is thrown by various methods in the java.awt.dnd package.
 *  It is usually thrown to indicate that the target in question is unable
 *  to undertake the requested operation that the present time, since the
 *  underlying DnD system is not in the appropriate state.
 */
class InvalidDnDOperationException extends IllegalStateException {

    /** Create a default Exception */
    @stub
    def this() = ???

    /** Create an Exception with its own descriptive message */
    @stub
    def this(msg: String) = ???
}
