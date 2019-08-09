package javax.xml.bind.helpers

import java.lang.{Object, String}
import javax.xml.bind.{ParseConversionEvent, ValidationEventLocator}

// Default implementation of the ParseConversionEvent interface.
//
// 
// JAXB providers are allowed to use whatever class that implements
// the ValidationEvent interface. This class is just provided for a
// convenience.
class ParseConversionEventImpl extends ValidationEventImpl with ParseConversionEvent {

    @stub
    // Create a new ParseConversionEventImpl.
    def this(_severity: Int, _message: String, _locator: ValidationEventLocator) = ???
}
