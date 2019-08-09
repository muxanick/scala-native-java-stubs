package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Indicates that one or more deserialized objects failed validation
 *  tests.  The argument should provide the reason for the failure.
 */
class InvalidObjectException extends ObjectStreamException {

    /** Constructs an InvalidObjectException. */
    @stub
    def this(reason: String) = ???
}
