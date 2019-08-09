package java.net

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** Thrown to indicate that a HTTP request needs to be retried
 *  but cannot be retried automatically, due to streaming mode
 *  being enabled.
 */
class HttpRetryException extends IOException {

    /** Constructs a new HttpRetryException from the
     *  specified response code and exception detail message
     */
    @stub
    def this(detail: String, code: Int) = ???

    /** Returns the value of the Location header field if the
     *  error resulted from redirection.
     */
    @stub
    def getLocation(): String = ???

    /** Returns a string explaining why the http request could
     *  not be retried.
     */
    @stub
    def getReason(): String = ???
}
