package javax.imageio.metadata

import java.lang.{Object, String}
import org.w3c.dom.{Attr, Document, Element, NamedNodeMap, Node, NodeList, TypeInfo, UserDataHandler}

// A class representing a node in a meta-data tree, which implements
// the 
// org.w3c.dom.Element interface and additionally allows
// for the storage of non-textual objects via the
// getUserObject and setUserObject methods.
//
//  This class is not intended to be used for general XML
// processing. In particular, Element nodes created
// within the Image I/O API are not compatible with those created by
// Sun's standard implementation of the org.w3.dom API.
// In particular, the implementation is tuned for simple uses and may
// not perform well for intensive processing.
//
//  Namespaces are ignored in this implementation.  The terms "tag
// name" and "node name" are always considered to be synonymous.
//
// Note:
// The DOM Level 3 specification added a number of new methods to the
// Node, Element and Attr interfaces that are not
// of value to the IIOMetadataNode implementation or specification.
//
// Calling such methods on an IIOMetadataNode, or an Attr
// instance returned from an IIOMetadataNode will result in a
// DOMException being thrown.
class IIOMetadataNode extends Object with Element, with NodeList {

    @stub
    // Constructs an empty IIOMetadataNode.
    def this() = ???

    @stub
    // Adds the node newChild to the end of the list of
    // children of this node.
    def appendChild(newChild: Node): Node = ???

    @stub
    // Returns a duplicate of this node.
    def cloneNode(deep: Boolean): Node = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def compareDocumentPosition(other: Node): Short = ???

    @stub
    // Retrieves an attribute value by name.
    def getAttribute(name: String): String = ???

    @stub
    // Retrieves an attribute node by name.
    def getAttributeNode(name: String): Attr = ???

    @stub
    // Equivalent to getAttributeNode(localName).
    def getAttributeNodeNS(namespaceURI: String, localName: String): Attr = ???

    @stub
    // Equivalent to getAttribute(localName).
    def getAttributeNS(namespaceURI: String, localName: String): String = ???

    @stub
    // Returns a NamedNodeMap containing the attributes of
    // this node.
    def getAttributes(): NamedNodeMap = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def getBaseURI(): String = ???

    @stub
    // Returns a NodeList that contains all children of this node.
    def getChildNodes(): NodeList = ???

    @stub
    // Returns a NodeList of all descendant Elements
    // with a given tag name, in document order.
    def getElementsByTagName(name: String): NodeList = ???

    @stub
    // Equivalent to getElementsByTagName(localName).
    def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def getFeature(feature: String, version: String): Object = ???

    @stub
    // Returns the first child of this node, or null if
    // the node has no children.
    def getFirstChild(): Node = ???

    @stub
    // Returns the last child of this node, or null if
    // the node has no children.
    def getLastChild(): Node = ???

    @stub
    // The number of nodes in the list.
    def getLength(): Int = ???

    @stub
    // Equivalent to getNodeName.
    def getLocalName(): String = ???

    @stub
    // Returns null, since namespaces are not supported.
    def getNamespaceURI(): String = ???

    @stub
    // Returns the next sibling of this node, or null if
    // the node has no next sibling.
    def getNextSibling(): Node = ???

    @stub
    // Returns the node name associated with this node.
    def getNodeName(): String = ???

    @stub
    // Returns the node type, which is always
    // ELEMENT_NODE.
    def getNodeType(): Short = ???

    @stub
    // Returns the value associated with this node.
    def getNodeValue(): String = ???

    @stub
    // Returns null, since IIOMetadataNodes
    // do not belong to any Document.
    def getOwnerDocument(): Document = ???

    @stub
    // Returns the parent of this node.
    def getParentNode(): Node = ???

    @stub
    // Returns null, since namespaces are not supported.
    def getPrefix(): String = ???

    @stub
    // Returns the previous sibling of this node, or null
    // if this node has no previous sibling.
    def getPreviousSibling(): Node = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def getSchemaTypeInfo(): TypeInfo = ???

    @stub
    // Equivalent to getNodeName.
    def getTagName(): String = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def getTextContent(): String = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def getUserData(key: String): Object = ???

    @stub
    // Returns the Object value associated with this node.
    def getUserObject(): Object = ???

    @stub
    // Returns true when an attribute with a given name is
    // specified on this element or has a default value, false
    // otherwise.
    def hasAttribute(name: String): Boolean = ???

    @stub
    // Equivalent to hasAttribute(localName).
    def hasAttributeNS(namespaceURI: String, localName: String): Boolean = ???

    @stub
    // Returns whether this node (if it is an element) has any attributes.
    def hasAttributes(): Boolean = ???

    @stub
    // Returns true if this node has child nodes.
    def hasChildNodes(): Boolean = ???

    @stub
    // Inserts the node newChild before the existing
    // child node refChild.
    def insertBefore(newChild: Node, refChild: Node): Node = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def isDefaultNamespace(namespaceURI: String): Boolean = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def isEqualNode(node: Node): Boolean = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def isSameNode(node: Node): Boolean = ???

    @stub
    // Returns false since DOM features are not
    // supported.
    def isSupported(feature: String, version: String): Boolean = ???

    @stub
    // Returns the indexth item in the collection.
    def item(index: Int): Node = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def lookupNamespaceURI(prefix: String): String = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def lookupPrefix(namespaceURI: String): String = ???

    @stub
    // Does nothing, since IIOMetadataNodes do not
    // contain Text children.
    def normalize(): Unit = ???

    @stub
    // Removes an attribute by name.
    def removeAttribute(name: String): Unit = ???

    @stub
    // Removes the specified attribute node.
    def removeAttributeNode(oldAttr: Attr): Attr = ???

    @stub
    // Equivalent to removeAttribute(localName).
    def removeAttributeNS(namespaceURI: String, localName: String): Unit = ???

    @stub
    // Removes the child node indicated by oldChild from
    // the list of children, and returns it.
    def removeChild(oldChild: Node): Node = ???

    @stub
    // Replaces the child node oldChild with
    // newChild in the list of children, and returns the
    // oldChild node.
    def replaceChild(newChild: Node, oldChild: Node): Node = ???

    @stub
    // Adds a new attribute.
    def setAttribute(name: String, value: String): Unit = ???

    @stub
    // Adds a new attribute node.
    def setAttributeNode(newAttr: Attr): Attr = ???

    @stub
    // Equivalent to setAttributeNode(newAttr).
    def setAttributeNodeNS(newAttr: Attr): Attr = ???

    @stub
    // Equivalent to setAttribute(qualifiedName, value).
    def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def setIdAttribute(name: String, isId: Boolean): Unit = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def setIdAttributeNode(idAttr: Attr, isId: Boolean): Unit = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def setIdAttributeNS(namespaceURI: String, localName: String, isId: Boolean): Unit = ???

    @stub
    // Sets the String value associated with this node.
    def setNodeValue(nodeValue: String): Unit = ???

    @stub
    // Does nothing, since namespaces are not supported.
    def setPrefix(prefix: String): Unit = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def setTextContent(textContent: String): Unit = ???

    @stub
    // This DOM Level 3 method is not supported for IIOMetadataNode
    // and will throw a DOMException.
    def setUserData(key: String, data: Object, handler: UserDataHandler): Object = ???
}
