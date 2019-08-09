package javax.xml.bind

import java.lang.{Class, ClassLoader, Object, String}
import java.util.Map
import org.w3c.dom.Node

/** 
 *  The JAXBContext class provides the client's entry point to the
 *  JAXB API. It provides an abstraction for managing the XML/Java binding
 *  information necessary to implement the JAXB binding framework operations:
 *  unmarshal, marshal and validate.
 * 
 *  A client application normally obtains new instances of this class using
 *  one of these two styles for newInstance methods, although there are other
 *  specialized forms of the method available:
 * 
 *  
 *    JAXBContext.newInstance( "com.acme.foo:com.acme.bar" ) 
 *    The JAXBContext instance is initialized from a list of colon
 *    separated Java package names. Each java package contains
 *    JAXB mapped classes, schema-derived classes and/or user annotated
 *    classes. Additionally, the java package may contain JAXB package annotations
 *    that must be processed. (see JLS, Section 7.4.1 "Named Packages").
 *    
 *    JAXBContext.newInstance( com.acme.foo.Foo.class ) 
 *     The JAXBContext instance is initialized with class(es)
 *     passed as parameter(s) and classes that are statically reachable from
 *     these class(es). See newInstance(Class...) for details.
 *    
 *  
 * 
 *  
 *  SPEC REQUIREMENT: the provider must supply an implementation
 *  class containing the following method signatures:
 * 
 *  
 *  public static JAXBContext createContext( String contextPath, ClassLoader classLoader, Map<String,Object> properties ) throws JAXBException
 *  public static JAXBContext createContext( Class[] classes, Map<String,Object> properties ) throws JAXBException
 *  
 * 
 *  
 *  The following JAXB 1.0 requirement is only required for schema to
 *  java interface/implementation binding. It does not apply to JAXB annotated
 *  classes. JAXB Providers must generate a jaxb.properties file in
 *  each package containing schema derived classes.  The property file must
 *  contain a property named javax.xml.bind.context.factory whose
 *  value is the name of the class that implements the createContext
 *  APIs.
 * 
 *  
 *  The class supplied by the provider does not have to be assignable to
 *  javax.xml.bind.JAXBContext, it simply has to provide a class that
 *  implements the createContext APIs.
 * 
 *  
 *  In addition, the provider must call the
 *  DatatypeConverter.setDatatypeConverter api prior to any client
 *  invocations of the marshal and unmarshal methods.  This is necessary to
 *  configure the datatype converter that will be used during these operations.
 * 
 *  
 *  Unmarshalling
 *  
 *  The Unmarshaller class provides the client application the ability
 *  to convert XML data into a tree of Java content objects.
 *  The unmarshal method allows for
 *  any global XML element declared in the schema to be unmarshalled as
 *  the root of an instance document.
 *  Additionally, the unmarshal method allows for an unrecognized root element that
 *  has  an xsi:type attribute's value that references a type definition declared in
 *  the schema  to be unmarshalled as the root of an instance document.
 *  The JAXBContext object
 *  allows the merging of global elements and type definitions across a set of schemas (listed
 *  in the contextPath). Since each schema in the schema set can belong
 *  to distinct namespaces, the unification of schemas to an unmarshalling
 *  context should be namespace independent.  This means that a client
 *  application is able to unmarshal XML documents that are instances of
 *  any of the schemas listed in the contextPath.  For example:
 * 
 *  
 *         JAXBContext jc = JAXBContext.newInstance( "com.acme.foo:com.acme.bar" );
 *         Unmarshaller u = jc.createUnmarshaller();
 *         FooObject fooObj = (FooObject)u.unmarshal( new File( "foo.xml" ) ); // ok
 *         BarObject barObj = (BarObject)u.unmarshal( new File( "bar.xml" ) ); // ok
 *         BazObject bazObj = (BazObject)u.unmarshal( new File( "baz.xml" ) ); // error, "com.acme.baz" not in contextPath
 *  
 * 
 *  
 *  The client application may also generate Java content trees explicitly rather
 *  than unmarshalling existing XML data.  For all JAXB-annotated value classes,
 *  an application can create content using constructors.
 *  For schema-derived interface/implementation classes and for the
 *  creation of elements that are not bound to a JAXB-annotated
 *  class, an application needs to have access and knowledge about each of
 *  the schema derived  ObjectFactory classes that exist in each of
 *  java packages contained in the contextPath.  For each schema
 *  derived java class, there is a static factory method that produces objects
 *  of that type.  For example,
 *  assume that after compiling a schema, you have a package com.acme.foo
 *  that contains a schema derived interface named PurchaseOrder.  In
 *  order to create objects of that type, the client application would use the
 *  factory method like this:
 * 
 *  
 *        com.acme.foo.PurchaseOrder po =
 *            com.acme.foo.ObjectFactory.createPurchaseOrder();
 *  
 * 
 *  
 *  Once the client application has an instance of the the schema derived object,
 *  it can use the mutator methods to set content on it.
 * 
 *  
 *  For more information on the generated ObjectFactory classes, see
 *  Section 4.2 Java Package of the specification.
 * 
 *  
 *  SPEC REQUIREMENT: the provider must generate a class in each
 *  package that contains all of the necessary object factory methods for that
 *  package named ObjectFactory as well as the static
 *  newInstance( javaContentInterface ) method
 * 
 *  Marshalling
 *  
 *  The Marshaller class provides the client application the ability
 *  to convert a Java content tree back into XML data.  There is no difference
 *  between marshalling a content tree that is created manually using the factory
 *  methods and marshalling a content tree that is the result an unmarshal
 *   operation.  Clients can marshal a java content tree back to XML data
 *  to a java.io.OutputStream or a java.io.Writer.  The
 *  marshalling process can alternatively produce SAX2 event streams to a
 *  registered ContentHandler or produce a DOM Node object.
 *  Client applications have control over the output encoding as well as
 *  whether or not to marshal the XML data as a complete document or
 *  as a fragment.
 * 
 *  
 *  Here is a simple example that unmarshals an XML document and then marshals
 *  it back out:
 * 
 *  
 *         JAXBContext jc = JAXBContext.newInstance( "com.acme.foo" );
 * 
 *         // unmarshal from foo.xml
 *         Unmarshaller u = jc.createUnmarshaller();
 *         FooObject fooObj = (FooObject)u.unmarshal( new File( "foo.xml" ) );
 * 
 *         // marshal to System.out
 *         Marshaller m = jc.createMarshaller();
 *         m.marshal( fooObj, System.out );
 *  
 * 
 * 
 *  Validation
 *  
 *  Validation has been changed significantly since JAXB 1.0.  The Validator
 *  class has been deprecated and made optional.  This means that you are advised
 *  not to use this class and, in fact, it may not even be available depending on
 *  your JAXB provider.  JAXB 1.0 client applications that rely on Validator
 *  will still work properly when deployed with the JAXB 1.0 runtime system.
 * 
 *  In JAXB 2.0, the Unmarshaller has included convenince methods that expose
 *  the JAXP 1.3 javax.xml.validation framework.  Please refer to the
 *  Unmarshaller.setSchema(javax.xml.validation.Schema) API for more
 *  information.
 * 
 * 
 *  JAXB Runtime Binding Framework Compatibility
 *  
 *  The following JAXB 1.0 restriction only applies to binding schema to
 *  interfaces/implementation classes.
 *  Since this binding does not require a common runtime system, a JAXB
 *  client application must not attempt to mix runtime objects (JAXBContext,
 *  Marshaller, etc. ) from different providers.  This does not
 *  mean that the client application isn't portable, it simply means that a
 *  client has to use a runtime system provided by the same provider that was
 *  used to compile the schema.
 * 
 * 
 *  Discovery of JAXB implementation
 *  
 *  When one of the newInstance methods is called, a JAXB implementation is discovered
 *  by the following steps.
 * 
 *  
 *  
 *  For each package/class explicitly passed in to the newInstance(java.lang.String) method, in the order they are specified,
 *  jaxb.properties file is looked up in its package, by using the associated classloader —
 *  this is the owner class loader for a Class argument, and for a package
 *  the specified ClassLoader.
 * 
 *  
 *  If such a file is discovered, it is loaded as a property file, and
 *  the value of the JAXB_CONTEXT_FACTORY key will be assumed to be the provider factory class.
 *  This class is then loaded by the associated classloader discussed above.
 * 
 *  
 *  This phase of the look up allows some packages to force the use of a certain JAXB implementation.
 *  (For example, perhaps the schema compiler has generated some vendor extension in the code.)
 * 
 *  
 *  If the system property JAXB_CONTEXT_FACTORY exists, then its value is assumed to be the provider
 *  factory class. This phase of the look up enables per-JVM override of the JAXB implementation.
 * 
 *  
 *  Look for /META-INF/services/javax.xml.bind.JAXBContext file in the associated classloader.
 *  This file follows the standard service descriptor convention, and if such a file exists, its content
 *  is assumed to be the provider factory class. This phase of the look up is for automatic discovery.
 *  It allows users to just put a JAXB implementation in a classpath and use it without any furhter configuration.
 * 
 *  
 *  Finally, if all the steps above fail, then the rest of the look up is unspecified. That said,
 *  the recommended behavior is to simply look for some hard-coded platform default JAXB implementation.
 *  This phase of the look up is so that JavaSE can have its own JAXB implementation as the last resort.
 *  
 * 
 *  
 *  Once the provider factory class is discovered, its
 *  public static JAXBContext createContext(String,ClassLoader,Map) method
 *  (see newInstance(String, ClassLoader, Map) for the parameter semantics.)
 *  or public static JAXBContext createContet(Class[],Map) method
 *  (see newInstance(Class[], Map) for the parameter semantics) are invoked
 *  to create a JAXBContext.
 */
