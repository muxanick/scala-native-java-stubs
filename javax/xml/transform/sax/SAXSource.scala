package javax.xml.transform.sax

import java.lang.{Object, String}
import javax.xml.transform.Source
import org.xml.sax.{InputSource, XMLReader}

// Acts as an holder for SAX-style Source.
//
// Note that XSLT requires namespace support. Attempting to transform an
// input source that is not
// generated with a namespace-aware parser may result in errors.
// Parsers can be made namespace aware by calling the
// SAXParserFactory.setNamespaceAware(boolean awareness) method.
class SAXSource extends Object with Source {

    @stub
    // Zero-argument default constructor.
    def this() = ???

    @stub
    // Create a SAXSource, using a SAX InputSource.
    def this(inputSource: InputSource) = ???

    @stub
    // Get the SAX InputSource to be used for the Source.
    def getInputSource(): InputSource = ???

    @stub
    // Get the base ID (URI or system ID) from where URIs
    // will be resolved.
    def getSystemId(): String = ???

    @stub
    // Get the XMLReader to be used for the Source.
    def getXMLReader(): XMLReader = ???

    @stub
    // Set the SAX InputSource to be used for the Source.
    def setInputSource(inputSource: InputSource): Unit = ???

    @stub
    // Set the system identifier for this Source.
    def setSystemId(systemId: String): Unit = ???

    @stub
    // Set the XMLReader to be used for the Source.
    def setXMLReader(reader: XMLReader): Unit = ???
}
