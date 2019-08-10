package javax.xml.validation

import java.io.File
import java.lang.{ClassLoader, Object, String}
import java.net.URL
import javax.xml.transform.Source
import scala.scalanative.annotation.stub

/** Factory that creates Schema objects. Entry-point to
 *  the validation API.
 * 
 *  
 *  SchemaFactory is a schema compiler. It reads external
 *  representations of schemas and prepares them for validation.
 * 
 *  
 *  The SchemaFactory class is not thread-safe. In other words,
 *  it is the application's responsibility to ensure that at most
 *  one thread is using a SchemaFactory object at any
 *  given moment. Implementations are encouraged to mark methods
 *  as synchronized to protect themselves from broken clients.
 * 
 *  
 *  SchemaFactory is not re-entrant. While one of the
 *  newSchema methods is being invoked, applications
 *  may not attempt to recursively invoke the newSchema method,
 *  even from the same thread.
 * 
 *  Schema Language
 *  
 *  This spec uses a namespace URI to designate a schema language.
 *  The following table shows the values defined by this specification.
 *  
 *  To be compliant with the spec, the implementation
 *  is only required to support W3C XML Schema 1.0. However,
 *  if it chooses to support other schema languages listed here,
 *  it must conform to the relevant behaviors described in this spec.
 * 
 *  
 *  Schema languages not listed here are expected to
 *  introduce their own URIs to represent themselves.
 *  The SchemaFactory class is capable of locating other
 *  implementations for other schema languages at run-time.
 * 
 *  
 *  Note that because the XML DTD is strongly tied to the parsing process
 *  and has a significant effect on the parsing process, it is impossible
 *  to define the DTD validation as a process independent from parsing.
 *  For this reason, this specification does not define the semantics for
 *  the XML DTD. This doesn't prohibit implementors from implementing it
 *  in a way they see fit, but users are warned that any DTD
 *  validation implemented on this interface necessarily deviate from
 *  the XML DTD semantics as defined in the XML 1.0.
 * 
 *  
 *    
 *      
 *        value
 *        language
 *      
 *    
 *    
 *      
 *        XMLConstants.W3C_XML_SCHEMA_NS_URI ("http://www.w3.org/2001/XMLSchema")
 *        W3C XML Schema 1.0
 *      
 *      
 *        XMLConstants.RELAXNG_NS_URI ("http://relaxng.org/ns/structure/1.0")
 *        RELAX NG 1.0
 *      
 *    
 *  
 */
abstract class SchemaFactory extends Object {

    /** Constructor for derived classes. */
    @stub
    protected def this() = ???

    /** Gets the current ErrorHandler set to this SchemaFactory. */
    def getErrorHandler(): ErrorHandler

    /** Look up the value of a feature flag. */
    def getFeature(name: String): Boolean

    /** Look up the value of a property. */
    def getProperty(name: String): Any

    /** Gets the current LSResourceResolver set to this SchemaFactory. */
    def getResourceResolver(): LSResourceResolver

    /** Is specified schema supported by this SchemaFactory? */
    def isSchemaLanguageSupported(schemaLanguage: String): Boolean

    /** Creates a special Schema object. */
    def newSchema(): Schema

    /** Parses the specified File as a schema and returns it as a Schema. */
    def newSchema(schema: File): Schema

    /** Parses the specified source as a schema and returns it as a schema. */
    def newSchema(schema: Source): Schema

    /** Parses the specified source(s) as a schema and returns it as a schema. */
    def newSchema(schemas: Array[Source]): Schema

    /** Parses the specified URL as a schema and returns it as a Schema. */
    def newSchema(schema: URL): Schema

    /** Sets the ErrorHandler to receive errors encountered
     *  during the newSchema method invocation.
     */
    def setErrorHandler(errorHandler: ErrorHandler): Unit

    /** Set a feature for this SchemaFactory,
     *  Schemas created by this factory, and by extension,
     *  Validators and ValidatorHandlers created by
     *  those Schemas.
     */
    def setFeature(name: String, value: Boolean): Unit

    /** Set the value of a property. */
    def setProperty(name: String, object: Any): Unit

    /** Sets the LSResourceResolver to customize
     *  resource resolution when parsing schemas.
     */
    def setResourceResolver(resourceResolver: LSResourceResolver): Unit
}

object SchemaFactory {
    /** Lookup an implementation of the SchemaFactory that supports the specified
     *  schema language and return it.
     */
    @stub
    def newInstance(schemaLanguage: String): SchemaFactory = ???

    /** Obtain a new instance of a SchemaFactory from class name. */
    @stub
    def newInstance(schemaLanguage: String, factoryClassName: String, classLoader: ClassLoader): SchemaFactory = ???
}
