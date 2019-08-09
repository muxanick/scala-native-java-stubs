package javax.xml.parsers

import java.io.{File, InputStream}
import java.lang.{Object, String}
import javax.xml.validation.Schema
import scala.scalanative.annotation.stub

/** Defines the API to obtain DOM Document instances from an XML
 *  document. Using this class, an application programmer can obtain a
 *  Document from XML.
 * 
 *  An instance of this class can be obtained from the
 *  DocumentBuilderFactory.newDocumentBuilder() method. Once
 *  an instance of this class is obtained, XML can be parsed from a
 *  variety of input sources. These input sources are InputStreams,
 *  Files, URLs, and SAX InputSources.
 * 
 *  Note that this class reuses several classes from the SAX API. This
 *  does not require that the implementor of the underlying DOM
 *  implementation use a SAX parser to parse XML document into a
 *  Document. It merely requires that the implementation
 *  communicate with the application using these existing APIs.
 */
abstract class DocumentBuilder extends Object {

    /** Protected constructor */
    @stub
    protected def this() = ???

    /** Obtain an instance of a DOMImplementation object. */
    def getDOMImplementation(): DOMImplementation

    /** Get a reference to the the Schema being used by
     *  the XML processor.
     */
    def getSchema(): Schema

    /** Indicates whether or not this parser is configured to
     *  understand namespaces.
     */
    def isNamespaceAware(): Boolean

    /** Indicates whether or not this parser is configured to
     *  validate XML documents.
     */
    def isValidating(): Boolean

    /** Get the XInclude processing mode for this parser. */
    def isXIncludeAware(): Boolean

    /** Obtain a new instance of a DOM Document object
     *  to build a DOM tree with.
     */
    def newDocument(): Document

    /** Parse the content of the given file as an XML document
     *  and return a new DOM Document object.
     */
    def parse(f: File): Document

    /** Parse the content of the given input source as an XML document
     *  and return a new DOM Document object.
     */
    def parse(is: InputSource): Document

    /** Parse the content of the given InputStream as an XML
     *  document and return a new DOM Document object.
     */
    def parse(is: InputStream): Document

    /** Parse the content of the given InputStream as an
     *  XML document and return a new DOM Document object.
     */
    def parse(is: InputStream, systemId: String): Document

    /** Parse the content of the given URI as an XML document
     *  and return a new DOM Document object.
     */
    def parse(uri: String): Document

    /** Reset this DocumentBuilder to its original configuration. */
    def reset(): Unit

    /** Specify the EntityResolver to be used to resolve
     *  entities present in the XML document to be parsed.
     */
    def setEntityResolver(er: EntityResolver): Unit

    /** Specify the ErrorHandler to be used by the parser. */
    def setErrorHandler(eh: ErrorHandler): Unit
}
