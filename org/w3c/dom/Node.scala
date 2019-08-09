package org.w3c.dom

import java.lang.{Object, String}

// The Node interface is the primary datatype for the entire
// Document Object Model. It represents a single node in the document tree.
// While all objects implementing the Node interface expose
// methods for dealing with children, not all objects implementing the
// Node interface may have children. For example,
// Text nodes may not have children, and adding children to
// such nodes results in a DOMException being raised.
// The attributes nodeName, nodeValue and
// attributes are included as a mechanism to get at node
// information without casting down to the specific derived interface. In
// cases where there is no obvious mapping of these attributes for a
// specific nodeType (e.g., nodeValue for an
// Element or attributes for a Comment
// ), this returns null. Note that the specialized interfaces
// may contain additional and more convenient mechanisms to get and set the
// relevant information.
// The values of nodeName,
// nodeValue, and attributes vary according to the
// node type as follows:
// 
// 
// Interface
// nodeName
// nodeValue
// attributes
// 
// 
// 
// Attr
// same as Attr.name
// same as
// Attr.value
// null
// 
// 
// CDATASection
// 
// "#cdata-section"
// same as CharacterData.data, the
// content of the CDATA Section
// null
// 
// 
// Comment
// 
// "#comment"
// same as CharacterData.data, the
// content of the comment
// null
// 
// 
// Document
// 
// "#document"
// null
// null
// 
// 
// 
// DocumentFragment
// "#document-fragment"
// 
// null
// null
// 
// 
// DocumentType
// same as
// DocumentType.name
// null
// null
// 
// 
// 
// Element
// same as Element.tagName
// null
// 
// NamedNodeMap
// 
// 
// Entity
// entity name
// null
// 
// null
// 
// 
// EntityReference
// name of entity referenced
// 
// null
// null
// 
// 
// Notation
// notation name
// 
// null
// null
// 
// 
// ProcessingInstruction
// same
// as ProcessingInstruction.target
// same as
// ProcessingInstruction.data
// null
// 
// 
// Text
// 
// "#text"
// same as CharacterData.data, the content
// of the text node
// null
// 
// 
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait Node {

    @stub
    // Adds the node newChild to the end of the list of children
    // of this node.
    def appendChild(newChild: Node): Node = ???

    @stub
    // Returns a duplicate of this node, i.e., serves as a generic copy
    // constructor for nodes.
    def cloneNode(deep: Boolean): Node = ???

    @stub
    // Compares the reference node, i.e.
    def compareDocumentPosition(other: Node): Short = ???

    @stub
    // A NamedNodeMap containing the attributes of this node (if
    // it is an Element) or null otherwise.
    def getAttributes(): NamedNodeMap = ???

    @stub
    // The absolute base URI of this node or null if the
    // implementation wasn't able to obtain an absolute URI.
    def getBaseURI(): String = ???

    @stub
    // A NodeList that contains all children of this node.
    def getChildNodes(): NodeList = ???

    @stub
    // This method returns a specialized object which implements the
    // specialized APIs of the specified feature and version, as specified
    // in .
    def getFeature(feature: String, version: String): Object = ???

    @stub
    // The first child of this node.
    def getFirstChild(): Node = ???

    @stub
    // The last child of this node.
    def getLastChild(): Node = ???

    @stub
    // Returns the local part of the qualified name of this node.
    def getLocalName(): String = ???

    @stub
    // The namespace URI of this node, or null if it is
    // unspecified (see ).
    def getNamespaceURI(): String = ???

    @stub
    // The node immediately following this node.
    def getNextSibling(): Node = ???

    @stub
    // The name of this node, depending on its type; see the table above.
    def getNodeName(): String = ???

    @stub
    // A code representing the type of the underlying object, as defined above.
    def getNodeType(): Short = ???

    @stub
    // The value of this node, depending on its type; see the table above.
    def getNodeValue(): String = ???

    @stub
    // The Document object associated with this node.
    def getOwnerDocument(): Document = ???

    @stub
    // The parent of this node.
    def getParentNode(): Node = ???

    @stub
    // The namespace prefix of this node, or null if it is
    // unspecified.
    def getPrefix(): String = ???

    @stub
    // The node immediately preceding this node.
    def getPreviousSibling(): Node = ???

    @stub
    // This attribute returns the text content of this node and its
    // descendants.
    def getTextContent(): String = ???

    @stub
    // Retrieves the object associated to a key on a this node.
    def getUserData(key: String): Object = ???

    @stub
    // Returns whether this node (if it is an element) has any attributes.
    def hasAttributes(): Boolean = ???

    @stub
    // Returns whether this node has any children.
    def hasChildNodes(): Boolean = ???

    @stub
    // Inserts the node newChild before the existing child node
    // refChild.
    def insertBefore(newChild: Node, refChild: Node): Node = ???

    @stub
    // This method checks if the specified namespaceURI is the
    // default namespace or not.
    def isDefaultNamespace(namespaceURI: String): Boolean = ???

    @stub
    // Tests whether two nodes are equal.
    def isEqualNode(arg: Node): Boolean = ???

    @stub
    // Returns whether this node is the same node as the given one.
    def isSameNode(other: Node): Boolean = ???

    @stub
    // Tests whether the DOM implementation implements a specific feature and
    // that feature is supported by this node, as specified in .
    def isSupported(feature: String, version: String): Boolean = ???

    @stub
    // Look up the namespace URI associated to the given prefix, starting from
    // this node.
    def lookupNamespaceURI(prefix: String): String = ???

    @stub
    // Look up the prefix associated to the given namespace URI, starting from
    // this node.
    def lookupPrefix(namespaceURI: String): String = ???

    @stub
    // Puts all Text nodes in the full depth of the sub-tree
    // underneath this Node, including attribute nodes, into a
    // "normal" form where only structure (e.g., elements, comments,
    // processing instructions, CDATA sections, and entity references)
    // separates Text nodes, i.e., there are neither adjacent
    // Text nodes nor empty Text nodes.
    def normalize(): Unit = ???

    @stub
    // Removes the child node indicated by oldChild from the list
    // of children, and returns it.
    def removeChild(oldChild: Node): Node = ???

    @stub
    // Replaces the child node oldChild with newChild
    //  in the list of children, and returns the oldChild node.
    def replaceChild(newChild: Node, oldChild: Node): Node = ???

    @stub
    // The value of this node, depending on its type; see the table above.
    def setNodeValue(nodeValue: String): Unit = ???

    @stub
    // The namespace prefix of this node, or null if it is
    // unspecified.
    def setPrefix(prefix: String): Unit = ???

    @stub
    // This attribute returns the text content of this node and its
    // descendants.
    def setTextContent(textContent: String): Unit = ???
}

