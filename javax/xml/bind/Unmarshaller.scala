package javax.xml.bind

import java.io.{File, InputStream, Reader}
import java.lang.{Class, Object, String}
import java.net.URL
import javax.xml.bind.annotation.adapters.XmlAdapter
import javax.xml.bind.attachment.AttachmentUnmarshaller
import javax.xml.stream.{XMLEventReader, XMLStreamReader}
import javax.xml.transform.Source
import javax.xml.validation.Schema
import scala.scalanative.annotation.stub

/** The Unmarshaller class governs the process of deserializing XML
 *  data into newly created Java content trees, optionally validating the XML
 *  data as it is unmarshalled.  It provides an overloading of unmarshal methods
 *  for many different input kinds.
 * 
 *  
 *  Unmarshalling from a File:
 *  
 *     
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 *        Object o = u.unmarshal( new File( "nosferatu.xml" ) );
 *     
 *  
 * 
 * 
 *  
 *  Unmarshalling from an InputStream:
 *  
 *     
 *        InputStream is = new FileInputStream( "nosferatu.xml" );
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 *        Object o = u.unmarshal( is );
 *     
 *  
 * 
 *  
 *  Unmarshalling from a URL:
 *  
 *     
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 *        URL url = new URL( "http://beaker.east/nosferatu.xml" );
 *        Object o = u.unmarshal( url );
 *     
 *  
 * 
 *  
 *  Unmarshalling from a StringBuffer using a
 *  javax.xml.transform.stream.StreamSource:
 *  
 *     
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 *        StringBuffer xmlStr = new StringBuffer( "<?xml version="1.0"?>..." );
 *        Object o = u.unmarshal( new StreamSource( new StringReader( xmlStr.toString() ) ) );
 *     
 *  
 * 
 *  
 *  Unmarshalling from a org.w3c.dom.Node:
 *  
 *     
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 * 
 *        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
 *        dbf.setNamespaceAware(true);
 *        DocumentBuilder db = dbf.newDocumentBuilder();
 *        Document doc = db.parse(new File( "nosferatu.xml"));
 * 
 *        Object o = u.unmarshal( doc );
 *     
 *  
 * 
 *  
 *  Unmarshalling from a javax.xml.transform.sax.SAXSource using a
 *  client specified validating SAX2.0 parser:
 *  
 *     
 *        // configure a validating SAX2.0 parser (Xerces2)
 *        static final String JAXP_SCHEMA_LANGUAGE =
 *            "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
 *        static final String JAXP_SCHEMA_LOCATION =
 *            "http://java.sun.com/xml/jaxp/properties/schemaSource";
 *        static final String W3C_XML_SCHEMA =
 *            "http://www.w3.org/2001/XMLSchema";
 * 
 *        System.setProperty( "javax.xml.parsers.SAXParserFactory",
 *                            "org.apache.xerces.jaxp.SAXParserFactoryImpl" );
 * 
 *        SAXParserFactory spf = SAXParserFactory.newInstance();
 *        spf.setNamespaceAware(true);
 *        spf.setValidating(true);
 *        SAXParser saxParser = spf.newSAXParser();
 * 
 *        try {
 *            saxParser.setProperty(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
 *            saxParser.setProperty(JAXP_SCHEMA_LOCATION, "http://....");
 *        } catch (SAXNotRecognizedException x) {
 *            // exception handling omitted
 *        }
 * 
 *        XMLReader xmlReader = saxParser.getXMLReader();
 *        SAXSource source =
 *            new SAXSource( xmlReader, new InputSource( "http://..." ) );
 * 
 *        // Setup JAXB to unmarshal
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 *        ValidationEventCollector vec = new ValidationEventCollector();
 *        u.setEventHandler( vec );
 * 
 *        // turn off the JAXB provider's default validation mechanism to
 *        // avoid duplicate validation
 *        u.setValidating( false )
 * 
 *        // unmarshal
 *        Object o = u.unmarshal( source );
 * 
 *        // check for events
 *        if( vec.hasEvents() ) {
 *           // iterate over events
 *        }
 *     
 *  
 * 
 *  
 *  Unmarshalling from a StAX XMLStreamReader:
 *  
 *     
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 * 
 *        javax.xml.stream.XMLStreamReader xmlStreamReader =
 *            javax.xml.stream.XMLInputFactory().newInstance().createXMLStreamReader( ... );
 * 
 *        Object o = u.unmarshal( xmlStreamReader );
 *     
 *  
 * 
 *  
 *  Unmarshalling from a StAX XMLEventReader:
 *  
 *     
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 * 
 *        javax.xml.stream.XMLEventReader xmlEventReader =
 *            javax.xml.stream.XMLInputFactory().newInstance().createXMLEventReader( ... );
 * 
 *        Object o = u.unmarshal( xmlEventReader );
 *     
 *  
 * 
 *  
 *  
 *  Unmarshalling XML Data
 *  
 *  Unmarshalling can deserialize XML data that represents either an entire XML document
 *  or a subtree of an XML document. Typically, it is sufficient to use the
 *  unmarshalling methods described by
 *  Unmarshal root element that is declared globally.
 *  These unmarshal methods utilize JAXBContext's mapping of global XML element
 *  declarations and type definitions to JAXB mapped classes to initiate the
 *  unmarshalling of the root element of  XML data.  When the JAXBContext's
 *  mappings are not sufficient to unmarshal the root element of XML data,
 *  the application can assist the unmarshalling process by using the
 *  unmarshal by declaredType methods.
 *  These methods are useful for unmarshalling XML data where
 *  the root element corresponds to a local element declaration in the schema.
 *  
 * 
 *  
 *  An unmarshal method never returns null. If the unmarshal process is unable to unmarshal
 *  the root of XML content to a JAXB mapped object, a fatal error is reported that
 *  terminates processing by throwing JAXBException.
 *  
 * 
 *  
 *  
 *  Unmarshal a root element that is globally declared
 *  
 *  The unmarshal methods that do not have an declaredType parameter use
 *  JAXBContext to unmarshal the root element of an XML data. The JAXBContext
 *  instance is the one that was used to create this Unmarshaller. The JAXBContext
 *  instance maintains a mapping of globally declared XML element and type definition names to
 *  JAXB mapped classes. The unmarshal method checks if JAXBContext has a mapping
 *  from the root element's XML name and/or @xsi:type to a JAXB mapped class.  If it does, it umarshalls the
 *  XML data using the appropriate JAXB mapped class. Note that when the root element name is unknown and the root
 *  element has an @xsi:type, the XML data is unmarshalled
 *  using that JAXB mapped class as the value of a JAXBElement.
 *  When the JAXBContext object does not have a mapping for the root element's name
 *  nor its @xsi:type, if it exists,
 *  then the unmarshal operation will abort immediately by throwing a UnmarshalException. This exception scenario can be worked around by using the unmarshal by
 *  declaredType methods described in the next subsection.
 *  
 * 
 *  
 *  
 *  Unmarshal by Declared Type
 *  
 *  The unmarshal methods with a declaredType parameter enable an
 *  application to deserialize a root element of XML data, even when
 *  there is no mapping in JAXBContext of the root element's XML name.
 *  The unmarshaller unmarshals the root element using the application provided
 *  mapping specified as the declaredType parameter.
 *  Note that even when the root element's element name is mapped by JAXBContext,
 *  the declaredType parameter overrides that mapping for
 *  deserializing the root element when using these unmarshal methods.
 *  Additionally, when the root element of XML data has an xsi:type attribute and
 *  that attribute's value references a type definition that is mapped
 *  to a JAXB mapped class by JAXBContext, that the root
 *  element's xsi:type attribute takes
 *  precedence over the unmarshal methods declaredType parameter.
 *  These methods always return a JAXBElement<declaredType>
 *  instance. The table below shows how the properties of the returned JAXBElement
 *  instance are set.
 * 
 *  
 *  
 *    
 *    
 *      
 *        
 *        Unmarshal By Declared Type returned JAXBElement
 *        
 *      
 *        JAXBElement Property
 *        Value
 *      
 *      
 *        name
 *        xml element name
 *      
 *    
 *    
 *      
 *        value
 *        instanceof declaredType
 *      
 *      
 *        declaredType
 *        unmarshal method declaredType parameter
 *      
 *      
 *        scope
 *        null (actual scope is unknown)
 *      
 *    
 *   
 *  
 * 
 *  
 *  The following is an example of
 *  unmarshal by declaredType method.
 *  
 *  Unmarshal by declaredType from a org.w3c.dom.Node:
 *  
 *     
 *        Schema fragment for example
 *        <xs:schema>
 *           <xs:complexType name="FooType">...<\xs:complexType>
 *           <!-- global element declaration "PurchaseOrder" -->
 *           <xs:element name="PurchaseOrder">
 *               <xs:complexType>
 *                  <xs:sequence>
 *                     <!-- local element declaration "foo" -->
 *                     <xs:element name="foo" type="FooType"/>
 *                     ...
 *                  </xs:sequence>
 *               </xs:complexType>
 *           </xs:element>
 *        </xs:schema>
 * 
 *        JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 *        Unmarshaller u = jc.createUnmarshaller();
 * 
 *        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
 *        dbf.setNamespaceAware(true);
 *        DocumentBuilder db = dbf.newDocumentBuilder();
 *        Document doc = db.parse(new File( "nosferatu.xml"));
 *        Element  fooSubtree = ...; // traverse DOM till reach xml element foo, constrained by a
 *                                   // local element declaration in schema.
 * 
 *        // FooType is the JAXB mapping of the type of local element declaration foo.
 *        JAXBElement<FooType> foo = u.unmarshal( fooSubtree, FooType.class);
 *     
 *  
 * 
 *  
 *  Support for SAX2.0 Compliant Parsers
 *  
 *  A client application has the ability to select the SAX2.0 compliant parser
 *  of their choice.  If a SAX parser is not selected, then the JAXB Provider's
 *  default parser will be used.  Even though the JAXB Provider's default parser
 *  is not required to be SAX2.0 compliant, all providers are required to allow
 *  a client application to specify their own SAX2.0 parser.  Some providers may
 *  require the client application to specify the SAX2.0 parser at schema compile
 *  time. See unmarshal(Source)
 *  for more detail.
 *  
 * 
 *  
 *  Validation and Well-Formedness
 *  
 *  
 *  A client application can enable or disable JAXP 1.3 validation
 *  mechanism via the setSchema(javax.xml.validation.Schema) API.
 *  Sophisticated clients can specify their own validating SAX 2.0 compliant
 *  parser and bypass the JAXP 1.3 validation mechanism using the
 *  unmarshal(Source)  API.
 * 
 *  
 *  Since unmarshalling invalid XML content is defined in JAXB 2.0,
 *  the Unmarshaller default validation event handler was made more lenient
 *  than in JAXB 1.0.  When schema-derived code generated
 *  by JAXB 1.0 binding compiler is registered with JAXBContext,
 *  the default unmarshal validation handler is
 *  DefaultValidationEventHandler and it
 *  terminates the marshal  operation after encountering either a fatal error or an error.
 *  For a JAXB 2.0 client application, there is no explicitly defined default
 *  validation handler and the default event handling only
 *  terminates the unmarshal operation after encountering a fatal error.
 * 
 *  
 * 
 *  
 *  
 *  Supported Properties
 *  
 *  
 *  There currently are not any properties required to be supported by all
 *  JAXB Providers on Unmarshaller.  However, some providers may support
 *  their own set of provider specific properties.
 *  
 * 
 *  
 *  
 *  Unmarshal Event Callbacks
 *  
 *  The Unmarshaller provides two styles of callback mechanisms
 *  that allow application specific processing during key points in the
 *  unmarshalling process.  In 'class defined' event callbacks, application
 *  specific code placed in JAXB mapped classes is triggered during
 *  unmarshalling.  'External listeners' allow for centralized processing
 *  of unmarshal events in one callback method rather than by type event callbacks.
 *  
 *  'Class defined' event callback methods allow any JAXB mapped class to specify
 *  its own specific callback methods by defining methods with the following method signature:
 *  
 *  
 *    // This method is called immediately after the object is created and before the unmarshalling of this
 *    // object begins. The callback provides an opportunity to initialize JavaBean properties prior to unmarshalling.
 *    void beforeUnmarshal(Unmarshaller, Object parent);
 * 
 *    //This method is called after all the properties (except IDREF) are unmarshalled for this object,
 *    //but before this object is set to the parent object.
 *    void afterUnmarshal(Unmarshaller, Object parent);
 *  
 *  
 *  The class defined callback methods should be used when the callback method requires
 *  access to non-public methods and/or fields of the class.
 *  
 *  The external listener callback mechanism enables the registration of a Unmarshaller.Listener
 *  instance with an setListener(Listener). The external listener receives all callback events,
 *  allowing for more centralized processing than per class defined callback methods.  The external listener
 *  receives events when unmarshalling proces is marshalling to a JAXB element or to JAXB mapped class.
 *  
 *  The 'class defined' and external listener event callback methods are independent of each other,
 *  both can be called for one event.  The invocation ordering when both listener callback methods exist is
 *  defined in Unmarshaller.Listener.beforeUnmarshal(Object, Object) and Unmarshaller.Listener.afterUnmarshal(Object, Object).
 *  
 *  An event callback method throwing an exception terminates the current unmarshal process.
 * 
 *  
 */
