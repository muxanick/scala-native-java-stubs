package java.io

import java.lang.{Exception, Object, Throwable}

/** Thrown when an instance is required to have a Serializable interface.
 *  The serialization runtime or the class of the instance can throw
 *  this exception. The argument should be the name of the class.
 */
class NotSerializableException extends ObjectStreamException {

    /** Constructs a NotSerializableException object. */
    @stub
    def this() = ???
}
