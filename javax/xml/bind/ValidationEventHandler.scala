package javax.xml.bind

import scala.scalanative.annotation.stub

/** A basic event handler interface for validation errors.
 * 
 *  
 *  If an application needs to implement customized event handling, it must
 *  implement this interface and then register it with either the
 *  Unmarshaller,
 *  the Validator, or
 *  the Marshaller.
 *  The JAXB Provider will then report validation errors and warnings encountered
 *  during the unmarshal, marshal, and validate operations to these event
 *  handlers.
 * 
 *  
 *  If the handleEvent method throws an unchecked runtime exception,
 *  the JAXB Provider must treat that as if the method returned false, effectively
 *  terminating whatever operation was in progress at the time (unmarshal,
 *  validate, or marshal).
 * 
 *  
 *  Modifying the Java content tree within your event handler is undefined
 *  by the specification and may result in unexpected behaviour.
 * 
 *  
 *  Failing to return false from the handleEvent method after
 *  encountering a fatal error is undefined by the specification and may result
 *  in unexpected behavior.
 * 
 *  
 *  Default Event Handler
 *  
 *     See: Validator javadocs
 *  
 */
trait ValidationEventHandler {

    /** Receive notification of a validation warning or error. */
    @stub
    def handleEvent(event: ValidationEvent): Boolean = ???
}
