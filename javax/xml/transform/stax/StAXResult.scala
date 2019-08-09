package javax.xml.transform.stax

import java.lang.{Object, String}
import javax.xml.stream.{XMLEventWriter, XMLStreamWriter}
import javax.xml.transform.Result

// Acts as a holder for an XML Result in the
// form of a StAX writer,i.e.
// XMLStreamWriter or XMLEventWriter.
// StAXResult can be used in all cases that accept
// a Result, e.g. Transformer,
// Validator which accept
// Result as input.
class StAXResult extends Object with Result {

    @stub
    // Creates a new instance of a StAXResult
    // by supplying an XMLEventWriter.
    def this(xmlEventWriter: XMLEventWriter) = ???

    @stub
    // The returned system identifier is always null.
    def getSystemId(): String = ???

    @stub
    // Get the XMLEventWriter used by this
    // StAXResult.
    def getXMLEventWriter(): XMLEventWriter = ???

    @stub
    // Get the XMLStreamWriter used by this
    // StAXResult.
    def getXMLStreamWriter(): XMLStreamWriter = ???
}
