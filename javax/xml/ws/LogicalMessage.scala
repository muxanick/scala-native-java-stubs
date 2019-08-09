package javax.xml.ws

import java.lang.Object
import javax.xml.bind.JAXBContext
import javax.xml.transform.Source
import scala.scalanative.annotation.stub

/** The LogicalMessage interface represents a
 *   protocol agnostic XML message and contains methods that
 *   provide access to the payload of the message.
 */
trait LogicalMessage {

    /** Gets the message payload as an XML source, may be called
     *   multiple times on the same LogicalMessage instance, always
     *   returns a new Source that may be used to retrieve the entire
     *   message payload.
     */
    @stub
    def getPayload(): Source = ???

    /** Gets the message payload as a JAXB object. */
    @stub
    def getPayload(context: JAXBContext): Object = ???

    /** Sets the message payload */
    @stub
    def setPayload(payload: Object, context: JAXBContext): Unit = ???

    /** Sets the message payload */
    @stub
    def setPayload(payload: Source): Unit = ???
}