abstract class JAXBContext extends Object {

    /** Creates a Binder for W3C DOM. */
    def createBinder(): Binder[Node]

    /** Creates a Binder object that can be used for
     *  associative/in-place unmarshalling/marshalling.
     */
    def createBinder[T](domType: Class[T]): Binder[T]

    /** Creates a JAXBIntrospector object that can be used to
     *  introspect JAXB objects.
     */
    def createJAXBIntrospector(): JAXBIntrospector

    /** Create a Marshaller object that can be used to convert a
     *  java content tree into XML data.
     */
    def createMarshaller(): Marshaller

    /** Create an Unmarshaller object that can be used to convert XML
     *  data into a java content tree.
     */
    def createUnmarshaller(): Unmarshaller

    /** Deprecated. 
     * since JAXB2.0
     * 
     */
    def createValidator(): Validator

    /** Generates the schema documents for this context. */
    def generateSchema(outputResolver: SchemaOutputResolver): Unit
}

object JAXBContext {
    /** 
     *  Obtain a new instance of a JAXBContext class.
     */
    @stub
    def newInstance(classesToBeBound: Class*): JAXBContext = ???

    /** 
     *  Obtain a new instance of a JAXBContext class.
     */
    @stub
    def newInstance(classesToBeBound: Array[Class], properties: Map[String, _]): JAXBContext = ???

    /** 
     *  Obtain a new instance of a JAXBContext class.
     */
    @stub
    def newInstance(contextPath: String): JAXBContext = ???

    /** 
     *  Obtain a new instance of a JAXBContext class.
     */
    @stub
    def newInstance(contextPath: String, classLoader: ClassLoader): JAXBContext = ???
}
