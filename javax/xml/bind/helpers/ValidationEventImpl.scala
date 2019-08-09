package javax.xml.bind.helpers

import java.lang.{Object, String, Throwable}
import javax.xml.bind.{ValidationEvent, ValidationEventLocator}

/** Default implementation of the ValidationEvent interface.
 * 
 *  
 *  JAXB providers are allowed to use whatever class that implements
 *  the ValidationEvent interface. This class is just provided for a
 *  convenience.
 */
class ValidationEventImpl extends Object with ValidationEvent {

    /** Create a new ValidationEventImpl. */
    @stub
    def this(_severity: Int, _message: String, _locator: ValidationEventLocator) = ???

    /** Retrieve the linked exception for this warning/error. */
    @stub
    def getLinkedException(): Throwable = ???

    /** Retrieve the locator for this warning/error. */
    @stub
    def getLocator(): ValidationEventLocator = ???

    /** Retrieve the text message for this warning/error. */
    @stub
    def getMessage(): String = ???

    /** Retrieve the severity code for this warning/error. */
    @stub
    def getSeverity(): Int = ???

    /** Set the linked exception field of this event. */
    @stub
    def setLinkedException(_linkedException: Throwable): Unit = ???

    /** Set the locator object for this event. */
    @stub
    def setLocator(_locator: ValidationEventLocator): Unit = ???

    /** Set the message field of this event. */
    @stub
    def setMessage(_message: String): Unit = ???

    /** Set the severity field of this event. */
    @stub
    def setSeverity(_severity: Int): Unit = ???
}
