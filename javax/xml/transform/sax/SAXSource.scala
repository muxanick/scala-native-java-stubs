package javax.xml.transform.sax

import java.lang.{Object, String}
import javax.xml.transform.Source
import org.xml.sax.{InputSource, XMLReader}

/** Acts as an holder for SAX-style Source.
 * 
 *  Note that XSLT requires namespace support. Attempting to transform an
 *  input source that is not
 *  generated with a namespace-aware parser may result in errors.
 *  Parsers can be made namespace aware by calling the
 *  SAXParserFactory.setNamespaceAware(boolean awareness) method.
 */
class SAXSource extends Object with Source {

    /** Zero-argument default constructor. */
    @stub
    def this() = ???

    /** Create a SAXSource, using a SAX InputSource. */
    @stub
    def this(inputSource: InputSource) = ???

    /** Get the SAX InputSource to be used for the Source. */
    @stub
    def getInputSource(): InputSource = ???

    /** Get the base ID (URI or system ID) from where URIs
     *  will be resolved.
     */
    @stub
    def getSystemId(): String = ???

    /** Get the XMLReader to be used for the Source. */
    @stub
    def getXMLReader(): XMLReader = ???

    /** Set the SAX InputSource to be used for the Source. */
    @stub
    def setInputSource(inputSource: InputSource): Unit = ???

    /** Set the system identifier for this Source. */
    @stub
    def setSystemId(systemId: String): Unit = ???

    /** Set the XMLReader to be used for the Source. */
    @stub
    def setXMLReader(reader: XMLReader): Unit = ???
}
