package javax.xml.soap

import java.io.InputStream
import java.lang.{Object, String}
import java.util.Iterator
import javax.activation.DataHandler
import scala.scalanative.annotation.stub

/** A single attachment to a SOAPMessage object. A SOAPMessage
 *  object may contain zero, one, or many AttachmentPart objects.
 *  Each AttachmentPart object consists of two parts,
 *  application-specific content and associated MIME headers. The
 *  MIME headers consists of name/value pairs that can be used to
 *  identify and describe the content.
 *  
 *  An AttachmentPart object must conform to certain standards.
 *  
 *  It must conform to 
 *      MIME [RFC2045] standards
 *  It MUST contain content
 *  The header portion MUST include the following header:
 *   
 *    Content-Type
 *        This header identifies the type of data in the content of an
 *        AttachmentPart object and MUST conform to [RFC2045].
 *        The following is an example of a Content-Type header:
 *        
 *        Content-Type:  application/xml
 *        
 *        The following line of code, in which ap is an
 *        AttachmentPart object, sets the header shown in
 *        the previous example.
 *        
 *        ap.setMimeHeader("Content-Type", "application/xml");
 *        
 *  
 *   
 *  
 *  
 *  There are no restrictions on the content portion of an 
 *  AttachmentPart object. The content may be anything from a
 *  simple plain text object to a complex XML document or image file.
 * 
 *  
 *  An AttachmentPart object is created with the method
 *  SOAPMessage.createAttachmentPart. After setting its MIME headers,
 *   the AttachmentPart object is added to the message
 *  that created it with the method SOAPMessage.addAttachmentPart.
 * 
 *  
 *  The following code fragment, in which m is a
 *  SOAPMessage object and contentStringl is a
 *  String, creates an instance of AttachmentPart,
 *  sets the AttachmentPart object with some content and
 *  header information, and adds the AttachmentPart object to
 *  the SOAPMessage object.
 *  
 *      AttachmentPart ap1 = m.createAttachmentPart();
 *      ap1.setContent(contentString1, "text/plain");
 *      m.addAttachmentPart(ap1);
 *  
 * 
 * 
 *  
 *  The following code fragment creates and adds a second
 *  AttachmentPart instance to the same message. jpegData
 *  is a binary byte buffer representing the jpeg file.
 *  
 *      AttachmentPart ap2 = m.createAttachmentPart();
 *      byte[] jpegData =  ...;
 *      ap2.setContent(new ByteArrayInputStream(jpegData), "image/jpeg");
 *      m.addAttachmentPart(ap2);
 *  
 *  
 *  The getContent method retrieves the contents and header from
 *  an AttachmentPart object. Depending on the
 *  DataContentHandler objects present, the returned
 *  Object can either be a typed Java object corresponding
 *  to the MIME type or an InputStream object that contains the
 *  content as bytes.
 *  
 *      String content1 = ap1.getContent();
 *      java.io.InputStream content2 = ap2.getContent();
 *  
 * 
 *  The method clearContent removes all the content from an
 *  AttachmentPart object but does not affect its header information.
 *  
 *      ap1.clearContent();
 *  
 */
abstract class AttachmentPart extends Object {

    /**  */
    @stub
    def this() = ???

    /** Adds a MIME header with the specified name and value to this
     *  AttachmentPart object.
     */
    def addMimeHeader(name: String, value: String): Unit

    /** Clears out the content of this AttachmentPart object. */
    def clearContent(): Unit

    /** Retrieves all the headers for this AttachmentPart object
     *  as an iterator over the MimeHeader objects.
     */
    def getAllMimeHeaders(): Iterator

    /** Returns an InputStream which can be used to obtain the
     *  content of AttachmentPart  as Base64 encoded
     *  character data, this method would base64 encode the raw bytes
     *  of the attachment and return.
     */
    def getBase64Content(): InputStream

    /** Gets the content of this AttachmentPart object as a Java
     *  object.
     */
    def getContent(): Object

    /** Gets the value of the MIME header whose name is "Content-ID". */
    def getContentId(): String

    /** Gets the value of the MIME header whose name is "Content-Location". */
    def getContentLocation(): String

    /** Gets the value of the MIME header whose name is "Content-Type". */
    def getContentType(): String

    /** Gets the DataHandler object for this AttachmentPart
     *  object.
     */
    def getDataHandler(): DataHandler

    /** Retrieves all MimeHeader objects that match a name in
     *  the given array.
     */
    def getMatchingMimeHeaders(names: Array[String]): Iterator

    /** Gets all the values of the header identified by the given
     *  String.
     */
    def getMimeHeader(name: String): Array[String]

    /** Retrieves all MimeHeader objects whose name does
     *  not match a name in the given array.
     */
    def getNonMatchingMimeHeaders(names: Array[String]): Iterator

    /** Gets the content of this AttachmentPart object as an
     *  InputStream as if a call had been made to getContent and no
     *  DataContentHandler had been registered for the
     *  content-type of this AttachmentPart.
     */
    def getRawContent(): InputStream

    /** Gets the content of this AttachmentPart object as a
     *  byte[] array as if a call had been made to getContent and no
     *  DataContentHandler had been registered for the
     *  content-type of this AttachmentPart.
     */
    def getRawContentBytes(): Array[Byte]

    /** Returns the number of bytes in this AttachmentPart
     *  object.
     */
    def getSize(): Int

    /** Removes all the MIME header entries. */
    def removeAllMimeHeaders(): Unit

    /** Removes all MIME headers that match the given name. */
    def removeMimeHeader(header: String): Unit

    /** Sets the content of this attachment part from the Base64 source
     *  InputStream  and sets the value of the
     *  Content-Type header to the value contained in
     *  contentType, This method would first decode the base64
     *  input and write the resulting raw bytes to the attachment.
     */
    def setBase64Content(content: InputStream, contentType: String): Unit

    /** Sets the content of this attachment part to that of the given
     *  Object and sets the value of the Content-Type
     *  header to the given type.
     */
    def setContent(object: Object, contentType: String): Unit

    /** Sets the MIME header whose name is "Content-ID" with the given value. */
    def setContentId(contentId: String): Unit

    /** Sets the MIME header whose name is "Content-Location" with the given value. */
    def setContentLocation(contentLocation: String): Unit

    /** Sets the MIME header whose name is "Content-Type" with the given value. */
    def setContentType(contentType: String): Unit

    /** Sets the given DataHandler object as the data handler
     *  for this AttachmentPart object.
     */
    def setDataHandler(dataHandler: DataHandler): Unit

    /** Changes the first header entry that matches the given name
     *  to the given value, adding a new header if no existing header
     *  matches.
     */
    def setMimeHeader(name: String, value: String): Unit

    /** Sets the content of this attachment part to that contained by the
     *  InputStream content and sets the value of the
     *  Content-Type header to the value contained in
     *  contentType.
     */
    def setRawContent(content: InputStream, contentType: String): Unit

    /** Sets the content of this attachment part to that contained by the
     *  byte[] array content and sets the value of the
     *  Content-Type header to the value contained in
     *  contentType.
     */
    def setRawContentBytes(content: Array[Byte], offset: Int, len: Int, contentType: String): Unit
}