object Node {
    @stub
    // The node is an Attr.
    def ATTRIBUTE_NODE: Short = ???

    @stub
    // The node is a CDATASection.
    def CDATA_SECTION_NODE: Short = ???

    @stub
    // The node is a Comment.
    def COMMENT_NODE: Short = ???

    @stub
    // The node is a DocumentFragment.
    def DOCUMENT_FRAGMENT_NODE: Short = ???

    @stub
    // The node is a Document.
    def DOCUMENT_NODE: Short = ???

    @stub
    // The node is contained by the reference node.
    def DOCUMENT_POSITION_CONTAINED_BY: Short = ???

    @stub
    // The node contains the reference node.
    def DOCUMENT_POSITION_CONTAINS: Short = ???

    @stub
    // The two nodes are disconnected.
    def DOCUMENT_POSITION_DISCONNECTED: Short = ???

    @stub
    // The node follows the reference node.
    def DOCUMENT_POSITION_FOLLOWING: Short = ???

    @stub
    // The determination of preceding versus following is
    // implementation-specific.
    def DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short = ???

    @stub
    // The second node precedes the reference node.
    def DOCUMENT_POSITION_PRECEDING: Short = ???

    @stub
    // The node is a DocumentType.
    def DOCUMENT_TYPE_NODE: Short = ???

    @stub
    // The node is an Element.
    def ELEMENT_NODE: Short = ???

    @stub
    // The node is an Entity.
    def ENTITY_NODE: Short = ???

    @stub
    // The node is an EntityReference.
    def ENTITY_REFERENCE_NODE: Short = ???

    @stub
    // The node is a Notation.
    def NOTATION_NODE: Short = ???

    @stub
    // The node is a ProcessingInstruction.
    def PROCESSING_INSTRUCTION_NODE: Short = ???
}
