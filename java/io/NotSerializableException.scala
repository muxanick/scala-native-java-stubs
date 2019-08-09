package java.io

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown when an instance is required to have a Serializable interface.
 *  The serialization runtime or the class of the instance can throw
 *  this exception. The argument should be the name of the class.
 */
class NotSerializableException extends ObjectStreamException {

    /** Constructs a NotSerializableException object. */
    @stub
    def this() = ???

    /** Constructs a NotSerializableException object with message string. */
    @stub
    def this(classname: String) = ???
}
