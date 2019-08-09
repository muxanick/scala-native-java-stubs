package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when control information that was read from an object stream
 *  violates internal consistency checks.
 */
class StreamCorruptedException extends ObjectStreamException {

    /** Create a StreamCorruptedException and list no reason why thrown. */
    @stub
    def this() = ???

    /** Create a StreamCorruptedException and list a reason why thrown. */
    @stub
    def this(reason: String) = ???
}
