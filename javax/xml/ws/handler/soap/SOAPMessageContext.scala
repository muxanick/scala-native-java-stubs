package javax.xml.ws.handler.soap

import java.lang.{Object, String}
import java.util.Set
import javax.xml.bind.JAXBContext
import javax.xml.namespace.QName
import javax.xml.soap.SOAPMessage
import javax.xml.ws.handler.MessageContext

/** The interface SOAPMessageContext
 *   provides access to the SOAP message for either RPC request or
 *   response. The javax.xml.soap.SOAPMessage specifies
 *   the standard Java API for the representation of a SOAP 1.1 message
 *   with attachments.
 */
trait SOAPMessageContext extends MessageContext {

    /** Gets headers that have a particular qualified name from the message in the
     *   message context.
     */
    @stub
    def getHeaders(header: QName, context: JAXBContext, allRoles: Boolean): Array[Object] = ???

    /** Gets the SOAPMessage from this message context. */
    @stub
    def getMessage(): SOAPMessage = ???

    /** Gets the SOAP actor roles associated with an execution
     *   of the handler chain.
     */
    @stub
    def getRoles(): Set[String] = ???
}
