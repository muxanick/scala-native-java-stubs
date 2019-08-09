package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

// Thrown to indicate that a HTTP request needs to be retried
// but cannot be retried automatically, due to streaming mode
// being enabled.
class HttpRetryException extends IOException {

    @stub
    // Constructs a new HttpRetryException from the
    // specified response code and exception detail message
    def this(detail: String, code: Int) = ???

    @stub
    // Returns the value of the Location header field if the
    // error resulted from redirection.
    def getLocation(): String = ???

    @stub
    // Returns a string explaining why the http request could
    // not be retried.
    def getReason(): String = ???
}
