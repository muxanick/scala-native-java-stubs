package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when serialization or deserialization is not active. */
class NotActiveException extends ObjectStreamException {

    /** Constructor to create a new NotActiveException without a reason. */
    @stub
    def this() = ???

    /** Constructor to create a new NotActiveException with the reason given. */
    @stub
    def this(reason: String) = ???
}
