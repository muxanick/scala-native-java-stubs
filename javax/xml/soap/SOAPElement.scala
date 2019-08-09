package javax.xml.soap

import java.lang.String
import java.util.Iterator
import javax.xml.namespace.QName
import org.w3c.dom.Element

// An object representing an element of a SOAP message that is allowed but not
// specifically prescribed by a SOAP specification. This interface serves as the
// base interface for those objects that are specifically prescribed by a SOAP
// specification.
// 
// Methods in this interface that are required to return SAAJ specific objects
// may "silently" replace nodes in the tree as required to successfully return
// objects of the correct type. See getChildElements() and
// javax.xml.soap
// for details.
trait SOAPElement extends Node , Element {

    @stub
    // Adds an attribute with the specified name and value to this
    // SOAPElement object.
    def addAttribute(name: Name, value: String): SOAPElement = ???

    @stub
    // Adds an attribute with the specified name and value to this
    // SOAPElement object.
    def addAttribute(qname: QName, value: String): SOAPElement = ???

    @stub
    // Creates a new SOAPElement object initialized with the
    // given Name object and adds the new element to this
    // SOAPElement object.
    def addChildElement(name: Name): SOAPElement = ???

    @stub
    // Creates a new SOAPElement object initialized with the given
    // QName object and adds the new element to this SOAPElement
    //  object.
    def addChildElement(qname: QName): SOAPElement = ???

    @stub
    // Add a SOAPElement as a child of this
    // SOAPElement instance.
    def addChildElement(element: SOAPElement): SOAPElement = ???

    @stub
    // Creates a new SOAPElement object initialized with the
    // specified local name and adds the new element to this
    // SOAPElement object.
    def addChildElement(localName: String): SOAPElement = ???

    @stub
    // Creates a new SOAPElement object initialized with the
    // specified local name and prefix and adds the new element to this
    // SOAPElement object.
    def addChildElement(localName: String, prefix: String): SOAPElement = ???

    @stub
    // Creates a new SOAPElement object initialized with the
    // specified local name, prefix, and URI and adds the new element to this
    // SOAPElement object.
    def addChildElement(localName: String, prefix: String, uri: String): SOAPElement = ???

    @stub
    // Adds a namespace declaration with the specified prefix and URI to this
    // SOAPElement object.
    def addNamespaceDeclaration(prefix: String, uri: String): SOAPElement = ???

    @stub
    // Creates a new Text object initialized with the given
    // String and adds it to this SOAPElement object.
    def addTextNode(text: String): SOAPElement = ???

    @stub
    // Creates a QName whose namespace URI is the one associated
    // with the parameter, prefix, in the context of this
    // SOAPElement.
    def createQName(localName: String, prefix: String): QName = ???

    @stub
    // Returns an Iterator over all of the attribute
    // Name objects in this
    // SOAPElement object.
    def getAllAttributes(): Iterator = ???

    @stub
    // Returns an Iterator over all of the attributes
    // in this SOAPElement  as QName objects.
    def getAllAttributesAsQNames(): Iterator = ???

    @stub
    // Returns the value of the attribute with the specified name.
    def getAttributeValue(name: Name): String = ???

    @stub
    // Returns the value of the attribute with the specified qname.
    def getAttributeValue(qname: QName): String = ???

    @stub
    // Returns an Iterator over all the immediate child
    // Nodes of this element.
    def getChildElements(): Iterator = ???

    @stub
    // Returns an Iterator over all the immediate child
    // Nodes of this element with the specified name.
    def getChildElements(name: Name): Iterator = ???

    @stub
    // Returns an Iterator over all the immediate child
    // Nodes of this element with the specified qname.
    def getChildElements(qname: QName): Iterator = ???

    @stub
    // Returns the name of this SOAPElement object.
    def getElementName(): Name = ???

    @stub
    // Returns the qname of this SOAPElement object.
    def getElementQName(): QName = ???

    @stub
    // Returns the encoding style for this SOAPElement object.
    def getEncodingStyle(): String = ???

    @stub
    // Returns an Iterator over the namespace prefix
    // Strings declared by this element.
    def getNamespacePrefixes(): Iterator = ???

    @stub
    // Returns the URI of the namespace that has the given prefix.
    def getNamespaceURI(prefix: String): String = ???

    @stub
    // Returns an Iterator over the namespace prefix
    // Strings visible to this element.
    def getVisibleNamespacePrefixes(): Iterator = ???

    @stub
    // Removes the attribute with the specified name.
    def removeAttribute(name: Name): Boolean = ???

    @stub
    // Removes the attribute with the specified qname.
    def removeAttribute(qname: QName): Boolean = ???

    @stub
    // Detaches all children of this SOAPElement.
    def removeContents(): Unit = ???

    @stub
    // Removes the namespace declaration corresponding to the given prefix.
    def removeNamespaceDeclaration(prefix: String): Boolean = ???

    @stub
    // Changes the name of this Element to newName if
    // possible.
    def setElementQName(newName: QName): SOAPElement = ???
}
