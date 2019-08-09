package javax.xml.bind.helpers

import java.lang.{Object, String, Throwable}
import javax.xml.bind.{ValidationEvent, ValidationEventLocator}

// Default implementation of the ValidationEvent interface.
//
// 
// JAXB providers are allowed to use whatever class that implements
// the ValidationEvent interface. This class is just provided for a
// convenience.
class ValidationEventImpl extends Object with ValidationEvent {

    @stub
    // Create a new ValidationEventImpl.
    def this(_severity: Int, _message: String, _locator: ValidationEventLocator) = ???

    @stub
    // Retrieve the linked exception for this warning/error.
    def getLinkedException(): Throwable = ???

    @stub
    // Retrieve the locator for this warning/error.
    def getLocator(): ValidationEventLocator = ???

    @stub
    // Retrieve the text message for this warning/error.
    def getMessage(): String = ???

    @stub
    // Retrieve the severity code for this warning/error.
    def getSeverity(): Int = ???

    @stub
    // Set the linked exception field of this event.
    def setLinkedException(_linkedException: Throwable): Unit = ???

    @stub
    // Set the locator object for this event.
    def setLocator(_locator: ValidationEventLocator): Unit = ???

    @stub
    // Set the message field of this event.
    def setMessage(_message: String): Unit = ???

    @stub
    // Set the severity field of this event.
    def setSeverity(_severity: Int): Unit = ???
}
