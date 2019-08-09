package javax.xml.bind.helpers

import java.io.{File, InputStream, Reader}
import java.lang.{Class, Object, String}
import java.net.URL
import javax.xml.bind.{JAXBElement, UnmarshalException, Unmarshaller, Unmarshaller.Listener, ValidationEventHandler}
import javax.xml.bind.annotation.adapters.XmlAdapter
import javax.xml.bind.attachment.AttachmentUnmarshaller
import javax.xml.stream.{XMLEventReader, XMLStreamReader}
import javax.xml.transform.Source
import javax.xml.validation.Schema
import org.w3c.dom.Node
import org.xml.sax.{InputSource, SAXException, XMLReader}

// Partial default Unmarshaller implementation.
//
// 
// This class provides a partial default implementation for the
// Unmarshallerinterface.
//
// 
// A JAXB Provider has to implement five methods (getUnmarshallerHandler,
// unmarshal(Node), unmarshal(XMLReader,InputSource),
// unmarshal(XMLStreamReader), and unmarshal(XMLEventReader).
abstract class AbstractUnmarshallerImpl extends Object with Unmarshaller {

    // Creates an UnmarshalException from a SAXException.
    protected def createUnmarshalException(e: SAXException): UnmarshalException

    // Gets the adapter associated with the specified type.
    def A: [A <: XmlAdapter]

    // 
    def getAttachmentUnmarshaller(): AttachmentUnmarshaller

    // Return the current event handler or the default event handler if one
    // hasn't been set.
    def getEventHandler(): ValidationEventHandler

    // Return Unmarshaller.Listener registered with this Unmarshaller.
    def getListener(): Unmarshaller.Listener

    // Default implementation of the getProperty method always
    // throws PropertyException since there are no required
    // properties.
    def getProperty(name: String): Object

    // Get the JAXP 1.3 Schema object
    // being used to perform unmarshal-time validation.
    def getSchema(): Schema

    // Obtains a configured XMLReader.
    protected def getXMLReader(): XMLReader

    // Indicates whether or not the Unmarshaller is configured to validate
    // during unmarshal operations.
    def isValidating(): Boolean

    // Associates a configured instance of XmlAdapter with this unmarshaller.
    def Unit: [A <: XmlAdapter]

    // Associates a configured instance of XmlAdapter with this unmarshaller.
    def setAdapter(adapter: XmlAdapter): Unit

    // Associate a context that resolves cid's, content-id URIs, to
    // binary data passed as attachments.
    def setAttachmentUnmarshaller(au: AttachmentUnmarshaller): Unit

    // Allow an application to register a validation event handler.
    def setEventHandler(handler: ValidationEventHandler): Unit

    // 
    // Register unmarshal event callback Unmarshaller.Listener with this Unmarshaller.
    def setListener(listener: Unmarshaller.Listener): Unit

    // Default implementation of the setProperty method always
    // throws PropertyException since there are no required
    // properties.
    def setProperty(name: String, value: Object): Unit

    // Specify the JAXP 1.3 Schema
    // object that should be used to validate subsequent unmarshal operations
    // against.
    def setSchema(schema: Schema): Unit

    // Specifies whether or not the Unmarshaller should validate during
    // unmarshal operations.
    def setValidating(validating: Boolean): Unit

    // Unmarshal XML data from the specified file and return the resulting
    // content tree.
    def unmarshal(f: File): Object

    // Unmarshal XML data from the specified SAX InputSource and return the
    // resulting content tree.
    def unmarshal(source: InputSource): Object

    // Unmarshal XML data from the specified InputStream and return the
    // resulting content tree.
    def unmarshal(is: InputStream): Object

    // Unmarshal XML data by JAXB mapped declaredType
    // and return the resulting content tree.
    def JAXBElement[T]: [T]

    // Unmarshal XML data from the specified Reader and return the
    // resulting content tree.
    def unmarshal(reader: Reader): Object

    // Unmarshal XML data from the specified XML Source and return the
    // resulting content tree.
    def unmarshal(source: Source): Object

    // Unmarshal XML data from the specified XML Source by declaredType and return the
    // resulting content tree.
    def JAXBElement[T]: [T]

    // Unmarshal XML data from the specified URL and return the resulting
    // content tree.
    def unmarshal(url: URL): Object

    // Unmarshal XML data from the specified pull parser and return the
    // resulting content tree.
    def unmarshal(reader: XMLEventReader): Object

    // Unmarshal root element to JAXB mapped declaredType
    // and return the resulting content tree.
    def JAXBElement[T]: [T]

    // Unmarshals an object by using the specified XMLReader and the InputSource.
    protected def unmarshal(reader: XMLReader, source: InputSource): Object

    // Unmarshal XML data from the specified pull parser and return the
    // resulting content tree.
    def unmarshal(reader: XMLStreamReader): Object
}
