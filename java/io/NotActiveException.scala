package java.io

import java.lang.{Exception, Object, Throwable}

/** Thrown when serialization or deserialization is not active. */
class NotActiveException extends ObjectStreamException {

    /** Constructor to create a new NotActiveException without a reason. */
    @stub
    def this() = ???
}
