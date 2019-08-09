package javax.xml.bind

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception indicates that an error has occurred while performing
 *  a validate operation.
 * 
 *  
 *  The ValidationEventHandler can cause this exception to be thrown
 *  during the validate operations.  See
 *  ValidationEventHandler.handleEvent(ValidationEvent).
 */
class ValidationException extends JAXBException {

    /** Construct an ValidationException with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Construct an ValidationException with the specified detail message and vendor
     *  specific errorCode.
     */
    @stub
    def this(message: String, errorCode: String) = ???

    /** Construct an ValidationException with the specified detail message, vendor
     *  specific errorCode, and linkedException.
     */
    @stub
    def this(message: String, errorCode: String, exception: Throwable) = ???

    /** Construct an ValidationException with the specified detail message and
     *  linkedException.
     */
    @stub
    def this(message: String, exception: Throwable) = ???

    /** Construct an ValidationException with a linkedException. */
    @stub
    def this(exception: Throwable) = ???
}
