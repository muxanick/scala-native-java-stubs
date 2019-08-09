package javax.xml.soap

import java.lang.String
import java.util.Iterator
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** An object representing an element of a SOAP message that is allowed but not
 *  specifically prescribed by a SOAP specification. This interface serves as the
 *  base interface for those objects that are specifically prescribed by a SOAP
 *  specification.
 *  
 *  Methods in this interface that are required to return SAAJ specific objects
 *  may "silently" replace nodes in the tree as required to successfully return
 *  objects of the correct type. See getChildElements() and
 *  javax.xml.soap
 *  for details.
 */
trait SOAPElement extends Node with Element {

    /** Adds an attribute with the specified name and value to this
     *  SOAPElement object.
     */
    @stub
    def addAttribute(name: Name, value: String): SOAPElement = ???

    /** Adds an attribute with the specified name and value to this
     *  SOAPElement object.
     */
    @stub
    def addAttribute(qname: QName, value: String): SOAPElement = ???

    /** Creates a new SOAPElement object initialized with the
     *  given Name object and adds the new element to this
     *  SOAPElement object.
     */
    @stub
    def addChildElement(name: Name): SOAPElement = ???

    /** Creates a new SOAPElement object initialized with the given
     *  QName object and adds the new element to this SOAPElement
     *   object.
     */
    @stub
    def addChildElement(qname: QName): SOAPElement = ???

    /** Add a SOAPElement as a child of this
     *  SOAPElement instance.
     */
    @stub
    def addChildElement(element: SOAPElement): SOAPElement = ???

    /** Creates a new SOAPElement object initialized with the
     *  specified local name and adds the new element to this
     *  SOAPElement object.
     */
    @stub
    def addChildElement(localName: String): SOAPElement = ???

    /** Creates a new SOAPElement object initialized with the
     *  specified local name and prefix and adds the new element to this
     *  SOAPElement object.
     */
    @stub
    def addChildElement(localName: String, prefix: String): SOAPElement = ???

    /** Creates a new SOAPElement object initialized with the
     *  specified local name, prefix, and URI and adds the new element to this
     *  SOAPElement object.
     */
    @stub
    def addChildElement(localName: String, prefix: String, uri: String): SOAPElement = ???

    /** Adds a namespace declaration with the specified prefix and URI to this
     *  SOAPElement object.
     */
    @stub
    def addNamespaceDeclaration(prefix: String, uri: String): SOAPElement = ???

    /** Creates a new Text object initialized with the given
     *  String and adds it to this SOAPElement object.
     */
    @stub
    def addTextNode(text: String): SOAPElement = ???

    /** Creates a QName whose namespace URI is the one associated
     *  with the parameter, prefix, in the context of this
     *  SOAPElement.
     */
    @stub
    def createQName(localName: String, prefix: String): QName = ???

    /** Returns an Iterator over all of the attribute
     *  Name objects in this
     *  SOAPElement object.
     */
    @stub
    def getAllAttributes(): Iterator = ???

    /** Returns an Iterator over all of the attributes
     *  in this SOAPElement  as QName objects.
     */
    @stub
    def getAllAttributesAsQNames(): Iterator = ???

    /** Returns the value of the attribute with the specified name. */
    @stub
    def getAttributeValue(name: Name): String = ???

    /** Returns the value of the attribute with the specified qname. */
    @stub
    def getAttributeValue(qname: QName): String = ???

    /** Returns an Iterator over all the immediate child
     *  Nodes of this element.
     */
    @stub
    def getChildElements(): Iterator = ???

    /** Returns an Iterator over all the immediate child
     *  Nodes of this element with the specified name.
     */
    @stub
    def getChildElements(name: Name): Iterator = ???

    /** Returns an Iterator over all the immediate child
     *  Nodes of this element with the specified qname.
     */
    @stub
    def getChildElements(qname: QName): Iterator = ???

    /** Returns the name of this SOAPElement object. */
    @stub
    def getElementName(): Name = ???

    /** Returns the qname of this SOAPElement object. */
    @stub
    def getElementQName(): QName = ???

    /** Returns the encoding style for this SOAPElement object. */
    @stub
    def getEncodingStyle(): String = ???

    /** Returns an Iterator over the namespace prefix
     *  Strings declared by this element.
     */
    @stub
    def getNamespacePrefixes(): Iterator = ???

    /** Returns the URI of the namespace that has the given prefix. */
    @stub
    def getNamespaceURI(prefix: String): String = ???

    /** Returns an Iterator over the namespace prefix
     *  Strings visible to this element.
     */
    @stub
    def getVisibleNamespacePrefixes(): Iterator = ???

    /** Removes the attribute with the specified name. */
    @stub
    def removeAttribute(name: Name): Boolean = ???

    /** Removes the attribute with the specified qname. */
    @stub
    def removeAttribute(qname: QName): Boolean = ???

    /** Detaches all children of this SOAPElement. */
    @stub
    def removeContents(): Unit = ???

    /** Removes the namespace declaration corresponding to the given prefix. */
    @stub
    def removeNamespaceDeclaration(prefix: String): Boolean = ???

    /** Changes the name of this Element to newName if
     *  possible.
     */
    @stub
    def setElementQName(newName: QName): SOAPElement = ???

    /** Sets the encoding style for this SOAPElement object
     *  to one specified.
     */
    @stub
    def setEncodingStyle(encodingStyle: String): Unit = ???
}
