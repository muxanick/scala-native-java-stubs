package java.util

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import scala.scalanative.annotation.stub

/** Thrown to indicate that an operation could not complete because
 *  the input did not conform to the appropriate XML document type
 *  for a collection of properties, as per the Properties
 *  specification.
 * 
 *  Note, that although InvalidPropertiesFormatException inherits Serializable
 *  interface from Exception, it is not intended to be Serializable. Appropriate
 *  serialization methods are implemented to throw NotSerializableException.
 */
class InvalidPropertiesFormatException extends IOException {

    /** Constructs an InvalidPropertiesFormatException with the specified
     *  detail message.
     */
    @stub
    def this(message: String) = ???

    /** Constructs an InvalidPropertiesFormatException with the specified
     *  cause.
     */
    @stub
    def this(cause: Throwable) = ???
}
