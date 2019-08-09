package javax.xml.soap

import java.lang.String
import java.util.Locale
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** An object that represents the contents of the SOAP body
 *  element in a SOAP message. A SOAP body element consists of XML data
 *  that affects the way the application-specific content is processed.
 *  
 *  A SOAPBody object contains SOAPBodyElement
 *  objects, which have the content for the SOAP body.
 *  A SOAPFault object, which carries status and/or
 *  error information, is an example of a SOAPBodyElement object.
 */
trait SOAPBody extends SOAPElement {

    /** Creates a new SOAPBodyElement object with the specified
     *  name and adds it to this SOAPBody object.
     */
    @stub
    def addBodyElement(name: Name): SOAPBodyElement = ???

    /** Creates a new SOAPBodyElement object with the specified
     *  QName and adds it to this SOAPBody object.
     */
    @stub
    def addBodyElement(qname: QName): SOAPBodyElement = ???

    /** Adds the root node of the DOM Document
     *  to this SOAPBody object.
     */
    @stub
    def addDocument(document: Document): SOAPBodyElement = ???

    /** Creates a new SOAPFault object and adds it to
     *  this SOAPBody object.
     */
    @stub
    def addFault(): SOAPFault = ???

    /** Creates a new  SOAPFault object and adds it to this
     *  SOAPBody object.
     */
    @stub
    def addFault(faultCode: Name, faultString: String): SOAPFault = ???

    /** Creates a new SOAPFault object and adds it to
     *  this SOAPBody object.
     */
    @stub
    def addFault(faultCode: Name, faultString: String, locale: Locale): SOAPFault = ???

    /** Creates a new SOAPFault object and adds it to this SOAPBody
     *  object.
     */
    @stub
    def addFault(faultCode: QName, faultString: String): SOAPFault = ???

    /** Creates a new SOAPFault object and adds it to this
     *  SOAPBody object.
     */
    @stub
    def addFault(faultCode: QName, faultString: String, locale: Locale): SOAPFault = ???

    /** Creates a new DOM Document and sets
     *  the first child of this SOAPBody as it's document
     *  element.
     */
    @stub
    def extractContentAsDocument(): Document = ???

    /** Returns the SOAPFault object in this SOAPBody
     *  object.
     */
    @stub
    def getFault(): SOAPFault = ???

    /** Indicates whether a SOAPFault object exists in this
     *  SOAPBody object.
     */
    @stub
    def hasFault(): Boolean = ???
}
