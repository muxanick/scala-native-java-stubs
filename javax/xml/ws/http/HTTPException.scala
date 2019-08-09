package javax.xml.ws.http

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.xml.ws.{ProtocolException, WebServiceException}
import scala.scalanative.annotation.stub

/** The HTTPException exception represents a
 *   XML/HTTP fault.
 * 
 *   Since there is no standard format for faults or exceptions
 *   in XML/HTTP messaging, only the HTTP status code is captured.
 */
class HTTPException extends ProtocolException {

    /** Constructor for the HTTPException */
    @stub
    def this(statusCode: Int) = ???

    /** Gets the HTTP status code. */
    @stub
    def getStatusCode(): Int = ???
}
