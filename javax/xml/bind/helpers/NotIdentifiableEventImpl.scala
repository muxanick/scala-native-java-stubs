package javax.xml.bind.helpers

import java.lang.{Object, String}
import javax.xml.bind.{NotIdentifiableEvent, ValidationEventLocator}

/** Default implementation of the NotIdentifiableEvent interface.
 * 
 *  
 *  JAXB providers are allowed to use whatever class that implements
 *  the ValidationEvent interface. This class is just provided for a
 *  convenience.
 */
class NotIdentifiableEventImpl extends ValidationEventImpl with NotIdentifiableEvent {

    /** Create a new NotIdentifiableEventImpl. */
    @stub
    def this(_severity: Int, _message: String, _locator: ValidationEventLocator) = ???
}
