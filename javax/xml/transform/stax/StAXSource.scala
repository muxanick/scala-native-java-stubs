package javax.xml.transform.stax

import java.lang.{Object, String}
import javax.xml.stream.{XMLEventReader, XMLStreamReader}
import javax.xml.transform.Source

// Acts as a holder for an XML Source in the
// form of a StAX reader,i.e.
// XMLStreamReader or XMLEventReader.
// StAXSource can be used in all cases that accept
// a Source, e.g. Transformer,
// Validator which accept
// Source as input.
//
// StAXSources are consumed during processing
// and are not reusable.
class StAXSource extends Object with Source {

    @stub
    // Creates a new instance of a StAXSource
    // by supplying an XMLEventReader.
    def this(xmlEventReader: XMLEventReader) = ???

    @stub
    // Get the system identifier used by this
    // StAXSource.
    def getSystemId(): String = ???

    @stub
    // Get the XMLEventReader used by this
    // StAXSource.
    def getXMLEventReader(): XMLEventReader = ???

    @stub
    // Get the XMLStreamReader used by this
    // StAXSource.
    def getXMLStreamReader(): XMLStreamReader = ???
}
