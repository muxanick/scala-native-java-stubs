package javax.xml.stream

import java.io.{OutputStream, Writer}
import java.lang.{ClassLoader, Object, String}
import javax.xml.transform.Result
import scala.scalanative.annotation.stub

/** Defines an abstract implementation of a factory for
 *  getting XMLEventWriters and XMLStreamWriters.
 * 
 *  The following table defines the standard properties of this specification.
 *  Each property varies in the level of support required by each implementation.
 *  The level of support required is described in the 'Required' column.
 * 
 *      
 *      
 *       
 *         
 *           Configuration parameters
 *         
 *       
 *     
 *     
 *       
 *         Property Name
 *         Behavior
 *         Return type
 *         Default Value
 *         Required
 *               
 *          javax.xml.stream.isRepairingNamespacesdefaults prefixes on the output sideBooleanFalseYes
 *       
 *    
 * 
 *  The following paragraphs describe the namespace and prefix repair algorithm:
 * 
 *  The property can be set with the following code line:
 *  setProperty("javax.xml.stream.isRepairingNamespaces",new Boolean(true|false));
 * 
 *  This property specifies that the writer default namespace prefix declarations.
 *  The default value is false. 
 * 
 *  If a writer isRepairingNamespaces it will create a namespace declaration
 *  on the current StartElement for
 *  any attribute that does not
 *  currently have a namespace declaration in scope.  If the StartElement
 *  has a uri but no prefix specified a prefix will be assigned, if the prefix
 *  has not been declared in a parent of the current StartElement it will be declared
 *  on the current StartElement.  If the defaultNamespace is bound and in scope
 *  and the default namespace matches the URI of the attribute or StartElement
 *  QName no prefix will be assigned.
 * 
 *  If an element or attribute name has a prefix, but is not
 *  bound to any namespace URI, then the prefix will be removed
 *  during serialization.
 * 
 *  If element and/or attribute names in the same start or
 *  empty-element tag are bound to different namespace URIs and
 *  are using the same prefix then the element or the first
 *  occurring attribute retains the original prefix and the
 *  following attributes have their prefixes replaced with a
 *  new prefix that is bound to the namespace URIs of those
 *  attributes. 
 * 
 *  If an element or attribute name uses a prefix that is
 *  bound to a different URI than that inherited from the
 *  namespace context of the parent of that element and there
 *  is no namespace declaration in the context of the current
 *  element then such a namespace declaration is added. 
 * 
 *  If an element or attribute name is bound to a prefix and
 *  there is a namespace declaration that binds that prefix
 *  to a different URI then that namespace declaration is
 *  either removed if the correct mapping is inherited from
 *  the parent context of that element, or changed to the
 *  namespace URI of the element or attribute using that prefix.
 */
abstract class XMLOutputFactory extends Object {

    /**  */
    @stub
    protected def this() = ???

    /** Create a new XMLEventWriter that writes to a stream */
    def createXMLEventWriter(stream: OutputStream): XMLEventWriter

    /** Create a new XMLEventWriter that writes to a stream */
    def createXMLEventWriter(stream: OutputStream, encoding: String): XMLEventWriter

    /** Create a new XMLEventWriter that writes to a JAXP result. */
    def createXMLEventWriter(result: Result): XMLEventWriter

    /** Create a new XMLEventWriter that writes to a writer */
    def createXMLEventWriter(stream: Writer): XMLEventWriter

    /** Create a new XMLStreamWriter that writes to a stream */
    def createXMLStreamWriter(stream: OutputStream): XMLStreamWriter

    /** Create a new XMLStreamWriter that writes to a stream */
    def createXMLStreamWriter(stream: OutputStream, encoding: String): XMLStreamWriter

    /** Create a new XMLStreamWriter that writes to a JAXP result. */
    def createXMLStreamWriter(result: Result): XMLStreamWriter

    /** Create a new XMLStreamWriter that writes to a writer */
    def createXMLStreamWriter(stream: Writer): XMLStreamWriter

    /** Get a feature/property on the underlying implementation */
    def getProperty(name: String): Any

    /** Query the set of properties that this factory supports. */
    def isPropertySupported(name: String): Boolean

    /** Allows the user to set specific features/properties on the underlying implementation. */
    def setProperty(name: String, value: Any): Unit
}

object XMLOutputFactory {
    /** Property used to set prefix defaulting on the output side */
    @stub
    val IS_REPAIRING_NAMESPACES: String = ???

    /** Create a new instance of the factory. */
    @stub
    def newFactory(): XMLOutputFactory = ???

    /** Create a new instance of the factory. */
    @stub
    def newFactory(factoryId: String, classLoader: ClassLoader): XMLOutputFactory = ???

    /** Creates a new instance of the factory in exactly the same manner as the
     *  newFactory() method.
     */
    @stub
    def newInstance(): XMLOutputFactory = ???

    /** Deprecated. 
     * This method has been deprecated because it returns an
     *               instance of XMLInputFactory, which is of the wrong class.
     *               Use the new method newFactory(java.lang.String,
     *               java.lang.ClassLoader) instead.
     * 
     */
    @stub
    def newInstance(factoryId: String, classLoader: ClassLoader): XMLInputFactory = ???
}
