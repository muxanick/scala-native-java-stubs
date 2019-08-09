package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown to indicate that an unknown service exception has
 *  occurred. Either the MIME type returned by a URL connection does
 *  not make sense, or the application is attempting to write to a
 *  read-only URL connection.
 */
class UnknownServiceException extends IOException {

    /** Constructs a new UnknownServiceException with no
     *  detail message.
     */
    @stub
    def this() = ???

    /** Constructs a new UnknownServiceException with the
     *  specified detail message.
     */
    @stub
    def this(msg: String) = ???
}
