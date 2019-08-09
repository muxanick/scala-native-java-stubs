package javax.xml.transform.stax

import java.lang.{Object, String}
import javax.xml.stream.{XMLEventReader, XMLStreamReader}
import javax.xml.transform.Source
import scala.scalanative.annotation.stub

/** Acts as a holder for an XML Source in the
 *  form of a StAX reader,i.e.
 *  XMLStreamReader or XMLEventReader.
 *  StAXSource can be used in all cases that accept
 *  a Source, e.g. Transformer,
 *  Validator which accept
 *  Source as input.
 * 
 *  StAXSources are consumed during processing
 *  and are not reusable.
 */
class StAXSource extends Object with Source {

    /** Creates a new instance of a StAXSource
     *  by supplying an XMLEventReader.
     */
    @stub
    def this(xmlEventReader: XMLEventReader) = ???

    /** Creates a new instance of a StAXSource
     *  by supplying an XMLStreamReader.
     */
    @stub
    def this(xmlStreamReader: XMLStreamReader) = ???

    /** Get the system identifier used by this
     *  StAXSource.
     */
    @stub
    def getSystemId(): String = ???

    /** Get the XMLEventReader used by this
     *  StAXSource.
     */
    @stub
    def getXMLEventReader(): XMLEventReader = ???

    /** Get the XMLStreamReader used by this
     *  StAXSource.
     */
    @stub
    def getXMLStreamReader(): XMLStreamReader = ???

    /** In the context of a StAXSource, it is not appropriate
     *  to explicitly set the system identifier.
     */
    @stub
    def setSystemId(systemId: String): Unit = ???
}

object StAXSource {
    /** If TransformerFactory.getFeature(String name)
     *  returns true when passed this value as an argument,
     *  the Transformer supports Source input of this type.
     */
    @stub
    val FEATURE: String = ???
}
