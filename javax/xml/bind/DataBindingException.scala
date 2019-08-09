package javax.xml.bind

import java.lang.{Exception, Object, RuntimeException, String, Throwable}
import scala.scalanative.annotation.stub

/** Exception that represents a failure in a JAXB operation.
 * 
 *  
 *  This exception differs from JAXBException in that
 *  this is an unchecked exception, while JAXBException
 *  is a checked exception.
 */
class DataBindingException extends RuntimeException {

    /**  */
    @stub
    def this(message: String, cause: Throwable) = ???

    /**  */
    @stub
    def this(cause: Throwable) = ???
}
