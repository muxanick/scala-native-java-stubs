package javax.xml.soap

import java.io.InputStream
import java.lang.Object

/** A factory for creating SOAPMessage objects.
 *  
 *  A SAAJ client can create a MessageFactory object
 *  using the method newInstance, as shown in the following
 *  lines of code.
 *  
 *        MessageFactory mf = MessageFactory.newInstance();
 *        MessageFactory mf12 = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
 *  
 *  
 *  All MessageFactory objects, regardless of how they are
 *  created, will produce SOAPMessage objects that
 *  have the following elements by default:
 *  
 *   A SOAPPart object
 *   A SOAPEnvelope object
 *   A SOAPBody object
 *   A SOAPHeader object
 *  
 *  In some cases, specialized MessageFactory objects may be obtained that produce messages
 *  prepopulated with additional entries in the SOAPHeader object and the
 *  SOAPBody object.
 *  The content of a new SOAPMessage object depends on which of the two
 *  MessageFactory methods is used to create it.
 *  
 *   createMessage() 
 *       This is the method clients would normally use to create a request message.
 *   createMessage(MimeHeaders, java.io.InputStream) -- message has
 *        content from the InputStream object and headers from the
 *        MimeHeaders object 
 *         This method can be used internally by a service implementation to
 *         create a message that is a response to a request.
 *  
 */
abstract class MessageFactory extends Object {

    /** Creates a new SOAPMessage object with the default
     *  SOAPPart, SOAPEnvelope, SOAPBody,
     *  and SOAPHeader objects.
     */
    def createMessage(): SOAPMessage

    /** Internalizes the contents of the given InputStream object into a
     *  new SOAPMessage object and returns the SOAPMessage
     *  object.
     */
    def createMessage(headers: MimeHeaders, in: InputStream): SOAPMessage
}

object MessageFactory {
    /** Creates a new MessageFactory object that is an instance
     *  of the default implementation (SOAP 1.1),
     * 
     *  This method uses the following ordered lookup procedure to determine the MessageFactory implementation class to load:
     *  
     *    Use the javax.xml.soap.MessageFactory system property.
     */
    @stub
    def newInstance(): MessageFactory = ???
}
