package javax.xml.ws

import java.lang.Object
import javax.xml.bind.JAXBContext
import javax.xml.transform.Source

// The LogicalMessage interface represents a
//  protocol agnostic XML message and contains methods that
//  provide access to the payload of the message.
trait LogicalMessage {

    @stub
    // Gets the message payload as an XML source, may be called
    //  multiple times on the same LogicalMessage instance, always
    //  returns a new Source that may be used to retrieve the entire
    //  message payload.
    def getPayload(): Source = ???

    @stub
    // Gets the message payload as a JAXB object.
    def getPayload(context: JAXBContext): Object = ???

    @stub
    // Sets the message payload
    def setPayload(payload: Object, context: JAXBContext): Unit = ???
}
