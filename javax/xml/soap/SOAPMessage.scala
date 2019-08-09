package javax.xml.soap

import java.lang.{Object, String}
import java.util.Iterator
import javax.activation.DataHandler

/** The root class for all SOAP messages. As transmitted on the "wire", a SOAP
 *  message is an XML document or a MIME message whose first body part is an
 *  XML/SOAP document.
 *  
 *  A SOAPMessage object consists of a SOAP part and optionally
 *  one or more attachment parts. The SOAP part for a SOAPMessage
 *  object is a SOAPPart object, which contains information used
 *  for message routing and identification, and which can contain
 *  application-specific content. All data in the SOAP Part of a message must be
 *  in XML format.
 *  
 *  A new SOAPMessage object contains the following by default:
 *  
 *    A SOAPPart object
 *    A SOAPEnvelope object
 *    A SOAPBody object
 *    A SOAPHeader object
 *  
 *  The SOAP part of a message can be retrieved by calling the method SOAPMessage.getSOAPPart().
 *  The SOAPEnvelope object is retrieved from the SOAPPart
 *  object, and the SOAPEnvelope object is used to retrieve the
 *  SOAPBody and SOAPHeader objects.
 * 
 *  
 *      SOAPPart sp = message.getSOAPPart();
 *      SOAPEnvelope se = sp.getEnvelope();
 *      SOAPBody sb = se.getBody();
 *      SOAPHeader sh = se.getHeader();
 *  
 * 
 *  
 *  In addition to the mandatory SOAPPart object, a SOAPMessage
 *  object may contain zero or more AttachmentPart objects, each
 *  of which contains application-specific data. The SOAPMessage
 *  interface provides methods for creating AttachmentPart
 *  objects and also for adding them to a SOAPMessage object. A
 *  party that has received a SOAPMessage object can examine its
 *  contents by retrieving individual attachment parts.
 *  
 *  Unlike the rest of a SOAP message, an attachment is not required to be in
 *  XML format and can therefore be anything from simple text to an image file.
 *  Consequently, any message content that is not in XML format must be in an
 *  AttachmentPart object.
 *  
 *  A MessageFactory object may create SOAPMessage
 *  objects with behavior that is specialized to a particular implementation or
 *  application of SAAJ. For instance, a MessageFactory object
 *  may produce SOAPMessage objects that conform to a particular
 *  Profile such as ebXML. In this case a MessageFactory object
 *  might produce SOAPMessage objects that are initialized with
 *  ebXML headers.
 *  
 *  In order to ensure backward source compatibility, methods that are added to
 *  this class after version 1.1 of the SAAJ specification are all concrete
 *  instead of abstract and they all have default implementations. Unless
 *  otherwise noted in the JavaDocs for those methods the default
 *  implementations simply throw an UnsupportedOperationException
 *  and the SAAJ implementation code must override them with methods that
 *  provide the specified behavior. Legacy client code does not have this
 *  restriction, however, so long as there is no claim made that it conforms to
 *  some later version of the specification than it was originally written for.
 *  A legacy class that extends the SOAPMessage class can be compiled and/or run
 *  against succeeding versions of the SAAJ API without modification. If such a
 *  class was correctly implemented then it will continue to behave correctly
 *  relative to the version of the specification against which it was written.
 */
abstract class SOAPMessage extends Object {

    /** Adds the given AttachmentPart object to this SOAPMessage
     *  object.
     */
    def addAttachmentPart(AttachmentPart: AttachmentPart): Unit

    /** Gets a count of the number of attachments in this message. */
    def countAttachments(): Int

    /** Creates a new empty AttachmentPart object. */
    def createAttachmentPart(): AttachmentPart

    /** Creates an AttachmentPart object and populates it using
     *  the given DataHandler object.
     */
    def createAttachmentPart(dataHandler: DataHandler): AttachmentPart

    /** Creates an AttachmentPart object and populates it with
     *  the specified data of the specified content type.
     */
    def createAttachmentPart(content: Object, contentType: String): AttachmentPart

    /** Returns an AttachmentPart object that is associated with an
     *  attachment that is referenced by this SOAPElement or
     *  null if no such attachment exists.
     */
    def getAttachment(element: SOAPElement): AttachmentPart

    /** Retrieves all the AttachmentPart objects that are part of
     *  this SOAPMessage object.
     */
    def getAttachments(): Iterator

    /** Retrieves all the AttachmentPart objects that have header
     *  entries that match the specified headers.
     */
    def getAttachments(headers: MimeHeaders): Iterator

    /** Retrieves a description of this SOAPMessage object's
     *  content.
     */
    def getContentDescription(): String

    /** Returns all the transport-specific MIME headers for this SOAPMessage
     *  object in a transport-independent fashion.
     */
    def getMimeHeaders(): MimeHeaders

    /** Retrieves value of the specified property. */
    def getProperty(property: String): Object

    /** Gets the SOAP Body contained in this SOAPMessage object. */
    def getSOAPBody(): SOAPBody

    /** Gets the SOAP Header contained in this SOAPMessage
     *  object.
     */
    def getSOAPHeader(): SOAPHeader

    /** Gets the SOAP part of this SOAPMessage object. */
    def getSOAPPart(): SOAPPart

    /** Removes all AttachmentPart objects that have been added
     *  to this SOAPMessage object.
     */
    def removeAllAttachments(): Unit

    /** Removes all the AttachmentPart objects that have header
     *  entries that match the specified headers.
     */
    def removeAttachments(headers: MimeHeaders): Unit

    /** Updates this SOAPMessage object with all the changes that
     *  have been made to it.
     */
    def saveChanges(): Unit

    /** Indicates whether this SOAPMessage object needs to have
     *  the method saveChanges called on it.
     */
    def saveRequired(): Boolean

    /** Sets the description of this SOAPMessage object's
     *  content with the given description.
     */
    def setContentDescription(description: String): Unit

    /** Associates the specified value with the specified property. */
    def setProperty(property: String, value: Object): Unit
}

object SOAPMessage {
    /** Specifies the character type encoding for the SOAP Message. */
    @stub
    val CHARACTER_SET_ENCODING: String = ???
}
