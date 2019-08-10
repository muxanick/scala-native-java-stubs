package javax.xml.bind

import java.io.{File, OutputStream, Writer}
import java.lang.{Class, Object, String}
import javax.xml.bind.annotation.adapters.XmlAdapter
import javax.xml.bind.attachment.AttachmentMarshaller
import javax.xml.stream.{XMLEventWriter, XMLStreamWriter}
import javax.xml.transform.Result
import javax.xml.validation.Schema
import scala.scalanative.annotation.stub

/** 
 *  The Marshaller class is responsible for governing the process
 *  of serializing Java content trees back into XML data.  It provides the basic
 *  marshalling methods:
 * 
 *  
 *  Assume the following setup code for all following code fragments:
 *  
 *     
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 *        Object element = u.unmarshal( new File( "foo.xml" ) );
 *        Marshaller m = jc.createMarshaller();
 *     
 *  
 * 
 *  
 *  Marshalling to a File:
 *  
 *     
 *        OutputStream os = new FileOutputStream( "nosferatu.xml" );
 *        m.marshal( element, os );
 *     
 *  
 * 
 *  
 *  Marshalling to a SAX ContentHandler:
 *  
 *     
 *        // assume MyContentHandler instanceof ContentHandler
 *        m.marshal( element, new MyContentHandler() );
 *     
 *  
 * 
 *  
 *  Marshalling to a DOM Node:
 *  
 *     
 *        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
 *        dbf.setNamespaceAware(true);
 *        DocumentBuilder db = dbf.newDocumentBuilder();
 *        Document doc = db.newDocument();
 * 
 *        m.marshal( element, doc );
 *     
 *  
 * 
 *  
 *  Marshalling to a java.io.OutputStream:
 *  
 *     
 *        m.marshal( element, System.out );
 *     
 *  
 * 
 *  
 *  Marshalling to a java.io.Writer:
 *  
 *     
 *        m.marshal( element, new PrintWriter( System.out ) );
 *     
 *  
 * 
 *  
 *  Marshalling to a javax.xml.transform.SAXResult:
 *  
 *     
 *        // assume MyContentHandler instanceof ContentHandler
 *        SAXResult result = new SAXResult( new MyContentHandler() );
 * 
 *        m.marshal( element, result );
 *     
 *  
 * 
 *  
 *  Marshalling to a javax.xml.transform.DOMResult:
 *  
 *     
 *        DOMResult result = new DOMResult();
 * 
 *        m.marshal( element, result );
 *     
 *  
 * 
 *  
 *  Marshalling to a javax.xml.transform.StreamResult:
 *  
 *     
 *        StreamResult result = new StreamResult( System.out );
 * 
 *        m.marshal( element, result );
 *     
 *  
 * 
 *  
 *  Marshalling to a javax.xml.stream.XMLStreamWriter:
 *  
 *     
 *        XMLStreamWriter xmlStreamWriter =
 *            XMLOutputFactory.newInstance().createXMLStreamWriter( ... );
 * 
 *        m.marshal( element, xmlStreamWriter );
 *     
 *  
 * 
 *  
 *  Marshalling to a javax.xml.stream.XMLEventWriter:
 *  
 *     
 *        XMLEventWriter xmlEventWriter =
 *            XMLOutputFactory.newInstance().createXMLEventWriter( ... );
 * 
 *        m.marshal( element, xmlEventWriter );
 *     
 *  
 * 
 *  
 *  
 *  Marshalling content tree rooted by a JAXB element
 *  
 *  The first parameter of the overloaded
 *  Marshaller.marshal(java.lang.Object, ...) methods must be a
 *  JAXB element as computed by
 *  JAXBIntrospector.isElement(java.lang.Object);
 *  otherwise, a Marshaller.marshal method must throw a
 *  MarshalException. There exist two mechanisms
 *  to enable marshalling an instance that is not a JAXB element.
 *  One method is to wrap the instance as a value of a JAXBElement,
 *  and pass the wrapper element as the first parameter to
 *  a Marshaller.marshal method. For java to schema binding, it
 *  is also possible to simply annotate the instance's class with
 *  @XmlRootElement.
 *  
 * 
 *  
 *  Encoding
 *  
 *  By default, the Marshaller will use UTF-8 encoding when generating XML data
 *  to a java.io.OutputStream, or a java.io.Writer.  Use the
 *  setProperty API to change the output
 *  encoding used during these marshal operations.  Client applications are
 *  expected to supply a valid character encoding name as defined in the
 *  W3C XML 1.0
 *  Recommendation and supported by your Java Platform.
 *  
 * 
 *  
 *  Validation and Well-Formedness
 *  
 *  
 *  Client applications are not required to validate the Java content tree prior
 *  to calling any of the marshal API's.  Furthermore, there is no requirement
 *  that the Java content tree be valid with respect to its original schema in
 *  order to marshal it back into XML data.  Different JAXB Providers will
 *  support marshalling invalid Java content trees at varying levels, however
 *  all JAXB Providers must be able to marshal a valid content tree back to
 *  XML data.  A JAXB Provider must throw a MarshalException when it
 *  is unable to complete the marshal operation due to invalid content.  Some
 *  JAXB Providers will fully allow marshalling invalid content, others will fail
 *  on the first validation error.
 *  
 *  Even when schema validation is not explictly enabled for the marshal operation,
 *  it is possible that certain types of validation events will be detected
 *  during the operation.  Validation events will be reported to the registered
 *  event handler.  If the client application has not registered an event handler
 *  prior to invoking one of the marshal API's, then events will be delivered to
 *  a default event handler which will terminate the marshal operation after
 *  encountering the first error or fatal error. Note that for JAXB 2.0 and
 *  later versions, DefaultValidationEventHandler is
 *  no longer used.
 * 
 *  
 * 
 *  
 *  
 *  Supported Properties
 *  
 *  
 *  All JAXB Providers are required to support the following set of properties.
 *  Some providers may support additional properties.
 *  
 *    jaxb.encoding - value must be a java.lang.String
 *    The output encoding to use when marshalling the XML data.  The
 *                Marshaller will use "UTF-8" by default if this property is not
 *        specified.
 *    jaxb.formatted.output - value must be a java.lang.Boolean
 *    This property controls whether or not the Marshaller will format
 *        the resulting XML data with line breaks and indentation.  A
 *        true value for this property indicates human readable indented
 *        xml data, while a false value indicates unformatted xml data.
 *        The Marshaller will default to false (unformatted) if this
 *        property is not specified.
 *    jaxb.schemaLocation - value must be a java.lang.String
 *    This property allows the client application to specify an
 *        xsi:schemaLocation attribute in the generated XML data.  The format of
 *        the schemaLocation attribute value is discussed in an easy to
 *        understand, non-normative form in
 *        Section 5.6
 *        of the W3C XML Schema Part 0: Primer and specified in
 *        
 *        Section 2.6 of the W3C XML Schema Part 1: Structures.
 *    jaxb.noNamespaceSchemaLocation - value must be a java.lang.String
 *    This property allows the client application to specify an
 *        xsi:noNamespaceSchemaLocation attribute in the generated XML
 *        data.  The format of the schemaLocation attribute value is discussed in
 *        an easy to understand, non-normative form in
 *        Section 5.6
 *        of the W3C XML Schema Part 0: Primer and specified in
 *        
 *        Section 2.6 of the W3C XML Schema Part 1: Structures.
 *    jaxb.fragment - value must be a java.lang.Boolean
 *    This property determines whether or not document level events will be
 *        generated by the Marshaller.  If the property is not specified, the
 *        default is false. This property has different implications depending
 *        on which marshal api you are using - when this property is set to true:
 *        
 *          marshal(Object,ContentHandler) - the Marshaller won't
 *              invoke ContentHandler.startDocument() and
 *              ContentHandler.endDocument().
 *          marshal(Object,Node) - the property has no effect on this
 *              API.
 *          marshal(Object,OutputStream) - the Marshaller won't
 *              generate an xml declaration.
 *          marshal(Object,Writer) - the Marshaller won't
 *              generate an xml declaration.
 *          marshal(Object,Result) - depends on the kind of
 *              Result object, see semantics for Node, ContentHandler, and Stream APIs
 *          marshal(Object,XMLEventWriter) - the
 *              Marshaller will not generate XMLStreamConstants.START_DOCUMENT and
 *              XMLStreamConstants.END_DOCUMENT events.
 *          marshal(Object,XMLStreamWriter) - the
 *              Marshaller will not generate XMLStreamConstants.START_DOCUMENT and
 *              XMLStreamConstants.END_DOCUMENT events.
 *        
 *    
 *  
 *  
 * 
 *  
 *  
 *  Marshal Event Callbacks
 *  
 *  "The Marshaller provides two styles of callback mechanisms
 *  that allow application specific processing during key points in the
 *  unmarshalling process.  In 'class defined' event callbacks, application
 *  specific code placed in JAXB mapped classes is triggered during
 *  marshalling.  'External listeners' allow for centralized processing
 *  of marshal events in one callback method rather than by type event callbacks.
 * 
 *  
 *  Class defined event callback methods allow any JAXB mapped class to specify
 *  its own specific callback methods by defining methods with the following method signatures:
 *  
 *  
 *    // Invoked by Marshaller after it has created an instance of this object.
 *    boolean beforeMarshal(Marshaller);
 * 
 *    // Invoked by Marshaller after it has marshalled all properties of this object.
 *    void afterMarshal(Marshaller);
 *  
 *  
 *  The class defined event callback methods should be used when the callback method requires
 *  access to non-public methods and/or fields of the class.
 *  
 *  The external listener callback mechanism enables the registration of a Marshaller.Listener
 *  instance with a setListener(Listener). The external listener receives all callback events,
 *  allowing for more centralized processing than per class defined callback methods.
 *  
 *  The 'class defined' and external listener event callback methods are independent of each other,
 *  both can be called for one event. The invocation ordering when both listener callback methods exist is
 *  defined in Marshaller.Listener.beforeMarshal(Object) and Marshaller.Listener.afterMarshal(Object).
 *  
 *  An event callback method throwing an exception terminates the current marshal process.
 *  
 */
