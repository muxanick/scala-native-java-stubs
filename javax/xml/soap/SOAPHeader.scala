package javax.xml.soap

import java.lang.String
import java.util.Iterator
import javax.xml.namespace.QName

// A representation of the SOAP header
// element. A SOAP header element consists of XML data that affects
// the way the application-specific content is processed by the message
// provider. For example, transaction semantics, authentication information,
// and so on, can be specified as the content of a SOAPHeader
// object.
// 
// A SOAPEnvelope object contains an empty
// SOAPHeader object by default. If the SOAPHeader
// object, which is optional, is not needed, it can be retrieved and deleted
// with the following line of code. The variable se is a
// SOAPEnvelope object.
// 
//      se.getHeader().detachNode();
// 
//
// A SOAPHeader object is created with the SOAPEnvelope
// method addHeader. This method, which creates a new header and adds it
// to the envelope, may be called only after the existing header has been removed.
//
// 
//      se.getHeader().detachNode();
//      SOAPHeader sh = se.addHeader();
// 
// 
// A SOAPHeader object can have only SOAPHeaderElement
// objects as its immediate children. The method addHeaderElement
// creates a new HeaderElement object and adds it to the
// SOAPHeader object. In the following line of code, the
// argument to the method addHeaderElement is a Name
// object that is the name for the new HeaderElement object.
// 
//      SOAPHeaderElement shElement = sh.addHeaderElement(name);
// 
trait SOAPHeader extends SOAPElement {

    @stub
    // Creates a new SOAPHeaderElement object initialized with the
    // specified name and adds it to this SOAPHeader object.
    def addHeaderElement(name: Name): SOAPHeaderElement = ???

    @stub
    // Creates a new SOAPHeaderElement object initialized with the
    // specified qname and adds it to this SOAPHeader object.
    def addHeaderElement(qname: QName): SOAPHeaderElement = ???

    @stub
    // Creates a new NotUnderstood SOAPHeaderElement object initialized
    // with the specified name and adds it to this SOAPHeader object.
    def addNotUnderstoodHeaderElement(name: QName): SOAPHeaderElement = ???

    @stub
    // Creates a new Upgrade SOAPHeaderElement object initialized
    // with the specified List of supported SOAP URIs and adds it to this
    // SOAPHeader object.
    def addUpgradeHeaderElement(supportedSOAPURIs: Iterator): SOAPHeaderElement = ???

    @stub
    // Creates a new Upgrade SOAPHeaderElement object initialized
    // with the specified supported SOAP URI and adds it to this
    // SOAPHeader object.
    def addUpgradeHeaderElement(supportedSoapUri: String): SOAPHeaderElement = ???

    @stub
    // Creates a new Upgrade SOAPHeaderElement object initialized
    // with the specified array of supported SOAP URIs and adds it to this
    // SOAPHeader object.
    def addUpgradeHeaderElement(supportedSoapUris: Array[String]): SOAPHeaderElement = ???

    @stub
    // Returns an Iterator over all the SOAPHeaderElement objects
    // in this SOAPHeader object.
    def examineAllHeaderElements(): Iterator = ???

    @stub
    // Returns an Iterator over all the SOAPHeaderElement objects
    // in this SOAPHeader object
    // that have the specified actor.
    def examineHeaderElements(actor: String): Iterator = ???

    @stub
    // Returns an Iterator over all the SOAPHeaderElement objects
    // in this SOAPHeader object
    // that have the specified actor and that have a MustUnderstand attribute
    // whose value is equivalent to true.
    def examineMustUnderstandHeaderElements(actor: String): Iterator = ???

    @stub
    // Returns an Iterator over all the SOAPHeaderElement objects
    // in this SOAPHeader object and detaches them
    // from this SOAPHeader object.
    def extractAllHeaderElements(): Iterator = ???
}
