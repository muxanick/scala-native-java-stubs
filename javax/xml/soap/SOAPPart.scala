package javax.xml.soap

import java.lang.{Object, String}
import java.util.Iterator
import javax.xml.transform.Source
import org.w3c.dom.Document

// The container for the SOAP-specific portion of a SOAPMessage
// object. All messages are required to have a SOAP part, so when a
// SOAPMessage object is created, it will automatically
// have a SOAPPart object.
//
// A SOAPPart object is a MIME part and has the MIME headers
// Content-Id, Content-Location, and Content-Type.  Because the value of
// Content-Type must be "text/xml", a SOAPPart object automatically
// has a MIME header of Content-Type with its value set to "text/xml".
// The value must be "text/xml" because content in the SOAP part of a
// message must be in XML format.  Content that is not of type "text/xml"
// must be in an AttachmentPart object rather than in the
// SOAPPart object.
// 
// When a message is sent, its SOAP part must have the MIME header Content-Type
// set to "text/xml". Or, from the other perspective, the SOAP part of any
// message that is received must have the MIME header Content-Type with a
// value of "text/xml".
// 
// A client can access the SOAPPart object of a
// SOAPMessage object by
// calling the method SOAPMessage.getSOAPPart. The
// following  line of code, in which message is a
// SOAPMessage object, retrieves the SOAP part of a message.
// 
//   SOAPPart soapPart = message.getSOAPPart();
// 
// 
// A SOAPPart object contains a SOAPEnvelope object,
// which in turn contains a SOAPBody object and a
// SOAPHeader object.
// The SOAPPart method getEnvelope can be used
// to retrieve the SOAPEnvelope object.
// 
abstract class SOAPPart extends Object with Document, with Node {

    // Creates a MimeHeader object with the specified
    // name and value and adds it to this SOAPPart object.
    def addMimeHeader(name: String, value: String): Unit

    // Retrieves all the headers for this SOAPPart object
    // as an iterator over the MimeHeader objects.
    def getAllMimeHeaders(): Iterator

    // Returns the content of the SOAPEnvelope as a JAXP Source
    // object.
    def getContent(): Source

    // Retrieves the value of the MIME header whose name is "Content-Id".
    def getContentId(): String

    // Retrieves the value of the MIME header whose name is "Content-Location".
    def getContentLocation(): String

    // Gets the SOAPEnvelope object associated with this
    // SOAPPart object.
    def getEnvelope(): SOAPEnvelope

    // Retrieves all MimeHeader objects that match a name in
    // the given array.
    def getMatchingMimeHeaders(names: Array[String]): Iterator

    // Gets all the values of the MimeHeader object
    // in this SOAPPart object that
    // is identified by the given String.
    def getMimeHeader(name: String): Array[String]

    // Retrieves all MimeHeader objects whose name does
    // not match a name in the given array.
    def getNonMatchingMimeHeaders(names: Array[String]): Iterator

    // Removes all the MimeHeader objects for this
    // SOAPEnvelope object.
    def removeAllMimeHeaders(): Unit

    // Removes all MIME headers that match the given name.
    def removeMimeHeader(header: String): Unit

    // Sets the content of the SOAPEnvelope object with the data
    // from the given Source object.
    def setContent(source: Source): Unit

    // Sets the value of the MIME header named "Content-Id"
    // to the given String.
    def setContentId(contentId: String): Unit

    // Sets the value of the MIME header "Content-Location"
    // to the given String.
    def setContentLocation(contentLocation: String): Unit
}