trait Unmarshaller {

    /** Gets the adapter associated with the specified type. */
    @stub
    def getAdapter[A <: XmlAdapter](type: Class[A]): A = ???

    /**  */
    @stub
    def getAttachmentUnmarshaller(): AttachmentUnmarshaller = ???

    /** Return the current event handler or the default event handler if one
     *  hasn't been set.
     */
    @stub
    def getEventHandler(): ValidationEventHandler = ???

    /** Return Unmarshaller.Listener registered with this Unmarshaller. */
    @stub
    def getListener(): Unmarshaller.Listener = ???

    /** Get the particular property in the underlying implementation of
     *  Unmarshaller.
     */
    @stub
    def getProperty(name: String): Any = ???

    /** Get the JAXP 1.3 Schema object
     *  being used to perform unmarshal-time validation.
     */
    @stub
    def getSchema(): Schema = ???

    /** Get an unmarshaller handler object that can be used as a component in
     *  an XML pipeline.
     */
    @stub
    def getUnmarshallerHandler(): UnmarshallerHandler = ???

    /** Deprecated. 
     * since JAXB2.0, please see getSchema()
     * 
     */
    @stub
    def isValidating(): Boolean = ???

    /** Associates a configured instance of XmlAdapter with this unmarshaller. */
    @stub
    def setAdapter[A <: XmlAdapter](type: Class[A], adapter: A): Unit = ???