trait Marshaller {

    /** Gets the adapter associated with the specified type. */
    @stub
    def getAdapter[A <: XmlAdapter](type: Class[A]): A = ???

    /**  */
    @stub
    def getAttachmentMarshaller(): AttachmentMarshaller = ???

    /** Return the current event handler or the default event handler if one
     *  hasn't been set.
     */
    @stub
    def getEventHandler(): ValidationEventHandler = ???

    /** Return Marshaller.Listener registered with this Marshaller. */
    @stub
    def getListener(): Marshaller.Listener = ???

    /** Get a DOM tree view of the content tree(Optional). */
    @stub
    def getNode(contentTree: Any): Node = ???

    /** Get the particular property in the underlying implementation of
     *  Marshaller.
     */
    @stub
    def getProperty(name: String): Any = ???

    /** Get the JAXP 1.3 Schema object
     *  being used to perform marshal-time validation.
     */
    @stub
    def getSchema(): Schema = ???

    /** Marshal the content tree rooted at jaxbElement into SAX2 events. */
    @stub
    def marshal(jaxbElement: Any, handler: ContentHandler): Unit = ???

    /** Marshal the content tree rooted at jaxbElement into a file. */
    @stub
    def marshal(jaxbElement: Any, output: File): Unit = ???

    /** Marshal the content tree rooted at jaxbElement into a DOM tree. */
    @stub
    def marshal(jaxbElement: Any, node: Node): Unit = ???

