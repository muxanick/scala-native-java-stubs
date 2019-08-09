package javax.xml.ws.http

import java.lang.{Exception, Object, RuntimeException, Throwable}
import javax.xml.ws.{ProtocolException, WebServiceException}

/** The HTTPException exception represents a
 *   XML/HTTP fault.
 * 
 *   Since there is no standard format for faults or exceptions
 *   in XML/HTTP messaging, only the HTTP status code is captured.
 */
class HTTPException extends ProtocolException {
}
