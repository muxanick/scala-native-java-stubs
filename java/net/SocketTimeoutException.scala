package java.net

import java.io.{IOException, InterruptedIOException}
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Signals that a timeout has occurred on a socket read or accept. */
class SocketTimeoutException extends InterruptedIOException {

    /** Construct a new SocketTimeoutException with no detailed message. */
    @stub
    def this() = ???

    /** Constructs a new SocketTimeoutException with a detail
     *  message.
     */
    @stub
    def this(msg: String) = ???
}
