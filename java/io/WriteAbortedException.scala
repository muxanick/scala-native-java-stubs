package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that one of the ObjectStreamExceptions was thrown during a
 *  write operation.  Thrown during a read operation when one of the
 *  ObjectStreamExceptions was thrown during a write operation.  The
 *  exception that terminated the write can be found in the detail
 *  field. The stream is reset to it's initial state and all references
 *  to objects already deserialized are discarded.
 * 
 *  As of release 1.4, this exception has been retrofitted to conform to
 *  the general purpose exception-chaining mechanism.  The "exception causing
 *  the abort" that is provided at construction time and
 *  accessed via the public detail field is now known as the
 *  cause, and may be accessed via the Throwable.getCause()
 *  method, as well as the aforementioned "legacy field."
 */
class WriteAbortedException extends ObjectStreamException {

    /** Constructs a WriteAbortedException with a string describing
     *  the exception and the exception causing the abort.
     */
    @stub
    def this(s: String, ex: Exception) = ???

    /** Exception that was caught while writing the ObjectStream. */
    @stub
    val detail: Exception = ???

    /** Returns the exception that terminated the operation (the cause). */
    @stub
    def getCause(): Throwable = ???

    /** Produce the message and include the message from the nested
     *  exception, if there is one.
     */
    @stub
    def getMessage(): String = ???
}
