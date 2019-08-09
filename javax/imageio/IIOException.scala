package javax.imageio

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** An exception class used for signaling run-time failure of reading
 *  and writing operations.
 * 
 *   In addition to a message string, a reference to another
 *  Throwable (Error or
 *  Exception) is maintained.  This reference, if
 *  non-null, refers to the event that caused this
 *  exception to occur.  For example, an IOException while
 *  reading from a File would be stored there.
 */
class IIOException extends IOException {

    /** Constructs an IIOException with a given message
     *  String.
     */
    @stub
    def this(message: String) = ???
}
