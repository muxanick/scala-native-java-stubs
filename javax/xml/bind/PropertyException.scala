package javax.xml.bind

import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** This exception indicates that an error was encountered while getting or
 *  setting a property.
 */
class PropertyException extends JAXBException {

    /** Construct a PropertyException with the specified detail message. */
    @stub
    def this(message: String) = ???

    /** Construct a PropertyException whose message field is set based on the
     *  name of the property and value.toString().
     */
    @stub
    def this(name: String, value: Any) = ???

    /** Construct a PropertyException with the specified detail message and
     *  vendor specific errorCode.
     */
    @stub
    def this(message: String, errorCode: String) = ???

    /** Construct a PropertyException with the specified detail message, vendor
     *  specific errorCode, and linkedException.
     */
    @stub
    def this(message: String, errorCode: String, exception: Throwable) = ???

    /** Construct a PropertyException with the specified detail message and
     *  linkedException.
     */
    @stub
    def this(message: String, exception: Throwable) = ???

    /** Construct a PropertyException with a linkedException. */
    @stub
    def this(exception: Throwable) = ???
}