    /** Associates a configured instance of XmlAdapter with this unmarshaller. */
    @stub
    def setAdapter(adapter: XmlAdapter): Unit = ???

    /** Associate a context that resolves cid's, content-id URIs, to
     *  binary data passed as attachments.
     */
    @stub
    def setAttachmentUnmarshaller(au: AttachmentUnmarshaller): Unit = ???

    /** Allow an application to register a ValidationEventHandler. */
    @stub
    def setEventHandler(handler: ValidationEventHandler): Unit = ???

    /** 
     *  Register unmarshal event callback Unmarshaller.Listener with this Unmarshaller.
     */
    @stub
    def setListener(listener: Unmarshaller.Listener): Unit = ???

    /** Set the particular property in the underlying implementation of
     *  Unmarshaller.
     */
    @stub
    def setProperty(name: String, value: Any): Unit = ???

    /** Specify the JAXP 1.3 Schema
     *  object that should be used to validate subsequent unmarshal operations
     *  against.
     */
    @stub
    def setSchema(schema: Schema): Unit = ???

    /** Deprecated. 
     * since JAXB2.0, please see setSchema(javax.xml.validation.Schema)
     * 
     */
    @stub
    def setValidating(validating: Boolean): Unit = ???

    /** Unmarshal XML data from the specified file and return the resulting
     *  content tree.
     */
    @stub
    def unmarshal(f: File): Any = ???

