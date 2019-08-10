package javax.imageio.metadata

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A class representing a node in a meta-data tree, which implements
 *  the 
 *  org.w3c.dom.Element interface and additionally allows
 *  for the storage of non-textual objects via the
 *  getUserObject and setUserObject methods.
 * 
 *   This class is not intended to be used for general XML
 *  processing. In particular, Element nodes created
 *  within the Image I/O API are not compatible with those created by
 *  Sun's standard implementation of the org.w3.dom API.
 *  In particular, the implementation is tuned for simple uses and may
 *  not perform well for intensive processing.
 * 
 *   Namespaces are ignored in this implementation.  The terms "tag
 *  name" and "node name" are always considered to be synonymous.
 * 
 *  Note:
 *  The DOM Level 3 specification added a number of new methods to the
 *  Node, Element and Attr interfaces that are not
 *  of value to the IIOMetadataNode implementation or specification.
 * 
 *  Calling such methods on an IIOMetadataNode, or an Attr
 *  instance returned from an IIOMetadataNode will result in a
 *  DOMException being thrown.
 */
class IIOMetadataNode extends Object with Element with NodeList {

    /** Constructs an empty IIOMetadataNode. */
    @stub
    def this() = ???

    /** Constructs an IIOMetadataNode with a given node
     *  name.
     */
    @stub
    def this(nodeName: String) = ???

    /** Adds the node newChild to the end of the list of
     *  children of this node.
     */
    @stub
    def appendChild(newChild: Node): Node = ???

    /** Returns a duplicate of this node. */
    @stub
    def cloneNode(deep: Boolean): Node = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def compareDocumentPosition(other: Node): Short = ???

    /** Retrieves an attribute value by name. */
    @stub
    def getAttribute(name: String): String = ???

    /** Retrieves an attribute node by name. */
    @stub
    def getAttributeNode(name: String): Attr = ???

    /** Equivalent to getAttributeNode(localName). */
    @stub
    def getAttributeNodeNS(namespaceURI: String, localName: String): Attr = ???

    /** Equivalent to getAttribute(localName). */
    @stub
    def getAttributeNS(namespaceURI: String, localName: String): String = ???

    /** Returns a NamedNodeMap containing the attributes of
     *  this node.
     */
    @stub
    def getAttributes(): NamedNodeMap = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def getBaseURI(): String = ???

    /** Returns a NodeList that contains all children of this node. */
    @stub
    def getChildNodes(): NodeList = ???

    /** Returns a NodeList of all descendant Elements
     *  with a given tag name, in document order.
     */
    @stub
    def getElementsByTagName(name: String): NodeList = ???

    /** Equivalent to getElementsByTagName(localName). */
    @stub
    def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def getFeature(feature: String, version: String): Any = ???

    /** Returns the first child of this node, or null if
     *  the node has no children.
     */
    @stub
    def getFirstChild(): Node = ???

    /** Returns the last child of this node, or null if
     *  the node has no children.
     */
    @stub
    def getLastChild(): Node = ???

    /** The number of nodes in the list. */
    @stub
    def getLength(): Int = ???

    /** Equivalent to getNodeName. */
    @stub
    def getLocalName(): String = ???

    /** Returns null, since namespaces are not supported. */
    @stub
    def getNamespaceURI(): String = ???

    /** Returns the next sibling of this node, or null if
     *  the node has no next sibling.
     */
    @stub
    def getNextSibling(): Node = ???

    /** Returns the node name associated with this node. */
    @stub
    def getNodeName(): String = ???

    /** Returns the node type, which is always
     *  ELEMENT_NODE.
     */
    @stub
    def getNodeType(): Short = ???

    /** Returns the value associated with this node. */
    @stub
    def getNodeValue(): String = ???

    /** Returns null, since IIOMetadataNodes
     *  do not belong to any Document.
     */
    @stub
    def getOwnerDocument(): Document = ???

    /** Returns the parent of this node. */
    @stub
    def getParentNode(): Node = ???

