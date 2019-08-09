package java.net

import java.io.{IOException, InterruptedIOException}
import java.lang.{Exception, Object, Throwable}

/** Signals that a timeout has occurred on a socket read or accept. */
class SocketTimeoutException extends InterruptedIOException {

    /** Construct a new SocketTimeoutException with no detailed message. */
    @stub
    def this() = ???
}
