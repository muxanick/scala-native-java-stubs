package javax.xml.ws.handler

import javax.xml.ws.LogicalMessage
import scala.scalanative.annotation.stub

/** The LogicalMessageContext interface extends
 *   MessageContext to
 *   provide access to a the contained message as a protocol neutral
 *   LogicalMessage
 */
trait LogicalMessageContext extends MessageContext {

    /** Gets the message from this message context */
    @stub
    def getMessage(): LogicalMessage = ???
}
