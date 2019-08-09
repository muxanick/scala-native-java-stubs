package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown to indicate that the IP address of a host could not be determined. */
class UnknownHostException extends IOException {

    /** Constructs a new UnknownHostException with no detail
     *  message.
     */
    @stub
    def this() = ???

    /** Constructs a new UnknownHostException with the
     *  specified detail message.
     */
    @stub
    def this(host: String) = ???
}