    /** Returns null, since namespaces are not supported. */
    @stub
    def getPrefix(): String = ???

    /** Returns the previous sibling of this node, or null
     *  if this node has no previous sibling.
     */
    @stub
    def getPreviousSibling(): Node = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def getSchemaTypeInfo(): TypeInfo = ???

    /** Equivalent to getNodeName. */
    @stub
    def getTagName(): String = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def getTextContent(): String = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def getUserData(key: String): Any = ???

    /** Returns the Object value associated with this node. */
    @stub
    def getUserObject(): Any = ???

    /** Returns true when an attribute with a given name is
     *  specified on this element or has a default value, false
     *  otherwise.
     */
    @stub
    def hasAttribute(name: String): Boolean = ???

    /** Equivalent to hasAttribute(localName). */
    @stub
    def hasAttributeNS(namespaceURI: String, localName: String): Boolean = ???

    /** Returns whether this node (if it is an element) has any attributes. */
    @stub
    def hasAttributes(): Boolean = ???

    /** Returns true if this node has child nodes. */
    @stub
    def hasChildNodes(): Boolean = ???

    /** Inserts the node newChild before the existing
     *  child node refChild.
     */
    @stub
    def insertBefore(newChild: Node, refChild: Node): Node = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def isDefaultNamespace(namespaceURI: String): Boolean = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def isEqualNode(node: Node): Boolean = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def isSameNode(node: Node): Boolean = ???

    /** Returns false since DOM features are not
     *  supported.
     */
    @stub
    def isSupported(feature: String, version: String): Boolean = ???

    /** Returns the indexth item in the collection. */
    @stub
    def item(index: Int): Node = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def lookupNamespaceURI(prefix: String): String = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def lookupPrefix(namespaceURI: String): String = ???

    /** Does nothing, since IIOMetadataNodes do not
     *  contain Text children.
     */
    @stub
    def normalize(): Unit = ???

    /** Removes an attribute by name. */
    @stub
    def removeAttribute(name: String): Unit = ???

    /** Removes the specified attribute node. */
    @stub
    def removeAttributeNode(oldAttr: Attr): Attr = ???

    /** Equivalent to removeAttribute(localName). */
    @stub
    def removeAttributeNS(namespaceURI: String, localName: String): Unit = ???

    /** Removes the child node indicated by oldChild from
     *  the list of children, and returns it.
     */
    @stub
    def removeChild(oldChild: Node): Node = ???

    /** Replaces the child node oldChild with
     *  newChild in the list of children, and returns the
     *  oldChild node.
     */
    @stub
    def replaceChild(newChild: Node, oldChild: Node): Node = ???

    /** Adds a new attribute. */
    @stub
    def setAttribute(name: String, value: String): Unit = ???

    /** Adds a new attribute node. */
    @stub
    def setAttributeNode(newAttr: Attr): Attr = ???

    /** Equivalent to setAttributeNode(newAttr). */
    @stub
    def setAttributeNodeNS(newAttr: Attr): Attr = ???

    /** Equivalent to setAttribute(qualifiedName, value). */
    @stub
    def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def setIdAttribute(name: String, isId: Boolean): Unit = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def setIdAttributeNode(idAttr: Attr, isId: Boolean): Unit = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def setIdAttributeNS(namespaceURI: String, localName: String, isId: Boolean): Unit = ???

    /** Sets the String value associated with this node. */
    @stub
    def setNodeValue(nodeValue: String): Unit = ???

    /** Does nothing, since namespaces are not supported. */
    @stub
    def setPrefix(prefix: String): Unit = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def setTextContent(textContent: String): Unit = ???

    /** This DOM Level 3 method is not supported for IIOMetadataNode
     *  and will throw a DOMException.
     */
    @stub
    def setUserData(key: String, data: Any, handler: UserDataHandler): Any = ???

    /** Sets the value associated with this node. */
    @stub
    def setUserObject(userObject: Any): Unit = ???
}
