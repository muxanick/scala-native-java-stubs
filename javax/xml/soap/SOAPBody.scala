package javax.xml.soap

import java.lang.String
import java.util.Locale
import javax.xml.namespace.QName
import org.w3c.dom.Document

// An object that represents the contents of the SOAP body
// element in a SOAP message. A SOAP body element consists of XML data
// that affects the way the application-specific content is processed.
// 
// A SOAPBody object contains SOAPBodyElement
// objects, which have the content for the SOAP body.
// A SOAPFault object, which carries status and/or
// error information, is an example of a SOAPBodyElement object.
trait SOAPBody extends SOAPElement {

    @stub
    // Creates a new SOAPBodyElement object with the specified
    // name and adds it to this SOAPBody object.
    def addBodyElement(name: Name): SOAPBodyElement = ???

    @stub
    // Creates a new SOAPBodyElement object with the specified
    // QName and adds it to this SOAPBody object.
    def addBodyElement(qname: QName): SOAPBodyElement = ???

    @stub
    // Adds the root node of the DOM Document
    // to this SOAPBody object.
    def addDocument(document: Document): SOAPBodyElement = ???

    @stub
    // Creates a new SOAPFault object and adds it to
    // this SOAPBody object.
    def addFault(): SOAPFault = ???

    @stub
    // Creates a new  SOAPFault object and adds it to this
    // SOAPBody object.
    def addFault(faultCode: Name, faultString: String): SOAPFault = ???

    @stub
    // Creates a new SOAPFault object and adds it to
    // this SOAPBody object.
    def addFault(faultCode: Name, faultString: String, locale: Locale): SOAPFault = ???

    @stub
    // Creates a new SOAPFault object and adds it to this SOAPBody
    // object.
    def addFault(faultCode: QName, faultString: String): SOAPFault = ???

    @stub
    // Creates a new SOAPFault object and adds it to this
    // SOAPBody object.
    def addFault(faultCode: QName, faultString: String, locale: Locale): SOAPFault = ???

    @stub
    // Creates a new DOM Document and sets
    // the first child of this SOAPBody as it's document
    // element.
    def extractContentAsDocument(): Document = ???

    @stub
    // Returns the SOAPFault object in this SOAPBody
    // object.
    def getFault(): SOAPFault = ???
}