    /** Unmarshal XML data from the specified SAX InputSource and return the
     *  resulting content tree.
     */
    @stub
    def unmarshal(source: InputSource): Any = ???

    /** Unmarshal XML data from the specified InputStream and return the
     *  resulting content tree.
     */
    @stub
    def unmarshal(is: InputStream): Any = ???

    /** Unmarshal global XML data from the specified DOM tree and return the resulting
     *  content tree.
     */
    @stub
    def unmarshal(node: Node): Any = ???

    /** Unmarshal XML data by JAXB mapped declaredType
     *  and return the resulting content tree.
     */
    @stub
    def unmarshal[T](node: Node, declaredType: Class[T]): JAXBElement[T] = ???

    /** Unmarshal XML data from the specified Reader and return the
     *  resulting content tree.
     */
    @stub
    def unmarshal(reader: Reader): Any = ???

    /** Unmarshal XML data from the specified XML Source and return the
     *  resulting content tree.
     */
    @stub
    def unmarshal(source: Source): Any = ???

    /** Unmarshal XML data from the specified XML Source by declaredType and return the
     *  resulting content tree.
     */
    @stub
    def unmarshal[T](source: Source, declaredType: Class[T]): JAXBElement[T] = ???

    /** Unmarshal XML data from the specified URL and return the resulting
     *  content tree.
     */
    @stub
    def unmarshal(url: URL): Any = ???

    /** Unmarshal XML data from the specified pull parser and return the
     *  resulting content tree.
     */
    @stub
    def unmarshal(reader: XMLEventReader): Any = ???

    /** Unmarshal root element to JAXB mapped declaredType
     *  and return the resulting content tree.
     */
    @stub
    def unmarshal[T](reader: XMLEventReader, declaredType: Class[T]): JAXBElement[T] = ???

    /** Unmarshal XML data from the specified pull parser and return the
     *  resulting content tree.
     */
    @stub
    def unmarshal(reader: XMLStreamReader): Any = ???

    /** Unmarshal root element to JAXB mapped declaredType
     *  and return the resulting content tree.
     */
    @stub
    def unmarshal[T](reader: XMLStreamReader, declaredType: Class[T]): JAXBElement[T] = ???
}

object Unmarshaller {
    /** 
     *  Register an instance of an implementation of this class with Unmarshaller to externally listen
     *  for unmarshal events.
     */
    type Listener = Unmarshaller_Listener
}
