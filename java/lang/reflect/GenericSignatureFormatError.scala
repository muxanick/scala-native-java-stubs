package java.lang.reflect

import java.lang.{ClassFormatError, Error, LinkageError, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when a syntactically malformed signature attribute is
 *  encountered by a reflective method that needs to interpret the
 *  generic signature information for a type, method or constructor.
 */
class GenericSignatureFormatError extends ClassFormatError {

    /** Constructs a new GenericSignatureFormatError. */
    @stub
    def this() = ???

    /** Constructs a new GenericSignatureFormatError with the
     *  specified message.
     */
    @stub
    def this(message: String) = ???
}
