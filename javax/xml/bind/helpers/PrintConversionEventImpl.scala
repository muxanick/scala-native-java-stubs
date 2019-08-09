package javax.xml.bind.helpers

import java.lang.{Object, String, Throwable}
import javax.xml.bind.{PrintConversionEvent, ValidationEventLocator}
import scala.scalanative.annotation.stub

/** Default implementation of the PrintConversionEvent interface.
 * 
 *  
 *  JAXB providers are allowed to use whatever class that implements
 *  the ValidationEvent interface. This class is just provided for a
 *  convenience.
 */
class PrintConversionEventImpl extends ValidationEventImpl with PrintConversionEvent {

    /** Create a new PrintConversionEventImpl. */
    @stub
    def this(_severity: Int, _message: String, _locator: ValidationEventLocator) = ???

    /** Create a new PrintConversionEventImpl. */
    @stub
    def this(_severity: Int, _message: String, _locator: ValidationEventLocator, _linkedException: Throwable) = ???
}
