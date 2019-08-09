package javax.xml.stream

import java.lang.{ClassLoader, Object, String}
import java.util.Iterator
import javax.xml.namespace.{NamespaceContext, QName}
import javax.xml.stream.events.{Attribute, Characters, Comment, DTD, EndDocument, EndElement, EntityDeclaration, EntityReference, Namespace, ProcessingInstruction, StartDocument, StartElement}
import scala.scalanative.annotation.stub

/** This interface defines a utility class for creating instances of
 *  XMLEvents
 */
abstract class XMLEventFactory extends Object {

    /**  */
    @stub
    protected def this() = ???

    /** Create a new Attribute */
    def createAttribute(name: QName, value: String): Attribute

    /** Create a new Attribute */
    def createAttribute(localName: String, value: String): Attribute

    /** Create a new Attribute */
    def createAttribute(prefix: String, namespaceURI: String, localName: String, value: String): Attribute

    /** Create a Characters event with the CData flag set to true */
    def createCData(content: String): Characters

    /** Create a Characters event, this method does not check if the content
     *  is all whitespace.
     */
    def createCharacters(content: String): Characters

    /** Create a comment */
    def createComment(text: String): Comment

    /** Create a document type definition event
     *  This string contains the entire document type declaration that matches
     *  the doctypedecl in the XML 1.0 specification
     */
    def createDTD(dtd: String): DTD

    /** Creates a new instance of an EndDocument event */
    def createEndDocument(): EndDocument

    /** Create a new EndElement */
    def createEndElement(name: QName, namespaces: Iterator): EndElement

    /** Create a new EndElement */
    def createEndElement(prefix: String, namespaceUri: String, localName: String): EndElement

    /** Create a new EndElement */
    def createEndElement(prefix: String, namespaceUri: String, localName: String, namespaces: Iterator): EndElement

    /** Creates a new instance of a EntityReference event */
    def createEntityReference(name: String, declaration: EntityDeclaration): EntityReference

    /** Create an ignorable space */
    def createIgnorableSpace(content: String): Characters

    /** Create a new default Namespace */
    def createNamespace(namespaceURI: String): Namespace

    /** Create a new Namespace */
    def createNamespace(prefix: String, namespaceUri: String): Namespace

    /** Create a processing instruction */
    def createProcessingInstruction(target: String, data: String): ProcessingInstruction

    /** Create a Characters event with the isSpace flag set to true */
    def createSpace(content: String): Characters

    /** Creates a new instance of a StartDocument event */
    def createStartDocument(): StartDocument

    /** Creates a new instance of a StartDocument event */
    def createStartDocument(encoding: String): StartDocument

    /** Creates a new instance of a StartDocument event */
    def createStartDocument(encoding: String, version: String): StartDocument

    /** Creates a new instance of a StartDocument event */
    def createStartDocument(encoding: String, version: String, standalone: Boolean): StartDocument

    /** Create a new StartElement. */
    def createStartElement(name: QName, attributes: Iterator, namespaces: Iterator): StartElement

    /** Create a new StartElement. */
    def createStartElement(prefix: String, namespaceUri: String, localName: String): StartElement

    /** Create a new StartElement. */
    def createStartElement(prefix: String, namespaceUri: String, localName: String, attributes: Iterator, namespaces: Iterator): StartElement

    /** Create a new StartElement. */
    def createStartElement(prefix: String, namespaceUri: String, localName: String, attributes: Iterator, namespaces: Iterator, context: NamespaceContext): StartElement

    /** This method allows setting of the Location on each event that
     *  is created by this factory.
     */
    def setLocation(location: Location): Unit
}

object XMLEventFactory {
    /** Create a new instance of the factory. */
    @stub
    def newFactory(): XMLEventFactory = ???

    /** Create a new instance of the factory. */
    @stub
    def newFactory(factoryId: String, classLoader: ClassLoader): XMLEventFactory = ???

    /** Creates a new instance of the factory in exactly the same manner as the
     *  newFactory() method.
     */
    @stub
    def newInstance(): XMLEventFactory = ???

    /** Deprecated. 
     * This method has been deprecated to maintain API consistency.
     *               All newInstance methods have been replaced with corresponding
     *               newFactory methods. The replacement newFactory(java.lang.String, java.lang.ClassLoader)
     *               method defines no changes in behavior.
     * 
     */
    @stub
    def newInstance(factoryId: String, classLoader: ClassLoader): XMLEventFactory = ???
}
