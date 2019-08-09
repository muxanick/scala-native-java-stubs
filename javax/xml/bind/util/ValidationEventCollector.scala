package javax.xml.bind.util

import java.lang.Object
import javax.xml.bind.{ValidationEvent, ValidationEventHandler}
import scala.scalanative.annotation.stub

/** ValidationEventHandler
 *  implementation that collects all events.
 * 
 *  
 *  To use this class, create a new instance and pass it to the setEventHandler
 *  method of the Validator, Unmarshaller, Marshaller class.  After the call to
 *  validate or unmarshal completes, call the getEvents method to retrieve all
 *  the reported errors and warnings.
 */
class ValidationEventCollector extends Object with ValidationEventHandler {

    /**  */
    @stub
    def this() = ???

    /** Return an array of ValidationEvent objects containing a copy of each of
     *  the collected errors and warnings.
     */
    @stub
    def getEvents(): Array[ValidationEvent] = ???

    /** Receive notification of a validation warning or error. */
    @stub
    def handleEvent(event: ValidationEvent): Boolean = ???

    /** Returns true if this event collector contains at least one
     *  ValidationEvent.
     */
    @stub
    def hasEvents(): Boolean = ???

    /** Clear all collected errors and warnings. */
    @stub
    def reset(): Unit = ???
}