    /** Marshal the content tree rooted at jaxbElement into an output stream. */
    @stub
    def marshal(jaxbElement: Any, os: OutputStream): Unit = ???

    /** Marshal the content tree rooted at jaxbElement into the specified
     *  javax.xml.transform.Result.
     */
    @stub
    def marshal(jaxbElement: Any, result: Result): Unit = ???

    /** Marshal the content tree rooted at jaxbElement into a Writer. */
    @stub
    def marshal(jaxbElement: Any, writer: Writer): Unit = ???

    /** Marshal the content tree rooted at jaxbElement into a
     *  XMLEventWriter.
     */
    @stub
    def marshal(jaxbElement: Any, writer: XMLEventWriter): Unit = ???

    /** Marshal the content tree rooted at jaxbElement into a
     *  XMLStreamWriter.
     */
    @stub
    def marshal(jaxbElement: Any, writer: XMLStreamWriter): Unit = ???

    /** Associates a configured instance of XmlAdapter with this marshaller. */
    @stub
    def setAdapter[A <: XmlAdapter](type: Class[A], adapter: A): Unit = ???

    /** Associates a configured instance of XmlAdapter with this marshaller. */
    @stub
    def setAdapter(adapter: XmlAdapter): Unit = ???

    /** Associate a context that enables binary data within an XML document
     *  to be transmitted as XML-binary optimized attachment.
     */
    @stub
    def setAttachmentMarshaller(am: AttachmentMarshaller): Unit = ???

    /** Allow an application to register a validation event handler. */
    @stub
    def setEventHandler(handler: ValidationEventHandler): Unit = ???

    /** 
     *  Register marshal event callback Marshaller.Listener with this Marshaller.
     */
    @stub
    def setListener(listener: Marshaller.Listener): Unit = ???

    /** Set the particular property in the underlying implementation of
     *  Marshaller.
     */
    @stub
    def setProperty(name: String, value: Any): Unit = ???

    /** Specify the JAXP 1.3 Schema
     *  object that should be used to validate subsequent marshal operations
     *  against.
     */
    @stub
    def setSchema(schema: Schema): Unit = ???
}

object Marshaller {
    /** 
     *  Register an instance of an implementation of this class with a Marshaller to externally listen
     *  for marshal events.
     */
    type Listener = Marshaller_Listener

    /** The name of the property used to specify the output encoding in
     *  the marshalled XML data.
     */
    @stub
    val JAXB_ENCODING: String = ???

    /** The name of the property used to specify whether or not the marshalled
     *  XML data is formatted with linefeeds and indentation.
     */
    @stub
    val JAXB_FORMATTED_OUTPUT: String = ???

    /** The name of the property used to specify whether or not the marshaller
     *  will generate document level events (ie calling startDocument or endDocument).
     */
    @stub
    val JAXB_FRAGMENT: String = ???

    /** The name of the property used to specify the
     *  xsi:noNamespaceSchemaLocation attribute value to place in the marshalled
     *  XML output.
     */
    @stub
    val JAXB_NO_NAMESPACE_SCHEMA_LOCATION: String = ???

    /** The name of the property used to specify the xsi:schemaLocation
     *  attribute value to place in the marshalled XML output.
     */
    @stub
    val JAXB_SCHEMA_LOCATION: String = ???
}
