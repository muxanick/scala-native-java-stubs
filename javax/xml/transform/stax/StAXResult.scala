package javax.xml.transform.stax

import java.lang.{Object, String}
import javax.xml.stream.{XMLEventWriter, XMLStreamWriter}
import javax.xml.transform.Result
import scala.scalanative.annotation.stub

/** Acts as a holder for an XML Result in the
 *  form of a StAX writer,i.e.
 *  XMLStreamWriter or XMLEventWriter.
 *  StAXResult can be used in all cases that accept
 *  a Result, e.g. Transformer,
 *  Validator which accept
 *  Result as input.
 */
class StAXResult extends Object with Result {

    /** Creates a new instance of a StAXResult
     *  by supplying an XMLEventWriter.
     */
    @stub
    def this(xmlEventWriter: XMLEventWriter) = ???

    /** Creates a new instance of a StAXResult
     *  by supplying an XMLStreamWriter.
     */
    @stub
    def this(xmlStreamWriter: XMLStreamWriter) = ???

    /** The returned system identifier is always null. */
    @stub
    def getSystemId(): String = ???

    /** Get the XMLEventWriter used by this
     *  StAXResult.
     */
    @stub
    def getXMLEventWriter(): XMLEventWriter = ???

    /** Get the XMLStreamWriter used by this
     *  StAXResult.
     */
    @stub
    def getXMLStreamWriter(): XMLStreamWriter = ???

    /** In the context of a StAXResult, it is not appropriate
     *  to explicitly set the system identifier.
     */
    @stub
    def setSystemId(systemId: String): Unit = ???
}

object StAXResult {
    /** If TransformerFactory.getFeature(String name)
     *  returns true when passed this value as an argument,
     *  the Transformer supports Result output of this type.
     */
    @stub
    val FEATURE: String = ???
}
