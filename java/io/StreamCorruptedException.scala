package java.io

import java.lang.{Exception, Object, Throwable}

/** Thrown when control information that was read from an object stream
 *  violates internal consistency checks.
 */
class StreamCorruptedException extends ObjectStreamException {

    /** Create a StreamCorruptedException and list no reason why thrown. */
    @stub
    def this() = ???
}
